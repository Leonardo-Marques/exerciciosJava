package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Exercicios {
    public Exercicios() {
    }

    public String ex1(int idade){
        if (idade < 18){
            return "Menor de idade";
        }
        return "Maior de idade";
    }

    public String ex2(String nome, double preco, int qnt){
        double valor = preco*qnt;
        if (qnt >= 50){
            valor = valor*0.75;
            System.out.printf("1");
        }else if (qnt > 20 ){
            valor= valor*0.8;
            System.out.printf("1");
        } else if (qnt > 10){
            valor = valor*0.9;
            System.out.printf("3");

        }else if (qnt < 0){
            return "Erro";
        }

        return nome + ": "+valor;
    }

    public String ex3(String player){
        String result =" ERRO ";
        Random gerador = new Random();
        int r = gerador.nextInt(3);
        String maquina = "";
        if (r == 0)maquina = "pedra";
        if (r == 1)maquina = "papel";
        if (r == 2)maquina = "tesoura";
        if (player.toLowerCase().equals(maquina)) result = "Empate";
        if (player.equalsIgnoreCase("pedra") && maquina.equals("papel"))result = "Maquina Vence";
        if (player.equalsIgnoreCase("pedra") && maquina.equals("tesoura"))result = "player Vence";
        if (player.equalsIgnoreCase("papel") && maquina.equals("tesoura"))result = "Maquina Vence";
        if (player.equalsIgnoreCase("tesoura") && maquina.equals("papel"))result = "player Vence";
        if (player.equalsIgnoreCase("papel") && maquina.equals("pedra"))result = "player Vence";
        if (player.equalsIgnoreCase("tesoura") && maquina.equals("pedra"))result = "Maquina Vence";
        return "maquina: "+maquina+" PLayer: "+player+" ||  "+result;
    }


    public double ex4(String op, String n1,String n2){
        double nn1 =Double.parseDouble(n1);
        double nn2 =Double.parseDouble(n2);
        return switch (op) {
            case "+" -> nn1 + nn2;
            case "-" -> nn1 - nn2;
            case "/" -> nn1 / nn2;
            case "*" -> nn1 * nn2;
            default -> 0;
        };
    }

    public String ex5(int n){
        String tabuada = "      TABUADA     ";
        for (int i = 0; i <=10; i++){
            String linha = "\n  "+i+" x "+n+" = "+ i*n;
            tabuada = tabuada.concat(linha);
        }
        return tabuada;
    }

    public String ex6(){
        Random gerador = new Random();
        ArrayList<Integer> integers = new ArrayList<Integer>();
        int menor = 100;
        int maior =0;
        for (int i = 0; i < 10; i++) {
            integers.add(i, gerador.nextInt(100));
        }
        for (int i = 0; i < 10 ; i++) {
            if (integers.get(i) < menor)menor = integers.get(i);
            if (integers.get(i) > maior)maior = integers.get(i);
        }

        return integers + "\n"+ " maior: "+maior+" menor: "+menor;
    }


    public ArrayList<Integer> ex7 (int n){
        ArrayList<Integer> result = new ArrayList<>();
        for(int a=0, b=1, i=0; i<n; b+=a, a=b-a, i++) {
            result.add(i,a);
        }
        return result;
    }

    public ArrayList<Integer> ex9 (int n){
        ArrayList<Integer> result = new ArrayList<>();
        for(int a=0, b=1, i=0; i<10; b+=a, a=b-a, i++) {
            if (a < n){
                result.add(i,a);
            }
        }
        return result;
    }

    public static int ex10(int[][] matriz) {
        int soma = 0;
        int col = 0;
        for (int i= 0; i < matriz.length; i++) {
            soma = soma + matriz[i][col];
            col++;
        }
        return soma;
    }

    public ArrayList<Integer> ex11(){
        Random gerador = new Random();
        ArrayList<Integer> integers = new ArrayList<Integer>();

        for (int i = 0; i < 100; i++) {
            integers.add(i, gerador.nextInt(1000));
        }
        integers.sort(Integer::compareTo);
        return integers;
    }


    public ArrayList<Integer> ex12(){
        Random gerador = new Random();
        ArrayList<Integer> integers1 = new ArrayList<Integer>();
        ArrayList<Integer> integers2 = new ArrayList<Integer>();

        for (int i = 0; i <50; i++) {
            integers1.add(i, gerador.nextInt(1000));
        }

        for (int i = 0; i <50; i++) {
            integers2.add(i, gerador.nextInt(1000));
        }

        integers1.sort(Integer::compareTo);
        integers2.sort(Integer::compareTo);
        integers1.addAll(integers2);

        integers2.sort(Integer::compareTo);
        return integers2;
    }



}
