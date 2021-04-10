package BFS_DFS;

import java.util.ArrayList;

public class Q00_DFS_이코테 {
	// DFS 동작 예시

	public static boolean[] visited = new boolean[9];
	public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();

	// DFS 함수 정의
	public static void dfs(int x) {
		// 현재 노드를 방문 처리
		visited[x] = true;
		System.out.println(x + " ");
		// 현재 노드와 연결된 다른 노드를 재귀적으로 방문
		for (int i = 0; i < graph.get(x).size(); i++) {
			int y = graph.get(x).get(i);
			if (!visited[x]) dfs(y);
		}
	}
	
	public static void main(String[] args) {
		/*
		   그래프 연결된 내용 생략
		 */
		// dfs(1)
		
	}

}
