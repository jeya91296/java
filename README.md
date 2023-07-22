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

Eclipse:
----------
To change Font in Eclipse:  right click-->preference-->text editor-->colors and fonts-->java-->java editor text font.
