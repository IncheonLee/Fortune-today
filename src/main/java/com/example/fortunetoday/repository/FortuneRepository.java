
package com.example.fortunetoday.repository;

import com.example.fortunetoday.entity.Fortune;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FortuneRepository extends JpaRepository<Fortune, Long> {
}
