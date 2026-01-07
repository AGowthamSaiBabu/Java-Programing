public class palindromeNumber {
public static void main(String[] args) {
    int number =12321;
    int temp =number;
    int rev =0;

    while(number!=0){
        int digit =number%10;
        rev =(rev*10)+digit;
        number =number /10;
    }
    if(temp==rev){
        System.out.println(temp+": is a palindromeNumber");
    }else{
        System.out.println(temp+": is not a palindromeNumber");
    }
}
}