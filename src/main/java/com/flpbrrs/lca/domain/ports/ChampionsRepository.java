package com.flpbrrs.lca.domain.ports;

import com.flpbrrs.lca.domain.models.Champion;

import java.util.List;
import java.util.Optional;

public interface ChampionsRepository {
    List<Champion> findAll();
    Optional<Champion> findById(Long id);
}
