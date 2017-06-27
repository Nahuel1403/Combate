/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scm;

import java.util.Stack;

/**
 *
 * @author Alien
 */
public class Baraja implements Arma
{

    private Stack<Integer> baraja;

    public Baraja()
    {
	this.baraja = generarBaraja();
    }

    private static Stack<Integer> generarBaraja()
    {
	Stack<Integer> deck = new Stack<>();

	int carta;

	for (int i = 0; i < 50; i++)
	{
	    carta = (int) (Math.random() * (13 - 1) + 1);
	    deck.add(carta);
	}

	return deck;
    }

    @Override
    public Integer usar()
    {
	if (baraja.isEmpty())
	{
	    this.baraja = generarBaraja();
	}

	return baraja.pop();

    }

    @Override
    public String toString()
    {
	return "Baraja de cartas";
    }

}
