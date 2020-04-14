/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cecar.vistas;

import edu.cecar.controlador.ControladorMultiplicador;
import edu.cecar.modelo.MultiplicacionConHilos;
import edu.cecar.modelo.FiltroArchivoPlano;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Vincenzo Angelone
 */
public class VistaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VistaPrincipal
     */
    DefaultTableModel modeloTablaNumeros = new DefaultTableModel() {
        public boolean isCellEditable(int rowIndex, int mColIndex) {
            return false;
        }
    };

    DefaultTableModel modeloTablaBenchmarking = new DefaultTableModel() {
        public boolean isCellEditable(int rowIndex, int mColIndex) {
            return false;
        }
    };

    public VistaPrincipal() {
        initComponents();
        modeloTablaNumeros.addColumn("Numeros");
        modeloTablaBenchmarking.addColumn("N° Cores Utilizados");
        modeloTablaBenchmarking.addColumn("Total de Numeros");
        modeloTablaBenchmarking.addColumn("Tiempo(ms)");
        panel_contenedor.setEnabledAt(1, false);
        this.setLocationRelativeTo(null);
        int procesadores = Runtime.getRuntime().availableProcessors();
        label_ncores.setText(procesadores + "");
        txt_cores.setText(procesadores + "");
        panel_tabla.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_contenedor = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        label_titulo = new javax.swing.JLabel();
        txt_cores = new javax.swing.JTextField();
        labelNumeroCores = new javax.swing.JLabel();
        bt_cargarArchivo = new javax.swing.JButton();
        label_ntotalcores = new javax.swing.JLabel();
        label_ncores = new javax.swing.JLabel();
        panel_tabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_numeros = new javax.swing.JTable();
        label_tnumeros = new javax.swing.JLabel();
        label_numeros = new javax.swing.JLabel();
        bt_comenzar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_benchmarking = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Multiplicador de Numeros Grandes");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(446, 596));
        setPreferredSize(new java.awt.Dimension(446, 596));
        setResizable(false);
        getContentPane().setLayout(null);

        panel_contenedor.setBackground(new java.awt.Color(255, 255, 255));
        panel_contenedor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        label_titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/titulo.png"))); // NOI18N
        jPanel1.add(label_titulo);
        label_titulo.setBounds(80, 30, 340, 100);

        txt_cores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_coresActionPerformed(evt);
            }
        });
        txt_cores.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_coresKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_coresKeyTyped(evt);
            }
        });
        jPanel1.add(txt_cores);
        txt_cores.setBounds(280, 220, 40, 30);

        labelNumeroCores.setText("Numero de Cores  a Utilizar:");
        jPanel1.add(labelNumeroCores);
        labelNumeroCores.setBounds(50, 220, 180, 30);

        bt_cargarArchivo.setText("Cargar Archivo de Numeros");
        bt_cargarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cargarArchivoActionPerformed(evt);
            }
        });
        jPanel1.add(bt_cargarArchivo);
        bt_cargarArchivo.setBounds(130, 290, 180, 40);

        label_ntotalcores.setText("Numero Total de Cores de la Maquina");
        jPanel1.add(label_ntotalcores);
        label_ntotalcores.setBounds(50, 150, 220, 30);
        jPanel1.add(label_ncores);
        label_ncores.setBounds(290, 150, 40, 30);

        panel_tabla.setBackground(new java.awt.Color(255, 255, 255));
        panel_tabla.setLayout(null);

        tabla_numeros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla_numeros);

        panel_tabla.add(jScrollPane1);
        jScrollPane1.setBounds(120, 10, 180, 100);

        label_tnumeros.setText("Total de Numeros");
        panel_tabla.add(label_tnumeros);
        label_tnumeros.setBounds(310, 20, 110, 30);
        panel_tabla.add(label_numeros);
        label_numeros.setBounds(320, 50, 90, 40);

        bt_comenzar.setText("Comenzar!");
        bt_comenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_comenzarActionPerformed(evt);
            }
        });
        panel_tabla.add(bt_comenzar);
        bt_comenzar.setBounds(120, 130, 180, 40);

        jPanel1.add(panel_tabla);
        panel_tabla.setBounds(10, 340, 430, 180);

        panel_contenedor.addTab("Configuracion", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        tabla_benchmarking.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tabla_benchmarking);

        jPanel2.add(jScrollPane2);

        panel_contenedor.addTab("Benchmarking", jPanel2);

        getContentPane().add(panel_contenedor);
        panel_contenedor.setBounds(0, 0, 450, 600);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_cargarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cargarArchivoActionPerformed
        // TODO add your handling code here:
        ListaNumeros = new ArrayList<String>();
        while (modeloTablaNumeros.getRowCount() > 0) {
            for (int i = 0; i < modeloTablaNumeros.getRowCount(); ++i) {
                modeloTablaNumeros.removeRow(i);
            }
        }
        Object listanumeros[] = new Object[1];
        JFileChooser jf = new JFileChooser();
        jf.addChoosableFileFilter(new FiltroArchivoPlano());
        jf.setAcceptAllFileFilterUsed(false);
        jf.showOpenDialog(this);
        try {
            File archivo = jf.getSelectedFile();
            nombreArchivo = archivo.getName();
            FileReader lector = null;
            BufferedReader bf = null;
            lector = new FileReader(archivo);
            bf = new BufferedReader(lector);
            String contenido;
            String[] numeros;
            while ((contenido = bf.readLine()) != null) {
                numeros = contenido.split("(,\\s)|(,)|(-)|(\\s)|(\\s-\\s)|(-\\s)|(\\s-)|(\\s-\\s)");
                for (String a : numeros) {
                    new BigInteger(a);
                    ListaNumeros.add(a);
                    listanumeros[0] = a;
                    modeloTablaNumeros.addRow(listanumeros);
                }
            }
            tabla_numeros.setModel(modeloTablaNumeros);
            label_numeros.setText(ListaNumeros.size() + "");
            panel_tabla.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cargar el Archivo.");
            tabla_numeros.setModel(new DefaultTableModel());
            panel_tabla.setVisible(false);
        }
    }//GEN-LAST:event_bt_cargarArchivoActionPerformed

    private void txt_coresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_coresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_coresActionPerformed

    private void txt_coresKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_coresKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_txt_coresKeyPressed

    private void txt_coresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_coresKeyTyped
        // TODO add your handling code here:
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_coresKeyTyped

    private void bt_comenzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_comenzarActionPerformed
        try {
            panel_contenedor.setEnabledAt(1, true);
            Object datos[] = new Object[4];
            int indice;
            long tiempoInicio;
            long tiempofinal;
            File archivo_resultado = new File("resultado.txt");
            PrintWriter pw;
            switch (txt_cores.getText()) {
                case "1": {
                    tiempoInicio = System.currentTimeMillis();
                    BigInteger resultado = new BigInteger("1");
                    for (int i = 0; i < ListaNumeros.size(); i++) {
                        resultado = cm.multiplicar(resultado, new BigInteger(ListaNumeros.get(i)));
                        System.out.println(resultado);
                    }
                    tiempofinal = System.currentTimeMillis();
                    pw = new PrintWriter(archivo_resultado);
                    pw.println(resultado);
                    pw.close();
                    datos[0] = "1";
                    datos[1] = ListaNumeros.size();
                    datos[2] = (tiempofinal - tiempoInicio);
                    modeloTablaBenchmarking.addRow(datos);
                    tabla_benchmarking.setModel(modeloTablaBenchmarking);
                    JOptionPane.showMessageDialog(null, "Operación Exitosa!");
                    break;
                }
                case "2": {
                    BigInteger resultado = new BigInteger("1");
                    indice = ListaNumeros.size() / 2;
                    MultiplicacionConHilos h1 = new MultiplicacionConHilos(ListaNumeros, ListaNumeros.size(), indice);
                    tiempoInicio = System.currentTimeMillis();
                    h1.start();
                    for (int i = 0; i < indice; i++) {
                        resultado = cm.multiplicar(resultado, new BigInteger(ListaNumeros.get(i)));
                        System.out.println(resultado);
                    }
                    h1.join();
                    BigInteger resultadofinal = cm.multiplicar(resultado, h1.obtenerValor());
                    tiempofinal = System.currentTimeMillis();
                    System.out.println("RESULTADO AQUI  " + resultadofinal);
                    pw = new PrintWriter(archivo_resultado);
                    pw.println(resultadofinal);
                    pw.close();
                    datos[0] = "2";
                    datos[1] = ListaNumeros.size();
                    datos[2] = (tiempofinal - tiempoInicio);
                    modeloTablaBenchmarking.addRow(datos);
                    tabla_benchmarking.setModel(modeloTablaBenchmarking);
                    JOptionPane.showMessageDialog(null, "Operación Exitosa!");
                    break;
                }
                case "3": {
                    BigInteger resultado = new BigInteger("1");
                    indice = ListaNumeros.size() / 3;
                    MultiplicacionConHilos h1 = new MultiplicacionConHilos(ListaNumeros, ListaNumeros.size() - indice, indice);
                    MultiplicacionConHilos h2 = new MultiplicacionConHilos(ListaNumeros, ListaNumeros.size(), (ListaNumeros.size() - indice));
                    tiempoInicio = System.currentTimeMillis();
                    h1.start();
                    h2.start();
                    for (int i = 0; i < indice; i++) {
                        resultado = cm.multiplicar(resultado, new BigInteger(ListaNumeros.get(i)));
                        System.out.println(resultado);
                    }
                    h1.join();
                    h2.join();
                    BigInteger resultadofinal = cm.multiplicar(h2.obtenerValor(), cm.multiplicar(resultado, h1.obtenerValor()));
                    tiempofinal = System.currentTimeMillis();
                    System.out.println("h1: " + h1.obtenerValor());
                    System.out.println("h2: " + h2.obtenerValor());
                    System.out.println("3: " + resultado);
                    System.out.println("RESULTADO AQUI  " + resultadofinal);
                    pw = new PrintWriter(archivo_resultado);
                    pw.println(resultadofinal);
                    pw.close();
                    datos[0] = "3";
                    datos[1] = ListaNumeros.size();
                    datos[2] = (tiempofinal - tiempoInicio);
                    modeloTablaBenchmarking.addRow(datos);
                    tabla_benchmarking.setModel(modeloTablaBenchmarking);
                    JOptionPane.showMessageDialog(null, "Operación Exitosa!");
                    break;
                }
                case "4": {
                    BigInteger resultado = new BigInteger("1");
                    indice = ListaNumeros.size() / 4;
                    MultiplicacionConHilos h1 = new MultiplicacionConHilos(ListaNumeros, indice * 2, indice);
                    MultiplicacionConHilos h2 = new MultiplicacionConHilos(ListaNumeros, indice * 3, indice * 2);
                    MultiplicacionConHilos h3 = new MultiplicacionConHilos(ListaNumeros, ListaNumeros.size(), indice * 3);
                    tiempoInicio = System.currentTimeMillis();
                    h1.start();
                    h2.start();
                    h3.start();
                    for (int i = 0; i < indice; i++) {
                        resultado = cm.multiplicar(resultado, new BigInteger(ListaNumeros.get(i)));
                        System.out.println(resultado);
                    }
                    h1.join();
                    h2.join();
                    h3.join();
                    BigInteger resultadofinal = cm.multiplicar(cm.multiplicar(resultado, h1.obtenerValor()), cm.multiplicar(h2.obtenerValor(), h3.obtenerValor()));
                    tiempofinal = System.currentTimeMillis();
                    System.out.println("h1: " + h1.obtenerValor());
                    System.out.println("h2: " + h2.obtenerValor());
                    System.out.println("h3: " + h3.obtenerValor());
                    System.out.println("3: " + resultado);
                    System.out.println("RESULTADO AQUI  " + resultadofinal);
                    pw = new PrintWriter(archivo_resultado);
                    pw.println(resultadofinal);
                    pw.close();
                    datos[0] = "4";
                    datos[1] = ListaNumeros.size();
                    datos[2] = (tiempofinal - tiempoInicio);
                    modeloTablaBenchmarking.addRow(datos);
                    tabla_benchmarking.setModel(modeloTablaBenchmarking);
                    JOptionPane.showMessageDialog(null, "Operación Exitosa!");
                    break;
                }
                case "5": {
                    BigInteger resultado = new BigInteger("1");
                    indice = ListaNumeros.size() / 5;
                    MultiplicacionConHilos h1 = new MultiplicacionConHilos(ListaNumeros, indice * 2, indice);
                    MultiplicacionConHilos h2 = new MultiplicacionConHilos(ListaNumeros, indice * 3, indice * 2);
                    MultiplicacionConHilos h3 = new MultiplicacionConHilos(ListaNumeros, indice * 4, indice * 3);
                    MultiplicacionConHilos h4 = new MultiplicacionConHilos(ListaNumeros, ListaNumeros.size(), indice * 4);
                    tiempoInicio = System.currentTimeMillis();
                    h1.start();
                    h2.start();
                    h3.start();
                    h4.start();
                    for (int i = 0; i < indice; i++) {
                        resultado = cm.multiplicar(resultado, new BigInteger(ListaNumeros.get(i)));
                        System.out.println(resultado);
                    }
                    h1.join();
                    h2.join();
                    h3.join();
                    h4.join();
                    BigInteger resultadofinal = cm.multiplicar(cm.multiplicar(cm.multiplicar(resultado, h1.obtenerValor()), cm.multiplicar(h2.obtenerValor(), h3.obtenerValor())), h4.obtenerValor());
                    tiempofinal = System.currentTimeMillis();
                    System.out.println("h1: " + h1.obtenerValor());
                    System.out.println("h2: " + h2.obtenerValor());
                    System.out.println("h3: " + h3.obtenerValor());
                    System.out.println("3: " + resultado);
                    System.out.println("RESULTADO AQUI  " + resultadofinal);
                    pw = new PrintWriter(archivo_resultado);
                    pw.println(resultadofinal);
                    pw.close();
                    datos[0] = "5";
                    datos[1] = ListaNumeros.size();
                    datos[2] = (tiempofinal - tiempoInicio);
                    modeloTablaBenchmarking.addRow(datos);
                    tabla_benchmarking.setModel(modeloTablaBenchmarking);
                    JOptionPane.showMessageDialog(null, "Operación Exitosa!");
                    break;
                }
                case "0":
                    JOptionPane.showMessageDialog(null, "Opcion ingresada invalida!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion ingresada invalida!");
                    break;
            }
        } catch (Exception ex) {

        }
    }//GEN-LAST:event_bt_comenzarActionPerformed

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
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPrincipal().setVisible(true);
            }
        });
    }

    ArrayList<String> ListaNumeros = new ArrayList<String>();
    ArrayList<Long> benchmarking = new ArrayList<Long>();
    ControladorMultiplicador cm = new ControladorMultiplicador();
    String nombreArchivo;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_cargarArchivo;
    private javax.swing.JButton bt_comenzar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelNumeroCores;
    private javax.swing.JLabel label_ncores;
    private javax.swing.JLabel label_ntotalcores;
    private javax.swing.JLabel label_numeros;
    private javax.swing.JLabel label_titulo;
    private javax.swing.JLabel label_tnumeros;
    private javax.swing.JTabbedPane panel_contenedor;
    private javax.swing.JPanel panel_tabla;
    private javax.swing.JTable tabla_benchmarking;
    private javax.swing.JTable tabla_numeros;
    private javax.swing.JTextField txt_cores;
    // End of variables declaration//GEN-END:variables
}
