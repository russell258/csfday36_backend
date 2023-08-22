package sg.edu.nus.iss.csfday36_backend.models;

import java.util.List;

public record Order (String name, String email, Boolean express, List<LineItem> lineItems){
    
}
