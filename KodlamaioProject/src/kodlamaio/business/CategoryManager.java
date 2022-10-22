package kodlamaio.business;

import java.util.ArrayList;
import java.util.List;

import kodlamaio.core.logging.Logger;
import kodlamaio.dataAccess.CategoryDao;
import kodlamaio.entities.Category;

public class CategoryManager {
    private CategoryDao categoryDao;
    private Logger[] loggers;    
    List<Category> categoryList = new ArrayList<Category>();

    public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;        
    }

   public void add(Category category) throws Exception {
        
    for (Category category_ : categoryList) {
            if(category_.getCategoryName().equals(category.getCategoryName())){
                throw new Exception("Kategori ismi aynı olamaz !!");
            }

        }
        
        categoryList.add(category);
        categoryDao.add(category);

        for (Logger logger : loggers) {
            logger.log(category.getCategoryName());
        }
   }



    
}
