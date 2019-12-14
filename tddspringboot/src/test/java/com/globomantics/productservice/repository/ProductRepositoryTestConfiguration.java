package com.globomantics.productservice.repository;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.testcontainers.containers.PostgreSQLContainer;

import javax.sql.DataSource;

import java.sql.SQLException;

import static com.globomantics.productservice.TestingSqlQueries.CREATE_TABLE;

@Configuration
@Profile("test")
public class ProductRepositoryTestConfiguration {

    @Bean
    @Primary
    public PostgreSQLContainer postgresqlContainer() {
        PostgreSQLContainer postgreSQLContainer = new PostgreSQLContainer("postgres:11.5");
        postgreSQLContainer.start();
        return postgreSQLContainer;
    }

    @Bean
    @Primary
    public DataSource postgresqlContainerDataSource(final PostgreSQLContainer postgreSQLContainer) throws SQLException {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl(postgreSQLContainer.getJdbcUrl());
        dataSource.setUsername(postgreSQLContainer.getUsername());
        dataSource.setPassword(postgreSQLContainer.getPassword());
        dataSource.setDriverClassName(postgreSQLContainer.getDriverClassName());
        return dataSource;
    }
}
