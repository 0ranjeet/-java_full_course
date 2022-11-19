package org.example;
/*
Object Orientation:
To develop a computer application, we have various programming paradigms, or styles
of programming are there like:
Procedural programming
functional programming
Object-Oriented Programming
Out of these all Object-oriented and functional are the two most popular paradigms we
use these days.
These programming paradigms are ways or styles of writing code. they are not
programming languages.
We classify the Programing language based on the Paradigm they support.
Java support multiple paradigms to develop an application or program.
Note: In a single application we may use the different paradigms to solve different
problems.
In Object-oriented programming, everything is based on a concept called objects
These objects are the basic units going to contain some data which is called state and
the operation on these data, called methods or behaviours. these methods modify the
data (state).

So in Object-oriented programming, we bring both data and methods that operate on it
together, in a single object. These objects interact with each other, to perform various
tasks.
The benefits of Object-oriented programming:-
Reduce complexity
Easier maintenance
Code reusability
Faster Development
Difference between Class and Object:
Class is a template or a blueprint for the objects. whereas Object is an instance of the
Class.
Class is the virtual encapsulation of properties and behaviours. The object is the
physical encapsulation of properties and behaviours.
Class:
The main purpose of the class is to represent all real-world entities in Java
applications.
EX: Student, Employee, Product, Account, etc.
To represent entities data in Java applications we will use variables.
and to represent entities’ behaviours we will use methods.
Basic syntax:

public class ClassName {
--- variables---
--- methods---
}
Instance variable in Java
A variable that is created inside the class but outside the method is known as an
instance variable. The instance variable doesn't get memory at compile time. It gets
memory at runtime when an object or instance is created. That is why it is known as
an instance variable.
Example:
 */
public class oops {
    int x=10; //instance variable
    public static void main(String[] args){
        int y=10; //local variable of main mehtod
        System.out.println(y); // 10
        System.out.println(x);//error
    }

}
//class oops {
//    int x=10; //instance variable
//    public static void main(String[] args){
//        int y=10; //local variable of main mehtod
//        System.out.println(y); // 10
//        oops o1=new oops();
//        System.out.println(o1.x);//
//    }
//
//}
