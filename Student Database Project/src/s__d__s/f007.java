/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * f007.java
 *
 * Created on Jul 17, 2011, 9:16:07 PM
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
public class f007 extends javax.swing.JFrame {
 String x=new String();
    /** Creates new form f007 */
    public f007() {
        initComponents();
        pp.setVisible(false);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        a1 = new javax.swing.JTextField();
        a3 = new javax.swing.JTextField();
        a4 = new javax.swing.JTextField();
        a5 = new javax.swing.JTextField();
        a6 = new javax.swing.JTextField();
        a7 = new javax.swing.JTextField();
        a8 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        b = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        pp = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Student Database System");

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Andalus", 1, 36));
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Student Data");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 0, 970, 44);

        jPanel2.setLayout(null);

        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

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
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 981, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(204, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel5.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel3.setText("Student ID,Course No :");
        jPanel5.add(jLabel3);
        jLabel3.setBounds(10, 80, 210, 30);

        a1.setFont(new java.awt.Font("Tahoma", 0, 18));
        a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a1ActionPerformed(evt);
            }
        });
        jPanel5.add(a1);
        a1.setBounds(190, 80, 230, 30);

        a3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a3ActionPerformed(evt);
            }
        });
        jPanel5.add(a3);
        a3.setBounds(190, 180, 120, 20);
        jPanel5.add(a4);
        a4.setBounds(190, 220, 120, 20);
        jPanel5.add(a5);
        a5.setBounds(190, 270, 120, 20);
        jPanel5.add(a6);
        a6.setBounds(190, 320, 120, 20);
        jPanel5.add(a7);
        a7.setBounds(650, 60, 130, 20);
        jPanel5.add(a8);
        a8.setBounds(650, 110, 130, 20);

        jButton1.setBackground(new java.awt.Color(245, 231, 231));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 18));
        jButton1.setForeground(new java.awt.Color(51, 0, 102));
        jButton1.setText("ADD ");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterButtonActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1);
        jButton1.setBounds(780, 380, 180, 30);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 24));
        jLabel10.setForeground(new java.awt.Color(153, 51, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Add Marks");
        jLabel10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null));
        jPanel5.add(jLabel10);
        jLabel10.setBounds(0, 0, 1000, 30);

        jLabel24.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel24.setText("Quiz No 1 :");
        jPanel5.add(jLabel24);
        jLabel24.setBounds(20, 180, 59, 20);

        jLabel25.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel25.setText("Quiz No 2 :");
        jPanel5.add(jLabel25);
        jLabel25.setBounds(20, 220, 59, 20);

        jLabel29.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel29.setText("Quiz No 3 :");
        jPanel5.add(jLabel29);
        jLabel29.setBounds(20, 270, 59, 20);

        jLabel33.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel33.setText("Average Best 3 Quiz :");
        jPanel5.add(jLabel33);
        jLabel33.setBounds(20, 380, 130, 15);

        jLabel41.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel41.setText("GPA :");
        jPanel5.add(jLabel41);
        jLabel41.setBounds(500, 240, 80, 20);

        jLabel38.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel38.setText("Attendence :");
        jPanel5.add(jLabel38);
        jLabel38.setBounds(500, 60, 71, 15);

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setText("Generate");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2);
        jButton2.setBounds(330, 380, 110, 23);
        jPanel5.add(b);
        b.setBounds(190, 380, 120, 20);

        jLabel34.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel34.setText("Quiz No 4 :");
        jPanel5.add(jLabel34);
        jLabel34.setBounds(20, 320, 59, 15);

        jLabel42.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel42.setText("Semester Final :");
        jPanel5.add(jLabel42);
        jLabel42.setBounds(500, 120, 91, 15);
        jPanel5.add(jTextField1);
        jTextField1.setBounds(650, 180, 130, 20);

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setText("Generate");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3);
        jButton3.setBounds(830, 180, 110, 23);

        jLabel43.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel43.setText("Total Marks :");
        jPanel5.add(jLabel43);
        jLabel43.setBounds(500, 180, 73, 15);
        jPanel5.add(jTextField2);
        jTextField2.setBounds(650, 240, 130, 20);

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setText("Generate");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton4);
        jButton4.setBounds(830, 230, 110, 23);

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
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel4MouseMoved(evt);
            }
        });
        jPanel5.add(jLabel4);
        jLabel4.setBounds(380, 120, 40, 14);

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 10));
        jTextField3.setText("For example :    Student Id :1     Course No :EEE-111     You Have to write :     1,EEE-111");

        javax.swing.GroupLayout ppLayout = new javax.swing.GroupLayout(pp);
        pp.setLayout(ppLayout);
        ppLayout.setHorizontalGroup(
            ppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ppLayout.createSequentialGroup()
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ppLayout.setVerticalGroup(
            ppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ppLayout.createSequentialGroup()
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.add(pp);
        pp.setBounds(10, 140, 410, 20);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 980, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(377, 377, 377)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 980, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(476, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EnterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterButtonActionPerformed
        // TODO add your handling code here:
              
pp.setVisible(false);
        try {
            Connection conn = getConnection();
            Statement st = conn.createStatement();
            String s = new String();
            
            s = "insert into result (a1,a3,a4,a5,a6,a7,a8,a9,a10,a11) values ('" + this.a1.getText() + "','" + this.a3.getText() + "','" + this.a4.getText() + "','" + this.a5.getText() + "','" + this.a6.getText() + "','" + this.a7.getText() + "','" + this.a8.getText() + "','" + this.b.getText() + "','" + this.jTextField2.getText() + "','" + this.jTextField1.getText() + "')" ;
           
             st.executeUpdate(s);
            st = conn.createStatement();
            st.close();
            conn.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
        JOptionPane.showMessageDialog(null, "Marks added successfully");
        
        
    }
    private static Connection getConnection() throws Exception {
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
                new f007().setVisible(true);
            }
        });
}//GEN-LAST:event_EnterButtonActionPerformed

    private void a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a1ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_a1ActionPerformed
 
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            pp.setVisible(false);
        String x1=a3.getText();
            String x2=a4.getText();
            String x3=a5.getText();
            String x4=a6.getText();
            int y1=Integer.parseInt(x1);
            int y2=Integer.parseInt(x2);
            int y3=Integer.parseInt(x3);
            int y4=Integer.parseInt(x4);
            int sum=0;
             
            if(y1<y2 && y1<y3 && y1<y4)
                 sum=(y2+y3+y4)/3;
            if(y2<y1 && y2<y3 && y2<y4)
                 sum=(y1+y3+y4)/3;
            if(y3<y2 && y3<y1 && y3<y4)
                 sum=(y2+y1+y4)/3;
            if(y4<y2 && y4<y3 && y4<y1)
                 sum=(y2+y3+y1)/3;
            x=Integer.toString(sum);
            
            b.setText(x);
   
        
           
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        pp.setVisible(false);
        String x1=b.getText();
            String x2=a7.getText();
            String x3=a8.getText();
             int y1=Integer.parseInt(x1);
            int y2=Integer.parseInt(x2);
            int y3=Integer.parseInt(x3);
            int sum=y1+y2+y3;
            x=Integer.toString(sum);
             jTextField1.setText(x);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
     pp.setVisible(false);
        String x1= jTextField1.getText();
       double z = 0;
       int y=Integer.parseInt(x1);
       if(y>=80)z=4.00;
       if(y<80 && y>=75)z=3.75;
        if(y<75 && y>=70)z=3.50;
         if(y<70 && y>=65)z=3.25;
          if(y<65 && y>=60)z=3.00;
          if(y<60 && y>=55)z=2.75;
        if(y<55 && y>=50)z=2.50;
         if(y<50 && y>=45)z=2.25;
          if(y<45 && y>=40)z=2.00;
          if(y<40)z=0.00;
          x=Double.toString(z);
          jTextField2.setText(x);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void a3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a3ActionPerformed

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseReleased

    }//GEN-LAST:event_jLabel4MouseReleased

    private void jLabel4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseMoved
        // TODO add your handling code here:
         pp.setVisible(true);
    }//GEN-LAST:event_jLabel4MouseMoved

    /**
     * @param args the command line arguments
     */
  
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField a1;
    private javax.swing.JTextField a3;
    private javax.swing.JTextField a4;
    private javax.swing.JTextField a5;
    private javax.swing.JTextField a6;
    private javax.swing.JTextField a7;
    private javax.swing.JTextField a8;
    private javax.swing.JTextField b;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JPanel pp;
    // End of variables declaration//GEN-END:variables
}
