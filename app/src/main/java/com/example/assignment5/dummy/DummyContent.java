package com.example.assignment5.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    private static final int COUNT = 25;

    static {
        // Add some sample items.
        addItem(new DummyItem(Integer.toString(1), "Pizza","Pizza Dough: Makes enough dough for two 10-12 inch pizzas\n" +
                "\n" +
                "1 1/2 cups (355 ml) warm water (105°F-115°F)\n" +
                "1 package (2 1/4 teaspoons) of active dry yeast\n" +
                "3 3/4 cups (490 g) bread flour\n" +
                "2 tablespoons extra virgin olive oil (omit if cooking pizza in a wood-fired pizza oven)\n" +
                "2 teaspoons salt\n" +
                "1 teaspoon sugar\n" +
                "Pizza Ingredients\n" +
                "\n" +
                "Extra virgin olive oil\n" +
                "Cornmeal (to help slide the pizza onto the pizza stone)\n" +
                "Tomato sauce (smooth, or puréed)\n" +
                "Firm mozzarella cheese, grated\n" +
                "Fresh soft mozzarella cheese, separated into small clumps\n" +
                "Fontina cheese, grated\n" +
                "Parmesan cheese, grated\n" +
                "Feta cheese, crumbled\n" +
                "Ham, thinly sliced"," test" ));

        addItem(new DummyItem(Integer.toString(2), "Burger", "1 1/2 pounds ground beef\n" +
                "1/3 cup grated onion\n" +
                "2-4 chipotle peppers (from a can of chipotles in adobo), depending on how much chile heat you like, minced, plus 1 tablespoon of the adobo sauce\n" +
                "1 teaspoon Kosher salt\n" +
                "1 teaspoon ground cumin\n" +
                "1 teaspoon black pepper\n" +
                "6 hamburger buns\n" +
                "6 slices jack cheese\n" +
                "2 avocados, sliced\n" +
                "Chipotle hot sauce to taste (we use Tabasco brand)\n" +
                "1/3 cup chopped cilantro, for garnish\n" +
                "2 poblano chile peppers (optional)"," test" ));


        addItem(new DummyItem(Integer.toString(3), "Shawerma", "1 1/2 pounds ground beef\n" +
                "2lb /1 kg chicken thigh fillets , skinless and boneless (Note 3)2lb /1 kg chicken thigh fillets , skinless and boneless (Note 3)\n" +
                "MARINADE\n" +
                "1 large garlic clove , minced (or 2 small cloves)1 large garlic clove , minced (or 2 small cloves)\n" +
                "1 tbsp ground coriander1 tbsp ground coriander\n" +
                "1 tbsp ground cumin1 tbsp ground cumin\n" +
                "1 tbsp ground cardamon1 tbsp ground cardamon\n" +
                "1 tsp ground cayenne pepper (reduce to 1/2 tsp to make it not spicy)1 tsp ground cayenne pepper (reduce to 1/2 tsp to make it not spicy)\n" +
                "2 tsp smoked paprika2 tsp smoked paprika\n" +
                "2 tsp salt2 tsp salt\n" +
                "Black pepperBlack pepper\n" +
                "2 tbsp lemon juice2 tbsp lemon juice\n" +
                "3 tbsp olive oil3 tbsp olive oil\n" +
                "YOGHURT SAUCE\n" +
                "1 cup Greek yoghurt1 cup Greek yoghurt\n" +
                "1 clove garlic , crushed1 clove garlic , crushed\n" +
                "1 tsp cumin1 tsp cumin\n" +
                "Squeeze of lemon juiceSqueeze of lemon juice\n" +
                "Salt and pepperSalt and pepper\n" +
                "TO SERVE\n" +
                "6 flatbreads (Lebanese or pita bread orhomemade soft flatbreads)6 flatbreads (Lebanese or pita bread orhomemade soft flatbreads)\n" +
                "Sliced lettuce (cos or iceberg)Sliced lettuce (cos or iceberg)\n" +
                "Tomato slicesTomato slices"," test" ));

        addItem(new DummyItem(Integer.toString(4), "Egg n cheese", "3 Servings\n" +
                "6 slices whole wheat bread\n" +
                "6 medium cheese slices\n" +
                "1/2 teaspoon salt\n" +
                "6 egg\n" +
                "1/2 teaspoon black pepper\n" +
                "2 tablespoon butter"," test" ));


        addItem(new DummyItem(Integer.toString(5), "Hot dog sandwich", " 4 beef hot dogs\n" +
                "4 lettuce leaves\n" +
                        "4 sliced radishes\n" +
                        "4 tbsp American Garden U.S. mayonnaise\n" +
                        "4 hot dog buns\n" +
                        "American Garden bread and butter sweet-chips pickles\n" +
                        "American Garden U.S. ketchup\n" +
                        "American Garden U.S. mustard"," test" ));



        addItem(new DummyItem(Integer.toString(6), "Turkey Breasts",  "2 slices whole wheat bread, toasted\n" +
                " \n" +
                "1 tablespoon mayonnaise\n" +
                " \n" +
                "2 teaspoons Dijon-style prepared mustard\n" +
                " \n" +
                "3 slices smoked turkey breast\n" +
                " \n" +
                "2 tablespoons guacamole\n" +
                " \n" +
                "½ cup mixed salad greens\n" +
                " \n" +
                "¼ cup bean sprouts\n" +
                " \n" +
                "¼ avocado - peeled, pitted and sliced\n" +
                " \n" +
                "3 ounces Colby-Monterey Jack cheese, sliced\n" +
                " \n" +
                "2 slices tomato"," test" ));

    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

//    private static DummyItem createDummyItem(int position) {
//        return new DummyItem(String.valueOf(position), "Item " + position, makeDetails(position));
//    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String content;
        public final String details;
        public final String desc;

        public DummyItem(String id, String content, String details,String desc) {
            this.id = id;
            this.content = content;
            this.details = details;
            this.desc = desc;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}