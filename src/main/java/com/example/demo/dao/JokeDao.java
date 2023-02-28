package com.example.demo.dao;



import com.example.demo.domain.Joke;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * User: 59157
 * Date: 2020/12/8
 * Time: 14:52
 */
@Repository
public class JokeDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void save(Joke joke) {

        jdbcTemplate.update("insert into joke values(?,?,?,?,?)",
                joke.getId(),joke.getText(),joke.getTitle(),joke.getType(),joke.getCt());
    }

}


