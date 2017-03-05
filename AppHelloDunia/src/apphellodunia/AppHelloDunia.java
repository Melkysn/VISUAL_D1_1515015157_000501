/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apphellodunia;

/**
 *
 * @author Acer
 */
public class AppHelloDunia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfrHelloDunia().setVisible(false);
            }
        });
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Datamhs().setVisible(true);
            }
        });
    }
    
}
