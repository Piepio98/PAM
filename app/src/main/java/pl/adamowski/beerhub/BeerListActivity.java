package pl.adamowski.beerhub;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import pl.adamowski.beerhub.adapters.BeersListAdapter;
import pl.adamowski.beerhub.models.Beer;

public class BeerListActivity extends AppCompatActivity {

    List<Beer> beers = new ArrayList<>();


    Beer piwo1 = new Beer ("Piw Paw","Foksal 16, 00-372 Warszawa","Pub",52.2311338,21.0154054);
    Beer piwo2 = new Beer ("Stan Umysłu","Efraima Schroegera 83, 01-828 Warszawa","Sklep",52.2802333,20.9418063);
    Beer piwo3 = new Beer ("PIWOmaniaK","al. Jana Pawła II 61, 01-031 Warszawa","Sklep",52.2474352,20.9859575);
    Beer piwo4 = new Beer ("Piwny Kolektyw","Siemiatycka 36, 01-312 Warszawa","Sklep",52.2474634,20.9706366);
    Beer piwo5 = new Beer ("Bierhalle","al. Jana Pawła II 82, 00-175 Warszawa","Restauracja",52.2475134,20.9706366);
    Beer piwo6 = new Beer ("JABEERWOCKY Craft Beer Pub","Nowogrodzka 12, 00-511 Warszawa","Pub",52.2297082,21.0138057);
    Beer piwo7 = new Beer ("White Whale","Giełdowa 4E/U1, 01-211 Warszawa","Sklep",52.2309419,20.9741148);


    public BeerListActivity() throws ParseException {
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beers_list);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        beers.add(piwo1);
        beers.add(piwo2);
        beers.add(piwo3);
        beers.add(piwo4);
        beers.add(piwo5);
        beers.add(piwo6);
        beers.add(piwo7);

        for (Beer i : beers){
            Log.d("Lista zawiera piwo: ",i.toString());
        }

        BeersListAdapter beersListAdapter = new BeersListAdapter(beers);

        RecyclerView beerRecyclerView = (RecyclerView) findViewById(R.id.beers_list_recycler_view);

        beerRecyclerView.setAdapter(beersListAdapter);
        beerRecyclerView.setLayoutManager(new LinearLayoutManager(this));



    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
