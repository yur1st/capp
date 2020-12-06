package com.capp.tech.mapping;

import com.capp.tech.model.dto.AttributeLimitRangeDto;
import com.capp.tech.model.dto.revision.AttributeLimitRangeRevisionDto;
import com.capp.tech.model.entity.AttributeLimitRange;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.ReportingPolicy;
import org.springframework.data.history.Revision;
import org.springframework.data.history.RevisionMetadata;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

@Mapper(unmappedSourcePolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface AttributeLimitRangeMapper {

    @Mapping(source = "id", target = "attributeLimitRangeId")
    AttributeLimitRangeDto toDto(AttributeLimitRange range);

    @Mapping(source = "entity", target = "attributeLimitRangeId", qualifiedByName = "entityId")
    @Mapping(source = "entity", target = "attributeLimitRangeMin", qualifiedByName = "entityMin")
    @Mapping(source = "entity", target = "attributeLimitRangeMax", qualifiedByName = "entityMax")
    @Mapping(source = "metadata", target = "revisionDateTime", qualifiedByName = "revDate")
    @Mapping(source = "metadata", target = "revisionNumber", qualifiedByName = "revNumber")
    AttributeLimitRangeRevisionDto toRevisionDto(Revision<Integer, AttributeLimitRange> revision);

    @Named("entityId")
    static long getEntityId(AttributeLimitRange range) {
        return range.getId();
    }

    @Named("entityMin")
    static double getEntityMin(AttributeLimitRange range) {
        return range.getAttributeLimitRangeMin();
    }

    @Named("entityMax")
    static double getEntityMax(AttributeLimitRange range) {
        return range.getAttributeLimitRangeMax();
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
