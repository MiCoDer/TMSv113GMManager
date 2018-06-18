package maplemanagercenter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Maneger extends javax.swing.JFrame {

    //＝＝＝伺服器連線資訊＝＝＝
    String ServerIP = "";
    String ServerPort = "3306";
    String DATABASE_NAME = "maplestory";

    String Connect_USER = "root";
    String Connect_PASSWORD = "";

    String DB_URL;

    Connection con = null;

    //＝＝＝＝＝＝＝＝＝＝＝＝＝
    //----------------0------------
    Statement sta = null;
    ResultSet rs_character = null;
    //----------------1------------
    Statement sta_ = null;
    ResultSet rs_ = null;
    int numRows = 0;
    //----------------2------------
    Statement sta_2 = null;
    ResultSet rs_2 = null;
    int numRows2 = 0;
    //-----------------------------

    public Maneger() {
        initComponents();
        labelStatus.setText("[等待連線]");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        btnFindACC = new javax.swing.JButton();
        tfieldACCOUNT = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaStClassDisplay = new javax.swing.JTextArea();
        btnFindCHR = new javax.swing.JButton();
        tfieldCHRNAME = new javax.swing.JTextField();
        btnFindAllAcc = new javax.swing.JButton();
        btnFindAllChr = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnPrevious = new javax.swing.JButton();
        jTextFieldRecNo = new javax.swing.JTextField();
        btnNext = new javax.swing.JButton();
        tfieldID = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        tfieldStName = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        tfielOnlineStat = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel23 = new javax.swing.JLabel();
        tfielLastlogon = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        tfielCreateTime = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jComboBoxBaned = new javax.swing.JComboBox<>();
        tfielGASH = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        tfielMPoint = new javax.swing.JTextField();
        tfielEmail = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        btnFindCHRName1 = new javax.swing.JButton();
        jTextSearchACCName = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jTextFieldRecNo1 = new javax.swing.JTextField();
        tfieldCHRID = new javax.swing.JTextField();
        btnUpdate1 = new javax.swing.JButton();
        btnDelete1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tfieldCHRACCID = new javax.swing.JTextField();
        btnPrevious2 = new javax.swing.JButton();
        btnNext2 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        tfieldCHRName = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        tfieldCHRLevel = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        tfieldCHR_DEX = new javax.swing.JTextField();
        tfieldCHR_LUK = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        tfieldCHR_INT = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        tfieldCHR_STR = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        tfieldCHRMaxHP = new javax.swing.JTextField();
        tfieldCHRMP = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        tfieldCHRHP = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        tfieldCHR_AP = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        tfieldCHR_MAP = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        tfieldCHR_MESO = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        tfieldCHRINTRO = new javax.swing.JTextField();
        tfieldCHRMaxMP = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        tfieldCHR_FAME = new javax.swing.JTextField();
        tfieldCHRJob = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jComboBoxGM = new javax.swing.JComboBox<>();
        btnFindCHRName = new javax.swing.JButton();
        jTextSearchCHRName = new javax.swing.JTextField();
        labelStatus = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        ConnectButton = new javax.swing.JButton();
        ServerIPTextBox = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        ServerPortTextBox = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        DBNameTextbox = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        ConUSERTextBox = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        ConPASSTextbox = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("楓之谷 v113 資料庫操作系統");

        btnFindACC.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N
        btnFindACC.setText("帳號查詢");
        btnFindACC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindACCActionPerformed(evt);
            }
        });

        tfieldACCOUNT.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N
        tfieldACCOUNT.setText("root");

        txtAreaStClassDisplay.setColumns(20);
        txtAreaStClassDisplay.setRows(5);
        jScrollPane2.setViewportView(txtAreaStClassDisplay);

        btnFindCHR.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N
        btnFindCHR.setText("遊戲角色查詢");
        btnFindCHR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindCHRActionPerformed(evt);
            }
        });

        tfieldCHRNAME.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N
        tfieldCHRNAME.setText("煞氣o小孩");

        btnFindAllAcc.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N
        btnFindAllAcc.setText("註冊帳號總覽");
        btnFindAllAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindAllAccPerformed(evt);
            }
        });

        btnFindAllChr.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N
        btnFindAllChr.setText("遊戲角色總覽");
        btnFindAllChr.setToolTipText("");
        btnFindAllChr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindAllChrActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnFindAllAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnFindAllChr, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFindACC, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(tfieldACCOUNT, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFindCHR, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(tfieldCHRNAME, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnFindCHR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnFindACC)
                        .addComponent(btnFindAllChr)
                        .addComponent(btnFindAllAcc)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfieldACCOUNT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfieldCHRNAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("帳戶及角色總覽", jPanel4);

        btnPrevious.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N
        btnPrevious.setText("前個帳號");
        btnPrevious.setToolTipText("");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        jTextFieldRecNo.setEditable(false);
        jTextFieldRecNo.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N
        jTextFieldRecNo.setText("連線中");

        btnNext.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N
        btnNext.setText("下個帳號");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        tfieldID.setEditable(false);
        tfieldID.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N

        btnUpdate.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N
        btnUpdate.setText("更新這一筆");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        tfieldStName.setEditable(false);
        tfieldStName.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N

        btnDelete.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N
        btnDelete.setText("刪除這一筆");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        tfielOnlineStat.setEditable(false);
        tfielOnlineStat.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N
        jLabel1.setText("編號");

        jLabel2.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N
        jLabel2.setText("帳號");

        jLabel3.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N
        jLabel3.setText("在線狀態");
        jLabel3.setToolTipText("");

        jLabel23.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N
        jLabel23.setText("最後登錄時間");
        jLabel23.setToolTipText("");

        tfielLastlogon.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N

        jLabel24.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N
        jLabel24.setText("帳號建立時間");
        jLabel24.setToolTipText("");

        tfielCreateTime.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N

        jLabel25.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N
        jLabel25.setText("帳號封鎖");
        jLabel25.setToolTipText("");

        jComboBoxBaned.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "未封鎖", "封鎖" }));

        tfielGASH.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N

        jLabel26.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N
        jLabel26.setText("遊戲點數");
        jLabel26.setToolTipText("");

        jLabel27.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N
        jLabel27.setText("楓葉點數");
        jLabel27.setToolTipText("");

        tfielMPoint.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N

        tfielEmail.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N

        jLabel28.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N
        jLabel28.setText("Email");
        jLabel28.setToolTipText("");

        btnFindCHRName1.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N
        btnFindCHRName1.setText("查帳號");
        btnFindCHRName1.setToolTipText("");
        btnFindCHRName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindCHRName1ActionPerformed(evt);
            }
        });

        jTextSearchACCName.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N
        jTextSearchACCName.setText("帳號");
        jTextSearchACCName.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(tfielOnlineStat, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(34, 34, 34)
                                .addComponent(tfieldStName, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tfieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextFieldRecNo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(btnPrevious)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel24)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfielCreateTime, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel23)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfielLastlogon, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBoxBaned, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfielGASH, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfielMPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfielEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(51, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnFindCHRName1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextSearchACCName, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldRecNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPrevious)
                            .addComponent(btnNext))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(tfielLastlogon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23)
                            .addComponent(tfielEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDelete)
                            .addComponent(btnUpdate))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tfieldStName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24)
                            .addComponent(tfielCreateTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tfielOnlineStat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jComboBoxBaned, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel25))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfielGASH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfielMPoint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27))))
                .addGap(29, 29, 29)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFindCHRName1)
                    .addComponent(jTextSearchACCName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(137, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("帳號資料維護", jPanel1);

        jTextFieldRecNo1.setEditable(false);
        jTextFieldRecNo1.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N
        jTextFieldRecNo1.setText("連線中");
        jTextFieldRecNo1.setToolTipText("");

        tfieldCHRID.setEditable(false);
        tfieldCHRID.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N

        btnUpdate1.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N
        btnUpdate1.setText("更新這一筆");
        btnUpdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate1ActionPerformed(evt);
            }
        });

        btnDelete1.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N
        btnDelete1.setText("刪除這一筆");
        btnDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N
        jLabel4.setText("編號");

        jLabel15.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N
        jLabel15.setText("所屬帳號編號");

        tfieldCHRACCID.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N

        btnPrevious2.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N
        btnPrevious2.setText("前個角色");
        btnPrevious2.setToolTipText("");
        btnPrevious2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevious2ActionPerformed(evt);
            }
        });

        btnNext2.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N
        btnNext2.setText("下個角色");
        btnNext2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNext2ActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N
        jLabel29.setText("角色名稱");

        tfieldCHRName.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N

        jLabel30.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N
        jLabel30.setText("角色等級");

        tfieldCHRLevel.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tfieldCHR_DEX.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N

        tfieldCHR_LUK.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N

        jLabel37.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N
        jLabel37.setText("幸運");

        tfieldCHR_INT.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N

        jLabel38.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N
        jLabel38.setText("智力");

        jLabel39.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N
        jLabel39.setText("力量");

        tfieldCHR_STR.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N

        jLabel40.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N
        jLabel40.setText("敏捷");

        tfieldCHRMaxHP.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N

        tfieldCHRMP.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N

        jLabel41.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N
        jLabel41.setText("現有魔力MP");

        jLabel42.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N
        jLabel42.setText("最大魔力MP");

        jLabel43.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N
        jLabel43.setText("現有血量HP");

        tfieldCHRHP.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N

        jLabel44.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N
        jLabel44.setText("最大血量HP");

        tfieldCHR_AP.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N

        jLabel45.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N
        jLabel45.setText("剩餘能力點數");

        jLabel46.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N
        jLabel46.setText("所在地圖代號");

        tfieldCHR_MAP.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N

        jLabel47.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N
        jLabel47.setText("楓幣");

        tfieldCHR_MESO.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N

        jLabel48.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N
        jLabel48.setText("角色自介");

        tfieldCHRINTRO.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N

        tfieldCHRMaxMP.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N

        jLabel49.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N
        jLabel49.setText("名聲");

        tfieldCHR_FAME.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel46)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfieldCHR_MAP, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel47)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfieldCHR_MESO, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel49)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfieldCHR_FAME, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel48)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfieldCHRINTRO, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel39)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tfieldCHR_STR, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel40)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tfieldCHR_DEX, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel37)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tfieldCHR_LUK, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel38)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tfieldCHR_INT, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel45)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfieldCHR_AP, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel43)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tfieldCHRHP, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel44)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tfieldCHRMaxHP, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel41)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tfieldCHRMP, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel42)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfieldCHRMaxMP, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(tfieldCHRHP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44)
                    .addComponent(tfieldCHRMaxHP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41)
                    .addComponent(tfieldCHRMP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42)
                    .addComponent(tfieldCHRMaxMP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(tfieldCHR_STR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40)
                    .addComponent(tfieldCHR_DEX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37)
                    .addComponent(tfieldCHR_LUK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38)
                    .addComponent(tfieldCHR_INT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45)
                    .addComponent(tfieldCHR_AP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(tfieldCHR_MAP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47)
                    .addComponent(tfieldCHR_MESO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfieldCHRINTRO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel49)
                        .addComponent(tfieldCHR_FAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        tfieldCHRJob.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N

        jLabel31.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N
        jLabel31.setText("角色職業代號");

        jLabel32.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N
        jLabel32.setText("GM權限");

        jComboBoxGM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "否", "是" }));

        btnFindCHRName.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N
        btnFindCHRName.setText("查角色名");
        btnFindCHRName.setToolTipText("");
        btnFindCHRName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindCHRNameActionPerformed(evt);
            }
        });

        jTextSearchCHRName.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N
        jTextSearchCHRName.setText("角色名");
        jTextSearchCHRName.setToolTipText("");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldRecNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(tfieldCHRID, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPrevious2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNext2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUpdate1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete1))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfieldCHRACCID, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxGM, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(168, 168, 168))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addGap(18, 18, 18)
                                .addComponent(tfieldCHRName, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfieldCHRLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfieldCHRJob, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btnFindCHRName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextSearchCHRName, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnUpdate1)
                        .addComponent(btnDelete1))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPrevious2)
                            .addComponent(btnNext2)
                            .addComponent(jTextFieldRecNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfieldCHRID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel15)
                            .addComponent(tfieldCHRACCID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32)
                            .addComponent(jComboBoxGM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(14, 14, 14)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(tfieldCHRName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30)
                    .addComponent(tfieldCHRLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31)
                    .addComponent(tfieldCHRJob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFindCHRName)
                    .addComponent(jTextSearchCHRName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("遊戲角色資料維護", jPanel5);

        labelStatus.setBackground(new java.awt.Color(204, 255, 204));
        labelStatus.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N
        labelStatus.setText("資料庫狀態");

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ConnectButton.setText("連線");
        ConnectButton.setToolTipText("");
        ConnectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConnectButtonActionPerformed(evt);
            }
        });

        ServerIPTextBox.setText("127.0.0.1");

        jLabel18.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N
        jLabel18.setText("伺服器位址");

        jLabel19.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N
        jLabel19.setText("連接埠");

        ServerPortTextBox.setText("3306");

        jLabel20.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N
        jLabel20.setText("資料庫名");
        jLabel20.setToolTipText("");

        DBNameTextbox.setText("maplestory");

        jLabel21.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N
        jLabel21.setText("登入帳號");

        ConUSERTextBox.setText("root");

        jLabel22.setFont(new java.awt.Font("微軟正黑體", 0, 12)); // NOI18N
        jLabel22.setText("登入密碼");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel18)
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(18, 18, 18)
                        .addComponent(ConUSERTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel22)
                        .addGap(18, 18, 18)
                        .addComponent(ConPASSTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(ServerIPTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ServerPortTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DBNameTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(ConnectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ServerIPTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18)
                            .addComponent(ServerPortTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)
                            .addComponent(DBNameTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ConUSERTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21)
                            .addComponent(ConPASSTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(ConnectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("帳戶及角色");
        jTabbedPane1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void showRecord2() throws SQLException {

        tfieldCHRID.setText(rs_2.getObject(1).toString());
        tfieldCHRACCID.setText(rs_2.getObject(2).toString());

        if (Integer.parseInt(rs_2.getObject(26).toString()) > 0) {
            jComboBoxGM.setSelectedIndex(1);
        } else {
            jComboBoxGM.setSelectedIndex(0);
        }

        tfieldCHRName.setText(rs_2.getObject(4).toString());
        tfieldCHRLevel.setText(rs_2.getObject(5).toString());

        tfieldCHRJob.setText(rs_2.getObject(17).toString());

        //還沒進去遊戲，楓幣會是null型態  應該吧ㄎㄎ
        if (!(rs_2.getString("meso") == null)) {
            tfieldCHR_MESO.setText(rs_2.getString("meso"));
        } else {
            tfieldCHR_MESO.setText("0");
        }

        tfieldCHRHP.setText(rs_2.getString("HP"));
        tfieldCHRMaxHP.setText(rs_2.getString("MaxHP"));
        tfieldCHRMP.setText(rs_2.getString("MP"));
        tfieldCHRMaxMP.setText(rs_2.getString("MaxMP"));

        tfieldCHR_STR.setText(rs_2.getString("str"));
        tfieldCHR_DEX.setText(rs_2.getString("dex"));
        tfieldCHR_LUK.setText(rs_2.getString("luk"));
        tfieldCHR_INT.setText(rs_2.getString("int"));
        tfieldCHR_AP.setText(rs_2.getString("ap"));

        tfieldCHR_MAP.setText(rs_2.getString("map"));
        tfieldCHR_MESO.setText(rs_2.getString("meso"));
        tfieldCHR_FAME.setText(rs_2.getString("fame"));
        tfieldCHRINTRO.setText(rs_2.getString("charmessage"));

        String msg = String.format("第%d / %d筆", rs_2.getRow(), numRows2);
        jTextFieldRecNo1.setText(msg);

    }

    private void showRecord() throws SQLException {

        tfieldID.setText(rs_character.getObject(1).toString());
        tfieldStName.setText(rs_character.getObject(2).toString());
        if (Boolean.parseBoolean(rs_character.getObject(7).toString())) {
            tfielOnlineStat.setText("線上");
        } else {
            tfielOnlineStat.setText("離線");
        }

        tfielLastlogon.setText(rs_character.getObject(8).toString());
        tfielCreateTime.setText(rs_character.getObject(9).toString());

        if (Boolean.parseBoolean(rs_character.getObject(11).toString())) {
            jComboBoxBaned.setSelectedIndex(1);
        } else {
            jComboBoxBaned.setSelectedIndex(0);
        }

        tfielEmail.setText(rs_character.getObject(14).toString());

        //還沒進去商城，點數會是null型態
        if (!(rs_character.getObject(18) == null)) {
            tfielGASH.setText(rs_character.getObject(18).toString());
        } else {
            tfielGASH.setText("0");
        }
        if (!(rs_character.getObject(19) == null)) {
            tfielMPoint.setText(rs_character.getObject(19).toString());
        } else {
            tfielMPoint.setText("0");
        }

        String msg = String.format("第%d / %d筆", rs_character.getRow(), numRows);
        jTextFieldRecNo.setText(msg);
    }
    private void ConnectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConnectButtonActionPerformed
        // TODO add your handling code here:
        if (ConnectButton.getText().equals("連線")) {

            ServerIP = ServerIPTextBox.getText();
            ServerPort = ServerPortTextBox.getText();
            DATABASE_NAME = DBNameTextbox.getText();

            Connect_USER = ConUSERTextBox.getText();
            Connect_PASSWORD = ConPASSTextbox.getText();

            //不採用characterEncoding=UTF-8 中文角色會查詢找不到
            DB_URL = "jdbc:mysql://" + ServerIP + ":" + ServerPort + "/" + DATABASE_NAME + "?characterEncoding=UTF-8&useSSL=false";
            con = null;

            sta = null;
            sta_ = null;
            sta_2 = null;

            rs_character = null;
            rs_ = null;
            rs_2 = null;

            int OnlineCount = 0;

            try {
                con = DriverManager.getConnection(DB_URL, Connect_USER, Connect_PASSWORD);
                sta = con.createStatement();
                sta_ = con.createStatement();
                sta_2 = con.createStatement();

                rs_character = sta.executeQuery("SELECT * FROM accounts WHERE loggedin='2'");
                rs_character.last();
                OnlineCount = rs_character.getRow();

                JOptionPane.showMessageDialog(rootPane, "MapleStory 資料庫管理端 [連線成功]\n目前共有 " + OnlineCount + " 個帳號在線上");
                System.out.println("MapleStory 資料庫管理端 [連線成功] !!!");
                labelStatus.setText("[連線成功]");
                System.out.println("目前共有 " + OnlineCount + " 個帳號在線上");
                ConnectButton.setText("中斷連線");

                rs_character = sta.executeQuery("SELECT * FROM accounts");
                rs_character.last();
                numRows = rs_character.getRow();
                rs_character.first();
                showRecord();

                rs_2 = sta_2.executeQuery("SELECT * FROM characters");
                rs_2.last();
                numRows2 = rs_2.getRow();
                rs_2.first();
                showRecord2();

            } catch (SQLException ex) {
                System.out.println("資料庫操作出問題:" + ex.toString());
                labelStatus.setText("[連線失敗]");
                ex.printStackTrace();
            }
        } else {

            try {

                rs_character.close();
                rs_.close();;
                rs_2.close();

                sta.close();
                sta_.close();
                sta_2.close();

                con.close();

            } catch (SQLException se) {
                se.printStackTrace();
            } catch (Exception e) {

                e.printStackTrace();
            } finally {
                try {
                    if (sta != null) {
                        sta.close();
                    }
                    if (sta_ != null) {
                        sta_.close();
                    }
                    if (sta_2 != null) {
                        sta_2.close();
                    }
                } catch (SQLException se2) {
                }// 什么都不做
                try {
                    if (con != null) {
                        con.close();
                    }
                } catch (SQLException se) {
                    se.printStackTrace();
                }
            }
            System.out.println("\n---已經斷開資料庫的連線---\n");
            ConnectButton.setText("連線");
            labelStatus.setText("[等待連線]");

        }

    }//GEN-LAST:event_ConnectButtonActionPerformed

    private void btnDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete1ActionPerformed
        // TODO add your handling code here:
        String sql = String.format("DELETE FROM  `characters` WHERE id = '%s';", tfieldCHRID.getText());

        try {
            sta_2.executeUpdate(sql);
            JOptionPane.showMessageDialog(rootPane, "刪除完成");
            System.out.println(" 刪除完成 \n" + sql);
            rs_2 = sta_2.executeQuery("SELECT * FROM characters");
            rs_2.last();
            numRows2 = rs_2.getRow();
            rs_2.first();
            showRecord2();
        } catch (SQLException ex) {
            System.out.println("資料庫操作出問題:" + ex.toString());
        }
    }//GEN-LAST:event_btnDelete1ActionPerformed

    private void btnUpdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate1ActionPerformed
        // TODO add your handling code here:
        int GM = 0;
        if (jComboBoxGM.getSelectedIndex() > 0) {
            GM = 5;
        } else {
            GM = 0;
        }
        //笑死 因為int是SQL的數值保留字，所以必須用`int`表示是欄位名
        String sql = String.format("UPDATE `characters` SET accountid='%s',gm='%d',name = '%s',level='%d',job='%d',HP='%d',MaxHP='%d',MP='%d',MaxMP='%d',str='%d',dex='%d',luk='%d',`int`='%d',ap='%d',map='%d',meso='%d',fame='%d',charmessage='%s' WHERE id = '%d';",
                tfieldCHRACCID.getText(),
                GM,
                tfieldCHRName.getText(),
                Integer.parseInt(tfieldCHRLevel.getText()),
                Integer.parseInt(tfieldCHRJob.getText()),
                Integer.parseInt(tfieldCHRHP.getText()),
                Integer.parseInt(tfieldCHRMaxHP.getText()),
                Integer.parseInt(tfieldCHRMP.getText()),
                Integer.parseInt(tfieldCHRMaxMP.getText()),
                Integer.parseInt(tfieldCHR_STR.getText()),
                Integer.parseInt(tfieldCHR_DEX.getText()),
                Integer.parseInt(tfieldCHR_LUK.getText()),
                Integer.parseInt(tfieldCHR_INT.getText()),
                Integer.parseInt(tfieldCHR_AP.getText()),
                Integer.parseInt(tfieldCHR_MAP.getText()),
                Integer.parseInt(tfieldCHR_MESO.getText()),
                Integer.parseInt(tfieldCHR_FAME.getText()),
                tfieldCHRINTRO.getText(),
                Integer.parseInt(tfieldCHRID.getText()));

        try {
            System.out.println(sql);
            sta_2.executeUpdate(sql);
            rs_2 = sta_2.executeQuery("SELECT * FROM characters");
            JOptionPane.showMessageDialog(rootPane, "更新完成");
            System.out.println(" 更新完成 \n" + sql);
            rs_2.last();
            numRows = rs_2.getRow();
            rs_2.first();
            showRecord2();
        } catch (SQLException ex) {
            System.out.println("資料庫操作出問題:" + ex.toString());
        }
    }//GEN-LAST:event_btnUpdate1ActionPerformed

    private void btnFindAllChrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindAllChrActionPerformed
        // TODO add your handling code here:

        rs_ = null;

        String sql = String.format("Select * from characters Left outer join accounts on characters.accountid = accounts.id");

        //        System.out.println(sql);
        txtAreaStClassDisplay.setText("");
        String GM = "";
        String JOB = "";
        String msg;
        String tmp = "";
        try {
            rs_ = sta_.executeQuery(sql);
            if (rs_.next() == false) {
                JOptionPane.showMessageDialog(rootPane, "查無資料!");
            } else {

                do {
                    if (!(tmp.equals(rs_.getString("name")))) {
                        if (rs_.getString("gm").equals("5")) {
                            GM = "有";
                        } else {
                            GM = "無";
                        }
                        if (rs_.getString("JOB").equals("0")) {
                            JOB = "初心者";
                        }
                        if (rs_.getString("JOB").equals("1000")) {
                            JOB = "貴族";
                        }

                        txtAreaStClassDisplay.append("-------------------------------------------------------------------------\n");

                        msg = String.format("所屬帳號:%s\t 角色名稱:%s\t 角色等級:%s \n", rs_.getString("accounts.name"), rs_.getString("name"), rs_.getString("level"));
                        txtAreaStClassDisplay.append(msg);
                        txtAreaStClassDisplay.append(String.format("力量:%s\t 敏捷:%s\t 幸運:%s\t 智力:%s\n", rs_.getString("str"), rs_.getString("dex"), rs_.getString("luk"), rs_.getString("int")));
                        txtAreaStClassDisplay.append(String.format("血量:%s/%s\t 魔力:%s/%s\t 楓幣:%s\t \n", rs_.getString("hp"), rs_.getString("maxhp"), rs_.getString("mp"), rs_.getString("maxmp"), rs_.getString("meso")));
                        txtAreaStClassDisplay.append(String.format("職業:%s\t GM權限:%s\n", JOB, GM));
                        txtAreaStClassDisplay.append("-------------------------------------------------------------------------\n");
                        //txtAreaStClassDisplay.append(msg);
                    }

                } while (rs_.next());

            }
        } catch (SQLException ex) {
            System.out.println("資料庫操作出問題:" + ex.toString());
        }
    }//GEN-LAST:event_btnFindAllChrActionPerformed

    private void btnFindAllAccPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindAllAccPerformed
        // TODO add your handling code here:

        rs_ = null;

        String sql = String.format("SELECT * FROM accounts;");
        txtAreaStClassDisplay.setText("");
        String msg;

        try {
            rs_ = sta_.executeQuery(sql);

            rs_.first();
            txtAreaStClassDisplay.append("帳號\t在線狀態\t遊戲點數\tEmail\t\t最後登錄時間\n");
            txtAreaStClassDisplay.append("-------------------------------------------------------------------------------------------------\n");
            do {
                String online = "";
                if (rs_.getString("loggedin").equals("2")) {
                    online = "是";
                } else {
                    online = "否";
                }
                msg = String.format("%s\t%s\t%s\t%s\t%s\n", rs_.getString("name"), online, rs_.getString("Acash"), rs_.getString("email"), rs_.getString("lastlogon"));
                txtAreaStClassDisplay.append(msg);
            } while (rs_.next());
            txtAreaStClassDisplay.append("-------------------------------------------------------------------------------------------------\n");

        } catch (SQLException ex) {
            System.out.println("資料庫操作出問題:" + ex.toString());
        }
    }//GEN-LAST:event_btnFindAllAccPerformed

    private void btnFindCHRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindCHRActionPerformed
        rs_ = null;

        String sql = String.format("Select * from characters Left outer join accounts on characters.accountid = accounts.id WHERE characters.name='%s' ", tfieldCHRNAME.getText());

        txtAreaStClassDisplay.setText("");
        String GM = "";
        String JOB = "";
        String msg;
        String tmp = "";
        try {
            rs_ = sta_.executeQuery(sql);
            if (rs_.next() == false) {
                JOptionPane.showMessageDialog(rootPane, "查無角色!");
                return;
            } else {

                do {
                    if (!(tmp.equals(rs_.getString("name")))) {
                        if (rs_.getString("gm").equals("5")) {
                            GM = "有";
                        } else {
                            GM = "無";
                        }
                        if (rs_.getString("JOB").equals("0")) {
                            JOB = "初心者";
                        }
                        if (rs_.getString("JOB").equals("1000")) {
                            JOB = "貴族";
                        }

                        txtAreaStClassDisplay.append("-------------------------------------------------------------------------\n");

                        msg = String.format("所屬帳號:%s\t 角色名稱:%s\t 角色等級:%s \n", rs_.getString("accounts.name"), rs_.getString("name"), rs_.getString("level"));
                        txtAreaStClassDisplay.append(msg);
                        txtAreaStClassDisplay.append(String.format("力量:%s\t 敏捷:%s\t 幸運:%s\t 智力:%s\n", rs_.getString("str"), rs_.getString("dex"), rs_.getString("luk"), rs_.getString("int")));
                        txtAreaStClassDisplay.append(String.format("血量:%s/%s\t 魔力:%s/%s\t 楓幣:%s\t \n", rs_.getString("hp"), rs_.getString("maxhp"), rs_.getString("mp"), rs_.getString("maxmp"), rs_.getString("meso")));
                        txtAreaStClassDisplay.append(String.format("職業:%s\t GM權限:%s\n", JOB, GM));
                        txtAreaStClassDisplay.append("-------------------------------------------------------------------------\n");
                        //txtAreaStClassDisplay.append(msg);
                    }

                } while (rs_.next());

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "資料庫操作出問題:" + ex.toString());
            System.out.println("資料庫操作出問題:" + ex.toString());
        }
    }//GEN-LAST:event_btnFindCHRActionPerformed

    private void btnFindACCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindACCActionPerformed
        rs_ = null;

        String sql = String.format("SELECT * FROM accounts WHERE name='%s'", tfieldACCOUNT.getText());
        txtAreaStClassDisplay.setText("");
        String msg;

        try {
            rs_ = sta_.executeQuery(sql);

            if (rs_.first() == false) {
                JOptionPane.showMessageDialog(rootPane, "查無帳號!");
                return;
            }
            txtAreaStClassDisplay.append("帳號\t在線狀態\t遊戲點數\tEmail\t\t最後登錄時間\n");
            txtAreaStClassDisplay.append("-------------------------------------------------------------------------------------------------\n");
            do {
                String online = "";
                if (rs_.getString("loggedin").equals("2")) {
                    online = "是";
                } else {
                    online = "否";
                }
                msg = String.format("%s\t%s\t%s\t%s\t%s\n", rs_.getString("name"), online, rs_.getString("Acash"), rs_.getString("email"), rs_.getString("lastlogon"));
                txtAreaStClassDisplay.append(msg);
            } while (rs_.next());
            txtAreaStClassDisplay.append("-------------------------------------------------------------------------------------------------\n");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "資料庫操作出問題:" + ex.toString());
            System.out.println("資料庫操作出問題:" + ex.toString());
        }
    }//GEN-LAST:event_btnFindACCActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        String sql = String.format("DELETE FROM  `accounts` WHERE id = '%s';", tfieldID.getText());

        try {
            sta.executeUpdate(sql);
            JOptionPane.showMessageDialog(rootPane, "刪除完成");
            System.out.println(" 刪除完成 \n" + sql);
            rs_character = sta.executeQuery("SELECT * FROM accounts");
            rs_character.last();
            numRows = rs_character.getRow();
            rs_character.first();
            showRecord();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "資料庫操作出問題:" + ex.toString());
            System.out.println("資料庫操作出問題:" + ex.toString());
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        String sql = String.format("UPDATE `accounts` SET name = '%s',lastlogin='%s',createdat='%s',banned='%d',email='%s',ACash='%d',mPoints='%d' WHERE id = '%s';",
                tfieldStName.getText(),
                tfielLastlogon.getText(),
                tfielCreateTime.getText(),
                jComboBoxBaned.getSelectedIndex(),
                tfielEmail.getText(),
                Integer.parseInt(tfielGASH.getText()),
                Integer.parseInt(tfielMPoint.getText()),
                tfieldID.getText());

        try {
            sta.executeUpdate(sql);
            rs_character = sta.executeQuery("SELECT * FROM accounts");
            JOptionPane.showMessageDialog(rootPane, "更新完成");
            System.out.println(" 更新完成 \n" + sql);
            rs_character.last();
            numRows = rs_character.getRow();
            rs_character.first();
            showRecord();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "資料庫操作出問題:" + ex.toString());
            System.out.println("資料庫操作出問題:" + ex.toString());
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        try {
            if (rs_character.next()) {  //rsult.next()會把紀錄指標指到下一筆紀錄 若成功 則回傳true否則回傳false
                showRecord();
            } else {
                rs_character.first();
                showRecord();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "資料庫操作出問題:" + ex.toString());
            System.out.println("資料庫操作出問題:" + ex.toString());
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed

        try {
            if (rs_character.previous()) {
                showRecord();
            } else {
                rs_character.last();
                showRecord();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "資料庫操作出問題:" + ex.toString());
            System.out.println("資料庫操作出問題:" + ex.toString());
        }
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnPrevious2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevious2ActionPerformed
        // TODO add your handling code here:
        try {
            if (rs_2.previous()) {
                showRecord2();
            } else {
                rs_2.last();
                showRecord2();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "資料庫操作出問題:" + ex.toString());
            System.out.println("資料庫操作出問題:" + ex.toString());
        }
    }//GEN-LAST:event_btnPrevious2ActionPerformed

    private void btnNext2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNext2ActionPerformed
        // TODO add your handling code here:
        try {
            if (rs_2.next()) {  //rsult.next()會把紀錄指標指到下一筆紀錄 若成功 則回傳true否則回傳false
                showRecord2();
            } else {
                rs_2.first();
                showRecord2();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "資料庫操作出問題:" + ex.toString());
            System.out.println("資料庫操作出問題:" + ex.toString());
        }
    }//GEN-LAST:event_btnNext2ActionPerformed

    private void btnFindCHRNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindCHRNameActionPerformed
        // TODO add your handling code here:
        rs_ = null;

        String sql = String.format("SELECT * FROM characters WHERE name='%s'", jTextSearchCHRName.getText());
        try {
            rs_ = sta_.executeQuery(sql);

            if (rs_.first()) {
                tfieldCHRID.setText(rs_.getObject(1).toString());
                tfieldCHRACCID.setText(rs_.getObject(2).toString());

                if (Integer.parseInt(rs_.getObject(26).toString()) > 0) {
                    jComboBoxGM.setSelectedIndex(1);
                } else {
                    jComboBoxGM.setSelectedIndex(0);
                }

                tfieldCHRName.setText(rs_.getObject(4).toString());
                tfieldCHRLevel.setText(rs_.getObject(5).toString());

                tfieldCHRJob.setText(rs_.getObject(17).toString());

                //還沒進去遊戲，楓幣會是null型態  應該吧ㄎㄎ
                if (!(rs_.getString("meso") == null)) {
                    tfieldCHR_MESO.setText(rs_.getString("meso"));
                } else {
                    tfieldCHR_MESO.setText("0");
                }

                tfieldCHRHP.setText(rs_.getString("HP"));
                tfieldCHRMaxHP.setText(rs_.getString("MaxHP"));
                tfieldCHRMP.setText(rs_.getString("MP"));
                tfieldCHRMaxMP.setText(rs_.getString("MaxMP"));

                tfieldCHR_STR.setText(rs_.getString("str"));
                tfieldCHR_DEX.setText(rs_.getString("dex"));
                tfieldCHR_LUK.setText(rs_.getString("luk"));
                tfieldCHR_INT.setText(rs_.getString("int"));
                tfieldCHR_AP.setText(rs_.getString("ap"));

                tfieldCHR_MAP.setText(rs_.getString("map"));
                tfieldCHR_MESO.setText(rs_.getString("meso"));
                tfieldCHR_FAME.setText(rs_.getString("fame"));
                tfieldCHRINTRO.setText(rs_.getString("charmessage"));

                String msg = String.format("第%d / %d筆", rs_.getInt("id"), numRows2);
                jTextFieldRecNo1.setText(msg);
            } else {
                JOptionPane.showMessageDialog(rootPane, "查無角色:" + jTextSearchCHRName.getText());
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "資料庫操作出問題:" + ex.toString());
            System.out.println("資料庫操作出問題:" + ex.toString());
        }
    }//GEN-LAST:event_btnFindCHRNameActionPerformed

    private void btnFindCHRName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindCHRName1ActionPerformed
        // TODO add your handling code here:
        rs_ = null;

        String sql = String.format("SELECT * FROM accounts WHERE name='%s'", jTextSearchACCName.getText());
        try {
            rs_ = sta_.executeQuery(sql);

            if (rs_.first()) {
                tfieldID.setText(rs_.getObject(1).toString());
                tfieldStName.setText(rs_.getObject(2).toString());
                if (Boolean.parseBoolean(rs_.getObject(7).toString())) {
                    tfielOnlineStat.setText("線上");
                } else {
                    tfielOnlineStat.setText("離線");
                }

                tfielLastlogon.setText(rs_.getObject(8).toString());
                tfielCreateTime.setText(rs_.getObject(9).toString());

                if (Boolean.parseBoolean(rs_.getObject(11).toString())) {
                    jComboBoxBaned.setSelectedIndex(1);
                } else {
                    jComboBoxBaned.setSelectedIndex(0);
                }

                tfielEmail.setText(rs_.getObject(14).toString());

                //還沒進去商城，點數會是null型態
                if (!(rs_.getObject(18) == null)) {
                    tfielGASH.setText(rs_.getObject(18).toString());
                } else {
                    tfielGASH.setText("0");
                }
                if (!(rs_.getObject(19) == null)) {
                    tfielMPoint.setText(rs_.getObject(19).toString());
                } else {
                    tfielMPoint.setText("0");
                }
                String msg = String.format("第%d / %d筆", rs_.getInt("id"), numRows);
                jTextFieldRecNo.setText(msg);
            } else {
                JOptionPane.showMessageDialog(rootPane, "查無帳號:" + jTextSearchACCName.getText());
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "資料庫操作出問題:" + ex.toString());
            System.out.println("資料庫操作出問題:" + ex.toString());
        }
    }//GEN-LAST:event_btnFindCHRName1ActionPerformed

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
            java.util.logging.Logger.getLogger(Maneger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Maneger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Maneger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Maneger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Maneger().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ConPASSTextbox;
    private javax.swing.JTextField ConUSERTextBox;
    private javax.swing.JButton ConnectButton;
    private javax.swing.JTextField DBNameTextbox;
    private javax.swing.JTextField ServerIPTextBox;
    private javax.swing.JTextField ServerPortTextBox;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDelete1;
    private javax.swing.JButton btnFindACC;
    private javax.swing.JButton btnFindAllAcc;
    private javax.swing.JButton btnFindAllChr;
    private javax.swing.JButton btnFindCHR;
    private javax.swing.JButton btnFindCHRName;
    private javax.swing.JButton btnFindCHRName1;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnNext2;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnPrevious2;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUpdate1;
    private javax.swing.JComboBox<String> jComboBoxBaned;
    private javax.swing.JComboBox<String> jComboBoxGM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextFieldRecNo;
    private javax.swing.JTextField jTextFieldRecNo1;
    private javax.swing.JTextField jTextSearchACCName;
    private javax.swing.JTextField jTextSearchCHRName;
    private javax.swing.JLabel labelStatus;
    private javax.swing.JTextField tfielCreateTime;
    private javax.swing.JTextField tfielEmail;
    private javax.swing.JTextField tfielGASH;
    private javax.swing.JTextField tfielLastlogon;
    private javax.swing.JTextField tfielMPoint;
    private javax.swing.JTextField tfielOnlineStat;
    private javax.swing.JTextField tfieldACCOUNT;
    private javax.swing.JTextField tfieldCHRACCID;
    private javax.swing.JTextField tfieldCHRHP;
    private javax.swing.JTextField tfieldCHRID;
    private javax.swing.JTextField tfieldCHRINTRO;
    private javax.swing.JTextField tfieldCHRJob;
    private javax.swing.JTextField tfieldCHRLevel;
    private javax.swing.JTextField tfieldCHRMP;
    private javax.swing.JTextField tfieldCHRMaxHP;
    private javax.swing.JTextField tfieldCHRMaxMP;
    private javax.swing.JTextField tfieldCHRNAME;
    private javax.swing.JTextField tfieldCHRName;
    private javax.swing.JTextField tfieldCHR_AP;
    private javax.swing.JTextField tfieldCHR_DEX;
    private javax.swing.JTextField tfieldCHR_FAME;
    private javax.swing.JTextField tfieldCHR_INT;
    private javax.swing.JTextField tfieldCHR_LUK;
    private javax.swing.JTextField tfieldCHR_MAP;
    private javax.swing.JTextField tfieldCHR_MESO;
    private javax.swing.JTextField tfieldCHR_STR;
    private javax.swing.JTextField tfieldID;
    private javax.swing.JTextField tfieldStName;
    private javax.swing.JTextArea txtAreaStClassDisplay;
    // End of variables declaration//GEN-END:variables
}
