// public class  LastDigistNumber {
//     public static void main(String[] args) {
//         int number = 5729;
//         int lastDigit =0;

//         while(number>0){
//             int digit =number%10;
//             if(digit>lastDigit){
//              lastDigit = digit;
//             }
//             number = number / 10;
//         }
//         System.out.println(" LastDigistNumber :"+lastDigit);
//     }
// }

// Using String

// public class  LastDigistNumber {
//     public static void main(String[] args) {
//         int number = 5729;
//         String str = String.valueOf(number);
//         int LastDigistNumber =0;

//         for(int i =0;i<str.length();i++){
//             int digit =str.charAt(i)-'0';

//             if(digit>LastDigistNumber){
//                 LastDigistNumber =digit;
//             }
//         }
//         System.out.println("LastDigistNumber :"+LastDigistNumber);
//     }
// }

// 2. Without String, using % 10 — your method

public class  LastDigistNumber {
    public static void main(String[] args) {
        int number = 5729;
        int LastDigistNumber =0;

        while(number>0){
            int digit = number%10;
            LastDigistNumber = Math.max(LastDigistNumber,digit);
            number =number/ 10;
        }
        System.out.println("LastDigistNumber : "+LastDigistNumber);
    }
}