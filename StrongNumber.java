public class StrongNumber{
    public static void main(String[] args) {
        int number =145;
        int origin =number;
        int fact =0;
        int sum =0;

        while(number>0){
            int digit =number%10;
            fact =1;
            for(int i=1;i<=digit;i++){
                fact = fact*i;
            }
            sum =sum +fact;
            number =number/10;

        }
        if(sum == origin){
            System.out.println(origin+"is a Strong number");
        }else{
            System.out.println(origin+"is not a StrongNumber");
        }
    }
}