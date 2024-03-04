import java.util.Scanner;

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
scanner.nextLine();
            switch (opcao) {
                case 1:
                    System.out.println(":::::::::::::::::::::Bem vindo ao menu funcionario:::::::::::::::::::::");

                    System.out.print("Cadastro do funcionário: \n"
                            + "Nome: ");
                    locacao.getFuncionario().setNome(scanner.nextLine());
                    System.out.println("Digite seu cpf:");
                    locacao.getFuncionario().setCpf(scanner.nextLong());
                    System.out.println("Digite seu cargo:");
                    locacao.getFuncionario().setCargo(scanner.next());
                    System.out.println("Digite seu salario:");
                    locacao.getFuncionario().setSalario(scanner.next());
                    System.out.print("Endereço------\n"
                            + "Rua: ");
                    scanner.nextLine();
                    locacao.getFuncionario().getEndereco().setRua(scanner.next());
                    System.out.println("Digite o numero da sua casa:");
                    locacao.getFuncionario().getEndereco().setNumero(scanner.nextInt());
                    System.out.println("Digite seu bairro:");
                    locacao.getFuncionario().getEndereco().setBairro(scanner.next());
                    break;

                case 2:
                    System.out.println(":::::::::::::::::::::Bem vindo ao menu usuário:::::::::::::::::::::");

                    System.out.println("Digite seu nome:");
                    locacao.getUsuario().setNome(scanner.next());
                    System.out.println("Digite o seu código:");
                    locacao.getUsuario().setCodigo(scanner.next());
                    System.out.println("Digite o seu CPF:");
                    locacao.getUsuario().setCpf(scanner.next());
                    System.out.println("Digite a sua rua:");
                    locacao.getUsuario().getEndereco().setRua(scanner.next());
                    System.out.println("Digite o seu bairro:");
                    locacao.getUsuario().getEndereco().setBairro(scanner.next());
                    System.out.println("Digite o número da sua casa:");
                    locacao.getUsuario().getEndereco().setNumero(scanner.nextInt());
                    break;

                case 3:
                    System.out.println("::::::::::::::::::Bem vindo ao menu livro::::::::::::::::::::::");
                    System.out.println("Digite o título do livro:");
                    locacao.getLivro().setTitulo(scanner.next());
                    System.out.println("Digite o gênero do livro:");
                    locacao.getLivro().setGenero(scanner.next());
                    System.out.println("Digite o nome do autor");
                    locacao.getLivro().setAutor(scanner.next());
                    break;

                case 4:
                    do {
                        System.out.print("Selecione o cadastro na qual o mesmo queira acessar: \n" +
                                " 1 - Cadastro do Funcionário: \n" +
                                " 2 - Cadastro do Usuário: \n" +
                                " 3 - Cadastro do Livro: \n" +
                                " 9 _ Voltar ao menu principal: \n" +
                                "Digite a opção desejada: ");
                        opcao = scanner.nextInt();

                        switch (opcao) {
                            case 1:
                                //TODO: MOSTRAR NA TELA OS DADOS DO FUNCIONARIO
                                System.out.println("Cadastro do Funcionário");
                                System.out.println(locacao.toString());
                                break;
                            case 2:
                                //TODO: MOSTRAR NA TELA OS DADOS DO USUARIO
                                System.out.println("2 - Cadastro do Usuário:");
                                break;
                            case 3:
                                //TODO: MOSTRAR NA TELA OS DADOS DO LIVRO
                                System.out.println("Cadastro do Livro:");
                                break;
                            default:
                                System.out.println("opção invalida");
                                break;
                        }
                    } while (opcao != 9);

                case 5:
                    System.out.println("Bem vindo ao menu locação");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida");

            }

        } while (opcao != 0);
    }

}
