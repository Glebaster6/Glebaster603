public class PrimeComposite {
  public static void main(String[] args) {
    int a[] = {1, 4, 2, 7, 9, 3} ;
    int i ;
    int j ;
    boolean flagp = false ;
    boolean flagn = false ;
    for (i = 0; i < a.length - 1; i++ ) {
      flagp = false;
      for (j = 2; j*j <= a[i]; j++) {
        if (a[i] % j == 0 ) {
          flagp = true;
        }
    }
    if (flagn == false && flagp == true) {
      System.out.println(i - 1);
    }
    flagn = flagp;
  }
}
}
