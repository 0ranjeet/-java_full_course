package com.basic;

public class operator {
//    There are 2 types of comments.
//1. Single Line Comment:
//    It allows the description within a single line.
//    Syntax:
// --- description------
//            2. Multi-Line Comment
//    It allows description in more than one line
//    Syntax:
    /*
    ....
    description
    ....☕☕☕☕☕☕☕☕☕☕
    */
//    ☕☕☕
    /*
    Java Language Fundamentals
To prepare java applications, java has provided the following list of tokens.
1. Identifiers
2. Literals
3. Keywords/ Reserved words
4. Operators
Day2: Java Language Fundamentals 2
1. Identifiers:
The identifier is a name assigned to the programming elements like variables, methods,
classes, abstract classes, interfaces etc.
ex:
int age = 25; int height; //default to be 0
height=67;
//0, 1, ...
here
int : data type
age : variable [identifier]
= : operator (assingment)
25 : value/constant [literal]
; : terminator


3. Keywords/ Reserved Words
Keywords in Java convey a special meaning to the compiler therefore, these cannot be used as
identifiers.
Among the list of keywords list mentioned below the keywords goto and const are currently not in use.
They are reserved words (for future use)..
ex:-
|     abstract | continue | for                        |   new                   |        switch           |
------------------------------------------------------------------------------------------------------|
|    assert       |default    | goto                     |  package           | synchronized    |
|  boolean      | do             | if                           |private                |  this                       |
|break             |double     |implements      |   protected       |  throw                   |
|   byte             | else           |import                |      public            |   throws               |
|    case           | enum       |     instanceof   |   return              |       transient      |
|   catch           |  extends  | int                      | short                  |       try                     |
|char               |     final        | long                   |strictfp             |           volatile        |
|  const           |    float         |   native            | super                 |       while                |



1.Arithmetic Operators:
+, -, *, /, %, ++, --
2. Assignment Operators:
=, +=, -=, *=, /=, %=
3. Comparison Operators:
==, !=, <, >, <=, >=
4. Boolean Logical Operators:
&, |, ^
5. Bitwise Logical Operators:
&, |, ^, <<, >>
6. Short-Circuit Operators:
&&, ||
7. Ternary Operator:
Expr1? Expr2: Expr3;



Primitive Data Types : Wrapper Classes
byte : java.lang.Byte
short : java.lang.Short
int : java.lang.Integer
long : java.lang.Long
float : java.lang.Float
double : java.lang.Double
char : java.lang.Character
boolean : java.lang.Boolean



Conditional Statements:
These statements are able to allow to execute a block of instructions under a particular
condition.
example : if, if-else, switch
if, if-else:
Syntax1:
if(condition)
{
---instructions----
}
Syntax2:
if(condition)
{
---instructions----
}
else
{
----instructions----
}
Syntax3:
if(condition)
{
---instructions----
}
else if(condition)
{
Day2: Java Language Fundamentals 15
---instruction----
}
else if(condition)
{
---instructions----
}
....
....
else
{
----instructions----
}





switch:
'if' is able to provide single condition checking by default, but, switch is able to provide
multiple conditions checking.
Syntax:-
switch(var)
{
Day2: Java Language Fundamentals 17
case 1:
-----instructions-----
break;
case 2:
----instructions------
break;
case n:
----instructions-----
break;
default:
----instructions-----
break;
}



     */
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a); //10
        System.out.println(a++);//10 //post-increment => (print, increase)
        System.out.println(++a);//12
        System.out.println(a--);//12
        System.out.println(--a);//10
        System.out.println(a);//10
        System.out.println("value of Integer Type data ");
        System.out.println(Byte.MIN_VALUE + "----->" + Byte.MAX_VALUE);
        System.out.println(Short.MIN_VALUE + "---->" + Short.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE + "----->" + Integer.MAX_VALUE);
        System.out.println(Long.MIN_VALUE + "----->" + Long.MAX_VALUE);
        System.out.println(Float.MIN_VALUE + "----->" + Float.MAX_VALUE);
        System.out.println(Double.MIN_VALUE + "----->" + Double.MAX_VALUE);
        System.out.println(Character.MIN_VALUE + "----->" + Character.MAX_VALUE);
        System.out.println("type casting");
        int i = 10;
        byte b = (byte) i;
        System.out.println(i + " " + b);


        int i = 10;
        int j;
        if (i == 10) {
            j = 20;
        } else if (i == 20) {
            j = 30;
        } else {
            j = 40;
        }
        System.out.println(j);


        int i = 10;
        switch (i) {
            case 5:
                System.out.println("Five");
                break;
            case 10:
                System.out.println("Ten");
                break;
            case 15:
                System.out.println("Fifteen");
                break;
            case 20:
                System.out.println("Twenty");
                break;
            default:
                System.out.println("Default");
                break;
        }


//    forloop
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        //whileloop
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i = i + 1;
        }
//dowhile loop
        do {
            System.out.println(i);
            i = i + 1;
        }
        while (i < 10);
/*
Transfer Statements:
    These statements are able to bypass flow of execution from one instruction to another
    instruction.
1. break;
2. continue;
3. return
*/
        for (int i = 0; i < 10; i++) {
            if (i == 5)
                break;//break at 5.
            System.out.println(i);
        }
        for (int i = 0; i < 10; i++) {
            if (i == 5)
                continue;// without 5.
            System.out.println(i);
        }

    }
    static  int plus(){
        int sum=0;
        for(int i=0;i<5;i++){
            sum+=i;
        }
        return  sum;//here return is used as a value corier
}
}

