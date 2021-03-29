package com.cmc.gestion.gestiondoc.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.cmc.gestion.gestiondoc.entity.GdSubserie;


	@RepositoryRestResource(collectionResourceRel = "subserie", path = "subserie")
	public interface SubserieDao  extends PagingAndSortingRepository<GdSubserie, Integer> {

	 

}
