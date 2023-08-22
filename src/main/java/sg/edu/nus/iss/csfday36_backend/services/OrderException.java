package sg.edu.nus.iss.csfday36_backend.services;

public class OrderException extends Exception {
    public OrderException(){}

    public OrderException(String msg){
        super(msg);
    }
}
