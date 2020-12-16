package com.capp.tech.services;

import com.capp.tech.mapping.CommonMapper;
import com.capp.tech.model.dto.UnitDto;
import com.capp.tech.model.dto.revision.UnitRevisionDto;
import com.capp.tech.model.entity.Unit;
import com.capp.tech.repository.datajpa.UnitRepository;
import org.springframework.stereotype.Service;

@Service
public class UnitService extends AbstractService<Unit, UnitRepository,
        UnitDto, UnitRevisionDto, CommonMapper<Unit, UnitDto, UnitRevisionDto>> {

    public UnitService(UnitRepository repository, CommonMapper<Unit, UnitDto, UnitRevisionDto> mapper) {
        super(repository, mapper);
    }
}

