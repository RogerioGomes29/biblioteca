import java.util.Scanner;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locacao locacao = new Locacao();
        int opcao;

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
                   System.out.println(":::::::::::::::::::::Bem vindo ao menu funcionario:::::::::::::::::::::");

                   System.out.println("Digite seu nome:");
                   locacao.getFuncionario().setNome(scanner.next());
                   System.out.println("Digite seu cpf:");
                   locacao.getFuncionario().setCpf(scanner.nextLong());
                   System.out.println("Digite seu cargo:");
                   locacao.getFuncionario().setCargo(scanner.next());
                   System.out.println("Digite seu salario:");
                   locacao.getFuncionario().setSalario(scanner.next());
                   System.out.println("Digite sua rua:");
                   locacao.getFuncionario().getEndereco().setRua(scanner.next());
                   System.out.println("Digite seu bairro:");
                   locacao.getFuncionario().getEndereco().setBairro(scanner.next());
                   System.out.println("Digite o numero da sua casa:");
                   locacao.getFuncionario().getEndereco().setNumero(scanner.nextInt());
                   break;
               case 2:
                   System.out.println(":::::::::::::::::::::Bem vindo ao menu usuário:::::::::::::::::::::");
                   //TODO: CRIAR O MENU DE USUARIO
                   //EXEMPLO ABAIXO:
                   System.out.println("Digite seu nome");
                   locacao.getUsuario().setNome(scanner.next());

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
