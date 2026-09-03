public class AlgoritmoDois {

    void main() {
        IO.println("Seja bem vindo ao portal java 360");
        String usuario = IO.readln("Qual o seu nome");
        IO.println("Ola, " + usuario + "!Bem-vindo ao portal do Java.");
        int estrelas = 0;

        IO.println("Quem criou o Java?");
        IO.println("1 - Bill Gates");
        IO.println("2 - James Gosling");
        IO.println("3 - Steve Jobs");

        int resp = Integer.parseInt(IO.readln("Digite um número"));

        if (resp == 2){
            IO.println("Parabéns, você acertou!");
            estrelas = estrelas + 1;
        } else {
            IO.println("Você errou!");
        }
        IO.println("Você obteve" + estrelas + "estrelas. ");
    }


}
