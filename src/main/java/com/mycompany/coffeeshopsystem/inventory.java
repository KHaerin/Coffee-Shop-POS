/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.coffeeshopsystem;


import java.awt.geom.RoundRectangle2D;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class inventory extends javax.swing.JFrame {
public static String itemname,stockz,pricez;

    public inventory() {
        this.setUndecorated(true);
        initComponents(); 
        this.setShape(new RoundRectangle2D.Double(0,0,getWidth(), getHeight(), 40, 40));
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        invTable = new javax.swing.JTable();
        delB = new com.mycompany.coffeeshopsystem.button();
        searchB = new com.mycompany.coffeeshopsystem.button();
        backB = new com.mycompany.coffeeshopsystem.button();
        addB = new com.mycompany.coffeeshopsystem.button();
        updB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(44, 44, 44));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(44, 44, 44));

        jLabel1.setFont(new java.awt.Font("HelveticaNowDisplay Bold", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\hunny\\Desktop\\CoffeeShopSystem-master\\DejaBrewLogo - Copy.jpg")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(197, 186, 170));

        jPanel4.setBackground(new java.awt.Color(128, 109, 97));

        jLabel2.setBackground(new java.awt.Color(128, 109, 97));
        jLabel2.setFont(new java.awt.Font("HelveticaNowDisplay Bold", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Inventory");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        invTable.setBackground(new java.awt.Color(255, 255, 255));
        invTable.setFont(new java.awt.Font("HelveticaNowDisplay Bold", 0, 14)); // NOI18N
        invTable.setForeground(new java.awt.Color(0, 0, 0));
        invTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Code", "Item", "Stock", "Price"
            }
        ));
        invTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                invTableMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                invTableMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                invTableMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(invTable);

        delB.setText("Delete");
        delB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delBActionPerformed(evt);
            }
        });

        searchB.setText("Search");
        searchB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBActionPerformed(evt);
            }
        });

        backB.setText("Back");
        backB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBActionPerformed(evt);
            }
        });

        addB.setText("Add");
        addB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBActionPerformed(evt);
            }
        });

        updB.setBackground(new java.awt.Color(238, 120, 40));
        updB.setText("Update");
        updB.setEnabled(false);
        updB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(backB, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchB, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updB, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(delB, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addB, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(delB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchB, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(backB, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 4, Short.MAX_VALUE))
                    .addComponent(addB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
     
    
    public static JTable inventoryT(){
        return invTable;
    }
    
    
    void update(){
        int c = 0;
        try{
         int selectedRow = invTable.getSelectedRow();
         
         
        int confirmname = JOptionPane.showConfirmDialog(null,"Update Product Name?", "UPDATE", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(confirmname == 0){
            itemn = JOptionPane.showInputDialog(null, "Enter New Product Name: ");
            c++;
        }else{
            itemn = (String) invTable.getValueAt(selectedRow, 1); // Column 1
        }
        
        int confirmquan = JOptionPane.showConfirmDialog(null,"Update Stock?", "UPDATE", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
         if(confirmquan == 0){
            quan = JOptionPane.showInputDialog(null, "Enter New Quantity: ");
            c++;
        }else{
              quan = (String) invTable.getValueAt(selectedRow, 2); // Column 2
         }
         
        int confirmprice = JOptionPane.showConfirmDialog(null,"Update Price?", "UPDATE", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
          if(confirmprice == 0){
            priced = JOptionPane.showInputDialog(null, "Enter New Price: ");
            c++;
        }else{
              priced = (String) invTable.getValueAt(selectedRow, 3); // Column 3
          }
    
       
      
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "NO DATA HAS BEEN CHANGED");
        }
        
        
        String sql = "UPDATE `invcoffee` SET " + "item_name = '"+itemn+"',"+"stock = '"+quan+"',"+"price = '"+priced+"'"+"WHERE itemcode = '"+itemc+"'"; 
            try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/coffeeshop?useSSL=false", "root", "admin512003khimura54321!");
            
            PreparedStatement pst = con.prepareStatement(sql);
            pst.executeUpdate();
           
            if(pst.executeUpdate() == 1 && c >= 1){
                JOptionPane.showMessageDialog(null,"Updated");
            }else{
                JOptionPane.showMessageDialog(null, "NO DATA HAS BEEN UPDATED!");
            }
            
            DefaultTableModel model = (DefaultTableModel)menu.getOrderTable().getModel();
            model.setRowCount(0);
            refreshTable();
            con.close();
           
           }catch(Exception e){
               JOptionPane.showMessageDialog(null,e);
           }
    }
    
    void refreshTable(){
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/coffeeshop?useSSL=false", "root", "admin512003khimura54321!");
        String sql = "SELECT * FROM invcoffee";
        
        PreparedStatement pst = con.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();

        DefaultTableModel model = (DefaultTableModel)invTable.getModel();
        ResultSetMetaData rsmd = rs.getMetaData();
        int columnCount = rsmd.getColumnCount();

        // Add column names to the model
        model.setRowCount(0);

        // Add rows to the model
        while (rs.next()) {
           Vector columnData = new Vector(); 
            for (int i = 1; i <= columnCount; i++) {
               columnData.add(rs.getString("itemcode"));
               columnData.add(rs.getString("item_name"));
               columnData.add(rs.getString("stock"));
               columnData.add(rs.getString("price"));
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
    
    public static JTable getinvTable(){
        return invTable;
    }
    
    void delete(){
        try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/coffeeshop?useSSL=false", "root", "admin512003khimura54321!");
          
           String sql = "DELETE FROM invcoffee WHERE itemcode = ?";
           PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1,itemc.toString());
           pst.executeUpdate();
           
           JOptionPane.showMessageDialog(null, "Item Deleted!");
           DefaultTableModel model = (DefaultTableModel)invTable.getModel();
           model.setRowCount(0);
           refreshTable();
           con.close();
           
      }catch(Exception e){
          JOptionPane.showMessageDialog(null,"NO ITEM SELECTED!");
      }
    }
    
    private String codeStr, itemStr;
    private int stock, price;
    void insert(){
         try{
             int confirmname = JOptionPane.showConfirmDialog(null,"DO YOU WANT TO ADD ITEM?", "ADD", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
              if(confirmname == 0){
                    codeStr = JOptionPane.showInputDialog(null,"Enter Code #: ");
                    itemStr = JOptionPane.showInputDialog(null,"Enter Item Name: ");
                    stock = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter # of Stock: "));
                    price = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Price: "));
                    
                    Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/coffeeshop?useSSL=false", "root", "admin512003khimura54321!");

                        String sql = "insert into invcoffee(itemcode,item_name,stock,price)values(?,?,?,?)";
                        PreparedStatement pst = con.prepareStatement(sql);

                        pst.setString(1,codeStr);
                        pst.setString(2,itemStr);
                        pst.setString(3,Integer.toString(stock));
                        pst.setString(4,Double.toString(price));


                        pst.executeUpdate();

                        JOptionPane.showMessageDialog(null, "Item Added!");
                        con.close();
               }
            
                        
                  }catch(Exception e){
                      JOptionPane.showMessageDialog(null,"CHECK DATA!");
                  }
        
    }
    
    static void countTable(){
        
        try{
            for(int i = 0; i < invTable.getRowCount(); i++){
            itemname = (String) invTable.getValueAt(i,1);
            stockz = (String) invTable.getValueAt(i,2);
            pricez = (String) invTable.getValueAt(i,3);
        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    
    private void backBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBActionPerformed
        
       
        menu menu = new menu();
        menu.txtPanel().setText(menu.returnrec());
        if(!menu.returnrec().equals("")){
            menu.printer().setEnabled(true);
            
        }
        menu.show();
        
        dispose();
    }//GEN-LAST:event_backBActionPerformed

    private void addBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBActionPerformed
        
        insert();
        updB.setEnabled(false);
        refreshTable();
    }//GEN-LAST:event_addBActionPerformed
    
    public static String itemc;
    public static String itemn;
    public static String quan;
    public static String priced;
    private void invTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_invTableMouseClicked
        int selectedRow = invTable.getSelectedRow();
        if (selectedRow != -1) { // Check if a row is selected
           itemc = (String) invTable.getValueAt(selectedRow, 0); // Column 1
            itemn = (String) invTable.getValueAt(selectedRow, 1); // Column 1
            quan = (String) invTable.getValueAt(selectedRow, 2); // Column 2
            priced = (String) invTable.getValueAt(selectedRow, 3); // Column 3
        }
        updB.setEnabled(true);
    }//GEN-LAST:event_invTableMouseClicked

    private void invTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_invTableMousePressed
        int selectedRow = invTable.getSelectedRow();
        if (selectedRow != -1) { // Check if a row is selected
           itemc = (String) invTable.getValueAt(selectedRow, 0); // Column 1
            itemn = (String) invTable.getValueAt(selectedRow, 1); // Column 1
            quan = (String) invTable.getValueAt(selectedRow, 2); // Column 2
            priced = (String) invTable.getValueAt(selectedRow, 3); // Column 3
        }
        updB.setEnabled(true);
    }//GEN-LAST:event_invTableMousePressed

    private void delBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delBActionPerformed
       int confirmname = JOptionPane.showConfirmDialog(null,"ARE YOU SURE YOU WANT TO DELETE?", "DELETE", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
       if(confirmname == 0){
                    delete();
                }
        
        updB.setEnabled(false);
        refreshTable();
    }//GEN-LAST:event_delBActionPerformed

    private void updBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updBActionPerformed
        
        update();
        refreshTable();
        updB.setEnabled(false);
        
    }//GEN-LAST:event_updBActionPerformed
     
     private static void searchAndHighlight(String searchText) {
   int rowCount = invTable.getRowCount();
    
    boolean found = false;

    // Iterate through the table data to find a match
    for (int row = 0; row < rowCount; row++) {
        String cellValue1 = invTable.getValueAt(row, 0).toString(); // Get the first name
        String cellValue2 = invTable.getValueAt(row, 1).toString(); // Get the second name

        // Combine the first and second names into a single string
        String fullName = cellValue1 + " " + cellValue2;

        if (fullName.toLowerCase().contains(searchText.toLowerCase())) {
            // Highlight the row if a match is found
            invTable.getSelectionModel().setSelectionInterval(row, row);
            invTable.scrollRectToVisible(invTable.getCellRect(row, 0, true));
            found = true;
            break;
        }
    }

    if (!found) {
        JOptionPane.showMessageDialog(invTable, "No matching data found.");
    }
    int selectedRow = invTable.getSelectedRow();
        if (selectedRow != -1) { // Check if a row is selected
           itemc = (String) invTable.getValueAt(selectedRow, 0); // Column 1
            itemn = (String) invTable.getValueAt(selectedRow, 1); // Column 1
            quan = (String) invTable.getValueAt(selectedRow, 2); // Column 2
            priced = (String) invTable.getValueAt(selectedRow, 3); // Column 3
        }
        updB.setEnabled(true);
                                   
}




    
    private void searchBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBActionPerformed
     countTable();
      String searchText = JOptionPane.showInputDialog(null, "Search: ");

                if (searchText != null) {
                    searchAndHighlight(searchText);
                }
 
    }//GEN-LAST:event_searchBActionPerformed

    private static int mouseX;
        private static int mouseY;
    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
                mouseX = evt.getX();
                mouseY = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
                int x = evt.getXOnScreen() - mouseX;
                int y = evt.getYOnScreen() - mouseY;
                this.setLocation(x,y);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void invTableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_invTableMouseReleased
        updB.setEnabled(false);
    }//GEN-LAST:event_invTableMouseReleased

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
            java.util.logging.Logger.getLogger(inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inventory().setVisible(true);
                
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.mycompany.coffeeshopsystem.button addB;
    private com.mycompany.coffeeshopsystem.button backB;
    private com.mycompany.coffeeshopsystem.button delB;
    private static javax.swing.JTable invTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private static javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private com.mycompany.coffeeshopsystem.button searchB;
    private static javax.swing.JButton updB;
    // End of variables declaration//GEN-END:variables
}
