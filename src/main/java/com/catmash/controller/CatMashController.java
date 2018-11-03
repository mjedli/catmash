/**
 * 
 */
package com.catmash.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.catmash.model.Cat;
import com.catmash.service.CatService;

/**
 * CATMASH REST CONTROLLER
 * @author mjedli
 *
 */
@RestController
public class CatMashController {

	@Autowired
	private CatService service;
	
	/**
	 * Get all cats
	 * @return list of cats
	 */
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping("/cats")
	public List<Cat> findAllCats() {
		try {
			return service.findAllCats();
		} catch (Exception e) {
			return null;
		}
	}
	
	/**
	 * Update the score of cat
	 * @param id : the id of cat
	 * @param url : the url of cat
	 */
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping("/updateScore")
	public int updateScore(@RequestParam(value="id") String id, 
			@RequestParam(value="url") String url) {
		
		try {
			
			Cat cat = service.findCatById(id);
		
			if (cat != null) {
				
				int currentScore = cat.getScore() + 1;
				cat.setScore(currentScore);
				service.updateScore(cat);
				
			} else {
				
				cat = new Cat();
				cat.setId(id);
				cat.setUrl(url);
				cat.setScore(1);
				
				service.saveCat(cat);
			}
			
			return 1;
			
		} catch(Exception e) {
			return 0;
		}
		
	}
	
}
