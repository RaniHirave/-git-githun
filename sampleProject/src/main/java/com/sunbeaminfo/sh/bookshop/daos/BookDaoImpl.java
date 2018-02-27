package com.sunbeaminfo.sh.bookshop.daos;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sunbeaminfo.sh.bookshop.pojos.Book;

@Repository
public class BookDaoImpl implements BookDao {
	@Autowired
	private SessionFactory factory;
	
	public List<String> getSubjects() {
		Session session = factory.getCurrentSession();
		String hql = "select distinct b.subject from Book b";
		Query<String> q = session.createQuery(hql);
		return q.getResultList();
	}
	
	public List<Book> getBooksOfSubject(String subject) {
		Session session = factory.getCurrentSession();
		String hql = "from Book b where b.subject = :p_subject";
		Query<Book> q = session.createQuery(hql);
		q.setParameter("p_subject", subject);
		return q.getResultList();
	}
	
	public Book getBook(int id) {
		Session session = factory.getCurrentSession();
		String hql = "from Book b where b.id = :p_id";
		Query<Book> q = session.createQuery(hql);
		q.setParameter("p_id", id);
		return q.uniqueResult();
	}
	
	public int addBook(Book b){
		Session session = factory.getCurrentSession();
		session.save(b);
		return 1;
	}	
}















