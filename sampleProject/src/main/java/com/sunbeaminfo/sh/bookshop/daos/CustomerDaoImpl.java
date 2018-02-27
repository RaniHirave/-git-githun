package com.sunbeaminfo.sh.bookshop.daos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sunbeaminfo.sh.bookshop.pojos.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {
	@Autowired
	private SessionFactory factory;

	public Customer getCustomer(String email) {
		Session session = factory.getCurrentSession();
		String hql = "from Customer c where c.email = :p_email"; 
		Query<Customer> q = session.createQuery(hql);
		q.setParameter("p_email", email);
		return q.uniqueResult();
	}

	public int addCustomer(Customer c) {
		Session session = factory.getCurrentSession();
		session.persist(c);
		return 1;
	}
}




