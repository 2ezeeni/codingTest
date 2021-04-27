package 그리디;

import java.util.Scanner;

public class Q10610 {
    public static final int MAX = 100000;
	
	public static String str;
    public static int[] numCountArr;
    public static long strLen;
    
	public static void main(String[] args) {
		// 문제. 양수 N을 입력 받아 숫자들을 섞어 30의 배수가 되는지 확인하고
		//		 30의 배수라면 그 수를 출력하고, 존재하지 않는다면 -1을 출력하시오.
		
		Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        
        strLen = str.length();
        numCountArr = new int[10];
        long total = 0;
        for(int i = 0; i < strLen; i++) {
            int tNum = Integer.parseInt(str.substring(i, i + 1));
            numCountArr[tNum] += 1;
            total += tNum;
        }

        if(!str.contains("0") || total % 3 != 0) {
            System.out.println("-1");
            return;
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 9; i >= 0; i--) {
            while(numCountArr[i] > 0) {
                sb.append(i);
                numCountArr[i]--;
            }
        }
        System.out.println(sb.toString());
		
	}

}
