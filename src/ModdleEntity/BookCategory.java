/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModdleEntity;
import javax.persistence.*;

/**
 *
 * @author duncan
 */
@Entity
@Table(name="Book")
public class BookCategory {
    private String categoryId;
    private String categoryName;
    
    public BookCategory(){}

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return "BookCategory{" + "categoryId=" + categoryId + ", categoryName=" + categoryName + '}';
    }
    
}
