package com.board.projectboard.dto;

public record ArticleCommentUpdateDto(String content) {
    public static ArticleCommentUpdateDto of(final String content) {
        return new ArticleCommentUpdateDto(content);
    }
}
