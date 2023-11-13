package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

//	Properties
	private String nome;
	private int codice;
	private float prezzo;
	private String descrizione;
	private int iva;

//	Constructor
	public Prodotto(String nome, float prezzo, int iva) {
	
		this.nome = nome;
		this.prezzo = prezzo;
		this.iva = iva;
		setId();
	}
	
//	Name
	public void setName(String nome) {
		this.nome = nome;
	}
	public String getName() {
		return nome;
	}	
	public String getExtendedName() {
		return getLongId() + "-" + nome;
	}
	
//	Id
	private void setId() {
		Random random = new Random();
        int newId = random.nextInt(10000000)+ 1;
        this.codice = newId;
	}
	public int getId() {
		return this.codice;
	}
	public String getLongId() {
		
		final int MAX_NUMBER = 8;
		String longId = "";
		String stringCode = String.valueOf(codice);
		
		if(stringCode.length() <= MAX_NUMBER) {
			
			int range = MAX_NUMBER - stringCode.length();
			
			for(int i = 0; i < range; i++) {
				longId += "0";
			}	
		}
		return longId + codice;
	}
	
//	Description
	public void setDescription(String descrizione) {
		this.descrizione = descrizione;
	}
	public String getDescription() {
		return descrizione;
	}
	
//	Price & VAT
	public void setNetPrice(Float prezzo) {
		this.prezzo = prezzo;
	}
	public float getNetPrice() {
		return prezzo;
	}
	public int getIva() {
		return iva;
	}
	public void setIva(int numero) {
		this.iva = numero;
	}
	public float getIvaAmount() {
		float ivaAmount = (getNetPrice() * iva)/100;
		return ivaAmount;
	}
	public float getGrossPrice() {
		return prezzo + getIvaAmount();
	}
	
//	Full Print
	@Override
	public String toString() {
		return "-----------------------------------------" + "\n"
				+ "Prdotto: " + getName() + "\n"
				+ "Codice Prdotto: " + getId() + "\n"
				+ "Nome composto: " + getExtendedName() + "\n"
				+ "Descrizione: " + getDescription() + "\n"
				+ "Prezzo Lordo: " + "€" + String.format("%.2f", getGrossPrice()) + " di cui iva " + "€" + String.format("%.2f", getIvaAmount()) + "\n"
				+ "Prezzo Netto: " + "€" + String.format("%.2f", getNetPrice()) + "\n"
				+ "Iva: " + getIva() + "%"+ "\n"
				+ "-----------------------------------------";
	}
}