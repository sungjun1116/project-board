package com.board.projectboard.dto;

/**
 * A DTO for the {@link com.board.projectboard.domain.Article} entity
 */
public record ArticleUpdateDto(
        String title,
        String content,
        String hashtag
) {
    public static ArticleUpdateDto of(final String title, final String content, final String hashtag) {
        return new ArticleUpdateDto(title, content, hashtag);
    }
}
