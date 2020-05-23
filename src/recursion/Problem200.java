package recursion;

/**
 * @Author: balabala
 * @Date: 2020/4/19 10:45 PM
 */

public class Problem200 {
     int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0){
            return 0;
        }

        int res = 0;

        int rows = grid.length;
        int cols = grid[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1'){
                    res = res + 1;
                    inject(grid, i, j);
                }
            }
        }
        return res;
    }

    private void inject(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0'){
            return;
        }
        if(grid[i][j] == '1'){
            grid[i][j] = '0';
        }

        inject(grid, i - 1, j);
        inject(grid, i + 1, j);
        inject(grid, i , j - 1);
        inject(grid, i , j + 1);

    }

    public static void main(String[] args) {
        char[][] grid = new char[4][5];
        grid[0] = new char[]{'1','1','1','1','0'};
        grid[1] = new char[]{'1','1','0','1','0'};
        grid[2] = new char[]{'1','1','0','0','0'};
        grid[3] = new char[]{'0','0','0','0','0'};

        Problem200 p = new Problem200();
        int x = p.numIslands(grid);
        System.out.println(x);
    }
}
