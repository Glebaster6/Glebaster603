public class FunctionMult {
  public static void main(String[] args) {
    int[][] a = {
      {-9,1,0,2,5},
      {4,1,1,3,4},
      {-2,2,-1,-1,7},
      {2,-3,5,6,-4},
      {1, -3, 8, 9, 4}
    };

    int[][] b = {
      {1 , 2 , 3 , 4 },
      {3 , -2, 7, 4 },
      {2 , 1 , 1 , 5},
      {-7, 3, -1, 4},
      {9 , 5, -3, 6}
    };

    int[][] c = new int[a.length][b[0].length];

     umn(a, b, c);
    for (int i = 0; i < c.length; i++) {
      for (int j = 0; j < c[0].length; j++) {
        System.out.println(c[i][j]);
      }
    System.out.println();
    }

  }
  public static int umn (int a[][] , int b[][], int c[][] ) {

    int m = a.length;
    int n = b[0].length;
    int o = b.length;
    if (a[0].length == b.length) {
      for (int i = 0; i < m; i++) {
                 for (int j = 0; j < n; j++) {
                     for (int k = 0; k < o; k++) {
                         c[i][j] += a[i][k] * b[k][j];
                     }
                 }
             }
    }
return m;
  }
}
