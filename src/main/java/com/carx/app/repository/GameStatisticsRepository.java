package com.carx.app.repository;

import com.carx.app.model.GameStatistics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameStatisticsRepository extends JpaRepository<GameStatistics, Long> {
    GameStatistics findGameStatisticByUserId(String userId);
}
