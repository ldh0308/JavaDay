package Day05;

public class ForEachEx1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("================");

        for (int item : arr){
            System.out.println(item);
        }
        int sum = 0;
        int[] score = { 78, 70, 88, 99, 58};
        for (int item : score) {
            sum += item;
        }
        System.out.println(sum);
    }
}
