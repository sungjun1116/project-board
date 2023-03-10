package com.board.projectboard.dto;

import java.time.LocalDateTime;

/**
 * A DTO for the {@link com.board.projectboard.domain.ArticleComment} entity
 */
public record ArticleCommentDto(
        LocalDateTime createdAt,
        String createdBy,
        String content
) {
    public static ArticleCommentDto of(final LocalDateTime createdAt, final String createdBy, final String content) {
        return new ArticleCommentDto(createdAt, createdBy, content);
    }
}
