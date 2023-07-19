# java
-Java is case-sensitive, the class name starts with caps, and "System.out.println"  also starts with caps.
-java interpreter needs this main method to run the program.

Test--class name
TestResults--class name (compound words) The second word must also start with a caps letter. this is known as camel casing

Variables and Datatype:
----------------------------
it must start with letters  eg: String word345f;

the illegal variable is 3word345f (wrong)
illegal variable is *&Fword345f (wrong)

int - 2 to the 31st power this  int data type support otherwise it is out of range.
long- long big value and use at last "L" or "l" then only java consider as long otherwise it considers as int
eg: long num=10000000000L; (if we assign small number 8474 the well the computer is actually still reserved more memory than its need because the data  type is long)

it's not a good practice to use a small number for long so use int or short to reduce memory

short can store a maximum of up to 32767
eg: short n=-32768;

byte -a really small number. It can store -128 to a maximum of upto 127

to store decimals 
-------------------------
double d=367.008;

boolean df= false;
char kl='9';  //it stores single character only


the int, byte, short, double, boolean, and char are primitive data types. These are the building blocks of Java
but what makes this language special and a lot of other object-oriented languages is that you can create your own data types.

Array:
------------
-Array is a way to store a collection of elements.
-Normal variable  can be assigned to a single value but An Array Variable  can be assigned to multiple values.
-An Array Starts with the zeroth index position.
-all slots that have not been assigned any data yet are by default initialized with zero.
-the particular position does not even exist in the array then it shows an error as ArrayIndexOutOfBoundsException.
-After Assigning an array value as one data type that same data type can be used to declare and assign a value.

eg: int [] cat= new int [100];
cat[8]="hello";  (Wrong)
cat[99]=12; (correct)


starting index position = 0
slots that have not been assigned =0 by default
last index position = length -1

![image](https://github.com/jeya91296/java/assets/110182064/f056c9d6-abc0-4e62-a2bb-7fd93121a2ab)

Eclipse:
----------
To change Font in Eclipse:  right click-->preference-->text editor-->colors and fonts-->java-->java editor text font.
