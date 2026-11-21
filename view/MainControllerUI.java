/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package defence.system.view;

import defence.system.control.*;
import javax.swing.JFrame;

public class MainControllerUI extends JFrame {

    private static MainControllerUI mainControllerUI;
    private static final MainController controller = MainController.getInstance();
    
    private MainControllerUI() {
        initComponents();
        setTitle("Main Controller");
        setLocation(50,650);
    }

    public static MainControllerUI getInstance() {
        if (mainControllerUI == null) {
            mainControllerUI = new MainControllerUI();
        }
        return mainControllerUI;
    }

    public void receiveMessage(String user, String message) {
        txtArea.append(user + " : " + message + "\n");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jToggleButton1 = new javax.swing.JToggleButton();
        jSplitPane2 = new javax.swing.JSplitPane();
        jToggleButton2 = new javax.swing.JToggleButton();
        jSlider1 = new javax.swing.JSlider();
        jLabel4 = new javax.swing.JLabel();
        BGPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        defenceCheckBox = new javax.swing.JComboBox<>();
        collectInformationbtn = new javax.swing.JButton();
        areaClear = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        jLabelPosition = new javax.swing.JLabel();
        lblSoldierCount = new javax.swing.JLabel();
        lblFuelAmount = new javax.swing.JLabel();
        lblAmmoAmount = new javax.swing.JLabel();
        positionSlider = new javax.swing.JSlider();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ammoField = new java.awt.TextField();
        soldierField = new java.awt.TextField();
        fuelField = new java.awt.TextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        txtMaessage = new javax.swing.JTextField();
        btnSend = new javax.swing.JButton();

        jToggleButton1.setText("jToggleButton1");

        jToggleButton2.setText("jToggleButton2");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("•");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tank");
        setBackground(new java.awt.Color(16, 27, 45));
        setResizable(false);

        BGPanel.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        defenceCheckBox.setBackground(new java.awt.Color(0, 0, 51));
        defenceCheckBox.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        defenceCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        defenceCheckBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Defence", "Helicopter", "Tank", "Submarine" }));
        defenceCheckBox.setOpaque(true);
        defenceCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defenceCheckBoxActionPerformed(evt);
            }
        });

        collectInformationbtn.setBackground(new java.awt.Color(0, 0, 51));
        collectInformationbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        collectInformationbtn.setForeground(new java.awt.Color(255, 255, 255));
        collectInformationbtn.setText("Collect Information");
        collectInformationbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                collectInformationbtnActionPerformed(evt);
            }
        });

        areaClear.setBackground(new java.awt.Color(0, 51, 102));
        areaClear.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        areaClear.setForeground(new java.awt.Color(255, 255, 255));
        areaClear.setText("AREA CLEAR");
        areaClear.setAlignmentY(2.0F);
        areaClear.setBorder(null);
        areaClear.setBorderPainted(true);
        areaClear.setIconTextGap(15);
        areaClear.setMargin(new java.awt.Insets(2, 20, 2, 2));
        areaClear.setMaximumSize(new java.awt.Dimension(150, 29));
        areaClear.setMinimumSize(new java.awt.Dimension(150, 29));
        areaClear.setOpaque(true);
        areaClear.setPreferredSize(new java.awt.Dimension(200, 50));
        areaClear.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                areaClearItemStateChanged(evt);
            }
        });
        areaClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(defenceCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(collectInformationbtn)
                .addGap(102, 102, 102)
                .addComponent(areaClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(areaClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(defenceCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                    .addComponent(collectInformationbtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(0, 51, 102));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        jLabelPosition.setBackground(new java.awt.Color(153, 153, 0));
        jLabelPosition.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabelPosition.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPosition.setText("Position");

        lblSoldierCount.setBackground(new java.awt.Color(153, 153, 0));
        lblSoldierCount.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        lblSoldierCount.setForeground(new java.awt.Color(255, 255, 255));
        lblSoldierCount.setText("Soldier Count");

        lblFuelAmount.setBackground(new java.awt.Color(153, 153, 0));
        lblFuelAmount.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        lblFuelAmount.setForeground(new java.awt.Color(255, 255, 255));
        lblFuelAmount.setText("Fuel Amount");

        lblAmmoAmount.setBackground(new java.awt.Color(153, 153, 0));
        lblAmmoAmount.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        lblAmmoAmount.setForeground(new java.awt.Color(255, 255, 255));
        lblAmmoAmount.setText("Ammo Amount");

        positionSlider.setBackground(new java.awt.Color(0, 51, 102));
        positionSlider.setForeground(new java.awt.Color(255, 255, 255));
        positionSlider.setMajorTickSpacing(20);
        positionSlider.setMinorTickSpacing(10);
        positionSlider.setPaintLabels(true);
        positionSlider.setPaintTicks(true);
        positionSlider.setSnapToTicks(true);
        positionSlider.setToolTipText("");
        positionSlider.setValue(0);
        positionSlider.setEnabled(false);
        positionSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                positionSliderStateChanged(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(153, 153, 0));
        jLabel5.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("UNIT STATUS");

        jLabel1.setBackground(new java.awt.Color(51, 51, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("•");

        jLabel2.setBackground(new java.awt.Color(51, 51, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("•");

        jLabel3.setBackground(new java.awt.Color(51, 51, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("•");

        jLabel6.setBackground(new java.awt.Color(51, 51, 0));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("•");

        ammoField.setBackground(new java.awt.Color(51, 51, 51));
        ammoField.setEditable(false);
        ammoField.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        ammoField.setForeground(new java.awt.Color(255, 255, 255));

        soldierField.setBackground(new java.awt.Color(51, 51, 51));
        soldierField.setEditable(false);
        soldierField.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        soldierField.setForeground(new java.awt.Color(255, 255, 255));
        soldierField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soldierFieldActionPerformed(evt);
            }
        });

        fuelField.setBackground(new java.awt.Color(51, 51, 51));
        fuelField.setEditable(false);
        fuelField.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        fuelField.setForeground(new java.awt.Color(255, 255, 255));
        fuelField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fuelFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 14, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblAmmoAmount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblFuelAmount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblSoldierCount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(125, 125, 125)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ammoField, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fuelField, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(soldierField, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabelPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(positionSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(lblAmmoAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ammoField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(lblSoldierCount, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(soldierField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lblFuelAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fuelField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(positionSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        jPanel6.setBackground(new java.awt.Color(0, 51, 102));

        jLabel7.setBackground(new java.awt.Color(153, 153, 0));
        jLabel7.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("COMMUNICATION LOG");

        txtArea.setEditable(false);
        txtArea.setBackground(new java.awt.Color(51, 51, 51));
        txtArea.setColumns(20);
        txtArea.setForeground(new java.awt.Color(234, 240, 246));
        txtArea.setRows(5);
        txtArea.setCaretColor(new java.awt.Color(24, 182, 164));
        jScrollPane1.setViewportView(txtArea);

        txtMaessage.setBackground(new java.awt.Color(51, 51, 51));
        txtMaessage.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtMaessage.setForeground(new java.awt.Color(255, 255, 255));
        txtMaessage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtMaessageMouseClicked(evt);
            }
        });
        txtMaessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaessageActionPerformed(evt);
            }
        });

        btnSend.setBackground(new java.awt.Color(0, 0, 51));
        btnSend.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        btnSend.setForeground(new java.awt.Color(255, 255, 255));
        btnSend.setText("SEND");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(txtMaessage, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaessage, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout BGPanelLayout = new javax.swing.GroupLayout(BGPanel);
        BGPanel.setLayout(BGPanelLayout);
        BGPanelLayout.setHorizontalGroup(
            BGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BGPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        BGPanelLayout.setVerticalGroup(
            BGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BGPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BGPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        // TODO add your handling code here:
        String message = txtMaessage.getText().trim();
        controller.sendMessage(message);
        txtMaessage.setText("");
    }//GEN-LAST:event_btnSendActionPerformed

    private void defenceCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_defenceCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_defenceCheckBoxActionPerformed

    private void collectInformationbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_collectInformationbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_collectInformationbtnActionPerformed

    private void areaClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaClearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_areaClearActionPerformed

    private void areaClearItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_areaClearItemStateChanged
        // TODO add your handling code here:
        boolean isSelect = areaClear.isSelected();
        areaClear.setText(isSelect?"AREA NOT CLEAR":"AREA CLEAR");
        positionSlider.setEnabled(isSelect);
        controller.updateAreaState(isSelect);

    }//GEN-LAST:event_areaClearItemStateChanged

    private void positionSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_positionSliderStateChanged
        // TODO add your handling code here:
        int value = positionSlider.getValue();
        controller.updatePosition(value);
    }//GEN-LAST:event_positionSliderStateChanged

    private void txtMaessageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMaessageMouseClicked
        // TODO add your handling code here:
        txtMaessage.setText("");
    }//GEN-LAST:event_txtMaessageMouseClicked

    private void txtMaessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaessageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaessageActionPerformed

    private void fuelFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fuelFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fuelFieldActionPerformed

    private void soldierFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soldierFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_soldierFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BGPanel;
    private java.awt.TextField ammoField;
    private javax.swing.JCheckBox areaClear;
    private javax.swing.JButton btnSend;
    private javax.swing.JButton collectInformationbtn;
    private javax.swing.JComboBox<String> defenceCheckBox;
    private java.awt.TextField fuelField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelPosition;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JLabel lblAmmoAmount;
    private javax.swing.JLabel lblFuelAmount;
    private javax.swing.JLabel lblSoldierCount;
    private javax.swing.JSlider positionSlider;
    private java.awt.TextField soldierField;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtMaessage;
    // End of variables declaration//GEN-END:variables
}
