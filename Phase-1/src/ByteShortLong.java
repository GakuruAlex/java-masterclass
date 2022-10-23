package src;

public class ByteShortLong {
public static void main(String[] args){
    
int myMaxIntTest = 2_147_483_643;

byte myMinByteValue = Byte.MIN_VALUE;
byte myMaxByteValue = Byte.MAX_VALUE;
System.out.println("Minimum byte value is " +myMinByteValue);
System.out.println("Maximum byte value is " +myMaxByteValue);

short myMinShortValue = Short.MIN_VALUE;
short myMaxShortValue = Short.MAX_VALUE;
System.out.println("Minimum short value is " +myMinShortValue);
System.out.println("Maximum short value is " +myMaxShortValue);

long myLongValue = 100L ;

long myMinLongValue = Long.MIN_VALUE;
long myMaxLongValue = Long.MAX_VALUE;

System.out.println("Minimum long value is " +myMinLongValue);
System.out.println("Maximum long value is " +myMaxLongValue);


}
}
