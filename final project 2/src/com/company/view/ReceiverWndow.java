/*
 * Created by JFormDesigner on Thu Jan 30 01:18:43 IRST 2020
 */

package com.company.view;

import com.company.controller.ProductController;
import com.company.controller.SRController;
import com.company.controller.SRException;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author sara
 */
public class ReceiverWndow extends JFrame {
    public ReceiverWndow() {
        initComponents();
        setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void button1MouseClicked(MouseEvent e) {
        int state = 0;
        try {
            SRController.getInstance().adding(snamefield.getText(),Long.parseLong(sdatefield.getText()),Long.parseLong(stimefield.getText()));
        } catch (SRException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", 0);
            state++;
        } catch (Exception e1) {
            e1.printStackTrace();
        }
        SRController srController=new SRController();


        System.out.println("done");
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        sdatefield = new JTextField();
        label1 = new JLabel();
        label2 = new JLabel();
        stimefield = new JTextField();
        textField3 = new JTextField();
        label3 = new JLabel();
        button1 = new JButton();
        label4 = new JLabel();
        snamefield = new JTextField();
        label5 = new JLabel();

        //======== this ========
        Container contentPane = getContentPane();

        //---- label1 ----
        label1.setText("Sending date");

        //---- label2 ----
        label2.setText("Sending time");

        //---- label3 ----
        label3.setText(":");

        //---- button1 ----
        button1.setText("ok");
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button1MouseClicked(e);
            }
        });

        //---- label5 ----
        label5.setText("Sender name");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(329, Short.MAX_VALUE)
                    .addComponent(button1)
                    .addGap(26, 26, 26))
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(86, 86, 86)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(label2)
                            .addGap(18, 18, 18)
                            .addComponent(stimefield, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(label3)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(textField3, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(label4, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(label1, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(label5))
                            .addGap(18, 18, 18)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(sdatefield, GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                                .addComponent(snamefield, GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))))
                    .addContainerGap(136, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label4)
                        .addComponent(snamefield, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label5))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label1)
                        .addComponent(sdatefield, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label2)
                        .addComponent(label3)
                        .addComponent(stimefield, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(textField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                    .addComponent(button1)
                    .addGap(21, 21, 21))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JTextField sdatefield;
    private JLabel label1;
    private JLabel label2;
    private JTextField stimefield;
    private JTextField textField3;
    private JLabel label3;
    private JButton button1;
    private JLabel label4;
    private JTextField snamefield;
    private JLabel label5;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
