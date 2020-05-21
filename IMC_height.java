package primeirobimestre;
import java.util.Scanner;
public class Exercicio20lista1 {
    public static void main(String[] args){
        float peso,altura;
        int x=1;
        double potenciaaltura, imc;
        Scanner exercicio20lista1 = new Scanner(System.in);
        while(x==1){
        System.out.println("Qual a sua altura? ");
        altura = exercicio20lista1.nextFloat();
        System.out.println("Qual é o seu peso? ");
        peso = exercicio20lista1.nextFloat();
        
        potenciaaltura = Math.pow(altura, 2); // calcular potencia
        imc=(peso/potenciaaltura);
        
        if(imc<20){
        System.out.println("Abaixo do peso");    
        }
        
        if(imc>=20 & imc<=25){
        System.out.println("Peso normal");    
        }
        
        if(imc>=25 & imc<=30){
        System.out.println("Sobre peso");    
        }
        
        if(imc>=30 & imc<=40){
        System.out.println("Obeso");    
        }
        
        if(imc>=30){
        System.out.println("Obeso morbido");    
        }
        System.out.println("Deseja continuar 1 para sim e 0 para não");
        x = exercicio20lista1.nextInt();
        }
        
    }
    
}
