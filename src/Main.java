import java.util.Scanner;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locacao locacao = new Locacao();
        int opcao;
        //Crie um menu para o usuario conseguir interagir com o sistema

        do {
            System.out.println("1 - Cadastrar funcionário ");
            System.out.println("2 - Cadastrar usuário");
            System.out.println("3 - Cadastrar livro");
            System.out.println("4 - Mostrar todos os dados do cadastro");
            System.out.println("5 - Ir para a locação");
            System.out.println("0 - Sair");
            System.out.println("Digite aqui a opção");
            opcao = scanner.nextInt();
           switch (opcao){
               case 1:
                   System.out.println("Bem vindo ao menu funcionário");
                   break;
               case 2:
                   System.out.println("Bem vindo ao menu usuário");
                   break;
               case 3:
                   System.out.println("Bem vindo ao menu livro");
                   break;
               case 4:
                   System.out.println("Bem vindo ao menu cadastro");
                   break;
               case 5:
                   System.out.println("Bem vindo ao menu locação");
                   break;
               case 0:
                   break;
               default:
                   System.out.println("Opção inválida");

           }
        }while (opcao !=9);



    }

    }
