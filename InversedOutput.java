public class InversedOutput {
  public static void main(String args[]) {
    int a[] = {3, -6, 5, 2, 7} ;
      for (int i = a.length - 1; i > -1; ) {
        System.out.println(a[i]);
        i = i - 1;
      }
  }
}
