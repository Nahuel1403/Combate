/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scm;

/**
 *
 * @author Alien
 */
public class CardMaster extends Personaje
{

    public CardMaster()
    {
	super(100, 60, 15, new Baraja());
    }

    @Override
    public String toString()
    {
	return "Cartero";
    }
}
