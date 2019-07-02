package it.objectmethod.jpaworld.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import it.objectmethod.jpaworld.entity.Country;

public interface CountryRepository extends JpaRepository<Country, String> {
	
	@Query("select distinct continent from Country c ")
	public List<String> getAllContinents();
	
	@Query("select c from Country c where continent = :continente")
	public List<Country> getCountriesByContinent(@Param("continente") String continent);

}
