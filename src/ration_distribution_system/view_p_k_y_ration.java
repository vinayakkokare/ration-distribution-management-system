package ration_distribution_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

public class view_p_k_y_ration extends javax.swing.JFrame {

    public view_p_k_y_ration() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        kyration = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        kyration.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RationCardNo", "Name", "FamilyMembers"
            }
        ));
        jScrollPane1.setViewportView(kyration);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
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

            String query = "SELECT RationCardNo, Name, FamilyMembers FROM public WHERE RationCardNo = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, RationCardNo);
            ResultSet resultSet = statement.executeQuery();

            DefaultTableModel model = (DefaultTableModel) kyration.getModel();
            model.setRowCount(0); 

            boolean hasRecords = false;
            while (resultSet.next()) {
                hasRecords = true;
                String rationNo = resultSet.getString("RationCardNo");
                String name = resultSet.getString("Name");
                String familyMembers = resultSet.getString("FamilyMembers");

                model.addRow(new Object[]{rationNo, name, familyMembers});
            }

            if (!hasRecords) {
                JOptionPane.showMessageDialog(this, "No details found for Ration Card: " + RationCardNo);
            }

            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error fetching details: " + e.getMessage());
        }
    
    }//GEN-LAST:event_formComponentShown

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                view_p_k_y_ration obj_10 = new view_p_k_y_ration();
                obj_10.setVisible(true);
                obj_10.setLocationRelativeTo(null);
                obj_10.setTitle("Ration Distribution System");
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable kyration;
    // End of variables declaration//GEN-END:variables
}
