package com.stackroute.domain;

public class Movie {
    Actor actor;

    Movie() {
        System.out.println("Movie object constructed!");
    }

    Movie(Actor actor) {
        this.actor = actor;
    }

    public Actor getActor() {
        return this.actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }
}
