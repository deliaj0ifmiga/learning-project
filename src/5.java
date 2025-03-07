import java.util.Random; 
 public class RandomNumber { 
   private static final int MIN = 1; 
   private static final int MAX = 100; 
   
   public static void main(String[] args) { 
     Random rand = new Random(); 
     int randomNumber = rand.nextInt((MAX - MIN) + 1) + MIN; 
      System.out.println("Random number: " + randomNumber); 
   } 
 }