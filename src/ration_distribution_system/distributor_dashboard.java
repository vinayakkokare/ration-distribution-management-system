package ration_distribution_system;

import java.awt.BorderLayout;
import javax.swing.*;
import java.sql.*;

public class distributor_dashboard extends javax.swing.JFrame {

    public distributor_dashboard() {
        initComponents();
        setSize(805, 535);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        top = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        main = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ration Distrubuter System");
        getContentPane().setLayout(null);

        top.setBackground(new java.awt.Color(255, 204, 0));
        top.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        top.setPreferredSize(new java.awt.Dimension(800, 200));

        jLabel2.setBackground(new java.awt.Color(255, 204, 0));
        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel2.setText("              DISTRIBUTOR DASHBOARD");

        javax.swing.GroupLayout topLayout = new javax.swing.GroupLayout(top);
        top.setLayout(topLayout);
        topLayout.setHorizontalGroup(
            topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(157, Short.MAX_VALUE))
        );
        topLayout.setVerticalGroup(
            topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
        );

        getContentPane().add(top);
        top.setBounds(0, 0, 800, 100);

        main.setBackground(new java.awt.Color(255, 255, 255));
        main.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        main.setPreferredSize(new java.awt.Dimension(800, 400));

        jButton1.setBackground(new java.awt.Color(0, 255, 255));
        jButton1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\VINAYAK\\Downloads\\icons8-add-shopping-cart-80.png")); // NOI18N
        jButton1.setText("ADD STOCK");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 255, 255));
        jButton2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\VINAYAK\\Downloads\\icons8-update-done-64.png")); // NOI18N
        jButton2.setText("UPDATE STOCK");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 255, 255));
        jButton3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\VINAYAK\\Downloads\\icons8-eye-50.png")); // NOI18N
        jButton3.setText("VIEW STOCK");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 255, 255));
        jButton4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\VINAYAK\\Downloads\\icons8-history-64.png")); // NOI18N
        jButton4.setText("VIEW TRANSACTIONS");
        jButton4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(51, 255, 0));
        jButton5.setFont(new java.awt.Font("Lucida Console", 1, 12)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon("C:\\Users\\VINAYAK\\Downloads\\icons8-sell-64.png")); // NOI18N
        jButton5.setText("DISTRIBUTE");
        jButton5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 153, 255));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton6.setText("LOGOUT");
        jButton6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainLayout = new javax.swing.GroupLayout(main);
        main.setLayout(mainLayout);
        mainLayout.setHorizontalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE))
                .addGap(87, 87, 87))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(282, 282, 282))
        );
        mainLayout.setVerticalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLayout.createSequentialGroup()
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(33, 33, 33))
        );

        getContentPane().add(main);
        main.setBounds(0, 100, 800, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String stockName = JOptionPane.showInputDialog(this, "Enter Stock Name:");
        int quantity = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter Quantity:"));

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ration_card?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root");
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO stock (stock_name, quantity) VALUES (?, ?)");

            stmt.setString(1, stockName);
            stmt.setInt(2, quantity);
            stmt.executeUpdate();

            try (PreparedStatement transactionStmt = conn.prepareStatement("INSERT INTO transactions (stock_id, transaction_type, quantity) VALUES (LAST_INSERT_ID(), 'add', ?)")) {
                transactionStmt.setInt(1, quantity);
                transactionStmt.executeUpdate();
            }
            JOptionPane.showMessageDialog(this, "Stock added successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int stockId = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter Stock ID to Update:"));
        int newQuantity = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter New Quantity:"));

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ration_card?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root");
            PreparedStatement stmt = conn.prepareStatement("UPDATE stock SET quantity = quantity + ? WHERE stock_id = ?");

            stmt.setInt(1, newQuantity);
            stmt.setInt(2, stockId);
            stmt.executeUpdate();

            try (PreparedStatement transactionStmt = conn.prepareStatement("INSERT INTO transactions (stock_id, transaction_type, quantity) VALUES (?, 'update', ?)")) {
                transactionStmt.setInt(1, stockId);
                transactionStmt.setInt(2, newQuantity);
                transactionStmt.executeUpdate();
            }

            JOptionPane.showMessageDialog(this, "Stock updated successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        view_stock obj6 = new view_stock();
        obj6.setLocationRelativeTo(null);
        obj6.setTitle("Ration Distribution System");

        obj6.setVisible(true);


    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String url = "jdbc:mysql://localhost:3306/ration_card?zeroDateTimeBehavior=CONVERT_TO_NULL";
        String username = "root";
        String password = "root";

        try {
            String rationCardNumber = JOptionPane.showInputDialog(this, "Enter Ration Card Number:");
            int stockID = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter Stock ID:"));
            int quantity = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter Quantity to Distribute:"));

            Connection connection = DriverManager.getConnection(url, username, password);

            String checkUserQuery = "SELECT name, allocated_stock_ids, total_allocated_quantity FROM public WHERE RationCardNo = ?";
            PreparedStatement checkUserStmt = connection.prepareStatement(checkUserQuery);
            checkUserStmt.setString(1, rationCardNumber);
            ResultSet userResult = checkUserStmt.executeQuery();

            if (!userResult.next()) {
                JOptionPane.showMessageDialog(this, "Ration card not found: " + rationCardNumber);
                return;
            }

            String allocatedStockIds = userResult.getString("allocated_stock_ids");
            int totalAllocatedQuantity = userResult.getInt("total_allocated_quantity");

            String checkStockQuery = "SELECT quantity, stock_name FROM stock WHERE stock_id = ?";
            PreparedStatement checkStockStmt = connection.prepareStatement(checkStockQuery);
            checkStockStmt.setInt(1, stockID);
            ResultSet stockResult = checkStockStmt.executeQuery();

            if (stockResult.next()) {
                int availableQuantity = stockResult.getInt("quantity");
                String stockName = stockResult.getString("stock_name");

                if (availableQuantity < quantity) {
                    JOptionPane.showMessageDialog(this, "Insufficient stock available for: " + stockName);
                    return;
                }

                String updateStockQuery = "UPDATE stock SET quantity = quantity - ? WHERE stock_id = ?";
                PreparedStatement updateStockStmt = connection.prepareStatement(updateStockQuery);
                updateStockStmt.setInt(1, quantity);
                updateStockStmt.setInt(2, stockID);
                updateStockStmt.executeUpdate();

                String logTransactionQuery = "INSERT INTO transactions (stock_id, transaction_type, quantity, RationCardNo) VALUES (?, 'distribute', ?, ?)";
                PreparedStatement transactionStmt = connection.prepareStatement(logTransactionQuery);
                transactionStmt.setInt(1, stockID);
                transactionStmt.setInt(2, quantity);
                transactionStmt.setString(3, rationCardNumber);
                transactionStmt.executeUpdate();

                allocatedStockIds = (allocatedStockIds == null || allocatedStockIds.isEmpty())
                        ? String.valueOf(stockID)
                        : allocatedStockIds + "," + stockID;
                totalAllocatedQuantity += quantity;

                String updateUserQuery = "UPDATE public SET allocated_stock_ids = ?, total_allocated_quantity = ? WHERE RationCardNo = ?";
                PreparedStatement updateUserStmt = connection.prepareStatement(updateUserQuery);
                updateUserStmt.setString(1, allocatedStockIds);
                updateUserStmt.setInt(2, totalAllocatedQuantity);
                updateUserStmt.setString(3, rationCardNumber);
                updateUserStmt.executeUpdate();

                JOptionPane.showMessageDialog(this, "Stock distributed successfully for Ration Card: " + rationCardNumber);
            } else {
                JOptionPane.showMessageDialog(this, "Stock not found for Stock ID: " + stockID);
            }

            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "An error occurred: " + e.getMessage());
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        view_transactions obj7 = new view_transactions();
        obj7.setVisible(true);
        obj7.setLocationRelativeTo(null);
        obj7.setTitle("Ration Distribution System");


    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        dispose();
        role_distributor obj2 = new role_distributor();
        obj2.setLocationRelativeTo(null);
        obj2.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                distributor_dashboard obj4 = new distributor_dashboard();
                obj4.setLocationRelativeTo(null);
                obj4.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel main;
    private javax.swing.JPanel top;
    // End of variables declaration//GEN-END:variables
}
