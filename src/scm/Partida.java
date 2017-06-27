/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scm;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Alien
 */
public class Partida
{

    private ArrayList<Personaje> luchadores;

    private Personaje ganador;

    public Partida()
    {
	luchadores = new ArrayList<>();
	luchadores.add(new DarkWarrior());
	luchadores.add(new SupremeWizard());
	luchadores.add(new DiceMaster());
	luchadores.add(new CardMaster());
    }

    public void simularTorneo()
    {
	Collections.shuffle(luchadores);

	Personaje ganador1 = batalla(luchadores.get(0), luchadores.get(1));
	Personaje ganador2 = batalla(luchadores.get(2), luchadores.get(3));

	this.ganador = batalla(ganador1, ganador2);

    }

    private Personaje batalla(Personaje a, Personaje b)
    {
	Personaje winner;

	while (!a.isDeath() && !b.isDeath())
	{
	    b.defender(a.atacar());
	    a.defender(b.atacar());

//	    int ataque = a.atacar();
//
//	    System.out.println("Luchador: " + a + "Poder de ataque: " + ataque);
//	    b.defender(ataque);
//
//	    ataque = b.atacar();
//	    System.out.println("Luchador: " + b + "Poder de ataque: " + ataque);
//	    a.defender(ataque);
//	    
//	    

	}

	winner = a.isDeath() ? b : a;

	return winner;
    }

    public void imprimirResultado()
    {
	System.out.println("El ganador es: " + this.ganador);
    }
    
    public Personaje getGanador()
    {
	return this.ganador;
    }
    
}
