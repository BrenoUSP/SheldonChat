/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Controle.Paciente;
import Main.Main;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Breno
 */
public class AudioSit extends javax.swing.JFrame {

    private boolean ouvindoMic;
    Clip clip;
    String dateLog;
    private Paciente paciente;
    private Calendar cal = Calendar.getInstance(Locale.FRENCH);

    /**
     * Creates new form AudioSit
     */
    public AudioSit(String date, Paciente paciente) {
        try {
            initComponents();
            setLocationRelativeTo(null);
            setPaciente(paciente);

            URL imageUrl = this.getClass().getResource("/Imagens/frameIcon.png");
            ImageIcon img = new ImageIcon(imageUrl);
            setIconImage(img.getImage());

            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            cal.setTime(formatter.parse(date));

            String year = String.valueOf(cal.get(Calendar.YEAR));
            String month = String.valueOf(cal.get(Calendar.MONTH) + 1);
            String day = String.valueOf(cal.get(Calendar.DAY_OF_MONTH));
            dateLog = day + "-" + month + "-" + year;

            if (!new File("C:/SheldonChat/Logs/" + getPaciente().getNomePaciente() + "/Sit1" + dateLog + ".wav").exists()) {
                this.jButtonRec1.setEnabled(false);
            }
            if (!new File("C:/SheldonChat/Logs/" + getPaciente().getNomePaciente() + "/Sit2" + dateLog + ".wav").exists()) {
                this.jButtonRec2.setEnabled(false);
            }
            if (!new File("C:/SheldonChat/Logs/" + getPaciente().getNomePaciente() + "/Sit3" + dateLog + ".wav").exists()) {
                this.jButtonRec3.setEnabled(false);
            }
            if (!new File("C:/SheldonChat/Logs/" + getPaciente().getNomePaciente() + "/Sit4" + dateLog + ".wav").exists()) {
                this.jButtonRec4.setEnabled(false);
            }
            if (!new File("C:/SheldonChat/Logs/" + getPaciente().getNomePaciente() + "/Sit5" + dateLog + ".wav").exists()) {
                this.jButtonRec5.setEnabled(false);
            }

        } catch (Exception e) {
            e.printStackTrace();
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

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButtonRec1 = new javax.swing.JButton();
        jButtonRec2 = new javax.swing.JButton();
        jButtonRec3 = new javax.swing.JButton();
        jButtonRec4 = new javax.swing.JButton();
        jButtonRec5 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jButtonExp2 = new javax.swing.JButton();
        jButtonExp1 = new javax.swing.JButton();
        jButtonExp3 = new javax.swing.JButton();
        jButtonExp4 = new javax.swing.JButton();
        jButtonExp5 = new javax.swing.JButton();
        jButtonHelp = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gravações de Áudio");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setText("<html> Escutar quinta<br/> gravação </html>");

        jLabel4.setText("<html> Escutar quarta<br/> gravação </html>");

        jLabel3.setText("<html> Escutar terceira<br/> gravação </html>");

        jLabel2.setText("<html> Escutar segunda<br/> gravação </html>");

        jLabel1.setText("<html> Escutar primeira <br/> gravação </html>");

        jButtonRec1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/playaudio.png"))); // NOI18N
        jButtonRec1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRec1ActionPerformed(evt);
            }
        });

        jButtonRec2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/playaudio.png"))); // NOI18N
        jButtonRec2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRec2ActionPerformed(evt);
            }
        });

        jButtonRec3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/playaudio.png"))); // NOI18N
        jButtonRec3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRec3ActionPerformed(evt);
            }
        });

        jButtonRec4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/playaudio.png"))); // NOI18N
        jButtonRec4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRec4ActionPerformed(evt);
            }
        });

        jButtonRec5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/playaudio.png"))); // NOI18N
        jButtonRec5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRec5ActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonRec1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonRec2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)))
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRec3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRec4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRec5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator4)
                    .addComponent(jSeparator2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonRec3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jButtonRec5)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonRec4)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButtonRec1)
                                    .addComponent(jButtonRec2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        jButtonExp2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/helpa.png"))); // NOI18N
        jButtonExp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExp2ActionPerformed(evt);
            }
        });

        jButtonExp1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/helpa.png"))); // NOI18N
        jButtonExp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExp1ActionPerformed(evt);
            }
        });

        jButtonExp3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/helpa.png"))); // NOI18N
        jButtonExp3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExp3ActionPerformed(evt);
            }
        });

        jButtonExp4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/helpa.png"))); // NOI18N
        jButtonExp4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExp4ActionPerformed(evt);
            }
        });

        jButtonExp5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/helpa.png"))); // NOI18N
        jButtonExp5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExp5ActionPerformed(evt);
            }
        });

        jButtonHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/help.png"))); // NOI18N

        jLabel6.setText("Ajuda");

        jLabel7.setText("Situação 1");

        jLabel8.setText("Situação 2");

        jLabel9.setText("Situação 3");

        jLabel10.setText("Situação 4");

        jLabel11.setText("Situação 5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jButtonExp1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonExp2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(jButtonExp3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(jButtonExp4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(jButtonExp5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel7)
                .addGap(102, 102, 102)
                .addComponent(jLabel8)
                .addGap(97, 97, 97)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(102, 102, 102)
                .addComponent(jLabel11)
                .addGap(63, 63, 63))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(9, 9, 9)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel7)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel10))))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonExp2)
                            .addComponent(jButtonExp1)
                            .addComponent(jButtonExp3)
                            .addComponent(jButtonExp4)
                            .addComponent(jButtonExp5))
                        .addGap(39, 39, 39)
                        .addComponent(jLabel6)
                        .addGap(14, 14, 14))
                    .addComponent(jButtonHelp))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRec1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRec1ActionPerformed
        try {
            if (!ouvindoMic) {
                AudioInputStream in = AudioSystem.getAudioInputStream(new File("C:/SheldonChat/Logs/" + getPaciente().getNomePaciente() + "/Sit1" + dateLog + ".wav"));
                clip = AudioSystem.getClip();
                clip.open(in);
                clip.start();

                new java.util.Timer().schedule(
                        new java.util.TimerTask() {
                            @Override
                            public void run() {
                                ouvindoMic = false;
                                jButtonRec1.setEnabled(true);
                            }
                        },
                        16000
                );
                ouvindoMic = true;
                jButtonRec1.setEnabled(false);
            } else {
                JOptionPane.showMessageDialog(null, "Espere outra gravação acabar!", "Gravação", 1);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonRec1ActionPerformed

    private void jButtonRec2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRec2ActionPerformed
        try {
            if (!ouvindoMic) {
                AudioInputStream in = AudioSystem.getAudioInputStream(new File("C:/SheldonChat/Logs/" + getPaciente().getNomePaciente() + "/Sit2" + dateLog + ".wav"));
                clip = AudioSystem.getClip();
                clip.open(in);
                clip.start();

                new java.util.Timer().schedule(
                        new java.util.TimerTask() {
                            @Override
                            public void run() {
                                ouvindoMic = false;
                                jButtonRec2.setEnabled(true);
                            }
                        },
                        16000
                );
                ouvindoMic = true;
                jButtonRec2.setEnabled(false);
            } else {
                JOptionPane.showMessageDialog(null, "Espere outra gravação acabar!", "Gravação", 1);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonRec2ActionPerformed

    private void jButtonRec3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRec3ActionPerformed
        try {
            if (!ouvindoMic) {
                AudioInputStream in = AudioSystem.getAudioInputStream(new File("C:/SheldonChat/Logs/" + getPaciente().getNomePaciente() + "/Sit3" + dateLog + ".wav"));
                clip = AudioSystem.getClip();
                clip.open(in);
                clip.start();

                new java.util.Timer().schedule(
                        new java.util.TimerTask() {
                            @Override
                            public void run() {
                                ouvindoMic = false;
                                jButtonRec3.setEnabled(true);
                            }
                        },
                        16000
                );
                ouvindoMic = true;
                jButtonRec3.setEnabled(false);
            } else {
                JOptionPane.showMessageDialog(null, "Espere outra gravação acabar!", "Gravação", 1);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonRec3ActionPerformed

    private void jButtonRec4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRec4ActionPerformed
        try {
            if (!ouvindoMic) {
                AudioInputStream in = AudioSystem.getAudioInputStream(new File("C:/SheldonChat/Logs/" + getPaciente().getNomePaciente() + "/Sit4" + dateLog + ".wav"));
                clip = AudioSystem.getClip();
                clip.open(in);
                clip.start();

                new java.util.Timer().schedule(
                        new java.util.TimerTask() {
                            @Override
                            public void run() {
                                ouvindoMic = false;
                                jButtonRec4.setEnabled(true);
                            }
                        },
                        16000
                );
                ouvindoMic = true;
                jButtonRec4.setEnabled(false);
            } else {
                JOptionPane.showMessageDialog(null, "Espere outra gravação acabar!", "Gravação", 1);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonRec4ActionPerformed

    private void jButtonRec5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRec5ActionPerformed
        try {
            if (!ouvindoMic) {
                AudioInputStream in = AudioSystem.getAudioInputStream(new File("C:/SheldonChat/Logs/" + getPaciente().getNomePaciente() + "/Sit5" + dateLog + ".wav"));
                clip = AudioSystem.getClip();
                clip.open(in);
                clip.start();

                new java.util.Timer().schedule(
                        new java.util.TimerTask() {
                            @Override
                            public void run() {
                                ouvindoMic = false;
                                jButtonRec5.setEnabled(true);
                            }
                        },
                        16000
                );
                ouvindoMic = true;
                jButtonRec5.setEnabled(false);
            } else {
                JOptionPane.showMessageDialog(null, "Espere outra gravação acabar!", "Gravação", 1);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonRec5ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if (ouvindoMic) {
            clip.stop();
        }
    }//GEN-LAST:event_formWindowClosing

    private void jButtonExp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExp1ActionPerformed
        JOptionPane.showMessageDialog(null, "Um amigo seu disse: Eu acho Matemática legal! E você? Gosta dessa matéria?", "Situação 1", 1);
    }//GEN-LAST:event_jButtonExp1ActionPerformed

    private void jButtonExp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExp2ActionPerformed
        JOptionPane.showMessageDialog(null, "<html>Um professor de artes mostra essa pintura durante a aula e pede para que você diga<br> em voz alta a sua opinião sobre o quadro.</html>", "Situação 2", 1);
    }//GEN-LAST:event_jButtonExp2ActionPerformed

    private void jButtonExp3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExp3ActionPerformed
        JOptionPane.showMessageDialog(null, "<html>Dois de seus amigos estão discutindo sobre matérias escolares:<br>  Um diz: \"Português é muito mais fácil que matemática! Não tem que ficar fazendo esses cálculos chatos!\"<br>  o Outro diz: \"Matemática é que mais fácil! A interpretação de problemas e<br>o uso de cálculos é muito mais simples e rápido\"<br>  Ambos pedem a sua opinião sobre a discussão.</html>", "Situação 3", 1);
    }//GEN-LAST:event_jButtonExp3ActionPerformed

    private void jButtonExp4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExp4ActionPerformed
        JOptionPane.showMessageDialog(null, "<html>Durante a aula de educação física, dois de seu grupo de amigos estão decidindo entre <br> jogar futebol ou handebol. Eles pedem a sua opinião.</html>", "Situação 4", 1);
    }//GEN-LAST:event_jButtonExp4ActionPerformed

    private void jButtonExp5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExp5ActionPerformed
        JOptionPane.showMessageDialog(null, "<html>Está um dia frio. Um de seus amigos diz:<br>  \"Eu não gosto de dias frios! Da muita preguiça geral de fazer as coisas.<br> E é mais facil de ficar doente! Não acha?\"</html>", "Situação 5", 1);
    }//GEN-LAST:event_jButtonExp5ActionPerformed

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Paciente getPaciente() {
        return this.paciente;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExp1;
    private javax.swing.JButton jButtonExp2;
    private javax.swing.JButton jButtonExp3;
    private javax.swing.JButton jButtonExp4;
    private javax.swing.JButton jButtonExp5;
    private javax.swing.JButton jButtonHelp;
    private javax.swing.JButton jButtonRec1;
    private javax.swing.JButton jButtonRec2;
    private javax.swing.JButton jButtonRec3;
    private javax.swing.JButton jButtonRec4;
    private javax.swing.JButton jButtonRec5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables
}
