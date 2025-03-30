package com.ray.cf1400.explorer.repository;

import com.ray.cf1400.explorer.model.ForeignTradeEntrance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ForeignTradeEntranceRepository extends JpaRepository<ForeignTradeEntrance, String> {
    // Optional: add custom query methods
}
