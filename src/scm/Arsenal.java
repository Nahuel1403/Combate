/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scm;

import java.util.ArrayList;

/**
 *
 * @author Alien
 */
public class Arsenal implements Arma
{

    private ArrayList<Arma> armas;

    public Arsenal()
    {
	armas = crearArmas();
    }

    @Override
    public Integer usar()
    {
	int choice = (int) (Math.random() * 4);
	return (armas.get(choice).usar());
    }

    private static ArrayList<Arma> crearArmas()
    {
	ArrayList<Arma> weapons = new ArrayList<>();

	weapons.add(crearShuriken());
	weapons.add(crearCuchillo());
	weapons.add(crearEspada());
	weapons.add(crearHacha());

	return weapons;
    }

    private static Arma crearEspada()
    {
	return new Arma()
	{
	    @Override
	    public Integer usar()
	    {
		return 15;
	    }
	};
    }

    private static Arma crearHacha()
    {
	return new Arma()
	{
	    @Override
	    public Integer usar()
	    {
		return 30;
	    }
	};
    }

    private static Arma crearCuchillo()
    {
	return new Arma()
	{
	    @Override
	    public Integer usar()
	    {
		return 5;
	    }
	};
    }

    private static Arma crearShuriken()
    {
	return new Arma()
	{
	    @Override
	    public Integer usar()
	    {
		return 7;
	    }
	};
    }

    @Override
    public String toString()
    {
	return "Arsenal de armas";
    }
    
    
    
}
