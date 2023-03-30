package com.semihbiygit.weather.dto;

public record Request(
        String type,
        String query,
        String language,
        String unit
) { }
