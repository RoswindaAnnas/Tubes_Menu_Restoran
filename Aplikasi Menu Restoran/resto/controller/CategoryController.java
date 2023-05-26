/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.winda.resto.controller;

import id.winda.resto.dao.CategoryDAO;
import id.winda.resto.dao.CategoryDAOMySQL;
import id.winda.resto.model.Category;
import java.util.List;

/**
 *
 *
 */
public class CategoryController {
    private CategoryDAO dao = new CategoryDAOMySQL();
    
    public List<Category> getAllData() {
        return dao.getAllCategory();
    }
}
