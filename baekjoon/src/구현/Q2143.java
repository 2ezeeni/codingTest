package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Q2143 {
	static int t,n,m;
    static int arr[];
    static int brr[];
    static ArrayList<Integer> a = new ArrayList<>();
    static ArrayList<Integer> b = new ArrayList<>();
	
    public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        t = Integer.parseInt(br.readLine());
        n = Integer.parseInt(br.readLine());
        String[] arr_input = br.readLine().split(" ");
        arr = new int [n];
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(arr_input[i]);
        }
        
        m = Integer.parseInt(br.readLine());
        brr = new int[m];
        String[] brr_input = br.readLine().split(" ");
        for(int i=0; i<m; i++) {
            brr[i] = Integer.parseInt(brr_input[i]);
        }
        for(int i=0; i<n; i++) {
            int sum=0;
            for(int j=i; j<n;j++) {
                sum+=arr[j];
                a.add(sum);
            }
        }
        for(int i=0; i<m; i++) {
            int sum=0;
            for(int j=i; j<m;j++) {
                sum+=brr[j];
                b.add(sum);
            }
        }
        Collections.sort(a);
        Collections.sort(b);
        
        int a_idx=0;
        int b_idx= b.size()-1;
        long cnt = 0;
        while(a_idx<a.size() &&b_idx>=0) {
            
            int a_sum = a.get(a_idx);
            int b_sum = b.get(b_idx);
            long a_cnt =0;
            long b_cnt =0;
            if(a_sum+b_sum==t) {
                while(a_idx<a.size() && a.get(a_idx)==a_sum) {
                    a_idx++;
                    a_cnt++;
                }
                while(b_idx>=0 && b.get(b_idx)==b_sum) {
                    b_idx--;
                    b_cnt++;
                }
                cnt+=a_cnt*b_cnt;
            }
            if(a_sum+b_sum>t) {
                b_idx--;
            }
            if(a_sum+b_sum<t) {
                a_idx++;
            }
        }
        System.out.println(cnt);		
	}

}
