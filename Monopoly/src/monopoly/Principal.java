package monopoly;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    Random rdo = new Random();
    ListaJugadores ListaJ = new ListaJugadores();
    Banquero banquero = new Banquero();
    Dados dados = new Dados();
    int pos11 = 0, pos22 = 0, pos33 = 0, pos44 = 0, cantidad = 0, tope = 0, value, tempi = 0;
    String color1, color2, color3, color4;
    int inicialD[] = new int[8], turnoM[][] = new int[4][2];
    String ArcaComunal[][] = new String[14][3];
    String Fortuna[][] = new String[8][3];
    Tablero Tablero = new Tablero();
    Jugador jugador1, jugador2, jugador3, jugador4;
    boolean ordenar = true;
    ListaJugadores.J p;

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MonopolyVentanas = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        Posicion4 = new javax.swing.JButton();
        Posicion1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        Posicion2 = new javax.swing.JButton();
        Posicion3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        moverse = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        Jugador4 = new javax.swing.JLabel();
        Jugador3 = new javax.swing.JLabel();
        Jugador2 = new javax.swing.JLabel();
        Jugador1 = new javax.swing.JLabel();
        tableroL = new javax.swing.JLabel();
        tirarDados = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        colorj1 = new javax.swing.JLabel();
        colorj2 = new javax.swing.JLabel();
        colorj3 = new javax.swing.JLabel();
        colorj4 = new javax.swing.JLabel();
        tirarDados1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        MonopolyVentanas.setEnabled(false);
        MonopolyVentanas.setMinimumSize(new java.awt.Dimension(915, 770));
        MonopolyVentanas.setPreferredSize(new java.awt.Dimension(930, 800));

        jPanel2.setPreferredSize(new java.awt.Dimension(950, 800));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Amarillo", "Rojo", "Azul", "Verde" }));
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 510, 200, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Amarillo", "Rojo", "Azul", "Verde" }));
        jPanel2.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 200, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Amarillo", "Rojo", "Azul", "Verde" }));
        jPanel2.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, 200, -1));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Amarillo", "Rojo", "Azul", "Verde" }));
        jPanel2.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 450, 200, -1));

        Posicion4.setBackground(new java.awt.Color(255, 255, 255));
        Posicion4.setFont(new java.awt.Font("ROG Fonts", 0, 10)); // NOI18N
        Posicion4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/Imagenes/Sin título-1.png"))); // NOI18N
        Posicion4.setText("Posicion");
        Posicion4.setContentAreaFilled(false);
        Posicion4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Posicion4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Posicion4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Posicion4ActionPerformed(evt);
            }
        });
        jPanel2.add(Posicion4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 500, 120, 30));

        Posicion1.setBackground(new java.awt.Color(255, 255, 255));
        Posicion1.setFont(new java.awt.Font("ROG Fonts", 0, 10)); // NOI18N
        Posicion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/Imagenes/Sin título-1.png"))); // NOI18N
        Posicion1.setText("Posicion");
        Posicion1.setContentAreaFilled(false);
        Posicion1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Posicion1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Posicion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Posicion1ActionPerformed(evt);
            }
        });
        jPanel2.add(Posicion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, 120, 30));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("ROG Fonts", 0, 10)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/Imagenes/Sin título-1.png"))); // NOI18N
        jButton4.setText("Jugar");
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 620, 120, 30));

        Posicion2.setBackground(new java.awt.Color(255, 255, 255));
        Posicion2.setFont(new java.awt.Font("ROG Fonts", 0, 10)); // NOI18N
        Posicion2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/Imagenes/Sin título-1.png"))); // NOI18N
        Posicion2.setText("Posicion");
        Posicion2.setContentAreaFilled(false);
        Posicion2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Posicion2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Posicion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Posicion2ActionPerformed(evt);
            }
        });
        jPanel2.add(Posicion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 380, 120, 30));

        Posicion3.setBackground(new java.awt.Color(255, 255, 255));
        Posicion3.setFont(new java.awt.Font("ROG Fonts", 0, 10)); // NOI18N
        Posicion3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/Imagenes/Sin título-1.png"))); // NOI18N
        Posicion3.setText("Posicion");
        Posicion3.setContentAreaFilled(false);
        Posicion3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Posicion3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Posicion3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Posicion3ActionPerformed(evt);
            }
        });
        jPanel2.add(Posicion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 440, 120, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/Imagenes/Wlcom.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 925, -1));

        MonopolyVentanas.addTab("Bienvenida", jPanel2);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        moverse.setBackground(new java.awt.Color(255, 255, 255));
        moverse.setFont(new java.awt.Font("ROG Fonts", 0, 10)); // NOI18N
        moverse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/Imagenes/Sin título-1.png"))); // NOI18N
        moverse.setText("Moverse");
        moverse.setContentAreaFilled(false);
        moverse.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        moverse.setEnabled(false);
        moverse.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        moverse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moverseActionPerformed(evt);
            }
        });
        jPanel1.add(moverse, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 110, 120, 30));

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Jugador4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/Imagenes/Jugadores/R0.png"))); // NOI18N
        jPanel6.add(Jugador4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 700, 40, 40));

        Jugador3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/Imagenes/Jugadores/G0.png"))); // NOI18N
        jPanel6.add(Jugador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 700, 40, 40));

        Jugador2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/Imagenes/Jugadores/B0.png"))); // NOI18N
        jPanel6.add(Jugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 640, 40, 40));

        Jugador1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/Imagenes/Jugadores/A0.png"))); // NOI18N
        jPanel6.add(Jugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 640, 40, 40));

        tableroL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/Imagenes/Tablero.png"))); // NOI18N
        jPanel6.add(tableroL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 740));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 740));

        tirarDados.setBackground(new java.awt.Color(255, 255, 255));
        tirarDados.setFont(new java.awt.Font("ROG Fonts", 0, 10)); // NOI18N
        tirarDados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/Imagenes/Sin título-1.png"))); // NOI18N
        tirarDados.setText("Tirar dados");
        tirarDados.setContentAreaFilled(false);
        tirarDados.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tirarDados.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tirarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tirarDadosActionPerformed(evt);
            }
        });
        jPanel1.add(tirarDados, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 60, 120, 30));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "1bit", "2bit", "5bit", "10bit", "20bit", "50bit", "100bit", "500bit"
            }
        ));
        jTable2.setAutoscrolls(false);
        jTable2.setEnabled(false);
        jTable2.setMaximumSize(new java.awt.Dimension(2147483647, 20));
        jTable2.setMinimumSize(new java.awt.Dimension(60, 20));
        jTable2.setPreferredSize(new java.awt.Dimension(300, 20));
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 490, 380, 50));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "1bit", "2bit", "5bit", "10bit", "20bit", "50bit", "100bit", "500bit"
            }
        ));
        jTable3.setAutoscrolls(false);
        jTable3.setEnabled(false);
        jTable3.setMaximumSize(new java.awt.Dimension(2147483647, 20));
        jTable3.setMinimumSize(new java.awt.Dimension(60, 20));
        jTable3.setPreferredSize(new java.awt.Dimension(300, 20));
        jScrollPane3.setViewportView(jTable3);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 190, 380, 50));

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "1bit", "2bit", "5bit", "10bit", "20bit", "50bit", "100bit", "500bit"
            }
        ));
        jTable4.setAutoscrolls(false);
        jTable4.setEnabled(false);
        jTable4.setMaximumSize(new java.awt.Dimension(2147483647, 20));
        jTable4.setMinimumSize(new java.awt.Dimension(60, 20));
        jTable4.setPreferredSize(new java.awt.Dimension(300, 20));
        jScrollPane4.setViewportView(jTable4);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 290, 380, 50));

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "1bit", "2bit", "5bit", "10bit", "20bit", "50bit", "100bit", "500bit"
            }
        ));
        jTable5.setAutoscrolls(false);
        jTable5.setEnabled(false);
        jTable5.setMaximumSize(new java.awt.Dimension(2147483647, 20));
        jTable5.setMinimumSize(new java.awt.Dimension(60, 20));
        jTable5.setPreferredSize(new java.awt.Dimension(300, 20));
        jScrollPane5.setViewportView(jTable5);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 390, 380, 50));

        jLabel2.setText("Jugador4");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 470, -1, -1));

        jLabel3.setText("Jugador1");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 170, -1, -1));

        jLabel4.setText("Jugador2");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 270, -1, -1));

        jLabel5.setText("Jugador3");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 370, -1, -1));

        colorj1.setText("---");
        jPanel1.add(colorj1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 170, -1, -1));

        colorj2.setText("---");
        jPanel1.add(colorj2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 270, -1, -1));

        colorj3.setText("---");
        jPanel1.add(colorj3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 370, -1, -1));

        colorj4.setText("---");
        jPanel1.add(colorj4, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 470, -1, -1));

        tirarDados1.setBackground(new java.awt.Color(255, 255, 255));
        tirarDados1.setFont(new java.awt.Font("ROG Fonts", 0, 10)); // NOI18N
        tirarDados1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/monopoly/Imagenes/Sin título-1.png"))); // NOI18N
        tirarDados1.setText("Propiedades");
        tirarDados1.setContentAreaFilled(false);
        tirarDados1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tirarDados1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tirarDados1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tirarDados1ActionPerformed(evt);
            }
        });
        jPanel1.add(tirarDados1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 560, 120, 30));

        MonopolyVentanas.addTab("Tablero", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MonopolyVentanas, javax.swing.GroupLayout.PREFERRED_SIZE, 1145, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MonopolyVentanas, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void actualizarT(javax.swing.JTable t, int m[]) {
        t.setValueAt(m[0], 0, 0);
        t.setValueAt(m[1], 0, 1);
        t.setValueAt(m[2], 0, 2);
        t.setValueAt(m[3], 0, 3);
        t.setValueAt(m[4], 0, 4);
        t.setValueAt(m[5], 0, 5);
        t.setValueAt(m[6], 0, 6);
        t.setValueAt(m[7], 0, 7);
    }

    public void moverFicha(int posiciontemp) {
        switch (p.jugador.color) {
            case "A": {
                Jugador1.setLocation(p.jugador.coordenadas[posiciontemp][0], p.jugador.coordenadas[posiciontemp][1]);
                break;
            }
            case "B": {
                Jugador2.setLocation(p.jugador.coordenadas[posiciontemp][0], p.jugador.coordenadas[posiciontemp][1]);
                break;
            }
            case "G": {
                Jugador3.setLocation(p.jugador.coordenadas[posiciontemp][0], p.jugador.coordenadas[posiciontemp][1]);
                break;
            }
            case "R": {
                Jugador4.setLocation(p.jugador.coordenadas[posiciontemp][0], p.jugador.coordenadas[posiciontemp][1]);
                break;
            }
        }
    }
    private void moverseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moverseActionPerformed
        if (!p.jugador.carcel) {
            switch (p.jugador.jugador) {
                case 1: {
                    pos11 = pos11 + value;
                    pos11 = pos11 % 40;
                    break;
                }
                case 2: {
                    pos22 = pos22 + value;
                    pos22 = pos22 % 40;
                    break;
                }
                case 3: {
                    pos33 = pos33 + value;
                    pos33 = pos33 % 40;
                    break;
                }
                case 4: {
                    pos44 = pos44 + value;
                    pos44 = pos44 % 40;
                    break;
                }
            }
            p.jugador.Moverse(value, Tablero.head);
            JOptionPane.showMessageDialog(null, "Has sacado " + value + "\nEstas en: " + p.jugador.posicion.nombrec);
            int posiciontemp = 0;
            switch (p.jugador.jugador) {
                case 1: {
                    posiciontemp = pos11;
                    break;
                }
                case 2: {
                    posiciontemp = pos22;
                    break;
                }
                case 3: {
                    posiciontemp = pos33;
                    break;
                }
                case 4: {
                    posiciontemp = pos44;
                    break;
                }
            }
            moverFicha(posiciontemp);
            switch (p.jugador.posicion.is) {
                case 1: {
                    if (p.jugador.posicion.dueño == 0) {
                        String[] botones = {"No", "Si"};
                        int op = JOptionPane.showOptionDialog(null, "¿Deseas comprar la propiedad?\nTiene un valor de " + p.jugador.posicion.vcompra + "Bits",
                                "Comprar",
                                JOptionPane.DEFAULT_OPTION,
                                JOptionPane.QUESTION_MESSAGE, null,
                                botones, botones[0]);
                        if (op == 1 && p.jugador.dinerot >= p.jugador.posicion.vcompra) {
                            p.jugador.posicion.dueño = p.jugador.jugador;
                            int tempP = banquero.Pagar(p.jugador, p.jugador.posicion.vcompra);
                            if (tempP < 0) {
                                banquero.Devolver(p.jugador, tempP);
                            }
                            JOptionPane.showMessageDialog(null, "Se ha comprado con exito");
                        } else if (op == 1 && p.jugador.dinerot < p.jugador.posicion.vcompra) {
                            JOptionPane.showMessageDialog(null, "No tiene la cantidad necesaria para comprar esta propiedad");
                        }
                    } else if (p.jugador.posicion.dueño != p.jugador.jugador) {
                        ListaJugadores.J temp = p;
                        while (temp.jugador.jugador != p.jugador.posicion.dueño) {
                            temp = temp.next;
                        }
                        JOptionPane.showMessageDialog(null, "Oh no, le debe pagar al jugador #" + p.jugador.jugador + " " + p.jugador.posicion.renta + "Bits");
                        banquero.renta(temp.jugador.dinero, temp.jugador.dinerot, p.jugador.dinero, p.jugador.dinerot, p.jugador.posicion.vcompra, temp.jugador, p.jugador);
                    }
                    break;
                }
                case 2: {
                    switch (p.jugador.posicion.nombrec) {
                        case "FORTUNA": {
                            int z = rdo.nextInt(7);
                            JOptionPane.showMessageDialog(null, Fortuna[z][0]);
                            switch (Fortuna[z][2]) {
                                case "0": {
                                    banquero.Devolver(p.jugador, -1 * Integer.parseInt(Fortuna[z][1]));
                                    break;
                                }
                                case "1": {
                                    int tempP = banquero.Pagar(p.jugador, Integer.parseInt(Fortuna[z][1]));
                                    if (tempP != 0) {
                                        banquero.Devolver(p.jugador, tempP);
                                    }
                                    break;
                                }
                                case "2": {
                                    while (!(p.jugador.posicion.nombrec.equals("CARCEL"))) {
                                        p.jugador.posicion = p.jugador.posicion.next;
                                    }
                                    moverFicha(10);
                                    switch (p.jugador.jugador) {
                                        case 1: {
                                            pos11 = 10;
                                            break;
                                        }
                                        case 2: {
                                            pos22 = 10;
                                            break;
                                        }
                                        case 3: {
                                            pos33 = 10;
                                            break;
                                        }
                                        case 4: {
                                            pos44 = 10;
                                            break;
                                        }
                                    }
                                    p.jugador.carcel = true;
                                    break;
                                }
                                case "3": {
                                    p.jugador.sc++;
                                    break;
                                }
                            }
                            break;
                        }
                        case "ARCA COMUNAL": {
                            int z = rdo.nextInt(14);
                            JOptionPane.showMessageDialog(null, ArcaComunal[z][0]);
                            System.out.println(ArcaComunal[z][2]);
                            switch (ArcaComunal[z][2]) {
                                case "0": {
                                    banquero.Devolver(p.jugador, -1 * Integer.parseInt(ArcaComunal[z][1]));
                                    System.out.println(ArcaComunal[z][1]);
                                    break;
                                }
                                case "1": {
                                    int tempP = banquero.Pagar(p.jugador, Integer.parseInt(ArcaComunal[z][1]));
                                    if (tempP != 0) {
                                        banquero.Devolver(p.jugador, tempP);
                                    }
                                    break;
                                }
                                case "2": {
                                    while (!(p.jugador.posicion.nombrec.equals("CARCEL"))) {
                                        p.jugador.posicion = p.jugador.posicion.next;
                                    }
                                    moverFicha(10);
                                    p.jugador.carcel = true;
                                    break;
                                }
                                case "3": {
                                    p.jugador.sc++;
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    break;
                }
                case 3: {
                    if (p.jugador.posicion.renta != 0) {
                        if (p.jugador.posicion.dueño == 0) {
                            String[] botones = {"No", "Si"};
                            int op = JOptionPane.showOptionDialog(null, "¿Deseas comprar la propiedad?\nTiene un valor de " + p.jugador.posicion.vcompra + "Bits",
                                    "Comprar",
                                    JOptionPane.DEFAULT_OPTION,
                                    JOptionPane.QUESTION_MESSAGE, null,
                                    botones, botones[0]);
                            if (op == 1 && p.jugador.dinerot >= p.jugador.posicion.vcompra) {
                                p.jugador.posicion.dueño = p.jugador.jugador;
                                int tempP = banquero.Pagar(p.jugador, p.jugador.posicion.vcompra);
                                if (tempP < 0) {
                                    banquero.Devolver(p.jugador, tempP);
                                }
                                p.jugador.ferrocarriles++;
                                JOptionPane.showMessageDialog(null, "Se ha comprado con exito");
                            } else if (op == 1 && p.jugador.dinerot < p.jugador.posicion.vcompra) {
                                JOptionPane.showMessageDialog(null, "No tiene la cantidad necesaria para comprar esta propiedad");
                            }
                        } else if (p.jugador.posicion.dueño != p.jugador.jugador) {
                            ListaJugadores.J temp = p;
                            while (temp.jugador.jugador != p.jugador.posicion.dueño) {
                                temp = temp.next;
                            }

                            switch (temp.jugador.ferrocarriles) {
                                case 1: {
                                    JOptionPane.showMessageDialog(null, "Te toca pagarle al jugador " + temp.jugador.jugador + " 25 bits");
                                    banquero.renta(temp.jugador.dinero, temp.jugador.dinerot, p.jugador.dinero, p.jugador.dinerot, 25, temp.jugador, p.jugador);
                                    break;
                                }
                                case 2: {
                                    JOptionPane.showMessageDialog(null, "Te toca pagarle al jugador " + temp.jugador.jugador + " 50 bits");
                                    banquero.renta(temp.jugador.dinero, temp.jugador.dinerot, p.jugador.dinero, p.jugador.dinerot, 50, temp.jugador, p.jugador);
                                    break;
                                }
                                case 3: {
                                    JOptionPane.showMessageDialog(null, "Te toca pagarle al jugador " + temp.jugador.jugador + " 100 bits");
                                    banquero.renta(temp.jugador.dinero, temp.jugador.dinerot, p.jugador.dinero, p.jugador.dinerot, 100, temp.jugador, p.jugador);
                                    break;
                                }
                                case 4: {
                                    JOptionPane.showMessageDialog(null, "Te toca pagarle al jugador " + temp.jugador.jugador + " 200 bits");
                                    banquero.renta(temp.jugador.dinero, temp.jugador.dinerot, p.jugador.dinero, p.jugador.dinerot, 200, temp.jugador, p.jugador);
                                    break;
                                }
                            }
                        }
                    } else {
                        if (p.jugador.posicion.dueño == 0) {
                            String[] botones = {"No", "Si"};
                            int op = JOptionPane.showOptionDialog(null, "¿Deseas comprar la propiedad?\nTienes un valor de " + p.jugador.posicion.vcompra + "Bits",
                                    "Comprar",
                                    JOptionPane.DEFAULT_OPTION,
                                    JOptionPane.QUESTION_MESSAGE, null,
                                    botones, botones[0]);
                            if (op == 1 && p.jugador.dinerot >= p.jugador.posicion.vcompra) {
                                p.jugador.posicion.dueño = p.jugador.jugador;
                                int tempP = banquero.Pagar(p.jugador, p.jugador.posicion.vcompra);
                                if (tempP < 0) {
                                    banquero.Devolver(p.jugador, tempP);
                                }
                                p.jugador.compañias++;
                                JOptionPane.showMessageDialog(null, "Se ha comprado con exito");
                            } else if (op == 1 && p.jugador.dinerot < p.jugador.posicion.vcompra) {
                                JOptionPane.showMessageDialog(null, "No tiene la cantidad necesaria para comprar esta propiedad");
                            }
                        } else if (p.jugador.posicion.dueño != p.jugador.jugador) {
                            ListaJugadores.J temp = p;
                            while (temp.jugador.jugador != p.jugador.posicion.dueño) {
                                temp = temp.next;
                            }
                            JOptionPane.showMessageDialog(null, "Te toca pagarle al jugador " + temp.jugador.jugador
                                    + ". Tira los dados para saber cuanto le pagas");
                            int mlt;
                            mlt = p.jugador.TirarDados() + p.jugador.TirarDados();
                            switch (temp.jugador.compañias) {
                                case 1: {
                                    JOptionPane.showMessageDialog(null, "Sacaste " + mlt + " y le pagas " + (mlt * 4));
                                    banquero.renta(temp.jugador.dinero, temp.jugador.dinerot, p.jugador.dinero, p.jugador.dinerot, mlt * 4, temp.jugador, p.jugador);
                                    break;
                                }
                                case 2: {
                                    JOptionPane.showMessageDialog(null, "Sacaste " + mlt + " y le pagas " + (mlt * 10));
                                    banquero.renta(temp.jugador.dinero, temp.jugador.dinerot, p.jugador.dinero, p.jugador.dinerot, mlt * 10, temp.jugador, p.jugador);
                                    break;
                                }
                            }
                        }
                    }
                    break;
                }
                case 4: {
                    JOptionPane.showMessageDialog(null, "Tienes que pagar " + p.jugador.posicion.renta + " por " + p.jugador.posicion.nombrec);
                    int tempP = banquero.Pagar(p.jugador, p.jugador.posicion.renta);
                    if (tempP < 0) {
                        banquero.Devolver(p.jugador, tempP);
                    }
                    break;
                }
                case 5: {
                    JOptionPane.showMessageDialog(null, "Oh no, te toca ir a la carcel");
                    while (!(p.jugador.posicion.nombrec.equals("CARCEL"))) {
                        moverFicha(10);
                        switch (p.jugador.jugador) {
                            case 1: {
                                pos11 = 10;
                                break;
                            }
                            case 2: {
                                pos22 = 10;
                                break;
                            }
                            case 3: {
                                pos33 = 10;
                                break;
                            }
                            case 4: {
                                pos44 = 10;
                                break;
                            }
                        }
                        p.jugador.posicion = p.jugador.posicion.next;
                    }
                    p.jugador.carcel = true;
                    break;
                }
            }
            tirarDados.setEnabled(true);
            moverse.setEnabled(false);
        }
        switch (p.jugador.jugador) {
            case 1: {
                actualizarT(jTable3, p.jugador.dinero);
                break;
            }
            case 2: {
                actualizarT(jTable4, p.jugador.dinero);
                break;
            }
            case 3: {
                actualizarT(jTable5, p.jugador.dinero);
                break;
            }
            case 4: {
                actualizarT(jTable2, p.jugador.dinero);
                break;
            }
        }
        p = p.next;
        JOptionPane.showMessageDialog(null, "Es el turno del jugador #" + p.jugador.jugador, "Turno", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_moverseActionPerformed

    private void tirarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tirarDadosActionPerformed
        if (!p.jugador.carcel) {
            value = dados.TirarDados() + dados.TirarDados();
            JOptionPane.showMessageDialog(null, "Haz sacado un total de " + value, "Tirar Dados", JOptionPane.INFORMATION_MESSAGE);
            tirarDados.setEnabled(false);
            moverse.setEnabled(true);
        } else {
            if (p.jugador.carcel && p.jugador.sc > 0) {
                System.out.println("Estas en la carcel Jugador "
                        + p.jugador.jugador + "Tienes una carta para salir de la carcel."
                        + " Enhora buena :D");
                p.jugador.carcel = false;
                p.jugador.sc--;
                tirarDados.setEnabled(false);
                moverse.setEnabled(true);
            } else if (p.jugador.carcel) {
                JOptionPane.showMessageDialog(null, "Estas en la carcel Jugador "
                        + p.jugador.jugador + "\nTira el par de dados una"
                        + " vez y si te sale un doble eres libre");
                int d1 = dados.TirarDados();
                int d2 = dados.TirarDados();
                JOptionPane.showMessageDialog(null, "Dado 1: " + d1 + "\nDado 2: " + d2);
                if (d1 == d2) {
                    p.jugador.carcel = false;
                    JOptionPane.showMessageDialog(null, "Puedes salir. Que suertudo... Tira los dados de nuevo");
                } else {
                    JOptionPane.showMessageDialog(null, "No sacastes un par. Te quedas en la "
                            + "carcel");
                    p = p.next;
                }
            }
        }
    }//GEN-LAST:event_tirarDadosActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (tempi >= 2) {
            Tablero.inicializarTarjetas(ArcaComunal, Fortuna);
            inicialD[0] = 5;
            inicialD[1] = 5;
            inicialD[2] = 1;
            inicialD[3] = 2;
            inicialD[4] = 1;
            inicialD[5] = 1;
            inicialD[6] = 4;
            inicialD[7] = 2;
            Tablero.listaTablero();
            jugador1 = new Jugador(Tablero.head, 1);
            jugador1.iniciarD(inicialD);
            jugador2 = new Jugador(Tablero.head, 2);
            jugador2.iniciarD(inicialD);
            jugador3 = new Jugador(Tablero.head, 3);
            jugador3.iniciarD(inicialD);
            jugador4 = new Jugador(Tablero.head, 4);
            jugador4.iniciarD(inicialD);
            while (ordenar) {
                int i = 0;
                ordenar = false;
                while (cantidad - 1 > i) {
                    int temp;
                    if (turnoM[i][0] < turnoM[i + 1][0]) {
                        temp = turnoM[i][0];
                        turnoM[i][0] = turnoM[i + 1][0];
                        turnoM[i + 1][0] = temp;
                        temp = turnoM[i][1];
                        turnoM[i][1] = turnoM[i + 1][1];
                        turnoM[i + 1][1] = temp;
                        ordenar = true;
                    }
                    i++;
                }
            }
            for (int i = 0; i < cantidad; i++) {
                switch (turnoM[i][1]) {
                    case 1:
                        ListaJ.addJugadorL(jugador1);
                        jugador1.color = color1;
                        break;
                    case 2:
                        ListaJ.addJugadorL(jugador2);
                        jugador2.color = color2;
                        break;
                    case 3:
                        ListaJ.addJugadorL(jugador3);
                        jugador3.color = color3;
                        break;
                    case 4:
                        ListaJ.addJugadorL(jugador4);
                        jugador4.color = color4;
                        break;
                }
            }
            MonopolyVentanas.setSelectedIndex(1);
            JOptionPane.showMessageDialog(null, "El orden de los jugadores es el "
                    + "siguiente: \n1."
                    + turnoM[0][1] + "\n2."
                    + turnoM[1][1] + "\n3."
                    + turnoM[2][1] + "\n4."
                    + turnoM[3][1], "Turnos", JOptionPane.INFORMATION_MESSAGE);
            p = ListaJ.head;
            ListaJugadores.J temp = p;
            do {
                switch (temp.jugador.jugador) {
                    case 1: {
                        actualizarT(jTable3, temp.jugador.dinero);
                        break;
                    }
                    case 2: {
                        actualizarT(jTable4, temp.jugador.dinero);
                        break;
                    }
                    case 3: {
                        actualizarT(jTable5, temp.jugador.dinero);
                        break;
                    }
                    case 4: {
                        actualizarT(jTable2, temp.jugador.dinero);
                        break;
                    }
                }
                temp = temp.next;
            } while (temp != p);
            JOptionPane.showMessageDialog(null, "Es el turno del jugador #" + p.jugador.jugador, "Turno", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Tiene que haber mas de 2 jugadores para jugar", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void Posicion4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Posicion4ActionPerformed
        String x = (String) jComboBox1.getSelectedItem();
        int i = 0;
        if (!x.equals(" ")) {
            cantidad++;
            int val = dados.TirarDados() + dados.TirarDados();
            turnoM[tempi][0] = val;
            turnoM[tempi][1] = 4;
            tempi++;
            colorj4.setText(x);
            JOptionPane.showMessageDialog(null, "Haz sacado un total de " + val, "Tirar Dados", JOptionPane.INFORMATION_MESSAGE);
            switch (x) {
                case "Amarillo": {
                    color4 = "A";
                    while (!jComboBox1.getItemAt(i).equals(x)) {
                        i++;
                    }
                    jComboBox1.removeItemAt(i);
                    jComboBox2.removeItemAt(i);
                    jComboBox3.removeItemAt(i);
                    jComboBox4.removeItemAt(i);
                    break;
                }
                case "Rojo": {
                    color4 = "R";
                    while (!jComboBox1.getItemAt(i).equals(x)) {
                        i++;
                    }
                    jComboBox1.removeItemAt(i);
                    jComboBox2.removeItemAt(i);
                    jComboBox3.removeItemAt(i);
                    jComboBox4.removeItemAt(i);
                    break;
                }
                case "Azul": {
                    color4 = "B";
                    while (!jComboBox1.getItemAt(i).equals(x)) {
                        i++;
                    }
                    jComboBox1.removeItemAt(i);
                    jComboBox2.removeItemAt(i);
                    jComboBox3.removeItemAt(i);
                    jComboBox4.removeItemAt(i);
                    break;
                }
                case "Verde": {
                    color4 = "G";
                    while (!jComboBox1.getItemAt(i).equals(x)) {
                        i++;
                    }
                    jComboBox1.removeItemAt(i);
                    jComboBox2.removeItemAt(i);
                    jComboBox3.removeItemAt(i);
                    jComboBox4.removeItemAt(i);
                    break;
                }
            }
            Posicion4.setEnabled(false);
        }
    }//GEN-LAST:event_Posicion4ActionPerformed

    private void Posicion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Posicion1ActionPerformed
        String x = (String) jComboBox2.getSelectedItem();
        int i = 0;
        if (!x.equals(" ")) {
            cantidad++;
            int val = dados.TirarDados() + dados.TirarDados();
            turnoM[tempi][0] = val;
            turnoM[tempi][1] = 1;
            tempi++;
            colorj1.setText(x);
            JOptionPane.showMessageDialog(null, "Haz sacado un total de " + val, "Tirar Dados", JOptionPane.INFORMATION_MESSAGE);
            switch (x) {
                case "Amarillo": {
                    color1 = "A";
                    while (!jComboBox2.getItemAt(i).equals(x)) {
                        i++;
                    }
                    jComboBox1.removeItemAt(i);
                    jComboBox2.removeItemAt(i);
                    jComboBox3.removeItemAt(i);
                    jComboBox4.removeItemAt(i);
                    break;
                }
                case "Rojo": {
                    color1 = "R";
                    while (!jComboBox2.getItemAt(i).equals(x)) {
                        i++;
                    }
                    jComboBox1.removeItemAt(i);
                    jComboBox2.removeItemAt(i);
                    jComboBox3.removeItemAt(i);
                    jComboBox4.removeItemAt(i);
                    break;
                }
                case "Azul": {
                    color1 = "B";
                    while (!jComboBox2.getItemAt(i).equals(x)) {
                        i++;
                    }
                    jComboBox1.removeItemAt(i);
                    jComboBox2.removeItemAt(i);
                    jComboBox3.removeItemAt(i);
                    jComboBox4.removeItemAt(i);
                    break;
                }
                case "Verde": {
                    color1 = "G";
                    while (!jComboBox2.getItemAt(i).equals(x)) {
                        i++;
                    }
                    jComboBox1.removeItemAt(i);
                    jComboBox2.removeItemAt(i);
                    jComboBox3.removeItemAt(i);
                    jComboBox4.removeItemAt(i);
                    break;
                }
            }
            Posicion1.setEnabled(false);
        }
    }//GEN-LAST:event_Posicion1ActionPerformed

    private void Posicion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Posicion2ActionPerformed
        String x = (String) jComboBox3.getSelectedItem();
        int i = 0;
        if (!x.equals(" ")) {
            cantidad++;
            int val = dados.TirarDados() + dados.TirarDados();
            turnoM[tempi][0] = val;
            turnoM[tempi][1] = 2;
            tempi++;
            colorj2.setText(x);
            JOptionPane.showMessageDialog(null, "Haz sacado un total de " + val, "Tirar Dados", JOptionPane.INFORMATION_MESSAGE);
            switch (x) {
                case "Amarillo": {
                    color2 = "A";
                    while (!jComboBox3.getItemAt(i).equals(x)) {
                        i++;
                    }
                    jComboBox1.removeItemAt(i);
                    jComboBox2.removeItemAt(i);
                    jComboBox3.removeItemAt(i);
                    jComboBox4.removeItemAt(i);
                    break;
                }
                case "Rojo": {
                    color2 = "R";
                    while (!jComboBox3.getItemAt(i).equals(x)) {
                        i++;
                    }
                    jComboBox1.removeItemAt(i);
                    jComboBox2.removeItemAt(i);
                    jComboBox3.removeItemAt(i);
                    jComboBox4.removeItemAt(i);
                    break;
                }
                case "Azul": {
                    color2 = "B";
                    while (!jComboBox3.getItemAt(i).equals(x)) {
                        i++;
                    }
                    jComboBox1.removeItemAt(i);
                    jComboBox2.removeItemAt(i);
                    jComboBox3.removeItemAt(i);
                    jComboBox4.removeItemAt(i);
                    break;
                }
                case "Verde": {
                    color2 = "G";
                    while (!jComboBox3.getItemAt(i).equals(x)) {
                        i++;
                    }
                    jComboBox1.removeItemAt(i);
                    jComboBox2.removeItemAt(i);
                    jComboBox3.removeItemAt(i);
                    jComboBox4.removeItemAt(i);
                    break;
                }
            }
            Posicion2.setEnabled(false);
        }
    }//GEN-LAST:event_Posicion2ActionPerformed

    private void Posicion3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Posicion3ActionPerformed
        String x = (String) jComboBox4.getSelectedItem();
        int i = 0;
        if (!x.equals(" ")) {
            cantidad++;
            int val = dados.TirarDados() + dados.TirarDados();
            turnoM[tempi][0] = val;
            turnoM[tempi][1] = 3;
            tempi++;
            colorj3.setText(x);
            JOptionPane.showMessageDialog(null, "Haz sacado un total de " + val, "Tirar Dados", JOptionPane.INFORMATION_MESSAGE);
            switch (x) {
                case "Amarillo": {
                    color3 = "A";
                    while (!jComboBox4.getItemAt(i).equals(x)) {
                        i++;
                    }
                    jComboBox1.removeItemAt(i);
                    jComboBox2.removeItemAt(i);
                    jComboBox3.removeItemAt(i);
                    jComboBox4.removeItemAt(i);
                    break;
                }
                case "Rojo": {
                    color3 = "R";
                    while (!jComboBox4.getItemAt(i).equals(x)) {
                        i++;
                    }
                    jComboBox1.removeItemAt(i);
                    jComboBox2.removeItemAt(i);
                    jComboBox3.removeItemAt(i);
                    jComboBox4.removeItemAt(i);
                    break;
                }
                case "Azul": {
                    color3 = "B";
                    while (!jComboBox4.getItemAt(i).equals(x)) {
                        i++;
                    }
                    jComboBox1.removeItemAt(i);
                    jComboBox2.removeItemAt(i);
                    jComboBox3.removeItemAt(i);
                    jComboBox4.removeItemAt(i);
                    break;
                }
                case "Verde": {
                    color3 = "G";
                    while (!jComboBox4.getItemAt(i).equals(x)) {
                        i++;
                    }
                    jComboBox1.removeItemAt(i);
                    jComboBox2.removeItemAt(i);
                    jComboBox3.removeItemAt(i);
                    jComboBox4.removeItemAt(i);
                }
            }
            Posicion3.setEnabled(false);
        }
    }//GEN-LAST:event_Posicion3ActionPerformed

    private void tirarDados1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tirarDados1ActionPerformed
        String text = "";
        Tarjeta temp = Tablero.head;
        do {
            if (p.jugador.jugador == temp.dueño) {
                text = text + "* " + temp.nombrec + " ---- Renta: " + temp.renta +"\n";
            }
            temp = temp.next;
        } while (temp != Tablero.head);
        JOptionPane.showMessageDialog(null, "Propiedades: \n" + text, "Propiedades Jugador #" + p.jugador.jugador, JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_tirarDados1ActionPerformed

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
    private javax.swing.JLabel Jugador1;
    private javax.swing.JLabel Jugador2;
    private javax.swing.JLabel Jugador3;
    private javax.swing.JLabel Jugador4;
    private javax.swing.JTabbedPane MonopolyVentanas;
    private javax.swing.JButton Posicion1;
    private javax.swing.JButton Posicion2;
    private javax.swing.JButton Posicion3;
    private javax.swing.JButton Posicion4;
    private javax.swing.JLabel colorj1;
    private javax.swing.JLabel colorj2;
    private javax.swing.JLabel colorj3;
    private javax.swing.JLabel colorj4;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JButton moverse;
    private javax.swing.JLabel tableroL;
    private javax.swing.JButton tirarDados;
    private javax.swing.JButton tirarDados1;
    // End of variables declaration//GEN-END:variables
}
