public class LeastOneEvenDigitRange {
    public static void main(String[] args) {
        int Firstnumber =20;
        int LastNumber =30;

        for(int i =Firstnumber;i<LastNumber;i++){
           int number =i;
           boolean isEven =false;

           while(number>0){
            int digit =number%10;

            if(digit%2==0){
                isEven =true;
                break;
            }
            number = number / 10;
           }
           if(isEven){
            System.out.print(i +" , ");
           }
        }

    }
}
