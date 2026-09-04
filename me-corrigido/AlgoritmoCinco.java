public class AlgoritmoCinco {
    public static void main(String[] args) {

        int numero = Integer.parseInt(IO.readln("\n" + "Digite o número inteiro desejado: "));

        System.out.println("\n Este é o seu número: " + numero + "\n Este é o antecessor dele: " + (numero-1) + "\n Este é o sucessor do seu número: " + (numero+1) + "\n");

    }
}
