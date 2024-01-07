package model.dao;

import model.entities.Department;
import model.entities.Seller;

import java.util.List;

public interface SellerDao extends DAO<Seller>{
    List<Seller> findByDepartment(Department department);
}
