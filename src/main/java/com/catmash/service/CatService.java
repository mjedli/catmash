package com.catmash.service;

import java.util.List;

import com.catmash.model.Cat;

/**
 * CATMASH SERVICE
 * @author mjedli
 *
 */
public interface CatService {
	
	/**
	 * Find Cat by ID
	 * @param id : id of cat
	 * @return Cat
	 */
	Cat findCatById(String id);
	
	/**
	 * Save Cat
	 * @param cat : Cat
	 */
	void saveCat(Cat cat);
	
	/**
	 * Delete Cat by ID
	 * @param id : id of cat
	 */
	void deleteCatById(String id);
	
	/**
	 * Find all cats
	 * @return
	 */
	List<Cat> findAllCats();

	/**
	 * update the score of the cat
	 * @param cat
	 */
	void updateScore(Cat cat);
}
