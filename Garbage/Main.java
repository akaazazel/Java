public class Main {
  public static void main(String[] args) {
      long mem1 = Runtime.getRuntime().freeMemory();
      System.out.println("1: "+mem1);

      Integer[] num1 = new Integer[10_000_000];
      Integer[] num2 = new Integer[10_000_000];

      long mem2 = Runtime.getRuntime().freeMemory();
      System.out.println("2: "+mem2);

      num1 = null;
      num2 = null;
      
      System.gc();

      long mem3 = Runtime.getRuntime().freeMemory();
      System.out.println("3: "+mem3);

      System.out.println("Memory freed: "+(mem3 - mem2));
  }
}
