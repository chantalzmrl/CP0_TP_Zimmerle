/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package superpuissance4_console;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author chantalzimmerle
 */
public class fenetreDeJeu extends javax.swing.JFrame {

    /**
     * Creates new form fenetreDeJeu
     */
    Joueur Listejoueurs[] = new Joueur[2];
    Joueur JoueurCourant;
    Grille grilleDeJeu = new Grille();

    public fenetreDeJeu() {
        initComponents();
        panneau_info_joueurs.setVisible(false);
        panneau_info_partie.setVisible(false);

        for (int i = 5; i >= 0; i--) {
            for (int j = 0; j < 7; j++) {
                CelluleGraphique cellGraph = new CelluleGraphique(grilleDeJeu.Cellules[i][j]);

                cellGraph.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        Cellule c = cellGraph.celluleAssociee;
                        if (c.jetonCourant == null) {
                            return;
                        }

                        if (c.jetonCourant.Couleur.equals(JoueurCourant.Couleur)) {
                            messages.setText("Le joueur " + JoueurCourant.Nom + " récupère un de ses jetons");
                            Jeton jrecup = c.recupererJeton();
                            JoueurCourant.ajouterJeton(jrecup);
                            joueurSuivant();
                        } else {
                            if (JoueurCourant.nombreDesintegrateurs > 0) {
                                messages.setText("Le joueur " + JoueurCourant.Nom + " veut désintégrer un jeton");
                                c.supprimerJeton();
                                JoueurCourant.utiliserDesintegrateur();
                                joueurSuivant();
                            } else {
                                return;
                            }
                        }
                        grilleDeJeu.tasserGrille();
                        panneau_grille.repaint();
                        lbl_j1_desint.setText(Listejoueurs[0].nombreDesintegrateurs + "");
                        lbl_j2_desint.setText(Listejoueurs[1].nombreDesintegrateurs + "");

                        boolean vict_j1 = grilleDeJeu.etreGagnantePourJoueur(Listejoueurs[0]);
                        boolean vict_j2 = grilleDeJeu.etreGagnantePourJoueur(Listejoueurs[1]);

                        if (vict_j1 && !vict_j2) {
                            messages.setText("Victoire de " + Listejoueurs[0].Nom);
                        }
                        if (vict_j2 && !vict_j1) {
                            messages.setText("Victoire de " + Listejoueurs[1].Nom);
                        }

                        if (vict_j1 && vict_j2) {
                            if (JoueurCourant == Listejoueurs[0]) {
                                messages.setText("Victoire de " + Listejoueurs[1].Nom);
                            } else {
                                messages.setText("Victoire de " + Listejoueurs[0].Nom + " Faute de jeu de l'autre joueur");
                            }
                        }

                    }
                });

                panneau_grille.add(cellGraph);

            }
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

        panneau_grille = new javax.swing.JPanel();
        panneau_creation_partie = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nom_joueur1 = new javax.swing.JTextField();
        nom_joueur2 = new javax.swing.JTextField();
        btn_start = new javax.swing.JButton();
        panneau_info_joueurs = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_j1_nom = new javax.swing.JLabel();
        lbl_j1_couleur = new javax.swing.JLabel();
        lbl_j1_desint = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbl_j2_nom = new javax.swing.JLabel();
        lbl_j2_couleur = new javax.swing.JLabel();
        lbl_j2_desint = new javax.swing.JLabel();
        panneau_info_partie = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbl_jcourant = new javax.swing.JLabel();
        message = new javax.swing.JScrollPane();
        messages = new javax.swing.JTextArea();
        btn_col_0 = new javax.swing.JButton();
        btn_col_1 = new javax.swing.JButton();
        btn_col_2 = new javax.swing.JButton();
        btn_col_3 = new javax.swing.JButton();
        btn_col_4 = new javax.swing.JButton();
        btn_col_5 = new javax.swing.JButton();
        btn_col_6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panneau_grille.setBackground(new java.awt.Color(255, 255, 255));
        panneau_grille.setLayout(new java.awt.GridLayout(6, 7));
        getContentPane().add(panneau_grille, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 672, 576));

        panneau_creation_partie.setBackground(new java.awt.Color(204, 204, 255));
        panneau_creation_partie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nom joueur 2:");
        panneau_creation_partie.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel2.setText("Nom joueur 1:");
        panneau_creation_partie.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        panneau_creation_partie.add(nom_joueur1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 120, -1));
        panneau_creation_partie.add(nom_joueur2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 120, -1));

        btn_start.setText("Démarrer partie");
        btn_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_startActionPerformed(evt);
            }
        });
        panneau_creation_partie.add(btn_start, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, -1, -1));

        getContentPane().add(panneau_creation_partie, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 30, 310, 120));

        panneau_info_joueurs.setBackground(new java.awt.Color(204, 204, 255));
        panneau_info_joueurs.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel3.setText("Info joueur");
        panneau_info_joueurs.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel7.setText("Joueur 1:");
        panneau_info_joueurs.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 47, -1, 30));

        jLabel6.setText("Couleur:");
        panneau_info_joueurs.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 77, -1, 30));

        jLabel4.setText("Désintégrateur");
        panneau_info_joueurs.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 107, -1, 30));

        lbl_j1_nom.setText("nomJoueur1");
        panneau_info_joueurs.add(lbl_j1_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 47, -1, 30));

        lbl_j1_couleur.setText("couleurJoueur1");
        panneau_info_joueurs.add(lbl_j1_couleur, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 77, -1, 30));

        lbl_j1_desint.setText("nbdesintjoueur1");
        panneau_info_joueurs.add(lbl_j1_desint, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 107, -1, 30));

        jSeparator1.setForeground(new java.awt.Color(255, 153, 51));
        panneau_info_joueurs.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 220, 10));

        jLabel8.setText("Joueur 2:");
        panneau_info_joueurs.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, 30));

        jLabel9.setText("Couleur:");
        panneau_info_joueurs.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, 30));

        jLabel5.setText("Désintégrateur");
        panneau_info_joueurs.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, 30));

        lbl_j2_nom.setText("nomJoueur2");
        panneau_info_joueurs.add(lbl_j2_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, 30));

        lbl_j2_couleur.setText("couleurJoueur2");
        panneau_info_joueurs.add(lbl_j2_couleur, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, -1, 30));

        lbl_j2_desint.setText("nbdesintjoueur2");
        panneau_info_joueurs.add(lbl_j2_desint, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, 30));

        getContentPane().add(panneau_info_joueurs, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 170, 310, 250));

        panneau_info_partie.setBackground(new java.awt.Color(204, 204, 255));
        panneau_info_partie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel10.setText("Info jeu");
        panneau_info_partie.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel11.setText("Joueur courant");
        panneau_info_partie.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 100, 30));

        lbl_jcourant.setText("nomjoueur");
        panneau_info_partie.add(lbl_jcourant, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, -1, 30));

        messages.setColumns(20);
        messages.setRows(5);
        message.setViewportView(messages);

        panneau_info_partie.add(message, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 290, 60));

        getContentPane().add(panneau_info_partie, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 450, 310, 150));

        btn_col_0.setText("1");
        btn_col_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_0ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 96, -1));

        btn_col_1.setText("2");
        btn_col_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 10, 96, -1));

        btn_col_2.setText("3");
        btn_col_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 10, 96, -1));

        btn_col_3.setText("4");
        btn_col_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 10, 96, -1));

        btn_col_4.setText("5");
        btn_col_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 10, 96, -1));

        btn_col_5.setText("6");
        btn_col_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 96, -1));

        btn_col_6.setText("7");
        btn_col_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(606, 10, 96, -1));

        setBounds(0, 0, 1030, 693);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_col_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_0ActionPerformed
        // TODO add your handling code here:
        jouerDansColonne(0);
        if (grilleDeJeu.colonne_remplie(0) == true) {
            btn_col_0.setEnabled(false);
        }
        joueurSuivant();
    }//GEN-LAST:event_btn_col_0ActionPerformed

    private void btn_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_startActionPerformed
        // TODO add your handling code here:
        panneau_info_joueurs.setVisible(true);
        panneau_info_partie.setVisible(true);
        initialiserPartie();
        panneau_grille.repaint();
        btn_start.setEnabled(false);
    }//GEN-LAST:event_btn_startActionPerformed

    private void btn_col_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_1ActionPerformed
        // TODO add your handling code here:
        jouerDansColonne(1);
        if (grilleDeJeu.colonne_remplie(1) == true) {
            btn_col_1.setEnabled(false);
        }
        joueurSuivant();
    }//GEN-LAST:event_btn_col_1ActionPerformed

    private void btn_col_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_2ActionPerformed
        // TODO add your handling code here:

        jouerDansColonne(2);
        if (grilleDeJeu.colonne_remplie(2) == true) {
            btn_col_2.setEnabled(false);
        }
        joueurSuivant();
    }//GEN-LAST:event_btn_col_2ActionPerformed

    private void btn_col_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_3ActionPerformed
        // TODO add your handling code here:
        jouerDansColonne(3);
        if (grilleDeJeu.colonne_remplie(3) == true) {
            btn_col_3.setEnabled(false);
        }
        joueurSuivant();
    }//GEN-LAST:event_btn_col_3ActionPerformed

    private void btn_col_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_4ActionPerformed
        // TODO add your handling code here:
        jouerDansColonne(4);
        if (grilleDeJeu.colonne_remplie(4) == true) {
            btn_col_4.setEnabled(false);
        }
        joueurSuivant();
    }//GEN-LAST:event_btn_col_4ActionPerformed

    private void btn_col_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_5ActionPerformed
        // TODO add your handling code here:
        jouerDansColonne(5);
        if (grilleDeJeu.colonne_remplie(5) == true) {
            btn_col_5.setEnabled(false);
        }
        joueurSuivant();
    }//GEN-LAST:event_btn_col_5ActionPerformed

    private void btn_col_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_6ActionPerformed
        // TODO add your handling code here:
        jouerDansColonne(6);
        if (grilleDeJeu.colonne_remplie(6) == true) {
            btn_col_6.setEnabled(false);
        }
        joueurSuivant();
    }//GEN-LAST:event_btn_col_6ActionPerformed

    public boolean jouerDansColonne(int indice_colonne) {

        boolean resultatAction;

        resultatAction = grilleDeJeu.ajouterJetonDansColonne(JoueurCourant, indice_colonne);
        panneau_grille.repaint();

        lbl_j1_desint.setText(Listejoueurs[0].nombreDesintegrateurs + "");
        lbl_j2_desint.setText(Listejoueurs[1].nombreDesintegrateurs + "");

        boolean vict_j1 = grilleDeJeu.etreGagnantePourJoueur(Listejoueurs[0]);
        boolean vict_j2 = grilleDeJeu.etreGagnantePourJoueur(Listejoueurs[1]);

        if (vict_j1 && !vict_j2) {
            messages.setText("Victoire de " + Listejoueurs[0].Nom);
        }
        if (vict_j2 && !vict_j1) {
            messages.setText("Victoire de " + Listejoueurs[1].Nom);
        }

        if (vict_j2 && vict_j1) {
            if (JoueurCourant == Listejoueurs[0]) {
                messages.setText("Victoire de " + Listejoueurs[1].Nom);
            } else {
                messages.setText("Victoire de " + Listejoueurs[0].Nom + " Faute de jeu de l'autre joueur");
            }
        }

        if (resultatAction == true) {
            return true;
        } else {
            return false;
        }

    }

    public void joueurSuivant() {
        if (JoueurCourant == Listejoueurs[0]) {
            JoueurCourant = Listejoueurs[1];
        } else {
            JoueurCourant = Listejoueurs[0];
        }
        lbl_jcourant.setText(JoueurCourant.Nom);

    }

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
            java.util.logging.Logger.getLogger(fenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fenetreDeJeu().setVisible(true);
            }
        });
    }

    void initialiserPartie() {
        //Mise en place de la grille
        grilleDeJeu.viderGrille();

        //Création des joueurs
        String nomJoueur1 = nom_joueur1.getText();
        Joueur J1 = new Joueur(nomJoueur1);

        String nomJoueur2 = nom_joueur2.getText();
        Joueur J2 = new Joueur(nomJoueur2);

        Listejoueurs[0] = J1;
        Listejoueurs[1] = J2;

        attribuerCouleursAuxJoueurs();

        System.out.println(J1.Nom + " est de couleur " + J1.Couleur);
        System.out.println(J2.Nom + " est de couleur " + J2.Couleur);

        lbl_j1_nom.setText(nomJoueur1);
        lbl_j2_nom.setText(nomJoueur2);

        lbl_j1_couleur.setText(J1.Couleur);
        lbl_j2_couleur.setText(J2.Couleur);

        lbl_j1_desint.setText(J1.nombreDesintegrateurs + "");
        lbl_j2_desint.setText(J2.nombreDesintegrateurs + "");

        // On donne des jetons aux joueurs
        for (int i = 0; i < 21; i++) {

            Jeton J = new Jeton(Listejoueurs[0].Couleur);

            J1.ajouterJeton(J);

            J2.ajouterJeton(new Jeton(J2.Couleur));
        }

        // Determine qui est le premier joueur
        Random r = new Random();
        boolean le_premier = r.nextBoolean();
        if (le_premier) {
            JoueurCourant = Listejoueurs[0];
        } else {
            JoueurCourant = Listejoueurs[1];
        }
        lbl_jcourant.setText(JoueurCourant.Nom);

        // Génération des 5 trous noirs et de 2 désintégrateurs sur les trou noirs
        int compteur = 0;
        for (int i = 0; i < 5; i++) {
            int ligne_trou_noir = r.nextInt(6);
            int colonne_trou_noir = r.nextInt(7);
            if (compteur < 2) {
                if (!grilleDeJeu.placerDesintegrateur(ligne_trou_noir, colonne_trou_noir)) {
                    compteur--;
                }
                compteur = compteur + 1;
            }
            if (!grilleDeJeu.placerTrouNoir(ligne_trou_noir, colonne_trou_noir)) {
                i--;
            }
        }

        // On place les trois derniers désintégrateurs
        for (int i = 0; i < 3; i++) {
            int ligne_désin = r.nextInt(6);
            int colonne_désin = r.nextInt(7);
            if (!grilleDeJeu.placerDesintegrateur(ligne_désin, colonne_désin) || grilleDeJeu.Cellules[ligne_désin][colonne_désin].presenceTrouNoir()) {
                i--;
            }
        }

    }

    void attribuerCouleursAuxJoueurs() {
        Random r = new Random();
        boolean couleur;
        couleur = r.nextBoolean();
        if (couleur) {
            Listejoueurs[0].Couleur = "Rouge";
            Listejoueurs[1].Couleur = "Jaune";
        } else {
            Listejoueurs[0].Couleur = "Jaune";
            Listejoueurs[1].Couleur = "Rouge";
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_col_0;
    private javax.swing.JButton btn_col_1;
    private javax.swing.JButton btn_col_2;
    private javax.swing.JButton btn_col_3;
    private javax.swing.JButton btn_col_4;
    private javax.swing.JButton btn_col_5;
    private javax.swing.JButton btn_col_6;
    private javax.swing.JButton btn_start;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_j1_couleur;
    private javax.swing.JLabel lbl_j1_desint;
    private javax.swing.JLabel lbl_j1_nom;
    private javax.swing.JLabel lbl_j2_couleur;
    private javax.swing.JLabel lbl_j2_desint;
    private javax.swing.JLabel lbl_j2_nom;
    private javax.swing.JLabel lbl_jcourant;
    private javax.swing.JScrollPane message;
    private javax.swing.JTextArea messages;
    private javax.swing.JTextField nom_joueur1;
    private javax.swing.JTextField nom_joueur2;
    private javax.swing.JPanel panneau_creation_partie;
    private javax.swing.JPanel panneau_grille;
    private javax.swing.JPanel panneau_info_joueurs;
    private javax.swing.JPanel panneau_info_partie;
    // End of variables declaration//GEN-END:variables
}
