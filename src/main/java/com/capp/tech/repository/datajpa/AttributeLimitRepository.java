package com.capp.tech.repository.datajpa;

import com.capp.tech.model.entity.AttributeLimit;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface AttributeLimitRepository extends CommonRepository<AttributeLimit> {

    @Modifying
    @Query(value = "UPDATE attribute_limit SET possible_values = jsonb_insert(possible_values, '{0}', to_jsonb(?1), true) WHERE id = ?2", nativeQuery = true)
    void addLimit(String limit, Long id);
}
