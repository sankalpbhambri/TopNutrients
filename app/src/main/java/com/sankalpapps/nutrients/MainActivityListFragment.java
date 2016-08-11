package com.sankalpapps.nutrients;


import android.app.Fragment;
import android.app.ListFragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainActivityListFragment extends ListFragment {


    private  ArrayList<Note> noteList;
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        noteList = new ArrayList<>();
        noteList.add(new Note("Vitamin A","This essential vitamin plays an important role in general growth and development, including proper vision, healthy teeth, glowing skin, strong bones and more.\n" +
                "\n" +
                "Vitamin A also protects the body from different types of infections and promotes the health and growth of cells and tissues in the body. Vitamin A comes in two forms – retinoids and carotenoids.\n" +
                "\n" +
                "Some foods rich in vitamin A are carrots, sweet potatoes, cantaloupe, pumpkin, spinach, eggs, watermelon, kale, papaya, peaches, apricots, tomatoes, dried beans, lentils, red peppers, guava, broccoli, liver, milk and fortified cereals.", Note.Category.VITAMIN_A));
        noteList.add(new Note("Vitamin C","This water-soluble vitamin is an antioxidant that helps protect cells from free-radical damage, lowers the risk of different types of cancer, regenerates your vitamin E supply, and improves iron absorption. It also keeps the gums healthy, aids in healing wounds, boosts the immune system, and keeps infections at bay.\n" +
                "\n" +
                "Your body can’t store vitamin C or make it, so you need to consume some every day. Some foods rich in vitamin C are red peppers, kiwi, oranges, strawberries, cantaloupe, broccoli, guava, grapefruit, Brussels sprouts, parsley, lemon juice, papaya, cauliflower, kale and mustard greens.",
                Note.Category.VITAMIN_C));
        noteList.add(new Note("Vitamin E","Vitamin E is the collective name of eight fat-soluble compounds with distinctive antioxidant activities. This particular vitamin protects the skin from harmful ultraviolet light, prevents cell damage from free radicals, improves communication between cells, and protects against prostate cancer and Alzheimer’s disease.\n" +
                "\n" +
                "Some foods rich in vitamin E are spinach, chard, turnip greens, mustard greens, cayenne pepper, almonds, sunflower seeds, wheat germ, asparagus, bell peppers, whole grain cereals and safflower oil.", Note.Category.VITAMIN_E));
        noteList.add(new Note("Dietary Fiber","The American Dietetic Association defines fiber as complex carbohydrates that the body can’t digest or absorb. Instead, it passes relatively intact through your stomach, small intestine, and colon and out of your body.\n" +
                "\n" +
                "A high-fiber diet normalizes bowel movements, helps maintain bowel health, lowers cholesterol levels, helps control blood sugar levels, and aids in achieving healthy weight. It also lowers the risk of developing chronic conditions, including heart disease, cancer, and type 2 diabetes.\n" +
                "\n" +
                "Some foods with high fiber content are whole grain crackers, quinoa, millet, barley, cracked wheat, wild rice, black beans, chickpeas, turnip greens, oats, flaxseed, mustard greens, collard greens, navy beans, eggplant, raspberries, and cinnamon.",
                Note.Category.DIETARY_FIBER));
        noteList.add(new Note("Folic Acid","Folic acid, also known as folate, is a form of the water-soluble vitamin B9. Folic acid supports red blood cell production to prevent anemia, prevents homocysteine buildup in your blood, and helps the nerves function properly. It also prevents osteoporosis-related bone fractures and dementias, including Alzheimer’s disease.\n" +
                "\n" +
                "The body cannot store folic acid, so it is highly essential to consume it every day to maintain an adequate amount in your system.\n" +
                "\n" +
                "Some good food sources of folic acid are romaine lettuce, spinach, asparagus, turnip greens, mustard greens, parsley, collard greens, broccoli, cauliflower, beets, lentils, asparagus, cabbage, egg yolks and lettuce.", Note.Category.FOLIC_ACID));
        noteList.add(new Note("Iron","Iron helps make red blood cells, which carry oxygen around the body. It is also necessary to support proper metabolism for muscles and other active organs. A lack of iron in the body can lead to iron-deficiency anemia that can result in fatigue, weakness, and irritability.\n" +
                "\n" +
                "Some iron-rich foods are oysters, red meats, chicken liver, soybeans, fortified cereal, pumpkin seeds, beans, lentils, spinach, nuts, dried apricots, brown rice, watercress, kale, Swiss chard, thyme, asparagus, cumin, turmeric, tofu, blackstrap molasses, collard greens, leeks, oregano, black pepper, basil and turnips.\n" +
                "\n" +
                "Also increasing the amount of vitamin C in your diet will help your body absorb iron more effectively.", Note.Category.IRON));
        noteList.add(new Note("Magnesium","Magnesium contributes to bone strength, enables energy production, boosts the immune system, and normalizes muscle, nerve, and heart functioning. In fact, this mineral is highly essential for a normal heartbeat. Foods that are high in fiber are generally also high in magnesium.\n" +
                "\n" +
                "Some good foods to eat to get magnesium are legumes, whole grains, broccoli, squash, spinach, almonds, cashews, peanuts, soymilk, black beans, avocado, brown rice, oatmeal, kidney beans, banana, pumpkin seeds and sesame seeds.", Note.Category.MAGNESIUM));
        noteList.add(new Note("Omega-3 Fatty Acids","Omega-3 fatty acids are considered essential fatty acids (ALA, DHA and EPA) that help build cells, regulate the nervous system, strengthen the cardiovascular system, build immunity, and help the body absorb nutrients.\n" +
                "\n" +
                "They also reduce the risk of becoming obese and improve the body’s ability to respond to insulin. They even help prevent cancer cell growth.\n" +
                "\n" +
                "Some of the best sources of omega-3 fatty acids are flaxseeds, walnuts, salmon, sardines, beef, soybeans, halibut, scallops, shrimp, canola oil, linseed, tofu and olive oil.", Note.Category.OMEGA_3));
        noteList.add(new Note("Calcium","The mineral calcium plays a key role in maintaining healthy teeth and bones. It also promotes healthy nerve and muscle functioning, helps maintain the pH balance in the blood, and helps the body convert food into energy. It has been found that adequate calcium intake also lowers blood pressure, as well as controls weight.\n" +
                "\n" +
                "Some calcium-rich foods are yogurt, cheese, milk, tofu, black molasses, sesame seeds, sardines, collard greens, spinach, turnip greens and scallops.", Note.Category.CALCIUM));
        noteList.add(new Note("Protein","Protein helps the immune system function properly; maintains healthy skin, hair and nails; and, assists the body in producing enzymes.\n" +
                "\n" +
                "Protein is considered the building block of life because the body needs it to repair and maintain itself. Protein is important to support proper growth and development during childhood, adolescence, and pregnancy.\n" +
                "\n" +
                "Some high-protein foods are turkey, tuna, shrimp, cod, halibut, salmon, scallops, sardines, chicken, lamb, grass-fed beef, calf’s liver, spinach, tofu, mustard greens, asparagus, soybeans, cheese, mushrooms, eggs, summer squash, split peas and garbanzo beans.", Note.Category.PROTEIN));

        NoteAdapter noteAdapter = new NoteAdapter(getActivity(),noteList);
        setListAdapter(noteAdapter);

        getListView().setDivider(ContextCompat.getDrawable(getActivity(), android.R.color.black));
        getListView().setDividerHeight(3);

    }


    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        launchNoteDetailActivity(position);

    }

    private void launchNoteDetailActivity(int position){
        Note note = (Note)getListAdapter().getItem(position);
        Intent intent = new Intent(getActivity(),NoteDetailActivity.class);
        intent.putExtra(MainActivity.NOTE_TITLE_EXTRA,note.getTitle());
        intent.putExtra(MainActivity.NOTE_MESSAGE_EXTRA,note.getMessage());
        intent.putExtra(MainActivity.NOTE_CATEGORY_EXTRA,note.getCategory());
        intent.putExtra(MainActivity.NOTE_ID_EXTRA,note.getNoteId());
        startActivity(intent);

    }


}
