package ru.sofronov.game.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Player {
    private Long id;
    private String ip;
    private String name;
    private Integer points;
    private Integer maxWinsCount;
    private Integer maxLosesCount;

}
