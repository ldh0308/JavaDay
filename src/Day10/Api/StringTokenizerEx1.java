package Day10.Api;

import java.util.StringTokenizer;

public class StringTokenizerEx1 {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("this is a test");

        while(st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
        System.out.println("-------------------");
        String[] result = "this is a test".split("\\s");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);

        }
    }
}
