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
public abstract class Personaje implements Peleable, JSON
{

    private Integer healt;
    private Integer armor;
    private Integer damage;
    private Arma weapon;

    public Personaje(Integer healt, Integer armor, Integer daño, Arma weapon)
    {
	this.healt = healt;
	this.armor = armor;
	this.damage = daño;
	this.weapon = weapon;
    }

    @Override
    public Integer atacar()
    {
	return this.damage * this.weapon.usar();
    }

    @Override
    public void defender(Integer daño)
    {
	int dañoRestante = daño - armor;
	this.healt = dañoRestante<=0 ? this.healt : this.healt - dañoRestante;
    }

    public boolean isDeath()
    {
	return this.healt <= 0;
    }

    @Override
    public String toJson()
    {
	String retorno = String.format("{\"salud\":%s,\"armor\":%s,\"daño\":%s,\"Arma\":\"%s\"}",
		this.healt, this.armor, this.damage, this.weapon.toString());

	return retorno;
    }

}
