package primeirobimestre;
import java.util.Scanner;
public class Exercicio1lista1 {
    public static void main(String[] args){
      String nome;
      int idade, calculo;
      Scanner exer1list = new Scanner(System.in);
      System.out.println("Qual é seu nome? ");
      nome = exer1list.nextLine();
      System.out.println("Qual é sua idade? ");
      idade = exer1list.nextInt();
      calculo = (idade*365);
      System.out.println(nome+" ,VOCÊ JÁ VIVEU "+calculo+" DIAS");
             
    }
    
}
