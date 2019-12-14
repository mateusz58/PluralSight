package com.globomantics.productservice.mapper;

import com.globomantics.productservice.model.Product;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

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
