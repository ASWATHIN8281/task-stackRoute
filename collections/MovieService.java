package com.stackroute.collections;
import java.time.LocalDate;
import java.util.*;

/*
This class contains a property called movieMap of type Map
This class contains methods for adding key-value pairs of Movie and its rating to HashMap and
various methods for accessing the keys and values based on some conditions
 */
public class MovieService {
    Map<Movie,Integer>movieMap;
    /**
     * Constructor to create movieMap as an empty  LinkedHashMap object
     */
    public MovieService() {

        this.movieMap=new LinkedHashMap<>();
    }
    /*
    Returns the movieMap object
     */
    public Map<Movie, Integer> getMovieMap() {

        return this.movieMap;
    }

    /*
    Add key-value pairs of Movie-Integer type and returns Set of Map.Entry
     */
    public Set<Map.Entry<Movie, Integer>> addKeyValuePairsToMap(Movie movie, Integer rating) {

         movieMap.put(movie,rating);
         return movieMap.entrySet();
    }
    /*
    Return Set of movie names having rating greater than or equal to given rating
     */
    public List<String> getHigherRatedMovieNames(int rating) {
        List<String>list=new ArrayList<>();
        for (Map.Entry<Movie,Integer> entry:movieMap.entrySet()) {
            if(entry.getValue()>=rating){
                list.add(entry.getKey().getMovieName());
            }
        }
        return list;
    }

    /*
    Return Set of movie names belonging to specific genre
     */
    public List<String> getMovieNamesOfSpecificGenre(String genre) {
        List<String>list=new ArrayList<>();
        for (Map.Entry<Movie,Integer> m:movieMap.entrySet()) {
            if(m.getKey().getGenre()==genre) {
                list.add(m.getKey().getMovieName());
            }
        }
        return list;
    }

   /*
   Return Set of movie names which are released after Specific releaseDate and having rating less than or equal to 3
    */
    public List<String> getMovieNamesReleasedAfterSpecificDateAndRatingLesserThanThree(LocalDate releaseDate) {
        List<String>list=new ArrayList<>();
        for (Map.Entry<Movie,Integer> m:movieMap.entrySet()) {
            if((m.getKey().getReleaseDate().compareTo(releaseDate)>0) && m.getValue()<=3){
                list.add(m.getKey().getMovieName());
            }
        }
        return list;
    }

    /*
    Return set of movies sorted by release dates in ascending order.
    Hint: Use TreeMap
     */
    public List<Movie> getSortedMovieListByReleaseDate() {
        TreeMap<LocalDate,Movie> treeMap=new TreeMap<LocalDate,Movie>();
        for (Map.Entry<Movie,Integer> entry:movieMap.entrySet()) {
            treeMap.put(entry.getKey().getReleaseDate(),entry.getKey());
        }
        Collection<Movie> values=treeMap.values();
        return new ArrayList<Movie>(values);
    }

    /*
   Return set of movies sorted by rating.
   Hint: Use Comparator and LinkedHashMap
    */
    public Map<Movie, Integer> getSortedMovieListByRating() {
        ArrayList<Map.Entry<Movie,Integer>>entry=new ArrayList<>(movieMap.entrySet());
        Collections.sort(entry, new Comparator<Map.Entry<Movie, Integer>>() {
            public int compare(Map.Entry<Movie, Integer> map1, Map.Entry<Movie, Integer> map2) {

                return map1.getValue().compareTo(map2.getValue());
            }});
            LinkedHashMap<Movie,Integer> sortedMap=new LinkedHashMap<>();
            for(Map.Entry<Movie,Integer> entry1:entry) {
                sortedMap.put(entry1.getKey(),entry1.getValue());
            }
            return sortedMap;
    }
}
