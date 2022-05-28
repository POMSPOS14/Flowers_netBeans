package flowers.db;

import flowers.model.Question;

import java.util.List;

public class QuestionRepository {

    public QuestionRepository() {
    }

    public Question getQuestionById(Long id) {
        String sql = "SELECT * FROM question WHERE id = '" + id + "'";
        Question question = JDBCExecuter.executeQuery(sql).get(0);
        return question;
    }

    public List<Question> getAllQuestion() {
        String sql = "SELECT * FROM question";
        List<Question> question = JDBCExecuter.executeQuery(sql);
        return question;
    }

    public Integer getCountAllQuestion() {
        String sql = "SELECT COUNT(*) FROM question";
        return JDBCExecuter.executeCount(sql);
    }

}
