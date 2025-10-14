import java.util.Scanner;   

public class Exercicio {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("");
        String entrada = sc.nextLine(); // Lê toda a linha de texto

        System.out.println("Você digitou: " +entrada);

        sc.close();
    }
}