package com.board.projectboard.service;

import com.board.projectboard.domain.type.SearchType;
import com.board.projectboard.dto.ArticleDto;
import com.board.projectboard.dto.ArticleWithCommentsDto;
import com.board.projectboard.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Transactional
@Service
public class ArticleService {
    private final ArticleRepository articleRepository;

    @Transactional(readOnly = true)
    public Page<ArticleDto> searchArticles(final SearchType title, final String searchKeyword, Pageable pageable) {
        return Page.empty();
    }

    @Transactional(readOnly = true)
    public ArticleDto searchArticle(final Long articleId) {
        return null;
    }

    @Transactional(readOnly = true)
    public ArticleWithCommentsDto getArticle(final Long articleId) {
        return null;
    }

    public void saveArticle(final ArticleDto dto) {
    }

    public void updateArticle(final ArticleDto dto) {
    }

    public void deleteArticle(final long articleId) {
    }
}
