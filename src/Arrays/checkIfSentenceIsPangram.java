package Arrays;

//1832. Check if the Sentence Is Pangram
public class checkIfSentenceIsPangram {
    public boolean checkIfPangram(String sentence) {
    for(char i='a';i<='z';i++){
    if(!sentence.contains(String.valueOf(i))){
        return false;
        }
 }
    return true;
    }

}
