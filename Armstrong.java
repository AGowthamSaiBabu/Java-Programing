// 1. Using while loop — Your method

// public class Armstrong {
//     public static void main(String[] args) {
//         int num =153;
//         int origin =num;
//         int result =0;

//         while(num!=0){
//             int digit = num%10;
//             result = result+digit*digit*digit;
//              num = num /10;
//         }
//         if(result ==origin){
//             System.out.println(origin+"is a Armstrong");
//         }else{
//             System.out.println(origin+"is not Armstrong");
//         }

//     }
// }

// 2. Using for loop

// public class Armstrong {
//     public static void main(String[] args) {
//         int num =153;
//         int origin = num;
//         int result =0;

//         for(;num!=0;num =num/10){
//             int digit =num%10;
//             result =result+digit*digit*digit;
//         }
//         if(result == origin){
//             System.out.println(origin + " is an Armstrong number");
//         }else{
//             System.out.println(origin+" is not Armstrong number");
//         }
//     }
// }

// 3. Using a method

// public class Armstrong {
// public static boolean isArmstrong(int num){
//     int origin =num;
//     int result =0;
//     while(num !=0){
//         int digit =num%10;
//         result =result+digit*digit*digit;
//         num =num /10;
//     }
//     return origin ==result;
// }
//     public static void main(String[] args) {
//         int num =153;
//         if(isArmstrong(num)){
//             System.out.println("is Armstron number");
//         }else{
//             System.out.println("is not Armstron number");
//         }

//     }
// }

// 4. Using Math.pow()
public class Armstrong {
    public static void main(String[] args) {
        int num =153;
        int origin = num;
        int result =0;
        
        while(num !=0){
            int digit =num%10;
            result +=(int)Math.pow(digit,3);
            num =num / 10;
        }
        if(origin == result){
            System.out.println("is a Armstrong");
        }else{
            System.out.println("is not a Armstrong");
        }
    }
}