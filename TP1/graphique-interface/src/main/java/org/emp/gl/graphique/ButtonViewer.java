package org.emp.gl.graphique;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonViewer extends javax . swing . JFrame {
    private WatchViewer w ;
    public ButtonViewer ( WatchViewer w) {
        this . w = w ;
        initComponents () ;


    }
    @SuppressWarnings (" unchecked ")
    private void initComponents () {
        setLocation (200 , 200) ;
        setVisible ( true );
        java . awt . GridBagConstraints gridBagConstraints ;
        jButton1 = new javax . swing . JButton () ;
        jButton2 = new javax . swing . JButton () ;
        jButton3 = new javax . swing . JButton () ;
        setDefaultCloseOperation ( javax . swing . WindowConstants . EXIT_ON_CLOSE );
        getContentPane () . setLayout ( new java . awt . GridBagLayout () ) ;
        jButton1 . setText (" Set ") ;
        jButton1 . setFont ( new java . awt . Font (" Consolas ", 1, 32) ); // NOI18N
        gridBagConstraints = new java . awt . GridBagConstraints () ;
        gridBagConstraints . insets = new java . awt . Insets (21 , 2, 21 , 2) ;
        getContentPane () . add ( jButton1 , gridBagConstraints );
        jButton2 . setText (" Mode ");
        jButton2 . setFont ( new java . awt . Font (" Consolas ", 1, 32) ); // NOI18N
        gridBagConstraints = new java . awt . GridBagConstraints () ;
        gridBagConstraints . gridx = 1;
        gridBagConstraints . gridy = 0;
        gridBagConstraints . insets = new java . awt . Insets (21 , 2, 21 , 2) ;
        getContentPane () . add ( jButton2 , gridBagConstraints );
        jButton3 . setText (" Setting ") ;
        jButton3 . setFont ( new java . awt . Font (" Consolas ", 1, 32) ); // NOI18N
        gridBagConstraints = new java . awt . GridBagConstraints () ;
        gridBagConstraints . insets = new java . awt . Insets (21 , 2, 21 , 2) ;
        getContentPane () . add ( jButton3 , gridBagConstraints );
        pack () ;
        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code to be executed when the button is clicked
               w.doSet();
            }
        });
        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code to be executed when the button is clicked
                w.doMode();
            }
        });
        jButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code to be executed when the button is clicked
                w.doSetting();
            }
        });

    }
    private javax . swing . JButton jButton1 ;
    private javax . swing . JButton jButton2 ;
    private javax . swing . JButton jButton3 ;

}
