package com.capp.tech.model.dto.revision;

import com.capp.tech.model.dto.AttributeLimitRangeDto;

import java.time.LocalDateTime;

public class AttributeLimitRangeRevisionDto extends AttributeLimitRangeDto {

    private LocalDateTime revisionDateTime;
    private Integer revisionNumber;

    public LocalDateTime getRevisionDateTime() {
        return revisionDateTime;
    }

    public void setRevisionDateTime(LocalDateTime revisionDateTime) {
        this.revisionDateTime = revisionDateTime;
    }

    public Integer getRevisionNumber() {
        return revisionNumber;
    }

    public void setRevisionNumber(Integer revisionNumber) {
        this.revisionNumber = revisionNumber;
    }


}
