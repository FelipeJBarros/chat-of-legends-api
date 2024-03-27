package com.flpbrrs.lca.domain.models;

public record Champion (
    Long id,
    String name,
    String role,
    String lore,
    String imageUrl
) { }
