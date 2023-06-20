//SE NA PRIMEIRA VEZ NAO RODAR, RODE NOVAMENTE ATE RODAR TUDO
import java.util.Scanner;

public class Principal{
    public static void main(String[] args) {
        Listas listas = new Listas();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema de cadastramento de alunos !");

        int opcao = 0;
        while (opcao != 5) {
            System.out.println("Selecione a opção desejada:");
            System.out.println("1. Cadastrar Aluno");
            System.out.println("2. Cadastrar Professor");
            System.out.println("3. Listar Alunos");
            System.out.println("4. Listar Professor");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do Aluno: ");
                    String nomeAluno = scanner.next();
                    System.out.print("Idade do Aluno: ");
                    int idadeAluno = scanner.nextInt();
                    System.out.print("Matrícula do Aluno: ");
                    int matricula = scanner.nextInt();
                    listas.cadastrarAluno(nomeAluno, idadeAluno, matricula);
                    System.out.println("Aluno cadastrado com sucesso!");
                    break;
                case 2:
                    System.out.print("Nome do Professor: ");
                    String nomeProfessor = scanner.next();
                    System.out.print("Idade do Professor: ");
                    int idadeProfessor = scanner.nextInt();
                    listas.cadastrarProfessor(nomeProfessor, idadeProfessor);
                    System.out.println("Professor cadastrado com sucesso!");
                    break;
                case 3:
                    listas.listarAlunos();
                    break;
                case 4:
                    listas.listarProfessor();
                    break;
                case 5:
                    System.out.println("Saindo do sistema se deseja repetir a operação rode novamente o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, digite uma opção válida.");
            }
        }
    }
}
