package cn.kgc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Game {
    private Integer gameId;
    private String gameName;
    private String gameType;
    private String gameCompany;
    private Integer gameYear;
}
