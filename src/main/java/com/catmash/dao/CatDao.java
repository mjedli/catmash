/**
 * 
 */
package com.catmash.dao;

import java.util.List;
import com.catmash.model.Cat;

/**
 * CAT DAO
 * @author mjedli
 *
 */
public interface CatDao {
		
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
	 * @return all cats
	 */
	List<Cat> findAllCats();

	/**
	 * Update the score of the cat
	 * @param cat
	 * @return void
	 */
	void updateScore(Cat cat);
}
