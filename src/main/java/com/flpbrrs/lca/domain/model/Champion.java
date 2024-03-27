package com.flpbrrs.lca.domain.model;

public record Champion (
    Long id,
    String name,
    String role,
    String lore,
    String imageUrl
) { }
