package com.capp.tech.mapping;

import com.capp.tech.model.dto.BaseDto;
import com.capp.tech.model.entity.BaseEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.springframework.data.history.RevisionMetadata;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

@Mapper
public interface CommonMapper<E extends BaseEntity, D extends BaseDto, R extends D> {

    D toDto(E entity);

    E toEntity(D dto);

    @Mapping(source = "metadata", target = "revisionDateTime", qualifiedByName = "revDate")
    R toRevisionDto(E entity, RevisionMetadata<Integer> metadata);

    @Named("revDate")
    static LocalDateTime getRevisionDate(RevisionMetadata<Integer> metadata) {
        return LocalDateTime.ofInstant(metadata.getRequiredRevisionInstant(), ZoneOffset.UTC);
    }
}
