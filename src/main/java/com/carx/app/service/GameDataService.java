package com.carx.app.service;

import com.carx.app.model.GameData;
import com.carx.app.repository.GameDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class GameDataService {
    @Autowired
    private GameDataRepository gameDataRepository;

    public Mono<Void> updateGameData(GameData data) {
        return Mono.fromRunnable(() -> {
            final GameData gameData = gameDataRepository.findGameDataByUserId(data.getUserId().toString());
            gameData.setMoney(data.getMoney());
            gameDataRepository.save(gameData);
        });
    }

    public Mono<GameData> getGameData(String userId) {
        return Mono.fromCallable(() -> gameDataRepository.findGameDataByUserId(userId));
    }
}
