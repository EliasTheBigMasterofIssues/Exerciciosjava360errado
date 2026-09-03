public class AlgoritmoDoisME {
    public static void main(String[] args){
        IO.println("Bem vindo ao programa do ninja: ");

        String nome = IO.readln("Digite o seu nome: ");

        int sala = Integer.parseInt(IO.readln("Digite a sua sala: \n"));
        double nota1 = Double.parseDouble(IO.readln("Digite a sua primeira nota: "));
        double nota2 = Double.parseDouble(IO.readln("Digite a sua segunda nota: "));
        double nota3 = Double.parseDouble(IO.readln("Digite a sua terceira nota: "));
        double nota4 = Double.parseDouble(IO.readln("Digite a sua quarta nota: "));

        double media = (nota1+nota2+nota3+nota4) / 4;
        boolean aprovacao = true;
        if (media < 5) {
             aprovacao = false;
        }

        IO.println("\n  Aluno: " + nome + ". " + "\n" + "  Sala: " + sala + ". " + "\n" + "\n   Notas do bimestre: \n" + "     Primeiro bimestre: " + nota1 + "\n" + "     Segundo bimestre: " + nota2 + "\n" + "     Terceiro bimestre: " + nota3 + "\n" + "     Quarto bimestre: " + nota4);
        IO.println("\nMédia final: " + media);
        if (!aprovacao) {
            IO.println("\nResultado final: Reprovado");
        } else {
            IO.println("\nResultado final: Aprovado");
        }
    }

}
