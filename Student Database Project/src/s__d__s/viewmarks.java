/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * viewmarks.java
 *
 * Created on Jul 25, 2011, 12:29:08 AM
 */
package s__d__s;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import javax.swing.*;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class viewmarks extends javax.swing.JFrame {

    
    public viewmarks() {
        initComponents();
      pp.setVisible(false);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textarea = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        b1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pp = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        aestqa = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel7.setBackground(new java.awt.Color(204, 255, 204));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel7.setLayout(null);

        jLabel12.setFont(new java.awt.Font("Arial", 3, 24));
        jLabel12.setForeground(new java.awt.Color(204, 51, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("View Marks");
        jLabel12.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        jPanel7.add(jLabel12);
        jLabel12.setBounds(0, 0, 700, 40);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        textarea.setBackground(new java.awt.Color(244, 241, 230));
        textarea.setColumns(20);
        textarea.setEditable(false);
        textarea.setFont(new java.awt.Font("Cambria", 1, 16));
        textarea.setRows(5);
        jScrollPane1.setViewportView(textarea);

        jPanel7.add(jScrollPane1);
        jScrollPane1.setBounds(10, 50, 460, 410);

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Andalus", 1, 18));
        jButton2.setText("Search");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });
        jPanel7.add(jButton2);
        jButton2.setBounds(500, 260, 170, 40);

        b1.setFont(new java.awt.Font("Tahoma", 1, 14));
        jPanel7.add(b1);
        b1.setBounds(500, 90, 170, 30);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel14.setText("Enter ID & Course No:");
        jPanel7.add(jLabel14);
        jLabel14.setBounds(500, 50, 170, 17);

        jLabel4.setForeground(new java.awt.Color(255, 102, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("*Hint");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel4MouseReleased(evt);
            }
        });
        jLabel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel4MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel4MouseMoved(evt);
            }
        });
        jPanel7.add(jLabel4);
        jLabel4.setBounds(630, 130, 40, 14);

        pp.setLayout(null);

        aestqa.setColumns(20);
        aestqa.setRows(5);
        aestqa.setText("For example : \nStudent Id :1    \nCourse No :EEE-111   \nYou Have to write :\n1,EEE-111");
        jScrollPane2.setViewportView(aestqa);

        pp.add(jScrollPane2);
        jScrollPane2.setBounds(0, 0, 170, 130);

        jPanel7.add(pp);
        pp.setBounds(500, 150, 170, 90);

        jButton1.setBackground(new java.awt.Color(51, 255, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Back");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton1);
        jButton1.setBounds(583, 430, 100, 23);

        jPanel4.setBackground(new java.awt.Color(255, 204, 255));

        jLabel2.setFont(new java.awt.Font("Andalus", 1, 26));
        jLabel2.setForeground(new java.awt.Color(102, 0, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Student Result Management");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 818, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(475, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap(46, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
        try {
            Connection conn = getConnection();
            Statement st = conn.createStatement();
            String query = new String();
            
            query = "SELECT * FROM result where a1 = '" + this.b1.getText()+ "'";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                String a1 = rs.getString("a1");
                String a3 = rs.getString("a3");
                String a4 = rs.getString("a4");
                String a5 = rs.getString("a5");
                String a6 = rs.getString("a6");
                String a7 = rs.getString("a7");
                String a8 = rs.getString("a8");
                String a9 = rs.getString("a9");
                String a10 = rs.getString("a10");
                String a11 = rs.getString("a11");
             
                this.textarea.setText("\tStudent ID    :"+"    "+a1+"\n\n\n"+"Quiz 1 :"+"    "+a3+"\n\n"+"Quiz 2 :"+"    "+a4+"\n\n"+"Quiz 3 :"+"    "+a5+"\n\n"+"Quiz 4  : "+"    "+a6+"\n\n"+"Attendence :"+"    "+a7+"\n\n"+"Semester Final : "+"    "+a8+"\n\nQuiz Marks(Best 3)  : "+"    "+a9+"\n\n"+"Total marks : "+"    "+a11+"\n\n"+"Obtained GPA : "+"    "+a10);
            }
            st.close();
            conn.close();
        } catch (Exception e ) {
            e.printStackTrace();
        }
        
        // TODO add your handling code here:
}//GEN-LAST:event_SearchButtonActionPerformed

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseReleased
        
}//GEN-LAST:event_jLabel4MouseReleased

    private void jLabel4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseMoved
        // TODO add your handling code here:
       pp.setVisible(true);
}//GEN-LAST:event_jLabel4MouseMoved

    private void jLabel4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseDragged
        // TODO add your handling code here:
    
    }//GEN-LAST:event_jLabel4MouseDragged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        studentpg j=new studentpg();
        j.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    private static Connection getConnection() throws Exception
    {
    String driver = "sun.jdbc.odbc.JdbcOdbcDriver";
    String url = "jdbc:odbc:sms";
    String username = "";
    String password = "";
    Class.forName(driver);
    return DriverManager.getConnection(url, username, password);

  }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new viewmarks().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea aestqa;
    private javax.swing.JTextField b1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pp;
    private javax.swing.JTextArea textarea;
    // End of variables declaration//GEN-END:variables
}