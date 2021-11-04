package com.github.rogermds.citiesapi.countries.repository;

import com.github.rogermds.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
