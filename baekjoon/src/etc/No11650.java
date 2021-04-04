package etc;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class No11650 {

	public static void main(String[] args) {

		// 문제. 2차원 평면 위의 점 N개가 주어진다. 좌표를 x좌표가 증가하는 순으로, x좌표가 같으면 y좌표가 증가하는 순서로 정렬한 다음 출력하는 프로그램을 작성하시오.

        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int[][] d = new int[n][2];
        
        for(int i=0 ; i <n ; i++) {
            d[i][0] = sc.nextInt();
            d[i][1] = sc.nextInt();
        }
        
        Arrays.sort(d, new Comparator<int[]>() {
 
            @Override
            public int compare(int[] o1, int[] o2) {
                
                if(o1[0] == o2[0]) {
                    return Integer.compare(o1[1],o2[1]);
                }
                else 
                    return Integer.compare(o1[0], o2[0]);
                
                
            }
            
        });
            
        for(int i=0 ; i< n ; i++) {
            System.out.println(d[i][0]+" "+d[i][1]);
        }
        
        sc.close();		
		
		
		
	}

}
