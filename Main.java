// CSF. 5 group. Arefjev Yaroslav. 2014

package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Запуск...\n");
        WakeUp();
    }

    public static boolean Answer()
    {
        System.out.print(">  ");
        Scanner sc = new Scanner(System.in);
        if(sc.nextLine().equals("Y"))
            return true;
        else
            return false;
    }

    public static void WakeUp()
    {
        System.out.println("- Пробуждение после сна");
        Walk();
    }

    public static void Walk()
    {
        System.out.println("Хочется гулять?");
        if(Answer())
        {
            System.out.println("- Щенок гуляет");
            Toilet();
        }
        else
            Eat();
    }

    public static void Toilet()
    {
        System.out.println("Щенок хочет в туалет?");
        if(Answer())
        {
            System.out.println("- Сходить в туалет");
            NotFun();
        }
        else
            NotFun();
    }

    public static void NotFun()
    {
        System.out.println("Щенку скучно?");
        if(Answer())
        {
            Tired();
        }
        else
            Play();

    }

    public static void Tired()
    {
        System.out.println("Щенок устал?");
        if(Answer())
        {
            Sleep();
        }
        else
            Play();

    }

    public static void Sleep()
    {
        System.out.println("Щенок хочет спать?");
        if(Answer())
        {
            System.out.println("- Щенок заснул");
            WakeUp();
        }
        else
            Eat();
    }

    public static void Eat()
    {
        System.out.println("Хочется есть?");
        if(Answer())
        {
            System.out.println("- Щенок ест");
            Sleep();
        }
        else
            Walk();

    }


    public static void Play()
    {
        System.out.println("- Щенок играет");
        Eat();
    }
}
