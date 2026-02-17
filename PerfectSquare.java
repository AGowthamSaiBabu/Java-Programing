public class PerfectSquare {
    public static void main(String[] args) {
        int number =10;
        boolean isPerfect =false;

        for(int i=1;i<=number;i++){
            if(i*i==number){
                isPerfect=true;
                break;
            }
        }
        if(isPerfect){
            System.out.println(number+" is a perfect Square");
        }else{
            System.out.println(number+" is not a perfect square");
        }
    }
}
