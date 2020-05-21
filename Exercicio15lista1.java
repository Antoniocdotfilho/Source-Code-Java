package primeirobimestre;
import java.util.Scanner;
public class Exercicio15lista1 {
    public static void main(String[] args){
        int idade, contador=0,a=0,b=0,c=0,d=0,e=0;
        Scanner exercicio15lista1 = new Scanner(System.in);
        for (int i = 0; i < 15; i++){
          System.out.println("Qual a sua idade: ");
          idade = exercicio15lista1.nextInt();
          if(idade<=15){
              a=a+1;
          }
          if(idade>=16 & idade <=30){
              b=b+1;
          }
          if(idade>=31 & idade <=45){
              c=c+1;
          }
          if(idade>=46 & idade <=60){
              d=d+1;
          }
          if(idade>=61){
              e=e+1;
          }
        }
        System.out.println("A quantidade ate 15 anos : "+a+" Pessoas");
        System.out.println("A quantidade ate 16 a 30 anos : "+b+" Pessoas");
        System.out.println("A quantidade ate 31 a 45 anos : "+c+" Pessoas");
        System.out.println("A quantidade ate 46 a 60 anos : "+d+" Pessoas");
        System.out.println("A quantidade acima de 61 anos : "+e+" Pessoas");
    }  
    
}
