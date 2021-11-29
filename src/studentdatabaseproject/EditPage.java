/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdatabaseproject;

import java.awt.List;
import java.io.File;
import java.io.FileOutputStream;
import javax.swing.JFrame;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import javax.swing.JOptionPane;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultCellEditor;

public class EditPage extends javax.swing.JFrame {

    public static final Pattern VALID_EMAIL_ADDRESS_REGEX
            = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
    public static final Pattern VALID_CGPA_REGEX
            = Pattern.compile("^(\\d\\.)?\\d$", Pattern.CASE_INSENSITIVE);
    public static final Pattern VALID_NAME_REGEX
            = Pattern.compile("^[a-zA-Z ]*$", Pattern.CASE_INSENSITIVE);
    public static final Pattern VALID_CONTACT_ID_REGEX
            = Pattern.compile("^[0-9]*$", Pattern.CASE_INSENSITIVE);
    ArrayList<String> list1 = new ArrayList<>(Arrays.asList("CS", "IT", "Electronics", "Biomed", "EXTC", "Chemical"));
    ArrayList<String> list2 = new ArrayList<>(Arrays.asList("FY", "SY", "TY", "LY"));

    public static boolean validate(String abc, Pattern pattern) {
        Matcher matcher = pattern.matcher(abc);
        return matcher.find();
    }

    public EditPage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jButton5.setText("jButton5");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setAutoscrolls(true);
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Enter Student UID");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(350, 90, 145, 22);

        jTextField1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(520, 90, 166, 28);

        jButton1.setBackground(new java.awt.Color(204, 153, 0));
        jButton1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton1.setText("Show Record");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(400, 140, 141, 30);

        jTable1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Branch", "Year", "StudentUID", "Address", "Email ID", "ContactNo.", "CGPA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, false, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setFocusTraversalPolicyProvider(true);
        jTable1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTable1FocusLost(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTable1KeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 210, 790, 50);

        jButton2.setBackground(new java.awt.Color(204, 153, 0));
        jButton2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton2.setText("Update");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(160, 330, 90, 30);

        jButton3.setBackground(new java.awt.Color(204, 153, 0));
        jButton3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton3.setText("Back ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(520, 330, 77, 30);

        jButton4.setBackground(new java.awt.Color(204, 153, 0));
        jButton4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton4.setText("Delete ");
        jButton4.setEnabled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(330, 330, 89, 31);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Kozuka Gothic Pr6N R", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Search/Edit Student Details");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(410, 20, 290, 49);

        jButton7.setBackground(new java.awt.Color(204, 153, 0));
        jButton7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton7.setText("Download student LOR");
        jButton7.setEnabled(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(290, 280, 186, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\VedantJ\\Pictures\\860_main_library_bacteria-800x428.png")); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(-10, 0, 810, 420);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 0, 800, 428));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int opt = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit? Unsaved changes may be lost", "Exit", JOptionPane.YES_NO_OPTION);
        if (opt == JOptionPane.OK_OPTION) {
            dispose();
            Studentdetails sd = new Studentdetails();
            sd.setVisible(true);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String roll = jTextField1.getText();
        try {
            if (roll.length() > 0) {
                if (roll.length() == 10) {
                    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

                    Connection connection = ConnectionFactory.getConnection();

                    PreparedStatement st = (PreparedStatement) connection
                            .prepareStatement("Select * from student_rec where StudentUID=?");

                    st.setString(1, roll);
                    ResultSet rs = st.executeQuery();
                    if (rs.next()) {
                        jButton2.setEnabled(true);
                        jButton3.setEnabled(true);
                        jButton4.setEnabled(true);
                        jButton7.setEnabled(true);

                        JOptionPane.showMessageDialog(jButton1, "Record Found!!! They're displayed in table");
                        String name = rs.getString("Name");
                        String branch_ = rs.getString("Branch");
                        String batch_ = rs.getString("Batch");
                        String rollno = rs.getString("StudentUID");
                        String add = rs.getString("Address");
                        String ci = rs.getString("Contact_Info");
                        String gr = rs.getString("CGPA");
                        String em = rs.getString("Email");
                        model.addRow(new Object[]{name, branch_, batch_, rollno, add, em, ci, gr});
                        model.isCellEditable(1, NORMAL);
                    } else {
                        JOptionPane.showMessageDialog(jButton1, "UID does not exist! Please check again!");
                        jButton2.setEnabled(false);
                        jButton4.setEnabled(false);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Student UID must be 10 digit long!!");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Please Enter UID first!");
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
            JOptionPane.showMessageDialog(jButton1, sqlException.getMessage());
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(jButton1, exception.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            String roll = jTextField1.getText();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            Connection connection = ConnectionFactory.getConnection();
            Object name = model.getValueAt(0, 0);
            Object branch_ = model.getValueAt(0, 1);
            Object batch_ = model.getValueAt(0, 2);
            Object rollno = model.getValueAt(0, 3);
            Object add = model.getValueAt(0, 4);
            Object em = model.getValueAt(0, 5);
            Object ci = model.getValueAt(0, 6);
            Object gr = model.getValueAt(0, 7);

            if ((name.toString().length() > 0 && branch_.toString().length() > 0 && batch_.toString().length() > 0 && add.toString().length() > 0 && ci.toString().length() > 0 && gr.toString().length() > 0 && em.toString().length() > 0)) {
                if (validate(em.toString(), VALID_EMAIL_ADDRESS_REGEX)) {
                    if (validate(gr.toString(), VALID_CGPA_REGEX)) {
                        if (validate(ci.toString(), VALID_CONTACT_ID_REGEX) && ci.toString().length() > 9) {
                            if (validate(name.toString(), VALID_NAME_REGEX)) {
                                if (list2.contains(batch_)) {
                                    if (list1.contains(branch_)) {
                                        if (ci.toString().length() == 10) {
                                            PreparedStatement st = (PreparedStatement) connection
                                                    .prepareStatement("UPDATE student_rec SET Name=?, Branch=?, Batch= ?, StudentUID=?, address=?, Contact_Info=?, CGPA=?, Email=? WHERE StudentUID=?");
                                            st.setString(1, name.toString());
                                            st.setString(2, branch_.toString());
                                            st.setString(3, batch_.toString());
                                            st.setString(4, rollno.toString());
                                            st.setString(5, add.toString());
                                            st.setString(6, ci.toString());
                                            st.setString(7, gr.toString());
                                            st.setString(8, em.toString());
                                            st.setString(9, roll);
                                            int row = st.executeUpdate();
                                            if (row == 1) {
                                                JOptionPane.showMessageDialog(null, "Record Updated Successfully");
                                            }
                                        } else {
                                            JOptionPane.showMessageDialog(null, "Contact Number should be 10 digit long");
                                        }
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Branch must be CS/IT/EXTC/Electronics/Chemical/Biomed");
                                    }

                                } else {
                                    JOptionPane.showMessageDialog(null, "Select from FY/SY/TY/LY only!!");
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Name cannot contain numbers");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Contact number field invalid!! Please check!");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Enter in correct CGPA format");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Email address format incorrect");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please fill all the entries");
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
            JOptionPane.showMessageDialog(jButton1, sqlException.getMessage());
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(jButton1, exception.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int opt = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete? Data might be lost permanently", "Exit", JOptionPane.YES_NO_OPTION);
        if (opt == 0)
        try {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            String roll = jTextField1.getText();
            Connection connection = ConnectionFactory.getConnection();
            PreparedStatement st = (PreparedStatement) connection
                    .prepareStatement("DELETE FROM student_rec where StudentUID=?");
            st.setString(1, roll);
            int js = st.executeUpdate();
            if (js == 1) {
                model.getDataVector().removeAllElements();
                jTable1.repaint();
                jTextField1.setText("");
                JOptionPane.showMessageDialog(null, "Deletion successful");
            } else {
                JOptionPane.showMessageDialog(null, "Student UID does not exists");
            }

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
            JOptionPane.showMessageDialog(jButton1, sqlException.getMessage());
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(jButton1, exception.getMessage());
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c))) {
            evt.consume();
        }
        JTextField cb = (JTextField) evt.getComponent();
        if (cb.getText().length() > 9) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTable1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1KeyTyped

    private void jTable1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTable1FocusLost

    }//GEN-LAST:event_jTable1FocusLost

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        String s = jTextField1.getText();
        if (s.length() != 10) {
            JOptionPane.showMessageDialog(jButton1, "Student UID must be 10 digit long");
        }
    }//GEN-LAST:event_jTextField1FocusLost

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        String uid = jTextField1.getText();
        FileOutputStream fs = null;
        try {
            Connection connection = ConnectionFactory.getConnection();
            PreparedStatement st = (PreparedStatement) connection.prepareStatement("Select reportfile from intern_rep where StudentUID=?");
            byte b[];
            Blob blob;
            st.setString(1, uid);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                File f = new File("C:\\Users\\VedantJ\\Desktop\\JAVA MiniProject Demo\\lorRecord\\"+"LOR_" +uid+".docx");
                fs = new FileOutputStream(f);
                blob = rs.getBlob("reportfile");
                b = blob.getBytes(1, (int) blob.length());
                fs.write(b);
                JOptionPane.showMessageDialog(this, "File Saved In System");
            }else{
               JOptionPane.showMessageDialog(this, "Student LOR not present in database, Please check!!"); 
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());

        }
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(EditPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}