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
public abstract class Esbirro implements Peleable
{

    @Override
    public void defender(Integer daño)
    {
	System.out.println("Esbirro no recibe daño");
    }
    
}
