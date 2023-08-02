public class Conversioncasting{
    public static void main(String args[])
    {
        byte b=127;
        int a=b;  //conversion
        System.out.println(a);
        
        //casting bigger type to smaller one it perform  modulus operation.
        int x=257;
        byte l=(byte) x;//casting -casting will perform a modulus operation which is actually finding the remainder (257%256)==1 so output is 1
        //256 is an integer range
        System.out.println(l);

        float f=5.6f;
        int o=(int)f;
        System.out.println(o); //it lost some point value while converting float value

        //type promotion
        byte r=10;
        byte p=30;
        int res=r*p; //10*30=300 byte range is high so storing the result in integer.This concept is called type promotion
        System.out.println(res);


    }
}
