package com.spring.Jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Program Started" );
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/Jdbc/config.xml");
        JdbcTemplate template = (JdbcTemplate) context.getBean("jdbcTemplate",JdbcTemplate.class);
        
        
        //insert
        String query = "insert into student(id,name,city) values(?,?,?)";
        
        //fire query
       int result = template.update(query,456,"Azam pasha","Koppal");
        System.out.println("number of record inserted.."+result);
    }
}
