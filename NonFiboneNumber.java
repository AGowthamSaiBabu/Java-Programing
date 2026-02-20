public class NonFiboneNumber {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        
        for(int i=0;i<8;i++){
            int c =a+b;
            for(int j=b+1;j<c;j++){
                System.out.print(j+" ");
            }
            System.out.println();
            a=b;
            b=c;
        }
    }
}
