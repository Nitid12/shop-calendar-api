package com.sample.domain.config;

import com.zaxxer.hikari.HikariDataSource;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.boot.orm.jpa.hibernate.SpringImplicitNamingStrategy;
import org.springframework.boot.orm.jpa.hibernate.SpringPhysicalNamingStrategy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "com.sample.domain.second", entityManagerFactoryRef = "secondEntityManagerFactory", transactionManagerRef = "secondTransactionManager")
public class SecondDataSourceConfig {

    @Bean
    @ConfigurationProperties("spring.second-datasource")
    public DataSourceProperties secondDatasourceProperties() {
        return null;
        // TODO: 보안 정책상 비공개 처리된 로직입니다.
    }

    @Bean
    @ConfigurationProperties("spring.second-datasource.hikari")
    public DataSource secondDatasource() {
        return null;
        // TODO: 보안 정책상 비공개 처리된 로직입니다.
    }

    protected Map<String, Object> jpaProperties() {
        return null;
        // TODO: 보안 정책상 비공개 처리된 로직입니다.
    }

    @Bean(name = "secondEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean secondEntityManagerFactory(EntityManagerFactoryBuilder builder) {
        return null;
        // TODO: 보안 정책상 비공개 처리된 로직입니다.
    }

    @Bean(name = "secondTransactionManager")
    public PlatformTransactionManager secondTransactionManager(@Qualifier("secondEntityManagerFactory") final LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean) {
        return null;
        // TODO: 보안 정책상 비공개 처리된 로직입니다.
    }
}
