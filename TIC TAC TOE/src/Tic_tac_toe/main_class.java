package Tic_tac_toe;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main_class extends JFrame implements ActionListener {
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
	boolean player1turn=true;
	JButton Winning_zone[][];
	
	
	main_class(){
		super("TIC TAC TOE GAME");
		
		b1=new JButton();
		b1.setBounds(200,200,70,70);
		b1.setBackground(Color.WHITE);
		b1.setForeground(Color.BLACK);
		b1.setFont(new Font("Raleway", Font.BOLD,22));
		b1.addActionListener(this);
		add(b1);
		
		
		b2=new JButton();
		b2.setBounds(300,200,70,70);
		b2.setBackground(Color.WHITE);
		b2.setForeground(Color.BLACK);
		b2.setFont(new Font("Raleway", Font.BOLD,22));
		b2.addActionListener(this);
		add(b2);
		
		
		b3=new JButton();
		b3.setBounds(400,200,70,70);
		b3.setBackground(Color.WHITE);
		b3.setForeground(Color.BLACK);
		b3.setFont(new Font("Raleway", Font.BOLD,22));
		b3.addActionListener(this);
		add(b3);
		
		
		b4=new JButton();
		b4.setBounds(200,300,70,70);
		b4.setBackground(Color.WHITE);
		b4.setForeground(Color.BLACK);
		b4.setFont(new Font("Raleway", Font.BOLD,22));
		b4.addActionListener(this);
		add(b4);
		
		
		
		b5=new JButton();
		b5.setBounds(300,300,70,70);
		b5.setBackground(Color.WHITE);
		b5.setForeground(Color.BLACK);
		b5.setFont(new Font("Raleway", Font.BOLD,22));
		b5.addActionListener(this);
		add(b5);
		
		
		b6=new JButton();
		b6.setBounds(400,300,70,70);
		b6.setBackground(Color.WHITE);
		b6.setForeground(Color.BLACK);
		b6.setFont(new Font("Raleway", Font.BOLD,22));
		b6.addActionListener(this);
		add(b6);
		
		b7=new JButton();
		b7.setBounds(200,400,70,70);
		b7.setBackground(Color.WHITE);
		b7.setForeground(Color.BLACK);
		b7.setFont(new Font("Raleway", Font.BOLD,22));
		b7.addActionListener(this);
		add(b7);
		
		
		b8=new JButton();
		b8.setBounds(300,400,70,70);
		b8.setBackground(Color.WHITE);
		b8.setForeground(Color.BLACK);
		b8.setFont(new Font("Raleway", Font.BOLD,22));
		b8.addActionListener(this);
		add(b8);
		
		
		b9=new JButton();
		b9.setBounds(400,400,70,70);
		b9.setBackground(Color.WHITE);
		b9.setForeground(Color.BLACK);
		b9.setFont(new Font("Raleway", Font.BOLD,22));
		b9.addActionListener(this);
		add(b9);
		
		
		
		
		Winning_zone=new JButton[][] {
			{b1,b2,b3},
			{b4,b5,b6},
			{b7,b8,b9},
			{b1,b4,b7},
			{b2,b5,b8},
			{b3,b6,b9},
			{b1,b5,b9},
			{b3,b5,b7},
	};
		
		
		
		setLayout(null);
		setSize(850,850);
		setLocation(0,0);
		setVisible(true);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e1) {
		JButton arr1[]= {b1,b2,b3,b4,b5,b6,b7,b8,b9};

		for(JButton i:arr1)
		{	
			if (e1.getSource()==i)
			{
				if(i.getText().equals(""))
				{
					if(player1turn)
					{
					i.setText("X");
					
					}else
					{
						i.setText("O");
					}
					player1turn = !player1turn;
					checkwinner();
					
				}
			}
		}
	}
		
	
	public void checkwinner() {
			for(JButton[] jx:Winning_zone)
			{
				String s1=jx[0].getText();
				String s2=jx[1].getText();
				String s3=jx[2].getText();
				if(!s1.equals("") && !s2.equals("") && !s3.equals(""))
				{
					if(s1==s2 && s2==s3) {
						if(s1.equals("X"))
						{
							JOptionPane.showMessageDialog(null,"The player X won the match .");
							RefreshPage();
						}
						else
						{
							JOptionPane.showMessageDialog(null,"The player O won the match .");
							RefreshPage();
						}
					}
				}
			}
		}
		
	public void RefreshPage() {
		JButton arr2[]= {b1,b2,b3,b4,b5,b6,b7,b8,b9};
		for(JButton ix:arr2)
		{
			ix.setText("");
		}
	}

	public static void main(String[] args) {
		new main_class();
	}

}
