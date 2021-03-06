/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iuds;
//DISPLAY TO LOGGED IN USER, THEIR PROFILE

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import static java.lang.Thread.sleep;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author Himashi
 */
public class Admin_Profile extends javax.swing.JFrame {
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    /**
     * Creates new form studentInfo
     */
    public Admin_Profile() {
        initComponents();
        conn = dbConnect.connectToDb();
        currentDateAndTime();
        
        
        
        
        //lbl_sid.setText(String.valueOf(Student.stid).toString());
        lbl_aid.setText(String.valueOf(Admin.auname).toString());
        
        lbl_vaid.setText(String.valueOf(Admin.adid).toString());
        lbl_vanic.setText(String.valueOf(Admin.anic).toString());
        
        lbl_vaemail.setText(String.valueOf(Admin.aemail).toString());
        

    }
    /*
    public void close(){
        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
*/
    
    
    
    public void currentDateAndTime(){
        
        
        Thread clock = new Thread(){
            public void run(){
                for(;;){
        Calendar cal = new GregorianCalendar();
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        mnu_date.setText("Date "+year+"/"+(month+1)+"/"+day);
        
        
        int second = cal.get(Calendar.SECOND);
        int mins = cal.get(Calendar.MINUTE);
        int hrs = cal.get(Calendar.HOUR);
        mnu_time.setText("Time "+hrs+":"+(mins)+":"+second);
                    try {
                        sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(StudentRecords_SearchRecords_AdminTask.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }
            }
            
            
            
        };
        clock.start();
        
    }
    
    
    
   
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lbl_vaid = new javax.swing.JLabel();
        lbl_vanic = new javax.swing.JLabel();
        lbl_vaemail = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btn_ad_prog = new javax.swing.JButton();
        btn_ad_assign = new javax.swing.JButton();
        btn_ad_feedback = new javax.swing.JButton();
        btn_ad_exam = new javax.swing.JButton();
        btn_ad_sis = new javax.swing.JButton();
        btn_ad_payment = new javax.swing.JButton();
        btn_ad_marks = new javax.swing.JButton();
        btn_ad_attendance = new javax.swing.JButton();
        btn_ad_lis = new javax.swing.JButton();
        btn_ad_results = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lbl_aid = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btn_ad_logout = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        mnu_date = new javax.swing.JMenu();
        mnu_time = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Admin Profile", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 36), new java.awt.Color(204, 0, 204))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(102, 255, 255));

        jPanel5.setBackground(new java.awt.Color(102, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Admin Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(204, 0, 204))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Email");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("NIC");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Admin_ID");

        lbl_vaid.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lbl_vanic.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lbl_vaemail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_vaid, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                    .addComponent(lbl_vanic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_vaemail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(lbl_vaid, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_vanic, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(lbl_vaemail, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(102, 255, 255));

        btn_ad_prog.setBackground(new java.awt.Color(204, 204, 204));
        btn_ad_prog.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_ad_prog.setForeground(new java.awt.Color(204, 0, 204));
        btn_ad_prog.setText(" Program Details");
        btn_ad_prog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ad_progActionPerformed(evt);
            }
        });

        btn_ad_assign.setBackground(new java.awt.Color(204, 204, 204));
        btn_ad_assign.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_ad_assign.setForeground(new java.awt.Color(204, 0, 204));
        btn_ad_assign.setText(" Assignment Details");
        btn_ad_assign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ad_assignActionPerformed(evt);
            }
        });

        btn_ad_feedback.setBackground(new java.awt.Color(204, 204, 204));
        btn_ad_feedback.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_ad_feedback.setForeground(new java.awt.Color(204, 0, 204));
        btn_ad_feedback.setText("Feedback");
        btn_ad_feedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ad_feedbackActionPerformed(evt);
            }
        });

        btn_ad_exam.setBackground(new java.awt.Color(204, 204, 204));
        btn_ad_exam.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_ad_exam.setForeground(new java.awt.Color(204, 0, 204));
        btn_ad_exam.setText(" Exam Details");
        btn_ad_exam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ad_examActionPerformed(evt);
            }
        });

        btn_ad_sis.setBackground(new java.awt.Color(204, 204, 204));
        btn_ad_sis.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_ad_sis.setForeground(new java.awt.Color(204, 0, 204));
        btn_ad_sis.setText("Student Information System");
        btn_ad_sis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ad_sisActionPerformed(evt);
            }
        });

        btn_ad_payment.setBackground(new java.awt.Color(204, 204, 204));
        btn_ad_payment.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_ad_payment.setForeground(new java.awt.Color(204, 0, 204));
        btn_ad_payment.setText("FeePayments");
        btn_ad_payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ad_paymentActionPerformed(evt);
            }
        });

        btn_ad_marks.setBackground(new java.awt.Color(204, 204, 204));
        btn_ad_marks.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_ad_marks.setForeground(new java.awt.Color(204, 0, 204));
        btn_ad_marks.setText(" Exam Marks View");
        btn_ad_marks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ad_marksActionPerformed(evt);
            }
        });

        btn_ad_attendance.setBackground(new java.awt.Color(204, 204, 204));
        btn_ad_attendance.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_ad_attendance.setForeground(new java.awt.Color(204, 0, 204));
        btn_ad_attendance.setText("Attendance");
        btn_ad_attendance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ad_attendanceActionPerformed(evt);
            }
        });

        btn_ad_lis.setBackground(new java.awt.Color(204, 204, 204));
        btn_ad_lis.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_ad_lis.setForeground(new java.awt.Color(204, 0, 204));
        btn_ad_lis.setText("Lecturer Information System");
        btn_ad_lis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ad_lisActionPerformed(evt);
            }
        });

        btn_ad_results.setBackground(new java.awt.Color(204, 204, 204));
        btn_ad_results.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_ad_results.setForeground(new java.awt.Color(204, 0, 204));
        btn_ad_results.setText(" Exam Marks Search");
        btn_ad_results.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ad_resultsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btn_ad_sis, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(131, 131, 131)
                        .addComponent(btn_ad_lis, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btn_ad_marks, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_ad_feedback, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_ad_attendance, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_ad_prog, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_ad_payment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_ad_exam, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_ad_assign, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                    .addContainerGap(414, Short.MAX_VALUE)
                    .addComponent(btn_ad_results, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ad_sis, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ad_lis))
                .addGap(46, 46, 46)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ad_prog)
                    .addComponent(btn_ad_exam))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(btn_ad_marks, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ad_attendance)
                    .addComponent(btn_ad_payment))
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ad_feedback)
                    .addComponent(btn_ad_assign, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                    .addContainerGap(181, Short.MAX_VALUE)
                    .addComponent(btn_ad_results, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(150, 150, 150)))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(245, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(162, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(102, 255, 255));

        lbl_aid.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lbl_aid.setForeground(new java.awt.Color(204, 0, 204));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 0, 204));
        jLabel9.setText("Welcome admin");

        btn_ad_logout.setBackground(new java.awt.Color(204, 204, 204));
        btn_ad_logout.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_ad_logout.setForeground(new java.awt.Color(204, 0, 204));
        btn_ad_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout.png"))); // NOI18N
        btn_ad_logout.setText("Log out");
        btn_ad_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ad_logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_aid, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(btn_ad_logout)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_aid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(53, 53, 53)
                .addComponent(btn_ad_logout)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Home");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Exit");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("About");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("About this System");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        mnu_date.setText("Date");
        jMenuBar1.add(mnu_date);

        mnu_time.setText("Time");
        jMenuBar1.add(mnu_time);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
           dispose();
           new Home().setVisible(true);


    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        System.exit(0);

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void btn_ad_sisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ad_sisActionPerformed
        new Student_IUDSV_AdminTask().setVisible(true);


    }//GEN-LAST:event_btn_ad_sisActionPerformed

    private void btn_ad_lisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ad_lisActionPerformed
        new Lecturer_IUDSV_AdminTask().setVisible(true);
    }//GEN-LAST:event_btn_ad_lisActionPerformed

    private void btn_ad_progActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ad_progActionPerformed
        new Courses_IUDSV_AdminTask().setVisible(true);
    }//GEN-LAST:event_btn_ad_progActionPerformed

    private void btn_ad_examActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ad_examActionPerformed
        new Exam_IUDSV_AdminTask().setVisible(true);
    }//GEN-LAST:event_btn_ad_examActionPerformed

    private void btn_ad_assignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ad_assignActionPerformed
        new Assignment_IUDSV_AdminTask().setVisible(true);
    }//GEN-LAST:event_btn_ad_assignActionPerformed

    private void btn_ad_marksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ad_marksActionPerformed
        new ExamMarksRecords_ViewAll_AdminTask().setVisible(true);
    }//GEN-LAST:event_btn_ad_marksActionPerformed

    private void btn_ad_attendanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ad_attendanceActionPerformed
        new Attendance_IUDSV_AdminTask().setVisible(true);

    }//GEN-LAST:event_btn_ad_attendanceActionPerformed

    private void btn_ad_paymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ad_paymentActionPerformed
        new FeePayment_IUDSV_AdminTask().setVisible(true);
    }//GEN-LAST:event_btn_ad_paymentActionPerformed

    private void btn_ad_feedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ad_feedbackActionPerformed
        new Feedback_IUDSV_AdminTask().setVisible(true);
    }//GEN-LAST:event_btn_ad_feedbackActionPerformed

    private void btn_ad_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ad_logoutActionPerformed
           dispose();
           new Home().setVisible(true);
          
    }//GEN-LAST:event_btn_ad_logoutActionPerformed

    private void btn_ad_resultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ad_resultsActionPerformed
          new ExamMarksRecords_SearchRecords_AdminTask().setVisible(true);    }//GEN-LAST:event_btn_ad_resultsActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        
        
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
       
        new ABOUT().setVisible(true); 
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ad_assign;
    private javax.swing.JButton btn_ad_attendance;
    private javax.swing.JButton btn_ad_exam;
    private javax.swing.JButton btn_ad_feedback;
    private javax.swing.JButton btn_ad_lis;
    private javax.swing.JButton btn_ad_logout;
    private javax.swing.JButton btn_ad_marks;
    private javax.swing.JButton btn_ad_payment;
    private javax.swing.JButton btn_ad_prog;
    private javax.swing.JButton btn_ad_results;
    private javax.swing.JButton btn_ad_sis;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lbl_aid;
    private javax.swing.JLabel lbl_vaemail;
    private javax.swing.JLabel lbl_vaid;
    private javax.swing.JLabel lbl_vanic;
    private javax.swing.JMenu mnu_date;
    private javax.swing.JMenu mnu_time;
    // End of variables declaration//GEN-END:variables
}
