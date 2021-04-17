package BFS_DFS;

import java.util.Scanner;

public class Q11724 {
	// 문제. 방향 없는 그래프가 주어졌을 때, 연결 요소 의 개수를 구하는 프로그램을 작성하시오.
	
	static int N,M;
	static int visit[];
	static int graph[][];
	
	static void DFS(int x, int cnt) {
		visit[x] = cnt;
		for(int i = 1; i < N + 1; i++) {
			if(graph[x][i] == 1 && visit[i] == 0) {
				DFS(i,cnt);
			}
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		graph = new int[N + 1][N + 1];
		visit = new int[N + 1];
		
		for(int i = 0; i < M; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			graph[x][y] = graph[y][x] = 1;
		}
		int cnt = 1;
		for(int i = 1; i <= N; i++) {
			if(visit[i] == 0) {
				DFS(i, cnt);
				cnt++;
			}
		}
		System.out.println(cnt - 1);
	}
}