package com.thingcinema.filmsarchive.repositories;

import com.thingcinema.filmsarchive.models.Movie;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryRepository implements MovieRepository {

    private List<Movie> allMovies = new ArrayList<>();


    public InMemoryRepository(){

        allMovies.add(new Movie("Fight Club", "Fight Club is a 1999 film based on Chuck Palahniuk‘s 1996 novel of the same name. The film was directed by David Fincher and stars Brad Pitt, Edward Norton, and Helena Bonham Carter. Norton plays the unnamed protagonist, referred to as the narrator, who is discontent with his white-collar job. He forms a \"fight club\" with soap maker Tyler Durden, played by Pitt, and they are joined by men who also want to fight recreationally. The narrator becomes embroiled in a relationship with Durden and a dissolute woman, Marla Singer, played by Bonham Carter. ", "https://upload.wikimedia.org/wikipedia/en/f/fc/Fight_Club_poster.jpg",1));
        allMovies.add( new Movie("Inception", "Dom Cobb is a skilled thief, the absolute best in the dangerous art of extraction, stealing valuable secrets from deep within the subconscious during the dream state, when the mind is at its most vulnerable. Cobb's rare ability has made him a coveted player in this treacherous new world of corporate espionage, but it has also made him an international fugitive and cost him everything he has ever loved. Now Cobb is being offered a chance at redemption. One last job could give him his life back but only if he can accomplish the impossible - inception. Instead of the perfect heist, Cobb and his team of specialists have to pull off the reverse: their task is not to steal an idea but to plant one.", "https://m.media-amazon.com/images/M/MV5BMjAxMzY3NjcxNF5BMl5BanBnXkFtZTcwNTI5OTM0Mw@@._V1_SY1000_CR0,0,675,1000_AL_.jpg",2));
        allMovies.add( new Movie("Annapolis", "Jake Huard, from a shipbuilders family, promised his dying mother he'd make it to Annapolis Naval Academy. Thanks to tenaciously bugging a Congressman he's selected, despite dubious grades. Once inside Jake soon proves sub-standard academically. Constantly challenged to his limits, repeatedly made the 'over-cocky' reason for the entire class to suffer, Jake nearly quits, but after facing his utterly unsupportive father's gloating returns just in time.", "https://m.media-amazon.com/images/M/MV5BNDQxMzA1Mjk5MF5BMl5BanBnXkFtZTcwMTM5NjEzMQ@@._V1_.jpg",3));
        allMovies.add( new Movie("Ocean's Thirteen", "The last time we saw Danny Ocean's crew, they were paying back ruthless casino mogul Terry Benedict after stealing millions from him. However, it's been a while since they've come back together, which is all about to change. When one of their own, Reuben Tishkoff, builds a hotel with another casino owner, Willy Bank, the last thing he ever wanted was to get cut out of the deal personally by the loathsome Bank. Bank's attitude even goes so far as to finding the amusement in Tishkoff's misfortune when the double crossing lands Reuben in the hospital because of a heart attack.", "https://m.media-amazon.com/images/M/MV5BMTMyNTc1NzY5MV5BMl5BanBnXkFtZTcwNDM4NTQzMw@@._V1_SY1000_CR0,0,675,1000_AL_.jpg", 4));
        allMovies.add( new Movie("The Italian Job", "Led by John Bridger (Donald Sutherland) and Charlie Croker (Mark Wahlberg) a team is assembled for one last heist to steal $35 million in gold bars from a heavily guarded safe in Venice, Italy. After successfully pulling off the heist, a team member, Steve (Edward Norton), driven by greed and jealousy, arranges to take the gold for himself and eliminate the remaining members of the group. Thinking the team dead, he returns to L.A. with the gold. Charlie and the survivors of this betrayal follow Steve L.A. to exact revenge against the traitor. ", "https://m.media-amazon.com/images/M/MV5BNDYyNzYxNjYtNmYzMC00MTE0LWIwMmYtNTAyZDBjYTIxMTRhXkEyXkFqcGdeQXVyNDk3NzU2MTQ@._V1_SY1000_CR0,0,666,1000_AL_.jpg", 5));
    }

    @Override
    public void createMovie(Movie movie) {
        Movie lastMovie = allMovies.get(allMovies.size()-1);
        movie.setId(lastMovie.getId()+1);
        allMovies.add(movie);
    }

    @Override
    public List<Movie> getMovies() {
        return allMovies;
    }

    @Override
    public Movie getMovieById(int id) {
        for (Movie movie : allMovies) {
            if(id == movie.getId()){
                return movie;
            }
        }
        return null;
    }

    @Override
    public void deleteMovie(int id) {
        for (Movie movie : allMovies) {
            if(id == movie.getId()){
                allMovies.remove(movie);
            }
        }
    }
}
