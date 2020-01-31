import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
class Puzzle implements ActionListener
{
	JFrame fr;
	JPanel pa,pa1,pa2;
	JButton b1,b2,b3,b4,b5;
	JButton btn[] = new JButton[9];
	GridLayout g1,g2;
	Random rand;
	Icon ic1,ic2,ic3,ic4,ic5,ic6,ic7,ic8,ic9;
	int c=0;
	Font fo;
	int[] array=new int[20];
	public Puzzle()
	{
		fr = new JFrame("PUZZLE BLASTER");
		pa = new JPanel();
		pa1 = new JPanel();
		pa2 = new JPanel();
		rand = new Random();
		fr.setSize(938,700);	
		fr.getContentPane().add(pa);fr.getContentPane().add(pa1);fr.getContentPane().add(pa2);
		pa.setBounds(0,0,469,469);
		pa1.setBounds(469,0,469,469);
		pa2.setBounds(0,469,938,131);
		fo = new Font("Forte",Font.BOLD,48);
		
		
		ic9 =new ImageIcon("square.jpg");
		ic1 = new ImageIcon("1.jpg");
		ic2 = new ImageIcon("2.jpg");
		ic3 = new ImageIcon("3.jpg");
		ic4 = new ImageIcon("4.jpg");
		ic5 = new ImageIcon("5.jpg");
		ic6 = new ImageIcon("6.jpg");
		ic7 = new ImageIcon("7.jpg");
		ic8 = new ImageIcon("8.jpg");
		g1 = new GridLayout(3,3);
		g2 = new GridLayout(1,1);

		pa.setLayout(g1);
		pa1.setLayout(g2);
		pa2.setLayout(null);
		b1 =new JButton("RESET");
		b1.setBounds(225,490,100,50);
		b2 = new JButton(ic9);
		b3 = new JButton("ORIGINAL PICTURE");
		b3.setBounds(750,490,150,50);
		b4 = new JButton("STEP NUM "+c);
		b4.setBounds(20,490,150,50);
		b5 = new JButton("Puzzle Game");
		b5.setFont(fo);
		b5.setBackground(Color.red);
		b5.setForeground(Color.white);
		b5.setBounds(100,570,738,80);
		b1.setBackground(Color.white);
		b3.setBackground(Color.white);
		b4.setBackground(Color.white);
		pa2.add(b1);
		pa2.add(b5);
		pa2.add(b3);
		pa1.add(b2);
		pa2.add(b4);
		b1.addActionListener(this);
		for(int i=0;i<9;i++)
		{
			btn[i]=new JButton();
			btn[i].addActionListener(this);
		}
		for(int i=0;i<8;i++)
		{
			int rand1=rand.nextInt(8);
			Icon a[]={ic1,ic2,ic3,ic4,ic5,ic6,ic7,ic8};
			if(i==0)
			{
				array[i]=rand1;
				btn[i].setIcon(a[rand1]);

			}
			else{
				for(int j=0;j<i;j++)
				{
					if(array[j]==rand1)
					{
						i--;
						break;
					}
					else
					{
						array[i]=rand1;
						btn[i].setIcon(a[rand1]);
					}
				}
			}
			
		}
		
		btn[7].addActionListener(this);
		btn[8].addActionListener(this);
		pa.add(btn[0]);pa.add(btn[1]);pa.add(btn[2]);pa.add(btn[3]);
		pa.add(btn[4]);pa.add(btn[5]);pa.add(btn[6]);pa.add(btn[7]);pa.add(btn[8]);
		
		fr.setVisible(true);
		fr.setDefaultCloseOperation(2);
	}
	public void actionPerformed(ActionEvent evt)
	{
		if(evt.getSource()!=b1)
		c++;
		if(evt.getSource()==btn[0])
		{
			if(btn[1].getIcon()==null)
			{
				btn[1].setIcon(btn[0].getIcon());
				btn[0].setIcon(null);
			}
			if(btn[3].getIcon()==null)
			{
				btn[3].setIcon(btn[0].getIcon());
				btn[0].setIcon(null);
			}

		}
		if(evt.getSource()==btn[1])
		{
			if(btn[0].getIcon()==null)
			{
				btn[0].setIcon(btn[1].getIcon());
				btn[1].setIcon(null);
			}
			if(btn[2].getIcon()==null)
			{
				btn[2].setIcon(btn[1].getIcon());
				btn[1].setIcon(null);
			}
			if(btn[4].getIcon()==null)
			{
				btn[4].setIcon(btn[1].getIcon());
				btn[1].setIcon(null);
			}

		}
		if(evt.getSource()==btn[3])
		{
			if(btn[0].getIcon()==null)
			{
				btn[0].setIcon(btn[3].getIcon());
				btn[3].setIcon(null);
			}
			if(btn[4].getIcon()==null)
			{
				btn[4].setIcon(btn[3].getIcon());
				btn[3].setIcon(null);
			}
			if(btn[6].getIcon()==null)
			{
				btn[6].setIcon(btn[3].getIcon());
				btn[3].setIcon(null);
			}

		}
		if(evt.getSource()==btn[5])
		{
			if(btn[2].getIcon()==null)
			{
				btn[2].setIcon(btn[5].getIcon());
				btn[5].setIcon(null);
			}
			if(btn[4].getIcon()==null)
			{
				btn[4].setIcon(btn[5].getIcon());
				btn[5].setIcon(null);
			}
			if(btn[8].getIcon()==null)
			{
				btn[8].setIcon(btn[5].getIcon());
				btn[5].setIcon(null);
			}

		}
		if(evt.getSource()==btn[7])
		{
			if(btn[6].getIcon()==null)
			{
				btn[6].setIcon(btn[7].getIcon());
				btn[7].setIcon(null);
			}
			if(btn[8].getIcon()==null)
			{
				btn[8].setIcon(btn[7].getIcon());
				btn[7].setIcon(null);
			}
			if(btn[4].getIcon()==null)
			{
				btn[4].setIcon(btn[7].getIcon());
				btn[7].setIcon(null);
			}

		}
		if(evt.getSource()==btn[4])
		{
			if(btn[1].getIcon()==null)
			{
				btn[1].setIcon(btn[4].getIcon());
				btn[4].setIcon(null);
			}
			if(btn[3].getIcon()==null)
			{
				btn[3].setIcon(btn[4].getIcon());
				btn[4].setIcon(null);
			}
			if(btn[5].getIcon()==null)
			{
				btn[5].setIcon(btn[4].getIcon());
				btn[4].setIcon(null);
			}
			if(btn[7].getIcon()==null)
			{
				btn[7].setIcon(btn[4].getIcon());
				btn[4].setIcon(null);
			}



		}
		if(evt.getSource()==btn[2])
		{
			if(btn[1].getIcon()==null)
			{
				btn[1].setIcon(btn[2].getIcon());
				btn[2].setIcon(null);
			}
			if(btn[5].getIcon()==null)
			{
				btn[5].setIcon(btn[2].getIcon());
				btn[2].setIcon(null);
			}
		}
		if(evt.getSource()==btn[6])
		{
			if(btn[3].getIcon()==null)
			{
				btn[3].setIcon(btn[6].getIcon());
				btn[6].setIcon(null);
			}
			if(btn[7].getIcon()==null)
			{
				btn[7].setIcon(btn[6].getIcon());
				btn[6].setIcon(null);
			}
		}

		if(evt.getSource()==btn[8])
		{
			if(btn[7].getIcon()==null)
			{
				btn[7].setIcon(btn[8].getIcon());
				btn[8].setIcon(null);
			}
			if(btn[5].getIcon()==null)
			{
				btn[5].setIcon(btn[8].getIcon());
				btn[8].setIcon(null);
			}
		}
		if(evt.getSource()==b1)
		{
			c=0;
			btn[0].setIcon(ic3);
			btn[1].setIcon(ic6);
			btn[2].setIcon(ic1);
			btn[3].setIcon(ic4);
			btn[4].setIcon(ic7);
			btn[5].setIcon(ic5);
			btn[6].setIcon(ic2);
			btn[7].setIcon(null);
			btn[8].setIcon(ic8);
		}
		if(btn[0].getIcon()==ic1 && btn[1].getIcon()==ic2 && btn[2].getIcon()==ic3 && btn[3].getIcon()==ic4 && btn[4].getIcon()==ic5 && btn[5].getIcon()==ic6 && btn[6].getIcon()==ic7 && btn[7].getIcon()==ic8)
		{
			JOptionPane.showMessageDialog(fr,"YOU WON","CONGRATULATION",2);
		}
		if(c==65)
		{
			JOptionPane.showMessageDialog(fr,"GAME OVER","OOPS",2);
		}
		b4.setText("STEP NUM "+c);



	}
	public static void main(String aa[])
	{
		try
		{
			new Puzzle();
		}
		catch(NullPointerException e)
		{
			System.out.println(0);
		}
	}
}
		
