import java.util.List;

public class AlgoritmoVinte {
    public static void main(String[] args) {
        List<String> cupons = List.of("PROMO10", "PROMO20", "PROMO30", "FRETEGRATIS", "PIX5");
        System.out.println("Este são os cupons de compra");
        cupons.forEach(n -> System.out.println("\n " +n));
    }
}
