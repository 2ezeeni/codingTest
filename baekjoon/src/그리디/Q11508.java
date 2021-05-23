package 그리디;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Q11508 {

	public static void main(String[] args) {
		// 문제. N개의 유제품을 살 때 필요한 최소비용을 출력하세요.
			
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Integer[] goods = new Integer[N];

        for(int i = 0;i < N;i++) goods[i] = sc.nextInt();
        Arrays.sort(goods, Comparator.reverseOrder());

        int sum = 0;
        for(int i = 0;i < N;i++){
            if(i % 3 == 2) continue;
            sum += goods[i];
        }
        System.out.println(sum);
	}

}
