import java.util.TreeMap;

public class MurexTest_3 {

    boolean enemyShip = false;

    public static void main(String[] args) {

    }

//    public int ships(int[][] arr) {
//        int enemy = 0;
//        for(int i = 0; i < arr.length; i++) {
//            for(int j = 0; j < arr[i].length; j++) {
//                if(arr[i][j] != 2) {
//                    // Depth-First Search
//                    dfs(arr, i, j);
//                    if(enemyShip)
//                        enemy += 1;
//                }
//                enemyShip = false;
//            }
//        }
//        return enemy;
//    }



//    public void dfs(int[][] arr, int i, int j) {
//        // If we're out of bounds (hitting the edge) or if we reach a
//        if (i < 0 || j < 0 || i >= arr.length || j >= arr[i].length || arr[i][j] == 2)
//            return;
//        if (arr[i][j] == 3) {
//            enemyShip = true;
//            counter++;
//        }
//        arr[i][j] = 2;
//        dfs(arr, i + 1, j);
//        dfs(arr, i - 1, j);
//        dfs(arr, i, j + 1);
//        dfs(arr, i, j - 1);
//    }
}
