/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.calculadora;

import com.mycompany.calculadora.Calculos.Calculos;
import com.mycompany.calculadora.enums.Cal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 *
 * @author João
 */
public class TelaCalculadora extends javax.swing.JFrame {
     
    
    private Calculos calu;
    private Cal ultimaopercao;
    
    /**
     * Creates new form TelaCalculadora
     */
    public TelaCalculadora() {
        initComponents();
        calu = new Calculos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BotaoCE = new javax.swing.JButton();
        BotaoMultiplicar = new javax.swing.JButton();
        BotaoDividir = new javax.swing.JButton();
        BotaoSomar = new javax.swing.JButton();
        BotaoDiminuir = new javax.swing.JButton();
        BotaoIgual = new javax.swing.JButton();
        BotaoPorcentagem = new javax.swing.JButton();
        BotaoHistorico = new javax.swing.JButton();
        Botao9 = new javax.swing.JButton();
        Botao6 = new javax.swing.JButton();
        Botao3 = new javax.swing.JButton();
        Botao8 = new javax.swing.JButton();
        Botao7 = new javax.swing.JButton();
        Botao5 = new javax.swing.JButton();
        Botao4 = new javax.swing.JButton();
        Botao2 = new javax.swing.JButton();
        Botao1 = new javax.swing.JButton();
        BotaoVirgula = new javax.swing.JButton();
        Botao0 = new javax.swing.JButton();
        Visor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");

        BotaoCE.setText("CE");
        BotaoCE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoCEMouseClicked(evt);
            }
        });
        BotaoCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCEActionPerformed(evt);
            }
        });
        BotaoCE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BotaoCEKeyPressed(evt);
            }
        });

        BotaoMultiplicar.setText("*");
        BotaoMultiplicar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoMultiplicarMouseClicked(evt);
            }
        });
        BotaoMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoMultiplicarActionPerformed(evt);
            }
        });
        BotaoMultiplicar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BotaoMultiplicarKeyPressed(evt);
            }
        });

        BotaoDividir.setText("/");
        BotaoDividir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoDividirMouseClicked(evt);
            }
        });
        BotaoDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoDividirActionPerformed(evt);
            }
        });
        BotaoDividir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BotaoDividirKeyPressed(evt);
            }
        });

        BotaoSomar.setText("+");
        BotaoSomar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoSomarMouseClicked(evt);
            }
        });
        BotaoSomar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSomarActionPerformed(evt);
            }
        });
        BotaoSomar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BotaoSomarKeyPressed(evt);
            }
        });

        BotaoDiminuir.setText("-");
        BotaoDiminuir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoDiminuirMouseClicked(evt);
            }
        });
        BotaoDiminuir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoDiminuirActionPerformed(evt);
            }
        });
        BotaoDiminuir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BotaoDiminuirKeyPressed(evt);
            }
        });

        BotaoIgual.setText("=");
        BotaoIgual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoIgualMouseClicked(evt);
            }
        });
        BotaoIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoIgualActionPerformed(evt);
            }
        });
        BotaoIgual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BotaoIgualKeyPressed(evt);
            }
        });

        BotaoPorcentagem.setText("%");
        BotaoPorcentagem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoPorcentagemMouseClicked(evt);
            }
        });
        BotaoPorcentagem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BotaoPorcentagemKeyPressed(evt);
            }
        });

        BotaoHistorico.setText("H");
        BotaoHistorico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoHistoricoMouseClicked(evt);
            }
        });
        BotaoHistorico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BotaoHistoricoKeyPressed(evt);
            }
        });

        Botao9.setText("9");
        Botao9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botao9MouseClicked(evt);
            }
        });
        Botao9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Botao9KeyPressed(evt);
            }
        });

        Botao6.setText("6");
        Botao6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botao6MouseClicked(evt);
            }
        });
        Botao6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Botao6KeyPressed(evt);
            }
        });

        Botao3.setText("3");
        Botao3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botao3MouseClicked(evt);
            }
        });
        Botao3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Botao3KeyPressed(evt);
            }
        });

        Botao8.setText("8");
        Botao8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botao8MouseClicked(evt);
            }
        });
        Botao8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao8ActionPerformed(evt);
            }
        });
        Botao8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Botao8KeyPressed(evt);
            }
        });

        Botao7.setText("7");
        Botao7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botao7MouseClicked(evt);
            }
        });
        Botao7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Botao7KeyPressed(evt);
            }
        });

        Botao5.setText("5");
        Botao5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botao5MouseClicked(evt);
            }
        });
        Botao5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Botao5KeyPressed(evt);
            }
        });

        Botao4.setText("4");
        Botao4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botao4MouseClicked(evt);
            }
        });
        Botao4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Botao4KeyPressed(evt);
            }
        });

        Botao2.setText("2");
        Botao2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botao2MouseClicked(evt);
            }
        });
        Botao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao2ActionPerformed(evt);
            }
        });
        Botao2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Botao2KeyPressed(evt);
            }
        });

        Botao1.setText("1");
        Botao1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botao1MouseClicked(evt);
            }
        });
        Botao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao1ActionPerformed(evt);
            }
        });
        Botao1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Botao1KeyPressed(evt);
            }
        });

        BotaoVirgula.setText(",");
        BotaoVirgula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoVirgulaMouseClicked(evt);
            }
        });
        BotaoVirgula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BotaoVirgulaKeyPressed(evt);
            }
        });

        Botao0.setText("0");
        Botao0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Botao0MouseClicked(evt);
            }
        });
        Botao0.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Botao0KeyPressed(evt);
            }
        });

        Visor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Visor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Visor)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Botao4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Botao5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Botao6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotaoDiminuir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BotaoHistorico, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                    .addComponent(Botao7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BotaoCE, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                    .addComponent(Botao8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(7, 7, 7)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Botao9, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                    .addComponent(BotaoPorcentagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BotaoMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BotaoDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(Botao0, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BotaoVirgula, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BotaoIgual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(Botao1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Botao2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Botao3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BotaoSomar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(Visor, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoPorcentagem, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoCE, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Botao7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botao8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botao9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(BotaoDiminuir, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(Botao6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Botao5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Botao4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Botao1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botao2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botao3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoSomar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Botao0, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(BotaoIgual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotaoVirgula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
       
     
    private void BotaoDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoDividirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoDividirActionPerformed

    private void BotaoDiminuirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoDiminuirActionPerformed
         calu.Calc(Cal.Subtracao, StringToDouble(Visor.getText()));
         ultimaopercao = Cal.Subtracao;
         limpar();
    }//GEN-LAST:event_BotaoDiminuirActionPerformed

    private void Botao8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Botao8ActionPerformed

    private void BotaoIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoIgualActionPerformed
        calu.Calc(ultimaopercao, StringToDouble(Visor.getText()));
        Visor.setText(DoubleToString(calu.getTotal())); 
        calu.zerar();
    }//GEN-LAST:event_BotaoIgualActionPerformed

    private void BotaoHistoricoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoHistoricoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoHistoricoMouseClicked

    private void BotaoCEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoCEMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoCEMouseClicked

    private void BotaoPorcentagemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoPorcentagemMouseClicked
        digita("%");// TODO add your handling code here:
    }//GEN-LAST:event_BotaoPorcentagemMouseClicked

    private void BotaoDividirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoDividirMouseClicked
        digita("/");// TODO add your handling code here:
    }//GEN-LAST:event_BotaoDividirMouseClicked

    private void Botao7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botao7MouseClicked
        digita("7");// TODO add your handling code here:
    }//GEN-LAST:event_Botao7MouseClicked

    private void Botao8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botao8MouseClicked
        digita("8");// TODO add your handling code here:
    }//GEN-LAST:event_Botao8MouseClicked

    private void Botao9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botao9MouseClicked
        digita("9");// TODO add your handling code here:
    }//GEN-LAST:event_Botao9MouseClicked

    private void BotaoMultiplicarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoMultiplicarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoMultiplicarMouseClicked

    private void Botao4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botao4MouseClicked
        digita("4");// TODO add your handling code here:
    }//GEN-LAST:event_Botao4MouseClicked

    private void Botao5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botao5MouseClicked
        digita("5");// TODO add your handling code here:
    }//GEN-LAST:event_Botao5MouseClicked

    private void Botao6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botao6MouseClicked
        digita("6");// TODO add your handling code here:
    }//GEN-LAST:event_Botao6MouseClicked

    private void BotaoDiminuirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoDiminuirMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoDiminuirMouseClicked

    private void Botao1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botao1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botao1MouseClicked

    private void Botao2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botao2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Botao2MouseClicked

    private void Botao3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botao3MouseClicked
        digita("3");// TODO add your handling code here:
    }//GEN-LAST:event_Botao3MouseClicked

    private void BotaoSomarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoSomarMouseClicked
           // TODO add your handling code here:
    }//GEN-LAST:event_BotaoSomarMouseClicked

    private void Botao0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botao0MouseClicked
        digita("0");// TODO add your handling code here:
    }//GEN-LAST:event_Botao0MouseClicked

    private void BotaoVirgulaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoVirgulaMouseClicked
        digita(",");// TODO add your handling code here:
    }//GEN-LAST:event_BotaoVirgulaMouseClicked

    private void BotaoIgualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoIgualMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoIgualMouseClicked

    private void BotaoHistoricoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BotaoHistoricoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoHistoricoKeyPressed

    private void BotaoCEKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BotaoCEKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoCEKeyPressed

    private void BotaoPorcentagemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BotaoPorcentagemKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoPorcentagemKeyPressed

    private void BotaoDividirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BotaoDividirKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoDividirKeyPressed

    private void Botao7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Botao7KeyPressed
       // TODO add your handling code here:
    }//GEN-LAST:event_Botao7KeyPressed

    private void Botao8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Botao8KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Botao8KeyPressed

    private void Botao9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Botao9KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Botao9KeyPressed

    private void BotaoMultiplicarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BotaoMultiplicarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoMultiplicarKeyPressed

    private void Botao4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Botao4KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Botao4KeyPressed

    private void Botao5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Botao5KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Botao5KeyPressed

    private void Botao6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Botao6KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Botao6KeyPressed

    private void BotaoDiminuirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BotaoDiminuirKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoDiminuirKeyPressed

    private void Botao1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Botao1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Botao1KeyPressed

    private void Botao2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Botao2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Botao2KeyPressed

    private void Botao3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Botao3KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Botao3KeyPressed

    private void BotaoSomarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BotaoSomarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoSomarKeyPressed

    private void Botao0KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Botao0KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Botao0KeyPressed

    private void BotaoVirgulaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BotaoVirgulaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoVirgulaKeyPressed

    private void BotaoIgualKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BotaoIgualKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoIgualKeyPressed

    private void BotaoSomarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSomarActionPerformed
         
        calu.Calc(Cal.SOMA, StringToDouble(Visor.getText()));
        ultimaopercao = Cal.SOMA;                                                     
        limpar();
    }//GEN-LAST:event_BotaoSomarActionPerformed

    private void BotaoCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCEActionPerformed
        limpar();// TODO add your handling code here:
        calu.zerar();
    }//GEN-LAST:event_BotaoCEActionPerformed

    private void Botao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao1ActionPerformed
       digita("1"); // TODO add your handling code here:
    }//GEN-LAST:event_Botao1ActionPerformed

    private void Botao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao2ActionPerformed
       digita("2"); // TODO add your handling code here:
    }//GEN-LAST:event_Botao2ActionPerformed

    private void BotaoMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoMultiplicarActionPerformed
        calu.Calc(Cal.Multiplicacao, StringToDouble(Visor.getText()));
         ultimaopercao = Cal.Multiplicacao;
         limpar();// TODO add your handling code here:
    }//GEN-LAST:event_BotaoMultiplicarActionPerformed
    
    private String DoubleToString(Double numero) {
     if (numero != null) {
      DecimalFormat formato = new DecimalFormat("##,###,###,###,#0" ,new DecimalFormatSymbols(new Locale("pt" , "BR")));
      formato.setParseBigDecimal(true);
      return formato.format(numero);
     }
     return "";
    }
    
    
    private Double StringToDouble(String numero) {
     NumberFormat nf = NumberFormat.getInstance();
     Double dv = 0.0;
     try {
        dv = nf.parse(numero).doubleValue();
     } catch(ParseException ex){
      
     }
     return dv;
    }
    
    private void limpar() {
     Visor.setText("");
    } 
    
    private void digita(String caractere){
      if (Visor.getText().equals("")) {
        Visor.setText(caractere);
      
      } else {
        
        if (caractere.equals(",") && Visor.getText().contains(",")) {
        
        
        } else {
          Visor.setText(Visor.getText().concat(caractere));
        }
      
      }
      
      
         
      
      
     }
       
   
    
       

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Botao0;
    private javax.swing.JButton Botao1;
    private javax.swing.JButton Botao2;
    private javax.swing.JButton Botao3;
    private javax.swing.JButton Botao4;
    private javax.swing.JButton Botao5;
    private javax.swing.JButton Botao6;
    private javax.swing.JButton Botao7;
    private javax.swing.JButton Botao8;
    private javax.swing.JButton Botao9;
    private javax.swing.JButton BotaoCE;
    private javax.swing.JButton BotaoDiminuir;
    private javax.swing.JButton BotaoDividir;
    private javax.swing.JButton BotaoHistorico;
    private javax.swing.JButton BotaoIgual;
    private javax.swing.JButton BotaoMultiplicar;
    private javax.swing.JButton BotaoPorcentagem;
    private javax.swing.JButton BotaoSomar;
    private javax.swing.JButton BotaoVirgula;
    private javax.swing.JTextField Visor;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables



   


}
