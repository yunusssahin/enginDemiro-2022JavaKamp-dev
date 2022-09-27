import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String harf = "a";
        String harfSon = harf.toUpperCase();

        switch(harfSon){
            case "A":
            case "I":
            case "U":
            case "O":
                System.out.println("Kalın sesli harf");
                break;
            case "E":
            case "İ":
            case "Ü":
            case "Ö":
                System.out.println("İnce sesli harf");
                break;
            default:
                System.out.println("Lütfen sesli bir harf giriniz.");
        }
    }
}
