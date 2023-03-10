package com.board.projectboard.service;

import com.board.projectboard.domain.type.SearchType;
import com.board.projectboard.dto.ArticleDto;
import com.board.projectboard.dto.ArticleUpdateDto;
import com.board.projectboard.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Transactional
@Service
public class ArticleService {
    private final ArticleRepository articleRepository;

    @Transactional(readOnly = true)
    public Page<ArticleDto> searchArticles(final SearchType title, final String searchKeyword) {
        return Page.empty();
    }

    @Transactional(readOnly = true)
    public ArticleDto searchArticle(final long l) {
        return null;
    }

    public void saveArticle(final ArticleDto dto) {
    }

    public void updateArticle(final long articleId, final ArticleUpdateDto dto) {
    }

    public void deleteArticle(final long articleId) {
    }
}
