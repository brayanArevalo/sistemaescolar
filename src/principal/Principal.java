package principal;

import controlador.ControladorPrincipal;
import vista.VentanaInicio;

public class Principal {

    public static void main(String[] args) {
        //<editor-fold defaultstate="collapsed" desc="Look and feel">
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>
        VentanaInicio ventana = new VentanaInicio();
        ControladorPrincipal controlador = new ControladorPrincipal(ventana);
        controlador.iniciar();

        //new VentanaInicio().setVisible(true);
    }

}
