package com.entertainment.ourvault.mapper.utils;

import java.util.List;

public interface BaseMapper<D, E> {

    public D entityToDto(E entity);

    public E dtoToEntity(D dto);

    public List<D> entitiesToDtos(List<E> entities);

    public List<E> dtosToEntities(List<D> dtos);

    public D entityToDtoBasic(E entity);

    public E dtoToEntityBasic(D dto);

    public List<D> entitiesToDtosBasic(List<E> entities);

    public List<E> dtosToEntitiesBasic(List<D> dtos);
}
