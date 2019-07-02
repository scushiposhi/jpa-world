package it.objectmethod.jpaworld.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import it.objectmethod.jpaworld.entity.City;


@Repository
public interface CityRepository extends JpaRepository<City, Long>{//<EntitàTabella-Classe,tipo ID>
//"select c from City c ->estrai l'istanza c dalla classe City che mappa la tabella city
//!! in JPA le QUERY USANO I NOMI DEI FIELDS DELLA CLASSE CHE MAPPA LA TABELLA NON PIU' LE COLONNE DI QUESTA
	@Query(value="select c from City c where c.countryCode = 'ITA'")//countryCode->FIELD classe Country e non db
	public List<City> findItalianCities();
	
	@Query(value="select c from City c where c.name= :nameV")
	public List<City> findByName(@Param("nameV")String nome);
	
	@Query(value="select c from City c where c.countryCode = :code")
	public List<City> findByCode(@Param ("code") String codice);
	
}
