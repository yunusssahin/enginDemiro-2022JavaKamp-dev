public class Main {

    public static void main(String[] args) {
        int number = 8128;
        int sum = 0;
        for(int i = 1; i < number; i++){
            if(number % i == 0){
                sum = sum +i;
            }
        }
        if(sum == number){
            System.out.println(number + " : sayısı bir mükemmel sayıdır.");
        }else{
            System.out.println(number + " : sayısı bir mükemmel sayı değildir.");
        }
    }
}
