package com.example.api_cho_android;


import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class DatabaseConfig {
	@Value("mysql://b83174d608b83c:e0e753e0@us-cdbr-east-06.cleardb.net/heroku_fd74ab704ece7be?reconnect=true")
    private String dbUrl;

    @Bean
    public DataSource dataSource() {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl(dbUrl);
        return new HikariDataSource(config);
  }
}