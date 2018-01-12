package com.au.question2;

public class SportsFactory {
	private static Products configureProducts() {
        Products app;
        Factory factory;
        
        String sportsName = "SG".toLowerCase();
        if (sportsName.contains("sg")) {
            factory = new SGFactory();
            app = new Products(factory);
        } else {
            factory = new SSFactory();
            app = new Products(factory);
        }
        return app;
    }

    public static void main(String[] args) {
        Products app = configureProducts();
        app.create();
    }

}
