package se.ashwini.ashuweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import se.ashwini.ashuweb.models.HockeyPlayer;
import se.ashwini.ashuweb.models.HockeyPlayerRepository;

@Component
public class ConsoleRunner implements CommandLineRunner {

    @Autowired
    HockeyPlayerRepository hockeyPlayerRepository;

    @Override
    public void run(String... args) throws Exception {
        if(hockeyPlayerRepository.count() == 0) {
            HockeyPlayer hockeyPlayer = new HockeyPlayer();
            hockeyPlayer.setAge(35);
            hockeyPlayer.setName("Ash");
            hockeyPlayerRepository.save(hockeyPlayer);

            hockeyPlayer = new HockeyPlayer();
            hockeyPlayer.setAge(20);
            hockeyPlayer.setName("Dhairya");
            hockeyPlayerRepository.save(hockeyPlayer);
        }
        //insert into HockeyPlayer
        //kollaom count(*)=0

    }

}
