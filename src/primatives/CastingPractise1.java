package primatives;

public class CastingPractise1 {

    public static void main(String[] args) {
        double number = 3.45;
        float fl1 = (float) number;
        long l1 = (long) fl1;
        int i1 = (int) l1;
        short sh1 = (short) l1;
        byte byt1 = (byte) sh1;
        System.out.println(byt1);
        System.out.println(Byte.MIN_VALUE );
        System.out.println(Byte.MAX_VALUE);

        int count = 129;
        System.out.println(" count is in int type " + count);
        byte count2 =(byte)count;
        System.out.println("Count is in byte type " +  count2);
    }
}
