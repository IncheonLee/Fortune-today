
package com.example.fortunetoday.service;

import com.example.fortunetoday.repository.FortuneRepository;
import com.example.fortunetoday.entity.Fortune;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
@RequiredArgsConstructor
public class FortuneService {

    private final FortuneRepository fortuneRepository;

    public String getRandomFortune() {
        List<Fortune> all = fortuneRepository.findAll();
        if (all.isEmpty()) return "운세 데이터가 없습니다!";
        return all.get(new Random().nextInt(all.size())).getText();
    }
}
