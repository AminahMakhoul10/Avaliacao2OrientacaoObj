//SE NA PRIMEIRA VEZ NAO RODAR, RODE NOVAMENTE ATE RODAR TUDO
import java.util.ArrayList;

public class Listas {
    public ArrayList<Aluno> listaAluno;
    public ArrayList<Professor> listaProfessor;

    public Listas() {
        listaAluno = new ArrayList<>();
        listaProfessor = new ArrayList<>();
    }

    public void cadastrarAluno(String nome, int idade, int matricula) {
        Aluno aluno = new Aluno(nome, idade, matricula);
        listaAluno.add(aluno);
    }

    public void cadastrarProfessor(String nome, int idade) {
        Professor professor = new Professor(nome, idade);
        listaProfessor.add(professor);
    }

    public void listarAlunos() {
        System.out.println("=== Lista de Alunos ===");
        for (Aluno aluno : listaAluno) {
            System.out.println(aluno);
        }
        System.out.println("======================");
    }

    public void listarProfessor() {
        System.out.println("=== Lista de Professores ===");
        for (Professor professor : listaProfessor) {
            System.out.println(professor);
        }
        System.out.println("===========================");
    }


		
	}

