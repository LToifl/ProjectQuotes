package com.example.projectquotes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SearchView;

import com.example.projectquotes.categories.CategoriesAdapter;
import com.example.projectquotes.categories.CategoriesList;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private final List<CategoriesList> categoriesList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RecyclerView categoriesRecyclerView = findViewById(R.id.categoriesRecyclerView);

        categoriesRecyclerView.setHasFixedSize(true);
        categoriesRecyclerView.setLayoutManager(new GridLayoutManager(MainActivity.this,2));

        CategoriesList ageCategory = new CategoriesList("Age", R.drawable.age);
        categoriesList.add(ageCategory);

        CategoriesList aloneCategory = new CategoriesList("Alone", R.drawable.alone);
        categoriesList.add(aloneCategory);

        CategoriesList amazingCategory = new CategoriesList("Amazing", R.drawable.age);
        categoriesList.add(amazingCategory);

        CategoriesList angerCategory = new CategoriesList("Anger", R.drawable.age);
        categoriesList.add(angerCategory);

        CategoriesList architectureCategory = new CategoriesList("Architecture", R.drawable.age);
        categoriesList.add(architectureCategory);

        CategoriesList artCategory = new CategoriesList("Art", R.drawable.age);
        categoriesList.add(artCategory);

        CategoriesList attitudeCategory = new CategoriesList("Attitude", R.drawable.age);
        categoriesList.add(attitudeCategory);

        CategoriesList beautyCategory = new CategoriesList("Beauty", R.drawable.age);
        categoriesList.add(beautyCategory);

        CategoriesList bestCategory = new CategoriesList("Best", R.drawable.age);
        categoriesList.add(bestCategory);

        CategoriesList birthdayCategory = new CategoriesList("Birthday", R.drawable.age);
        categoriesList.add(birthdayCategory);

        CategoriesList businessCategory = new CategoriesList("Business", R.drawable.age);
        categoriesList.add(businessCategory);

        CategoriesList carCategory = new CategoriesList("Car", R.drawable.age);
        categoriesList.add(carCategory);

        CategoriesList changeCategory = new CategoriesList("Change", R.drawable.age);
        categoriesList.add(changeCategory);

        CategoriesList communicationsCategory = new CategoriesList("Communications", R.drawable.age);
        categoriesList.add(communicationsCategory);

        CategoriesList computersCategory = new CategoriesList("Computers", R.drawable.age);
        categoriesList.add(computersCategory);

        CategoriesList coolCategory = new CategoriesList("Cool", R.drawable.age);
        categoriesList.add(coolCategory);

        CategoriesList courageCategory = new CategoriesList("Courage", R.drawable.age);
        categoriesList.add(courageCategory);

        CategoriesList dadCategory = new CategoriesList("Dad", R.drawable.age);
        categoriesList.add(dadCategory);

        CategoriesList datingCategory = new CategoriesList("Dating", R.drawable.age);
        categoriesList.add(datingCategory);

        CategoriesList deathCategory = new CategoriesList("Death", R.drawable.age);
        categoriesList.add(deathCategory);

        CategoriesList designCategory = new CategoriesList("Design", R.drawable.age);
        categoriesList.add(designCategory);

        CategoriesList dreamsCategory = new CategoriesList("Dreams", R.drawable.age);
        categoriesList.add(dreamsCategory);

        CategoriesList educationCategory = new CategoriesList("Education", R.drawable.age);
        categoriesList.add(educationCategory);

        CategoriesList environmentalCategory = new CategoriesList("Environmental", R.drawable.age);
        categoriesList.add(environmentalCategory);

        CategoriesList equalityCategory = new CategoriesList("Equality", R.drawable.age);
        categoriesList.add(equalityCategory);

        CategoriesList experienceCategory = new CategoriesList("Experience", R.drawable.age);
        categoriesList.add(experienceCategory);

        CategoriesList failureCategory = new CategoriesList("Failure", R.drawable.age);
        categoriesList.add(failureCategory);

        CategoriesList faithCategory = new CategoriesList("Faith", R.drawable.age);
        categoriesList.add(faithCategory);

        CategoriesList familyCategory = new CategoriesList("Family", R.drawable.age);
        categoriesList.add(familyCategory);

        CategoriesList famousCategory = new CategoriesList("Famous", R.drawable.age);
        categoriesList.add(famousCategory);

        CategoriesList fearCategory = new CategoriesList("Fear", R.drawable.age);
        categoriesList.add(fearCategory);

        CategoriesList fitnessCategory = new CategoriesList("Fitness", R.drawable.age);
        categoriesList.add(fitnessCategory);

        CategoriesList foodCategory = new CategoriesList("Food", R.drawable.age);
        categoriesList.add(foodCategory);

        CategoriesList forgivenessCategory = new CategoriesList("Forgiveness", R.drawable.age);
        categoriesList.add(forgivenessCategory);

        CategoriesList freedomCategory = new CategoriesList("Freedom", R.drawable.age);
        categoriesList.add(freedomCategory);

        CategoriesList friendshipCategory = new CategoriesList("Friendship", R.drawable.age);
        categoriesList.add(friendshipCategory);

        CategoriesList funnyCategory = new CategoriesList("Funny", R.drawable.age);
        categoriesList.add(funnyCategory);

        CategoriesList futureCategory = new CategoriesList("Future", R.drawable.age);
        categoriesList.add(futureCategory);

        CategoriesList godCategory = new CategoriesList("God", R.drawable.age);
        categoriesList.add(godCategory);

        CategoriesList goodCategory = new CategoriesList("Good", R.drawable.age);
        categoriesList.add(goodCategory);

        CategoriesList governmentCategory = new CategoriesList("Government", R.drawable.age);
        categoriesList.add(governmentCategory);

        CategoriesList graduationCategory = new CategoriesList("Graduation", R.drawable.age);
        categoriesList.add(graduationCategory);

        CategoriesList greatCategory = new CategoriesList("Great", R.drawable.age);
        categoriesList.add(greatCategory);

        CategoriesList happinessCategory = new CategoriesList("Happiness", R.drawable.age);
        categoriesList.add(happinessCategory);

        CategoriesList healthCategory = new CategoriesList("Health", R.drawable.age);
        categoriesList.add(healthCategory);

        CategoriesList historyCategory = new CategoriesList("History", R.drawable.age);
        categoriesList.add(historyCategory);

        CategoriesList homeCategory = new CategoriesList("Home", R.drawable.age);
        categoriesList.add(homeCategory);

        CategoriesList hopeCategory = new CategoriesList("Hope", R.drawable.age);
        categoriesList.add(hopeCategory);

        CategoriesList humorCategory = new CategoriesList("Humor", R.drawable.age);
        categoriesList.add(humorCategory);

        CategoriesList imaginationCategory = new CategoriesList("Imagination", R.drawable.age);
        categoriesList.add(imaginationCategory);

        CategoriesList inspirationalCategory = new CategoriesList("Inspirational", R.drawable.age);
        categoriesList.add(inspirationalCategory);

        CategoriesList intelligenceCategory = new CategoriesList("Intelligence", R.drawable.age);
        categoriesList.add(intelligenceCategory);

        CategoriesList jealousyCategory = new CategoriesList("Jealousy", R.drawable.age);
        categoriesList.add(jealousyCategory);

        CategoriesList knowledgeCategory = new CategoriesList("Knowledge", R.drawable.age);
        categoriesList.add(knowledgeCategory);

        CategoriesList leadershipCategory = new CategoriesList("Leadership", R.drawable.age);
        categoriesList.add(leadershipCategory);

        CategoriesList learningCategory = new CategoriesList("Learning", R.drawable.age);
        categoriesList.add(learningCategory);

        CategoriesList legalCategory = new CategoriesList("Legal", R.drawable.age);
        categoriesList.add(legalCategory);

        CategoriesList lifeCategory = new CategoriesList("Life", R.drawable.age);
        categoriesList.add(lifeCategory);

        CategoriesList loveCategory = new CategoriesList("Love", R.drawable.age);
        categoriesList.add(loveCategory);

        CategoriesList marriageCategory = new CategoriesList("Marriage", R.drawable.age);
        categoriesList.add(marriageCategory);

        CategoriesList medicalCategory = new CategoriesList("Medical", R.drawable.age);
        categoriesList.add(medicalCategory);

        CategoriesList menCategory = new CategoriesList("Men", R.drawable.age);
        categoriesList.add(menCategory);

        CategoriesList momCategory = new CategoriesList("Mom", R.drawable.age);
        categoriesList.add(momCategory);

        CategoriesList moneyCategory = new CategoriesList("Money", R.drawable.age);
        categoriesList.add(moneyCategory);

        CategoriesList morningCategory = new CategoriesList("Morning", R.drawable.age);
        categoriesList.add(morningCategory);

        CategoriesList moviesCategory = new CategoriesList("Movies", R.drawable.age);
        categoriesList.add(moviesCategory);

        CategoriesList successCategory = new CategoriesList("success", R.drawable.age);
        categoriesList.add(successCategory);

        categoriesRecyclerView.setAdapter(new CategoriesAdapter(categoriesList, MainActivity.this));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);

        MenuItem menuItem = menu.findItem(R.id.search);
        SearchView searchView = (SearchView) menuItem.getActionView();
        searchView.setQueryHint("Type name of category");

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                categoriesList.contains(s);
                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }
}