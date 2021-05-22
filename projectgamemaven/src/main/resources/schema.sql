create table player (
            id                              bigserial primary key,
            ip                              varchar(100),
            name                            varchar(100),
            points                          integer,
            max_wins_count                  integer,
            max_loses_count                 integer
);

create table game (
            id                              bigserial primary key,
            dateTime                        varchar(100),
            player_first                    bigint,
            player_second                   bigint,
            player_first_shots_count        integer,
            player_second_shots_count       integer,
            second_game_time_amount         bigint,
            foreign key (player_first)      references player(id),
            foreign key (player_second)     references player(id)
);
