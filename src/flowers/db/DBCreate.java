package flowers.db;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DBCreate {

    public static void dropTable() {
        String sql = "drop TABLE IF EXISTS question";
        JDBCExecuter.executeUpdate(sql);
    }
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

    public static void filingDB(){
        Random randomGenerator = new Random();

        try (Stream<Path> paths = Files.walk(Paths.get("image"))) {
            List<String> collect = paths
                    .filter(Files::isRegularFile)
                    .map(Path::getFileName)
                    .map(Path::toString)
                    .collect(Collectors.toList());

            for (String s : collect) {

                String file = s;
                List<String> question = new ArrayList<>();
                while (question.size()<4){
                    int i = randomGenerator.nextInt(collect.size());
                    String flower = collect.get(i);
                    if (!flower.equals(s) && !question.contains(flower)){
                        question.add(flower);
                    }
                }
                question.set(randomGenerator.nextInt(question.size()),s);
                String sql = "INSERT INTO question " + "VALUES (default, '"+s+"', '"+question.get(0).split("\\.")[0]+"', '"+question.get(1).split("\\.")[0]+"', '"+question.get(2).split("\\.")[0]+"', '"+question.get(3).split("\\.")[0]+"', '"+s.split("\\.")[0]+"')";
                JDBCExecuter.executeUpdate(sql);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
