package scm;

import java.util.HashMap;

/**
 *
 * @author Alien
 */
public class Dado implements Arma
{

    private HashMap<Integer, Peleable> dado = new HashMap<>();

    public Dado()
    {
	this.dado = crearDado();
    }

    @Override
    public Integer usar()
    {
	int choice = (int) (Math.random() * 6) + 1;

	return dado.get(choice).atacar();
    }

    private static HashMap<Integer, Peleable> crearDado()
    {
	HashMap<Integer, Peleable> dice = new HashMap<>();

	dice.put(1, new Esbirro()
	{
	    @Override
	    public Integer atacar()
	    {
		return 0;
	    }
	});

	dice.put(2, new Esbirro()
	{
	    @Override
	    public Integer atacar()
	    {
		return 1;
	    }
	});

	dice.put(6, new Esbirro()
	{
	    @Override
	    public Integer atacar()
	    {
		return 30;
	    }
	});

	dice.put(3, new CardMaster());
	dice.put(4, new DarkWarrior());
	dice.put(5, new SupremeWizard());

	return dice;
    }

    @Override
    public String toString()
    {
	return "Dado místico";
    }

}
