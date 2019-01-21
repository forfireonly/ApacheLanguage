package com.example.annascott.apachelanguage;

import java.util.Locale;

public class Category {

    private int mCategoryName;


    private int mCategoryColor;

    public Category (int categoryName, int categoryColor){
        mCategoryName = categoryName;
        mCategoryColor = categoryColor;
    }

    public int getCategoryNameID()  {
        return mCategoryName;
    }

    public int getCategoryColor()  {
        return mCategoryColor;
    }
}

