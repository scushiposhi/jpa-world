package it.objectmethod.jpaworld.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.objectmethod.jpaworld.entity.City;
import it.objectmethod.jpaworld.repository.CityRepository;


@CrossOrigin
@RestController
@RequestMapping("/api")
public class CityController {

	@Autowired
	private CityRepository cityRepo;

	@GetMapping("/cities/{id}")
	public City findCityById(@PathVariable("id") Long id) {
		City city = cityRepo.findOne(id);
		return city;
	}

	@DeleteMapping("/cities/{id}")
	public void deleteCityById(@PathVariable("id") Long id) {
		cityRepo.delete(id);
	}

	@PostMapping("/cities")
	public void insertCity(@RequestBody City citta) {
		citta.setId(0L);
		cityRepo.save(citta);
	}

	@PutMapping("/cities")
	public void updateCity(@RequestBody City citta) {
		cityRepo.save(citta);
	}

	@GetMapping("/cities")
	public List<City> findByCode(@RequestParam(name = "codice", defaultValue = "ITA") String code) {
		return cityRepo.findByCode(code);
	}

}
