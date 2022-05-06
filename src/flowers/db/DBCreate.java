package flowers.db;

public class DBCreate {

    public static void createTable() {
        String sql = "CREATE TABLE question" +
                "(id BIGINT AUTO_INCREMENT PRIMARY KEY, " +
                " file_name VARCHAR(255), " +
                " possible_answer_one VARCHAR(255), " +
                " possible_answer_two VARCHAR(255), " +
                " possible_answer_three VARCHAR(255), " +
                " possible_answer_four VARCHAR(255), " +
                " real_answer VARCHAR(255))";
        JDBCExecuter.executeUpdate(sql);
    }

    public static void createQuestion1() {
        String sql = "INSERT INTO question " + "VALUES (default, 'альстромерия.jpg', 'Ирис', 'Альстромерия', 'Фрезия', 'Нарцисс', 'Альстромерия')";
        JDBCExecuter.executeUpdate(sql);
    }

    public static void createQuestion2() {
        String sql = "INSERT INTO question " + "VALUES (default, 'анемон.jpg', 'Фрезия', 'Альстромерия', 'Анемон', 'Нарцисс', 'Анемон')";
        JDBCExecuter.executeUpdate(sql);
    }

}
