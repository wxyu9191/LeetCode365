package recursion;

/**
 * @Author: balabala
 * @Date: 2020/4/15 9:02 AM
 */

public class Problem542 {
    public int[][] updateMatrix(int[][] matrix) {
        if(matrix == null || matrix.length == 0){
            return matrix;
        }
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 1){
                    int dis=1;
                    dis = inject(matrix, i, j, dis);
                    matrix[i][j] = dis;
                }
            }
        }
        return matrix;
    }

    private int inject(int[][] matrix, int row, int col, int dis){

        return dis;
    }

    public static void main(String[] args) {
        Problem542 p = new Problem542();
        int[][] tt = new int[3][3];
        tt[0] = new int[]{0,0,0};
        tt[1] = new int[]{0,1,0};
        tt[2] = new int[]{1,1,1};

        p.updateMatrix(tt);
    }
}
