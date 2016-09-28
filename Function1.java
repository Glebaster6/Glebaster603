public class Function1 {
   public static int min(int a[]) {
      int minElement = a[0];
      for (int i = 0; i < a.length; i++) {
         if (minElement > a[i]) {
            minElement = a[i];
         }
      }
      return minElement;
   }
   public static int max(int a[]) {
      int maxElement = a[0];
      for (int i = 0; i < a.length; i++) {
         if (maxElement < a[i]) {
            maxElement = a[i];
         }
      }
      return maxElement;
   }
   public static int sum(int a[]) {
      int sumElement = 0;
      for (int i = 0; i < a.length; i++) {
         sumElement += a[i];
         }
      return sumElement;
   }

   public static void main(String[] args) {
     int a[] = {1, -5, 4, 7, 8, 10};
     System.out.println(min(a) +" " + max(a) + " " + sum(a));
   }
}
