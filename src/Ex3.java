//Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
//um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
//4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
//que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
//mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
//exemplo

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int num, alcool = 0, gasolina = 0, diesel = 0;

        do {
            System.out.println("Escolha uma das opções: ");
            System.out.println("1. Álcool");
            System.out.println("2. Gasolina");
            System.out.println("3. Diesel");
            System.out.println("4. Fim");
            num = sc.nextInt();

            switch (num){
                case 1:
                    alcool = alcool + 1;
                    break;
                case 2:
                    gasolina = gasolina + 1;
                    break;
                case 3:
                    diesel = diesel + 1;
                    break;
                case 4:
                    System.out.println("MUITO OBRIGADO");
                    System.out.println("Alcool: " + alcool);
                    System.out.println("Gasolina: " + gasolina);
                    System.out.println("Diesel: " + diesel);
                    sc.close();
                    break;
            }
        }while(num != 4);
    }
}
