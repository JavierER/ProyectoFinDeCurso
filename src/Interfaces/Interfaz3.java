
package Interfaces;

import Interfaces.Interfaz2;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Javii
 */
public class Interfaz3 extends javax.swing.JFrame {

    private boolean caraUp = false; 
    private ImageIcon imagen1;
    private ImageIcon imagen2;
    private JButton[] v = new JButton[2];
    private boolean cara1 = false;
    
    public Interfaz3() {
        initComponents();
        
        ordenarCartas();
    }

    private void ordenarCartas(){

        
        Boton1.setDisabledIcon(new ImageIcon(getClass().getResource("../Cartas/a1.png")));
        Boton2.setDisabledIcon(new ImageIcon(getClass().getResource("../Cartas/a3.png")));
        Boton3.setDisabledIcon(new ImageIcon(getClass().getResource("../Cartas/a7.png")));
        Boton4.setDisabledIcon(new ImageIcon(getClass().getResource("../Cartas/a9.png")));
        Boton5.setDisabledIcon(new ImageIcon(getClass().getResource("../Cartas/a2.png")));
        Boton6.setDisabledIcon(new ImageIcon(getClass().getResource("../Cartas/a6.png")));
        Boton7.setDisabledIcon(new ImageIcon(getClass().getResource("../Cartas/a4.png")));
        Boton8.setDisabledIcon(new ImageIcon(getClass().getResource("../Cartas/a5.png")));
        Boton9.setDisabledIcon(new ImageIcon(getClass().getResource("../Cartas/a0.png")));
        Boton10.setDisabledIcon(new ImageIcon(getClass().getResource("../Cartas/a8.png")));
        
        Boton11.setDisabledIcon(new ImageIcon(getClass().getResource("../Cartas/a7.png")));
        Boton12.setDisabledIcon(new ImageIcon(getClass().getResource("../Cartas/a0.png")));
        Boton13.setDisabledIcon(new ImageIcon(getClass().getResource("../Cartas/a9.png")));
        Boton14.setDisabledIcon(new ImageIcon(getClass().getResource("../Cartas/a3.png")));
        Boton15.setDisabledIcon(new ImageIcon(getClass().getResource("../Cartas/a5.png")));
        Boton16.setDisabledIcon(new ImageIcon(getClass().getResource("../Cartas/a6.png")));
        Boton17.setDisabledIcon(new ImageIcon(getClass().getResource("../Cartas/a2.png")));
        Boton18.setDisabledIcon(new ImageIcon(getClass().getResource("../Cartas/a8.png")));
        Boton19.setDisabledIcon(new ImageIcon(getClass().getResource("../Cartas/a4.png")));
        Boton20.setDisabledIcon(new ImageIcon(getClass().getResource("../Cartas/a1.png")));
    }
    
    //metodo para dejar las parejas que ya han sido seleccionadas en modo enabled=false;
    private void botonFuncional(JButton Boton){
        
        if(!caraUp){
            Boton.setEnabled(false);
            imagen1 =(ImageIcon) Boton.getDisabledIcon();
            v[0] = Boton;
            caraUp = true;
            cara1 = false;
        }
        else {
            Boton.setEnabled(false); 
            imagen2 =(ImageIcon) Boton.getDisabledIcon();
            v[1]= Boton;
            cara1 = true;
            ganar();
        }
    }
    
    private void comparar(){
        if(caraUp && cara1){ 
                      
         if(imagen1.getDescription().compareTo(imagen2.getDescription()) !=0) {
             v[0].setEnabled(true);
             v[1].setEnabled(true);
         }  
            caraUp = false;
        }
    }
  
    private void reiniciar() {
        
        Boton1.setEnabled(true);
        Boton2.setEnabled(true);
        Boton3.setEnabled(true);
        Boton4.setEnabled(true);
        Boton5.setEnabled(true);
        Boton6.setEnabled(true);
        Boton7.setEnabled(true);
        Boton8.setEnabled(true);
        Boton9.setEnabled(true);
        Boton10.setEnabled(true);
        Boton11.setEnabled(true);
        Boton12.setEnabled(true);
        Boton13.setEnabled(true);
        Boton14.setEnabled(true);
        Boton15.setEnabled(true);
        Boton16.setEnabled(true);
        Boton17.setEnabled(true);
        Boton18.setEnabled(true);
        Boton19.setEnabled(true);
        Boton20.setEnabled(true);
        
        cara1 = false;
        caraUp = false;
    }
    
    private void ganar(){
        if(!Boton1.isEnabled() && 
           !Boton2.isEnabled() && 
           !Boton3.isEnabled() && 
           !Boton4.isEnabled() && 
           !Boton5.isEnabled() && 
           !Boton6.isEnabled() && 
           !Boton7.isEnabled() && 
           !Boton8.isEnabled() && 
           !Boton9.isEnabled() && 
           !Boton10.isEnabled() && 
           !Boton11.isEnabled() && 
           !Boton12.isEnabled() && 
           !Boton13.isEnabled() && 
           !Boton14.isEnabled() && 
           !Boton15.isEnabled() && 
           !Boton16.isEnabled() && 
           !Boton17.isEnabled() && 
           !Boton18.isEnabled() && 
           !Boton19.isEnabled() && 
           !Boton20.isEnabled()){
           JOptionPane.showMessageDialog(this,"FELICIDADES HAS GANADO!","Win",JOptionPane.INFORMATION_MESSAGE);
           Interfaz4 window = new Interfaz4();
           window.setVisible(true);
           this.setVisible(false);
        }        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton22 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        Boton20 = new javax.swing.JButton();
        Boton15 = new javax.swing.JButton();
        Boton14 = new javax.swing.JButton();
        Boton19 = new javax.swing.JButton();
        Boton18 = new javax.swing.JButton();
        Boton13 = new javax.swing.JButton();
        Boton12 = new javax.swing.JButton();
        Boton17 = new javax.swing.JButton();
        Boton16 = new javax.swing.JButton();
        Boton11 = new javax.swing.JButton();
        Boton6 = new javax.swing.JButton();
        Boton1 = new javax.swing.JButton();
        Boton2 = new javax.swing.JButton();
        Boton7 = new javax.swing.JButton();
        Boton8 = new javax.swing.JButton();
        Boton3 = new javax.swing.JButton();
        Boton4 = new javax.swing.JButton();
        Boton9 = new javax.swing.JButton();
        Boton10 = new javax.swing.JButton();
        Boton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Anime-5.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 43, -1, 420));

        jButton22.setBackground(new java.awt.Color(0, 0, 0));
        jButton22.setFont(new java.awt.Font("One Smear", 2, 14)); // NOI18N
        jButton22.setForeground(new java.awt.Color(240, 240, 240));
        jButton22.setText("LISTA DE CARTAS");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 460, 199, 39));

        jButton21.setBackground(new java.awt.Color(0, 0, 0));
        jButton21.setFont(new java.awt.Font("One Smear", 2, 14)); // NOI18N
        jButton21.setForeground(new java.awt.Color(240, 240, 240));
        jButton21.setText("REINICIAR");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 560, 199, 39));

        Boton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reverso.png"))); // NOI18N
        Boton20.setBorder(null);
        Boton20.setBorderPainted(false);
        Boton20.setContentAreaFilled(false);
        Boton20.setFocusable(false);
        Boton20.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reverso2.png"))); // NOI18N
        Boton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton20ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 480, 97, 137));

        Boton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reverso.png"))); // NOI18N
        Boton15.setBorder(null);
        Boton15.setBorderPainted(false);
        Boton15.setContentAreaFilled(false);
        Boton15.setFocusable(false);
        Boton15.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reverso2.png"))); // NOI18N
        Boton15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Boton15MouseExited(evt);
            }
        });
        Boton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton15ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 330, 97, 137));

        Boton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reverso.png"))); // NOI18N
        Boton14.setBorder(null);
        Boton14.setBorderPainted(false);
        Boton14.setContentAreaFilled(false);
        Boton14.setFocusable(false);
        Boton14.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reverso2.png"))); // NOI18N
        Boton14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Boton14MouseExited(evt);
            }
        });
        Boton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton14ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 97, 137));

        Boton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reverso.png"))); // NOI18N
        Boton19.setBorder(null);
        Boton19.setBorderPainted(false);
        Boton19.setContentAreaFilled(false);
        Boton19.setFocusable(false);
        Boton19.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reverso2.png"))); // NOI18N
        Boton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton19ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 480, 97, 137));

        Boton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reverso.png"))); // NOI18N
        Boton18.setBorder(null);
        Boton18.setBorderPainted(false);
        Boton18.setContentAreaFilled(false);
        Boton18.setFocusable(false);
        Boton18.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reverso2.png"))); // NOI18N
        Boton18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Boton18MouseExited(evt);
            }
        });
        Boton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton18ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 480, 97, 137));

        Boton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reverso.png"))); // NOI18N
        Boton13.setBorder(null);
        Boton13.setBorderPainted(false);
        Boton13.setContentAreaFilled(false);
        Boton13.setFocusable(false);
        Boton13.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reverso2.png"))); // NOI18N
        Boton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Boton13MouseExited(evt);
            }
        });
        Boton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton13ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 97, 137));

        Boton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reverso.png"))); // NOI18N
        Boton12.setBorder(null);
        Boton12.setBorderPainted(false);
        Boton12.setContentAreaFilled(false);
        Boton12.setFocusable(false);
        Boton12.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reverso2.png"))); // NOI18N
        Boton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Boton12MouseExited(evt);
            }
        });
        Boton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton12ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 97, 137));

        Boton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reverso.png"))); // NOI18N
        Boton17.setBorder(null);
        Boton17.setBorderPainted(false);
        Boton17.setContentAreaFilled(false);
        Boton17.setFocusable(false);
        Boton17.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reverso2.png"))); // NOI18N
        Boton17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Boton17MouseExited(evt);
            }
        });
        Boton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton17ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 480, 97, 137));

        Boton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reverso.png"))); // NOI18N
        Boton16.setBorder(null);
        Boton16.setBorderPainted(false);
        Boton16.setContentAreaFilled(false);
        Boton16.setFocusable(false);
        Boton16.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reverso2.png"))); // NOI18N
        Boton16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Boton16MouseExited(evt);
            }
        });
        Boton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton16ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 97, 137));

        Boton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reverso.png"))); // NOI18N
        Boton11.setBorder(null);
        Boton11.setBorderPainted(false);
        Boton11.setContentAreaFilled(false);
        Boton11.setFocusable(false);
        Boton11.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reverso2.png"))); // NOI18N
        Boton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Boton11MouseExited(evt);
            }
        });
        Boton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton11ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 97, 137));

        Boton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reverso.png"))); // NOI18N
        Boton6.setBorder(null);
        Boton6.setBorderPainted(false);
        Boton6.setContentAreaFilled(false);
        Boton6.setFocusable(false);
        Boton6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reverso2.png"))); // NOI18N
        Boton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Boton6MouseExited(evt);
            }
        });
        Boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton6ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 97, 137));

        Boton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reverso.png"))); // NOI18N
        Boton1.setBorder(null);
        Boton1.setBorderPainted(false);
        Boton1.setContentAreaFilled(false);
        Boton1.setFocusable(false);
        Boton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reverso2.png"))); // NOI18N
        Boton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Boton1MouseExited(evt);
            }
        });
        Boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton1ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 97, 137));

        Boton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reverso.png"))); // NOI18N
        Boton2.setBorder(null);
        Boton2.setBorderPainted(false);
        Boton2.setContentAreaFilled(false);
        Boton2.setFocusable(false);
        Boton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reverso2.png"))); // NOI18N
        Boton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Boton2MouseExited(evt);
            }
        });
        Boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton2ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 97, 137));

        Boton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reverso.png"))); // NOI18N
        Boton7.setBorder(null);
        Boton7.setBorderPainted(false);
        Boton7.setContentAreaFilled(false);
        Boton7.setFocusable(false);
        Boton7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reverso2.png"))); // NOI18N
        Boton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Boton7MouseExited(evt);
            }
        });
        Boton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton7ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 97, 137));

        Boton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reverso.png"))); // NOI18N
        Boton8.setBorder(null);
        Boton8.setBorderPainted(false);
        Boton8.setContentAreaFilled(false);
        Boton8.setFocusable(false);
        Boton8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reverso2.png"))); // NOI18N
        Boton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Boton8MouseExited(evt);
            }
        });
        Boton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton8ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 97, 137));

        Boton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reverso.png"))); // NOI18N
        Boton3.setBorder(null);
        Boton3.setBorderPainted(false);
        Boton3.setContentAreaFilled(false);
        Boton3.setFocusable(false);
        Boton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reverso2.png"))); // NOI18N
        Boton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Boton3MouseExited(evt);
            }
        });
        Boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton3ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 97, 137));

        Boton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reverso.png"))); // NOI18N
        Boton4.setBorder(null);
        Boton4.setBorderPainted(false);
        Boton4.setContentAreaFilled(false);
        Boton4.setFocusable(false);
        Boton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reverso2.png"))); // NOI18N
        Boton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Boton4MouseExited(evt);
            }
        });
        Boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton4ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 97, 137));

        Boton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reverso.png"))); // NOI18N
        Boton9.setBorder(null);
        Boton9.setBorderPainted(false);
        Boton9.setContentAreaFilled(false);
        Boton9.setFocusable(false);
        Boton9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reverso2.png"))); // NOI18N
        Boton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Boton9MouseExited(evt);
            }
        });
        Boton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton9ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 97, 137));

        Boton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reverso.png"))); // NOI18N
        Boton10.setBorder(null);
        Boton10.setBorderPainted(false);
        Boton10.setContentAreaFilled(false);
        Boton10.setFocusable(false);
        Boton10.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reverso2.png"))); // NOI18N
        Boton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Boton10MouseExited(evt);
            }
        });
        Boton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton10ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, 97, 137));

        Boton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reverso.png"))); // NOI18N
        Boton5.setBorder(null);
        Boton5.setBorderPainted(false);
        Boton5.setContentAreaFilled(false);
        Boton5.setFocusable(false);
        Boton5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reverso2.png"))); // NOI18N
        Boton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Boton5MouseExited(evt);
            }
        });
        Boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton5ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 97, 137));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoFrame1.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton1ActionPerformed
        botonFuncional(Boton1);
    }//GEN-LAST:event_Boton1ActionPerformed

    private void Boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton2ActionPerformed
        botonFuncional(Boton2);
    }//GEN-LAST:event_Boton2ActionPerformed

    private void Boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton3ActionPerformed
        botonFuncional(Boton3);
    }//GEN-LAST:event_Boton3ActionPerformed

    private void Boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton4ActionPerformed
        botonFuncional(Boton4);
    }//GEN-LAST:event_Boton4ActionPerformed

    private void Boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton5ActionPerformed
        botonFuncional(Boton5);
    }//GEN-LAST:event_Boton5ActionPerformed

    private void Boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton6ActionPerformed
        botonFuncional(Boton6);
    }//GEN-LAST:event_Boton6ActionPerformed

    private void Boton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton7ActionPerformed
        botonFuncional(Boton7);
    }//GEN-LAST:event_Boton7ActionPerformed

    private void Boton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton8ActionPerformed
        botonFuncional(Boton8);
    }//GEN-LAST:event_Boton8ActionPerformed

    private void Boton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton9ActionPerformed
        botonFuncional(Boton9);
    }//GEN-LAST:event_Boton9ActionPerformed

    private void Boton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton10ActionPerformed
        botonFuncional(Boton10);
    }//GEN-LAST:event_Boton10ActionPerformed

    private void Boton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton11ActionPerformed
        botonFuncional(Boton11);
    }//GEN-LAST:event_Boton11ActionPerformed

    private void Boton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton12ActionPerformed
        botonFuncional(Boton12);
    }//GEN-LAST:event_Boton12ActionPerformed

    private void Boton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton13ActionPerformed
        botonFuncional(Boton13);
    }//GEN-LAST:event_Boton13ActionPerformed

    private void Boton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton14ActionPerformed
        botonFuncional(Boton14);
    }//GEN-LAST:event_Boton14ActionPerformed

    private void Boton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton15ActionPerformed
        botonFuncional(Boton15);
    }//GEN-LAST:event_Boton15ActionPerformed

    private void Boton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton16ActionPerformed
        botonFuncional(Boton16);
    }//GEN-LAST:event_Boton16ActionPerformed

    private void Boton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton17ActionPerformed
        botonFuncional(Boton17);
    }//GEN-LAST:event_Boton17ActionPerformed

    private void Boton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton18ActionPerformed
        botonFuncional(Boton18);
    }//GEN-LAST:event_Boton18ActionPerformed

    private void Boton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton19ActionPerformed
        botonFuncional(Boton19);
    }//GEN-LAST:event_Boton19ActionPerformed

    private void Boton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton20ActionPerformed
        botonFuncional(Boton20);
    }//GEN-LAST:event_Boton20ActionPerformed

    private void Boton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton1MouseExited
        comparar();
    }//GEN-LAST:event_Boton1MouseExited

    private void Boton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton2MouseExited
        comparar();
    }//GEN-LAST:event_Boton2MouseExited

    private void Boton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton3MouseExited
        comparar();
    }//GEN-LAST:event_Boton3MouseExited

    private void Boton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton4MouseExited
        comparar();
    }//GEN-LAST:event_Boton4MouseExited

    private void Boton5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton5MouseExited
        comparar();
    }//GEN-LAST:event_Boton5MouseExited

    private void Boton6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton6MouseExited
        comparar();
    }//GEN-LAST:event_Boton6MouseExited

    private void Boton7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton7MouseExited
        comparar();
    }//GEN-LAST:event_Boton7MouseExited

    private void Boton8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton8MouseExited
        comparar();
    }//GEN-LAST:event_Boton8MouseExited

    private void Boton9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton9MouseExited
        comparar();
    }//GEN-LAST:event_Boton9MouseExited

    private void Boton10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton10MouseExited
        comparar();
    }//GEN-LAST:event_Boton10MouseExited

    private void Boton11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton11MouseExited
        comparar();
    }//GEN-LAST:event_Boton11MouseExited

    private void Boton12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton12MouseExited
        comparar();
    }//GEN-LAST:event_Boton12MouseExited

    private void Boton13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton13MouseExited
        comparar();
    }//GEN-LAST:event_Boton13MouseExited

    private void Boton14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton14MouseExited
        comparar();
    }//GEN-LAST:event_Boton14MouseExited

    private void Boton15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton15MouseExited
        comparar();
    }//GEN-LAST:event_Boton15MouseExited

    private void Boton16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton16MouseExited
        comparar();
    }//GEN-LAST:event_Boton16MouseExited

    private void Boton17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton17MouseExited
        comparar();
    }//GEN-LAST:event_Boton17MouseExited

    private void Boton18MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton18MouseExited
        comparar();
    }//GEN-LAST:event_Boton18MouseExited

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        reiniciar();
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        Interfaz6 window = new Interfaz6();
        window.setVisible(true);
    }//GEN-LAST:event_jButton22ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton1;
    private javax.swing.JButton Boton10;
    private javax.swing.JButton Boton11;
    private javax.swing.JButton Boton12;
    private javax.swing.JButton Boton13;
    private javax.swing.JButton Boton14;
    private javax.swing.JButton Boton15;
    private javax.swing.JButton Boton16;
    private javax.swing.JButton Boton17;
    private javax.swing.JButton Boton18;
    private javax.swing.JButton Boton19;
    private javax.swing.JButton Boton2;
    private javax.swing.JButton Boton20;
    private javax.swing.JButton Boton3;
    private javax.swing.JButton Boton4;
    private javax.swing.JButton Boton5;
    private javax.swing.JButton Boton6;
    private javax.swing.JButton Boton7;
    private javax.swing.JButton Boton8;
    private javax.swing.JButton Boton9;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
