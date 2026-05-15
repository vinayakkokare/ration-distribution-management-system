package ration_distribution_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class view_p_allocated_his extends javax.swing.JFrame {

    public view_p_allocated_his() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        allocated_his = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        allocated_his.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RationCardNo", "allocated_stock_ids", "total_allocated_quantity"
            }
        ));
        jScrollPane1.setViewportView(allocated_his);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        String url = "jdbc:mysql://localhost:3306/ration_card?zeroDateTimeBehavior=CONVERT_TO_NULL";
        String username = "root";
        String password = "root";

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            String RationCardNo = JOptionPane.showInputDialog(this, "Enter Ration Card Number:");

            String query = "SELECT RationCardNo, allocated_stock_ids, total_allocated_quantity FROM public WHERE RationCardNo = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, RationCardNo);
            ResultSet resultSet = statement.executeQuery();

            DefaultTableModel model = (DefaultTableModel) allocated_his.getModel();
            model.setRowCount(0);

            boolean hasTransactions = false;
            while (resultSet.next()) {
                hasTransactions = true;
                String rationNo = resultSet.getString("RationCardNo");
                String stockIds = resultSet.getString("allocated_stock_ids");
                String totalQty = resultSet.getString("total_allocated_quantity");
                model.addRow(new Object[]{rationNo, stockIds, totalQty});
            }

            if (!hasTransactions) {
                JOptionPane.showMessageDialog(this, "No transactions found for Ration Card: " + RationCardNo);
            }

            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error fetching allocated stock: " + e.getMessage());
        }
    
    }//GEN-LAST:event_formComponentShown

public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                view_p_allocated_his obj_9 = new view_p_allocated_his();
                obj_9.setVisible(true);
                obj_9.setLocationRelativeTo(null);
                obj_9.setTitle("Ration Distribution System");
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable allocated_his;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
