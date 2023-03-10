package com.board.projectboard.dto;

import java.time.LocalDateTime;

/**
 * A DTO for the {@link com.board.projectboard.domain.Article} entity
 */
public record ArticleDto(
        String title,
        String content,
        String hashtag,
        LocalDateTime createdAt,
        String createdBy
) {
    public static ArticleDto of(final String title, final String content, final String hashtag, final LocalDateTime createdAt, final String createdBy) {
        return new ArticleDto(title, content, hashtag, createdAt, createdBy);
    }
}
