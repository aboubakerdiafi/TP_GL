package org.emp.gl.graphique;

import org.emp.gl.clients.Chronometre;
import org.emp.gl.clients.Horloge;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class WatchViewer extends javax . swing . JFrame {
    static int COUNT = 0 ;
    public WindowState state;
    public boolean etatClignotant=true;
    Horloge h = new Horloge( getName () ) ;
    Chronometre c=new Chronometre(getName());

    public Chronometre getC() {
        return c;
    }

    private javax . swing . JLabel hh = new javax . swing . JLabel () ;
    private javax . swing . JLabel mm = new javax . swing . JLabel () ;
    private javax . swing . JLabel ss = new javax . swing . JLabel () ;
    private javax . swing . JLabel sep = new javax . swing . JLabel () ;
    private javax . swing . JLabel sep2 = new javax . swing . JLabel () ;
    private javax . swing . JLabel mod = new javax . swing . JLabel () ;
    Timer timerMode;

    public WatchViewer (  ) {
        this.state = new HhMn(this);


        initComponents () ;

      timerMode = new Timer(500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etatClignotant=! etatClignotant;
                state.display();

            }
        });
      timerMode.start();

    }
    @SuppressWarnings (" unchecked ")
    private void initComponents () {
        setLocation (200 + COUNT ++ * 300 , 400 ) ;
        setVisible ( true );
        java . awt . GridBagConstraints gridBagConstraints ;
        setDefaultCloseOperation ( javax . swing . WindowConstants . EXIT_ON_CLOSE );
        getContentPane () . setLayout ( new java . awt . GridBagLayout () ) ;
        hh . setFont ( new java . awt . Font (" Consolas ", 1, 48) ) ; // NOI18N
        hh . setText ("HH");
        getContentPane () . add (hh , new java . awt . GridBagConstraints () ) ;
        sep . setFont ( new java . awt . Font (" Consolas ", 1, 48) ); // NOI18N
        sep . setText (":");
        gridBagConstraints = new java . awt . GridBagConstraints () ;
        gridBagConstraints . anchor = java . awt . GridBagConstraints . LINE_START ;
        gridBagConstraints . insets = new java . awt . Insets (14 , 14 , 14 , 14) ;
        getContentPane () . add ( sep , gridBagConstraints );
        mm . setFont ( new java . awt . Font (" Consolas ", 1, 48) ) ; // NOI18N
        mm . setText ("mm");
        getContentPane () . add (mm , new java . awt . GridBagConstraints () ) ;
        sep2 . setFont ( new java . awt . Font (" Consolas ", 1, 48) ); // NOI18N
        sep2 . setText (":");
        gridBagConstraints = new java . awt . GridBagConstraints () ;
        gridBagConstraints . anchor = java . awt . GridBagConstraints . LINE_START ;
        gridBagConstraints . insets = new java . awt . Insets (14 , 14 , 14 , 14) ;
        getContentPane () . add ( sep2 , gridBagConstraints );
        ss. setFont ( new java . awt . Font (" Consolas ", 1, 48) ) ; // NOI18N
        ss . setText ("ss");
        getContentPane () . add (ss , new java . awt . GridBagConstraints () ) ;
        mod . setFont ( new java . awt . Font (" Consolas ", 1, 24) ); // NOI18N
        mod . setText ("M");
        getContentPane () . add ( mod , new java . awt . GridBagConstraints () );
        pack () ;
    }
    public Horloge getHorloge () { return h ; }
    public void doSet () {
        System . out . println (" SET ") ;

// TODO

        this.state.doSet();


    }

    public void doSetting () {
        System . out . println (" SETTING ") ;
        // TODO our propsition
    this.state.doSetting();
    }
    public void doMode () {
        System . out . println (" MODE ");
        this.state.doMod();
// TODO
    }
    public void ticHappened () {
        System . out . println ("TIC - HAPPENED ");
// TODO
    }
    public String clignotent () {
        if(this.etatClignotant)
            return ":";
        return " ";
    }
    public void setTextPosition1 ( String txt ) {
        hh . setText ( txt ) ;
    }
    public void setTextPosition2 ( String txt ) {
        mm . setText ( txt ) ;
    }
    public void setTextPosition4 ( String txt ) {
        ss . setText ( txt ) ;
    }
    public void setTextSeparator ( String txt ) {
        sep . setText ( txt );
    }
    public void setTextPosition3 ( String txt ) {
        mod . setText ( txt );
    }
    public void setTextSeparator2 ( String txt ) {
        sep2 . setText ( txt );
    }
    void changeState(){
        this.state.changeState();
    }
}