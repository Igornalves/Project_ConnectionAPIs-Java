package Class;

public class Metheds {

    // criando funcoes / metodos para funcionar em outros arquivos
    public String CoisasAleatorias(){
        return "ola mundo, java tava de friscura !!!!";
    }

    public void RestoDivisao(int numero) {
        int resultado;

        resultado = numero % 2;

        boolean verificacao = resultado == 0;

        if(verificacao){
            System.out.println("o Seu resultado é " + verificacao + " " + numero);;
        } else {
            System.out.println("o seu resultado é " + verificacao + " " + numero);
        }
    }
}
