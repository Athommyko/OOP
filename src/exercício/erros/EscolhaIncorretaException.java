package exercício.erros;

public class EscolhaIncorretaException extends Exception {
    public EscolhaIncorretaException(String escolha, String... opcoes ){
        super("""
                A escolha "%s", não é uma das seguintes opções válidas
                -%s
                """.formatted(escolha, String.join("\n-", opcoes)));
    }

    
}
