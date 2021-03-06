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
import GUI.SeleccionarNumeros.EscogerBingo;
import GUI.SeleccionarNumeros.EscogerLoteria;
import GUI.SeleccionarNumeros.EscogerLotto;
import GUI.SeleccionarNumeros.EscogerTiempos;
import GestionarUsuario.SorteosFuturos;
import GestionarUsuario.Tiquete;
import GestionarUsuario.Usuario;
import java.util.GregorianCalendar;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.joda.time.DateTimeComparator;

/**
 *
 * @author Dylan
 */
public class ComprarTiquete extends javax.swing.JDialog {

    /**
     * Creates new form ComprarTiquete
     */
    DoublyLinkedList<Usuario> listaDeUsuarios;
    DoublyLinkedList<Integer> numerosEscogidos;
    PriorityQueue<Tiquete> listaDeTiquetes;
    PriorityQueue<SorteosFuturos> listaSorteosPendientes;
    GregorianCalendar fechaDelSistema;
    boolean button=true;
    public ComprarTiquete(java.awt.Frame parent, boolean modal, DoublyLinkedList<Usuario> listaDeUsuarios, PriorityQueue<Tiquete> listaDeTiquetes, PriorityQueue<SorteosFuturos> listaSorteosPendientes, GregorianCalendar fechaDelSistema) {
        super(parent, modal);
        this.listaDeUsuarios=listaDeUsuarios;
        initComponents();
        this.numerosEscogidos=new DoublyLinkedList<>();
        this.listaDeUsuarios=listaDeUsuarios;
        this.listaDeTiquetes=listaDeTiquetes;
        this.listaSorteosPendientes=listaSorteosPendientes;
        this.fechaDelSistema=fechaDelSistema;
        actualizarDatosSorteosDisp();
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSYearDate1 = new rojeru_san.componentes.RSYearDate();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jDialog3 = new javax.swing.JDialog();
        jFrame1 = new javax.swing.JFrame();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaSorteos1 = new javax.swing.JTable();
        botonComprarTiquete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textEmisor = new javax.swing.JTextPane();
        botonEscogerNumero = new javax.swing.JButton();
        comboCliente = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaSorteosDisponibles = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaSorteosElegidos = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        botonAgregar = new javax.swing.JButton();
        textNums = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog3Layout = new javax.swing.GroupLayout(jDialog3.getContentPane());
        jDialog3.getContentPane().setLayout(jDialog3Layout);
        jDialog3Layout.setHorizontalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog3Layout.setVerticalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jMenuItem1.setText("jMenuItem1");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList1);

        tablaSorteos1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sorteo", "Fecha", "Precio", "ID"
            }
        ));
        jScrollPane4.setViewportView(tablaSorteos1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        botonComprarTiquete.setText("Comprar tiquetes");
        botonComprarTiquete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonComprarTiqueteActionPerformed(evt);
            }
        });

        jLabel1.setText("Comprar tiquetes ");

        jLabel2.setText("Nombre del emisor");

        jLabel3.setText("Cedula del cliente");

        jScrollPane2.setViewportView(textEmisor);

        botonEscogerNumero.setText("Escojer numeros");
        botonEscogerNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEscogerNumeroActionPerformed(evt);
            }
        });

        comboCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setText("Sorteos disponibles");

        tablaSorteosDisponibles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sorteo", "Fecha", "Precio", "ID"
            }
        ));
        jScrollPane1.setViewportView(tablaSorteosDisponibles);

        tablaSorteosElegidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sorteo", "Fecha", "Precio", "Numero/s", "ID"
            }
        ));
        jScrollPane5.setViewportView(tablaSorteosElegidos);

        jLabel4.setText("Sorteos a comprar por el cliente:");

        botonAgregar.setText("Agregar");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });

        textNums.setText("<No ha seleccionado numeros>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                            .addComponent(comboCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonComprarTiquete, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botonEscogerNumero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonAgregar)
                            .addComponent(textNums, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonEscogerNumero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textNums)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonAgregar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonComprarTiquete, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    //metodo para actualizar los datos mostrados en la tabla y en el combo box
    public void actualizarDatosSorteosDisp(){
        DefaultTableModel model=(DefaultTableModel) tablaSorteosDisponibles.getModel();
        
        //Borra datos tabla
        int a =model.getRowCount()-1;
        for(int i=a; i>=0;i--){
            model.removeRow(i);
        }
        //borra datos combo box
        comboCliente.removeAllItems();
        
        //actualizar datos de la tabla con sorteos pendientes
        QueueNode<SorteosFuturos> tempNode=listaSorteosPendientes.getHead().getNextNode();
        while(tempNode!=null){
            String fechaSorteo=tempNode.getElement().getFechaSorteo().getDisplayName(7, 2, Locale.ENGLISH)+", "+tempNode.getElement().getFechaSorteo().get(5)+"-"+tempNode.getElement().getFechaSorteo().getDisplayName(2, 2, Locale.ENGLISH)+"-"+tempNode.getElement().getFechaSorteo().get(1);
            model.addRow(new Object[]{tempNode.getElement().getTipoSorteo(),fechaSorteo, tempNode.getElement().getPrecio(), tempNode.getElement().getConsecutivo() });
            tempNode=tempNode.getNextNode();
        }
        //actulializar combo box con los usuarios creados
        DoublyLinkedNode<Usuario> tempNode2=listaDeUsuarios.getHead();
        while(tempNode2!=null){
            comboCliente.addItem(String.valueOf(tempNode2.getElement().getCedula()));
            tempNode2=tempNode2.getNext();
        }
    }
    
    public void actualizarTablaSorteosElegidos(String sorteo, GregorianCalendar fecha, int precio, DoublyLinkedList<Integer> numeros, int id){
        DefaultTableModel model=(DefaultTableModel) tablaSorteosElegidos.getModel();
        DefaultTableModel model2= (DefaultTableModel) tablaSorteosDisponibles.getModel();
        //Borra datos tabla
//        int a =model.getRowCount()-1;
//        for(int i=a; i>=0;i--){
//            model.removeRow(i);
//        }
        
        model.addRow(new Object[]{sorteo,fecha.getTime(),precio,numeros.toString(),id});
        
        
        
    }
    
    private void botonComprarTiqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonComprarTiqueteActionPerformed
        // TODO add your handling code here:
        this.button=true;
        dispose();

    }//GEN-LAST:event_botonComprarTiqueteActionPerformed

    private void botonEscogerNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEscogerNumeroActionPerformed
        // TODO add your handling code here:
        numerosEscogidos=new DoublyLinkedList<>();
        DefaultTableModel model=(DefaultTableModel) tablaSorteosDisponibles.getModel();
        if(tablaSorteosDisponibles.getSelectedRow()>=0){
            if(model.getValueAt(tablaSorteosDisponibles.getSelectedRow(),0)=="Loteria"){
                new EscogerLoteria(jFrame1, rootPaneCheckingEnabled, numerosEscogidos, textNums).setVisible(true);
            }if(model.getValueAt(tablaSorteosDisponibles.getSelectedRow(),0)=="Lotto"){
                new EscogerLotto(jFrame1, rootPaneCheckingEnabled,numerosEscogidos, textNums).setVisible(true);
            }if(model.getValueAt(tablaSorteosDisponibles.getSelectedRow(),0)=="Bingo"){
                new EscogerBingo(jFrame1, rootPaneCheckingEnabled,numerosEscogidos,textNums).setVisible(true);
            }if(model.getValueAt(tablaSorteosDisponibles.getSelectedRow(),0)=="Tiempos"){
                new EscogerTiempos(jFrame1, rootPaneCheckingEnabled,numerosEscogidos,textNums).setVisible(true);
            }            
        }else{
            JOptionPane.showMessageDialog(this, "Error, debe seleccionar un sorteo para escoger los numeros.");
       }

    }//GEN-LAST:event_botonEscogerNumeroActionPerformed

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        // TODO add your handling code here:
        if(textEmisor.getText().length()!=0 && comboCliente.getSelectedItem()!=null && numerosEscogidos.getSize()!=0){
            button=false;
            comboCliente.setEnabled(button);
            //buscar usuario con la cedula
            int cedula=Integer.parseInt((String) comboCliente.getSelectedItem());
            DoublyLinkedNode<Usuario> tempNodeUsuario=listaDeUsuarios.getHead();
            while(tempNodeUsuario!=null){
                if (tempNodeUsuario.getElement().getCedula()==cedula){
                    break;
                }
                tempNodeUsuario=tempNodeUsuario.getNext();
            }
            
            //buscar el sorteo futuro para agregarlo al tiquete
            DefaultTableModel model=(DefaultTableModel) tablaSorteosDisponibles.getModel();
            int id=(int) model.getValueAt(tablaSorteosDisponibles.getSelectedRow(), 3);
            QueueNode<SorteosFuturos> tempNodeSorteos=listaSorteosPendientes.getHead().getNextNode();
            while(tempNodeSorteos!=null){
                if(id==tempNodeSorteos.getElement().getConsecutivo()){
                    break;
                }
                tempNodeSorteos=tempNodeSorteos.getNextNode();
            }
            if((DateTimeComparator.getDateOnlyInstance().compare(fechaDelSistema.getTime(), tempNodeSorteos.getElement().getFechaSorteo().getTime()))<=0){
                //se crean tiquetes
                Tiquete nuevoTiquete=new Tiquete(textEmisor.getText(), tempNodeUsuario.getElement(), tempNodeSorteos.getElement(),numerosEscogidos );
                //se agregan los tiquetes al usuario que corresponde
                tempNodeUsuario.getElement().getPedidosTiquetes().insertPriorityDateTiquete(nuevoTiquete);
                //se insertan tiquetes a la cola teniendo en cuenta la prioridad por edad >65
                listaDeTiquetes.insertPriorityAge(nuevoTiquete);
                //se actualiza la tabla
                actualizarTablaSorteosElegidos(tempNodeSorteos.getElement().getTipoSorteo(), tempNodeSorteos.getElement().getFechaSorteo(), tempNodeSorteos.getElement().getPrecio(), numerosEscogidos, tempNodeSorteos.getElement().getConsecutivo());                
            }else{
                JOptionPane.showMessageDialog(this, "Error, el sorteo ya pasó.");
            }

        }else{
            JOptionPane.showMessageDialog(this, "Error, faltan datos.");
        }
    }//GEN-LAST:event_botonAgregarActionPerformed

//    /**
//     * @param args the command line arguments
//     */
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
//            java.util.logging.Logger.getLogger(ComprarTiquete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ComprarTiquete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ComprarTiquete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ComprarTiquete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                ComprarTiquete dialog = new ComprarTiquete(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonComprarTiquete;
    private javax.swing.JButton botonEscogerNumero;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> comboCliente;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<String> jList1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private rojeru_san.componentes.RSYearDate rSYearDate1;
    private javax.swing.JTable tablaSorteos1;
    private javax.swing.JTable tablaSorteosDisponibles;
    private javax.swing.JTable tablaSorteosElegidos;
    private javax.swing.JTextPane textEmisor;
    private javax.swing.JLabel textNums;
    // End of variables declaration//GEN-END:variables
}
