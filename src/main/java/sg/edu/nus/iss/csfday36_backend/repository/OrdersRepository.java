package sg.edu.nus.iss.csfday36_backend.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import sg.edu.nus.iss.csfday36_backend.Utils;
import sg.edu.nus.iss.csfday36_backend.models.Order;

@Repository
public class OrdersRepository {
    
    @Autowired
    private JdbcTemplate template;

    private void createOrder(String orderId, Order order){
        // throws unchecked exception - DataAccessException

        template.update(Utils.SQL_INSERT_ORDER, orderId, order.name(), order.email(), order.express());

    }

}
