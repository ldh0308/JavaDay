package org.extends1.ex;

public class Movie extends Item{
    public Movie(String name, int price, String director, String actor) {
        super(name, price);
        System.out.println("- 감독: " + director + ", 배우: " + actor);

    }
}
