/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllerUtil;

import ControllerUtil.AbstractModel;
import ControllerUtil.bookCategoryController;
import ModdleEntity.BookCategory;

/**
 *
 * @author duncan
 */
public class bookCategoryController extends AbstractModel<BookCategory> {
    public bookCategoryController(){
        super(BookCategory.class);
    }
}
