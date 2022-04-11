import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    //variavel
    double numero = 0.0,
           potencia = 0.0,
           numeroCub = 0.0,
           raizQua = 0.0,
           RaizCub = 0.0;
   //entrada
   System.out.println("Número Real :");
   numero = input.nextDouble();
   //Processamento
   potencia = Math.pow(numero, 2);
   numeroCub = Math.pow(numero, 3);
   raizQua = Math.sqrt(numero);
   RaizCub = Math.cbrt(numero);
   // saida
   System.out.print("\nNúmero ao Quadrado :" + potencia);
   System.out.print("\nNúmero ao Cubo :" + numeroCub);
   System.out.print("\nRaiz Quadrada :" + raizQua);
   System.out.print("\nRaiz Cubica :"+ RaizCub);


  }
}