/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.winda.resto.dao;

import id.winda.resto.model.Product;
import java.util.List;

/**
 *
 *
 */
public interface ProductDAO {
    
    public boolean insert(Product p);
    
    public boolean update(Product p);
    
    public boolean delete(Product p);
    
    public List<Product> getAllProduct();
    
    public Product getByID(String id);
    
    public List<Product> getByName(String name);
    
}
