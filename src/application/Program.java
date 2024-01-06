package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== Test 1: seller findById ======");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("\n=== Test 2: seller findByDepartment ======");
        Department dep = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(dep);
        list.forEach(System.out::println);

        System.out.println("\n=== Test 3: seller findAll ======");
        list = sellerDao.findAll();
        list.forEach(System.out::println);
    }
}
