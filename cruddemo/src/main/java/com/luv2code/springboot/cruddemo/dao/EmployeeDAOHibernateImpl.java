package com.luv2code.springboot.cruddemo.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.luv2code.springboot.cruddemo.entity.Employee;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public class EmployeeDAOHibernateImpl implements EmployeeDAO {
	private EntityManager entityManager;
	
	@Autowired
	public EmployeeDAOHibernateImpl(EntityManager theEntityManager) {
		entityManager=theEntityManager;
	}
	
	@Override
	@Transactional
	public List<Employee> findAll() {
		Session currentSession=entityManager.unwrap(Session.class);
		Query<Employee> theQuery=currentSession.createQuery("from Employee",Employee.class);
		List<Employee> employees=theQuery.getResultList();
		
		return employees;
	}

	@Override
	public Employee findById(int theId) {
		Session currentSession=entityManager.unwrap(Session.class);
		Query<Employee> theQuery=currentSession.createQuery("from Employee",Employee.class);
		List<Employee> employees=theQuery.getResultList();
		
		return employees.get(theId);
		
	}

	@Override
	public void save(Employee theEmployee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(int theId) {
		// TODO Auto-generated method stub
		
	}

}
