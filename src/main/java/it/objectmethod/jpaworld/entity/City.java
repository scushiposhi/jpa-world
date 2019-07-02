package it.objectmethod.jpaworld.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "city")
public class City {

	//@ManyToOne//cities<->country
	//@JoinColumn(name="CountryCode")//la mia foreign key presente nella tabella City(non filed della classe)
	//private Country country;//responsabile del collegamento sfruttando la foreign key scritta sopra

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Long id;

	@Column(name = "Name")
	private String name;

	@Column(name = "Population")
	private Integer population;

	@Column(name = "CountryCode")
	private String countryCode;

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPopulation() {
		return population;
	}

	public void setPopulation(Integer population) {
		this.population = population;
	}


}
