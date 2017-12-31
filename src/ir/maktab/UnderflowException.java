package ir.maktab;

/**
 * Created by Nader on 12/28/2017.
 */
public class UnderflowException extends RuntimeException {
    public UnderflowException() {
        super();
    }
    public UnderflowException(String message){
        super(message);
    }
}
