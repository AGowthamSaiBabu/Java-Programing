public class NeonNumber {
    public static void main(String[] args) {
        int num =9;
        int square = num * num;
        int digit =0;
        while(square>0){
            digit +=square%10;
            square = square /10;
        }
        if(digit == num){
            System.out.println(num+"is a NeonNumber");
        }else{
            System.out.println(num+"not a neon number");
        }
    }
}