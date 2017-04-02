import java.util.Scanner;

/**
 * @author rezwanul.islam
 * @category Depth first search
 * @note DFS: Connected Cell in a Grid
 * <br>See <a href="https://www.hackerrank.com/challenges/ctci-connected-cell-in-a-grid"</a> reference
 */
public class DFS {
	
	static final int SZ = 10;
	
	static boolean visited[][] = new boolean [SZ][SZ];
	static int grid[][] = new int[SZ][SZ];
	
	static final int dx[] = { 1, 0, 1, -1, 0, -1, -1, 1 };
	static final int dy[] = { 0, 1, -1, 1, -1, 0, -1, 1 };
    
	static boolean isValid(int x, int y, int n, int m){
		if(x < 0 || x >= n ) return false;
		if(y < 0 || y >= m ) return false;
		return true;
    	}
	
	static int dfs(int i, int j, int n, int m){
		visited[i][j] = true;
		int ans = 0;
		for(int k = 0 ; k < 8 ; k++){
			int new_i = i + dx[k];
			int new_j = j + dy[k];
			if( isValid(new_i, new_j, n, m) && visited[new_i][new_j] == false && grid[new_i][new_j] == 1){
				ans += dfs(new_i, new_j, n, m ) + 1;
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        for(int grid_i=0; grid_i < n; grid_i++){
            for(int grid_j=0; grid_j < m; grid_j++){
                grid[grid_i][grid_j] = in.nextInt();
                visited[grid_i][grid_j] = false;
            }
        }
        int ret = 0 ;
        for(int grid_i=0; grid_i < n; grid_i++){
            for(int grid_j=0; grid_j < m; grid_j++){
                if(visited[grid_i][grid_j] == false && grid[grid_i][grid_j] == 1){
                	ret = Math.max(dfs(grid_i, grid_j, n, m) + 1, ret);
                }
            }
        }
        System.out.println(ret);
    }
}


/******************
	Input : 
	
	4
	4
	1 1 0 0
	0 1 1 0
	0 0 1 0
	1 0 0 0
 	
 	Output:
 	5
  
*******************/
