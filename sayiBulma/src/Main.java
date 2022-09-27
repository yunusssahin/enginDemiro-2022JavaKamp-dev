public class Main {

    public static void main(String[] args) {
        int[] sayilar = new int[] {1,2,5,7,9};
        int aranacak = 2;

        for(int i = sayilar[0] ; i < sayilar.length ; i++){
            if(sayilar[i] % aranacak == 0){
                System.out.println(aranacak + " : sayısı sayilar dizisinin içinde bulunmaktadır.");
                return;
            }
        }
        System.out.println(aranacak + " : sayısı sayilar dizisinin içinde bulunmamaktadır.");
    }
}
