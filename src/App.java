import model.Endereco;
import model.Estados;
import model.Gestor;
import model.Pessoa;
import model.Trabalhador;
import util.ClonarEndereco;

public class App {
    public static void main(String[] args) {
        var pessoa = new Pessoa("Carlos Ribeiro", 29, "carlos@email.com", "+55519967584");
        System.out.println("nome: %s".formatted(pessoa.getNome()));
        var trabalhador = new Trabalhador("Carlos Ribeiro", 29, "carlos@email.com", "+55519967584", "Operador", 2300);
        System.out.println(trabalhador instanceof Pessoa);
        System.out.println(trabalhador instanceof Trabalhador);
        System.out.println(pessoa instanceof Trabalhador);

        var gestor = new Gestor();
        System.out.println(gestor);
    }

    public void oopBasico() throws Exception {
        var pessoa = new Pessoa("Carlos Ribeiro", 29, "carlos@email.com", "+55519967584");

        System.out.println("nome: %s".formatted(pessoa.getNome()));

        var endereco1 = new Endereco("Rua x", "NH", "93555-000", Estados.RS);
        pessoa.setEndereco(endereco1);

        pessoa.setNome("Felipe Ribeiro");
        System.out.println("nome: %s".formatted(pessoa.getNome()));

        var pessoa2 = new Pessoa();
        pessoa2.setEmail("carlos@email.com");
        pessoa2.setIdade(36);
        pessoa2.setTelefone("+555221145");
        pessoa2.setNome("Carlos Fernandez");
        pessoa2.setEndereco(
                new ClonarEndereco().clonar(endereco1));

        String cep = pessoa.getEndereco().getCep();
        System.out.println("CEP: %s".formatted(cep));

        String cep2 = pessoa2.getEndereco().getCep();
        System.out.println("CEP: %s".formatted(cep2));

        pessoa2.getEndereco().setCep("93111-11");
        System.out.println("CEP 1 = %s".formatted(pessoa.getEndereco().getCep()));
        ;
        System.out.println("CEP 2 = %s".formatted(pessoa2.getEndereco().getCep()));
        ;
    }
}
