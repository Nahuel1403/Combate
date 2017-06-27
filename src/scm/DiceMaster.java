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
public class DiceMaster extends Personaje
{

    public DiceMaster()
    {
	super(100, 40, 2, new Dado());
    }

    @Override
    public String toString()
    {
	return "El pibe del dado";
    }
    
}
