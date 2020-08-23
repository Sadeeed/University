package Exceptions;

import Exceptions.superClassExceptions.ExceptionA;
import Exceptions.superClassExceptions.ExceptionB;
import Exceptions.superClassExceptions.ExceptionC;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.IOException;
import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        //Task 1: superClassExceptions
        System.out.println(ConsoleColors.CYAN + "\nTask 1");
        try{
            throw new ExceptionB();
        }
        catch (ExceptionA e) {
            System.out.println(ConsoleColors.RED + "Exception B: " + ConsoleColors.RESET + e);
        }

        try{
            throw new ExceptionC();
        }
        catch (ExceptionA e) {
            System.out.println(ConsoleColors.RED + "Exception C: " + ConsoleColors.RESET + e);
        }

        //Task 2: classException
        System.out.println(ConsoleColors.CYAN + "\nTask 2");
        try{
            throw new ExceptionA();
        } catch (Exception exceptionA) {
            System.out.println(ConsoleColors.RED + "Exception A: " + ConsoleColors.RESET + exceptionA);
        }

        try{
            throw new ExceptionB();
        } catch (Exception exceptionA) {
            System.out.println(ConsoleColors.RED + "Exception B: " + ConsoleColors.RESET + exceptionA);
        }

        try{
            throw new NullPointerException();
        } catch (Exception exceptionA) {
            System.out.println(ConsoleColors.RED + "NullPointer: " + ConsoleColors.RESET + exceptionA);
        }

        try{
            throw new IOException();
        } catch (Exception exceptionA) {
            System.out.println(ConsoleColors.RED + "IOException: " + ConsoleColors.RESET + exceptionA);
        }

        //Task 3: Order of catch blocks
        System.out.println(ConsoleColors.CYAN + "\nTask 3");

        try{
            throw new ExceptionB();
        }
        catch (ExceptionA e) {
            System.out.println(ConsoleColors.RED + "Exception B: " + ConsoleColors.RESET + e);
        }
//        catch (ExceptionB e){
//            System.out.println(ConsoleColors.RED + "Exception B: " + ConsoleColors.RESET + e);
//            e.printStackTrace();
//        } //Throws an error since the exception is already caught in the first catch block because ExceptionB extends ExceptionA

        //Task 4: Constructor Failure
        System.out.println(ConsoleColors.CYAN + "\nTask 4");

        try{
            SomeClass constructorFail = new SomeClass();
        }
        catch (Exception e) {
            System.out.println(ConsoleColors.RED + "Constructor Failure: " + ConsoleColors.RESET + e);
        }

        //Task 5: Rethrowing Exceptions
        System.out.println(ConsoleColors.CYAN + "\nTask 5");

        try {
            someMethod();
        }
        catch (Exception rethrow){
            System.out.println(ConsoleColors.RED + "StackTrace: " + ConsoleColors.RESET + rethrow);
            rethrow.printStackTrace();
        }

    }

    private static void someMethod() {
        try {
            someMethod2();
        }
        catch (Exception e){
            throw e;
        }
    }

    private static void someMethod2() {
        throw new IndexOutOfBoundsException();
    }
}