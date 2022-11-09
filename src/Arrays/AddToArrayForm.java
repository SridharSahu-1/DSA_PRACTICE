package Arrays;

import java.util.*;

class AddToArrayForm {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ls = new ArrayList<>();
        int n=num.length;
        int i=n-1;
        while(i>=0 || k>0){
            if(i>=0){
               ls.add((num[i] + k) % 10);
              k=(num[i]+k)/10;  }
            else{
                ls.add(k%10);
                k=k/10;         }
             i--;
   }
        Collections.reverse(ls);
        return ls;
}
}
