/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aku
 */
public class kalkulator extends javax.swing.JFrame {
    public boolean desimal = false;
    public double angka1 = 0;
    public double angka2 = 0;
    public boolean tambah = false;
    public boolean kurang = false;
    public boolean kali = false;
    public boolean bagi = false;
    /**
     * Creates new form kalkulator
     */
    public kalkulator() {
        initComponents();
    }
    public void aritmatika(){
        Display.setText("");
        if(this.tambah){
            this.tambah = false;
            this.angka1 += this.angka2;
            this.angka2 = 0;
            Display.setText(Double.toString(this.angka1));
        }else if(this.kurang){
            this.kurang = false;
            this.angka1 -= this.angka2;
            this.angka2 = 0;
            Display.setText(Double.toString(this.angka1));
        }else if(this.kali){
            this.kali = false;
            this.angka1 *= this.angka2;
            this.angka2 = 0;
            Display.setText(Double.toString(this.angka1));
        }else if(this.bagi){
            this.bagi = false;
             this.angka1 += this.angka2;
            this.angka2 /= 0;
            Display.setText(Double.toString(this.angka1));
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

        Display = new javax.swing.JTextField();
        Judul = new javax.swing.JLabel();
        Btn7 = new javax.swing.JButton();
        BtnHapus = new javax.swing.JButton();
        Btn3 = new javax.swing.JButton();
        Btn2 = new javax.swing.JButton();
        Btn1 = new javax.swing.JButton();
        Btn6 = new javax.swing.JButton();
        Btn5 = new javax.swing.JButton();
        Btn4 = new javax.swing.JButton();
        Btn8 = new javax.swing.JButton();
        Btn9 = new javax.swing.JButton();
        BtnJumlah = new javax.swing.JButton();
        BtnTambah = new javax.swing.JButton();
        BtnKurang = new javax.swing.JButton();
        BtnBagi = new javax.swing.JButton();
        BtnKali = new javax.swing.JButton();
        BtnClear = new javax.swing.JButton();
        Btn0 = new javax.swing.JButton();
        BtnKoma = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        setMaximumSize(new java.awt.Dimension(280, 300));
        setMinimumSize(new java.awt.Dimension(280, 300));
        setName("FrameKalkulator"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        Display.setBackground(new java.awt.Color(204, 204, 204));
        Display.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Display.setForeground(new java.awt.Color(255, 255, 255));
        Display.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Display.setDoubleBuffered(true);
        Display.setDragEnabled(true);
        Display.setEnabled(false);
        Display.setName("ShowNumber"); // NOI18N
        Display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayActionPerformed(evt);
            }
        });

        Judul.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        Judul.setText("Kalkulator");
        Judul.setToolTipText("");
        Judul.setName("NameLabelKalkulator"); // NOI18N

        Btn7.setText("7");
        Btn7.setName("Btn7"); // NOI18N
        Btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn7ActionPerformed(evt);
            }
        });

        BtnHapus.setText("<X");
        BtnHapus.setName("BtnHapus"); // NOI18N
        BtnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHapusActionPerformed(evt);
            }
        });

        Btn3.setText("3");
        Btn3.setName("Btn3"); // NOI18N
        Btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn3ActionPerformed(evt);
            }
        });

        Btn2.setText("2");
        Btn2.setName("Btn2"); // NOI18N
        Btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn2ActionPerformed(evt);
            }
        });

        Btn1.setText("1");
        Btn1.setName("Btn1"); // NOI18N
        Btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn1ActionPerformed(evt);
            }
        });

        Btn6.setText("6");
        Btn6.setName("Btn6"); // NOI18N
        Btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn6ActionPerformed(evt);
            }
        });

        Btn5.setText("5");
        Btn5.setName("Btn5"); // NOI18N
        Btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn5ActionPerformed(evt);
            }
        });

        Btn4.setText("4");
        Btn4.setName("Btn4"); // NOI18N
        Btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn4ActionPerformed(evt);
            }
        });

        Btn8.setText("8");
        Btn8.setName("Btn8"); // NOI18N
        Btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn8ActionPerformed(evt);
            }
        });

        Btn9.setText("9");
        Btn9.setName("Btn9"); // NOI18N
        Btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn9ActionPerformed(evt);
            }
        });

        BtnJumlah.setText("=");
        BtnJumlah.setName("BtnEnter"); // NOI18N
        BtnJumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnJumlahActionPerformed(evt);
            }
        });

        BtnTambah.setText("+");
        BtnTambah.setName("BtnTambah"); // NOI18N
        BtnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTambahActionPerformed(evt);
            }
        });

        BtnKurang.setText("-");
        BtnKurang.setName("BtnKurang"); // NOI18N
        BtnKurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnKurangActionPerformed(evt);
            }
        });

        BtnBagi.setText("/");
        BtnBagi.setName("BtnBagi"); // NOI18N
        BtnBagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBagiActionPerformed(evt);
            }
        });

        BtnKali.setText("X");
        BtnKali.setName("BtnKali"); // NOI18N
        BtnKali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnKaliActionPerformed(evt);
            }
        });

        BtnClear.setText("C");
        BtnClear.setName("BtnClear"); // NOI18N
        BtnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnClearActionPerformed(evt);
            }
        });

        Btn0.setText("0");
        Btn0.setName("Btn0"); // NOI18N
        Btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn0ActionPerformed(evt);
            }
        });

        BtnKoma.setText(".");
        BtnKoma.setName("Btnkoma"); // NOI18N
        BtnKoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnKomaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Display, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(Judul))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BtnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BtnKoma, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BtnKurang, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BtnBagi, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(Btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(BtnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(Btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(Btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnKali, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Judul)
                .addGap(7, 7, 7)
                .addComponent(Display, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnKoma, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(BtnJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnKurang, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBagi, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnKali, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Judul.getAccessibleContext().setAccessibleName("NameLabelKalkulator");
        Btn7.getAccessibleContext().setAccessibleName("Btn3");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DisplayActionPerformed

    private void BtnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHapusActionPerformed
        String cek =  String.valueOf(Display.getText().charAt(Display.getText().length() - 1));
        if(Display.getText().length() > 0){
            if(".".equals(cek)){
                this.desimal = false;
            }
            StringBuilder nomor = new StringBuilder(Display.getText());
            nomor.deleteCharAt(Display.getText().length() - 1);
            Display.setText(nomor.toString());
        }
    }//GEN-LAST:event_BtnHapusActionPerformed

    private void Btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn3ActionPerformed
        Display.setText(Display.getText()+"3");
    }//GEN-LAST:event_Btn3ActionPerformed

    private void Btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn2ActionPerformed
        Display.setText(Display.getText()+"2");
    }//GEN-LAST:event_Btn2ActionPerformed

    private void Btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn5ActionPerformed
        Display.setText(Display.getText()+"5");
    }//GEN-LAST:event_Btn5ActionPerformed

    private void Btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn8ActionPerformed
        Display.setText(Display.getText()+"8");
    }//GEN-LAST:event_Btn8ActionPerformed

    private void BtnJumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnJumlahActionPerformed
        this.desimal = false;
        this.angka2 = Double.valueOf(Display.getText());
        aritmatika();
    }//GEN-LAST:event_BtnJumlahActionPerformed

    private void BtnKurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnKurangActionPerformed
        if(this.angka1 == 0){
            this.angka1 = Double.valueOf(Display.getText());
            this.desimal = false;
            this.kurang = true;
            Display.setText("");
        }else if(this.angka2 == 0 && this.angka1 != 0){
            this.angka2 = Double.valueOf(Display.getText());
            this.desimal = false;            
            aritmatika();
            this.kurang = true;
        }
    }//GEN-LAST:event_BtnKurangActionPerformed

    private void BtnBagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBagiActionPerformed
         if(this.angka1 == 0){
            this.angka1 = Double.valueOf(Display.getText());
            this.desimal = false;
            this.bagi = true;
            Display.setText("");
        }else if(this.angka2 == 0 && this.angka1 != 0){
            this.angka2 = Double.valueOf(Display.getText());
            this.desimal = false;            
            aritmatika();
            this.bagi = true;
        }
    }//GEN-LAST:event_BtnBagiActionPerformed

    private void BtnKaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnKaliActionPerformed
         if(this.angka1 == 0){
            this.angka1 = Double.valueOf(Display.getText());
            this.desimal = false;
            this.kali = true;
            Display.setText("");
        }else if(this.angka2 == 0 && this.angka1 != 0){
            this.angka2 = Double.valueOf(Display.getText());
            this.desimal = false;            
            aritmatika();
            this.kali = true;
        }
    }//GEN-LAST:event_BtnKaliActionPerformed

    private void BtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnClearActionPerformed
        Display.setText("");
        this.desimal = false;
        this.angka1 = 0;
        this.angka2 = 0;
    }//GEN-LAST:event_BtnClearActionPerformed

    private void Btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn0ActionPerformed
        Display.setText(Display.getText()+"0");
    }//GEN-LAST:event_Btn0ActionPerformed

    private void BtnKomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnKomaActionPerformed
        if(Display.getText().length() > 0 && this.desimal == false){
           Display.setText(Display.getText()+".");
           this.desimal = true;
        }
        
    }//GEN-LAST:event_BtnKomaActionPerformed

    private void Btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn7ActionPerformed
        Display.setText(Display.getText()+"7");
    }//GEN-LAST:event_Btn7ActionPerformed

    private void Btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn1ActionPerformed
        Display.setText(Display.getText()+"1");
    }//GEN-LAST:event_Btn1ActionPerformed

    private void Btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn9ActionPerformed
        Display.setText(Display.getText()+"9");
    }//GEN-LAST:event_Btn9ActionPerformed

    private void Btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn4ActionPerformed
        Display.setText(Display.getText()+"4");
    }//GEN-LAST:event_Btn4ActionPerformed

    private void Btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn6ActionPerformed
        Display.setText(Display.getText()+"6");
    }//GEN-LAST:event_Btn6ActionPerformed

    private void BtnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTambahActionPerformed
        if(this.angka1 == 0){
            this.angka1 = Double.valueOf(Display.getText());
            this.desimal = false;
            this.tambah = true;
            Display.setText("");
        }else if(this.angka2 == 0 && this.angka1 != 0){
            this.angka2 = Double.valueOf(Display.getText());
            this.desimal = false;            
            aritmatika();
            this.tambah = true;
        }
    }//GEN-LAST:event_BtnTambahActionPerformed

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
            java.util.logging.Logger.getLogger(kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kalkulator().setVisible(true);
            }
        });
        
        /* Custome Code */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn0;
    private javax.swing.JButton Btn1;
    private javax.swing.JButton Btn2;
    private javax.swing.JButton Btn3;
    private javax.swing.JButton Btn4;
    private javax.swing.JButton Btn5;
    private javax.swing.JButton Btn6;
    private javax.swing.JButton Btn7;
    private javax.swing.JButton Btn8;
    private javax.swing.JButton Btn9;
    private javax.swing.JButton BtnBagi;
    private javax.swing.JButton BtnClear;
    private javax.swing.JButton BtnHapus;
    private javax.swing.JButton BtnJumlah;
    private javax.swing.JButton BtnKali;
    private javax.swing.JButton BtnKoma;
    private javax.swing.JButton BtnKurang;
    private javax.swing.JButton BtnTambah;
    private javax.swing.JTextField Display;
    private javax.swing.JLabel Judul;
    // End of variables declaration//GEN-END:variables
}
