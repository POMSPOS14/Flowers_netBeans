/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package flowers;

import flowers.db.QuestionRepository;
import flowers.model.Answer;
import flowers.model.Question;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author pomah
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() throws IOException {
        initComponents();
    }

    /**
     * Конструктор для создания формы с определённым количеством вопросов.
     */
    public GUI(Integer questionSize) throws IOException {
        this.questionSize = questionSize;
        initComponents();
    }

    /**
     * Генерация формы и базовой логики приложения.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() throws IOException {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        answerList = new ArrayList<>();

        /**
         * Инициализация начальных данных.
         */
        questionNumber = 1;
        QuestionRepository questionRepository = new QuestionRepository();
        questionList = questionRepository.getAllQuestion();
        Collections.shuffle(questionList);
        if(questionSize == null){
            questionSize = questionList.size();
        }

        Question question = questionList.get(0);

        /**
         * Добавление картинки.
         */
        BufferedImage myPicture = ImageIO.read(new File("image/"+question.getFileName()));
        JLabel picLabel = new JLabel(new ImageIcon(myPicture));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(new FlowLayout());
        jPanel1.add(picLabel);
        jPanel1.setPreferredSize(new Dimension(400,300));

        /**
         * Установка layout для базовой панели.
         */
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 352, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 313, Short.MAX_VALUE)
        );
        jButton1.setText(question.getPossibleAnswerOne());

        /**
         * Добавление действий вызываемых при нажатии кнопок.
         */
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
                timer(evt);
            }
        });

        jButton2.setText(question.getPossibleAnswerTwo());
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
                timer(evt);
            }
        });

        jButton3.setText(question.getPossibleAnswerThree());
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
                timer(evt);
            }
        });

        jButton4.setText(question.getPossibleAnswerFour());
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
                timer(evt);
            }
        });

        /**
         * Сгенерировваные layout для кнопок.
         */
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72))
        );

        /**
         * Установка номера вопроса к количеству вопросов.
         */
        jLabel1.setText(questionNumber + "/"+ questionSize);

        /**
         * Добавление действий вызываемых при нажатии пунктов меню.
         */
        jLabel2.setText("");

        jMenu1.setText("Menu");

        jMenuItem1.setText("New game");
        jMenuItem2.setText("Go menu");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGameStart(evt);
            }
        });
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goMenu(evt);
            }
        });
        jMenu1.add(jMenuItem2);
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        /**
         * Сгенерировваные layout для кнопок.
         */
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Действия выполняемые посде нажатия на кнопки.
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        JButton source = (JButton) evt.getSource();
        nextQuestion(source.getText());
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JButton source = (JButton) evt.getSource();
        nextQuestion(source.getText());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JButton source = (JButton) evt.getSource();
        nextQuestion(source.getText());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        JButton source = (JButton) evt.getSource();
        nextQuestion(source.getText());
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * Установка таймера.
     */
    Timer timer = new Timer(1000, null);
    int i = 0;

    /**
     * Функция установки нового таймера после нажатия на кнопку ответа.
     */
    private void timer(java.awt.event.ActionEvent evt) {
        if(timer.isRunning()) {
            timer.stop();
        }
        i = timeToAnswer;
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                i--;
                if(i > 0){
                    jLabel2.setText(""+ i);
                } else {
                    timer.stop();
                    endDialog(evt);
                }
            }
        });

        if(questionNumber <= questionSize){
            timer.start();
        }
    }

    /**
     * Вызов диалога конца игры.
     */
    private void endDialog(ActionEvent evt) {
        int dialogResult = JOptionPane.showOptionDialog(jPanel1,
                "Game end",
                "Game over",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.ERROR_MESSAGE,
                null,
                new String[]{"New game", "Show answer"},
                "Show answer");
        if (dialogResult == 0){
            newGameStart(evt);
        } else if (dialogResult == -1 ){
            newGameStart(evt);
        } else if (dialogResult == 1){
            ShouAnswerDialog shouAnswerDialog = new ShouAnswerDialog(answerList, super.getBounds());
            shouAnswerDialog.setVisible(true);
        }
    }

    /**
     * Функция перехода на следующий вопрос при нажатии на кнопку.
     * Проверяет количество данных ответов и в зависимости от этого выполняет действия.
     * Также собирает ответы игрока в список.
     */
    private void nextQuestion(String answerNow) {
        if (questionNumber<questionSize){

            /**
             * Добавление ответа в список ответов.
             */
            addedToAnswerList(answerNow);
            questionNumber++;
            Question questionNext = questionList.get(questionNumber-1);

            /**
             * Установка картинки в форму.
             */
            BufferedImage myPicture = null;
            try {
                myPicture = ImageIO.read(new File("image/"+questionNext.getFileName()));
            } catch (IOException e) {
                throw new RuntimeException("Файл не найден");
            }
            JLabel picLabel = new JLabel(new ImageIcon(myPicture));

            /**
             * Установка вариантов ответа в кнопки.
             */
            jButton1.setText(questionNext.getPossibleAnswerOne());
            jButton2.setText(questionNext.getPossibleAnswerTwo());
            jButton3.setText(questionNext.getPossibleAnswerThree());
            jButton4.setText(questionNext.getPossibleAnswerFour());

            /**
             * Удаление старой картинки и добавление новой.
             */
            jPanel1.removeAll();
            jPanel1.add(picLabel);
            jLabel1.setText(questionNumber + "/"+ questionSize);
        } else if (questionNumber == questionSize){
            addedToAnswerList(answerNow);
            timer.stop();
            endDialog(null);
        }
    }

    /**
     * Добавляет ответ игрока в список ответов.
     */
    private void addedToAnswerList(String answerNow) {
        Question question = questionList.get(questionNumber-1);
        Answer answer = new Answer();
        answer.setAnswer(answerNow);
        answer.setRealAnswer(question.getRealAnswer());
        answer.setFileName(question.getFileName());
        answer.setCorrectAnswer(answerNow.equals(question.getRealAnswer()));
        answerList.add(answer);
    }

    /**
     * Стартует новую игру.
     */
    private void newGameStart(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        try {
            super.setVisible(false);
            new GUI(questionSize).setVisible(true);
        } catch (IOException e) {
            throw new RuntimeException("Error new game");
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * Выходит в меню.
     */
    private void goMenu(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        super.setVisible(false);
        new Menu().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new GUI().setVisible(true);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private List<Question> questionList;
    private Integer questionNumber;
    private Integer questionSize;
    // End of variables declaration//GEN-END:variables
    private Integer timeToAnswer = 30;

    private List<Answer> answerList;

    /**
     * Класс кастомного диалога в конце игры.
     * Выдаёт все ответы игрока и показывает картинку котора была в вопросе.
     */
    static class ShouAnswerDialog extends JDialog{

        public ShouAnswerDialog(List<Answer> answerList, Rectangle rectangle) {
            super.setLayout(new GridLayout(2,1));
            int i = 1;

            /**
             * Установка layout для панели 1.
             */
            JPanel panel1 = new JPanel(new GridLayout(3,1));
            JPanel panel1In = new JPanel(new FlowLayout());

            JLabel youAnswer = new JLabel("");
            JLabel correctAnswer = new JLabel("");

            /**
             * Установка шрифта для показа ответа который выводися игроку.
             */
            correctAnswer.setFont(correctAnswer.getFont().deriveFont(15f));
            youAnswer.setFont(youAnswer.getFont().deriveFont(15f));

            /**
             * Установка layout для панели 2.
             */
            JPanel panel2 = new JPanel(new FlowLayout());

            /**
             * Для каждого ответа создаёт кнопу и помещает её в форму конца игры.
             */
            for (Answer answer : answerList) {
                JButton jButton = new JButton("Question-" + i);
                if (answer.getCorrectAnswer()){
                    jButton.setBackground(Color.GREEN);
                }else {
                    jButton.setBackground(Color.RED);
                }
                jButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        /**
                         * Установка картинки в форму.
                         */
                        BufferedImage myPicture = null;
                        try {
                            myPicture = ImageIO.read(new File("image/"+answer.getFileName()));
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        }
                        JLabel picLabel = new JLabel(new ImageIcon(myPicture));
                        picLabel.setPreferredSize(new Dimension(rectangle.width-50,rectangle.height/2-50));

                        /**
                         * Установка ответа который выводися игрок.
                         */
                        String youAnswerDescription = "You answer: " + answer.getAnswer();
                        String correctAnswerDescription = "Correct answer: " + answer.getRealAnswer();

                        youAnswer.setText(youAnswerDescription);
                        correctAnswer.setText(correctAnswerDescription);

                        /**
                         * Удаление старой картинки и добавление новой.
                         */
                        panel2.removeAll();
                        panel2.add(picLabel);
                        panel2.revalidate();
                    }
                  }
                );
                panel1In.add(jButton);

                i++;
            }

            panel1.add(panel1In);
            panel1.add(youAnswer);
            panel1.add(correctAnswer);
            add(new JScrollPane(panel1));
            add(new JScrollPane(panel2));

            /**
             * Установка размеров диалога.
             */
            setBounds(rectangle);
        }
    }
}



