package Poo;
public class Main {

    public static void main(String[] args) {
        
        // Criador de objeto usando construtor padrao

        // Criador de objeto usando construtor com parametro
        var p1 = new Pessoa("Luiz","0001",33,'m',"0190191872");

        // Objetos com valores
        p1.setNome("Luiz");
        p1.setCpf("000");
        p1.setIdade(30);
        p1.setSexo('m');
        p1.setWhatsapp("91827399283");

        /**
        // Impressao dos objetos com valores
        System.out.printf("Meu nome é: %s\n", p1.getNome());
        System.out.format("Meu cpf é: %s\n", p1.getCpf());
        System.out.format("Minha idade é: %s \n", p1.getIdade());
        System.out.format("Meu sexo é: %c \n ",p1.getSexo());
        System.out.format("Meu whatsapp é: %s \n", p1.getWhatsapp());
        */

        // Criei o objeto com o metodo de acao
        p1.apresentar();
        

    }
}
