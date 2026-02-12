public class HarshadNumber {
    public static void main(String[] args) {
        int num = 18;
        int origin =num;
        int sum =0;

        while(num>0){
            int digit =num%10;
            sum =sum+digit;
            num =num /10;
        }
        if(origin%sum==0){
            System.out.println(origin +": is a HarshadNumber");
        }else{
            System.out.println(origin+": is not a HarshadNumber");
        }
    }
}