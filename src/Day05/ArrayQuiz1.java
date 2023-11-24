package Day05;

public class ArrayQuiz1 {
    public static void main(String[] args) {
        int count = 0;
        int seek = 7;
        int[] su = {1, 7, 4, 7, 55, 90, 100, 7, 2, 7, 23};
        for (int i = 0; i < su.length; i++) {
            seek = su[i];
            if (seek == 7) {
                count++;
            }
        }
        System.out.println("7의 갯수 : " + count);
    }
    }
//        int count = 0;
//        int[] su = { 1, 7, 4, 7, 55, 90, 100, 7, 2, 7, 23};
//            for (int i = 0; i < su.length; i++){
//                if (su[i] == 7) {
//                count ++;}
//            }
//        System.out.println("7의 갯수 : " + count);
//    }

