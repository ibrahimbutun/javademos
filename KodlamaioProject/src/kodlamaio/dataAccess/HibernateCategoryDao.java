package kodlamaio.dataAccess;

import kodlamaio.entities.Category;

public class HibernateCategoryDao implements CategoryDao {
    public void add(Category category) {
        System.out.println("-----------------------------");
        System.out.println("Kategori Hibernate veritabanına eklendi!");
    }
}
