package ration_distribution_system;

import java.awt.Color;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class view_p_transactions extends javax.swing.JFrame {

    public view_p_transactions() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tbltranshistory = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbltranshistory1 = new javax.swing.JTable();

        tbltranshistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "transaction_id", "stock_id", "transaction_history", "quantity", "transaction_date"
            }
        ));
        jScrollPane2.setViewportView(tbltranshistory);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        tbltranshistory1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tbltranshistory1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "transaction_id", "stock_id", "quantity", "transaction_date"
            }
        ));
        jScrollPane3.setViewportView(tbltranshistory1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown

    }//GEN-LAST:event_formComponentShown

    public void updateTable(ResultSet resultSet) {
        try {
            DefaultTableModel model = (DefaultTableModel) tbltranshistory1.getModel();
            model.setRowCount(0);

            while (resultSet.next()) {
                 String transaction_id = resultSet.getString("transaction_id");
                String stock_id = resultSet.getString("stock_id");
                String quantity = resultSet.getString("quantity");      
                String transaction_date = resultSet.getString("transaction_date");    

                model.addRow(new Object[]{transaction_id,stock_id, quantity,transaction_date});
            }

            tbltranshistory1.setShowHorizontalLines(true);
            tbltranshistory1.setShowVerticalLines(true);
            tbltranshistory1.setGridColor(Color.BLUE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                view_p_transactions obj8 = new view_p_transactions();
                obj8.setVisible(true);
                obj8.setLocationRelativeTo(null);
                obj8.setTitle("Ration Distribution System");
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JTable tbltranshistory;
    public javax.swing.JTable tbltranshistory1;
    // End of variables declaration//GEN-END:variables
}