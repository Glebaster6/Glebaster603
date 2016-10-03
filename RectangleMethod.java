import java.util.Scanner;
public class RectangleMethod{
  public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.println("1 - sin 2-cos 3-tan 4ctan");
      int c = in.nextInt();
      System.out.println("VVedite otrezok");
      double e = in.nextDouble();
      double r = in.nextDouble();
      System.out.println(integr(e, r, c));
  }

  public static double integr(double e, double r, int c) {
  double a[] = new double[20];
    double s = 0;
    a[0] = e;
    double u = 0.05;
    a[a.length - 2] = r;
    for (int i = 1; i < a.length - 1; i++){
      a[i] = a[i] + u ;
      u = u + 0.05 ;
    }
    if( c == 1){
      for (int i = 1; i < a.length - 1; i++ ){
        s += (a[i] - a[i - 1])* Math.sin(a[i]);
      }
    }
    if( c == 2){
      for (int i = 1; i < a.length - 1; i++ ){
        s += (a[i] - a[i - 1])* Math.cos(a[i]);
      }
    }
    if( c == 3){
      for (int i = 1; i < a.length - 1; i++ ){
        s += (a[i] - a[i - 1])* Math.tan(a[i]);
      }
    }
    if( c == 4){
      for (int i = 1; i < a.length - 1; i++ ){
        s += (a[i] - a[i - 1])* (1/Math.tan(a[i]));
      }
    }
    return s;
  }

}
