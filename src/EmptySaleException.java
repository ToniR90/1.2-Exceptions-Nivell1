public class EmptySaleException extends Exception{

    private String message;

    public EmptySaleException(){
        this.message = "First add some items!!";
    }

    public String getMessage(){
        return this.message = message;
    }
}
