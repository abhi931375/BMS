package com.project.BMS;

import com.project.BMS.models.Movie;
import com.project.BMS.services.MovieService;
import com.project.BMS.services.TheatreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HelloController {

	@Autowired
	private TheatreService theatreService;
	@Autowired
	private MovieService movieService;

	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

	@RequestMapping("/test")
	public String test() {
		return "This is the test page.";
	}

//	@RequestMapping("/add/{theatre}/{city}")
//	public String addTheatre(@PathVariable String theatre, String city){
//		return theatreService.addNewMovieTheatre(theatre, city);
//	}

//	@RequestMapping(method= RequestMethod.POST, value = "/movie")
//	public void addMovie(@RequestBody Movie movie){
//		movieService.add(movie);
//	}

	@RequestMapping("/movies")
	public List<Movie> movies(){
		return movieService.listMovies();
	}
}
