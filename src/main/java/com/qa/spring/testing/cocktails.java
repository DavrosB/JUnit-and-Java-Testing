package com.qa.spring.testing;




public class cocktails {
	
	private String name;
	private String booze;
	private int shots;
	private String mixers;
	private boolean cherry;
	
	
	public cocktails(String name, String booze, int shots, String mixers, boolean cherry) {
		super();
		this.name = name;
		this.booze = booze;
		this.shots = shots;
		this.mixers = mixers;
		this.cherry = cherry;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getBooze() {
		return booze;
	}


	public void setBooze(String booze) {
		this.booze = booze;
	}


	public int getShots() {
		return shots;
	}


	public void setShots(int shots) {
		this.shots = shots;
	}


	public String getMixers() {
		return mixers;
	}


	public void setMixers(String mixers) {
		this.mixers = mixers;
	}


	public boolean isCherry() {
		return cherry;
	}


	public void setCherry(boolean cherry) {
		this.cherry = cherry;
	}
	
//	public static void getCocktail(String name, String booze, int shots, String mixers, boolean cherry) {
//		
//		System.out.println(name + booze + shots + mixers + cherry);
//		
//		
//	}
	
}
