package com.board.projectboard.service;

import com.board.projectboard.dto.ArticleCommentDto;
import com.board.projectboard.dto.ArticleCommentUpdateDto;
import com.board.projectboard.repository.ArticleCommentRepository;
import com.board.projectboard.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Transactional
@Service
public class ArticleCommentService {
    private final ArticleRepository articleRepository;
    private final ArticleCommentRepository articleCommentRepository;

    @Transactional(readOnly = true)
    public List<ArticleCommentDto> searchArticleComments(final Long articleId) {
        return List.of();
    }

    @Transactional(readOnly = true)
    public ArticleCommentDto searchArticleComment(final Long articleId) {
        return null;
    }

    public void saveArticleComment(final ArticleCommentDto dto) {

    }

    public void updateArticleComment(final long articleCommentId, final ArticleCommentUpdateDto dto) {

    }

    public void deleteArticleComment(final long articleCommentId) {
    }
}
