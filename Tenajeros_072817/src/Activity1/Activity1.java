/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Activity1.java
 *
 * Created on Jul 28, 2017, 2:29:37 PM
 */
package Activity1;
import javax.swing.*;
/**
 *
 * @author 3rd Year Account
 */
public class Activity1 extends javax.swing.JFrame {
    int ctr = 0;
    
    /** Creates new form Activity1 */
    public Activity1() {
        initComponents();
        JFrame frame = new JFrame();
        frame.setResizable(false);
        setResizable(false);
        setTitle("Counter");
        frame.add(new JLabel(new ImageIcon("src/Calculater - Copy - Copy.png")));
        ImageIcon img = new ImageIcon("src/Calculater - Copy - Copy.png");
        this.setIconImage(img.getImage());

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        counterbox = new javax.swing.JTextField();
        countbtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        counterbox.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        counterbox.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        counterbox.setText("0");
        counterbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                counterboxActionPerformed(evt);
            }
        });
        getContentPane().add(counterbox);
        counterbox.setBounds(100, 70, 133, 46);

        countbtn.setText("1");
        countbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countbtnActionPerformed(evt);
            }
        });
        getContentPane().add(countbtn);
        countbtn.setBounds(230, 150, 50, 30);

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Counter");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 150, 106, 32);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(702, 718, 0, 0);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\3rd Year Account\\Desktop\\Calculater.png")); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-90, -40, 420, 564);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-368)/2, (screenSize.height-519)/2, 368, 519);
    }// </editor-fold>//GEN-END:initComponents

private void counterboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_counterboxActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_counterboxActionPerformed

private void countbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countbtnActionPerformed
     
     ctr=ctr+1;
    counterbox.setText(Integer.toString(ctr));
}//GEN-LAST:event_countbtnActionPerformed

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
            java.util.logging.Logger.getLogger(Activity1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Activity1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Activity1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Activity1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Activity1().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton countbtn;
    private javax.swing.JTextField counterbox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
