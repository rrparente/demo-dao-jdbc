package model.dao;

import java.util.List;

import model.entities.Department;
import model.entities.Seller;

public interface SellerDao {

	void insert(Seller dept);
	void update(Seller dept);
	void deleteById(Integer id);
	Seller findById(Integer id);
	List<Department> findAll();
	List<Seller> findByDepartment(Department department);
	
}