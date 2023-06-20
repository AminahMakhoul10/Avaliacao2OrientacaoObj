//SE NA PRIMEIRA VEZ NAO RODAR, RODE NOVAMENTE ATE RODAR TUDO
public class Professor extends Pessoa {

    public Professor(String nome, int idade) {
        super(nome, idade);
        
    }

    public String toString() {
        return "Professor: " + nome + ", Idade: " + idade;
    }
}

