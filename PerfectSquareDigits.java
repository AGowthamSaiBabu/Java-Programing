public class PerfectSquareDigits {
    public static void main(String[] args) {
        int number = 9845061;
        int origin = number;
        boolean isPerfectSquareDigits =true;

        while(number<0){
            int digit =number%10;

            if(digit == 0 || digit == 1 || digit == 4 || digit == 9){
                isPerfectSquareDigits = false;
                break;
            }
            origin = origin /10;
        }
        if(isPerfectSquareDigits){
            System.out.println(number + ": is a PerfectSquareDigits number");
        }else{
            System.out.println(number + "Not a PerfectSquareDigits number");
        }
    }
}
