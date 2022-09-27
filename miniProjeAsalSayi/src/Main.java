public class Main {

    public static void main(String[] args) {
	    int number = -1;
        int reminder = number%2;
        System.out.println(reminder);
        boolean isPrime = true;

        if(number==1){
            System.out.println("Asal sayı değildir");
            return;
        }

        if( number < 1){
            System.out.println("Geçersiz sayı.");
            return;
        }
        for(int i = 2 ; i<number ; i++){
            if(number % i == 0){
                isPrime = false;
            }
        }
        if(isPrime){
            System.out.println(number + " : Asal sayıdır");
        }else{
            System.out.println(number + " : Asal sayı değildir");
        }
    }
}
