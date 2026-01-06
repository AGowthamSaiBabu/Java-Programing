public class NeonNumber{
    public static void main(String[] args) {
        int number =9;
        int square =number * number;
        int sum =0;

        while(square>0){
            sum +=square%10;
            square =square /10;
        }
        if(sum == number){
            System.out.println(number+"is s NeonNumber");
        }else{
            System.out.println(number+"is not NeonNumber");
        }
    }
}