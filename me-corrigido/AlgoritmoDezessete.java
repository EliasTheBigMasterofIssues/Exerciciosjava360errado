public class AlgoritmoDezesseis {

    public static void main(String[] args) {

      int i = 0;
       do {
            String resultado = (i%2==0) ? (""+i) : "";
            System.out.println(resultado);
            i++;
        } while (i <= 200);

    }
}
