import java.util.Scanner;

public class App {

    private final static String MENSAGEM_ERRO = "Falha ao salvar";

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nome: ");
        String nome = sc.nextLine();
        System.out.println("Idade: ");
        int idade = sc.nextInt();
        System.out.printf("Nome: %s \nIdade: %s \n", nome, idade);
        var tipoIndefinido = MENSAGEM_ERRO;
        var numero = sc.nextInt();
        //raiz quadrada;
        System.out.printf("Raíz: %s \n", Math.sqrt(numero));
        var bnr = Integer.toBinaryString(numero);
        var vlr = numero | idade;
        System.out.printf("Binario: %s \n, numero | idade = s%", bnr, vlr);

    }
}
