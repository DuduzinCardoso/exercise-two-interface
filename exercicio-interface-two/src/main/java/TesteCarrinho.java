import java.util.Objects;
import java.util.Scanner;

public class TesteCarrinho {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        int codigoLivro = 0;
        double precoLivro = 0.00;
        String nomeLivro = "";
        String autorLivro = "";
        String isbn = "";
        int codigoDvd = 0;
        double precoDvd = 0.00;
        String nomeDvd = "";
        String gravadora = "";
        String descricaoServico = "";
        int codigoServico = 0;
        double qtdHorasServico = 0.00;
        double valorHoraServico = 0.00;

        int counter = 0;
        Carrinho carrinho = new Carrinho();

        System.out.println(
                "Bem-Vindo ao programa AIRARVIL");
        System.out.println(
                "Programa feito para comprar Produtos e adiciona-los no carrinho!");
        System.out.println(
                "Digite 1 para cadastrar um livro;\n" +
                        "Digite 2 para cadastrar um Dvd;\n" +
                        "Digite 3 para cadastrar um serviço;\n" +
                        "digite 4 para aparecer os itens no carrinho;\n" +
                        "digite 5 para exibir o valor total;\n" +
                        "digite 6 para encerrar o programa.\n"
        );
        while (counter < 2) {

            Scanner leitor = new Scanner(System.in);
            System.out.println("Digite um número:");
            Integer numeroEscolhido = leitor.nextInt();

            if (numeroEscolhido <= 0 || numeroEscolhido >= 7) {
                System.out.println(
                        "Número inválido, por favor, digite novamente "
                                + " um número entre 1 à 6");

            } else {
                switch (numeroEscolhido) {
                    case 1:


                        while (true) {

                            System.out.println(" Cadastrando novo Livro"
                                    + " Digite o código do livro:");
                            codigoLivro = leitura.nextInt();

                            if (codigoLivro <= 0) {
                                System.out.println(
                                        "Não existe um livro com código menor "
                                                + "que 1!");
                            } else {
                                break;
                            }
                        }

                        while (true) {

                            System.out.println("Digite o preço do livro: ");
                            precoLivro = leitura.nextDouble();

                            if (precoLivro < 0.00) {
                                System.out.println(
                                        "Não existe um livro com preço menor "
                                                + "que 0,00!");
                            } else {
                                break;
                            }
                        }

                        while (true) {

                            System.out.println("Digite o nome do livro: ");
                            nomeLivro = leitura.next();

                            if (Objects.equals(nomeLivro, "")) {
                                System.out.println(
                                        "Não existe um livro sem nome! Por favor, digite um nome.");
                            } else {
                                break;
                            }
                        }

                        while (true) {

                            System.out.println("Digite o nome do autor do livro: ");
                            autorLivro = leitura.next();

                            if (Objects.equals(autorLivro, "")) {
                                System.out.println(
                                        "Não existe um livro sem autor! Por favor, digite o nome do autor.");
                            } else {
                                break;
                            }
                        }

                        while (true) {

                            System.out.println("Digite o isbn do livro: ");
                            isbn = leitura.next();

                            if (Objects.equals(isbn, "")) {
                                System.out.println(
                                        "Não existe um livro sem isbn! Por favor, digite o isbn.");
                            } else {
                                break;
                            }
                        }
                        Livro livro = new Livro(
                                codigoLivro,
                                precoLivro,
                                nomeLivro,
                                autorLivro,
                                isbn
                        );
                        carrinho.addVendas(livro);
                        System.out.println("Livro cadastrado com sucesso!");
                        break;
                    case 2:
                        while (true) {

                            System.out.println(" Cadastrando novo DVD"
                                    + " Digite o código do DVD:");
                            codigoDvd = leitura.nextInt();

                            if (codigoDvd <= 0) {
                                System.out.println(
                                        "Não existe um DVD com código menor "
                                                + "que 1!");
                            } else {
                                break;
                            }
                        }

                        while (true) {

                            System.out.println("Digite o preço do DVD: ");
                            precoDvd = leitura.nextDouble();

                            if (precoDvd < 0.00) {
                                System.out.println(
                                        "Não existe um Dvd com preço menor "
                                                + "que 0,00!");
                            } else {
                                break;
                            }
                        }

                        while (true) {

                            System.out.println("Digite o nome do DVD: ");
                            nomeDvd = leitura.next();

                            if (Objects.equals(nomeDvd, "")) {
                                System.out.println(
                                        "Não existe um DVD sem nome! Por favor, digite novamente um nome.");
                            } else {
                                break;
                            }
                        }

                        while (true) {

                            System.out.println("Digite o nome da gravadora do DVD: ");
                            gravadora = leitura.next();

                            if (Objects.equals(gravadora, "")) {
                                System.out.println(
                                        "Não existe um DVD sem gravadora! Por favor, digite novamente o nome da gravadora.");
                            } else {
                                break;
                            }
                        }

                        Dvd dvd = new Dvd(
                                codigoDvd,
                                precoDvd,
                                nomeDvd,
                                gravadora
                        );
                        carrinho.addVendas(dvd);
                        System.out.println("DVD cadastrado com sucesso!");
                        break;
                    case 3:
                        while (true) {
                            System.out.println(" Cadastrando novo Serviço"
                                    + " Digite a descrição do serviço:");
                            descricaoServico = leitura.next();

                            if (descricaoServico == null) {
                                System.out.println("Não existe um DVD sem descrição ");
                            } else {
                                break;
                            }
                        }

                        while (true) {

                            System.out.println("Digite o código do serviço: ");
                            codigoServico = leitura.nextInt();

                            if (codigoServico < 0) {
                                System.out.println("Não existe um serviço sem código ");
                            } else {
                                break;
                            }
                        }

                        while (true) {

                            System.out.println("Digite a quantide de horas trabalhadas: ");
                            qtdHorasServico = leitura.nextDouble();

                            if (qtdHorasServico < 0) {
                                System.out.println(
                                        "O serviço não pode ter um valor negativo na quantidade de horas trabalhadas!");
                            } else {
                                break;
                            }
                        }

                        while (true) {

                            System.out.println("Digite o valor por hora trabalhada: ");
                            valorHoraServico = leitura.nextDouble();

                            if (valorHoraServico < 0) {
                                System.out.println(
                                        "O serviço não pode ter um valor negativo na quantidade do valor por hora trabalhada!");
                            } else {
                                break;
                            }
                        }

                        Servico servico = new Servico(
                                descricaoServico,
                                codigoServico,
                                qtdHorasServico,
                                valorHoraServico
                        );
                        carrinho.addVendas(servico);
                        System.out.println("Serviço cadastrado com sucesso!");
                        break;
                    case 4:
                        carrinho.exibirTodos();
                        break;
                    case 5:
                        System.out.printf("\nTotal da compra: R$ %.2f\n",
                                carrinho.calculaTotalVenda());
                        break;
                    case 6:
                        System.out.println("Encerrando a sessão!");
                        counter = 2;
                        break;
                }
            }
        }
    }
}


