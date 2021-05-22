import ru.sofronov.game.models.Game;
import ru.sofronov.game.repositories.CustomDataSource;
import ru.sofronov.game.repositories.GamesRepository;
import ru.sofronov.game.repositories.GamesRepositoryJdbcImpl;

import javax.sql.DataSource;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
//        System.out.println(LocalDateTime.now());
        DataSource dataSource = new CustomDataSource("postgres", "maverickmel777",
                "jdbc:postgresql://localhost:5432/projectgamemaven");
        GamesRepository gamesRepository = new GamesRepositoryJdbcImpl(dataSource);
        System.out.println(gamesRepository.findById(1L));
    }
}
