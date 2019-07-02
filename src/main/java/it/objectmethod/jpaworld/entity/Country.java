package it.objectmethod.jpaworld.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "country")
public class Country {

	//bidirezionale:accedo a 'cities' da 'country' e viceversa|->mantenimento relationship a mio carico
	//@OneToMany(mappedBy = "country")//country<->cities
	//private List<City> cities;//mappedBy invia responsabilità al field country presente nella classe City

	@Id
	private String code;

	@Column(name = "Name")
	private String name;

	@Column(name = "Continent")
	private String continent;

	@Column(name = "Population")
	private int population;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

//	public List<City> getCities() {
//		return cities;
//	}
//
//	public void setCities(List<City> cities) {
//		this.cities = cities;
//	}

}