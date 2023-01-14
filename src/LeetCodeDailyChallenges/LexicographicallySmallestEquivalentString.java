package LeetCodeDailyChallenges;
import java.util.*;


// Approach : Simple DFS On Each Character Of baseStr : T.C. = O(26 + m + n) , S.C. = O(26 + n * 26)
class LexicographicallySmallestEquivalentString {
    
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        int m = s1.length();
        int n = baseStr.length();
        
        ArrayList<Character>[] graph = new ArrayList[26];
        
        for (int i = 0 ; i < 26 ; i++) {
            graph[i] = new ArrayList<Character>();
        }
        
        for (int i = 0 ; i < m ; i++) {
            char u = s1.charAt(i);
            char v = s2.charAt(i);
            
            graph[u - 'a'].add(v);
            graph[v - 'a'].add(u);
        }
        
        StringBuilder lexicographicallySmallestEquivalentStringOfBaseStr = new StringBuilder();
        
        for (int i = 0 ; i < n ; i++) {
            char currentBaseStrCharacter = baseStr.charAt(i);
            
            boolean[] visited = new boolean[26];
            
            char lexicographicallySmallestEquivalentCharacterForCurrentBaseStrCharacter = DFS(graph, visited, currentBaseStrCharacter);
           
            lexicographicallySmallestEquivalentStringOfBaseStr.append(lexicographicallySmallestEquivalentCharacterForCurrentBaseStrCharacter);
        }
        
        return lexicographicallySmallestEquivalentStringOfBaseStr.toString();
    }
    
    public char DFS(ArrayList<Character>[] graph, boolean[] visited, char currentCharacter) {
        visited[currentCharacter - 'a'] = true;
        
        char lexicographicallySmallestEquivalentCharacterForCurrentCharacter = currentCharacter;
        
        for (char currentNeighbourOfCurrentCharacter : graph[currentCharacter - 'a']) {
            if (!visited[currentNeighbourOfCurrentCharacter - 'a']) {
                char currentEquivalentCharacterForCurrentNeighbourOfCurrentCharacter = DFS(graph, visited, currentNeighbourOfCurrentCharacter);
                
                if (currentEquivalentCharacterForCurrentNeighbourOfCurrentCharacter < lexicographicallySmallestEquivalentCharacterForCurrentCharacter) {
                    lexicographicallySmallestEquivalentCharacterForCurrentCharacter = currentEquivalentCharacterForCurrentNeighbourOfCurrentCharacter;
                }
                
            }    
        }
        
        return lexicographicallySmallestEquivalentCharacterForCurrentCharacter;
    }
    
}