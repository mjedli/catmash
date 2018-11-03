/**
 * 
 */
package com.catmash.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.Criteria;
import org.hibernate.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.catmash.model.Cat;

/**
 * @author mjedli
 *
 */
@Repository("catDao")
public class CatDaoImpl implements CatDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	/* (non-Javadoc)
	 * @see com.catmash.dao.CatDao#findById(int)
	 */
	public Cat findCatById(String id) {
		return (Cat) sessionFactory.getCurrentSession().get(Cat.class, id);
	}

	/* (non-Javadoc)
	 * @see com.catmash.dao.CatDao#saveCat(com.catmash.model.Cat)
	 */
	public void saveCat(Cat cat) {
		sessionFactory.getCurrentSession().save(cat);
	}

	/* (non-Javadoc)
	 * @see com.catmash.dao.CatDao#deleteCatById(com.catmash.model.Cat)
	 */
	public void deleteCatById(String id) {
		Query query = sessionFactory.getCurrentSession()
				.createSQLQuery("delete from Cat where id = ':id'");
        query.setString("id", id);
        query.executeUpdate();
	}

	/* (non-Javadoc)
	 * @see com.catmash.dao.CatDao#findAllCats()
	 */
	public List<Cat> findAllCats() {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Cat.class);
        return (List<Cat>) criteria.list();
	}

	/* (non-Javadoc)
	 * @see com.catmash.dao.CatDao#updateScore(com.catmash.model.Cat)
	 */
	public void updateScore(Cat cat) {
		Query query = sessionFactory.getCurrentSession()
				.createSQLQuery("update cat set score = :score where id = :id");
		query.setInteger("score", cat.getScore());
		query.setString("id", cat.getId());
        query.executeUpdate();
	}

}
