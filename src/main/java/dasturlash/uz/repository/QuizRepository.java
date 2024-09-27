package dasturlash.uz.repository;

import dasturlash.uz.dto.Word;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class QuizRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int add (Word word) {
        String sql = "INSERT INTO words(engWord,uzbWord) VALUES (?, ?)";
        return jdbcTemplate.update(sql,
                                  word.getEngWord(),
                                  word.getUzbWord());

    }

    public void createTable(){
        String sql = "create table if not exists words ("+
                "id serial primary key,"+
                "engWord varchar (20),"+
                "uzbWord varchar(30));";
        jdbcTemplate.update(sql);
    }
}
