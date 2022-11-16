package com.basic;
/**before moving toward basic we need what is java how java works and why we need to learn java
 * java was devloped by james Gosling in 1995 at Sun MicrSystem which is later acquired by oracle 
 * in 2010.
 *  It was originally called OAK after an OAK tree that stood outside Gosling’s Office,
later it was renamed “Green” and was finally renamed to “Java” inspired by Java
Coffee, that’s why its logo looks like a cup of coffee.☕☕☕☕☕☕☕☕☕☕☕☕☕☕
☕☕☕☕☕☕☕☕☕☕☕☕☕☕☕☕☕☕☕☕☕☕☕☕☕☕☕☕☕☕☕☕☕☕☕☕☕☕
☕☕☕☕☕☕☕☕☕☕☕

☕java Edition
We have 3 editions of Java for building a different kinds of applications
1. Java Standard Edition (JSE)
This is the core Java platform, it is a specification, which contains the core libraries to
develop standalone, networking, database, GUI, multithreaded types of applications.
In addition to the core API, the Java SE platform consists of the virtual machine,
Day1: Java Introduction 2
development tools, deployment technologies and other class libraries and toolkit
commonly used in Java application.

2. Java Enterprise Edition (JEE)
The Java EE platform provides an API and runtime environment for developing and
running large-scale, multi-tiered, scalable, reliable, and secure network applications.

3.Java Micro Edition (JME)
It is a subset of Java SE, designed used for microdevices and embedded development
like mobile phones, sensors, micro-controller, TV set-top boxes etc.

☕Feature of java
Simple:- Java is easy to learn and its syntax is quite simple, clean and easy to
understand.
Object-Oriented:- Java is object-oriented, it supports all the OOPS
characteristics. This makes java applications easy to develop and maintain,
compared to structured programming language.
Portable and Platform Independent:- Java source code is compiled and
converted into bytecode. this bytecode can run on multiple platforms i.e. Write Once
and Run Anywhere(WORA), we can compile the java code in one Operating
System and execute it on another Operating System.
Secure:- JAVA has provided an implicit component inside JVM in the form of a
“Security Manager”  to provide implicit security against malicious code. Java has
provided very good predefined implementations for almost all well-known network
security. JAVA has provided a separate middleware service in JAAS [Java
Authentication and Authorization Service], which provides web security. Auth, SSO.
Robust:- Robust means strong. Java is having a very good memory management
system in the form of a heap memory management system, it is a dynamic memory
management system, it allocates and deallocates memory for the objects at
runtime. JAVA is having very good Exception Handling mechanisms, because, Java
has provided a very good predefined library to represent and handle almost all the
frequently generated exceptions in java applications.
Multithreaded:- Java supports multithreading to enhance performance. by using
this we can execute multiple functionalities simultaneously.

☕JDK
Java Standard Edition comes in the form of Specification, and the implementation of this
specification is the JDK software, also known as Java SDK (Java Standard
Development Kit).
This JDK software is used for developing and executing Java applications.
JDK = (JRE + Development tools like java compiler, debugger, etc.)
JRE = (JVM + Predefined Library classes)


There are two phases are involved in Java application execution:
1. Compilation phase
2. Execution phase
In the Compilation phase, IntelliJ uses the java compiler to compile our code into a
different format called Java byte-code.
This java compiler comes with the JDK software.
This java byte-code, is platform-independent, which means it can run on the Window,
Mac, Linux, or any Operating-system that has JRE (Java Runtime Environment).
We can also download this JRE, for various Operating-system separately.
This JRE has a software component called JVM (Java Virtual Machine), this JVM
takes our java byte-code and translates it to the native code for the underlying OS.
Day1: Java Introduction 7
If we are in the Window Operating-system, this JVM will convert our java byte-code to
the window Operating-system understandable native code, and if we are in the Linux
environment, then this JVM will convert our java byte-code to the Linux OS
understandable native code. with this architecture only, our java applications are
portable or platform-independent.
☕
**/
public class basic {
	/*using public static void main()String[] args) we execute a java program 
	 * it is called method in java 
	 * where we give instruction to run a program.
	 * ☕☕☕☕☕☕☕☕☕
	 */
public static void main(String[] args) {
	System.out.println("welcome to java");
}
}
