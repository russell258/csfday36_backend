package sg.edu.nus.iss.csfday36_backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sg.edu.nus.iss.csfday36_backend.models.Order;
import sg.edu.nus.iss.csfday36_backend.repository.LineItemRepository;
import sg.edu.nus.iss.csfday36_backend.repository.OrdersRepository;

@Service
public class OrderService {
    
    @Autowired
    private OrdersRepository orderRepo;

    @Autowired
    private LineItemRepository lineItemRepo;

    public String insertNewOrder(Order order){
        
    }

}
