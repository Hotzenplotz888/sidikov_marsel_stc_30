package ru.sofronov.game.repositories;

import ru.sofronov.game.models.Game;
import ru.sofronov.game.models.Player;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;

public class GamesRepositoryJdbcImpl implements GamesRepository {
    // язык SQL
    private static final String SQL_FIND_BY_ID = "select * from game where id = ?";

    static private final RowMapper<Game> gameRowMapper = row -> Game.builder()
            .id(row.getLong("Id"))
            .dateTime(LocalDateTime.parse(row.getString("datetime")))
            .playerFirst(Player.builder()
                    .id(row.getLong("player_first"))
                    .build())
            .playerSecond(Player.builder()
                    .id(row.getLong("player_second"))
                    .build())
            .build();

    private DataSource dataSource;

    public GamesRepositoryJdbcImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void save(Game game) {

    }

    @Override
    public Game findById(Long gameId) {
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(SQL_FIND_BY_ID);) {
            statement.setLong(1, gameId);
            try (ResultSet rows = statement.executeQuery()) {
                if (rows.next()) {
                    return gameRowMapper.mapRow(rows);
                }
            }
            return null;
        } catch (SQLException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override
    public void update(Game game) {

    }
}
