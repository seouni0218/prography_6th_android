package com.example.viewpager;

import android.graphics.Movie;

import java.util.ArrayList;

public class MovieListVO {

    private ArrayList<Movie> list; //처음부터 [으로 시작하면 어쩌라는거지?

    public ArrayList<Movie> getList() {
        return list;
    }
    public void setList(ArrayList<Movie> list) {
        this.list = list;
    }

    public class Movie {
        private String id;
        private String title;
        private String description;
        private String director;
        private String producer;
        private String release_date;
        private String rt_score;
        private ArrayList<String> people;
        private ArrayList<String> species;
        private ArrayList<String> locations;
        private ArrayList<String> vehicles;
        private String url;

        public String get_id() {
            return id;
        }
        public void set_id(String id) { this.id = id; }

        public String get_title() {
            return title;
        }
        public void set_title(String title) { this.title = title; }

        public String get_description() {
            return description;
        }
        public void set_description(String description) { this.description = description; }

        public String get_director() {
            return director;
        }
        public void set_director(String director) { this.director = director; }

        public String get_producer() {
            return producer;
        }
        public void set_producer(String producer) { this.producer = producer; }

        public String get_date() {
            return release_date;
        }
        public void set_date(String release_date) { this.release_date = release_date; }

        public String get_score() {
            return rt_score;
        }
        public void set_score(String rt_score) { this.rt_score = rt_score; }

        public ArrayList<String> getList_people() { return people; }
        public void setList_people(ArrayList<String> people) { this.people = people; }

        public ArrayList<String> getList_species() { return species; }
        public void setList_species(ArrayList<String> species) { this.species = species; }

        public ArrayList<String> getList_locations() { return locations; }
        public void setList_locations(ArrayList<String> locations) { this.locations = locations; }

        public ArrayList<String> getList_vehicles() { return vehicles; }
        public void setList_vehicles(ArrayList<String> vehicles) { this.vehicles = vehicles; }

        public String get_url() {
            return url;
        }
        public void set_url(String url) { this.url = url; }
    }
}
