package it.objectmethod.jpaworld.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.objectmethod.jpaworld.entity.Country;
import it.objectmethod.jpaworld.repository.CountryRepository;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class CountryController {

	@Autowired
	private CountryRepository countryRepo;

	@RequestMapping("/continents")
	public List<String> getContinents() {
		return countryRepo.getAllContinents();
	}

	@RequestMapping("/countries/all")
	public List<Country> getCountries() {
		return countryRepo.findAll();
	}

	@GetMapping("/countries")
	public List<Country> getCountriesByContient(
			@RequestParam(name = "continente", defaultValue = "Europe") String continent) {
		return countryRepo.getCountriesByContinent(continent);
	}

}
