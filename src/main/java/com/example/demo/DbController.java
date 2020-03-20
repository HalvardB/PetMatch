package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@RestController
public class DbController {

//    @Autowired
//    DataSource dataSource;
//
//    @GetMapping("/user-agent")
//    public String userAgent(HttpServletRequest request) {
//        return request.getHeader("User-Agent");
//    }
//
//    @GetMapping("/db")
//    public String dbVersion() throws SQLException {
//        Statement statement = dataSource.getConnection().createStatement();
//        ResultSet resultSet = statement.executeQuery("select version();");
//        if (resultSet.next()) {
//            return resultSet.getString(1);
//        }
//        return null;
//    }
}
