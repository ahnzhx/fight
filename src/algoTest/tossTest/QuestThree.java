package algoTest.tossTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class QuestThree {
    public static int[] test(String input){

        return new int[1];
    }
    public static void main(String[] args) throws Exception {
        // [!!주의!!] Function.compute 함수는 이미 구현되어있지만, 숨김처리되어 있습니다. 호출해서 테스트 해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int[] result = test(input);
        System.out.println(result);
//        System.out.println("Hello Goorm! Your input is " + Function.compute(1));
    }
}
