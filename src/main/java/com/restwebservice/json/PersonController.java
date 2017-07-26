package com.restwebservice.json;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

	@RequestMapping(value = "/employees", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Person> getEmployees() {
		List<Person> listOfCountries = new ArrayList<Person>();
		listOfCountries = createCountryList();
		return listOfCountries;
	}

	@RequestMapping(value = "/employees/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Person getEmployeeById(@PathVariable int id) {
		List<Person> listOfPersons = new ArrayList<Person>();
		listOfPersons = createCountryList();

		for (Person person : listOfPersons) {
			if (person.getId() == id)
				return person;
		}

		return null;
	}

	// Utiliy method to create country list.
	public List<Person> createCountryList() {
		Person pavan = new Person(1, "pavan");
		Person narasimha = new Person(4, "narasimha");
		Person manikanta = new Person(3, "manikanta");
		Person sriramulu = new Person(2, "sriramulu");

		List<Person> listOfCountries = new ArrayList<Person>();
		listOfCountries.add(pavan);
		listOfCountries.add(narasimha);
		listOfCountries.add(manikanta);
		listOfCountries.add(sriramulu);
		return listOfCountries;
	}

}
