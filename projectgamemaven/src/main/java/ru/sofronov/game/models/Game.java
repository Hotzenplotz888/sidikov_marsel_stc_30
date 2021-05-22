package ru.sofronov.game.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Game {
    private Long id;
    private LocalDateTime dateTime;
    private Player playerFirst;
    private Player playerSecond;
    private Integer playerFirstShotsCount;
    private Integer playerSecondShotsCount;
    private Long secondsGameTimeAmount;

}
