package controlador;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import principal.MyButton;
import vista.*;
import vista.VentanaInicio;

public class ControladorPrincipal implements ActionListener {

    private final VentanaInicio venPrincipal;

    //@SuppressWarnings("LeakingThisInConstructor")
    public ControladorPrincipal(VentanaInicio venPrincipal) {
        this.venPrincipal = venPrincipal;
        this.venPrincipal.btnInicio.addActionListener(this);
        this.venPrincipal.btnProfesores.addActionListener(this);
        this.venPrincipal.btnAsignaturas.addActionListener(this);
        this.venPrincipal.btnEstudiantes.addActionListener(this);
        this.venPrincipal.btnCursos.addActionListener(this);
        this.venPrincipal.btnAreas.addActionListener(this);
        this.venPrincipal.btnCalificaciones.addActionListener(this);
        this.venPrincipal.btnBoletin.addActionListener(this);
        this.venPrincipal.cerrar.addActionListener(this);
        this.venPrincipal.minimizar.addActionListener(this);
    }

    public void iniciar() {
        venPrincipal.setVisible(true);
        if (venPrincipal.btnInicio.isSelected()) {
            venPrincipal.btnInicio.setBackground(new Color(11, 94, 215));
            mostrarPanel(new Inicio());
        }
    }

    private void mostrarPanel(JPanel p) {
        p.setSize(venPrincipal.contenido.getWidth(), venPrincipal.contenido.getHeight());
        p.setLocation(0, 0);
        venPrincipal.contenido.removeAll();
        venPrincipal.contenido.add(p, BorderLayout.CENTER);
        venPrincipal.contenido.revalidate();
        venPrincipal.contenido.repaint();
    }

    private void colorBtnActive(MyButton b) {
        String prueba = b.getText();
        switch (prueba) {
            case "Inicio":
                venPrincipal.btnInicio.setSelected(true);
                venPrincipal.btnInicio.setBackground(new Color(11, 94, 215));
                venPrincipal.btnCursos.setBackground(venPrincipal.btnCursos.getColorNormal());
                venPrincipal.btnAsignaturas.setBackground(venPrincipal.btnAsignaturas.getColorNormal());
                venPrincipal.btnCalificaciones.setBackground(venPrincipal.btnCalificaciones.getColorNormal());
                venPrincipal.btnProfesores.setBackground(venPrincipal.btnProfesores.getColorNormal());
                venPrincipal.btnEstudiantes.setBackground(venPrincipal.btnEstudiantes.getColorNormal());
                venPrincipal.btnAreas.setBackground(venPrincipal.btnAreas.getColorNormal());
                venPrincipal.btnBoletin.setBackground(venPrincipal.btnBoletin.getColorNormal());
                //SELECTED FALSE
                venPrincipal.btnCursos.setSelected(false);
                venPrincipal.btnAsignaturas.setSelected(false);
                venPrincipal.btnCalificaciones.setSelected(false);
                venPrincipal.btnProfesores.setSelected(false);
                venPrincipal.btnEstudiantes.setSelected(false);
                venPrincipal.btnAreas.setSelected(false);
                venPrincipal.btnBoletin.setSelected(false);
                break;
            case "Cursos":
                venPrincipal.btnCursos.setSelected(true);
                venPrincipal.btnCursos.setBackground(new Color(11, 94, 215));
                venPrincipal.btnInicio.setBackground(venPrincipal.btnInicio.getColorNormal());
                venPrincipal.btnAsignaturas.setBackground(venPrincipal.btnAsignaturas.getColorNormal());
                venPrincipal.btnCalificaciones.setBackground(venPrincipal.btnCalificaciones.getColorNormal());
                venPrincipal.btnProfesores.setBackground(venPrincipal.btnProfesores.getColorNormal());
                venPrincipal.btnEstudiantes.setBackground(venPrincipal.btnEstudiantes.getColorNormal());
                venPrincipal.btnAreas.setBackground(venPrincipal.btnAreas.getColorNormal());
                venPrincipal.btnBoletin.setBackground(venPrincipal.btnBoletin.getColorNormal());
                //SELECTED FALSE
                venPrincipal.btnInicio.setSelected(false);
                venPrincipal.btnAsignaturas.setSelected(false);
                venPrincipal.btnCalificaciones.setSelected(false);
                venPrincipal.btnProfesores.setSelected(false);
                venPrincipal.btnEstudiantes.setSelected(false);
                venPrincipal.btnAreas.setSelected(false);
                venPrincipal.btnBoletin.setSelected(false);
                break;
            case "Estudiantes":
                venPrincipal.btnEstudiantes.setSelected(true);
                venPrincipal.btnEstudiantes.setBackground(new Color(11, 94, 215));
                venPrincipal.btnInicio.setBackground(venPrincipal.btnInicio.getColorNormal());
                venPrincipal.btnAsignaturas.setBackground(venPrincipal.btnAsignaturas.getColorNormal());
                venPrincipal.btnCalificaciones.setBackground(venPrincipal.btnCalificaciones.getColorNormal());
                venPrincipal.btnProfesores.setBackground(venPrincipal.btnProfesores.getColorNormal());
                venPrincipal.btnCursos.setBackground(venPrincipal.btnCursos.getColorNormal());
                venPrincipal.btnAreas.setBackground(venPrincipal.btnAreas.getColorNormal());
                venPrincipal.btnBoletin.setBackground(venPrincipal.btnBoletin.getColorNormal());
                //SELECTED FALSE
                venPrincipal.btnInicio.setSelected(false);
                venPrincipal.btnAsignaturas.setSelected(false);
                venPrincipal.btnCalificaciones.setSelected(false);
                venPrincipal.btnProfesores.setSelected(false);
                venPrincipal.btnCursos.setSelected(false);
                venPrincipal.btnAreas.setSelected(false);
                venPrincipal.btnBoletin.setSelected(false);
                break;
            case "Profesores":
                venPrincipal.btnProfesores.setSelected(true);
                venPrincipal.btnProfesores.setBackground(new Color(11, 94, 215));
                venPrincipal.btnCursos.setBackground(venPrincipal.btnCursos.getColorNormal());
                venPrincipal.btnAsignaturas.setBackground(venPrincipal.btnAsignaturas.getColorNormal());
                venPrincipal.btnCalificaciones.setBackground(venPrincipal.btnCalificaciones.getColorNormal());
                venPrincipal.btnInicio.setBackground(venPrincipal.btnInicio.getColorNormal());
                venPrincipal.btnEstudiantes.setBackground(venPrincipal.btnEstudiantes.getColorNormal());
                venPrincipal.btnAreas.setBackground(venPrincipal.btnAreas.getColorNormal());
                venPrincipal.btnBoletin.setBackground(venPrincipal.btnBoletin.getColorNormal());
                //SELECTED FALSE
                venPrincipal.btnCursos.setSelected(false);
                venPrincipal.btnAsignaturas.setSelected(false);
                venPrincipal.btnCalificaciones.setSelected(false);
                venPrincipal.btnInicio.setSelected(false);
                venPrincipal.btnEstudiantes.setSelected(false);
                venPrincipal.btnAreas.setSelected(false);
                venPrincipal.btnBoletin.setSelected(false);
                break;
            case "Areas":
                venPrincipal.btnAreas.setSelected(true);
                venPrincipal.btnAreas.setBackground(new Color(11, 94, 215));
                venPrincipal.btnCursos.setBackground(venPrincipal.btnCursos.getColorNormal());
                venPrincipal.btnAsignaturas.setBackground(venPrincipal.btnAsignaturas.getColorNormal());
                venPrincipal.btnCalificaciones.setBackground(venPrincipal.btnCalificaciones.getColorNormal());
                venPrincipal.btnProfesores.setBackground(venPrincipal.btnProfesores.getColorNormal());
                venPrincipal.btnEstudiantes.setBackground(venPrincipal.btnEstudiantes.getColorNormal());
                venPrincipal.btnInicio.setBackground(venPrincipal.btnInicio.getColorNormal());
                venPrincipal.btnBoletin.setBackground(venPrincipal.btnBoletin.getColorNormal());
                //SELECTED FALSE
                venPrincipal.btnCursos.setSelected(false);
                venPrincipal.btnAsignaturas.setSelected(false);
                venPrincipal.btnCalificaciones.setSelected(false);
                venPrincipal.btnProfesores.setSelected(false);
                venPrincipal.btnEstudiantes.setSelected(false);
                venPrincipal.btnInicio.setSelected(false);
                venPrincipal.btnBoletin.setSelected(false);
                break;
            case "Asignaturas":
                venPrincipal.btnAsignaturas.setSelected(true);
                venPrincipal.btnAsignaturas.setBackground(new Color(11, 94, 215));
                venPrincipal.btnCursos.setBackground(venPrincipal.btnCursos.getColorNormal());
                venPrincipal.btnInicio.setBackground(venPrincipal.btnInicio.getColorNormal());
                venPrincipal.btnCalificaciones.setBackground(venPrincipal.btnCalificaciones.getColorNormal());
                venPrincipal.btnProfesores.setBackground(venPrincipal.btnProfesores.getColorNormal());
                venPrincipal.btnEstudiantes.setBackground(venPrincipal.btnEstudiantes.getColorNormal());
                venPrincipal.btnAreas.setBackground(venPrincipal.btnAreas.getColorNormal());
                venPrincipal.btnBoletin.setBackground(venPrincipal.btnBoletin.getColorNormal());
                //SELECTED FALSE
                venPrincipal.btnCursos.setSelected(false);
                venPrincipal.btnInicio.setSelected(false);
                venPrincipal.btnCalificaciones.setSelected(false);
                venPrincipal.btnProfesores.setSelected(false);
                venPrincipal.btnEstudiantes.setSelected(false);
                venPrincipal.btnAreas.setSelected(false);
                venPrincipal.btnBoletin.setSelected(false);
                break;
            case "Calificaciones":
                venPrincipal.btnCalificaciones.setSelected(true);
                venPrincipal.btnCalificaciones.setBackground(new Color(11, 94, 215));
                venPrincipal.btnCursos.setBackground(venPrincipal.btnCursos.getColorNormal());
                venPrincipal.btnAsignaturas.setBackground(venPrincipal.btnAsignaturas.getColorNormal());
                venPrincipal.btnInicio.setBackground(venPrincipal.btnInicio.getColorNormal());
                venPrincipal.btnProfesores.setBackground(venPrincipal.btnProfesores.getColorNormal());
                venPrincipal.btnEstudiantes.setBackground(venPrincipal.btnEstudiantes.getColorNormal());
                venPrincipal.btnAreas.setBackground(venPrincipal.btnAreas.getColorNormal());
                venPrincipal.btnBoletin.setBackground(venPrincipal.btnBoletin.getColorNormal());
                //SELECTED FALSE
                venPrincipal.btnCursos.setSelected(false);
                venPrincipal.btnAsignaturas.setSelected(false);
                venPrincipal.btnInicio.setSelected(false);
                venPrincipal.btnProfesores.setSelected(false);
                venPrincipal.btnEstudiantes.setSelected(false);
                venPrincipal.btnAreas.setSelected(false);
                venPrincipal.btnBoletin.setSelected(false);
                break;
            case "Boletines":
                venPrincipal.btnBoletin.setSelected(true);
                venPrincipal.btnBoletin.setBackground(new Color(11, 94, 215));
                venPrincipal.btnCursos.setBackground(venPrincipal.btnCursos.getColorNormal());
                venPrincipal.btnAsignaturas.setBackground(venPrincipal.btnAsignaturas.getColorNormal());
                venPrincipal.btnCalificaciones.setBackground(venPrincipal.btnCalificaciones.getColorNormal());
                venPrincipal.btnProfesores.setBackground(venPrincipal.btnProfesores.getColorNormal());
                venPrincipal.btnEstudiantes.setBackground(venPrincipal.btnEstudiantes.getColorNormal());
                venPrincipal.btnAreas.setBackground(venPrincipal.btnAreas.getColorNormal());
                venPrincipal.btnInicio.setBackground(venPrincipal.btnInicio.getColorNormal());
                //SELECTED FALSE
                venPrincipal.btnCursos.setSelected(false);
                venPrincipal.btnAsignaturas.setSelected(false);
                venPrincipal.btnCalificaciones.setSelected(false);
                venPrincipal.btnProfesores.setSelected(false);
                venPrincipal.btnEstudiantes.setSelected(false);
                venPrincipal.btnAreas.setSelected(false);
                venPrincipal.btnInicio.setSelected(false);
                break;
        }
    }

    /**
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        String opcion = e.getActionCommand();       
        switch (opcion) {
            case "Inicio":
                mostrarPanel(new Inicio());
                colorBtnActive(venPrincipal.btnInicio);
                break;
            case "Estudiantes":
                mostrarPanel(new Estudiantes());
                colorBtnActive(venPrincipal.btnEstudiantes);
                break;
            case "Profesores":
                mostrarPanel(new Profesores());
                colorBtnActive(venPrincipal.btnProfesores);
                break;
            case "Asignaturas":
                mostrarPanel(new Asignaturas());
                colorBtnActive(venPrincipal.btnAsignaturas);
                break;
            case "Cursos":
                mostrarPanel(new Cursos());
                colorBtnActive(venPrincipal.btnCursos);
                break;
            case "Boletines":
                mostrarPanel(new Boletines());
                colorBtnActive(venPrincipal.btnBoletin);
                break;
            case "Areas":
                mostrarPanel(new Areas());
                colorBtnActive(venPrincipal.btnAreas);
                break;
            case "Calificaciones":
                mostrarPanel(new Calificaciones());
                colorBtnActive(venPrincipal.btnCalificaciones);
                break;
            case "__":
                venPrincipal.setExtendedState(1);
                break;
            case "X":
                System.exit(0);
                break;
            default:
                System.out.println("Invalido");
        }
//        if (e.getSource() == venPrincipal.btnInicio) {
//        } 
    }

}
