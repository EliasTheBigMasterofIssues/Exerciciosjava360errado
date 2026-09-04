public class AlgoritmoQuatro {
    public static void main(String[] args) {
        int diaDaSemana = 3;
        String nomeDoDia;
        boolean mode = true;

        if (mode) {
            switch (diaDaSemana) {
                case 1:
                    nomeDoDia = "Segunda-Feira";
                    break;
                case 2:
                    nomeDoDia = "Terca-Feira";
                    break;
                case 3:
                    nomeDoDia = "Quarta-Feira";
                    break;
                default:
                    nomeDoDia = "Dia inválido";
            }

            System.out.println(nomeDoDia);

        } else {
            switch(diaDaSemana) {
                case 1 -> System.out.println("Segunda-Feira");
                case 2 -> System.out.println("Terça-Feira");
                case 3 -> System.out.println("Quarta-Feira");
                default -> System.out.println("Dia inválido");
            }
        }
    }

}
