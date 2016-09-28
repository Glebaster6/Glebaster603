import java.util.Scanner;
public class Removing {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Vvedite chislo ");
    int a[] = {-3, -7, 10, 11, -5, 2};
    int i ;
    int b = in.nextInt();
    if(b >= 0 && b<= a.length - 1) {
      for (i = 0 ; i < a.length - 1 ; i++){
        if(i == b){
          a[i] = a[i + 1] ;
          b = b + 1;
        }

        }
        for(i = 0; i < a.length - 1; i++){
          System.out.println( a[i]);
    }
      }
    }
  }
