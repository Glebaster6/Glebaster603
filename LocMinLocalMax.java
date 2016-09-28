public class LocMinLocalMax {
  public static void main(String args[]) {
    int a[] = {3, 7, 5, 2, -6, -7, -6} ;
    int i ;
    int max = -10000000 ;
    int min = 10000000 ;
    for (i = 0; i <= a.length - 2 ;) {
        if (i > 0 && a[i] > a[i + 1] && a[i] > a[i - 1] ) {
          System.out.println("Local max= " + a[i]) ;
        }
        if ( i > 0 && a[i] < a[i + 1] && a[i] < a[i - 1] ) {
          System.out.println("Local min= " + a[i]) ;
        }
        if (a[i] > max) {
          max = a[i] ;
        }
        if (a[i] < min) {
          min = a[i] ;
        }
        i = i + 1;
    }
    if (a[a.length - 1] > max ) {
      max = a[a.length - 1] ;
    }
    if (a[a.length - 1] < min) {
      min = a[a.length - 1] ;
    }
    System.out.println("min =" + min);
    System.out.println("Max= " + max ) ;
  }
}
