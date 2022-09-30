package vttp2022.assessment.csf.orderbackend.repositories;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import vttp2022.assessment.csf.orderbackend.models.Order;

@Repository
public class OrderRepository {
    private static final String SQL_GET_ORDERS_BY_EMAIL = "select order_id, title from pizzafactory order by email?";

    @Autowired
    private JdbcTemplate template;

    public Optional<Object> getOrderByEmail(String email) {
        SqlRowSet rs = template.queryForRowSet(SQL_GET_ORDERS_BY_EMAIL, email);
        if (rs.next())
        return Optional.of(Order.create(rs));
    return Optional.empty();
    }

    public Optional<Integer> newOrder(Order order) {
        return null;
    }

}
