package com.example.foodrecipe;

import static java.security.AccessController.getContext;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private CardView cardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardView = findViewById(R.id.card1);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Recipe selectedDrink = new Recipe("Avocado Toast with Poached Egg", "1 ripe avocado\n" +
                        "2 slices of whole-grain bread\n" +
                        "2 large eggs\n" +
                        "Salt and pepper to taste\n" +
                        "Optional toppings: red pepper flakes, cherry tomatoes, feta cheese", R.drawable.bf1, "Toast the slices of bread to your liking.\n" +
                        "While the bread is toasting, mash the ripe avocado in a bowl and season with salt and pepper.\n" +
                        "Poach the eggs by bringing a pot of water to a simmer, adding a splash of vinegar, and gently cracking the eggs into the simmering water. Cook for 3-4 minutes for a runny yolk.\n" +
                        "Spread the mashed avocado evenly on the toasted bread slices.\n" +
                        "Carefully place the poached eggs on top of the avocado.\n" +
                        "Sprinkle with additional salt, pepper, and any optional toppings you prefer");
                Intent intent = new Intent(MainActivity.this, RecipeDetailsActivity.class);
                intent.putExtra("object", selectedDrink);
                startActivity(intent);
            }
        });

        cardView = findViewById(R.id.card2);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Recipe selectedDrink = new Recipe("Greek Yogurt Parfait", "1 cup Greek yogurt\n" +
                        "1/2 cup granola\n" +
                        "1/2 cup mixed berries (strawberries, blueberries, raspberries)\n" +
                        "1 tablespoon honey\n" +
                        "Optional: chopped nuts (almonds, walnuts) for extra crunch", R.drawable.bf2, "In a glass or bowl, layer half of the Greek yogurt at the bottom.\n" +
                        "Add half of the granola on top of the yogurt.\n" +
                        "Add half of the mixed berries on top of the granola.\n" +
                        "Repeat the layers with the remaining yogurt, granola, and berries.\n" +
                        "Drizzle honey over the top and sprinkle with optional chopped nuts.\n" +
                        "Serve immediately and enjoy your healthy and delicious parfait.");
                Intent intent = new Intent(MainActivity.this, RecipeDetailsActivity.class);
                intent.putExtra("object", selectedDrink);
                startActivity(intent);
            }
        });

        cardView = findViewById(R.id.card3);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Recipe selectedDrink = new Recipe("Vegetarian Breakfast Burrito", "1 large tortilla\n" +
                        "2 eggs, scrambled\n" +
                        "1/4 cup black beans, drained and rinsed\n" +
                        "1/4 cup diced bell peppers (any color)\n" +
                        "1/4 cup diced tomatoes\n" +
                        "2 tablespoons shredded cheese\n" +
                        "Salsa and avocado slices for topping", R.drawable.bf3, "In a pan, sauté the bell peppers until they start to soften.\n" +
                        "Add the scrambled eggs to the pan and cook until they are just set.\n" +
                        "Warm the tortilla in a dry skillet or microwave for a few seconds.\n" +
                        "Place the scrambled eggs and bell peppers in the center of the tortilla.\n" +
                        "Add black beans, diced tomatoes, shredded cheese, salsa, and avocado slices.\n" +
                        "Fold in the sides of the tortilla and roll it up to form the burrito.\n" +
                        "Optional: Grill the burrito on the skillet for a crispy exterior.\n" +
                        "Serve warm and enjoy your flavorful breakfast burrito.");
                Intent intent = new Intent(MainActivity.this, RecipeDetailsActivity.class);
                intent.putExtra("object", selectedDrink);
                startActivity(intent);
            }
        });

        cardView = findViewById(R.id.card4);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Recipe selectedDrink = new Recipe("Oatmeal Banana Pancakes", "1 cup old-fashioned oats\n" +
                        "1 ripe banana\n" +
                        "2/3 cup milk (dairy or plant-based)\n" +
                        "1 teaspoon baking powder\n" +
                        "1/2 teaspoon vanilla extract\n" +
                        "1/4 teaspoon cinnamon\n" +
                        "Pinch of salt\n" +
                        "Maple syrup and sliced bananas for topping", R.drawable.bf4, "In a blender, combine oats, banana, milk, baking powder, vanilla extract, cinnamon, and a pinch of salt. Blend until smooth.\n" +
                        "Heat a non-stick skillet or griddle over medium heat.\n" +
                        "Pour 1/4 cup portions of batter onto the skillet to form pancakes.\n" +
                        "Cook until bubbles form on the surface, then flip and cook the other side until golden brown.\n" +
                        "Repeat with the remaining batter.\n" +
                        "Serve the pancakes with maple syrup and sliced bananas.");
                Intent intent = new Intent(MainActivity.this, RecipeDetailsActivity.class);
                intent.putExtra("object", selectedDrink);
                startActivity(intent);
            }
        });

        cardView = findViewById(R.id.card5);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Recipe selectedDrink = new Recipe("Smoked Salmon and Cream Cheese Bagel", "1 whole-grain or everything bagel, sliced and toasted\n" +
                        "2 tablespoons cream cheese\n" +
                        "2 slices smoked salmon\n" +
                        "1 tablespoon capers\n" +
                        "Red onion slices (optional)\n" +
                        "Fresh dill for garnish", R.drawable.bf5, "Spread cream cheese on each half of the toasted bagel.\n" +
                        "Place a slice of smoked salmon on each bagel half.\n" +
                        "Sprinkle capers over the salmon and add red onion slices if desired.\n" +
                        "Garnish with fresh dill.\n" +
                        "Serve immediately, and enjoy this classic and savory breakfast option.");
                Intent intent = new Intent(MainActivity.this, RecipeDetailsActivity.class);
                intent.putExtra("object", selectedDrink);
                startActivity(intent);
            }
        });

        cardView = findViewById(R.id.card6);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Recipe selectedDrink = new Recipe("Grilled Chicken Caesar Salad", "2 boneless, skinless chicken breasts\n" +
                        "Salt and pepper to taste\n" +
                        "Romaine lettuce, washed and chopped\n" +
                        "Caesar dressing\n" +
                        "Croutons\n" +
                        "Parmesan cheese, grated", R.drawable.lu1, "Season chicken breasts with salt and pepper.\n" +
                        "Grill the chicken until fully cooked, about 6-8 minutes per side.\n" +
                        "Slice the grilled chicken into strips.\n" +
                        "In a large bowl, toss the romaine lettuce with Caesar dressing.\n" +
                        "Add the grilled chicken strips on top of the salad.\n" +
                        "Sprinkle croutons and grated Parmesan cheese over the salad.\n" +
                        "Toss everything together and serve.");
                Intent intent = new Intent(MainActivity.this, RecipeDetailsActivity.class);
                intent.putExtra("object", selectedDrink);
                startActivity(intent);
            }
        });

        cardView = findViewById(R.id.card7);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Recipe selectedDrink = new Recipe("Vegetarian Quinoa Bowl", "1 cup quinoa, cooked\n" +
                        "Mixed vegetables (bell peppers, cherry tomatoes, cucumber, etc.)\n" +
                        "Chickpeas, drained and rinsed\n" +
                        "Feta cheese, crumbled\n" +
                        "Olive oil\n" +
                        "Lemon juice\n" +
                        "Fresh herbs (parsley, mint) for garnish", R.drawable.lu2, "In a bowl, combine cooked quinoa, mixed vegetables, and chickpeas.\n" +
                        "Drizzle olive oil and lemon juice over the mixture.\n" +
                        "Toss to combine and top with crumbled feta cheese.\n" +
                        "Garnish with fresh herbs.\n" +
                        "Serve as a refreshing and nutritious quinoa bowl.");
                Intent intent = new Intent(MainActivity.this, RecipeDetailsActivity.class);
                intent.putExtra("object", selectedDrink);
                startActivity(intent);
            }
        });

        cardView = findViewById(R.id.card8);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Recipe selectedDrink = new Recipe("Pasta Primavera", "Your choice of pasta\n" +
                        "Assorted vegetables (broccoli, bell peppers, cherry tomatoes, zucchini, etc.)\n" +
                        "Olive oil\n" +
                        "Garlic, minced\n" +
                        "Parmesan cheese, grated\n" +
                        "Salt and pepper to taste", R.drawable.lu3, "Cook pasta according to package instructions.\n" +
                        "In a pan, sauté minced garlic in olive oil until fragrant.\n" +
                        "Add assorted vegetables and sauté until tender-crisp.\n" +
                        "Toss cooked pasta with the sautéed vegetables.\n" +
                        "Season with salt and pepper, and sprinkle with grated Parmesan cheese.\n" +
                        "Serve warm.");
                Intent intent = new Intent(MainActivity.this, RecipeDetailsActivity.class);
                intent.putExtra("object", selectedDrink);
                startActivity(intent);
            }
        });

        cardView = findViewById(R.id.card9);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Recipe selectedDrink = new Recipe("Teriyaki Salmon with Brown Rice", "Salmon fillets\n" +
                        "Teriyaki sauce\n" +
                        "Brown rice, cooked\n" +
                        "Broccoli, steamed\n" +
                        "Sesame seeds for garnish\n" +
                        "Green onions, sliced", R.drawable.lu4, "Marinate salmon fillets in teriyaki sauce for at least 30 minutes.\n" +
                        "Grill or bake the salmon until fully cooked.\n" +
                        "Serve the teriyaki salmon over a bed of cooked brown rice.\n" +
                        "Add steamed broccoli on the side.\n" +
                        "Garnish with sesame seeds and sliced green onions.");
                Intent intent = new Intent(MainActivity.this, RecipeDetailsActivity.class);
                intent.putExtra("object", selectedDrink);
                startActivity(intent);
            }
        });

        cardView = findViewById(R.id.card10);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Recipe selectedDrink = new Recipe("Mediterranean Chickpea Salad", "Canned chickpeas, drained and rinsed\n" +
                        "Cherry tomatoes, halved\n" +
                        "Cucumber, diced\n" +
                        "Kalamata olives, sliced\n" +
                        "Red onion, finely chopped\n" +
                        "Feta cheese, crumbled\n" +
                        "Olive oil\n" +
                        "Lemon juice\n" +
                        "Fresh oregano or basil, chopped\n" +
                        "Salt and pepper to taste", R.drawable.lu6, "In a large bowl, combine chickpeas, cherry tomatoes, cucumber, olives, red onion, and feta cheese.\n" +
                        "Drizzle olive oil and lemon juice over the salad.\n" +
                        "Add fresh herbs and season with salt and pepper.\n" +
                        "Toss gently to combine all ingredients.\n" +
                        "Serve as a light and flavorful Mediterranean chickpea salad.");
                Intent intent = new Intent(MainActivity.this, RecipeDetailsActivity.class);
                intent.putExtra("object", selectedDrink);
                startActivity(intent);
            }
        });

        cardView = findViewById(R.id.card11);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Recipe selectedDrink = new Recipe("Chicken Stir-Fry", "2 boneless, skinless chicken breasts, sliced\n" +
                        "Assorted vegetables (bell peppers, broccoli, snap peas, carrots)\n" +
                        "Soy sauce\n" +
                        "Garlic, minced\n" +
                        "Ginger, grated\n" +
                        "Sesame oil\n" +
                        "Cooking oil\n" +
                        "Rice or noodles", R.drawable.d1, "In a wok or large skillet, heat cooking oil over medium-high heat.\n" +
                        "Add sliced chicken and cook until browned and cooked through.\n" +
                        "Add minced garlic and grated ginger, stir-frying for 1-2 minutes.\n" +
                        "Add assorted vegetables and stir-fry until they are crisp-tender.\n" +
                        "Pour soy sauce and a dash of sesame oil over the stir-fry.\n" +
                        "Serve over cooked rice or noodles.");
                Intent intent = new Intent(MainActivity.this, RecipeDetailsActivity.class);
                intent.putExtra("object", selectedDrink);
                startActivity(intent);
            }
        });

        cardView = findViewById(R.id.card12);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Recipe selectedDrink = new Recipe("Baked Salmon with Lemon and Dill", "Salmon fillets\n" +
                        "Lemon slices\n" +
                        "Fresh dill, chopped\n" +
                        "Garlic powder\n" +
                        "Salt and pepper\n" +
                        "Olive oil", R.drawable.d2, "Preheat the oven to 375°F (190°C).\n" +
                        "Place salmon fillets on a baking sheet lined with parchment paper.\n" +
                        "Drizzle with olive oil and season with garlic powder, salt, and pepper.\n" +
                        "Top each fillet with lemon slices and chopped fresh dill.\n" +
                        "Bake for 15-20 minutes or until the salmon flakes easily with a fork.\n" +
                        "Serve with your favorite side dishes.");
                Intent intent = new Intent(MainActivity.this, RecipeDetailsActivity.class);
                intent.putExtra("object", selectedDrink);
                startActivity(intent);
            }
        });

        cardView = findViewById(R.id.card13);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Recipe selectedDrink = new Recipe("Vegetarian Lentil Soup", "1 cup dry lentils, rinsed\n" +
                        "Onion, diced\n" +
                        "Carrots, diced\n" +
                        "Celery, diced\n" +
                        "Garlic, minced\n" +
                        "Vegetable broth\n" +
                        "Canned diced tomatoes\n" +
                        "Cumin, coriander, and thyme (to taste)\n" +
                        "Salt and pepper\n" +
                        "Spinach or kale, chopped", R.drawable.d3, "In a large pot, sauté onion, carrots, and celery until softened.\n" +
                        "Add garlic and sauté for an additional minute.\n" +
                        "Stir in lentils, vegetable broth, diced tomatoes, and spices.\n" +
                        "Bring to a boil, then reduce heat and simmer until lentils are tender.\n" +
                        "Add chopped spinach or kale and cook until wilted.\n" +
                        "Adjust seasoning and serve.");
                Intent intent = new Intent(MainActivity.this, RecipeDetailsActivity.class);
                intent.putExtra("object", selectedDrink);
                startActivity(intent);
            }
        });

        cardView = findViewById(R.id.card14);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Recipe selectedDrink = new Recipe("Spaghetti Bolognese", "Ground beef or turkey\n" +
                        "Onion, finely chopped\n" +
                        "Garlic, minced\n" +
                        "Tomato sauce\n" +
                        "Crushed tomatoes\n" +
                        "Italian seasoning (basil, oregano, thyme)\n" +
                        "Salt and pepper\n" +
                        "Spaghetti pasta", R.drawable.d4, "In a skillet, brown ground beef or turkey over medium heat.\n" +
                        "Add chopped onion and garlic, cooking until softened.\n" +
                        "Stir in tomato sauce, crushed tomatoes, and Italian seasoning.\n" +
                        "Simmer for at least 20 minutes to let the flavors meld.\n" +
                        "Cook spaghetti according to package instructions.\n" +
                        "Serve the Bolognese sauce over the cooked spaghetti.");
                Intent intent = new Intent(MainActivity.this, RecipeDetailsActivity.class);
                intent.putExtra("object", selectedDrink);
                startActivity(intent);
            }
        });

        cardView = findViewById(R.id.card15);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Recipe selectedDrink = new Recipe("Grilled Veggie and Quinoa Stuffed Peppers", "Bell peppers, halved and seeds removed\n" +
                        "Quinoa, cooked\n" +
                        "Zucchini, diced\n" +
                        "Cherry tomatoes, halved\n" +
                        "Red onion, diced\n" +
                        "Feta cheese, crumbled\n" +
                        "Olive oil\n" +
                        "Balsamic glaze\n" +
                        "Salt and pepper", R.drawable.d5, "Preheat the grill or oven to medium-high heat.\n" +
                        "In a bowl, mix cooked quinoa, diced zucchini, cherry tomatoes, red onion, and feta cheese.\n" +
                        "Drizzle olive oil over the mixture and season with salt and pepper.\n" +
                        "Stuff each bell pepper half with the quinoa and veggie mixture.\n" +
                        "Grill or bake until the peppers are tender.\n" +
                        "Drizzle with balsamic glaze before serving.");
                Intent intent = new Intent(MainActivity.this, RecipeDetailsActivity.class);
                intent.putExtra("object", selectedDrink);
                startActivity(intent);
            }
        });
    }
}
