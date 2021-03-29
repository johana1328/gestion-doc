package com.cmc.gestion.gestiondoc.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.cmc.gestion.gestiondoc.entity.GdTipoDocumental;

@RepositoryRestResource(collectionResourceRel = "tipoDocumental", path = "tipoDocumental")
public interface TipoDocumental extends PagingAndSortingRepository<GdTipoDocumental, Integer> {


}