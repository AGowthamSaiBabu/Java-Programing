public class PrimeDigite {
    public static void main(String[] args) {
        int number =984567;

        while(number>0){
            int digit =number%10;

            if(digit == 2 || digit ==3 || digit == 5 || digit ==7){
                System.out.println(digit+"is a prime number");
            }else{
                System.out.println(digit+"is not a prime number");
            }
            number = number / 10;
        }
    }
}
