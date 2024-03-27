package com.flpbrrs.lca.adapters.out;

import com.flpbrrs.lca.domain.models.Champion;
import com.flpbrrs.lca.domain.ports.ChampionsRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ChampionsJdbcRepository implements ChampionsRepository {
    private final JdbcTemplate jdbcTemplate;
    private final RowMapper<Champion> championRowMapper;

    public ChampionsJdbcRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
        this.championRowMapper = (rs, rowNum) -> new Champion(
                rs.getLong("id"),
                rs.getString("name"),
                rs.getString("role"),
                rs.getString("lore"),
                rs.getString("image_url")
        );
    }
    @Override
    public List<Champion> findAll() {
        return jdbcTemplate.query("SELECT * FROM CHAMPIONS", championRowMapper);
    }

    @Override
    public Optional<Champion> findById(Long id) {
        String sql = "SELECT * FROM CHAMPIONS WHERE ID = ?";
        Champion champion = jdbcTemplate.queryForObject(sql, championRowMapper);
        return Optional.ofNullable(champion);
    }
}