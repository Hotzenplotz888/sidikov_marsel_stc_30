package ru.sofronov.game.services;

import ru.sofronov.game.dto.StatisticDto;
import ru.sofronov.game.models.Game;
import ru.sofronov.game.models.Player;
import ru.sofronov.game.models.Shot;
import ru.sofronov.game.repositories.GamesRepository;
import ru.sofronov.game.repositories.PlayersRepository;
import ru.sofronov.game.repositories.ShotsRepository;
import java.time.LocalDateTime;

// бизнес-логика
public class GameServiceImpl implements ru.sofronov.game.services.GameService {

    private PlayersRepository playersRepository;

    private GamesRepository gamesRepository;

    private ShotsRepository shotsRepository;

    public GameServiceImpl(PlayersRepository playersRepository, GamesRepository gamesRepository, ShotsRepository shotsRepository) {
        this.playersRepository = playersRepository;
        this.gamesRepository = gamesRepository;
        this.shotsRepository = shotsRepository;
    }

    @Override
    public Long startGame(String firstIp, String secondIp, String firstPlayerNickname, String secondPlayerNickname) {
        // получили информацию об обоих игроках
        Player first = checkIfExists(firstIp, firstPlayerNickname);
        Player second = checkIfExists(secondIp, secondPlayerNickname);
        // создали игру
        Game game = Game.builder()
                .dateTime(LocalDateTime.now())
                .playerFirst(first)
                .playerSecond(second)
                .playerFirstShotsCount(0)
                .playerSecondShotsCount(0)
                .secondsGameTimeAmount(0L)
                .build();
        // сохранили игру в репозитории
        gamesRepository.save(game);
        return game.getId();
    }

    private Player checkIfExists(String ip, String nickname) {
//        Player player = playersRepository.findByNickname(nickname);
//        // если нет первого игрока под таким именем
//        if (player == null) {
//            // создаем игрока
//            player = new Player(ip, nickname, 0, 0, 0);
//            // сохраняем его в репозитории
//            playersRepository.save(player);
//        } else {
//            // если такой игрок был -> обновляем у него IP-адрес
//            player.setIp(ip);
//            playersRepository.update(player);
//        }

        return null;
    }

    @Override
    public void shot(Long gameId, String shooterNickname, String targetNickname) {
        // получаем того, кто стрелял из репозитория
        Player shooter = playersRepository.findByNickname(shooterNickname);
        // получаем того, в кого стреляли из репозитория
        Player target = playersRepository.findByNickname(targetNickname);
        // получаем игру
        Game game = gamesRepository.findById(gameId);
        // создаем выстрел
        Shot shot = Shot.builder()
                .dateTime(LocalDateTime.now())
                .game(game)
                .shooter(shooter)
                .target(target)
                .build();
        // увеличиваем очки у стреляющего
        shooter.setPoints(shooter.getPoints() + 1);
        // если стрелявший - первый игрок
        if (game.getPlayerFirst().getName().equals(shooterNickname)) {
            // сохраняем информацию о выстреле в игре
            game.setPlayerFirstShotsCount(game.getPlayerFirstShotsCount() + 1);
        }
        // если стрелявший - второй игрок
        if (game.getPlayerSecond().getName().equals(shooterNickname)) {
            // сохраняем информацию о выстреле в игре
            game.setPlayerSecondShotsCount(game.getPlayerSecondShotsCount() + 1);
        }
        // обновляем данные по стреляющему
        playersRepository.update(shooter);
        // обновляем данные по игре
        gamesRepository.update(game);
        // сохраняем выстрел
        shotsRepository.save(shot);
    }

    @Override
    public StatisticDto finishGame(Long gameId) {
        return null;
    }


}
