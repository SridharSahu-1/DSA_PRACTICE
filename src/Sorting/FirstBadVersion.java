package Sorting;/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
//
//public class FirstBadVersion extends VersionControl {
//    public int firstBadVersion(int n) {
//        int first =1;
//        int last = n;
//        int pos=1;
//        while(first<=last){
//            int mid= first+(last-first)/2;
//            boolean x= isBadVersion(mid);
//            if(x==true){
//                pos=mid;
//                last=mid-1;
//            }
//            else{
//                first=mid+1;
//            }
//
//        }
//
//        return pos;}
//}