package BFS_DFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q1260 {
	// 문제. 그래프를 DFS로 탐색한 결과와 BFS로 탐색한 결과를 출력하는 프로그램을 작성하시오. 단, 방문할 수 있는 정점이 여러 개인 경우에는 정점 번호가 작은 것을 먼저 방문하고, 더 이상 방문할 수 있는 점이 없는 경우 종료한다. 정점 번호는 1번부터 N번까지이다.
	
	public static int[][] arr;
	public static boolean[] visited;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
		int point = sc.nextInt();
		int line = sc.nextInt();
		int start = sc.nextInt();
		
		arr = new int[point+1][point+1];
		
		for(int i=1;i<=line;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr[a][b] = 1;
			arr[b][a] = 1;
		}
		
        // dfs
		visited = new boolean[point+1];
		dfs(start); 
		
		System.out.println();
        
        // bfs
		visited = new boolean[point+1];
		bfs(start); 

		
	}
	public static void dfs(int start) {
		visited[start] = true;
		System.out.print(start+ " ");
		
		if(start == arr.length) {
			return;
		}

		for(int a=1;a<arr.length;a++) {
			if(arr[start][a] == 1 && visited[a] == false) {
				dfs(a);
			}
		}
			
	}
	public static void bfs(int start) {
		Queue<Integer> q = new LinkedList<Integer>(); 
		
		q.add(start);
		visited[start] = true;
 		System.out.print(start+ " ");
		
		while(!q.isEmpty()) {
			
			int temp = q.peek();
			q.poll();
			for(int i=1; i<arr.length;i++) {
				if(arr[temp][i] ==1 && visited[i] == false) {
					q.add(i);
					visited[i] = true;
					System.out.print(i+ " ");
				}
			}
		}
	}
	
	
	
}