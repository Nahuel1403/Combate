/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scm;

import static java.lang.System.gc;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Alien
 */
public class SCM
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
	
	Partida nueva=new Partida();
	
	nueva.simularTorneo();
	
	
	JFrame j=new JFrame("SCM");
	j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	j.setVisible(true);
	j.setBounds(500,200,300,200);
//	JOptionPane.showMessageDialog(j,
//			"El ganador es " + nueva.getGanador(),
//			"Simulador de Combate Mágico",
//			JOptionPane.INFORMATION_MESSAGE);
//	
//	j.dispose();
	
	JLabel x=new JLabel("El ganador es: \""+nueva.getGanador().toString()+ "\"");
	j.add(x);
	

	int dw = 0;
	int cm = 0;
	int dm = 0;
int sw = 0;

	for (int i = 0; i < 10000; i++)
	{

	    Partida uno = new Partida();

	    uno.simularTorneo();

	    if (uno.getGanador() instanceof DarkWarrior)
	    {
		dw++;
	    } else if (uno.getGanador() instanceof CardMaster)
	    {
		cm++;
	    } else if (uno.getGanador() instanceof DiceMaster)
	    {
		dm++;
	    } else if (uno.getGanador() instanceof SupremeWizard)
	    {
		sw++;
	    }
	}

	System.out.println("DW: " + dw +"CM: " + cm + "DM: "+ dm +"SW: " + sw);
	
	
	
    }

}
