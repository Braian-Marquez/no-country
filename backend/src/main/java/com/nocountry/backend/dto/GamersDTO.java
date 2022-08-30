package com.nocountry.backend.dto;

import com.nocountry.backend.entity.GamesList;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class GamersDTO {
    private Long id;
    @Email(message = "Username must be an email" )
    @Column(unique = true)
    private String username;
    @Size(min = 8)
    private String password;
    private String name;

    private List<Long> recordSudoku=new ArrayList<>(5); //puntajes por cada juego
    private List<Long>  recordWordle=new ArrayList<>(5); ;
    private List<Long>  recordMemories=new ArrayList<>(5); ;
    private List<Long>  recordBuscaMinas=new ArrayList<>(5); ;

    private Long averageSudoku;
    private Long averageWordle;
    private Long averageMemories;
    private Long averageBuscaMinas;
    private Long averageGlobal;

    private GamesList gamesList;
}
