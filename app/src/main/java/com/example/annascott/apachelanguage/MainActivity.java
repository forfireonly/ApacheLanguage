package com.example.annascott.apachelanguage;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category_word_list);

        // Create a list of words
        ArrayList<Category> categories = new ArrayList<Category>();
        categories.add(new Category(R.string.category_numbers, R.color.category_numbers));
        categories.add(new Category(R.string.category_phrases, R.color.category_phrases));
        categories.add(new Category(R.string.category_family, R.color.category_family));
        categories.add(new Category(R.string.category_colors, R.color.category_colors));
        categories.add(new Category(R.string.category_animals, R.color.category_numbers));
        categories.add(new Category(R.string.category_months, R.color.category_phrases));
        categories.add(new Category(R.string.category_food, R.color.category_family));
        categories.add(new Category(R.string.category_days, R.color.category_colors));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        CategoryAdapter adapter = new CategoryAdapter(this, categories);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                switch (position) {

                    case (0):
                        // Get the {@link Word} object at the given position the user clicked on
                        Intent appInfo = new Intent(MainActivity.this, NumbersActivity.class);
                        startActivity(appInfo);
                        break;
                    case (1):
                        // Get the {@link Word} object at the given position the user clicked on
                        Intent appInfo1 = new Intent(MainActivity.this, PhrasesActivity.class);
                        startActivity(appInfo1);
                        break;

                    case (2):
                        // Get the {@link Word} object at the given position the user clicked on
                        Intent appInfo2 = new Intent(MainActivity.this, FamilyActivity.class);
                        startActivity(appInfo2);
                        break;
                    case (3):
                        // Get the {@link Word} object at the given position the user clicked on
                        Intent appInfo3 = new Intent(MainActivity.this, ColorsActivity.class);
                        startActivity(appInfo3);
                        break;
                    case (4):
                        // Get the {@link Word} object at the given position the user clicked on
                        Intent appInfo4 = new Intent(MainActivity.this, AnimalsActivity.class);
                        startActivity(appInfo4);
                        break;
                    case (5):
                        // Get the {@link Word} object at the given position the user clicked on
                        Intent appInfo5 = new Intent(MainActivity.this, MonthsActivity.class);
                        startActivity(appInfo5);
                        break;
                    case (6):
                        // Get the {@link Word} object at the given position the user clicked on
                        Intent appInfo6 = new Intent(MainActivity.this, FoodActivity.class);
                        startActivity(appInfo6);
                        break;
                    case (7):
                        // Get the {@link Word} object at the given position the user clicked on
                        Intent appInfo7 = new Intent(MainActivity.this, DaysActivity.class);
                        startActivity(appInfo7);
                        break;
                }}});}}



  /*  @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the numbers category
        TextView numbers = (TextView) findViewById(R.id.numbers);

        // Set a click listener on that View
        numbers.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);

                // Start the new activity
                startActivity(numbersIntent);
            }
        });

        // Find the View that shows the family category
        TextView family = (TextView) findViewById(R.id.family);

        // Set a click listener on that View
        family.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FamilyActivity}
                Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);

                // Start the new activity
                startActivity(familyIntent);
            }
        });

        // Find the View that shows the colors category
        TextView colors = (TextView) findViewById(R.id.colors);

        // Set a click listener on that View
        colors.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ColorsActivity}
                Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);

                // Start the new activity
                startActivity(colorsIntent);
            }
        });

        // Find the View that shows the phrases category
        TextView phrases = (TextView) findViewById(R.id.phrases);

        // Set a click listener on that View
        phrases.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PhrasesActivity}
                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);

                // Start the new activity
                startActivity(phrasesIntent);
            }
        });

        // Find the View that shows the phrases category
        TextView food = (TextView) findViewById(R.id.food);

        // Set a click listener on that View
        food.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PhrasesActivity}
                Intent foodIntent = new Intent(MainActivity.this, FoodActivity.class);

                // Start the new activity
                startActivity(foodIntent);
            }
        });

        // Find the View that shows the phrases category
        TextView animals = (TextView) findViewById(R.id.animals);

        // Set a click listener on that View
        animals.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PhrasesActivity}
                Intent animalsIntent = new Intent(MainActivity.this, AnimalsActivity.class);

                // Start the new activity
                startActivity(animalsIntent);
            }
        });

        TextView daysOfWeek = (TextView) findViewById(R.id.daysOfWeek);

        // Set a click listener on that View
        daysOfWeek.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent daysIntent = new Intent(MainActivity.this, DaysActivity.class);

                // Start the new activity
                startActivity(daysIntent);
            }
        });

        TextView months = (TextView) findViewById(R.id.months);

        // Set a click listener on that View
        months.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent monthIntent = new Intent(MainActivity.this, MonthsActivity.class);

                // Start the new activity
                startActivity(monthIntent);
            }
        });
    }*/

