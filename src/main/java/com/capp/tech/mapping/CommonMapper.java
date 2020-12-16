package com.capp.tech.mapping;

import com.capp.tech.model.dto.BaseDto;
import com.capp.tech.model.entity.BaseEntity;
import org.mapstruct.MapperConfig;
import org.mapstruct.Mapping;
import org.springframework.data.history.RevisionMetadata;

@MapperConfig(uses = UtilMapper.class)
public interface CommonMapper<E extends BaseEntity, D extends BaseDto, R extends D> {

    D toDto(E entity);

    E toEntity(D dto);

    @Mapping(source = "metadata.requiredRevisionInstant", target = "revisionDateTime")
    @Mapping(source = "metadata.requiredRevisionNumber", target = "revisionNumber")
    R toRevisionDto(E entity, RevisionMetadata<Integer> metadata);


}
