public class SunneyNumber{
  public static void main(String []args){
    int n =8;
    int add =n+1;
    boolean isSunney =false;

    for(int i=0;i<add;i++){
      if(i*i ==add){
        isSunney = true;
        break;
      }
    }
    if(isSunney){
      System.out.println(n+"Sunney number");
    }else{
      System.out.println(n+"Not a Sunney number");
    }
  }
}
