/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JVA;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        Nomefield = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Sobrefield = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Matfield = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Cpffield = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Endecofield = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Telefonefield = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Emailfield = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Datfield = new javax.swing.JTextField();
        Salvarb = new javax.swing.JButton();
        Excluirb = new javax.swing.JButton();
        Listarb = new javax.swing.JButton();
        Atualizarb = new javax.swing.JButton();
        Pesquisarb = new javax.swing.JButton();
        Encerrarb = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Agenda Java"));

        jLabel1.setText("Nome:");

        jLabel2.setText("Sobrenome:");

        jLabel3.setText("Matricula:");

        jLabel4.setText("CPF:");

        jLabel5.setText("Endereço:");

        jLabel6.setText("Telefone:");

        jLabel7.setText("Email:");

        jLabel8.setText("Data de Nascimento:");

        Salvarb.setText("Salvar");
        Salvarb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarbActionPerformed(evt);
            }
        });

        Excluirb.setText("Excluir");

        Listarb.setText("Listar");
        Listarb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarbActionPerformed(evt);
            }
        });

        Atualizarb.setText("Atualizar");
        Atualizarb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtualizarbActionPerformed(evt);
            }
        });

        Pesquisarb.setText("Pesquisar");
        Pesquisarb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisarbActionPerformed(evt);
            }
        });

        Encerrarb.setText("Encerrar");
        Encerrarb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EncerrarbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Nomefield)
                            .addComponent(Matfield)
                            .addComponent(Endecofield)
                            .addComponent(Emailfield, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Sobrefield)
                            .addComponent(Cpffield)
                            .addComponent(Telefonefield)
                            .addComponent(Datfield, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Salvarb)
                        .addGap(18, 18, 18)
                        .addComponent(Excluirb)
                        .addGap(18, 18, 18)
                        .addComponent(Listarb)
                        .addGap(18, 18, 18)
                        .addComponent(Atualizarb)
                        .addGap(18, 18, 18)
                        .addComponent(Pesquisarb)
                        .addGap(18, 18, 18)
                        .addComponent(Encerrarb)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Nomefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(Sobrefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Matfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(Cpffield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Endecofield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(Telefonefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Emailfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(Datfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Salvarb)
                    .addComponent(Excluirb)
                    .addComponent(Listarb)
                    .addComponent(Atualizarb)
                    .addComponent(Pesquisarb)
                    .addComponent(Encerrarb))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ListarbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ListarbActionPerformed

    private void SalvarbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarbActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda","root","");
            Statement consulta = (Statement) con.createStatement();
            
            String nome = Nomefield.getText();
            String sobrenome = Sobrefield.getText();
            String matricula = Matfield.getText();
            String cpf = Cpffield.getText();
            String endereco = Endecofield.getText();
            String telefone = Telefonefield.getText();
            String email = Emailfield.getText();
            String datanasc = Datfield.getText();
            
            consulta.executeUpdate("insert into contatos (nome, sobrenome, matricula, cpf, endereco, telefone, email, datanasc) values ('"+nome+"','"+sobrenome+"','"+matricula+"',"
                    + "'"+cpf+"','"+endereco+"', '"+telefone+"','"+email+"','"+datanasc+"')");
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
        } catch (Exception ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
    }//GEN-LAST:event_SalvarbActionPerformed

    private void PesquisarbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisarbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PesquisarbActionPerformed

    private void AtualizarbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtualizarbActionPerformed
        try{
            Class.forName("com.mysql.jdbc.Driver");
       
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda","root","");
            
            Statement consulta = (Statement) con.createStatement();
            
            String aux;
            
            aux = JOptionPane.showInputDialog(null,"Digite o CPF:");
            int cpf = Integer.parseInt(aux);
            
            String nome = JOptionPane.showInputDialog(null,"Novo Nome:");
            String sobrenome = JOptionPane.showInputDialog(null,"Novo Sobrenome:");
            String matricula = JOptionPane.showInputDialog(null,"Novo Matricula:");
            String endereco = JOptionPane.showInputDialog(null,"Novo Endereço:");
            String telefone = JOptionPane.showInputDialog(null,"Novo Telefone:");
            String email = JOptionPane.showInputDialog(null,"Novo Email:");
            String datanasc = JOptionPane.showInputDialog(null,"Nova Data de Nascimento:");
            
            consulta.executeUpdate("update contatos set nome='"+nome+"',sobrenome='"+sobrenome+"',matricula='"+matricula+"',endereco='"+endereco+"',telefone='"+telefone+"',email='"+email+"',"
                    + "datanasc='"+datanasc+"' where cpf ="+cpf);
            
           JOptionPane.showMessageDialog(null, "Editado com Sucesso!");
        }
        catch(Exception e){
            System.out.println("Deu Ruim!"+ e.getMessage());
        }
    }//GEN-LAST:event_AtualizarbActionPerformed

    private void EncerrarbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EncerrarbActionPerformed
        System.exit(0);
    }//GEN-LAST:event_EncerrarbActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atualizarb;
    private javax.swing.JTextField Cpffield;
    private javax.swing.JTextField Datfield;
    private javax.swing.JTextField Emailfield;
    private javax.swing.JButton Encerrarb;
    private javax.swing.JTextField Endecofield;
    private javax.swing.JButton Excluirb;
    private javax.swing.JButton Listarb;
    private javax.swing.JTextField Matfield;
    private javax.swing.JTextField Nomefield;
    private javax.swing.JButton Pesquisarb;
    private javax.swing.JButton Salvarb;
    private javax.swing.JTextField Sobrefield;
    private javax.swing.JTextField Telefonefield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
