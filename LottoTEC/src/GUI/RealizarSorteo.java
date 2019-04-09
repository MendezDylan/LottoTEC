/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Estructuras.DoublyLinkedList;
import Estructuras.DoublyLinkedNode;
import Estructuras.PriorityQueue;
import Estructuras.QueueNode;
import GestionarUsuario.SorteosFuturos;
import GestionarUsuario.Tiquete;
import GestionarUsuario.Usuario;
import Sorteos.AbstractSorteo;
import Sorteos.Bingo;
import Sorteos.Loteria;
import Sorteos.Lotto;
import Sorteos.Tiempos;
import java.util.GregorianCalendar;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.joda.time.DateTimeComparator;

/**
 *
 * @author Dylan
 */
public class RealizarSorteo extends javax.swing.JDialog {

    /**
     * Creates new form RealizarSorteo
     */
    PriorityQueue<Tiquete> listaDeTiquetesEnviados;
    DoublyLinkedList<AbstractSorteo> listaDeSorteosRealizados;
    PriorityQueue<SorteosFuturos> listaDeSorteosPendientes;  
    GregorianCalendar fechaSistema;
    public RealizarSorteo(java.awt.Frame parent, boolean modal, PriorityQueue<Tiquete> listaDeTiquetesEnviados,    PriorityQueue<SorteosFuturos> listaDeSorteosPendientes, GregorianCalendar fechaSistema) {
        super(parent, modal);
        initComponents();
        this.listaDeTiquetesEnviados=listaDeTiquetesEnviados;
        this.listaDeSorteosRealizados=new DoublyLinkedList<>();
        this.listaDeSorteosPendientes=listaDeSorteosPendientes;
        this.fechaSistema=fechaSistema;
        actualizarTablaSorteosPendientes();
        actualizarTablaSorteosRealizados();
    }
    
    public void actualizarTablaSorteosPendientes(){
        DefaultTableModel model=(DefaultTableModel) tablaSorteosDisponibles.getModel();
        
        //Borra datos tabla
        int a =model.getRowCount()-1;
        for(int i=a; i>=0;i--){
            model.removeRow(i);
        }
        
        //se crea nodo de la lista de tiquetes para recorrer la lista
        QueueNode<SorteosFuturos> tempNode=listaDeSorteosPendientes.getHead().getNextNode();
        while(tempNode!=null){
            //string con el formato de la fechaS
            String fechaSorteo=tempNode.getElement().getFechaSorteo().getDisplayName(7, 2, Locale.ENGLISH)+", "
                    +tempNode.getElement().getFechaSorteo().get(5)+"-"+
                    tempNode.getElement().getFechaSorteo().getDisplayName(2, 2, Locale.ENGLISH)+
                    tempNode.getElement().getFechaSorteo().get(1);
            model.addRow(new Object[]{tempNode.getElement().getTipoSorteo(),fechaSorteo, tempNode.getElement().getPrecio(), tempNode.getElement().getConsecutivo()});
            tempNode=tempNode.getNextNode();
        }
    }
    
    public void actualizarTablaSorteosRealizados(){
        DoublyLinkedNode<AbstractSorteo> sorteo=listaDeSorteosRealizados.getHead();
        DefaultTableModel model=(DefaultTableModel) tablaSorteosRealizados.getModel();
        int a =model.getRowCount()-1;
        for(int i=a; i>=0;i--){
            model.removeRow(i);
        }
        
        while(sorteo!=null){
            String fechaSorteo=sorteo.getElement().getFechaSorteo().getDisplayName(7, 2, Locale.ENGLISH)+", "
                    +sorteo.getElement().getFechaSorteo().get(5)+"-"+
                    sorteo.getElement().getFechaSorteo().getDisplayName(2, 2, Locale.ENGLISH)+
                    sorteo.getElement().getFechaSorteo().get(1);
            model.addRow(new Object[]{sorteo.getElement().getNombreSorteo(),fechaSorteo, sorteo.getElement().getNumeroGanador(), sorteo.getElement().getCodigoSorteo()});
            sorteo=sorteo.getNext();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textFecha = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaSorteosDisponibles = new javax.swing.JTable();
        botonSorteo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaSorteosRealizados = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        textFecha.setText("fecha del sistema");

        tablaSorteosDisponibles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sorteo", "Fecha", "Precio", "ID"
            }
        ));
        jScrollPane1.setViewportView(tablaSorteosDisponibles);

        botonSorteo.setText("Realizar sorteo");
        botonSorteo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSorteoActionPerformed(evt);
            }
        });

        tablaSorteosRealizados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sorteo", "Fecha", "Numeros ganadores", "ID"
            }
        ));
        jScrollPane2.setViewportView(tablaSorteosRealizados);

        jLabel1.setText("Lista de sorteos por realizar");

        jLabel2.setText("Lista de sorteos realizados");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 272, Short.MAX_VALUE)
                        .addComponent(textFecha)
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonSorteo)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonSorteo))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(textFecha))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSorteoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSorteoActionPerformed
        // TODO add your handling code here:
        
        //codigo para realizar el sorteo del dia.
        if(listaDeSorteosPendientes.getSize()!=0){
            QueueNode<SorteosFuturos> tempNodeSorteo=listaDeSorteosPendientes.getHead().getNextNode();
            int id=tempNodeSorteo.getElement().getConsecutivo();
            if(DateTimeComparator.getDateOnlyInstance().compare(tempNodeSorteo.getElement().getFechaSorteo(), fechaSistema)==0){
                while(tempNodeSorteo.getElement().getConsecutivo()!=id){
                    tempNodeSorteo=tempNodeSorteo.getNextNode();
                }
                AbstractSorteo sorteo = null;
                String tipoSorteo=tempNodeSorteo.getElement().getTipoSorteo();
                GregorianCalendar fechaSorteo=tempNodeSorteo.getElement().getFechaSorteo();
                if(null != tipoSorteo)switch (tipoSorteo) {
                    case "Loteria":
                        sorteo=new Loteria(tipoSorteo, id, fechaSorteo);
                        break;
                    case "Bingo":
                        sorteo=new Bingo(tipoSorteo, id, fechaSorteo);
                        break;
                    case "Lotto":
                        sorteo=new Lotto(tipoSorteo, id, fechaSorteo);
                        break;
                    case "Tiempos":
                        sorteo=new Tiempos(tipoSorteo, id, fechaSorteo);
                        break;
                    default:
                        break;
                }
                JOptionPane.showMessageDialog(this, "Sorteo realizado, comprobar en la tabla inferior.");
                listaDeSorteosPendientes.delete();
                listaDeSorteosRealizados.insert(sorteo); 
                String numerosGanadores=sorteo.getNumeroGanador().toString();
                actualizarTablaSorteosPendientes();
                actualizarTablaSorteosRealizados();   
                
                //codigo para mostrar los ganadores de los sorteos realizados
                QueueNode<Tiquete> tempNodeTiquete=listaDeTiquetesEnviados.getHead().getNextNode();
                DoublyLinkedList<Tiquete> listaDeGanadores=new DoublyLinkedList<>();
                //buscar los tiquetes del sorteo que se acaba de realizar
                while(tempNodeTiquete!=null){
                    if(tempNodeTiquete.getElement().getSorteo().getConsecutivo()==id){
                        listaDeGanadores.insert(tempNodeTiquete.getElement());
                        listaDeTiquetesEnviados.delete();
                    }
                    tempNodeTiquete=tempNodeTiquete.getNextNode();
                }
                boolean x=true;
                DoublyLinkedNode<Tiquete> nodoTemp=listaDeGanadores.getHead();
                while(nodoTemp!=null){
                    if(nodoTemp.getElement().getNumeroSorteo().toString() == null ? numerosGanadores == null : nodoTemp.getElement().getNumeroSorteo().toString().equals(numerosGanadores)){
                        JOptionPane.showMessageDialog(this, "Usuario ganador: "+nodoTemp.getElement().getUsuario().toString());
                        x=false;
                    }
                    nodoTemp=nodoTemp.getNext();
                }
                if(x==true){
                    JOptionPane.showMessageDialog(this, "No hay ganadores para este sorteo.");
                }
            }else{
                JOptionPane.showMessageDialog(this, "Solo puede realizar el sorteo el dia al que corresponde.");
            }
        }else{
            JOptionPane.showMessageDialog(this, "No hay sorteos para realizar.");
        }
        

        
        
    }//GEN-LAST:event_botonSorteoActionPerformed

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
//            java.util.logging.Logger.getLogger(RealizarSorteo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(RealizarSorteo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(RealizarSorteo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(RealizarSorteo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                RealizarSorteo dialog = new RealizarSorteo(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton botonSorteo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaSorteosDisponibles;
    private javax.swing.JTable tablaSorteosRealizados;
    private javax.swing.JLabel textFecha;
    // End of variables declaration//GEN-END:variables
}
