package com.example.foodrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class RecipeDetailsActivity extends AppCompatActivity {

    private TextView titleTxt, ingredientsTxt, instructionsTxt;
    private ImageView pic;
    private Recipe object;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_details);

        pic = findViewById(R.id.pic);
        titleTxt = findViewById(R.id.titleTxt);
        ingredientsTxt = findViewById(R.id.ingredientsTxt);
        instructionsTxt = findViewById(R.id.instructionsTxt);

        Intent intent = getIntent();
        if (intent != null) {
            object = (Recipe) intent.getSerializableExtra("object");
            if (object != null) {
                int drawableResourceId = this.getResources().getIdentifier(String.valueOf(object.getImageResourceId()), "drawable", this.getPackageName());
                Glide.with(this)
                        .load(drawableResourceId)
                        .into(pic);

                titleTxt.setText(object.getTitle());
                ingredientsTxt.setText(object.getIngredients());
                instructionsTxt.setText(object.getInstructions());
            }
        }
    }

}



