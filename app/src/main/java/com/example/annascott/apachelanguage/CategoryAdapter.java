package com.example.annascott.apachelanguage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static com.example.annascott.apachelanguage.R.color.category_colors;
import static com.example.annascott.apachelanguage.R.color.category_family;
import static com.example.annascott.apachelanguage.R.color.category_numbers;
import static com.example.annascott.apachelanguage.R.color.category_phrases;

/**
 * {@link WordAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Word} objects.
 */
public class CategoryAdapter extends ArrayAdapter<Category>  {

    /** Resource ID for the background color for this list of words */
    private int mColorResourceId;

    /**
     * Create a new {@link WordAdapter} object.
     *  @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param categories is the list of {@link Word}s to be displayed.
     */
    public CategoryAdapter(Context context, ArrayList<Category> categories) {
        super(context, 0, categories);
       // mColorResourceId = colorResourceId;
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.category_list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Category currentCategory = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID miwok_text_view.
        TextView categoryTextView = (TextView) listItemView.findViewById(R.id.category_text_view);
        // Get the Miwok translation from the currentWord object and set this text on
        // the Miwok TextView.
        categoryTextView.setText(currentCategory.getCategoryNameID());

        int color = currentCategory.getCategoryColor();

        listItemView.setBackgroundResource(color);

    /*    if(position % 2 == 1) {

            // set some color

            listItemView.setBackgroundResource(category_numbers);
        } else if (position % 2 == 0){
            // set the other color
            listItemView.setBackgroundResource(category_family);
        } else if (position % 2 == 0.5){
            // set the other color
            listItemView.setBackgroundResource(category_colors);
        } else if (position/2 == 2){
            // set the other color
            listItemView.setBackgroundResource(category_phrases);
        } */


        // Set the theme color for the list item
       // View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
       //int color = ContextCompat.getCategoryColor(getContext(), mCategoryColor);
        // Set the background color of the text container View
       // textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}
