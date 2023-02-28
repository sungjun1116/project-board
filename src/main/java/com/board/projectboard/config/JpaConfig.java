package com.board.projectboard.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.Optional;

@EnableJpaAuditing
@Configuration(proxyBeanMethods = false)
public class JpaConfig {
    @Bean
    public AuditorAware<String> auditorAware() {
        // TODO: 스프링 시큐리티로 인증 기증을 붙이게 될때, 수정할 예정
        return () -> Optional.of("lake");
    }
}
