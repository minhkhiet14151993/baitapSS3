import java.util.Arrays;

public class Baitap3 {
    public static void main(String[] args) {
        int [] arr1 = {1,3,4,2,6};
        int [] arr2 = {9,8,7,6,5};
        int [] arr3 = new int[arr1.length+arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i]=arr1[i];

        }


        for (int i = 0; i < arr2.length ; i++) {
             arr3[arr1.length + i]=arr2[i];
        }
        System.out.println(Arrays.toString(arr3));
    }
}
