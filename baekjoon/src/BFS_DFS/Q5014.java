package BFS_DFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q5014 {
	static int f,s,g,u,d;
	static int visited[];

	public static void main(String[] args) {
		// 문제. 강호가 G층에 도착하려면, 버튼을 적어도 몇 번 눌러야 하는지 구하는 프로그램을 작성하시오. 만약, 엘리베이터를 이용해서 G층에 갈 수 없다면, "use the stairs"를 출력한다.

		Scanner sc = new Scanner(System.in);
		f = sc.nextInt(); 
		s = sc.nextInt(); 
		g = sc.nextInt(); 
		u = sc.nextInt(); 
		d = sc.nextInt(); 
		visited = new int[f+1];

		bfs(f,s,g,u,d);
	}
	
	static void bfs(int f, int s, int g, int u, int d) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(s);
		visited[s]=1;
		
		while(!q.isEmpty()) {
			int c = q.poll();
			
			if(c == g) {
				System.out.println(visited[c]-1);
			}
			
			if(c + u <= f && visited[c + u] == 0) {
				visited[c + u] = visited[c] + 1;
				q.add(c + u);
			}
			
			if(c - d > 0 && visited[c - d] == 0) {
				visited[c - d] = visited[c] + 1;
				q.add(c - d);
			}
			
		}
		
		if(visited[g] == 0)
			System.out.println("use the stairs");
			
	}

}
