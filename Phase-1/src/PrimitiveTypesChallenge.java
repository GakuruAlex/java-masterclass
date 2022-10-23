package src;

public class PrimitiveTypesChallenge {
   public static void main(String[] args){
       byte myByte = 120;
       short myShort = 30123;

       int myInt = 4;

       long myLong = (50000L +(10L * (myByte +myShort +myInt)));

       System.out.println("My long is " +myLong);

    }
}
