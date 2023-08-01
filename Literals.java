public class Literals {
     public static void main(String a[])
    {
        //literals
        // The octal number should be prefixed with 0.
        int x = 0146; 
        System.out.println(x);

        int num=0b101; //binary format
        System.out.println(num);

        int num1=0x7E; //Hexa decimal format
        System.out.println(num1); 

        int num2=10_00_00_000; //to identify number of zeros
        System.out.println(num2);

        double num3=56;
        System.out.println(num3);

        double num4=12e10; //12epsilon10
        System.out.println(num4);

        //character can be also treated as integer.we can perform operations.
        char num5='b';
        num5++; //incrementing character
        System.out.println(num5);

    }
}