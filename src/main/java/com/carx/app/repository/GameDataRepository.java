package com.carx.app.repository;

import com.carx.app.model.GameData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameDataRepository extends JpaRepository<GameData, Long> {
    GameData findGameDataByUserId(String userId);
}
