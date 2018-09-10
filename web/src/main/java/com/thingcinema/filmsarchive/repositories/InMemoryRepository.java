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
        allMovies.add( new Movie("Zootopia", "From the largest elephant to the smallest shrew, the city of Zootopia is a mammal metropolis where various animals live and thrive. When Judy Hopps becomes the first rabbit to join the police force, she quickly learns how tough it is to enforce the law. Determined to prove herself, Judy jumps at the opportunity to solve a mysterious case. Unfortunately, that means working with Nick Wilde, a wily fox who makes her job even harder.", "https://m.media-amazon.com/images/M/MV5BOTMyMjEyNzIzMV5BMl5BanBnXkFtZTgwNzIyNjU0NzE@._V1_SY1000_SX675_AL_.jpg",6));
        allMovies.add( new Movie("Moana", "Moana Waialiki is a sea voyaging enthusiast and the only daughter of a chief in a long line of navigators. When her island's fishermen can't catch any fish and the crops fail, she learns that the demigod Maui caused the blight by stealing the heart of the goddess, Te Fiti. The only way to heal the island is to persuade Maui to return Te Fiti's heart, so Moana sets off on an epic journey across the Pacific. The film is based on stories from Polynesian mythology.", "https://m.media-amazon.com/images/M/MV5BMjI4MzU5NTExNF5BMl5BanBnXkFtZTgwNzY1MTEwMDI@._V1_SY1000_CR0,0,674,1000_AL_.jpg",7));
        allMovies.add( new Movie("I Am Legend", "Robert Neville is a scientist who was unable to stop the spread of the terrible virus that was incurable and man-made. Immune, Neville is now the last human survivor in what is left of New York City and perhaps the world. For three years, Neville has faithfully sent out daily radio messages, desperate to find any other survivors who might be out there. But he is not alone. Mutant victims of the plague -- The Infected -- lurk in the shadows... watching Neville's every move... waiting for him to make a fatal mistake. Perhaps mankind's last, best hope, Neville is driven by only one remaining mission: to find a way to reverse the effects of the virus using his own immune blood. But he knows he is outnumbered... and quickly running out of time.", "https://m.media-amazon.com/images/M/MV5BYTE1ZTBlYzgtNmMyNS00ZTQ2LWE4NjEtZjUxNDJkNTg2MzlhXkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_SY1000_SX675_AL_.jpg",8));
        allMovies.add( new Movie("Avatar", "When his brother is killed in a robbery, paraplegic Marine Jake Sully decides to take his place in a mission on the distant world of Pandora. There he learns of greedy corporate figurehead Parker Selfridge's intentions of driving off the native humanoid \"Na'vi\" in order to mine for the precious material scattered throughout their rich woodland. In exchange for the spinal surgery that will fix his legs, Jake gathers intel for the cooperating military unit spearheaded by gung-ho Colonel Quaritch, while simultaneously attempting to infiltrate the Na'vi people with the use of an \"avatar\" identity. While Jake begins to bond with the native tribe and quickly falls in love with the beautiful alien Neytiri, the restless Colonel moves forward with his ruthless extermination tactics, forcing the soldier to take a stand - and fight back in an epic battle for the fate of Pandora.", "https://m.media-amazon.com/images/M/MV5BMTYwOTEwNjAzMl5BMl5BanBnXkFtZTcwODc5MTUwMw@@._V1_.jpg",9));
        allMovies.add( new Movie("Bad Boys", "Marcus Burnett is a hen-pecked family man. Mike Lowry is a foot-loose and fancy free ladies' man. Both are Miami policemen, and both have 72 hours to reclaim a consignment of drugs stolen from under their station's nose. To complicate matters, in order to get the assistance of the sole witness to a murder, they have to pretend to be each other.", "https://m.media-amazon.com/images/M/MV5BMGE1ZTQ0ZTEtZTEwZS00NWE0LTlmMDUtMTE1ZWJiZTYzZTQ2XkEyXkFqcGdeQXVyNTAyODkwOQ@@._V1_SY1000_CR0,0,675,1000_AL_.jpg",10));
        allMovies.add( new Movie("Hachikô", "The true story about a dog's loyalty to its master, even after his death.", "https://m.media-amazon.com/images/M/MV5BMzA1ODVkZWQtZjc3OC00NDE1LTgyNTYtNTk2NDllZjNiNjQxXkEyXkFqcGdeQXVyMjEzNzk0NjE@._V1_SY1000_CR0,0,733,1000_AL_.jpg",11));
        allMovies.add( new Movie("The Secret Life of Pets", "In a Manhattan apartment building, Max's life as a favorite pet is turned upside-down, when his owner brings home sloppy mongrel Duke. They must put their quarrels aside when they learn that adorable white bunny Snowball is building an army of lost pets determined to wreak revenge", "https://m.media-amazon.com/images/M/MV5BMjIzMzA1OTkzNV5BMl5BanBnXkFtZTgwODE3MjM4NzE@._V1_.jpg",12));
        allMovies.add( new Movie("Deadpool", "This is the origin story of former Special Forces operative turned mercenary Wade Wilson, who after being subjected to a rogue experiment that leaves him with accelerated healing powers, adopts the alter ego Deadpool. Armed with his new abilities and a dark, twisted sense of humor, Deadpool hunts down the man who nearly destroyed his life.", "https://m.media-amazon.com/images/M/MV5BYzE5MjY1ZDgtMTkyNC00MTMyLThhMjAtZGI5OTE1NzFlZGJjXkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_SY1000_CR0,0,666,1000_AL_.jpg",13));
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
