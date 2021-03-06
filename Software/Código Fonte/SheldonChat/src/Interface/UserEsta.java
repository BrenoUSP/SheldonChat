/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Controle.Bot;
import Controle.Estatistica;
import Controle.Paciente;
import java.awt.CardLayout;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import static java.util.Calendar.*;
import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Breno
 */
public class UserEsta extends javax.swing.JFrame {

    int diff = 0;
    private Paciente paciente;
    private Bot bot;
    private boolean row;

    /**
     * Creates new form UserEsta
     */
    public UserEsta(Paciente paciente, Bot bot) {
        URL imageUrl = this.getClass().getResource("/Imagens/frameIcon.png");
        ImageIcon img = new ImageIcon(imageUrl);
        setIconImage(img.getImage());

        this.setPaciente(paciente);
        this.setBot(bot);
        initComponents();
        setTitle("Estatísticas Diárias do " + getPaciente().getNomePaciente());
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        SCA13ProjectPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("SCA13ProjectPU").createEntityManager();
        estatisticaQuery = java.beans.Beans.isDesignTime() ? null : SCA13ProjectPUEntityManager.createQuery("SELECT e FROM Estatistica e");
        estatisticaList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(estatisticaQuery.getResultList());
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableStat = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanelNotas = new javax.swing.JPanel();
        jPanelN1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanelN2 = new javax.swing.JPanel();
        jTextFieldN2 = new javax.swing.JTextField();
        jPanelN3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButtonSalvar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButtonPlay = new javax.swing.JButton();
        jButtonHelp = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTableStat.getTableHeader().setReorderingAllowed(false);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, estatisticaList, jTableStat);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id}"));
        columnBinding.setColumnName("Id");
        columnBinding.setColumnClass(Long.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${data}"));
        columnBinding.setColumnName("Data");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nomePaciente}"));
        columnBinding.setColumnName("Nome Paciente");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nomeBot}"));
        columnBinding.setColumnName("Nome Bot");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nota1}"));
        columnBinding.setColumnName("Nota");
        columnBinding.setColumnClass(Double.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nota2}"));
        columnBinding.setColumnName("Nota");
        columnBinding.setColumnClass(Double.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nota3}"));
        columnBinding.setColumnName("Nota");
        columnBinding.setColumnClass(Double.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jTableStat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTableStatMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableStatMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableStat);
        if (jTableStat.getColumnModel().getColumnCount() > 0) {
            jTableStat.getColumnModel().getColumn(0).setResizable(false);
            jTableStat.getColumnModel().getColumn(1).setResizable(false);
            jTableStat.getColumnModel().getColumn(2).setResizable(false);
            jTableStat.getColumnModel().getColumn(3).setResizable(false);
            jTableStat.getColumnModel().getColumn(4).setResizable(false);
            jTableStat.getColumnModel().getColumn(5).setResizable(false);
            jTableStat.getColumnModel().getColumn(6).setResizable(false);
        }

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Alterar/Aplicar nota:");

        jPanelNotas.setLayout(new java.awt.CardLayout());

        jLabel2.setText("<html>Nota gerada<br>pelo sistema</html>");

        javax.swing.GroupLayout jPanelN1Layout = new javax.swing.GroupLayout(jPanelN1);
        jPanelN1.setLayout(jPanelN1Layout);
        jPanelN1Layout.setHorizontalGroup(
            jPanelN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelN1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanelN1Layout.setVerticalGroup(
            jPanelN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelN1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanelNotas.add(jPanelN1, "card1");

        javax.swing.GroupLayout jPanelN2Layout = new javax.swing.GroupLayout(jPanelN2);
        jPanelN2.setLayout(jPanelN2Layout);
        jPanelN2Layout.setHorizontalGroup(
            jPanelN2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelN2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jTextFieldN2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanelN2Layout.setVerticalGroup(
            jPanelN2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelN2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jTextFieldN2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelNotas.add(jPanelN2, "card2");

        jLabel3.setText("<html>Nota gerada<br>pelo sistema</html>");

        javax.swing.GroupLayout jPanelN3Layout = new javax.swing.GroupLayout(jPanelN3);
        jPanelN3.setLayout(jPanelN3Layout);
        jPanelN3Layout.setHorizontalGroup(
            jPanelN3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelN3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanelN3Layout.setVerticalGroup(
            jPanelN3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelN3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanelNotas.add(jPanelN3, "card3");

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonSalvar)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jButtonSalvar)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setText("Escutar gravações do dia selecionado");
        jLabel4.setEnabled(false);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jButtonPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/play.png"))); // NOI18N
        jButtonPlay.setEnabled(false);
        jButtonPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPlayActionPerformed(evt);
            }
        });

        jButtonHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/help.png"))); // NOI18N

        jLabel5.setText("Ajuda");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 762, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(jButtonHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonHelp))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonPlay)))
                        .addGap(0, 7, Short.MAX_VALUE)))
                .addContainerGap())
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(jTableStat.getModel());
        jTableStat.setRowSorter(sorter);

        RowFilter<TableModel, Object> rf = null;

        try {
            rf = RowFilter.regexFilter(getPaciente().getNomePaciente(), 2);
        } catch (java.util.regex.PatternSyntaxException e) {
            return;
        }
        sorter.setRowFilter(rf);

        if (this.jTableStat.getRowCount() > 0) {
            jTableStat.setRowSelectionInterval(0, 0);
            if (this.jTableStat.getModel().getValueAt(jTableStat.convertRowIndexToModel(jTableStat.getSelectedRow()), 4) != null || this.jTableStat.getModel().getValueAt(jTableStat.convertRowIndexToModel(jTableStat.getSelectedRow()), 5) != null || this.jTableStat.getModel().getValueAt(jTableStat.convertRowIndexToModel(jTableStat.getSelectedRow()), 6) != null) {
                Calendar a = Calendar.getInstance(Locale.FRENCH);
                a.setTime(getPaciente().getIdadePaciente());
                Calendar b = Calendar.getInstance(Locale.FRENCH);
                b.setTime(Calendar.getInstance().getTime());

                diff = b.get(YEAR) - a.get(YEAR);
                if (a.get(MONTH) > b.get(MONTH) || (a.get(MONTH) == b.get(MONTH) && a.get(DATE) > b.get(DATE))) {
                    diff--;
                }

                if (diff >= 6 && diff <= 9) {
                    jTableStat.getColumnModel().getColumn(4).setMinWidth(0);
                    jTableStat.getColumnModel().getColumn(4).setMaxWidth(0);
                    jTableStat.getColumnModel().getColumn(5).setMinWidth(0);
                    jTableStat.getColumnModel().getColumn(5).setMaxWidth(0);
                    CardLayout card = (CardLayout) jPanelNotas.getLayout();
                    card.show(this.jPanelNotas, "card1");
                    this.jButtonSalvar.setEnabled(false);
                }

                if (diff >= 10 && diff <= 14) {
                    jTableStat.getColumnModel().getColumn(5).setMinWidth(0);
                    jTableStat.getColumnModel().getColumn(5).setMaxWidth(0);
                    jTableStat.getColumnModel().getColumn(6).setMinWidth(0);
                    jTableStat.getColumnModel().getColumn(6).setMaxWidth(0);
                    CardLayout card = (CardLayout) jPanelNotas.getLayout();
                    card.show(this.jPanelNotas, "card1");
                    this.jButtonSalvar.setEnabled(false);
                }

                if (diff >= 15 && diff <= 20) {
                    this.jButtonPlay.setEnabled(true);
                    this.jLabel4.setEnabled(true);
                    jTableStat.getColumnModel().getColumn(4).setMinWidth(0);
                    jTableStat.getColumnModel().getColumn(4).setMaxWidth(0);
                    jTableStat.getColumnModel().getColumn(6).setMinWidth(0);
                    jTableStat.getColumnModel().getColumn(6).setMaxWidth(0);
                    CardLayout card = (CardLayout) jPanelNotas.getLayout();
                    card.show(this.jPanelNotas, "card2");
                    this.jButtonSalvar.setEnabled(true);
                    Estatistica estatistica = new Estatistica();
                    estatistica.encontradoId(Long.valueOf(this.jTableStat.getModel().getValueAt(jTableStat.convertRowIndexToModel(jTableStat.getSelectedRow()), 0).toString()));
                    this.jTextFieldN2.setText(estatistica.getNota2().toString());
                    jTableStat.getModel().setValueAt(estatistica.getNota2(), jTableStat.convertRowIndexToModel(jTableStat.getSelectedRow()), 5);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Ainda não existem notas para esse Paciente!", "Estatística", 1);
                dispose();
            }
        }


    }//GEN-LAST:event_formWindowOpened

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        Estatistica estatistica = new Estatistica();
        estatistica.encontradoId(Long.valueOf(this.jTableStat.getModel().getValueAt(jTableStat.convertRowIndexToModel(jTableStat.getSelectedRow()), 0).toString()));
        String str = this.jTextFieldN2.getText().replace(",", ".");
        estatistica.setNota2(Double.parseDouble(str));
        this.jTableStat.setValueAt(Double.parseDouble(str), jTableStat.getSelectedRow(), 5);
        estatistica.atualizado();
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPlayActionPerformed
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            AudioSit audioSit = new AudioSit(formatter.format(this.jTableStat.getModel().getValueAt(jTableStat.convertRowIndexToModel(jTableStat.getSelectedRow()), 1)), getPaciente());
            audioSit.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_jButtonPlayActionPerformed

    private void jTableStatMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableStatMousePressed
        this.jTextFieldN2.setText(jTableStat.getModel().getValueAt(jTableStat.convertRowIndexToModel(jTableStat.getSelectedRow()), 5).toString());
    }//GEN-LAST:event_jTableStatMousePressed

    private void jTableStatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableStatMouseClicked
        this.jTextFieldN2.setText(jTableStat.getModel().getValueAt(jTableStat.convertRowIndexToModel(jTableStat.getSelectedRow()), 5).toString());
    }//GEN-LAST:event_jTableStatMouseClicked

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Paciente getPaciente() {
        return this.paciente;
    }

    public void setBot(Bot bot) {
        this.bot = bot;
    }

    public Bot getBot() {
        return this.bot;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager SCA13ProjectPUEntityManager;
    private java.util.List<Controle.Estatistica> estatisticaList;
    private javax.persistence.Query estatisticaQuery;
    private javax.swing.JButton jButtonHelp;
    private javax.swing.JButton jButtonPlay;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelN1;
    private javax.swing.JPanel jPanelN2;
    private javax.swing.JPanel jPanelN3;
    private javax.swing.JPanel jPanelNotas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableStat;
    private javax.swing.JTextField jTextFieldN2;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
