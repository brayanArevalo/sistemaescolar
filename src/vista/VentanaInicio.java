/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import principal.MyButton;

/**
 *
 * @author AREVALO
 */
public class VentanaInicio extends javax.swing.JFrame {
    public boolean bandera;

    /**
     * Creates new form VentanaInicio
     */
    public VentanaInicio() {
        initComponents();
        
        if (btnInicio.isSelected()) {
            btnInicio.setBackground(new Color(11, 94, 215));
        }
        MostrarPanel(new Inicio());
        System.out.println(contenido.getSize());
    }
    
    private void pruebaRecibida(MyButton b) {
        String prueba = b.getText();
        switch (prueba) {
            case "Inicio":
                btnInicio.setSelected(true);
                btnInicio.setBackground(new Color(11, 94, 215));
                btnCursos.setBackground(btnCursos.getColorNormal());
                btnAsignaturas.setBackground(btnAsignaturas.getColorNormal());
                btnCalificaciones.setBackground(btnCalificaciones.getColorNormal());
                btnProfesores.setBackground(btnProfesores.getColorNormal());
                btnEstudiantes.setBackground(btnEstudiantes.getColorNormal());
                btnAreas.setBackground(btnAreas.getColorNormal());
                btnBoletin.setBackground(btnBoletin.getColorNormal());
                //SELECTED FALSE
                btnCursos.setSelected(false);
                btnAsignaturas.setSelected(false);
                btnCalificaciones.setSelected(false);
                btnProfesores.setSelected(false);
                btnEstudiantes.setSelected(false);
                btnAreas.setSelected(false);
                btnBoletin.setSelected(false);
                break;
            case "Cursos":
                btnCursos.setSelected(true);
                btnCursos.setBackground(new Color(11, 94, 215));
                btnInicio.setBackground(btnInicio.getColorNormal());
                btnAsignaturas.setBackground(btnAsignaturas.getColorNormal());
                btnCalificaciones.setBackground(btnCalificaciones.getColorNormal());
                btnProfesores.setBackground(btnProfesores.getColorNormal());
                btnEstudiantes.setBackground(btnEstudiantes.getColorNormal());
                btnAreas.setBackground(btnAreas.getColorNormal());
                btnBoletin.setBackground(btnBoletin.getColorNormal());
                //SELECTED FALSE
                btnInicio.setSelected(false);
                btnAsignaturas.setSelected(false);
                btnCalificaciones.setSelected(false);
                btnProfesores.setSelected(false);
                btnEstudiantes.setSelected(false);
                btnAreas.setSelected(false);
                btnBoletin.setSelected(false);
                break;
            case "Estudiantes":
                btnEstudiantes.setSelected(true);
                btnEstudiantes.setBackground(new Color(11, 94, 215));
                btnInicio.setBackground(btnInicio.getColorNormal());
                btnAsignaturas.setBackground(btnAsignaturas.getColorNormal());
                btnCalificaciones.setBackground(btnCalificaciones.getColorNormal());
                btnProfesores.setBackground(btnProfesores.getColorNormal());
                btnCursos.setBackground(btnCursos.getColorNormal());
                btnAreas.setBackground(btnAreas.getColorNormal());
                btnBoletin.setBackground(btnBoletin.getColorNormal());
                //SELECTED FALSE
                btnInicio.setSelected(false);
                btnAsignaturas.setSelected(false);
                btnCalificaciones.setSelected(false);
                btnProfesores.setSelected(false);
                btnCursos.setSelected(false);
                btnAreas.setSelected(false);
                btnBoletin.setSelected(false);
                break;
            case "Profesores":
                btnProfesores.setSelected(true);
                btnProfesores.setBackground(new Color(11, 94, 215));
                btnCursos.setBackground(btnCursos.getColorNormal());
                btnAsignaturas.setBackground(btnAsignaturas.getColorNormal());
                btnCalificaciones.setBackground(btnCalificaciones.getColorNormal());
                btnInicio.setBackground(btnInicio.getColorNormal());
                btnEstudiantes.setBackground(btnEstudiantes.getColorNormal());
                btnAreas.setBackground(btnAreas.getColorNormal());
                btnBoletin.setBackground(btnBoletin.getColorNormal());
                //SELECTED FALSE
                btnCursos.setSelected(false);
                btnAsignaturas.setSelected(false);
                btnCalificaciones.setSelected(false);
                btnInicio.setSelected(false);
                btnEstudiantes.setSelected(false);
                btnAreas.setSelected(false);
                btnBoletin.setSelected(false);
                break;
            case "Areas":
                btnAreas.setSelected(true);
                btnAreas.setBackground(new Color(11, 94, 215));
                btnCursos.setBackground(btnCursos.getColorNormal());
                btnAsignaturas.setBackground(btnAsignaturas.getColorNormal());
                btnCalificaciones.setBackground(btnCalificaciones.getColorNormal());
                btnProfesores.setBackground(btnProfesores.getColorNormal());
                btnEstudiantes.setBackground(btnEstudiantes.getColorNormal());
                btnInicio.setBackground(btnInicio.getColorNormal());
                btnBoletin.setBackground(btnBoletin.getColorNormal());
                //SELECTED FALSE
                btnCursos.setSelected(false);
                btnAsignaturas.setSelected(false);
                btnCalificaciones.setSelected(false);
                btnProfesores.setSelected(false);
                btnEstudiantes.setSelected(false);
                btnInicio.setSelected(false);
                btnBoletin.setSelected(false);
                break;
            case "Asignaturas":
                btnAsignaturas.setSelected(true);
                btnAsignaturas.setBackground(new Color(11, 94, 215));
                btnCursos.setBackground(btnCursos.getColorNormal());
                btnInicio.setBackground(btnInicio.getColorNormal());
                btnCalificaciones.setBackground(btnCalificaciones.getColorNormal());
                btnProfesores.setBackground(btnProfesores.getColorNormal());
                btnEstudiantes.setBackground(btnEstudiantes.getColorNormal());
                btnAreas.setBackground(btnAreas.getColorNormal());
                btnBoletin.setBackground(btnBoletin.getColorNormal());
                //SELECTED FALSE
                btnCursos.setSelected(false);
                btnInicio.setSelected(false);
                btnCalificaciones.setSelected(false);
                btnProfesores.setSelected(false);
                btnEstudiantes.setSelected(false);
                btnAreas.setSelected(false);
                btnBoletin.setSelected(false);
                break;
            case "Calificaciones":
                btnCalificaciones.setSelected(true);
                btnCalificaciones.setBackground(new Color(11, 94, 215));
                btnCursos.setBackground(btnCursos.getColorNormal());
                btnAsignaturas.setBackground(btnAsignaturas.getColorNormal());
                btnInicio.setBackground(btnInicio.getColorNormal());
                btnProfesores.setBackground(btnProfesores.getColorNormal());
                btnEstudiantes.setBackground(btnEstudiantes.getColorNormal());
                btnAreas.setBackground(btnAreas.getColorNormal());
                btnBoletin.setBackground(btnBoletin.getColorNormal());
                //SELECTED FALSE
                btnCursos.setSelected(false);
                btnAsignaturas.setSelected(false);
                btnInicio.setSelected(false);
                btnProfesores.setSelected(false);
                btnEstudiantes.setSelected(false);
                btnAreas.setSelected(false);
                btnBoletin.setSelected(false);
                break;
            case "Boletines":
                btnBoletin.setSelected(true);
                btnBoletin.setBackground(new Color(11, 94, 215));
                btnCursos.setBackground(btnCursos.getColorNormal());
                btnAsignaturas.setBackground(btnAsignaturas.getColorNormal());
                btnCalificaciones.setBackground(btnCalificaciones.getColorNormal());
                btnProfesores.setBackground(btnProfesores.getColorNormal());
                btnEstudiantes.setBackground(btnEstudiantes.getColorNormal());
                btnAreas.setBackground(btnAreas.getColorNormal());
                btnInicio.setBackground(btnInicio.getColorNormal());
                //SELECTED FALSE
                btnCursos.setSelected(false);
                btnAsignaturas.setSelected(false);
                btnCalificaciones.setSelected(false);
                btnProfesores.setSelected(false);
                btnEstudiantes.setSelected(false);
                btnAreas.setSelected(false);
                btnInicio.setSelected(false);
                break;
            
        }
    }
    
    private void MostrarPanel(JPanel p) {
        //p.setSize(825, 568);
        p.setSize(contenido.getWidth(), contenido.getHeight());
        p.setLocation(0, 0);
        contenido.removeAll();
        contenido.add(p, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnCursos = new principal.MyButton();
        btnEstudiantes = new principal.MyButton();
        btnProfesores = new principal.MyButton();
        btnAreas = new principal.MyButton();
        btnAsignaturas = new principal.MyButton();
        btnCalificaciones = new principal.MyButton();
        btnBoletin = new principal.MyButton();
        btnInicio = new principal.MyButton();
        cabecera = new javax.swing.JPanel();
        cerrar = new principal.MyButton();
        minimizar = new principal.MyButton();
        contenido = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setMinimumSize(new java.awt.Dimension(1020, 640));
        background.setPreferredSize(new java.awt.Dimension(1020, 640));

        menu.setBackground(new java.awt.Color(3, 61, 149));
        menu.setPreferredSize(new java.awt.Dimension(200, 648));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Administrador");

        btnCursos.setBackground(new java.awt.Color(3, 61, 149));
        btnCursos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        btnCursos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salon-de-clases.png"))); // NOI18N
        btnCursos.setText("Cursos");
        btnCursos.setColorNormal(new java.awt.Color(3, 61, 149));
        btnCursos.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnCursos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCursos.setIconTextGap(10);
        btnCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCursosActionPerformed(evt);
            }
        });

        btnEstudiantes.setBackground(new java.awt.Color(3, 61, 149));
        btnEstudiantes.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        btnEstudiantes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/estudiante.png"))); // NOI18N
        btnEstudiantes.setText("Estudiantes");
        btnEstudiantes.setColorNormal(new java.awt.Color(3, 61, 149));
        btnEstudiantes.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnEstudiantes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEstudiantes.setIconTextGap(10);
        btnEstudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstudiantesActionPerformed(evt);
            }
        });

        btnProfesores.setBackground(new java.awt.Color(3, 61, 149));
        btnProfesores.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        btnProfesores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/profesor.png"))); // NOI18N
        btnProfesores.setText("Profesores");
        btnProfesores.setColorNormal(new java.awt.Color(3, 61, 149));
        btnProfesores.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnProfesores.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnProfesores.setIconTextGap(10);
        btnProfesores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfesoresActionPerformed(evt);
            }
        });

        btnAreas.setBackground(new java.awt.Color(3, 61, 149));
        btnAreas.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        btnAreas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/areas.png"))); // NOI18N
        btnAreas.setText("Areas");
        btnAreas.setColorNormal(new java.awt.Color(3, 61, 149));
        btnAreas.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnAreas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAreas.setIconTextGap(10);
        btnAreas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAreasActionPerformed(evt);
            }
        });

        btnAsignaturas.setBackground(new java.awt.Color(3, 61, 149));
        btnAsignaturas.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        btnAsignaturas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/libro.png"))); // NOI18N
        btnAsignaturas.setText("Asignaturas");
        btnAsignaturas.setColorNormal(new java.awt.Color(3, 61, 149));
        btnAsignaturas.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnAsignaturas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAsignaturas.setIconTextGap(10);
        btnAsignaturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignaturasActionPerformed(evt);
            }
        });

        btnCalificaciones.setBackground(new java.awt.Color(3, 61, 149));
        btnCalificaciones.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        btnCalificaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/calificaciones.png"))); // NOI18N
        btnCalificaciones.setText("Calificaciones");
        btnCalificaciones.setColorNormal(new java.awt.Color(3, 61, 149));
        btnCalificaciones.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnCalificaciones.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCalificaciones.setIconTextGap(10);
        btnCalificaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalificacionesActionPerformed(evt);
            }
        });

        btnBoletin.setBackground(new java.awt.Color(3, 61, 149));
        btnBoletin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        btnBoletin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boletin.png"))); // NOI18N
        btnBoletin.setText("Boletines");
        btnBoletin.setColorNormal(new java.awt.Color(3, 61, 149));
        btnBoletin.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnBoletin.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnBoletin.setIconTextGap(10);
        btnBoletin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBoletinActionPerformed(evt);
            }
        });

        btnInicio.setBackground(new java.awt.Color(3, 61, 149));
        btnInicio.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/casa (1).png"))); // NOI18N
        btnInicio.setToolTipText("");
        btnInicio.setColorNormal(new java.awt.Color(3, 61, 149));
        btnInicio.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnInicio.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnInicio.setIconTextGap(10);
        btnInicio.setLabel("Inicio");
        btnInicio.setMargin(new java.awt.Insets(2, 100, 2, 100));
        btnInicio.setSelected(true);
        btnInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInicioMouseExited(evt);
            }
        });
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProfesores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAreas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAsignaturas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBoletin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(btnInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel1)
                .addGap(65, 65, 65)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProfesores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAreas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAsignaturas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCalificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBoletin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        cabecera.setBackground(new java.awt.Color(255, 255, 255));
        cabecera.setMinimumSize(new java.awt.Dimension(820, 80));

        cerrar.setBackground(new java.awt.Color(255, 255, 255));
        cerrar.setForeground(new java.awt.Color(0, 0, 0));
        cerrar.setText("X");
        cerrar.setColorHover(new java.awt.Color(255, 0, 0));
        cerrar.setColorNormal(new java.awt.Color(255, 255, 255));
        cerrar.setColorTextNormal(new java.awt.Color(0, 0, 0));
        cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarActionPerformed(evt);
            }
        });

        minimizar.setBackground(new java.awt.Color(255, 255, 255));
        minimizar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 15, 1));
        minimizar.setForeground(new java.awt.Color(0, 0, 0));
        minimizar.setText("__");
        minimizar.setToolTipText("");
        minimizar.setColorHover(new java.awt.Color(13, 110, 253));
        minimizar.setColorNormal(new java.awt.Color(255, 255, 255));
        minimizar.setColorTextNormal(new java.awt.Color(0, 0, 0));
        minimizar.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        minimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cabeceraLayout = new javax.swing.GroupLayout(cabecera);
        cabecera.setLayout(cabeceraLayout);
        cabeceraLayout.setHorizontalGroup(
            cabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cabeceraLayout.createSequentialGroup()
                .addGap(0, 754, Short.MAX_VALUE)
                .addComponent(minimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        cabeceraLayout.setVerticalGroup(
            cabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cabeceraLayout.createSequentialGroup()
                .addGroup(cabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(minimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 50, Short.MAX_VALUE))
        );

        contenido.setBackground(new java.awt.Color(153, 0, 204));

        javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
        contenido.setLayout(contenidoLayout);
        contenidoLayout.setHorizontalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        contenidoLayout.setVerticalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cabecera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(cabecera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void minimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizarActionPerformed
        // TODO add your handling code here:
        this.setExtendedState(1);
    }//GEN-LAST:event_minimizarActionPerformed

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_cerrarActionPerformed

    private void btnCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCursosActionPerformed
        MostrarPanel(new Cursos());
        pruebaRecibida(btnCursos);
//        btnCursos.setSelected(true);
//        if (btnCursos.isSelected()) {
//            btnCursos.setBackground(new Color(11, 94, 215));
//            btnInicio.setBackground(btnInicio.getColorNormal());
//            btnAsignaturas.setBackground(btnAsignaturas.getColorNormal());
//            btnCalificaciones.setBackground(btnCalificaciones.getColorNormal());
//            btnProfesores.setBackground(btnProfesores.getColorNormal());
//            btnEstudiantes.setBackground(btnEstudiantes.getColorNormal());
//            btnAreas.setBackground(btnAreas.getColorNormal());
//            btnBoletin.setBackground(btnBoletin.getColorNormal());
//
//            //SELECTED FALSE
//            btnInicio.setSelected(false);
//            btnAsignaturas.setSelected(false);
//            btnCalificaciones.setSelected(false);
//            btnProfesores.setSelected(false);
//            btnEstudiantes.setSelected(false);
//            btnAreas.setSelected(false);
//            btnBoletin.setSelected(false);
//        }


    }//GEN-LAST:event_btnCursosActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        MostrarPanel(new Inicio());

//        btnInicio.setSelected(true);
//        if (btnInicio.isSelected()) {
//            btnInicio.setBackground(new Color(11, 94, 215));
//            //BACKGROUND NORMAL            
//            btnCursos.setBackground(btnCursos.getColorNormal());
//            btnAsignaturas.setBackground(btnAsignaturas.getColorNormal());
//            btnCalificaciones.setBackground(btnCalificaciones.getColorNormal());
//            btnProfesores.setBackground(btnProfesores.getColorNormal());
//            btnEstudiantes.setBackground(btnEstudiantes.getColorNormal());
//            btnAreas.setBackground(btnAreas.getColorNormal());
//            btnBoletin.setBackground(btnBoletin.getColorNormal());
//            //SELECTED FALSE
//            btnCursos.setSelected(false);
//            btnAsignaturas.setSelected(false);
//            btnCalificaciones.setSelected(false);
//            btnProfesores.setSelected(false);
//            btnEstudiantes.setSelected(false);
//            btnAreas.setSelected(false);
//            btnBoletin.setSelected(false);
//        }
        pruebaRecibida(btnInicio);
        

    }//GEN-LAST:event_btnInicioActionPerformed
    

    private void btnEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstudiantesActionPerformed
        MostrarPanel(new Estudiantes());
        pruebaRecibida(btnEstudiantes);
    }//GEN-LAST:event_btnEstudiantesActionPerformed

    private void btnProfesoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfesoresActionPerformed
        MostrarPanel(new Profesores());
        pruebaRecibida(btnProfesores);
    }//GEN-LAST:event_btnProfesoresActionPerformed

    private void btnAreasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAreasActionPerformed
        MostrarPanel(new Areas());
        pruebaRecibida(btnAreas);
    }//GEN-LAST:event_btnAreasActionPerformed

    private void btnAsignaturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignaturasActionPerformed
        MostrarPanel(new Asignaturas());
        pruebaRecibida(btnAsignaturas);
    }//GEN-LAST:event_btnAsignaturasActionPerformed

    private void btnCalificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalificacionesActionPerformed
        MostrarPanel(new Calificaciones());
        pruebaRecibida(btnCalificaciones);
    }//GEN-LAST:event_btnCalificacionesActionPerformed

    private void btnBoletinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBoletinActionPerformed
        MostrarPanel(new Boletines());
        pruebaRecibida(btnBoletin);
    }//GEN-LAST:event_btnBoletinActionPerformed

    private void btnInicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseExited
        // TODO add your handling code here:

    }//GEN-LAST:event_btnInicioMouseExited

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private principal.MyButton btnAreas;
    private principal.MyButton btnAsignaturas;
    private principal.MyButton btnBoletin;
    private principal.MyButton btnCalificaciones;
    private principal.MyButton btnCursos;
    private principal.MyButton btnEstudiantes;
    private principal.MyButton btnInicio;
    private principal.MyButton btnProfesores;
    private javax.swing.JPanel cabecera;
    private principal.MyButton cerrar;
    private javax.swing.JPanel contenido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel menu;
    private principal.MyButton minimizar;
    // End of variables declaration//GEN-END:variables
}
