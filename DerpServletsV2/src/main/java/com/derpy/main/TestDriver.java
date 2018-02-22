package com.derpy.main;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.derpy.domain.Comment;
import com.derpy.domain.User;
import com.derpy.domain.Vote;
import com.derpy.util.HibernateUtil;

public class TestDriver {
	public static void main(String[] args) {
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		User u = new User("derp", "derp");
		s.saveOrUpdate(u);
		Comment c = new Comment("This is a comment", u);
		s.saveOrUpdate(c);
		Vote v = new Vote(-1, "DOG", u);
		s.saveOrUpdate(v);
		tx.commit();
		s.close();
		
		
	}
}
