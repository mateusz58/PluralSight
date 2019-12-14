package com.globomantics.productservice.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.globomantics.productservice.model.Product;
import org.springframework.jdbc.core.RowMapper;


public class ProductRowMapper implements RowMapper<Product> {

    @Override
    public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
        return Product
            .builder()
            .id(rs.getInt("ID"))
            .name(rs.getString("name"))
            .quantity(rs.getInt("quantity"))
            .version(rs.getInt("version"))
            .build();
    }
}
