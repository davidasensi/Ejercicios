/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HysokA
 */
public class Presupuesto extends javax.swing.JFrame {

    /**
     * Creates new form Presupuesto
     */
    public Presupuesto() {
        initComponents();
        combopantalla.setVisible(false);
        comboimpresora.setVisible(false);
        labelimpresora.setVisible(false);
        txtimpresora.setVisible(false);
        labelpantalla.setVisible(false);
        txtpantalla.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoprocesador = new javax.swing.ButtonGroup();
        gruporam = new javax.swing.ButtonGroup();
        panelproc = new javax.swing.JPanel();
        proc1 = new javax.swing.JRadioButton();
        proc2 = new javax.swing.JRadioButton();
        proc3 = new javax.swing.JRadioButton();
        proc4 = new javax.swing.JRadioButton();
        panelram = new javax.swing.JPanel();
        ram1 = new javax.swing.JRadioButton();
        ram2 = new javax.swing.JRadioButton();
        ram3 = new javax.swing.JRadioButton();
        ram4 = new javax.swing.JRadioButton();
        btimpresora = new javax.swing.JCheckBox();
        btpantalla = new javax.swing.JCheckBox();
        comboimpresora = new javax.swing.JComboBox();
        combopantalla = new javax.swing.JComboBox();
        btratonteclado = new javax.swing.JCheckBox();
        labelbase = new javax.swing.JLabel();
        txtbase = new javax.swing.JTextField();
        labelprocesador = new javax.swing.JLabel();
        txtprocesador = new javax.swing.JTextField();
        labelram = new javax.swing.JLabel();
        txtram = new javax.swing.JTextField();
        labelimpresora = new javax.swing.JLabel();
        txtimpresora = new javax.swing.JTextField();
        labelpantalla = new javax.swing.JLabel();
        txtpantalla = new javax.swing.JTextField();
        labeldescuento = new javax.swing.JLabel();
        labeliva = new javax.swing.JLabel();
        txtiva = new javax.swing.JTextField();
        txtdescuento = new javax.swing.JTextField();
        txtratonteclado = new javax.swing.JTextField();
        limpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIENDA MI CASA");

        panelproc.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Procesador", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        panelproc.setName(""); // NOI18N

        grupoprocesador.add(proc1);
        proc1.setText("AMD XENON");
        proc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proc1ActionPerformed(evt);
            }
        });

        grupoprocesador.add(proc2);
        proc2.setText("INTEL I3 2,4GH");
        proc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proc2ActionPerformed(evt);
            }
        });

        grupoprocesador.add(proc3);
        proc3.setText("INTEL I5 3,2GH");
        proc3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proc3ActionPerformed(evt);
            }
        });

        grupoprocesador.add(proc4);
        proc4.setText("INTEL I7 4,5GH");
        proc4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proc4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelprocLayout = new javax.swing.GroupLayout(panelproc);
        panelproc.setLayout(panelprocLayout);
        panelprocLayout.setHorizontalGroup(
            panelprocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelprocLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelprocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(proc1)
                    .addComponent(proc2)
                    .addComponent(proc3)
                    .addComponent(proc4))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        panelprocLayout.setVerticalGroup(
            panelprocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelprocLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(proc1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(proc2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(proc3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(proc4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelram.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ram", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        gruporam.add(ram1);
        ram1.setText("1 GB DDR2");
        ram1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ram1ActionPerformed(evt);
            }
        });

        gruporam.add(ram2);
        ram2.setText("2 GB DDR2");
        ram2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ram2ActionPerformed(evt);
            }
        });

        gruporam.add(ram3);
        ram3.setText("2 GB DDR3");
        ram3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ram3ActionPerformed(evt);
            }
        });

        gruporam.add(ram4);
        ram4.setText("8 GB DDR3");
        ram4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ram4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelramLayout = new javax.swing.GroupLayout(panelram);
        panelram.setLayout(panelramLayout);
        panelramLayout.setHorizontalGroup(
            panelramLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelramLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelramLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ram1)
                    .addComponent(ram2)
                    .addComponent(ram3)
                    .addComponent(ram4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelramLayout.setVerticalGroup(
            panelramLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelramLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ram1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ram2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ram3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ram4)
                .addContainerGap())
        );

        btimpresora.setText("Impresora");
        btimpresora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btimpresoraActionPerformed(evt);
            }
        });

        btpantalla.setText("pantalla");
        btpantalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btpantallaActionPerformed(evt);
            }
        });

        comboimpresora.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "seleccione", "HP fx 2500", "HP SX 2750", "Epson GTC", "CANON SW" }));
        comboimpresora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboimpresoraActionPerformed(evt);
            }
        });

        combopantalla.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "LG 19\"", "LG 21\"", "ASUS 21\"", "ASUS 24\"" }));
        combopantalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combopantallaActionPerformed(evt);
            }
        });

        btratonteclado.setText("Raton y Teclado");
        btratonteclado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btratontecladoActionPerformed(evt);
            }
        });

        labelbase.setText("Valor Total");

        txtbase.setEditable(false);
        txtbase.setText("0");
        txtbase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbaseActionPerformed(evt);
            }
        });

        labelprocesador.setText("Valor procesador");

        txtprocesador.setEditable(false);
        txtprocesador.setText("0");
        txtprocesador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprocesadorActionPerformed(evt);
            }
        });

        labelram.setText("Valor ram");

        txtram.setEditable(false);
        txtram.setText("0");

        labelimpresora.setText("Valor impresora");

        txtimpresora.setEditable(false);
        txtimpresora.setText("0");

        labelpantalla.setText("Valor pantalla");

        txtpantalla.setEditable(false);
        txtpantalla.setText("0");

        labeldescuento.setText("Descuento");

        labeliva.setText("IVA");

        txtiva.setEditable(false);
        txtiva.setText("21");

        txtdescuento.setText("0");
        txtdescuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdescuentoActionPerformed(evt);
            }
        });

        txtratonteclado.setEditable(false);
        txtratonteclado.setText("0");

        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelram, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelproc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(limpiar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(labelram)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btratonteclado)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtratonteclado, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(btpantalla)))
                                .addGap(122, 122, 122)
                                .addComponent(labeldescuento))
                            .addComponent(labelprocesador)
                            .addComponent(labelbase)
                            .addComponent(labeliva, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btimpresora)
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(combopantalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(comboimpresora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelimpresora, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(labelpantalla, javax.swing.GroupLayout.Alignment.TRAILING))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtiva)
                            .addComponent(txtbase, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                            .addComponent(txtimpresora, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                            .addComponent(txtram)
                            .addComponent(txtprocesador)
                            .addComponent(txtpantalla)
                            .addComponent(txtdescuento, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelproc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(limpiar)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelprocesador, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtprocesador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(panelram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelram))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelimpresora)
                        .addComponent(txtimpresora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btimpresora)
                        .addComponent(comboimpresora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtdescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labeldescuento))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labeliva)
                            .addComponent(txtiva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelbase)
                            .addComponent(txtbase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtpantalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelpantalla)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btpantalla)
                                    .addComponent(combopantalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btratonteclado)
                            .addComponent(txtratonteclado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 55, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void calcular(){
  int procesador=0,ram=0,impresora=0,pantalla=0,ratonteclado=0,descuento,varaux;
  double iva=0,tot,total;
  procesador=Integer.parseInt(txtprocesador.getText());
  ram=Integer.parseInt(txtram.getText());
  impresora=Integer.parseInt(txtimpresora.getText());
  pantalla=Integer.parseInt(txtpantalla.getText());
  ratonteclado=Integer.parseInt(txtratonteclado.getText());
  descuento=Integer.parseInt(txtdescuento.getText());
  tot=procesador+ram+impresora+pantalla+ratonteclado;
  iva=Double.parseDouble(txtiva.getText());
  
  
  total=tot-(tot*descuento)/100;
  total=total+(total*iva/100);
  
  
  txtbase.setText(String.valueOf(total));
}
    
    private void txtbaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbaseActionPerformed
calcular();        


    }//GEN-LAST:event_txtbaseActionPerformed

    private void txtprocesadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprocesadorActionPerformed
        


    }//GEN-LAST:event_txtprocesadorActionPerformed

    private void proc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proc1ActionPerformed

        
if(proc1.isSelected()==true){
            txtprocesador.setText("50");
        }// TODO add your handling code here:
calcular();
    }//GEN-LAST:event_proc1ActionPerformed

    private void proc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proc2ActionPerformed
if(proc2.isSelected()==true){
            txtprocesador.setText("100");
            calcular();
        }


    }//GEN-LAST:event_proc2ActionPerformed

    private void proc3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proc3ActionPerformed
if(proc3.isSelected()==true){
            txtprocesador.setText("150");
            calcular();
        }

    }//GEN-LAST:event_proc3ActionPerformed

    private void proc4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proc4ActionPerformed
if(proc4.isSelected()==true){
            txtprocesador.setText("200");
            calcular();
        }
        
        
    }//GEN-LAST:event_proc4ActionPerformed

    private void ram1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ram1ActionPerformed
if(ram1.isSelected()==true){
            txtram.setText("30");
            calcular();
        }


    }//GEN-LAST:event_ram1ActionPerformed

    private void ram2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ram2ActionPerformed
if(ram2.isSelected()==true){
            txtram.setText("45");
            calcular();
        }

    }//GEN-LAST:event_ram2ActionPerformed

    private void ram3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ram3ActionPerformed
if(ram3.isSelected()==true){
            txtram.setText("50");
            calcular();
        }

    }//GEN-LAST:event_ram3ActionPerformed

    private void ram4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ram4ActionPerformed
if(ram4.isSelected()==true){
            txtram.setText("75");
            calcular();
        }

    }//GEN-LAST:event_ram4ActionPerformed

    private void btratontecladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btratontecladoActionPerformed
if(btratonteclado.isSelected()==true){
            txtratonteclado.setText("15");
        }
else{
    txtratonteclado.setText("0");
}
calcular();
    }//GEN-LAST:event_btratontecladoActionPerformed

    private void btimpresoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btimpresoraActionPerformed
if(btimpresora.isSelected()==true){
    comboimpresora.setVisible(true);
    labelimpresora.setVisible(true);
        txtimpresora.setVisible(true);
    
}else{
    comboimpresora.setVisible(false);
    labelimpresora.setVisible(false);
        txtimpresora.setVisible(false);
        txtimpresora.setText("0");
}
calcular();
    }//GEN-LAST:event_btimpresoraActionPerformed

    private void btpantallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btpantallaActionPerformed
if(btpantalla.isSelected()==true){
    combopantalla.setVisible(true);
    labelpantalla.setVisible(true);
        txtpantalla.setVisible(true);
    
}else{
    combopantalla.setVisible(false);
    labelpantalla.setVisible(false);
        txtpantalla.setVisible(false);
        txtimpresora.setText("0");
}
calcular();
    }//GEN-LAST:event_btpantallaActionPerformed

    private void comboimpresoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboimpresoraActionPerformed
if(comboimpresora.getSelectedIndex()==0){
    txtimpresora.setText("0");
    
}
if(comboimpresora.getSelectedIndex()==1){
    txtimpresora.setText("55");
    
}
if(comboimpresora.getSelectedIndex()==2){
    txtimpresora.setText("65");
    
}
if(comboimpresora.getSelectedIndex()==3){
    
    txtimpresora.setText("75");
    
}
if(comboimpresora.getSelectedIndex()==4){
    
    txtimpresora.setText("90");
    
}
calcular();
    }//GEN-LAST:event_comboimpresoraActionPerformed

    private void combopantallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combopantallaActionPerformed
if(combopantalla.getSelectedIndex()==0){
    txtpantalla.setText("0");
    
}
if(combopantalla.getSelectedIndex()==1){
    txtpantalla.setText("100");
    
}
if(combopantalla.getSelectedIndex()==2){
    txtpantalla.setText("125");
    
}
if(combopantalla.getSelectedIndex()==3){
    
    txtpantalla.setText("180");
    
}
if(combopantalla.getSelectedIndex()==4){
    
    txtpantalla.setText("250");
    
}
calcular();
    }//GEN-LAST:event_combopantallaActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
grupoprocesador.clearSelection();
        gruporam.clearSelection();
        btratonteclado.setSelected(false);
btimpresora.setSelected(false);
btpantalla.setSelected(false);
combopantalla.setVisible(false);
        comboimpresora.setVisible(false);
    txtprocesador.setText("0");
    txtram.setText("0");
    txtpantalla.setText("0");
    txtimpresora.setText("0");
    txtratonteclado.setText("0");
    txtdescuento.setText("0");
calcular();
    }//GEN-LAST:event_limpiarActionPerformed

    private void txtdescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdescuentoActionPerformed
        String valor="",cero="0";
        valor=txtdescuento.getText();
        if(valor.equals(cero)){
            
        }
        else{
            calcular();
        }
    }//GEN-LAST:event_txtdescuentoActionPerformed

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
            java.util.logging.Logger.getLogger(Presupuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Presupuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Presupuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Presupuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Presupuesto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox btimpresora;
    private javax.swing.JCheckBox btpantalla;
    private javax.swing.JCheckBox btratonteclado;
    private javax.swing.JComboBox comboimpresora;
    private javax.swing.JComboBox combopantalla;
    private javax.swing.ButtonGroup grupoprocesador;
    private javax.swing.ButtonGroup gruporam;
    private javax.swing.JLabel labelbase;
    private javax.swing.JLabel labeldescuento;
    private javax.swing.JLabel labelimpresora;
    private javax.swing.JLabel labeliva;
    private javax.swing.JLabel labelpantalla;
    private javax.swing.JLabel labelprocesador;
    private javax.swing.JLabel labelram;
    private javax.swing.JButton limpiar;
    private javax.swing.JPanel panelproc;
    private javax.swing.JPanel panelram;
    private javax.swing.JRadioButton proc1;
    private javax.swing.JRadioButton proc2;
    private javax.swing.JRadioButton proc3;
    private javax.swing.JRadioButton proc4;
    private javax.swing.JRadioButton ram1;
    private javax.swing.JRadioButton ram2;
    private javax.swing.JRadioButton ram3;
    private javax.swing.JRadioButton ram4;
    private javax.swing.JTextField txtbase;
    private javax.swing.JTextField txtdescuento;
    private javax.swing.JTextField txtimpresora;
    private javax.swing.JTextField txtiva;
    private javax.swing.JTextField txtpantalla;
    private javax.swing.JTextField txtprocesador;
    private javax.swing.JTextField txtram;
    private javax.swing.JTextField txtratonteclado;
    // End of variables declaration//GEN-END:variables
}
