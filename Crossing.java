public class Crossing {
  public static void main(String[] args) {
    int a[] = {3, 4, -1, 2} ;
    int b[] = {2, 1, 4, 7} ;
    for( int i = 0; i < a.length; i++) {
      for( int j = 0; j < b.length; j++){
        if( a[i] == b[j]) {
          System.out.println(a[i]);
        }
      }
    }
    }
}
