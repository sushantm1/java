package lc;
public class StoneProblem {
	public static boolean stoneGame(int[] piles){
		int n = piles.length;
        int[][] dp = new int[n][n];

        // Base case: when only one pile
        for (int i = 0; i < n; i++) {
            dp[i][i] = piles[i];
        }

        // Fill the DP table
        for (int len = 2; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                dp[i][j] = Math.max(
                    piles[i] - dp[i + 1][j], 
                    piles[j] - dp[i][j - 1]
                );
//                System.out.print(dp[i][j]);
            }
//            System.out.println("");
        }
        for(int i=0;i<piles.length;i++) {
        	for(int j=0;j<piles.length;j++) {
        		System.out.print(dp[i][j]);
        	}
        	System.out.println("");
        }

        // If final result is positive, Alice wins
        return dp[0][n - 1] > 0;
	}
	public static void main(String[] args) {
		int[] arr= {5,3,4,5};
		System.out.println(stoneGame(arr));
	}
}
