package Arrays;

public class ContainerWithMostWater {
    public static void main(String[] args) {
       int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));

    }
    public static int maxArea(int[] height) {
        int max=0;
        int ptr1=0;
        int ptr2=height.length-1;

        while(ptr1<ptr2){
            if(height[ptr1]<height[ptr2]){
                max= Math.max(max, height[ptr1] *(ptr2-ptr1));
                ptr1++;
            }
            else{
                max = Math.max(max, height[ptr2] *(ptr2-ptr1));
                ptr2--;
            }
        }
        return max;
    }

}
