package com.capp.tech.mapping;

import com.capp.tech.model.dto.AttributeLimitRangeDto;
import com.capp.tech.model.dto.revision.AttributeLimitRangeRevisionDto;
import com.capp.tech.model.entity.AttributeLimitRange;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.springframework.data.history.Revision;
import org.springframework.data.history.RevisionMetadata;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

@Mapper
public interface AttributeLimitRangeMapper {

    AttributeLimitRangeDto toDto(AttributeLimitRange range);

    @Mapping(source = "entity", target = "id", qualifiedByName = "entityId")
    @Mapping(source = "entity", target = "min", qualifiedByName = "entityMin")
    @Mapping(source = "entity", target = "max", qualifiedByName = "entityMax")
    @Mapping(source = "metadata", target = "revisionDateTime", qualifiedByName = "revDate")
    @Mapping(source = "metadata", target = "revisionNumber", qualifiedByName = "revNumber")
    AttributeLimitRangeRevisionDto toRevisionDto(Revision<Integer, AttributeLimitRange> revision);

    @Named("entityId")
    static long getEntityId(AttributeLimitRange range) {
        return range.getId();
    }

    @Named("entityMin")
    static double getEntityMin(AttributeLimitRange range) {
        return range.getMin();
    }

    @Named("entityMax")
    static double getEntityMax(AttributeLimitRange range) {
        return range.getMax();
    }

    @Named("revDate")
    static LocalDateTime getRevisionDate(RevisionMetadata<Integer> metadata) {
        return LocalDateTime.ofInstant(metadata.getRequiredRevisionInstant(), ZoneOffset.UTC);
    }

    @Named("revNumber")
    static Integer getRevisionNumber(RevisionMetadata<Integer> metadata) {
        return metadata.getRevisionNumber().orElseThrow();
    }


}
