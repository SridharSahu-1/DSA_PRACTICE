package Arrays;

class FindTheHighestAltitude {
    public int largestAltitude(int[] gain) {         
        int highest=0;
        int sum=0;
        for(int i=0;i<gain.length;i++){
            sum+=gain[i];
        if(sum>highest){
            highest=sum;    }
        }
    return highest;} }
