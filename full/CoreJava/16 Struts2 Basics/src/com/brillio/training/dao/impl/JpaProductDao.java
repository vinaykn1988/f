package com.brillio.training.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.brillio.training.dao.DaoException;
import com.brillio.training.dao.ProductDao;
import com.brillio.training.entity.Product;

public class JpaProductDao implements ProductDao {

	private EntityManager getEntityManager() {
		EntityManagerFactory emf = 
				Persistence.createEntityManagerFactory("nwind-pu");
		return emf.createEntityManager();
	}

	@Override
	public void addProduct(Product product) throws DaoException {
		try {
			EntityManager em = getEntityManager();
			EntityTransaction tx = em.getTransaction();
			try {
				tx.begin();
				em.persist(product);
				tx.commit();
			} finally {
				em.close();
			}
		} catch (Exception e) {
			throw new DaoException(e);
		}
	}

	@Override
	public Product getProduct(int productId) throws DaoException {
		try {
			EntityManager em = getEntityManager();
			Product p = em.find(Product.class, productId);
			em.close();
			return p;
		} catch (Exception e) {
			throw new DaoException(e);
		}
	}

	@Override
	public void updateProduct(Product product) throws DaoException {
		try {
			EntityManager em = getEntityManager();
			EntityTransaction tx = em.getTransaction();
			try {
				tx.begin();
				em.merge(product);
				tx.commit();
			} finally {
				em.close();
			}
		} catch (Exception e) {
			throw new DaoException(e);
		}
	}

	@Override
	public void deleteProduct(int productId) throws DaoException {
		throw new DaoException("Deletion of product prohibited");
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getAllProducts() throws DaoException {
		try {
			EntityManager em = getEntityManager();
			String jql = "select p from Product p";
			Query qry = em.createQuery(jql);
			List<Product> list = qry.getResultList();
			em.close();
			
			return list;
		} catch (Exception e) {
			throw new DaoException(e);
		}
	}

	@Override
	public List<Product> getProductsByPriceRange(double min, double max) throws DaoException {
		try {
			EntityManager em = getEntityManager();
			String jql = "select p from Product p where p.unitPrice between ? and ?";
			Query qry = em.createQuery(jql);
			qry.setParameter(1, min);
			qry.setParameter(2, max);
			List<Product> list = qry.getResultList();
			em.close();
			
			return list;
		} catch (Exception e) {
			throw new DaoException(e);
		}
	}

	@Override
	public List<Product> getProductsByCategory(int categoryId) throws DaoException {
		String jql = "select p from Product p where p.categoryId = ?";
		return null;
	}

	@Override
	public List<Product> getProductsBySupplier(int supplierId) throws DaoException {
		return null;
	}

	@Override
	public List<Product> getProductsInStock() throws DaoException {
		return null;
	}

	@Override
	public List<Product> getProductsNotInStock() throws DaoException {
		return null;
	}

}
