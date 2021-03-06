/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Estructuras.PriorityQueue;
import Estructuras.DoublyLinkedList;
import Estructuras.DoublyLinkedNode;
import Estructuras.QueueNode;
import GestionarUsuario.Tiquete;
import java.security.Provider;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
    * @author Dylan 
 */
public class AtenderPedidos extends javax.swing.JDialog {

    /**
     * Creates new form AtenderPedidos
     */
    GregorianCalendar fechaDelSistema;
    PriorityQueue<Tiquete> listaDeTiquetes;
    PriorityQueue<Tiquete> listaDeTiquetesEnviados;
    public AtenderPedidos(java.awt.Frame parent, boolean modal, PriorityQueue<Tiquete> listaDeTiquetes,PriorityQueue<Tiquete> listaDeTiquetesEnviados, GregorianCalendar fechaDelSistema) {
        super(parent, modal);
        initComponents();
        this.listaDeTiquetes=listaDeTiquetes;
        this.fechaDelSistema=fechaDelSistema;
        this.listaDeTiquetesEnviados=listaDeTiquetesEnviados;
        labelFecha.setText(fechaDelSistema.getDisplayName(7, 2, Locale.ENGLISH)+", "+fechaDelSistema.get(5)+"-"+fechaDelSistema.getDisplayName(2, 2, Locale.ENGLISH)+"-"+fechaDelSistema.get(1));
        actualizarTabla();
    }
    
    public void actualizarTabla(){
        DefaultTableModel model=(DefaultTableModel) tablaTiquetes.getModel();
        
        int a =model.getRowCount()-1;
        for(int i=a; i>=0;i--){
            model.removeRow(i);
        }
        //agregar a la tabla los datos de tiquetes pendientes de enviar 
        QueueNode<Tiquete> tempNode=listaDeTiquetes.getHead().getNextNode();
        while(tempNode!=null){
            
            //string para darle formato a la fecha
            String fechaSorteo=tempNode.getElement().getSorteo().getFechaSorteo().getDisplayName(7, 2, Locale.ENGLISH)+", "+
                    tempNode.getElement().getSorteo().getFechaSorteo().get(5)+"-"+
                    tempNode.getElement().getSorteo().getFechaSorteo().getDisplayName(2, 2, Locale.ENGLISH)+"-"+
                    tempNode.getElement().getSorteo().getFechaSorteo().get(1);
            String fechaNac=tempNode.getElement().getUsuario().getFechaNacimiento().getDisplayName(7, 2, Locale.ENGLISH)+", "+
                    tempNode.getElement().getUsuario().getFechaNacimiento().get(5)+"-"+
                    tempNode.getElement().getUsuario().getFechaNacimiento().getDisplayName(2, 2, Locale.ENGLISH)+"-"+
                    tempNode.getElement().getUsuario().getFechaNacimiento().get(1);
            model.addRow(new Object[]{tempNode.getElement().getNombreEmisor(),  
                tempNode.getElement().getUsuario().getNombre()+" - "+tempNode.getElement().getUsuario().getCedula()+" - "+fechaNac, 
                tempNode.getElement().getSorteo().getTipoSorteo(),fechaSorteo, tempNode.getElement().getSorteo().getPrecio(), tempNode.getElement().getNumeroSorteo().toString()});
            tempNode=tempNode.getNextNode();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaTiquetes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        botonEnviar = new javax.swing.JButton();
        labelFecha = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tablaTiquetes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre emisor", "Usuario", "Tipo de sorteo", "Fecha", "Precio", "Numeros"
            }
        ));
        jScrollPane1.setViewportView(tablaTiquetes);

        botonEnviar.setText("Enviar pedido");
        botonEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEnviarActionPerformed(evt);
            }
        });

        labelFecha.setText("jLabel2");

        jLabel2.setText("Tiquetes pendientes de enviar a los usuarios.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1011, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(451, 451, 451)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botonEnviar)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelFecha)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFecha)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addComponent(botonEnviar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEnviarActionPerformed
//Codigo para enviar correo a clientes, no funciona
//        try {
//            // TODO add your handling code here:
//            Properties props = new Properties();
//            props.setProperty("mail.smtp.host", "smtp.gmail.com");
//            props.setProperty("mail.smtp.starttls.enable", "true");
//            props.setProperty("mail.smtp.port", "587");
//            props.setProperty("mail.smtp.auth", "true");
//            
//            Session session= Session.getDefaultInstance(props);
//            
//            String correoRemitente="dylanmentec@gmail.com";
//            String passwordRemitente="demb25tec";
//            String correoReceptor="dylan97cr@gmail.com";
//            String asusnto="prueba";
//            String mensaje="este es un correo de prueba";
//            
//            
//            MimeMessage message=new MimeMessage(session);
//            message.setFrom (new InternetAddress(correoRemitente));
//            
//            
//            message.addRecipient(Message.RecipientType.TO, new InternetAddress(correoReceptor));
//            message.setSubject(asusnto);
//            
//            message.setText(mensaje);
//            
//            Transport t=session.getTransport("smtp");
//            t.connect(correoRemitente, passwordRemitente);
//            t.sendMessage(message, message.getRecipients(Message.RecipientType.TO));
//            t.close();
//            
//        } catch (AddressException ex) {
//            Logger.getLogger(AtenderPedidozs.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (MessagingException ex) {
//            Logger.getLogger(AtenderPedidos.class.getName()).log(Level.SEVERE, null, ex);
//        }
        if(listaDeTiquetes.getSize()==0){
            JOptionPane.showMessageDialog(null, "Error, no hay tiquetes pendientes.");
        }else{
            JOptionPane.showMessageDialog(this, "Tiquete enviado a cliente:\n"+listaDeTiquetes.getHead().getNextNode().toString());
            Tiquete t=listaDeTiquetes.getHead().getNextNode().getElement();
            listaDeTiquetesEnviados.insertPriorityDateTiquete(t);
            listaDeTiquetes.delete();
            actualizarTabla();
        }
        
                
        
        
    }//GEN-LAST:event_botonEnviarActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(AtenderPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(AtenderPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(AtenderPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(AtenderPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                AtenderPedidos dialog = new AtenderPedidos(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEnviar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JTable tablaTiquetes;
    // End of variables declaration//GEN-END:variables
}
