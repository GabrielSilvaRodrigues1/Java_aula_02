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
        System.out.println("Número aleatório: ");
        var numero = sc.nextInt();
        //raiz quadrada;
        System.out.printf("Raíz: %s \n", Math.sqrt(numero));
        var bnr = Integer.toBinaryString(numero);
        var vlr = numero | idade;
        System.out.printf("Binario: %s \nNúmero | Idade = %s \n", bnr, vlr);
        var isEmancipade = sc.nextLine();
        var livre = (idade >= 18 || isEmancipade != "n");
        var mensagem = livre ? "Sim" : "Não";
        System.out.println("Livre: " + mensagem);
        System.out.println("Informe um número de 1 até 7:");
        var altr=sc.nextInt();
        switch (altr) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                break;
        }

    }
}
