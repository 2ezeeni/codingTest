package 그리디;

import java.util.Arrays;
import java.util.Scanner;

public class Q16435 {

	public static void main(String[] args) {
		// 문제. 스네이크버드의 처음 길이가 L일때 과일들을 먹어 늘릴 수 있는 최대 길이를 구하세요.
		
		Scanner sc = new Scanner(System.in);

        int appleNum = sc.nextInt();
        int birdLength = sc.nextInt();
        int hi[] = new int[appleNum];

        for(int i = 0; i < appleNum; i++) {
            hi[i] = sc.nextInt();
        }
        Arrays.sort(hi);

        for(int i = 0; i < appleNum; i++) {
            if(hi[i] <= birdLength) birdLength++;
        }

        System.out.println(birdLength);

		
	}

}
