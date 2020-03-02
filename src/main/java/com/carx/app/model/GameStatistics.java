package com.carx.app.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
public class GameStatistics {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private UUID userId;

    private int activity;
}
