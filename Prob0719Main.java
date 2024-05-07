//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
//Name: Noah Bae
//Assignment: 19
//Date 4.6.22


package prob0719;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class Prob0719Main implements ActionListener {
    final JFrame mainWindowFrame = new JFrame("Problem 7.19");
    final JPanel inputPanel;
    final JTextArea textArea;
    final JPanel buttonPanel;
    final JButton button;

    public Prob0719Main() {
        this.mainWindowFrame.setDefaultCloseOperation(3);
        this.mainWindowFrame.setSize(new Dimension(240, 120));
        this.inputPanel = new JPanel();
        this.inputPanel.setLayout(new BoxLayout(this.inputPanel, 3));
        this.textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(this.textArea);
        scrollPane.setPreferredSize(new Dimension(250, 250));
        this.inputPanel.add(scrollPane);
        this.inputPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        this.buttonPanel = new JPanel();
        this.buttonPanel.setLayout(new BoxLayout(this.buttonPanel, 2));
        this.buttonPanel.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));
        this.buttonPanel.add(Box.createHorizontalGlue());
        this.button = new JButton("Translate");
        this.buttonPanel.add(this.button);
        this.buttonPanel.add(Box.createRigidArea(new Dimension(10, 0)));
        this.mainWindowFrame.add(this.inputPanel, "Center");
        this.mainWindowFrame.add(this.buttonPanel, "Last");
        this.button.addActionListener(this);
        this.mainWindowFrame.pack();
        this.mainWindowFrame.setVisible(true);
    }

    private static void createAndShowGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        new Prob0719Main();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Prob0719Main::createAndShowGUI);
    }

    public void actionPerformed(ActionEvent event) {
        InBuffer inBuffer = new InBuffer(this.textArea.getText());
        Translator tr = new Translator(inBuffer);
        tr.translate();
    }
}
