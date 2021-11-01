package Exception;

public class ZbrojManjiOdDesetException extends Exception 
{
    public ZbrojManjiOdDesetException(String msg) 
    {
        super(msg); // konstruktor od super klase odnosno od parnet clase u ovom slučaju od Exception a exception nasljeđuje od Throwable klase
    }    
}
