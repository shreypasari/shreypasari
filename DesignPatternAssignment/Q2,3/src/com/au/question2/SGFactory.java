package com.au.question2;

public class SGFactory implements Factory {
	@Override
    public SGGloves createGloves() {
        return new SGGloves();
    }

    @Override
    public SGHelmet createHelmet() {
        return new SGHelmet();
    }

}
