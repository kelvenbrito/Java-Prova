package SituacaoAprendizagem;

import java.util.Scanner;

public class Sa1 {
    Scanner sc = new Scanner(System.in);

    public void Exercicio1() {
        double n1, n2, soma, sub, mult, div;
        String op;
        System.out.println("Informe o primeiro numero");
        n1 = sc.nextDouble();
        System.out.println("Informe o segundonumero");
        n2 = sc.nextDouble();
        System.out.println("Informe a operação Aritmética a ser executada");
        System.out.println("Digite (A)-Adição, (S)-Subtração, (M)-Multiplicação e (D)-Divisão");
        op = sc.next();

        switch (op.toUpperCase()) {
            case "A":
                soma = n1 + n2;
                System.out.println("Soma: " + soma);
                break;
            case "S":
                sub = n1 - n2;
                System.out.println("Subtração: " + sub);
                break;
            case "M":
                mult = n1 * n2;
                System.out.println("Multiplicação: " + mult);
                break;
            case "D":
                div = n1 / n2;
                System.out.println("Divisão: " + div);
                break;
            default:
                System.out.println(op + " É uma letra invalida!");
        }

    }

    public void Exercicio2() {
        int matri ;
        System.out.println("Informe o numero de sua matricula");
        matri = sc.nextInt();

        if(matri <= 300){
            System.out.println(matri +": Time do Chris");
        }else if(matri > 300 && matri <= 600){
            System.out.println(matri +": Time do Greg");
        }else if(matri > 600 && matri <= 900){
            System.out.println(matri +": Time do Caruso");
        }else{
            System.out.println(matri +": Time do Jerome");
        }


    }

    public void Exercicio3(){
        double mor, mac, ban, vt =0,  desc;
        System.out.println("Digite a quantidade de Morangos em Kg! ");
        mor = sc.nextDouble();
        System.out.println("Digite a quantidade de Maças em Kg! ");
        mac = sc.nextDouble();
        System.out.println("Digite a quantidade de Bananas em Kg! ");
        ban = sc.nextDouble();

        vt = (mor * 2.50) + (mac * 1.80) + (ban * 1.30);
        System.out.println("Valor: " +vt);

        if(mor > 8 ||ban >8 || mac >8 || vt >= 25){
            desc = ( (vt * 10) /100);
             vt  = vt - desc;
             System.out.println("desconto: " +desc);
            
             System.out.println("Valor a ser pago: " +vt);
        }
       
        
       
    }


}