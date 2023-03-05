package com.board.projectboard.config;

import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.ConstructorBinding;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.spring6.templateresolver.SpringResourceTemplateResolver;

@Configuration(proxyBeanMethods = false)
public class Thymeleaf3Config {
    @Bean
    public SpringResourceTemplateResolver thymeleafTemplateResolver(SpringResourceTemplateResolver defaultTemplateResolver,
                                                                    Thymeleaf3Properties thymeleaf3Properties) {
        defaultTemplateResolver.setUseDecoupledLogic(thymeleaf3Properties.isDecoupledLogic());

        return defaultTemplateResolver;
    }

    @Getter
    @ConfigurationProperties("spring.thymeleaf3")
    static class Thymeleaf3Properties {
        /**
         * Use Thymeleaf 3 Decoupled Logic
         */
        private final boolean decoupledLogic;

        @ConstructorBinding
        public Thymeleaf3Properties(boolean decoupledLogic) {
            this.decoupledLogic = decoupledLogic;
        }
    }
}
