package ru.sofronov.game.repositories;

import ru.sofronov.game.models.Game;

public interface GamesRepository {
    void save(Game game);

    Game findById(Long gameId);

    void update(Game game);
}
