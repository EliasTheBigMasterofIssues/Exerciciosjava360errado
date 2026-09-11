public class AlgoritmoDoze {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(IO.readln("Digite o número desejado: "));
        String resultado = (n1%2==0) ? "Este número é par" : "Este número é impar";
        System.out.println(resultado);
    }
}
