package filmsarchive.thingcinema.com.filmsarchiveapp.views.MovieArchive;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.DividerDrawerItem;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import filmsarchive.thingcinema.com.filmsarchiveapp.R;
import filmsarchive.thingcinema.com.filmsarchiveapp.views.MovieArchive.AdditionFormActivity.AdditionFormActivity;
import filmsarchive.thingcinema.com.filmsarchiveapp.views.MovieArchive.DeletionFormActivity.DeletionFormActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class DrawerAndTitleFragment extends android.app.Fragment {

    @BindView(R.id.drawer_toolbar)
    Toolbar mDrawer;

    @Inject
    public DrawerAndTitleFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_drawer_and_title, container, false);

        ButterKnife.bind(this, view);

        setupDrawer();

        return view;
    }

    public static DrawerAndTitleFragment newInstance() {

        return new DrawerAndTitleFragment();


    }

    public void setupDrawer() {

        //if you want to update the items at a later time it is recommended to keep it in a variable
        PrimaryDrawerItem item1 = new PrimaryDrawerItem().withIdentifier(AdditionFormActivity.IDENTIFIER).withName("Add Movie");
        PrimaryDrawerItem item2 = new PrimaryDrawerItem().withIdentifier(DeletionFormActivity.IDENTIFIER).withName("Delete Movie");

//create the drawer and remember the `Drawer` result object
        Drawer result = new DrawerBuilder()
                .withActivity(getActivity())
                .withToolbar(mDrawer)
                .addDrawerItems(
                        item1,
                        new DividerDrawerItem(),
                        item2,
                        new PrimaryDrawerItem()
                )
                .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                    @Override
                    public boolean onItemClick(View view, int position, IDrawerItem drawerItem) {

                        long identifier = drawerItem.getIdentifier();


                        if (identifier == AdditionFormActivity.IDENTIFIER) {
                            //the below checks if the drawer fragment is in the activity that is being clicked on
                            //in a very clunky way, but the only one I could think of, might need optimisation or at least
                            //moving the if-else logic in a method.
                            if (getActivity().getClass().equals(AdditionFormActivity.class))
                                return false;

                            else {
                                Intent intent = new Intent(getContext(), AdditionFormActivity.class);

                                startActivity(intent);
                                return true;
                            }
                        } else if (identifier == DeletionFormActivity.IDENTIFIER) {
                            if (getActivity().getClass().equals(DeletionFormActivity.class))
                                return false;
                            else {
                                Intent intent = new Intent(getContext(), DeletionFormActivity.class);

                                startActivity(intent);
                                return true;
                            }
                        }



                        return false;

                    }
                })
                .build();


    }


}
