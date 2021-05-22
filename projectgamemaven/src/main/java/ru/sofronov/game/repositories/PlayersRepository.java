package ru.sofronov.game.repositories;

import ru.sofronov.game.models.Player;

public interface PlayersRepository {
    Player findByNickname(String nickname);

    void save(Player player);

    void update(Player player);
}
