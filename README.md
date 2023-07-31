# java
JAVA:
Java is a platform independent. That means you can run the application on any machine but that machine has JVM to run.Java is object-oriented. Object-oriented means everything should be an object. Java is WORA-write once run anywhere. Java Is case-sensitive.

HOW JAVA WORKS:
1. Programmer writes the code with the extension of .java
2. compile the code. compiler converts the Java code into byte code. To compile a code we need to install JDK.
JDK-Java Development kit
3. when you install JDK. we get all updated JVM and JRE.
4. JRE -Java Runtime Environment
When you want to run something, use JRE to run it.JRE will provide some extra libraries to run the code. JVM with libraries is a part of JRE.
5. JVM-Java Virtual Machine. Byte code will run on JVM JVM itself is platform dependent.JVM is built for particular os.
   ![image](https://github.com/jeya91296/java/assets/110182064/151298b1-6cb0-4869-bc1f-dd0772c818ac)


-Java is case-sensitive, the class name starts with caps, and "System.out.println"  also starts with caps.
-java interpreter needs this main method to run the program.

Test--class name
TestResults--class name (compound words) The second word must also start with a caps letter. this is known as camel casing

Variables and Datatype:
----------------------------
-The variable is used to store data or values. Datatype is used to indicate what type of data that variable stores.
variable name  must start with letters  eg: String word345f;

the illegal variable name is 3word345f (wrong)
illegal variable name is *&Fword345f (wrong)

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

integer:
--------
int - size is 4 bytes
long- size is 8 bytes
short-size is 2 bytes
byte- size is 1 byte- ie====> -2 to the power of 7 to (2 to the power of 7)-1 so the range is -128 to 127 allowed in byte

float
------
float- size is 4 bytes
double- size is 8 bytes

In Java, which one is the default float or double?
the default one is double because float will have a limited precision 126.5678..... but in double it will have more values.

float num=7.9f; //why f because by default java consider the decimal value as double.so we use f to mention that as float.

character
----------
char- size is 2 bytes
eg: char c='k';
use single quotes for a character. the character will accept only one character.
java supports Unicode.

Boolean
---------
it accepts only true or false. Not to use  0 or 1 to consider true or false.
eg: boolean a=true;

int a=9;
byte n=127;
short z=550;
long d=5754l;

float s=5.8f;
double f=5.8;

char mn='k';
boolean b=true;

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

CONTROL FLOW:
------------------------
if else statement
---------------------
if statement will work when condition is true otherwise else part will get execute.\

syntax:
if(condition is true)
{
statements;
}
else
{
statements ;
}


else if 
-------
if the condition is true it break from ie it jumbs out and not to check remaining  conditions and print the statement otherwise it print else part
ie: if condition is false it checks elseif
then elseif condition is false it checks next condition otherwise it prints else part.

syntax:
if(condition)
{ statements;
}
else if (condition)  
{statements;
}
:
:
else
{statements;
}


nested if else
----------------
in if else there is inside another if else statement
syntax
-----------
if(condition)
{ 
   if (condition)
  {
    statements;
   } 
   else
  {
   statements ;
  }
}
else
{
statements;
}

nested if ... else if
---------------------
in if there is inside another if else if statement
syntax
-----------
if(condition)
{ 
   if (condition)
  {
    statements;
   }
   else if(condition)
   {
     statements;
    }
     else if(condition)
    {
      statements;
      }
     :
     :
   else
  {
   statements ;
  }
}
else
{
statements;
}

Switch
----------
The Switch statement also allows us to control flow of the Application.good idea to use switch is when there are many decisions.we can also use else if for many decisions but we have to use many else ifs.its probably a good idea to use switch beacuse it more reader friendly but it exactly works the same way as the else if.

syntax:
switch(variable)
{
case variablevalue://case 1
 Statement;
  break;
case 2:
    Statement;
  break;
:
:
default:
 Statement;
  break;
 }

METHODS:
------------------
A method in Java is a block of code that, when called, performs specific actions mentioned in it. For instance, if you have written instructions to draw a circle in the method, it will do that task. You can insert values or parameters into methods, and they will only be executed when called.

In general, a method is a way to perform some task. Similarly, the method in Java is a collection of instructions that performs a specific task. In general, a method is a way to perform some task. Similarly, the method in Java is a collection of instructions that performs a specific task.

System.out.println("gdfj"); 
The above method is called the print line. This method's responsibility is to print the data to the screen . the data which  is passings in the method argument will get printed.
the above method is a predefined method in the Java language.

Basically, System is a class and this method belongs to this variable "out" and this variable is actually in the class System. The variable of "out" data type is PrintStream.
 
eclipse:
------------
press ctrl and click on the System in the method. It takes you to the class.
press ctrl and click on the PrintStream ,thats actually another class.
ctrl  + forward slash / to comment the line short cut

Syntax:
-------
public static void methodname()
{
body of the method;
}

note : void method cannot return a value

METHOD VISIBILITY AND STATIC VS INSTANCE:
--------------------------------------------------------------------
Public static void main(String[] args)--this is the entry point for every java application and this method is called standard signature method.


public static void add() //method signature
{
instructions to do the tasks;
}

void-does not return anything 
public-Access Modifier.
	Access Modifier is to manage visibility of methods and variables.
private methods we cannot invoke to other class.It suits same for class also.


there are two are different package java8project  and modifier
if access modifier public or private is removed in MyUtils class ie. class MyUtils like this   then we cannot be invoke the method of MyUtils class from java8project  package to other packages but we can invoke method in same package java8project.
if we use access modifier public we can invoke method from one package to other.

package java8project;

public class MyUtils {
		public static void junk(String ar)
	{
		System.out.println("Something " + ar);
	}




package modifier;

import java8project.MyUtils;

public class Example {
	public static void dosomething()
	{
		MyUtils.junk("101"); //invoking method of MyUtils ===>classname.methodname(argument);
	}

}

Static:
--------
there are Two classes in same package Myutils and Meth

package java8project;
public class MyUtils {
public static int add10(int c)
	{
		int result=c+10;
		return result;
	}
}

package java8project;
public class Meth
{
public static void main (String[] args)
{
Myutils.add10(20);
}

if we remove static in  public static int add10(int c) 

package java8project;
public class MyUtils {
public  int add10(int c)
	{
		int result=c+10;
		return result;
	}
}
then we cannot able to invoke method directly in  package java8project  and public class Meth.
public  int add10(int c) it belongs to instance of the class.

we are assigning an variable instance of this class not the class directly .This has the functionality to be able to invoke methods that are non static in the MyUtils class.

package java8project;
public class MyUtils {
public int add10(int c)
	{
		int result=c+10;
		return result;
	}
}

package java8project;
public class Meth
{
public static void main (String[] args)
{
MyUtils myvar; 
myvar= new MyUtils(); //we are Assigning an variable instance of this class,instance refered to an object variable not the class directly
myvar.add10(20);
}


Eclipse:
----------
ctrl+shift+o thats going to clean up those unused imports.

Eclipse:
----------
To change Font in Eclipse:  right click-->preference-->text editor-->colors and fonts-->java-->java editor text font.
