/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab7;

/**
 *
 * @author abaym
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RentalKendaraanApp extends JFrame {
    private JFrame frame1, frame2;
    private JButton motorButton, mobilButton;
    private JTextField namaField, teleponField, hariField;
    private JRadioButton[] kendaraanButtons;
    private ButtonGroup kendaraanGroup;
    private JButton selesaiButton;

    public RentalKendaraanApp() {
        // Frame 1: Pilihan Kendaraan
        frame1 = new JFrame("Pilihan Kendaraan");
        frame1.setLayout(new FlowLayout());
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        motorButton = new JButton("Motor");
        mobilButton = new JButton("Mobil");

        motorButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame1.setVisible(false);
                showFrame2("Motor");
            }
        });

        mobilButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame1.setVisible(false);
                showFrame2("Mobil");
            }
        });

        frame1.add(motorButton);
        frame1.add(mobilButton);

        frame1.setSize(300, 100);
        frame1.setVisible(true);

        // Frame 2: Detail Penyewaan
        frame2 = new JFrame("Detail Penyewaan");
        frame2.setLayout(new GridLayout(5, 2));
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel namaLabel = new JLabel("Nama Penyewa:");
        namaField = new JTextField(10);

        JLabel teleponLabel = new JLabel("Nomor Telepon:");
        teleponField = new JTextField(10);

        JLabel hariLabel = new JLabel("Jumlah Hari:");
        hariField = new JTextField(3);

        JLabel kendaraanLabel = new JLabel("Jenis Kendaraan:");

        String[] kendaraanOptions = {"Motor - Rp. 100.000/hari", "Mobil - Rp. 200.000/hari", "Truk - Rp. 300.000/hari"};
        kendaraanButtons = new JRadioButton[kendaraanOptions.length];
        kendaraanGroup = new ButtonGroup();
        for (int i = 0; i < kendaraanOptions.length; i++) {
            kendaraanButtons[i] = new JRadioButton(kendaraanOptions[i]);
            kendaraanGroup.add(kendaraanButtons[i]);
            frame2.add(kendaraanButtons[i]);
        }

        selesaiButton = new JButton("Selesai");
        selesaiButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame2.dispose();
            }
        });

        frame2.add(namaLabel);
        frame2.add(namaField);
        frame2.add(teleponLabel);
        frame2.add(teleponField);
        frame2.add(hariLabel);
        frame2.add(hariField);
        frame2.add(kendaraanLabel);
        frame2.add(new JLabel()); // Empty label for alignment
        frame2.add(new JLabel()); // Empty label for alignment
        frame2.add(selesaiButton);

        frame2.setSize(400, 200);
        frame2.setVisible(false);
    }

    private void showFrame2(String jenisKendaraan) {
        frame2.setTitle("Detail Penyewaan - " + jenisKendaraan);
        frame2.setVisible(true);
    }

    public static void main(String[] args) {
        new RentalKendaraanApp();
    }
}

