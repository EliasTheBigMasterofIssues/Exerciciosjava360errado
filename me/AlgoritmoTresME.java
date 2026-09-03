public class AlgoritmoTresME {
    public static void main(String[] args){

                IO.println("Olá, bem vindo ao programa ninja 2.0");

                String nome = IO.readln("\n    Digite o seu nome: ");

                int idade = Integer.parseInt(IO.readln("    Digite a sua idade: "));

                boolean entrada = false;

                if (idade >= 6 && idade <= 13) {

                    IO.println("\n Entrada não permitida. Você é uma criança");

                }
                else if (idade > 13 && idade < 18) {

                    IO.println("\n Entrada não permitida. Você é um adolescente");

                }
                else if (idade >= 18 && idade <= 100) {

                    IO.println("\n Entrada permitida. Você é um adulto");
                    entrada = true;

                }
                else {

                    IO.println("\n Idade inválida. Ou você é um vampiro? ");

                }

                if (entrada) {

                    IO.println("\nSua entrada foi permitida");
                    IO.println("Antes da entrada ao clube ser permitida, responda: ");

                    IO.println("\nEscolha entre as 3 opções" + "\nQuem está no controle?: \n" + "\n 1: Sol" + "\n 2: Lua" + "\n 3: Venus" + "\n 4: Saturno");
                    int escolha = Integer.parseInt(IO.readln("\nResponda com cuidado: \n"));

                    String resultado = switch(escolha) {
                        case 1 -> "Saia daqui apoliano, você não é bem-vindo aqui";
                        case 2 -> "Suma daqui sua(eu) bruxa(o)!";
                        case 3 -> "Largue a pornografia! Você não é bem vindo aqui";
                        case 4 -> "Acertou miseravi!";
                        default -> "Maluco?";
                    };

                    IO.println(resultado);

                    if (escolha == 4)  {
                        IO.println("Bem vindo ao clube dos esquizofrenicos");
                    }

    }
}
}
