public class Transposing {
  public static void main(String[] args) {
    int[][] a = {
  {-9,1,0,2,5},
  {4,1,1,3,4},
  {-2,2,-1,-1,7},
  {2,-3,5,6,-4},
  {1, -3, 8, 9, 4}
  };
  int[][] b = new int[a[1].length][a.length];
  for (int i = 0; i < a.length; i++){
    for(int j = 0; j < a.length; j++){
      b[i][j] = a[j][i];
    }
  }
  for(int i = 0; i < b.length; i++){
    for (int j = 0; j < b[i].length; j++){
      System.out.print(b[i][j] + " ");
    }
    System.out.println();
  }
  }
}
