package org.emp.gl.graphique;

import org.exmpl.watchviewerlookup.LookupWatch;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Map;

public class ButtonViewer extends javax . swing . JFrame {
    private WatchViewer w ;
    JComboBox<String> dropDownList=new JComboBox<>();
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


updateListe();
        // Ajoutez la liste déroulante au panneau
        getContentPane().add(dropDownList);
        dropDownList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // This method will be called when the selection in the JComboBox changes

                JComboBox<String> comboBox = (JComboBox<String>) e.getSource();
                String selectedOption = (String) comboBox.getSelectedItem();
                if(selectedOption != "ALL")
                   w=LookupWatch.getInstance().getWatch(selectedOption);
                else
                    defaultmod();
            }
        });
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
        setSize(500,200);
    }
    private javax . swing . JButton jButton1 ;
    private javax . swing . JButton jButton2 ;
    private javax . swing . JButton jButton3 ;
public void updateListe(){
    ArrayList<String> options=new ArrayList<>();
    Map<String,WatchViewer> watches=LookupWatch.getInstance().getWatches();
    for (String na :watches.keySet()) {
        options.add(na);
        //System.out.println(na);

    }
    options.add("ALL");
    dropDownList.setModel(new DefaultComboBoxModel<>(options.toArray(new String[0])));


}
void  defaultmod(){
    Map<String,WatchViewer> watches=LookupWatch.getInstance().getWatches();
    for (String na :watches.keySet()) {
        watches.get(na).state=new HhMn(watches.get(na).state.context);
        //System.out.println(na);


    }


}
}
