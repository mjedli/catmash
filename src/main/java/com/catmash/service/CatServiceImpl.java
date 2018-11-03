/**
 * 
 */
package com.catmash.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.catmash.dao.CatDao;
import com.catmash.model.Cat;

/**
 * @author mjedli
 *
 */
@Service("catService")
@Transactional
public class CatServiceImpl implements CatService {

	@Autowired
	private CatDao catDao;
	
	/* (non-Javadoc)
	 * @see com.catmash.service.CatService#findById(java.lang.String)
	 */
	public Cat findCatById(String id) {
		return catDao.findCatById(id);
	}

	/* (non-Javadoc)
	 * @see com.catmash.service.CatService#saveCat(com.catmash.model.Cat)
	 */
	public void saveCat(Cat cat) {
		catDao.saveCat(cat);
	}

	/* (non-Javadoc)
	 * @see com.catmash.service.CatService#deleteCatById(java.lang.String)
	 */
	public void deleteCatById(String id) {
		catDao.deleteCatById(id);
	}

	/* (non-Javadoc)
	 * @see com.catmash.service.CatService#findAllCats()
	 */
	public List<Cat> findAllCats() {
		return catDao.findAllCats();
	}

	/* (non-Javadoc)
	 * @see com.catmash.service.CatService#updateScore(com.catmash.model.Cat)
	 */
	public void updateScore(Cat cat) {
		catDao.updateScore(cat);
	}

}
