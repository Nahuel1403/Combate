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
public class SupremeWizard extends Personaje
{

    public SupremeWizard()
    {
	super(100, 100, 1, new BaculoInvocador());
    }

    @Override
    public String toString()
    {
	 return "Mago a todo gas";
    }
    
    
    
}
