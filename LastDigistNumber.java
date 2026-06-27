public class  LastDigistNumber {
    public static void main(String[] args) {
        int number = 5729;
        int lastDigit =0;

        while(number>0){
            int digit =number%10;
            if(digit>lastDigit){
             lastDigit = digit;
            }
            number = number / 10;
        }
        System.out.println(" LastDigistNumber :"+lastDigit);
    }
}