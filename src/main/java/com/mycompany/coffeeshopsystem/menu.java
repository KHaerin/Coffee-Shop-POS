/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.coffeeshopsystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public final class menu extends javax.swing.JFrame {

    
    public menu() {
        setUndecorated(true);
        initComponents();
        setShape(new RoundRectangle2D.Double(0,0,getWidth(), getHeight(), 50, 50));
        showTable();
        dt();
        time(); 
    }
    
    public static String dd, tt;
    public void dt() {
        
        Date d = new Date();
        
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        
        dd = sdf.format(d);
        dateLabel.setText(dd);
    }
    Timer t;
    SimpleDateFormat st;
    
    private String item;
    private String quantity;
    private String priceStr;
    
    
    
    
    public void time() {
        
        
        t = new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("");
                
                Date dt = new Date();
                st = new SimpleDateFormat("hh:mm:ss a");
                
                tt = st.format(dt);
                
                timeLabel.setText(tt);
            }
        });
        
        t.start();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new javax.swing.JPanel();
        logoHeader = new javax.swing.JLabel();
        panel2 = new javax.swing.JPanel();
        menuPanel = new javax.swing.JPanel();
        menulistPanel = new javax.swing.JPanel();
        menulistText = new javax.swing.JTextField();
        cafelattePic = new javax.swing.JLabel();
        whitemochaPic = new javax.swing.JLabel();
        caramellattePic = new javax.swing.JLabel();
        cafeamericanoPic = new javax.swing.JLabel();
        cafeLatteButton = new com.mycompany.coffeeshopsystem.button();
        whitemochaButton = new com.mycompany.coffeeshopsystem.button();
        caramellatteButton = new com.mycompany.coffeeshopsystem.button();
        cafeamericanoButton = new com.mycompany.coffeeshopsystem.button();
        cappuccinoPic = new javax.swing.JLabel();
        cappuccinoButton = new com.mycompany.coffeeshopsystem.button();
        cafemochaPic = new javax.swing.JLabel();
        cafemochaButton = new com.mycompany.coffeeshopsystem.button();
        cookiesncreamPic = new javax.swing.JLabel();
        artisanalchocoPic = new javax.swing.JLabel();
        artisanalchocoButton = new com.mycompany.coffeeshopsystem.button();
        cookiesncreamButton = new com.mycompany.coffeeshopsystem.button();
        receiptPanel = new javax.swing.JPanel();
        scrollPane = new javax.swing.JScrollPane();
        deleteButton = new com.mycompany.coffeeshopsystem.button2();
        clearButton = new com.mycompany.coffeeshopsystem.button2();
        paymentPanel = new javax.swing.JPanel();
        totalText = new javax.swing.JLabel();
        cashText = new javax.swing.JLabel();
        balanceText = new javax.swing.JLabel();
        balance = new javax.swing.JLabel();
        totalTXT = new javax.swing.JLabel();
        cash = new javax.swing.JTextField();
        pay = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        receiptTXT = new javax.swing.JTextArea();
        printB = new javax.swing.JButton();
        timeLabel = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        inventoryButton = new com.mycompany.coffeeshopsystem.button();
        logoutButton = new com.mycompany.coffeeshopsystem.button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setResizable(false);

        panel1.setBackground(new java.awt.Color(44, 44, 44));
        panel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panel1MouseDragged(evt);
            }
        });
        panel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel1MousePressed(evt);
            }
        });

        logoHeader.setFont(new java.awt.Font("HelveticaNowDisplay Bold", 0, 18)); // NOI18N
        logoHeader.setForeground(new java.awt.Color(0, 0, 0));
        logoHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoHeader.setIcon(new javax.swing.ImageIcon("C:\\Users\\hunny\\Desktop\\CoffeeShopSystem-master\\DejaBrewLogo.jpg")); // NOI18N
        logoHeader.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        panel2.setBackground(new java.awt.Color(128, 109, 97));

        menuPanel.setBackground(new java.awt.Color(44, 44, 44));

        menulistPanel.setBackground(new java.awt.Color(128, 109, 97));

        menulistText.setEditable(false);
        menulistText.setBackground(new java.awt.Color(128, 109, 97));
        menulistText.setFont(new java.awt.Font("HelveticaNowDisplay Bold", 0, 24)); // NOI18N
        menulistText.setForeground(new java.awt.Color(255, 255, 255));
        menulistText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        menulistText.setText("Menu");
        menulistText.setBorder(null);
        menulistText.setSelectedTextColor(new java.awt.Color(128, 109, 97));
        menulistText.setSelectionColor(new java.awt.Color(128, 109, 97));
        menulistText.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                menulistTextMouseDragged(evt);
            }
        });
        menulistText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menulistTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menulistPanelLayout = new javax.swing.GroupLayout(menulistPanel);
        menulistPanel.setLayout(menulistPanelLayout);
        menulistPanelLayout.setHorizontalGroup(
            menulistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menulistPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(menulistText, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(220, 220, 220))
        );
        menulistPanelLayout.setVerticalGroup(
            menulistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menulistPanelLayout.createSequentialGroup()
                .addComponent(menulistText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        cafelattePic.setIcon(new javax.swing.ImageIcon("C:\\Users\\hunny\\Desktop\\CoffeeShopSystem-master\\CoffeeShopSystem-master\\icons\\coffee\\cafe-latte.png")); // NOI18N
        cafelattePic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cafelattePicMousePressed(evt);
            }
        });

        whitemochaPic.setIcon(new javax.swing.ImageIcon("C:\\Users\\hunny\\Desktop\\CoffeeShopSystem-master\\CoffeeShopSystem-master\\icons\\coffee\\white-mocha.png")); // NOI18N
        whitemochaPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                whitemochaPicMousePressed(evt);
            }
        });

        caramellattePic.setIcon(new javax.swing.ImageIcon("C:\\Users\\hunny\\Desktop\\CoffeeShopSystem-master\\CoffeeShopSystem-master\\icons\\coffee\\caramel-latte.png")); // NOI18N
        caramellattePic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                caramellattePicMousePressed(evt);
            }
        });

        cafeamericanoPic.setIcon(new javax.swing.ImageIcon("C:\\Users\\hunny\\Desktop\\CoffeeShopSystem-master\\CoffeeShopSystem-master\\icons\\coffee\\cafe-americano.png")); // NOI18N
        cafeamericanoPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cafeamericanoPicMousePressed(evt);
            }
        });

        cafeLatteButton.setText("Cafe Latte");
        cafeLatteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cafeLatteButtonActionPerformed(evt);
            }
        });

        whitemochaButton.setText("White Mocha");
        whitemochaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                whitemochaButtonActionPerformed(evt);
            }
        });

        caramellatteButton.setText("Caramel Latte");
        caramellatteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caramellatteButtonActionPerformed(evt);
            }
        });

        cafeamericanoButton.setText("Cafe Americano");
        cafeamericanoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cafeamericanoButtonActionPerformed(evt);
            }
        });

        cappuccinoPic.setIcon(new javax.swing.ImageIcon("C:\\Users\\hunny\\Desktop\\CoffeeShopSystem-master\\CoffeeShopSystem-master\\icons\\coffee\\cappuccino.png")); // NOI18N
        cappuccinoPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cappuccinoPicMousePressed(evt);
            }
        });

        cappuccinoButton.setText("Cappuccino");
        cappuccinoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cappuccinoButtonActionPerformed(evt);
            }
        });

        cafemochaPic.setIcon(new javax.swing.ImageIcon("C:\\Users\\hunny\\Desktop\\CoffeeShopSystem-master\\CoffeeShopSystem-master\\icons\\coffee\\cafe-mocha.png")); // NOI18N
        cafemochaPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cafemochaPicMousePressed(evt);
            }
        });

        cafemochaButton.setText("Cafe Mocha");
        cafemochaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cafemochaButtonActionPerformed(evt);
            }
        });

        cookiesncreamPic.setIcon(new javax.swing.ImageIcon("C:\\Users\\hunny\\Desktop\\CoffeeShopSystem-master\\CoffeeShopSystem-master\\icons\\coffee\\cookies-and-cream.png")); // NOI18N
        cookiesncreamPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cookiesncreamPicMousePressed(evt);
            }
        });

        artisanalchocoPic.setIcon(new javax.swing.ImageIcon("C:\\Users\\hunny\\Desktop\\CoffeeShopSystem-master\\CoffeeShopSystem-master\\icons\\coffee\\artisanal-chocolate.png")); // NOI18N
        artisanalchocoPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                artisanalchocoPicMousePressed(evt);
            }
        });

        artisanalchocoButton.setText("Artisanal Choco");
        artisanalchocoButton.setFocusable(false);
        artisanalchocoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                artisanalchocoButtonActionPerformed(evt);
            }
        });

        cookiesncreamButton.setText("Cookies n Cream");
        cookiesncreamButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cookiesncreamButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menulistPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cappuccinoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cappuccinoPic))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cafemochaPic)
                            .addComponent(cafemochaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cookiesncreamPic)
                            .addComponent(cookiesncreamButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(artisanalchocoPic)
                            .addComponent(artisanalchocoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cafelattePic)
                            .addComponent(cafeLatteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(menuPanelLayout.createSequentialGroup()
                                .addComponent(whitemochaPic)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(caramellattePic)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cafeamericanoPic, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(menuPanelLayout.createSequentialGroup()
                                .addComponent(whitemochaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(caramellatteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cafeamericanoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addComponent(menulistPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cafelattePic)
                    .addComponent(whitemochaPic)
                    .addComponent(caramellattePic)
                    .addComponent(cafeamericanoPic))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cafeLatteButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(whitemochaButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(caramellatteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cafeamericanoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cappuccinoPic)
                    .addComponent(cookiesncreamPic)
                    .addComponent(artisanalchocoPic)
                    .addComponent(cafemochaPic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cappuccinoButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cafemochaButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cookiesncreamButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(artisanalchocoButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        receiptPanel.setBackground(new java.awt.Color(44, 44, 44));

        orderTable.setBackground(new java.awt.Color(255, 255, 255));
        orderTable.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        orderTable.setFont(new java.awt.Font("HelveticaNowDisplay Bold", 0, 12)); // NOI18N
        orderTable.setForeground(new java.awt.Color(0, 0, 0));
        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Qty", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        orderTable.setFocusable(false);
        orderTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderTableMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                orderTableMousePressed(evt);
            }
        });
        scrollPane.setViewportView(orderTable);

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        paymentPanel.setBackground(new java.awt.Color(255, 255, 255));

        totalText.setFont(new java.awt.Font("HelveticaNowDisplay Bold", 0, 18)); // NOI18N
        totalText.setForeground(new java.awt.Color(0, 0, 0));
        totalText.setText("Total       :");

        cashText.setFont(new java.awt.Font("HelveticaNowDisplay Bold", 0, 18)); // NOI18N
        cashText.setForeground(new java.awt.Color(0, 0, 0));
        cashText.setText("Cash       :");

        balanceText.setFont(new java.awt.Font("HelveticaNowDisplay Bold", 0, 18)); // NOI18N
        balanceText.setForeground(new java.awt.Color(0, 0, 0));
        balanceText.setText("Balance  :");

        balance.setFont(new java.awt.Font("HelveticaNowDisplay Bold", 0, 18)); // NOI18N
        balance.setForeground(new java.awt.Color(0, 0, 0));
        balance.setText("0.00");

        totalTXT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        totalTXT.setForeground(new java.awt.Color(0, 0, 0));
        totalTXT.setText("0.00");

        cash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashActionPerformed(evt);
            }
        });
        cash.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cashKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cashKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout paymentPanelLayout = new javax.swing.GroupLayout(paymentPanel);
        paymentPanel.setLayout(paymentPanelLayout);
        paymentPanelLayout.setHorizontalGroup(
            paymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paymentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cashText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(totalText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(balanceText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(balance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(paymentPanelLayout.createSequentialGroup()
                        .addGroup(paymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cash, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        paymentPanelLayout.setVerticalGroup(
            paymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paymentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalText)
                    .addComponent(totalTXT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cashText)
                    .addComponent(cash, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(paymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(balanceText)
                    .addComponent(balance))
                .addContainerGap())
        );

        pay.setBackground(new java.awt.Color(238, 120, 40));
        pay.setText("Pay");
        pay.setEnabled(false);
        pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payActionPerformed(evt);
            }
        });

        receiptTXT.setEditable(false);
        receiptTXT.setColumns(20);
        receiptTXT.setRows(5);
        jScrollPane1.setViewportView(receiptTXT);

        printB.setBackground(new java.awt.Color(238, 120, 40));
        printB.setText("Print");
        printB.setEnabled(false);
        printB.setFocusable(false);
        printB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout receiptPanelLayout = new javax.swing.GroupLayout(receiptPanel);
        receiptPanel.setLayout(receiptPanelLayout);
        receiptPanelLayout.setHorizontalGroup(
            receiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, receiptPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(receiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(receiptPanelLayout.createSequentialGroup()
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(paymentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(receiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(receiptPanelLayout.createSequentialGroup()
                        .addComponent(pay, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(printB, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        receiptPanelLayout.setVerticalGroup(
            receiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, receiptPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(receiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(receiptPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(receiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(printB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(receiptPanelLayout.createSequentialGroup()
                        .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(receiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(paymentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );

        timeLabel.setBackground(new java.awt.Color(255, 255, 255));
        timeLabel.setFont(new java.awt.Font("HelveticaNowDisplay Bold", 0, 16)); // NOI18N
        timeLabel.setForeground(new java.awt.Color(255, 255, 255));
        timeLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        timeLabel.setText("0");
        timeLabel.setToolTipText("");

        dateLabel.setBackground(new java.awt.Color(255, 255, 255));
        dateLabel.setFont(new java.awt.Font("HelveticaNowDisplay Bold", 0, 16)); // NOI18N
        dateLabel.setForeground(new java.awt.Color(255, 255, 255));
        dateLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dateLabel.setText("0");
        dateLabel.setToolTipText("");

        inventoryButton.setBackground(new java.awt.Color(128, 109, 97));
        inventoryButton.setText("Inventory");
        inventoryButton.setBorderColor(new java.awt.Color(197, 186, 170));
        inventoryButton.setColor(new java.awt.Color(128, 109, 97));
        inventoryButton.setColorClick(new java.awt.Color(128, 109, 97));
        inventoryButton.setColorOver(new java.awt.Color(128, 109, 97));
        inventoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventoryButtonActionPerformed(evt);
            }
        });

        logoutButton.setBackground(new java.awt.Color(128, 109, 97));
        logoutButton.setText("Log out");
        logoutButton.setBorderColor(new java.awt.Color(197, 186, 170));
        logoutButton.setColor(new java.awt.Color(128, 109, 97));
        logoutButton.setColorClick(new java.awt.Color(128, 109, 97));
        logoutButton.setColorOver(new java.awt.Color(128, 109, 97));
        logoutButton.setFocusable(false);
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(inventoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(receiptPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 10, 10))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(receiptPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(9, 9, 9)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(logoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                    .addComponent(inventoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logoHeader, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(logoHeader)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   
    
    
    

    void refreshTable(){
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/coffeeshop?useSSL=false", "root", "admin512003khimura54321!");
        String sql = "SELECT * FROM coffee";
        
        PreparedStatement pst = con.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();

        DefaultTableModel model = (DefaultTableModel)orderTable.getModel();
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
    
    void clear(){
        try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/coffeeshop?useSSL=false", "root", "admin512003khimura54321!");
          
           String sql = "DELETE FROM coffee ";
           Statement pst = con.createStatement();
         
           pst.executeUpdate(sql);
           
           DefaultTableModel model = (DefaultTableModel)orderTable.getModel();
           model.setRowCount(0);
           refreshTable();
           con.close();
           
      }catch(Exception e){
          JOptionPane.showMessageDialog(null,e);
      }
    }
    
    void delete(){
      try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/coffeeshop?useSSL=false", "root", "admin512003khimura54321!");
          
           String sql = "DELETE FROM coffee WHERE Item = ?";
           PreparedStatement pst = con.prepareStatement(sql);
           pst.setString(1,item.toString());
           pst.executeUpdate();
           
           JOptionPane.showMessageDialog(null, "Item Deleted!");
           DefaultTableModel model = (DefaultTableModel)orderTable.getModel();
           model.setRowCount(0);
           refreshTable();
           con.close();
           
      }catch(Exception e){
          JOptionPane.showMessageDialog(null,e);
      }
  }
    
    public static JLabel totalSet(){
        return totalTXT;
    }
    public static JTable getOrderTable(){
        return orderTable;
    }
    
    void showTable(){
      try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/coffeeshop?useSSL=false", "root", "admin512003khimura54321!");
           Statement st = con.createStatement();
           
           String sql = "select * from coffee";
           ResultSet rs = st.executeQuery(sql);
           
           
           while (rs.next()){
               String iname = String.valueOf(rs.getString("Item"));
               String quanti = String.valueOf(rs.getString("Qty"));
               String priced = String.valueOf(rs.getString("Price"));
               
                String tbData[] = {iname,quanti,priced};
                DefaultTableModel tblModel = (DefaultTableModel)orderTable.getModel();
                
                tblModel.addRow(tbData);
               
           }
           
           con.close();
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
  }
    
    void showTableInv(){
      try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/coffeeshop?useSSL=false", "root", "admin512003khimura54321!");
           Statement st = con.createStatement();
           
           String sql = "select * from invcoffee";
           ResultSet rs = st.executeQuery(sql);
           
           
           while (rs.next()){
               String ic = String.valueOf(rs.getString("itemcode"));
               String in = String.valueOf(rs.getString("item_name"));
               String stock = String.valueOf(rs.getString("stock"));
               String price = String.valueOf(rs.getString("price"));
               
                String tbData[] = {ic,in,stock,price};
                DefaultTableModel tblModel = (DefaultTableModel)inventory.inventoryT().getModel();
                
                tblModel.addRow(tbData);
               
           }
           
           con.close();
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
  }
    
    private void menulistTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menulistTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menulistTextActionPerformed

    private void caramellatteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caramellatteButtonActionPerformed
       
        caramellatte caramellatte = new caramellatte();
        
        caramellatte.show();
    }//GEN-LAST:event_caramellatteButtonActionPerformed

    private void artisanalchocoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_artisanalchocoButtonActionPerformed
        // TODO add your handling code here:
        artisanalchoco artisanalchoco = new artisanalchoco();
        
        artisanalchoco.show();
    }//GEN-LAST:event_artisanalchocoButtonActionPerformed

    private void cafeLatteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cafeLatteButtonActionPerformed
        // TODO add your handling code here:
        cafelatte cafelatte = new cafelatte();
        
        cafelatte.show();
    }//GEN-LAST:event_cafeLatteButtonActionPerformed

    private void whitemochaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_whitemochaButtonActionPerformed
        // TODO add your handling code here:
        whitemocha whitemocha = new whitemocha();
        
        whitemocha.show();
    }//GEN-LAST:event_whitemochaButtonActionPerformed

    private void cafeamericanoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cafeamericanoButtonActionPerformed
    
        cafeamericano cafeamericano = new cafeamericano();
        cafeamericano.show();
    }//GEN-LAST:event_cafeamericanoButtonActionPerformed

    private void cappuccinoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cappuccinoButtonActionPerformed
        // TODO add your handling code here:
        cappuccino cappuccino = new cappuccino();
        
        cappuccino.show();
    }//GEN-LAST:event_cappuccinoButtonActionPerformed

    private void cafemochaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cafemochaButtonActionPerformed
        // TODO add your handling code here:\
        cafemocha cafemocha = new cafemocha();
        
        cafemocha.show();
    }//GEN-LAST:event_cafemochaButtonActionPerformed
   
    public static JTextArea txtPanel(){
        return receiptTXT;
    }
    
    public static JButton printer(){
        return printB;
    }
    public static String receiptStr = "";
    
    public static String returnrec(){
        return receiptStr;
}
    private void inventoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventoryButtonActionPerformed

        if (presspay == 1){
            receiptStr = receiptTXT.getText();
            clear();
            
        }
        inventory inventory = new inventory();
        
        inventory.show();
        showTableInv();
        dispose();
    }//GEN-LAST:event_inventoryButtonActionPerformed

    private void cafelattePicMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cafelattePicMousePressed
        // TODO add your handling code here:
        cafelatte cafelatte = new cafelatte();
        
        cafelatte.show();
    }//GEN-LAST:event_cafelattePicMousePressed

    private void whitemochaPicMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_whitemochaPicMousePressed
        // TODO add your handling code here:
        whitemocha whitemocha = new whitemocha();
        
        whitemocha.show();
    }//GEN-LAST:event_whitemochaPicMousePressed

    private void caramellattePicMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_caramellattePicMousePressed
        
        caramellatte caramellatte = new caramellatte();
        
        caramellatte.show();
    }//GEN-LAST:event_caramellattePicMousePressed

    private void cafeamericanoPicMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cafeamericanoPicMousePressed
        
        cafeamericano cafeamericano = new cafeamericano();
        
        cafeamericano.show();
    }//GEN-LAST:event_cafeamericanoPicMousePressed

    private void cappuccinoPicMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cappuccinoPicMousePressed
        // TODO add your handling code here:
        cappuccino cappuccino = new cappuccino();
        
        cappuccino.show();
    }//GEN-LAST:event_cappuccinoPicMousePressed

    private void cafemochaPicMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cafemochaPicMousePressed
        // TODO add your handling code here:
        cafemocha cafemocha = new cafemocha();
        
        cafemocha.show();
    }//GEN-LAST:event_cafemochaPicMousePressed

    private void artisanalchocoPicMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_artisanalchocoPicMousePressed
        // TODO add your handling code here:
        artisanalchoco artisanalchoco = new artisanalchoco();
        
        artisanalchoco.show();
    }//GEN-LAST:event_artisanalchocoPicMousePressed

    private void cookiesncreamPicMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cookiesncreamPicMousePressed
        // TODO add your handling code here:
        cookiesncream cookiesncream = new cookiesncream();
        
        cookiesncream.show();
    }//GEN-LAST:event_cookiesncreamPicMousePressed
    
    private void createTextFile() {
        JFileChooser fileChooser = new JFileChooser();
        int option = fileChooser.showSaveDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            String filePath = fileChooser.getSelectedFile().getAbsolutePath();

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
                writer.write(receiptTXT.getText());
                JOptionPane.showMessageDialog(this, "Text file created successfully.");
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error creating the text file.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        
        if(item.equals("Cafe Latte")){
            cafelatte.finalp(0.00);
        }else if(item.equals("White Mocha")){
            whitemocha.finalp1(0.00);
        }else if(item.equals("Caramel Latte")){
            caramellatte.finalp2(0.00);
        }else if(item.equals("Cafe Americano")){
            cafeamericano.finalp3(0.00);
        }else if(item.equals("Cappuccino")){
            cappuccino.finalp4(0.00);
        }else if(item.equals("Cafe Mocha")){
            cafemocha.finalp5(0.00);
        }else if(item.equals("Cookies & Cream")){
            cookiesncream.finalp6(0.00);
        }else if(item.equals("Artisanal Choco")){
            artisanalchoco.finalp7(0.00);
        }
        menu.totalSet().setText(Double.toString(cafelatte.total() + whitemocha.total1() + caramellatte.total2() + cafeamericano.total3() + cappuccino.total4() + cafemocha.total5() + cookiesncream.total6() + artisanalchoco.total7())+ "0");

        delete();
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        cafelatte.pressB = 0;
        whitemocha.pressB = 0;
        caramellatte.pressB = 0;
        cafeamericano.pressB = 0;
        cappuccino.pressB = 0;
        cafemocha.pressB = 0;
        cookiesncream.pressB = 0;
        artisanalchoco.pressB = 0;
        
        
        cafelatte.setT(0);
        cafelatte.totalval = 0;
        
        artisanalchoco.setT1(0);
        artisanalchoco.totalval = 0;
        
        cafeamericano.setT2(0);
        cafeamericano.totalval = 0;
        
        cafemocha.setT3(0);
        cafemocha.totalval = 0;
        
        cappuccino.setT4(0);
        cappuccino.totalval = 0;
        
        caramellatte.setT5(0);
        caramellatte.totalval = 0;
        
        cookiesncream.setT6(0);
        cookiesncream.totalval = 0;
        
        whitemocha.setT7(0);
        whitemocha.totalval = 0;
        
        fprice = 0;
        cashp =0;
        presspay = 0;
        printB.setEnabled(false);
        pay.setEnabled(false);
        balance.setText("0.00");
        receiptTXT.setText("");
        totalTXT.setText("0.00");
        clear();
    }//GEN-LAST:event_clearButtonActionPerformed

    private void cookiesncreamButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cookiesncreamButtonActionPerformed
        // TODO add your handling code here:
        cookiesncream cookiesncream = new cookiesncream();
        
        cookiesncream.show();
    }//GEN-LAST:event_cookiesncreamButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        if (CredentialsHolder.hasCredentials()) {
                    // Retrieve the stored credentials and set them in the LoginScreen
                    String[] storedCredentials = CredentialsHolder.getCredentials();
                    log.setUsername(storedCredentials[0]);
                    log.setPassword(storedCredentials[1]);
                    log.setRememberMe(true);
                }
        log login = new log();
        login.show();

        dispose();
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void orderTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderTableMouseClicked
        int selectedRow = orderTable.getSelectedRow();
        if (selectedRow != -1) { // Check if a row is selected
            item = (String) orderTable.getValueAt(selectedRow, 0); // Column 1
            quantity = (String) orderTable.getValueAt(selectedRow, 1); // Column 2
            priceStr = (String) orderTable.getValueAt(selectedRow, 2); // Column 3
        }
    }//GEN-LAST:event_orderTableMouseClicked

    private void orderTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderTableMousePressed
        int selectedRow = orderTable.getSelectedRow();
       if (selectedRow != -1) { // Check if a row is selected
            item = (String) orderTable.getValueAt(selectedRow, 0); // Column 1
            quantity = (String) orderTable.getValueAt(selectedRow, 1); // Column 2
            priceStr = (String) orderTable.getValueAt(selectedRow, 2); // Column 3
        }
    }//GEN-LAST:event_orderTableMousePressed
       
    private String changeStr;
    private static int presspay = 0;
    private String items,itemsStr, quantitys, prices,stockStr;
    private int stockF;
    
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
    
     
     
    public void payButtonClicked() {
            
            getData();
            
           if(dataArray != null){
                for (int i = 0; i < orderTable.getRowCount(); i++){
                    String itemns = (String) orderTable.getValueAt(i,0);

                    switch (itemns) {
                        case "Cafe Latte" -> {
                            stockStr = (String)dataArray[0][1];
                            stockF = Integer.parseInt(stockStr) - Integer.parseInt(quantitys);
                            updateInv();
                        }
                        case "White Mocha" -> {
                            stockStr = (String)dataArray[1][1];
                            stockF = Integer.parseInt(stockStr) - Integer.parseInt(quantitys);
                            updateInv();
                        }
                        case "Caramel Latte" -> {
                            stockStr = (String)dataArray[2][1];
                            stockF = Integer.parseInt(stockStr) - Integer.parseInt(quantitys);
                            updateInv();
                        }
                        case "Cafe Americano" -> {
                            stockStr = (String)dataArray[3][1];
                            stockF = Integer.parseInt(stockStr) - Integer.parseInt(quantitys);
                            updateInv();
                        }
                        case "Cappuccino" -> {
                            stockStr = (String)dataArray[4][1];
                            stockF = Integer.parseInt(stockStr) - Integer.parseInt(quantitys);
                            updateInv();
                        }
                        case "Cafe Mocha" -> {
                            stockStr = (String)dataArray[5][1];
                            stockF = Integer.parseInt(stockStr) - Integer.parseInt(quantitys);
                            updateInv();
                        }
                        case "Cookies & Cream" -> {
                            stockStr = (String)dataArray[6][1];
                            stockF = Integer.parseInt(stockStr) - Integer.parseInt(quantitys);
                            updateInv();
                        }
                        case "Artisanal Choco" -> {
                            stockStr = (String)dataArray[7][1];
                            stockF = Integer.parseInt(stockStr) - Integer.parseInt(quantitys); 
                            updateInv();
                        }
                        default -> {
                        }
                    }
                }
           }
          
    }
    
    public void updateInv(){
        try {
           Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/coffeeshop?useSSL=false", "root", "admin512003khimura54321!");
            
            String sql = "UPDATE `invcoffee` SET " + "stock = '"+stockF+"'"+"WHERE item_name = '"+items+"'"; 
            
            
            PreparedStatement pst = con.prepareStatement(sql);
            
          
            int rowsUpdated = pst.executeUpdate();
            
            if (rowsUpdated > 0) {
                System.out.println("Stock updated successfully.");
            } else {
                System.out.println("Failed to update stock.");
            }
            
            // Close the statement and connection
            pst.close();
            con.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        } catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null,ex);
        }
     }
    
    private void payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payActionPerformed
        presspay = 1;
        double change = cashp - fprice;
        changeStr = String.valueOf(change);
        balance.setText(changeStr + "0");
        cash.setText("");
       
        receiptTXT.setText("\t\n\tDeja Brew\n\n");
        receiptTXT.setText(receiptTXT.getText() + "Date   :   " +dd +"\n" +
                                                  "Time   :   " + tt + "\n");
        receiptTXT.setText(receiptTXT.getText() + "--------------------------------------------------------");
        receiptTXT.setText(receiptTXT.getText() + "\nItem \t           Price\n--------------------------------------------------------\n");
 
        for(int i = 0; i < orderTable.getRowCount(); i++){
            
            items = (String) orderTable.getValueAt(i,0);
            quantitys = (String) orderTable.getValueAt(i,1);
            prices = (String) orderTable.getValueAt(i,2);
            
            if(items.equals("Cafe Latte")){
                itemsStr = "CFLT";
            }else if(items.equals("White Mocha")){
                itemsStr ="WTMC";
            }else if(items.equals("Caramel Latte")){
                itemsStr = "CMLT";
            }else if(items.equals("Cafe Americano")){
                itemsStr = "CFAM";
            }else if(items.equals("Cappuccino")){
                itemsStr = "CPCN";
            }else if(items.equals("Cafe Mocha")){
                itemsStr = "CFMC";
            }else if(items.equals("Cookies & Cream")){
                itemsStr = "CKCM";
            }else if(items.equals("Artisanal Choco")){
                itemsStr = "ARCH";
            }
            
            receiptTXT.setText(receiptTXT.getText() + itemsStr);
            receiptTXT.setText(receiptTXT.getText() +"                         " + prices);
            receiptTXT.setText(receiptTXT.getText() + " (" + quantitys + ")" + "\n");
            
        }
        receiptTXT.setText(receiptTXT.getText() + "\n--------------------------------------------------------\n");
        receiptTXT.setText(receiptTXT.getText() + "Sub Total : "+ fprice  
                                                + "0\nCash     : "+ cashp 
                                                + "0\nBalance  : "+ changeStr +"0\n\n--------------------------------------------------------\n\n");
       receiptTXT.setText(receiptTXT.getText() +"            Thank you for purchasing!\n                  Have a Great Day!\n--------------------------------------------------------\n@Group 2\n");
       printB.setEnabled(true);
       pay.setEnabled(false);
       payButtonClicked();
       clear();
    }//GEN-LAST:event_payActionPerformed
    
    public static boolean isAlpha(String alpha){
         return alpha.matches("[a-zA-Z]+");
     }
    
    private double fprice;
    private double cashp;
   
    
    
    private void cashKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cashKeyReleased
     try{
        String fpriceStr = totalTXT.getText();
        String cashStr = cash.getText();
        fprice = Double.parseDouble(fpriceStr);
        cashp = Double.parseDouble(cashStr);
        
        if (fprice != 0){
            if(cashp >= fprice){
            pay.setEnabled(true);
        }else{
            pay.setEnabled(false);
        }
        }
        
        }catch(Exception e){
            
        }
        
    }//GEN-LAST:event_cashKeyReleased

    private void cashKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cashKeyTyped
        char input = evt.getKeyChar();
        if(Character.isAlphabetic(input)){
            evt.consume();
        }
    }//GEN-LAST:event_cashKeyTyped

    private void printBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printBActionPerformed
     
        if(presspay == 1){
            printB.setEnabled(true);
            int choice = JOptionPane.showConfirmDialog(null, "Do you want to print the receipt?", "PRINT", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
                    if (choice == JOptionPane.YES_OPTION){
                        try{
                        receiptTXT.print();
                        int choice1 = JOptionPane.showConfirmDialog(null, "Do you want to save the file?", "SAVE", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                        if (choice1 == JOptionPane.YES_OPTION){
                        createTextFile();
                        receiptTXT.setText("");
                    }else if(choice1 == JOptionPane.NO_OPTION){

                    }
                        
                    }catch(java.awt.print.PrinterException e){
                        System.err.format("No Printer Found", e.getMessage());
                    }
        }else if(choice == JOptionPane.NO_OPTION){
                    int choice1 = JOptionPane.showConfirmDialog(null, "Do you want to save the file?", "SAVE", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                    if (choice1 == JOptionPane.YES_OPTION){
                        createTextFile();
                        receiptTXT.setText("");
                    }else if(choice1 == JOptionPane.NO_OPTION){
                        
                    }
            }
           
            
        }
        
             clear();
             pay.setEnabled(false);
             printB.setEnabled(false);
             receiptTXT.setText("");
    }//GEN-LAST:event_printBActionPerformed

    private void cashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cashActionPerformed
        private static int mouseX;
        private static int mouseY;
    private void panel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel1MousePressed
                mouseX = evt.getX();
                mouseY = evt.getY();
    }//GEN-LAST:event_panel1MousePressed

    private void panel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel1MouseDragged
                int x = evt.getXOnScreen() - mouseX;
                int y = evt.getYOnScreen() - mouseY;
                this.setLocation(x,y);
    }//GEN-LAST:event_panel1MouseDragged

    private void menulistTextMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menulistTextMouseDragged
                int x = evt.getXOnScreen() - mouseX;
                int y = evt.getYOnScreen() - mouseY;
                this.setLocation(x,y);
    }//GEN-LAST:event_menulistTextMouseDragged

    
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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new menu().setVisible(true);
            }
        });
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.mycompany.coffeeshopsystem.button artisanalchocoButton;
    private javax.swing.JLabel artisanalchocoPic;
    private javax.swing.JLabel balance;
    private javax.swing.JLabel balanceText;
    private com.mycompany.coffeeshopsystem.button cafeLatteButton;
    private com.mycompany.coffeeshopsystem.button cafeamericanoButton;
    private javax.swing.JLabel cafeamericanoPic;
    private javax.swing.JLabel cafelattePic;
    private com.mycompany.coffeeshopsystem.button cafemochaButton;
    private javax.swing.JLabel cafemochaPic;
    private com.mycompany.coffeeshopsystem.button cappuccinoButton;
    private javax.swing.JLabel cappuccinoPic;
    private com.mycompany.coffeeshopsystem.button caramellatteButton;
    private javax.swing.JLabel caramellattePic;
    private javax.swing.JTextField cash;
    private javax.swing.JLabel cashText;
    private com.mycompany.coffeeshopsystem.button2 clearButton;
    private com.mycompany.coffeeshopsystem.button cookiesncreamButton;
    private javax.swing.JLabel cookiesncreamPic;
    private javax.swing.JLabel dateLabel;
    private com.mycompany.coffeeshopsystem.button2 deleteButton;
    private com.mycompany.coffeeshopsystem.button inventoryButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logoHeader;
    private com.mycompany.coffeeshopsystem.button logoutButton;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JPanel menulistPanel;
    private javax.swing.JTextField menulistText;
    private static final javax.swing.JTable orderTable = new javax.swing.JTable();
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JButton pay;
    private javax.swing.JPanel paymentPanel;
    private static javax.swing.JButton printB;
    private javax.swing.JPanel receiptPanel;
    private static javax.swing.JTextArea receiptTXT;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JLabel timeLabel;
    private static javax.swing.JLabel totalTXT;
    private javax.swing.JLabel totalText;
    private com.mycompany.coffeeshopsystem.button whitemochaButton;
    private javax.swing.JLabel whitemochaPic;
    // End of variables declaration//GEN-END:variables

}
