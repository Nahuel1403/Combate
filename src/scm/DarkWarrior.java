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
public class DarkWarrior extends Personaje
{

    public DarkWarrior()
    {
	super(100, 80, 5, new Arsenal());
    }

    @Override
    public String toString()
    {
	return "Guerrero wacho obscuro";
    }
}
