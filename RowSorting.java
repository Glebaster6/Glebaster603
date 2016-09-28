public class RowSorting {
  public static void main(String[] args) {
    int[][] a = {
  {-9,1,0,2,5},
  {4,1,1,3,4},
  {-2,2,-1,-1,7},
  {2,-3,5,6,-4},
  {1, -3, 8, 9, 4}
  };

int per;
  for(int i = 0; i < a.length; i++) {
    for (int j = a[i].length - 1; j >= 0; j--){
      for (int l = 0 ; l < j ; l++ ) {
        if (a[i][l] > a[i][l + 1]) {
          per = a[i][l + 1] ;
          a[i][l + 1] = a[i][l] ;
          a[i][l] = per ;
        }
      }
    }
  }
  for(int i = 0; i < a.length; i++){
    for(int j = 0; j < a[i].length; j++){
      System.out.println(a[i][j]);
    }
  }
  }
}
