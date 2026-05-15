package com.sample.domain.config;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing
public class DomainConfig {

    @PersistenceContext(unitName = "primaryEntityManager")
    private EntityManager primaryEntityManager;

    @PersistenceContext(unitName = "secondEntityManager")
    private EntityManager secondEntityManager;
}
