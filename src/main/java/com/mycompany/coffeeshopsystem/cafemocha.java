/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.coffeeshopsystem;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.geom.RoundRectangle2D;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Karl
 */
public class cafemocha extends javax.swing.JFrame {

    public String format;
    public String itemStrFr;
    public cafemocha() {
        initComponents();
        getData();
        pricelbl.setText((String) dataArray[5][2]);
        itemStrFr = (String) dataArray[5][0];
        String[] splitData = itemStrFr.split(" ");
        String formattedData = "<html>" + splitData[0] + " " + splitData[1] + "</html>";
        namelbl.setText(formattedData);
        this.addComponentListener(new ComponentAdapter() {
               @Override
                public void componentResized(ComponentEvent e) {
                    setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 80, 80));
                }
            });
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        namelbl = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pricelbl = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        spin4 = new javax.swing.JSpinner();
        backButton = new com.mycompany.coffeeshopsystem.button();
        purchaseB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(197, 186, 170));

        jPanel2.setBackground(new java.awt.Color(128, 109, 97));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\hunny\\Desktop\\CoffeeShopSystem-master\\CoffeeShopSystem-master\\icons\\coffee\\cafe-mocha-250.png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(10, 10, 10))
        );

        jLabel4.setFont(new java.awt.Font("HelveticaNowDisplay Bold", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(44, 44, 44));
        jLabel4.setText("Espresso shot with steamed,");

        namelbl.setFont(new java.awt.Font("HelveticaNowDisplay Bold", 0, 30)); // NOI18N
        namelbl.setForeground(new java.awt.Color(44, 44, 44));

        jLabel5.setBackground(new java.awt.Color(51, 51, 51));
        jLabel5.setFont(new java.awt.Font("HelveticaNowDisplay Bold", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(44, 44, 44));
        jLabel5.setText("foam and cinnamon powder.");

        pricelbl.setBackground(new java.awt.Color(51, 51, 51));
        pricelbl.setFont(new java.awt.Font("HelveticaNowDisplay Bold", 0, 20)); // NOI18N
        pricelbl.setForeground(new java.awt.Color(44, 44, 44));

        jLabel7.setBackground(new java.awt.Color(51, 51, 51));
        jLabel7.setFont(new java.awt.Font("HelveticaNowDisplay Bold", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(44, 44, 44));
        jLabel7.setText("Quantity");

        spin4.setFont(new java.awt.Font("HelveticaNowDisplay Bold", 0, 12)); // NOI18N
        spin4.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        spin4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        spin4.setFocusable(false);
        spin4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spin4StateChanged(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        purchaseB.setBackground(new java.awt.Color(80, 109, 132));
        purchaseB.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        purchaseB.setForeground(new java.awt.Color(255, 255, 255));
        purchaseB.setText("Purchase");
        purchaseB.setEnabled(false);
        purchaseB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(namelbl)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(pricelbl)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(spin4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(purchaseB)))
                .addGap(0, 21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(namelbl)
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pricelbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(spin4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(purchaseB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 79, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    static int totalval = 0;
    static int pressB = 0;
    private static double price1;
    private static double itotal5 = 0;
    
     void insertDB(){
         String coffee = "Cafe Mocha";
         int valueSpin1 = (int) spin4.getValue();
         getData();
         for(int i = 0; i < dataArray.length; i++){
             if(dataArray[i][0].equals("Cafe Mocha")){
                 price1 = Double.parseDouble((String) dataArray[5][2]);
             }
         }
         totalval += valueSpin1;
         System.out.println(totalval);
                 
          
         itotal5 = price1;
         itotal5 *= totalval;
         
         
         
         
      try{
          if(pressB == 1){
              if(valueSpin1 == 0){
              JOptionPane.showMessageDialog(null,"NO QUANTITY ADDED");
          }else{
                  try{
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/coffeeshop?useSSL=false", "root", "admin512003khimura54321!");

                        String sql = "insert into coffee(Item,Qty,Price)values(?,?,?)";
                        PreparedStatement pst = con.prepareStatement(sql);

                        pst.setString(1,coffee);
                        pst.setString(2,Integer.toString(valueSpin1));
                        pst.setString(3,Double.toString(itotal5));


                        pst.executeUpdate();

                        JOptionPane.showMessageDialog(null, "Item Added!");
                        con.close();
                  }catch(Exception e){
                      JOptionPane.showMessageDialog(null,e);
                  }
           
              }
          }else if(pressB >= 1){
              if(valueSpin1 == 0){
              JOptionPane.showMessageDialog(null,"NO QUANTITY ADDED");
            }else{
                  String sql = "UPDATE `coffee` SET " + "Qty = '"+totalval+"',"+"Price = '"+itotal5+"'"+"WHERE Item = '"+coffee+"'"; 
            try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/coffeeshop?useSSL=false", "root", "admin512003khimura54321!");
            
            PreparedStatement pst = con.prepareStatement(sql);
            pst.executeUpdate();
           
            if(pst.executeUpdate() == 1){
                JOptionPane.showMessageDialog(null,"Updated");
            }
            
            DefaultTableModel model = (DefaultTableModel)menu.getOrderTable().getModel();
            model.setRowCount(0);
            refreshTable();
            con.close();
           
           }catch(Exception e){
               JOptionPane.showMessageDialog(null,e);
           }
              }
              
          }
      }catch(Exception e){
                   JOptionPane.showMessageDialog(null,"ERROR");
                   }
menu.totalSet().setText(Double.toString(cafelatte.total() + whitemocha.total1() + caramellatte.total2() + cafeamericano.total3() + cappuccino.total4() + cafemocha.total5() + cookiesncream.total6() + artisanalchoco.total7())+ "0");      }
    
     public static void setT3(double value3){
         itotal5 = value3;
     }
     
      public static Double total5(){
         return itotal5;
     }
    
       public static void finalp5(Double finalp5){
         itotal5 = finalp5;
     }
      
      void refreshTable(){
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/coffeeshop?useSSL=false", "root", "admin512003khimura54321!");
        String sql = "SELECT * FROM coffee";
        
        PreparedStatement pst = con.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();

        DefaultTableModel model = (DefaultTableModel)menu.getOrderTable().getModel();
        ResultSetMetaData rsmd = rs.getMetaData();
        int columnCount = rsmd.getColumnCount();

        // Add column names to the model
        model.setRowCount(0);

        // Add rows to the model
        while (rs.next()) {
           Vector columnData = new Vector(); 
            for (int i = 1; i <= columnCount; i++) {
               columnData.add(rs.getString("Item"));
               columnData.add(rs.getString("Qty"));
               columnData.add(rs.getString("Price"));
               
            }
            model.addRow(columnData);
        }

        
       // listTable.setModel(model);

        // Close the resources
        rs.close();
        pst.close();
        con.close();
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
}
    
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private static Object[][] dataArray;
     void getData(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/coffeeshop?useSSL=false", "root", "admin512003khimura54321!");
            String sql = "SELECT item_name, stock, price FROM invcoffee";
            
            Statement stmn = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmn.executeQuery(sql);
            
            rs.last();
            int rowCount = rs.getRow();
            rs.beforeFirst();
            
            dataArray = new Object[rowCount][3];
            
            int rowIndex = 0;
            while (rs.next()) {
                String in = rs.getString("item_name");
                String stk = rs.getString("stock");
                String pc = rs.getString("price");

                // Store the data in the array
                dataArray[rowIndex][0] = in;
                dataArray[rowIndex][1] = stk;
                dataArray[rowIndex][2] = pc;

                rowIndex++;
            }
            rs.close();
            stmn.close();
            con.close();
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void purchaseBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseBActionPerformed
        pressB++;
        insertDB();
        refreshTable();
        spin4.setValue(0);
        dispose();
    }//GEN-LAST:event_purchaseBActionPerformed

    private void spin4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spin4StateChanged
        int value = (int) spin4.getValue();
        getData();
        
        if(value > Integer.parseInt((String) dataArray[5][1])){
            JOptionPane.showMessageDialog(null, "LIMITED STOCK AVAILABLE");
            spin4.setValue(0);
            value= 0;
        }

        
        if(value == 0){
            purchaseB.setEnabled(false);
        }else if (value >= 1){
            purchaseB.setEnabled(true);
        }
    }//GEN-LAST:event_spin4StateChanged

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
            java.util.logging.Logger.getLogger(cafemocha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cafemocha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cafemocha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cafemocha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cafemocha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.mycompany.coffeeshopsystem.button backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel namelbl;
    private javax.swing.JLabel pricelbl;
    private javax.swing.JButton purchaseB;
    private javax.swing.JSpinner spin4;
    // End of variables declaration//GEN-END:variables
}
