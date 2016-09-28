public class Diagonals {
  public static void main(String[] args) {
    int[][] a = {
	{-9,1,0,2,5},
	{4,1,1,3,4},
	{-2,2,-1,-1,7},
  {2,-3,5,6,-4},
  {1, -3, 8, 9, 4}
  };
  int i;
  int j;
  int glav = 0;
  int poboch = 0;
  int visheglav = 0;
  int minv = 100000000;
  for (i = 0; i < a.length ; i++) {
    for (j = 0; j < a[i].length ; j++) {
      if (i == j) {
        glav = glav + a[i][j];
      }
      if (i + j == a.length ) {
        poboch = poboch + a[i][j];
      }
      if (i < j) {
        visheglav = visheglav + a[i][j];
        if (a[i][j] < minv) {
          minv = a[i][j];
        }
      }
    }
   }
   System.out.println("Summa glav diagonali = " + glav + " Summa poboch diagonali = " + poboch);
   System.out.print("Summa vishe glav diag = " + visheglav + " Minimum vishe glav diag = " + minv);
  }
}
