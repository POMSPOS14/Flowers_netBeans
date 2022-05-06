/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package flowers;


import flowers.db.DBCreate;

/**
 *
 * @author pomah
 */
public class Flowers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DBCreate.dropTable();
        DBCreate.createTable();
        DBCreate.filingDB();
    }
    
}
