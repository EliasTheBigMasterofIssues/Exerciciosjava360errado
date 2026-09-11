public class AlgoritmoQuatorze {
    public static void main(String[] args) {
        while (true) {
            int opcao = Integer.parseInt(IO.readln("Digite o número: "));
            String resultado = switch(opcao) {
                case 1 -> "jogo iniciado";
                case 2 -> "suas vidas estão acabando";
                case 3 -> "game over";
                default -> "Você é maluco?";
            };
            System.out.println(resultado);
            if (opcao == 3) {
            break;
            }
        }
    }
}
