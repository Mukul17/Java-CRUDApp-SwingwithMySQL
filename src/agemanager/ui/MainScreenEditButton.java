package agemanager.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

import agemanager.domain.UpdateFrame;

public class MainScreenEditButton extends MainScreenReadButton {

	protected static void ediButtonClicked(JLabel firstNameLabel, JLabel lastNameLabel, JLabel ageLabel, JButton Button2, JButton Button3) {
		Button2.addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent e) {
	
				UpdateFrame.main(null);
	
			}
	
		});
	}

	public MainScreenEditButton() {
		super();
	}

}