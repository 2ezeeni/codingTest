package 그리디;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Q13904 {

	static int N;

	public static void main(String[] args) throws Exception {
		// 문제. d는 과제 마감일까지 남은 일수를 의미하며, w는 과제의 점수를 의미한다. 점수의 최댓값을 구하시오.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		N = Integer.parseInt(br.readLine());

		List<Homework> list = new ArrayList<>();
		int maxDay = 0;

		for (int i = 0; i < N; i++) {

			String[] input = br.readLine().split(" ");

			int d = Integer.parseInt(input[0]);
			int w = Integer.parseInt(input[1]);

			list.add(new Homework(d, w));
			maxDay = Math.max(maxDay, d);
		}

		int sum = 0;

		for (int i = maxDay; i >= 1; i--) {

			Homework ans = new Homework(0, 0);

			for (Homework hw : list) {
				if (hw.d >= i) {
					if (ans.w < hw.w) {
						ans = hw;
					}
				}
			}

			sum += ans.w;
			list.remove(ans);
		}

		bw.write(sum + "\n");
		bw.flush();

	}

	static class Homework {

		int d, w;

		Homework(int d, int w) {
			this.d = d;
			this.w = w;
		}
	}

}
