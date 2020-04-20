package com.project.BMS;

import com.project.BMS.models.dto.Movie;
import com.project.BMS.models.dto.Theatre;
import com.project.BMS.services.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {
	private TheatreService theatreService;
	private MovieService movieService;
	private OwnerService ownerService;
	private UserService userService;
	private CityService cityService;

	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

	@RequestMapping("/test")
	public String test() {
		return "This is the test page.";
	}

//	@RequestMapping("/movies")
//	public List<Movie> movies(){
//		return movieService.listMovies();
//	}

	@RequestMapping(method=RequestMethod.POST, value="/owner/addTheatre/")
	public String addTheatre(@PathVariable String userName, @PathVariable Theatre theatre){
		return ownerService.addTheatre(userName, theatre);
	}

	@RequestMapping(method=RequestMethod.POST, value="/owner/addTheatres/")
	public String addTheatres(@PathVariable String userName, @PathVariable List<Theatre> theatres){
		return ownerService.addTheatres(userName, theatres);
	}

	@RequestMapping(method=RequestMethod.POST, value="/owner/addMovie/")
	public String addMovie(@PathVariable String userName, @PathVariable Movie movie){
		return ownerService.addMovie(userName, movie);
	}

	@RequestMapping(method=RequestMethod.POST, value="/owner/addMovies/")
	public String addMovies(@PathVariable String userName, @PathVariable List<Movie> movies){
		return ownerService.addMovies(userName, movies);
	}

	@RequestMapping(method=RequestMethod.POST, value="/owner/add/")
	public String registerOwner(@PathVariable String userName){
		return ownerService.register(userName);
	}

	@RequestMapping(method=RequestMethod.POST, value="/user/add/")
	public String registerUser(@PathVariable String userName){
		return userService.register(userName);
	}

	@RequestMapping(method=RequestMethod.GET, value="/owner/getCities/")
	public List<String> getCitiesForOwner(@PathVariable String userName){
		return ownerService.listCities(userName);
	}

	@RequestMapping("/cities")
	public List<String> getAllCities(){
		return cityService.getAllCityNames();
	}

	@RequestMapping("user/movies/{cityName}")
	public List<String> moviesForCity(@PathVariable String cityName){
		return null;
	}
}
