/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iuds;
//DISPLAY TO LOGGED IN ADMIN TO EDIT RECORDS
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;









/**
 *
 * @author Himashi
 */

public class Courses_IUDSV_AdminTask extends javax.swing.JFrame {
    
    
    Connection conn =null;
    PreparedStatement pst = null;
    ResultSet rs=null;
    

    /**
     * Creates new form NewJFrame
     */
    public Courses_IUDSV_AdminTask() {
        initComponents();
        conn = dbConnect.connectToDb();
        required( );
        currentDate();
    }

    
    public void currentDate(){
        
        
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
                    } 
                    catch (InterruptedException ex) {
                        Logger.getLogger(Courses_IUDSV_AdminTask.class.getName()).log(Level.SEVERE, null, ex);
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txt_ctitle = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_cid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_cdes = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_subcredits = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        comboprog = new javax.swing.JComboBox<>();
        combo_sem = new javax.swing.JComboBox<>();
        req = new javax.swing.JLabel();
        req1 = new javax.swing.JLabel();
        req2 = new javax.swing.JLabel();
        req3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btn_insert = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_search = new javax.swing.JButton();
        btn_view = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        mnu_date = new javax.swing.JMenu();
        mnu_time = new javax.swing.JMenu();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Course Information System", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 36), new java.awt.Color(204, 0, 204))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(102, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Course Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(204, 0, 204))); // NOI18N

        txt_ctitle.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Course Title");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Course Description");

        txt_cid.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Program");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Course_ID");

        txt_cdes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_cdes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cdesActionPerformed(evt);
            }
        });

        txt_subcredits.setColumns(20);
        txt_subcredits.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_subcredits.setRows(5);
        jScrollPane1.setViewportView(txt_subcredits);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Subjects and Credits");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Academic Year");

        comboprog.setBackground(new java.awt.Color(255, 255, 204));
        comboprog.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        comboprog.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<--Select Degree Program-->", "Information Technology ", "Computer Systems and Network Engineering ", "Information Systems Engineering ", "Software Engineering ", "Interactive Media", "Cyber Security", "Human Capital Management", "Accounting and Finance", "Marketing Management", "Logistics and Supply Chain Management", "Business Analytics", "Civil Engineering", "Electrical & Electronic Engineering", "Materials Engineering", "Mechanical Engineering", " " }));
        comboprog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboprogActionPerformed(evt);
            }
        });

        combo_sem.setBackground(new java.awt.Color(255, 255, 204));
        combo_sem.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        combo_sem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<--Select  Semester-->", "Year 1 Semester 1", "Year 1 Semester 2", "Year 2 Semester 1", "Year 2 Semester 2", "Year 3 Semester 1", "Year 3 Semester 2", "Year 4 Semester 1", "Year 4 Semester 2" }));

        req.setForeground(new java.awt.Color(255, 0, 0));
        req.setText("*");

        req1.setForeground(new java.awt.Color(255, 0, 0));
        req1.setText("*");

        req2.setForeground(new java.awt.Color(255, 0, 0));
        req2.setText("*");

        req3.setForeground(new java.awt.Color(255, 0, 0));
        req3.setText("*");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(req, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(req1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(req2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(req3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(txt_cdes)
                    .addComponent(txt_ctitle)
                    .addComponent(txt_cid)
                    .addComponent(comboprog, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(combo_sem, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_cid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(req, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboprog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_ctitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(req1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_cdes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(req2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(combo_sem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(req3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(102, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1037, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 63, Short.MAX_VALUE)
        );

        btn_insert.setBackground(new java.awt.Color(204, 204, 204));
        btn_insert.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_insert.setForeground(new java.awt.Color(204, 0, 204));
        btn_insert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/insert.png"))); // NOI18N
        btn_insert.setText("INSERT");
        btn_insert.setIconTextGap(14);
        btn_insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_insertActionPerformed(evt);
            }
        });

        btn_update.setBackground(new java.awt.Color(204, 204, 204));
        btn_update.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_update.setForeground(new java.awt.Color(204, 0, 204));
        btn_update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/update.png"))); // NOI18N
        btn_update.setText("UPDATE");
        btn_update.setIconTextGap(14);
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_delete.setBackground(new java.awt.Color(204, 204, 204));
        btn_delete.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_delete.setForeground(new java.awt.Color(204, 0, 204));
        btn_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete.png"))); // NOI18N
        btn_delete.setText("DELETE");
        btn_delete.setIconTextGap(14);
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_search.setBackground(new java.awt.Color(204, 204, 204));
        btn_search.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_search.setForeground(new java.awt.Color(204, 0, 204));
        btn_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/find.png"))); // NOI18N
        btn_search.setText("SEARCH");
        btn_search.setIconTextGap(14);
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });

        btn_view.setBackground(new java.awt.Color(204, 204, 204));
        btn_view.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_view.setForeground(new java.awt.Color(204, 0, 204));
        btn_view.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/viewall.png"))); // NOI18N
        btn_view.setText("VIEW");
        btn_view.setIconTextGap(14);
        btn_view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_viewActionPerformed(evt);
            }
        });

        btn_clear.setBackground(new java.awt.Color(204, 204, 204));
        btn_clear.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btn_clear.setForeground(new java.awt.Color(204, 0, 204));
        btn_clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/clear.png"))); // NOI18N
        btn_clear.setText("CLEAR");
        btn_clear.setIconTextGap(14);
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(621, 621, 621))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_insert)
                                .addGap(18, 18, 18)
                                .addComponent(btn_update))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_search)
                                .addGap(18, 18, 18)
                                .addComponent(btn_view, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_insert)
                    .addComponent(btn_update)
                    .addComponent(btn_delete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_search)
                    .addComponent(btn_view)
                    .addComponent(btn_clear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenu3.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Home");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);
        jMenu3.add(jSeparator1);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Exit");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Close Window");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("About");
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("About this System");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);

        jMenuBar2.add(jMenu4);

        mnu_date.setText("Date");
        jMenuBar2.add(mnu_date);

        mnu_time.setText("Time");
        jMenuBar2.add(mnu_time);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 553, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insertActionPerformed
        
        
        int confirminsert = JOptionPane.showConfirmDialog(null, "Do you really want to insert this record ?","Insert",JOptionPane.YES_NO_OPTION);
        
        if(confirminsert==0){
        if(isEmpty()){
        try{
            String sql = "INSERT INTO course"
            + "(program,ctitle,description,academic_sem,subjectsAndCredits) "
            + "VALUES (?,?,?,?,?)";
        
        
        pst = conn.prepareStatement(sql);
        
        String value=comboprog.getSelectedItem().toString();
        pst.setString(1, value);
        pst.setString(2,txt_ctitle.getText());
        pst.setString(3,txt_cdes.getText());
        String value2=combo_sem.getSelectedItem().toString();
        pst.setString(4, value2);
        pst.setString(5,txt_subcredits.getText());
        
        
        pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Record Inserted Successfully !");
        }
        
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        
        //showTableData();
    }
        }
    }//GEN-LAST:event_btn_insertActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        
        int confirmdelete = JOptionPane.showConfirmDialog(null, "Do you really want to delete this record ?","Delete",JOptionPane.YES_NO_OPTION);
        
        if(confirmdelete==0){
        
        try{
            String sql = "DELETE FROM course WHERE cid=?";
        
        
        pst = conn.prepareStatement(sql);
        
        pst.setString(1,txt_cid.getText());
        
        pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Record Deleted Successfully !");
        }
        
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        
        //showTableData();
    }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        
        int confirmupdate = JOptionPane.showConfirmDialog(null, "Do you really want to update this record ?","Update",JOptionPane.YES_NO_OPTION);
        
        if(confirmupdate==0){
            if(isEmpty()){
                if(!txt_cid.getText().isEmpty()){
            
        
        try{
            String sql = "UPDATE course SET program=?,ctitle=?,description=?,academic_sem=?,subjectsAndCredits=? WHERE cid=?";
        
        //conn = DriverManager.getConnection("jdbc:mysql://localhost/iuds","root","");
        
        pst = conn.prepareStatement(sql);
        
        pst.setString(6,txt_cid.getText());
        
        String value=comboprog.getSelectedItem().toString();
        pst.setString(1, value);
        pst.setString(2,txt_ctitle.getText());
        pst.setString(3,txt_cdes.getText());
        String value2=combo_sem.getSelectedItem().toString();
        pst.setString(4, value2);
        pst.setString(5,txt_subcredits.getText());
        
        
        
        pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Record Updated Successfully !");
        }
        
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
       
        //showTableData();
    }
            }
        }
            }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        
        txt_cid.setText(" ");
        comboprog.setSelectedIndex(0);
        txt_ctitle.setText(" ");
        txt_cdes.setText(" ");
        combo_sem.setSelectedIndex(0);
        txt_subcredits.setText(" ");
        
        
        
            }//GEN-LAST:event_btn_clearActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
            
        System.exit(0);


    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void btn_viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_viewActionPerformed
            
        CoursesRecords_ViewAll_AdminTask viewall =new CoursesRecords_ViewAll_AdminTask();
        viewall.setVisible(true);
        
        

    }//GEN-LAST:event_btn_viewActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed

        CoursesRecords_SearchRecords_AdminTask searchrecords =new CoursesRecords_SearchRecords_AdminTask();
        searchrecords.setVisible(true);


    }//GEN-LAST:event_btn_searchActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

           dispose();
           new Home().setVisible(true);


    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed

        dispose();

    }//GEN-LAST:event_jMenu4ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void txt_cdesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cdesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cdesActionPerformed

    private void comboprogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboprogActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboprogActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
       
        new ABOUT().setVisible(true); 
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    /*
     public void showTableData(){
         try{
            //conn = DriverManager.getConnection("jdbc:mysql://localhost/iuds","root","");
            
            String sql = "SELECT * FROM iudstbl";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            
            jTable_stu.setModel(DbUtils.resultSetToTableModel(rs));
         }
         catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);

         }
            
        }
    */
    
    
    private void required( ) {
        req.setVisible(false);
        req1.setVisible(false);
        req2.setVisible(false);
        req3.setVisible(false);
       
        
        
     }
    
    
    
    
    
     public boolean isEmpty(){
      
        if(txt_ctitle.getText().isEmpty())
            req1.setVisible(true);
        else
            req1.setVisible(false);
        if(txt_cdes.getText().isEmpty())
            req2.setVisible(true);
        else
            req2.setVisible(false);
        if(txt_subcredits.getText().isEmpty())
            req3.setVisible(true);
        else
            req3.setVisible(false);
        
        if(!txt_ctitle.getText().isEmpty()&&!txt_cdes.getText().isEmpty()&&!txt_subcredits.getText().isEmpty())
            return true;
        else
        {
            JOptionPane.showMessageDialog(null, "Please Enter all the Values!");
            return false;
        }
       
        }
    
    
     
     
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
            java.util.logging.Logger.getLogger(Courses_IUDSV_AdminTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Courses_IUDSV_AdminTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Courses_IUDSV_AdminTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Courses_IUDSV_AdminTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Courses_IUDSV_AdminTask().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_insert;
    private javax.swing.JButton btn_search;
    private javax.swing.JButton btn_update;
    private javax.swing.JButton btn_view;
    private javax.swing.JComboBox<String> combo_sem;
    private javax.swing.JComboBox<String> comboprog;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu mnu_date;
    private javax.swing.JMenu mnu_time;
    private javax.swing.JLabel req;
    private javax.swing.JLabel req1;
    private javax.swing.JLabel req2;
    private javax.swing.JLabel req3;
    private javax.swing.JTextField txt_cdes;
    private javax.swing.JTextField txt_cid;
    private javax.swing.JTextField txt_ctitle;
    private javax.swing.JTextArea txt_subcredits;
    // End of variables declaration//GEN-END:variables

    private ImageIcon format = null;
    String filename =null;
    int s = 0;
    byte[] profile_pic=null;
    private String gender;
   
}