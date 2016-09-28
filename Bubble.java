public class Bubble {
  public static void main (String[] args) {
    int a[] = {-3, -7, 10, 11, -5, 2} ;
    int i ;
    int per ;
    int j ;
    int n = a.length  ;
    for (i = a.length - 1 ; i >= 0 ; i--) {
      for (j = 0 ; j < i ; j++ ) {
        if (a[j] > a[j + 1]) {
          per = a[j + 1] ;
          a[j + 1] = a[j] ;
          a[j] = per ;
        }
      }
    }
    for (i = 0 ; i < a.length; i++) {
      System.out.println(a[i]);
    }
  }
}
