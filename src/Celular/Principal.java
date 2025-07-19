public class Principal {

    public static void main(String[] args) {
        
        // Construtor --> <Tipo da variavel> <nome da variavel> = new <Tipo da variavel>();
        // O construtor serve para instanciar um objeto da classe Celular
        
        Celular celular1 = new Celular();

        // Objeto --> <Tipo da variavel> <nome da variavel> = valor;
        celular1.nome = "Iphone 12";
        celular1.tamanhoTela = 6.1f;
        celular1.espacoArmazenamento = 256;
        celular1.sistemaOperacional = "iOS";

        // Exibindo os valores dos atributos do objeto celular
        System.out.format("Celular %s com tela de %f, com %dgb e SO %s", celular1.nome, celular1.tamanhoTela, celular1.espacoArmazenamento, celular1.sistemaOperacional);



    }

}