package com.company;

import java.util.Scanner;

public class ExerciciosBasicosMain {

    public static void main(String[] args) {
        Exercicios e = new Exercicios();
        System.out.printf("EX1: "+e.ex1(18));
        System.out.printf("\n"+"EX2: "+e.ex2("abacate", 10,50));
        System.out.printf("\n"+"EX3: "+e.ex3("tesoura"));
//        System.out.printf("\n"+"EX4, digite o primeiro numero: ");
//        Scanner ler = new Scanner(System.in);
//        String n1 = ler.next();
//        System.out.printf("\n"+"EX4, digite o operador");
//        String op = ler.next();
//        System.out.printf("\n"+"EX4, digite o segundo numero: ");
//        String n2 = ler.next();
//        System.out.printf("\n"+"EX4 : "+ e.ex4(op,n1,n2));
        System.out.printf("\n"+"EX5: "+e.ex5(12));
        System.out.printf("\n"+"EX6: "+e.ex6());

        System.out.printf("\n"+"EX7: "+e.ex7(9));

//        System.out.printf("\n"+"EX8: 8 Leia um número até que o usuário digite 10;  ");
//        Scanner ler = new Scanner(System.in);
//        String ler1 = ler.next();
//        while (!ler1.equals("10")){
//            ler1 = ler.next();
//        }
        System.out.printf("\n"+"EX9: "+e.ex9(45));
        int[][] a = {{10,10,10},{20,50,20},{30,30,30}};
        System.out.printf("\n"+"EX10: "+e.ex10(a));

        System.out.printf("\n"+"EX11: "+e.ex11());


        System.out.printf("\n"+"EX12: "+e.ex12());
    }
}
