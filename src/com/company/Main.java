package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String vypocet;
        System.out.println("Jaky tvar chces vypocitat: ");
        vypocet = scanner.nextLine();


        double o = 0;
        double A = 0;
        double a = 0;
        double b = 0;
        double c = 0;
        double z = 0;
        double v = 0;
        double r = 0;
        double π = 3.14159265359;


        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        Scanner scanner4 = new Scanner(System.in);
        Scanner scanner5 = new Scanner(System.in);

        switch (vypocet){
            case "Obdelnik":
                System.out.println("Kolik milimetru ma kratsi strana tohoto obdelniku? ");
                a = scanner1.nextInt();
                System.out.println("Kolik milimetru ma delsi strana tohoto obdelniku? ");
                b = scanner2.nextInt();
                o = 2 * (a + b);
                A = a * b;
                break;
            case "obdelnik":
                System.out.println("Kolik milimetru ma kratsi strana tohoto obdelniku? ");
                a = scanner1.nextInt();
                System.out.println("Kolik milimetru ma delsi strana tohoto obdelniku? ");
                b = scanner2.nextInt();
                o = 2 * (a + b);
                A = a * b;
                break;
            case "Ctverec":
                System.out.println("Kolik milimetru ma strana tohoto ctverce? ");
                a = scanner1.nextInt();
                o = 4 * a;
                A = a * a;
                break;
            case "ctverec":
                System.out.println("Kolik milimetru ma strana tohoto ctverce? ");
                a = scanner1.nextInt();
                o = 4 * a;
                A = a * a;
                break;
            case "Trojuhelnik":
                System.out.println("Kolik milimetru ma 1. strana tohoto trojuhelniku? ");
                a = scanner1.nextInt();
                System.out.println("Kolik milimetru ma 2. strana tohoto trojuhelniku? ");
                b = scanner2.nextInt();
                System.out.println("Kolik milimetru ma 3. strana tohoto trojuhelniku? ");
                c = scanner3.nextInt();
                System.out.println("Kolik milimetru ma libovolna tohoto trojuhelniku? ");
                z = scanner4.nextInt();
                System.out.println("Kolik milimetru ma vyska na tuto stranu? ");
                v = scanner5.nextInt();
                o = a + b + c;
                A = 1/2 * z * v;
                break;
            case "trojuhelnik":
                System.out.println("Kolik milimetru ma 1. strana tohoto trojuhelniku? ");
                a = scanner1.nextInt();
                System.out.println("Kolik milimetru ma 2. strana tohoto trojuhelniku? ");
                b = scanner2.nextInt();
                System.out.println("Kolik milimetru ma 3. strana tohoto trojuhelniku? ");
                c = scanner3.nextInt();
                System.out.println("Kolik milimetru ma libovolna tohoto trojuhelniku? ");
                z = scanner4.nextInt();
                System.out.println("Kolik milimetru ma vyska na tuto stranu? ");
                v = scanner5.nextInt();
                o = a + b + c;
                A = 1/2 * z * v;
                break;
            case "Kruh":
                System.out.println("Kolik milimetru ma polomer tohoto kruhu? ");
                r = scanner1.nextInt();
                o = 2 * π * r;
                A = π * (r * r);
                break;
            case "kruh":
                System.out.println("Kolik milimetru ma polomer tohoto kruhu? ");
                r = scanner1.nextInt();
                o = 2 * π * r;
                A = π * (r * r);
                break;
        }


        System.out.println("Obvod objektu je: " + o + " Obsah objektu je: " + A);



    }
}
