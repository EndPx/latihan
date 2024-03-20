package bab7;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abaym
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class RadioHandling extends JFrame
                    implements ItemListener{
   private JTextField teks;
   private JPanel panel;
   private JRadioButton rbtn1;
   private JRadioButton rbtn2;
   private JRadioButton rbtn3;

   public RadioHandling(){
   	setTitle("Coba RadioButton Handling");
	teks = new JTextField("Jenis Kelamin : PILIHAN ");
	teks.setHorizontalAlignment(SwingConstants.CENTER);
	panel = new JPanel(new FlowLayout());
	rbtn1 = new JRadioButton("Pria");
	rbtn2 = new JRadioButton("Wanita");
	rbtn3 = new JRadioButton("??");

//membuat group radiobutton supaya satu aja yang terpilih
	ButtonGroup group = new ButtonGroup();
	group.add(rbtn1);
	group.add(rbtn2);
	group.add(rbtn3);
	rbtn1.addItemListener(this);
	rbtn2.addItemListener(this);
	rbtn3.addItemListener(this);

	setLayout(new BorderLayout());
	add(teks,"North");
	add(panel,"West");
	panel.add(rbtn1);
	panel.add(rbtn2);
	panel.add(rbtn3);

	pack();
	setVisible(true);
	setLocation(200,200);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
   }

   public void itemStateChanged(ItemEvent event) {
	if(event.getSource()==rbtn1){
		if(event.getStateChange()==ItemEvent.SELECTED)
			teks.setText("Jenis Kelamin : Pria");
		}
	if(event.getSource()==rbtn2){
		if(event.getStateChange()==ItemEvent.SELECTED)
			teks.setText("Jenis Kelamin : Wanita");
	}
	if(event.getSource()==rbtn3){
 		if(event.getStateChange()==ItemEvent.SELECTED)
			teks.setText("Jenis Kelamin : ??");
	}
   }
}

public class EventRadio{
	public static void main (String[] args){
		new RadioHandling();
	}
}


