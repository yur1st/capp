package com.capp.tech.model.entity.revision;

import com.capp.tech.model.entity.User;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class UserRevision {
    private LocalDateTime revisionDateTime;
    private Integer revisionNumber;
    private User user;
}
