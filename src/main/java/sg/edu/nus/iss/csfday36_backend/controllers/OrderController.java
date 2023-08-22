package sg.edu.nus.iss.csfday36_backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import sg.edu.nus.iss.csfday36_backend.Utils;
import sg.edu.nus.iss.csfday36_backend.models.Order;
import sg.edu.nus.iss.csfday36_backend.services.OrderService;

@Controller
@RequestMapping(path="/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class OrderController {
    
    @Autowired
    private OrderService orderSvc;

    @PostMapping(path="/order")
    @ResponseBody
    public ResponseEntity<String> postOrder(@RequestBody String payload){

        Order order = Utils.toOrder(Utils.toJsonObject(payload));
        System.out.printf(">>>> order: %s\n", order);

    }

}
