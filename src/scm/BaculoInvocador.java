/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scm;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * @author Alien
 */
public class BaculoInvocador implements Arma
{

    private Deque<Esbirro> esbirros;

    public BaculoInvocador()
    {
	esbirros = crearEsbirros();
    }

    @Override
    public Integer usar()
    {
	int daño = this.esbirros.getFirst().atacar();

	esbirros.addLast(esbirros.pollFirst());

	return daño;
    }

    private static Deque<Esbirro> crearEsbirros()
    {
	Deque<Esbirro> esb = new ArrayDeque<>();

	esb.add(crearEsbirro1());
	esb.add(crearEsbirro2());
	esb.add(crearEsbirro3());

	return esb;
    }

    private static Esbirro crearEsbirro1()
    {
	return new Esbirro()
	{
	    @Override
	    public Integer atacar()
	    {
		return 120;
	    }
	};
    }

    private static Esbirro crearEsbirro2()
    {
	return new Esbirro()
	{
	    @Override
	    public Integer atacar()
	    {
		return 75;
	    }
	};
    }

    private static Esbirro crearEsbirro3()
    {
	return new Esbirro()
	{
	    @Override
	    public Integer atacar()
	    {
		return 25;
	    }
	};
    }

    @Override
    public String toString()
    {
	return "Báculo invocador";
    }

}
