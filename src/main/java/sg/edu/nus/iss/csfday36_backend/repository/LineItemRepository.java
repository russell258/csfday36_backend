package sg.edu.nus.iss.csfday36_backend.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import sg.edu.nus.iss.csfday36_backend.Utils;
import sg.edu.nus.iss.csfday36_backend.models.LineItem;

@Repository
public class LineItemRepository {
    
    @Autowired
    private JdbcTemplate template;

    public void insertLineItem(String orderId, LineItem lineItem){
        template.update(Utils.SQL_INSERT_LINEITEM, orderId, lineItem.name(),lineItem.quantity(), lineItem.unitPrice());
    }

}
