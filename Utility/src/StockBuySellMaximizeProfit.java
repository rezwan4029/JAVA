import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author rezwanul.islam
 * @category Simulation 
 * <br> See <a href="http://www.geeksforgeeks.org/stock-buy-sell/"</a> reference
 * 
 */
public class StockBuySellMaximizeProfit {

	private static Scanner in;

	public static List<Interval> solve(int price[], int N) {
		List<Interval> ans = new ArrayList<>();
		if (N == 1) {
			return ans;
		}
		int i = 0;
		while (i < N - 1) {
			// if current price is bigger than next one shift to next
			while (i < N - 1 && price[i] >= price[i + 1]) {
				i++;
			}

			// end of days, no profit can be made
			if (i == N - 1) {
				return ans;
			}

			Interval curr = new Interval();

			curr.buy = i;
			// move to next day, time to find sell
			i++;

			while (i < N && price[i] >= price[i - 1]) {
				i++;
			}

			curr.sell = i - 1;
			ans.add(curr);

		}
		return ans;
	}

	public static void main(String[] args) {
		in = new Scanner(System.in);
		int T = in.nextInt();
		for (int cs = 1; cs <= T; cs++) {
			int N = in.nextInt();
			int arr[] = new int[N + 1];
			for (int i = 0; i < N; i++) {
				arr[i] = in.nextInt();
				System.err.println(arr[i]);
			}
			List<Interval> intervals = solve(arr, N);
			for (int i = 0; i < intervals.size(); i++) {
				System.out.println(String.format("Profit %d : buy at %d sell at %d", i + 1, intervals.get(i).buy,
						intervals.get(i).sell));
			}
			if (intervals.isEmpty()) {
				System.out.println("No profit can be made");
			}
		}
	}
}

class Interval {
	int buy, sell;
}


/******************
Input : 

1
7
100 180 260 310 40 535 695
	
Output:

Profit 1 : buy at 0 sell at 3
Profit 2 : buy at 4 sell at 6

*******************/
