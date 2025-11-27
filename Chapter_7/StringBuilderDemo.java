public class StringBuilderDemo {
   public static void main(String[] args) {

      // StringBuilder A
      StringBuilder firstSB = new StringBuilder("Barbara");
      System.out.println("(StringBuilder 1) firstSB: " + firstSB);
      int firstCapacity = firstSB.capacity();
      System.out.println("Capacity of firstSB is: " + firstCapacity);

      // StringBuilder B
      StringBuilder secondSB = new StringBuilder("1234 Hickory Nut Grove Road");
      System.out.println("(StringBuilder 2) secondSB: " + secondSB);
      int secondCapacity = secondSB.capacity();
      System.out.println("Capacity of secondSB is: " + secondCapacity);

      // modify length
      firstSB.setLength(20);
      System.out.println("(Length set to 20 for StringBuilder 1) The string is " + firstSB + "end");

      secondSB.setLength(20);
      System.out.println("(Length set to 20 for StringBuilder 2) The string is " + secondSB);
   }
}