package 그리디;

import java.util.Scanner;

public class Q10162 {

	public static void main(String[] args) {
		// 문제. 주어진 요리시간 T초를 맞추기 위한 최소버튼 조작 방법을 구하는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
        
        int a = 0;
        int b = 0;
        int c = 0;
        
        int t = sc.nextInt();
        while(t >= 10) {
            if(t >= 300) {
                t -= 300;
                a++;
            } else if(t >= 60) {
                t -= 60;
                b++;
            } else if(t >= 10) {
                t -= 10;
                c++;
            }
        }
        System.out.println(t == 0 ? a + " " + b + " " + c : -1);
	}

}
