public class AlgoritmoDezeseis {

    public static void main(String[] args) {

        int i = 0;

       while (i <= 200) {
            String resultado = (i%2==0) ? (""+i) : "";
            System.out.println(resultado);
            i++;
        }

    }
}
