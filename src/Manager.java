
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mahmoud
 */
public class Manager extends javax.swing.JFrame {

    /**
     * Creates new form Manager
     */
    database db = new database();

    public Manager() throws SQLException {
        initComponents();
        itemscombo.addItem("");
        workerscombo.addItem("");
        String query = "SELECT * FROM items where itemName!='GAMES' ";
        ResultSet res = db.Getdata(query);
        while (res.next()) {
            String I = res.getString("itemName");
            itemscombo.addItem(I);
        }
        String query1 = "SELECT * FROM users where usertype!=1 ";
        ResultSet res1 = db.Getdata(query1);
        while (res1.next()) {
            String I = res1.getString("username");
            workerscombo.addItem(I);
        }
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
        jLabel3 = new javax.swing.JLabel();
        itemscombo = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        itemnametxt = new javax.swing.JTextField();
        pricetxt = new javax.swing.JTextField();
        quantitytxt = new javax.swing.JTextField();
        additemBtn = new javax.swing.JButton();
        deleteitemBtn = new javax.swing.JButton();
        edititemBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        workerscombo = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        nametxt = new javax.swing.JTextField();
        usernametxt = new javax.swing.JTextField();
        passwordtxt = new javax.swing.JTextField();
        phonetxt = new javax.swing.JTextField();
        addresstxt = new javax.swing.JTextField();
        salarytxt = new javax.swing.JTextField();
        deleteworkerBtn = new javax.swing.JButton();
        editworkerBtn = new javax.swing.JButton();
        addworkerBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        Workerbutton = new javax.swing.JButton();
        LogoutB1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 153));
        jLabel3.setText("Items");

        itemscombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemscomboActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 102));
        jLabel4.setText("Item Name:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 0, 102));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Price:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 0, 102));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Quantity:");

        itemnametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemnametxtActionPerformed(evt);
            }
        });

        additemBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        additemBtn.setForeground(new java.awt.Color(153, 0, 153));
        additemBtn.setText("Add");
        additemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                additemBtnActionPerformed(evt);
            }
        });

        deleteitemBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        deleteitemBtn.setForeground(new java.awt.Color(153, 0, 153));
        deleteitemBtn.setText("Delete");
        deleteitemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteitemBtnActionPerformed(evt);
            }
        });

        edititemBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edititemBtn.setForeground(new java.awt.Color(153, 0, 153));
        edititemBtn.setText("Edit");
        edititemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edititemBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(itemscombo, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(additemBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(edititemBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(deleteitemBtn)))
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(pricetxt))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(itemnametxt))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(quantitytxt)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(itemscombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pricetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantitytxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edititemBtn)
                    .addComponent(additemBtn)
                    .addComponent(deleteitemBtn))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 153));
        jLabel1.setText("Workers");

        workerscombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                workerscomboActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Full Name:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Username:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Password:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 0, 102));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Phone Number:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 0, 102));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Address:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 0, 102));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Salary:");

        nametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nametxtActionPerformed(evt);
            }
        });

        passwordtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordtxtActionPerformed(evt);
            }
        });

        deleteworkerBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        deleteworkerBtn.setForeground(new java.awt.Color(153, 0, 153));
        deleteworkerBtn.setText("Delete");
        deleteworkerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteworkerBtnActionPerformed(evt);
            }
        });

        editworkerBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        editworkerBtn.setForeground(new java.awt.Color(153, 0, 153));
        editworkerBtn.setText("Edit");
        editworkerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editworkerBtnActionPerformed(evt);
            }
        });

        addworkerBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addworkerBtn.setForeground(new java.awt.Color(153, 0, 153));
        addworkerBtn.setText("Add");
        addworkerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addworkerBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nametxt)
                            .addComponent(usernametxt)
                            .addComponent(passwordtxt)
                            .addComponent(phonetxt)
                            .addComponent(addresstxt)
                            .addComponent(salarytxt))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addworkerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(editworkerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(deleteworkerBtn)
                .addGap(27, 27, 27))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(workerscombo, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(workerscombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nametxt, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phonetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addresstxt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salarytxt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteworkerBtn)
                    .addComponent(editworkerBtn)
                    .addComponent(addworkerBtn))
                .addContainerGap())
        );

        Workerbutton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Workerbutton.setForeground(new java.awt.Color(153, 0, 153));
        Workerbutton.setText("Act as a worker");
        Workerbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WorkerbuttonActionPerformed(evt);
            }
        });

        LogoutB1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LogoutB1.setForeground(new java.awt.Color(153, 0, 153));
        LogoutB1.setText("Logout");
        LogoutB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutB1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Workerbutton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LogoutB1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LogoutB1)
                    .addComponent(Workerbutton))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editworkerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editworkerBtnActionPerformed
        String username = workerscombo.getSelectedItem().toString();
        String query2 = "SELECT * FROM `users` where `username`= '" + username + "'";
        ResultSet res2 = db.Getdata(query2);
        try {
            if (res2.next()) {
                String usernamemodified = usernametxt.getText();
                int userid = res2.getInt("userId");
                String name = nametxt.getText();
                String address = addresstxt.getText();
                String password = passwordtxt.getText();
                try {
                    password = AESCrypt.encrypt(password);
                } catch (Exception ex) {
                    Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
                }
                String phone = phonetxt.getText();
                int salary = Integer.parseInt(salarytxt.getText());
                query2 = "UPDATE `users` SET `name`='" + name + "',`username`='" + usernamemodified + "',`password`='" + password + "',`phoneNumber`='" + phone + "',`address`='" + address + "',`salary`=" + salary + ",`usertype`=0 WHERE `userId`=" + userid;
                try {
                    db.AddDataBase(query2);
                    Manager anotherframe = new Manager();
                    anotherframe.pack();
                    anotherframe.setVisible(true);
                    dispose();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Username already exists!");
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_editworkerBtnActionPerformed

    private void edititemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edititemBtnActionPerformed
        String item = itemnametxt.getText();
        String query2 = "SELECT * FROM `items` where `itemName`= '" + item + "'";
        ResultSet res2 = db.Getdata(query2);
        try {
            if (res2.next()) {
                int itemid = res2.getInt("itemId");
                String name = itemnametxt.getText();
                float price = Float.parseFloat(pricetxt.getText());
                int quantity = Integer.parseInt(quantitytxt.getText());
                query2 = "UPDATE `items` SET `itemName`='" + name + "',`price`=" + price + ",`quantity`=" + quantity + " WHERE `itemId`=" + itemid;
                db.AddDataBase(query2);
                Manager anotherframe = new Manager();
                anotherframe.pack();
                anotherframe.setVisible(true);
                dispose();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_edititemBtnActionPerformed

    private void deleteitemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteitemBtnActionPerformed
        String item = itemnametxt.getText();
        String query2 = "SELECT * FROM `items` where `itemName`= '" + item + "'";
        ResultSet res2 = db.Getdata(query2);
        try {
            if (res2.next()) {
                int itemid = res2.getInt("itemId");
                query2 = "DELETE FROM `items` WHERE `itemId`=" + itemid;
                db.AddDataBase(query2);
                Manager anotherframe = new Manager();
                anotherframe.pack();
                anotherframe.setVisible(true);
                dispose();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_deleteitemBtnActionPerformed

    private void workerscomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_workerscomboActionPerformed
        String username = workerscombo.getSelectedItem().toString();
        String query2 = "SELECT * FROM `users` where `username`= '" + username + "'";
        ResultSet res2 = db.Getdata(query2);
        try {
            if (res2.next()) {
                String name = res2.getString("name");
                String address = res2.getString("address");
                String phone = res2.getString("phoneNumber");
                String password = res2.getString("password");
                String salary = res2.getString("salary");
                usernametxt.setText(username);
                nametxt.setText(name);
                try {
                    passwordtxt.setText(AESCrypt.decrypt(password));
                } catch (Exception ex) {
                    Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
                }
                phonetxt.setText(phone);
                salarytxt.setText(salary);
                addresstxt.setText(address);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_workerscomboActionPerformed

    private void itemscomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemscomboActionPerformed
        String item = itemscombo.getSelectedItem().toString();
        String query2 = "SELECT * FROM `items` where `itemName`= '" + item + "'";
        ResultSet res2 = db.Getdata(query2);
        try {
            if (res2.next()) {
                String price = res2.getString("price");
                String quantity = res2.getString("quantity");
                itemnametxt.setText(item);
                pricetxt.setText(price);
                quantitytxt.setText(quantity);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_itemscomboActionPerformed

    private void nametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nametxtActionPerformed

    private void itemnametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemnametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemnametxtActionPerformed

    private void addworkerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addworkerBtnActionPerformed
        try {
            String name = nametxt.getText();
            String username = usernametxt.getText();
            String address = addresstxt.getText();
            String password = passwordtxt.getText();
            try {
                password = AESCrypt.encrypt(password);
            } catch (Exception ex) {
                Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
            }
            String phone = phonetxt.getText();
            int salary = Integer.parseInt(salarytxt.getText());
            String query3 = "INSERT INTO `users`(`name`, `username`, `password`, `phoneNumber`, `address`, `salary`, `usertype`) VALUES ('" + name + "','" + username + "','" + password + "','" + phone + "','" + address + "'," + salary + ",0)";
            db.AddDataBase(query3);
            Manager anotherframe = new Manager();
            anotherframe.pack();
            anotherframe.setVisible(true);
            dispose();
        } catch (SQLException ex) {
            Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addworkerBtnActionPerformed

    private void additemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_additemBtnActionPerformed
        try {
            String name = itemnametxt.getText();
            float price = Float.parseFloat(pricetxt.getText());
            int quantity = Integer.parseInt(quantitytxt.getText());
            String query3 = "INSERT INTO `items`(`itemName`, `price`, `quantity`) VALUES ('" + name + "'," + price + "," + quantity + ")";
            db.AddDataBase(query3);
            Manager anotherframe = new Manager();
            anotherframe.pack();
            anotherframe.setVisible(true);
            dispose();
        } catch (SQLException ex) {
            Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_additemBtnActionPerformed

    private void deleteworkerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteworkerBtnActionPerformed
        String username = usernametxt.getText();
        String query2 = "SELECT * FROM `users` where `username`= '" + username + "'";
        ResultSet res2 = db.Getdata(query2);
        try {
            if (res2.next()) {
                int userid = res2.getInt("userId");
                query2 = "DELETE FROM `users` WHERE `userId`=" + userid;
                db.AddDataBase(query2);
                Manager anotherframe = new Manager();
                anotherframe.pack();
                anotherframe.setVisible(true);
                dispose();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_deleteworkerBtnActionPerformed

    private void passwordtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordtxtActionPerformed

    private void WorkerbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WorkerbuttonActionPerformed
        tables anotherframe = new tables();
        anotherframe.pack();
        anotherframe.setVisible(true);
        dispose();
    }//GEN-LAST:event_WorkerbuttonActionPerformed

    private void LogoutB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutB1ActionPerformed
        loginGui anotherframe = new loginGui();
        anotherframe.pack();
        anotherframe.setVisible(true);
        dispose();
    }//GEN-LAST:event_LogoutB1ActionPerformed

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
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Manager().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogoutB1;
    private javax.swing.JButton Workerbutton;
    private javax.swing.JButton additemBtn;
    private javax.swing.JTextField addresstxt;
    private javax.swing.JButton addworkerBtn;
    private javax.swing.JButton deleteitemBtn;
    private javax.swing.JButton deleteworkerBtn;
    private javax.swing.JButton edititemBtn;
    private javax.swing.JButton editworkerBtn;
    private javax.swing.JTextField itemnametxt;
    private javax.swing.JComboBox itemscombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField nametxt;
    private javax.swing.JTextField passwordtxt;
    private javax.swing.JTextField phonetxt;
    private javax.swing.JTextField pricetxt;
    private javax.swing.JTextField quantitytxt;
    private javax.swing.JTextField salarytxt;
    private javax.swing.JTextField usernametxt;
    private javax.swing.JComboBox workerscombo;
    // End of variables declaration//GEN-END:variables
}
