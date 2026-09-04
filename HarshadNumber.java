// public class HarshadNumber {
//     public static void main(String[] args) {
//         int num = 18;
//         int origin =num;
//         int sum =0;

//         while(num>0){
//             int digit =num%10;
//             sum =sum+digit;
//             num =num /10;
//         }
//         if(origin%sum==0){
//             System.out.println(origin +": is a HarshadNumber");
//         }else{
//             System.out.println(origin+": is not a HarshadNumber");
//         }
//     }
// }

// Using a method

public class HarshadNumber {

    public static boolean isHarshadNumber(int number){
        int origin  = number;
        int sum =0;

        while(number!=0){
            int digit =number%10;
            sum =sum+digit;
            number = number / 10;
        }
        return origin % sum==0;
    }
    public static void main(String[] args) {
        int number =18;

        if(isHarshadNumber(number)){
            System.out.println("is a HarshadNumber");
        }else{
            System.out.println("is not HarshadNumber");
        }

    }
}