import java.util.Scanner;
public class Sin{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Vvedite epsilon i x ");
      double eps = in.nextDouble();
      double x = in.nextDouble();
      System.out.println(Sin(eps, x) + " " + Math.sin(x));
  }
  public static double Sin (double eps, double x){
    int n = 2;
    double a1 = x ;
    double a2 = a1 * (-1 * (x  * x) / (4 * 1 * 1 + 10 * 1 + 6)) ;
    double sinx1 = a1 + a2;
    double sinx2;
    double a3 = a2;
    do {
      sinx2 = sinx1;
      a3 = a3 * (-1 * (x  * x) / (4 * n * n + 10 * n + 6));
      sinx1 += a3;
      n = n + 1  ;

    }
    while(Math.abs(sinx2 - sinx1) > eps);
    return sinx2;
  }
}
