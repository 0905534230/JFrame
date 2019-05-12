package vn.edu.vnuk.em.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import vn.edu.vnuk.em.dao.PersonDao;
import vn.edu.vnuk.em.model.Person;

public class Controller {
	
	public ArrayList<Person> getAllPersons(String keyword) throws SQLException {
		return (ArrayList<Person>) new PersonDao().read(keyword);
	}
	
}

