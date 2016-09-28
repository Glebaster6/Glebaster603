public class Turn{
  public static void main(String[] args) {
    int[][] a = {
  {-9,1,0,2,5},
  {4,1,1,3,4},
  {-2,2,-1,-1,7},
  {2,-3,5,6,-4},
  {1, -3, 8, 9, 4}
  };
  int j;
  int i;
  int n = a.length;
  int m ;
  int per;
  int l;
    for (i = 0; i < a.length ; i++) {
      m = n - 1;
      for (j = 0; j < n  ; j++) {
        if (i + j != a.length + 1){
          per = a[i][j] ;
          a[i][j] = a[i + m][j + m];
          a[i + m][j + m] = per;
          m = m - 1;
        }
      }
      n = n - 1;
    }
      for(i = 0; i < a.length; i++){
        for  (j = 0; j < a[i].length; j++){
          System.out.print(a[i][j] + " ");
        }
        System.out.println();
      }
  }
  }
