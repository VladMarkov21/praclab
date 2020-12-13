package nomber_1;

public class Exception1 {
    public void exeptionDemo(){
        try{
            System.out.println(2 / 0);
        }catch (ArithmeticException ex){
            System.err.println(ex.getMessage());
        }

    }
}
