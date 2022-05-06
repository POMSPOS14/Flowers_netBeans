package flowers.db;

import flowers.model.Question;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCExecuter {
    public static final String DB_URL = "jdbc:h2:./db/stockExchange";
    public static final String DB_Driver = "org.h2.Driver";

    static void executeUpdate(String command){
        try {
            Class.forName(DB_Driver); //Проверяем наличие db.JDBC драйвера для работы с БД
            Connection connection = DriverManager.getConnection(DB_URL);//соединениесБД
            System.out.println("Соединение с СУБД выполнено.");
            Statement statement = connection.createStatement();
            statement.executeUpdate(command);
            statement.close();
            connection.close();       // отключение от БД
            System.out.println("Отключение от СУБД выполнено.");
        } catch (ClassNotFoundException e) {
            e.printStackTrace(); // обработка ошибки  Class.forName
            System.out.println("db.JDBC драйвер для СУБД не найден!");
        } catch (SQLException e) {
            e.printStackTrace(); // обработка ошибок  DriverManager.getConnection
            System.out.println("Ошибка SQL !");
        }
    }

    static List<Question> executeQuery(String command){
        List<Question> questionList = new ArrayList<>();
        try(Connection connection = DriverManager.getConnection(DB_URL);
            Statement statement = connection.createStatement()) {
            Class.forName(DB_Driver); //Проверяем наличие db.JDBC драйвера для работы с БД
            System.out.println("Соединение с СУБД выполнено.");
            ResultSet resultSet = statement.executeQuery(command);
            while (resultSet.next()) {
                Question question = new Question();
                question.setId(resultSet.getLong("id"));
                question.setFileName(resultSet.getString("file_name"));
                question.setPossibleAnswerOne(resultSet.getString("possible_answer_one"));
                question.setPossibleAnswerTwo(resultSet.getString("possible_answer_two"));
                question.setPossibleAnswerThree(resultSet.getString("possible_answer_three"));
                question.setPossibleAnswerFour(resultSet.getString("possible_answer_four"));
                question.setRealAnswer(resultSet.getString("real_answer"));
                questionList.add(question);
            }
            return questionList;
        } catch (ClassNotFoundException e) {
            e.printStackTrace(); // обработка ошибки  Class.forName
            System.out.println("db.JDBC драйвер для СУБД не найден!");
        } catch (SQLException e) {
            e.printStackTrace(); // обработка ошибок  DriverManager.getConnection
            System.out.println("Ошибка SQL !");
        }
        return null;
    }
    
}
