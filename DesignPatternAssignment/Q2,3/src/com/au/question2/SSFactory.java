package com.au.question2;

public class SSFactory implements Factory {
	@Override
    public Helmet createHelmet() {
        return new SSHelmet();
    }

    @Override
    public Gloves createGloves() {
        return new SSGloves();
    }

}
