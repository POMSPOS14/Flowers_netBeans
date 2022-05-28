package flowers.db;

import flowers.model.Question;

import java.util.List;

public class QuestionRepository {

    public QuestionRepository() {
    }

    /**
     * Запрос вопроса по идентификатору.
     */
    public Question getQuestionById(Long id) {
        String sql = "SELECT * FROM question WHERE id = '" + id + "'";
        Question question = JDBCExecuter.executeQuery(sql).get(0);
        return question;
    }

    /**
     * Запрос всех вопросов.
     */
    public List<Question> getAllQuestion() {
        String sql = "SELECT * FROM question";
        List<Question> question = JDBCExecuter.executeQuery(sql);
        return question;
    }

    /**
     * Запрос количества всех вопросов.
     */
    public Integer getCountAllQuestion() {
        String sql = "SELECT COUNT(*) FROM question";
        return JDBCExecuter.executeCount(sql);
    }

}
