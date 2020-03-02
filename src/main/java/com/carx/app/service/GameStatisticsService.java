package com.carx.app.service;

import com.carx.app.model.GameStatistics;
import com.carx.app.repository.GameStatisticsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class GameStatisticsService {
    @Autowired
    private GameStatisticsRepository gameStatisticsRepository;

    public void updateGameStatistics(GameStatistics gameStatistics) {
        return Mono.fromRunnable(() -> {
            final GameStatistics statistics = gameStatisticsRepository
                    .findGameStatisticByUserId(gameStatistics.getUserId().toString());
            statistics.setActivity();
            gameStatisticsRepository.save()
        });
    }
}
