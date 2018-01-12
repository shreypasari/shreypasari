package com.au.question2;

public class Products {
	private Helmet helmet;
	private  Gloves gloves;

	public Products(Factory factory) {
		gloves = factory.createGloves();
		helmet = factory.createHelmet();
	}

	public void create() {
		gloves.createGloves();
		helmet.createHelmet();
	}

}
