//SE NA PRIMEIRA VEZ NAO RODAR, RODE NOVAMENTE ATE RODAR TUDO
public class Aluno extends Pessoa {
    public int matricula;

    public Aluno(String nome, int idade, int matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }
}

