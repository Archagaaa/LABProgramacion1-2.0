package Semana6;

import java.util.Random;
import javax.swing.JOptionPane;

public class Archaga_Aaron_IDClase extends javax.swing.JFrame {

    Random random = new Random();
    String[] palabrasinicio = {"HONDURAS", "PERRO", "GATO", "COMPUTADORA", "SISTEMAS", "MOUSE", "TECLADO", 
                                "PATO", "PANTALLA", "TERMO"};

    public Archaga_Aaron_IDClase() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JLabel();
        btnJugar = new javax.swing.JButton();
        btnCambiar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Titulo.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        Titulo.setText("Ahorcados");

        btnJugar.setBackground(new java.awt.Color(0, 153, 0));
        btnJugar.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnJugar.setForeground(new java.awt.Color(255, 255, 255));
        btnJugar.setText("Jugar");
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });

        btnCambiar.setBackground(new java.awt.Color(153, 153, 255));
        btnCambiar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnCambiar.setForeground(new java.awt.Color(255, 255, 255));
        btnCambiar.setText("Cambiar Palabras");
        btnCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(255, 0, 0));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Titulo)
                    .addComponent(btnJugar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 114, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(Titulo)
                .addGap(37, 37, 37)
                .addComponent(btnJugar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCambiar, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
        String palabraseleccionada = palabrasinicio[random.nextInt(palabrasinicio.length)];
        int oportunidades = 5;
        String[] palabraoculta = new String[palabraseleccionada.length()];
        //Crear la palabra oculta
        for (int i = 0; i < palabraoculta.length; i++) {
            palabraoculta[i] = "_";
        }

        boolean juegoactivo = true;
        while (juegoactivo && oportunidades > 0) {

            String progreso = "";
            for (String letra : palabraoculta) {
                progreso += letra + " ";
            }

            String mensaje = "Palabra: " + progreso + "\nOportunidades restantes: " + oportunidades + "\nIngresa una letra:";

            // Solicitar la letra al jugador
            String entrada = JOptionPane.showInputDialog(mensaje);

            if (entrada == null || entrada.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor ingresa una letra:");

            }

            char letra = entrada.toUpperCase().charAt(0);
            boolean letraCorrecta = false;


            for (int i = 0; i < palabraseleccionada.length(); i++) {
                if (palabraseleccionada.charAt(i) == letra) {
                    palabraoculta[i] = String.valueOf(letra);
                    letraCorrecta = true;
                }
            }


            if (letraCorrecta) {
                String palabraAdivinada = "";
                for (String letraOculta : palabraoculta) {
                    palabraAdivinada += letraOculta;
                }

                if (palabraAdivinada.equals(palabraseleccionada)) {
                    JOptionPane.showMessageDialog(null, "Adivinaste la palabra: " + palabraseleccionada);
                    juegoactivo = false; //Terminar el juego
                } else {
                    JOptionPane.showMessageDialog(null, "Encontrastre un caracter");
                }
            } else {
                //Si la letra es mala se le resta
                oportunidades--;
                if (oportunidades == 0) {
                    JOptionPane.showMessageDialog(null, "La palabra era: " + palabraseleccionada);
                    juegoactivo = false; // Termina el juego si se quedan sin oportunidades
                } else {
                    JOptionPane.showMessageDialog(null, "La palabra no contiene esa letra.");
                }
            }
        }
    }//GEN-LAST:event_btnJugarActionPerformed

    private void btnCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarActionPerformed
        // TODO add your handling code here:
        // Cambiar palabras
        for (int i = 0; i < palabrasinicio.length; i++) {
            palabrasinicio[i] = JOptionPane.showInputDialog("Ingresa la palabra " + (i + 1) + ": ");
            }
            JOptionPane.showMessageDialog(null, palabrasinicio);
    }//GEN-LAST:event_btnCambiarActionPerformed

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
            java.util.logging.Logger.getLogger(Archaga_Aaron_IDClase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Archaga_Aaron_IDClase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Archaga_Aaron_IDClase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Archaga_Aaron_IDClase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Archaga_Aaron_IDClase().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton btnCambiar;
    private javax.swing.JButton btnJugar;
    private javax.swing.JButton btnSalir;
    // End of variables declaration//GEN-END:variables
}
