public class Armstrong {
    public static void main(String[] args) {
        int num =153;
        int origin =num;
        int result =0;

        while(num!=0){
            int digit = num%10;
            result = result+digit*digit*digit;
             num = num /10;
        }
        if(result ==origin){
            System.out.println(origin+"is a Armstrong");
        }else{
            System.out.println(origin+"is not Armstrong");
        }

    }
}