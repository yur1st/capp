package com.capp.tech.repository.datajpa;

import com.capp.tech.model.entity.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.history.RevisionRepository;

@NoRepositoryBean
public interface CommonRepository<E extends BaseEntity>
        extends RevisionRepository<E, Long, Integer>, JpaRepository<E, Long> {

}