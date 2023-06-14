

class CE1 extends RuntimeException{
    CE1(String s){
      super(s);
    }
}
public class exception {
    public static void main(String[] args) {
        int x;
        try{
           x= 10;
           if(x==10)    throw new CE1("This is our customized Exception");
            System.out.println(x);
        }catch(RuntimeException e){
           System.out.println(e.getMessage());
        }

    }



}