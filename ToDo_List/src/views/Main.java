package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import model.Task;


import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JSeparator separator;
    private JLabel titleLabel;
    private JPanel contentArea;
    private List<Task> tasks = new ArrayList<>();
    private JScrollPane scrollPane;
    private JCheckBox chckbxNewCheckBox;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Main frame = new Main();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Main() {
        setBackground(new Color(240, 240, 240));
        setForeground(new Color(46, 46, 46));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1002, 700);
        setLocationRelativeTo(null);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(46, 46, 46));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        titleLabel = new JLabel("");
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setBounds(306, 27, 375, 56);
        ImageIcon icon = new ImageIcon(getClass().getResource("/To - Do List.png"));
        Image img = icon.getImage().getScaledInstance(375, 56, Image.SCALE_SMOOTH);
        titleLabel.setIcon(new ImageIcon(img));
        contentPane.add(titleLabel);

        separator = new JSeparator();
        separator.setForeground(null);
        separator.setBorder(null);
        separator.setBounds(55, 93, 878, 2);
        contentPane.add(separator);

        contentArea = new JPanel();
        contentArea.setBackground(new Color(68, 68, 68));
        contentArea.setBounds(68, 118, 852, 499);
        contentPane.add(contentArea);
        contentArea.setLayout(null);

        
    }
}



