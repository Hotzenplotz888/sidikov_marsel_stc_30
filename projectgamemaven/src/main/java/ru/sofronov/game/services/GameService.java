package ru.sofronov.game.services;

import ru.sofronov.game.dto.StatisticDto;

public interface GameService {

    /**
     * Метод вызывается для обеспечения начала игры. Если игрок с таким никнеймом уже есть, то мы работаем с ним.
     * Если такого нет - то создаем нового
     * @param firstIp IP-адрес, с которого зашел первый игрок
     * @param secondIp IP-адрес, с которого зашел второй игрок
     * @param firstPlayerNickname имя первого игрока
     * @param secondPlayerNickname имя второго игрока
     * @return идентификатор игры
     */
    Long startGame(String firstIp, String secondIp, String firstPlayerNickname, String secondPlayerNickname);

    /**
     * Фиксирует выстрел игроков (попавшие)
     * @param gameId идентификатор игры
     * @param shooterNickname имя первого игрока
     * @param targetNickname имя второго игрока
     */
    void shot(Long gameId, String shooterNickname, String targetNickname);

    StatisticDto finishGame(Long gameId);
}
