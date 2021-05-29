import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import ru.sofronov.game.models.Game;
import ru.sofronov.game.repositories.CustomDataSource;
import ru.sofronov.game.repositories.GamesRepository;
import ru.sofronov.game.repositories.GamesRepositoryJdbcImpl;

import javax.sql.DataSource;

public class Main {
    public static void main(String[] args) {

//        HikariConfig config = new HikariConfig();
//        config.setJdbcUrl("jdbc:postgresql://localhost:5432/projectgamemaven");
//        config.setDriverClassName("org.postgresql.Driver");
//        config.setUsername("postgres");
//        config.setPassword("maverickmel777");
//        config.setMaximumPoolSize(20);
//        DataSource dataSource = new HikariDataSource(config);
//        **Замена на ^**
        DataSource dataSource = new CustomDataSource("postgres", "maverickmel777",
                "jdbc:postgresql://localhost:5432/projectgamemaven");
        GamesRepository gamesRepository = new GamesRepositoryJdbcImpl(dataSource);

        System.out.println(gamesRepository.findById(1L));
    }
}
