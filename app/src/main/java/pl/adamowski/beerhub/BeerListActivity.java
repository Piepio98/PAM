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


    Beer piwo1 = new Beer ("Hopito Craft Beer & Pizza","Żurawia 32/34, 00-503 Warszawa","Pub",52.2285108,21.013837,"Hopito+Craft+Beer+%26+Pizza/@52.2285108,21.013837,21z/data=!4m5!3m4!1s0x471ecdbf000888d3:0x8cf3290ae64b7d0f!8m2!3d52.2284855!4d21.0139283", "https://warsawfoodie.pl/wp-content/uploads/2021/05/hopito-1.jpg");
    Beer piwo2 = new Beer ("Stan Umysłu","Efraima Schroegera 83, 01-828 Warszawa","Sklep",52.2802488,20.9438932,"Stan+Umysłu+-+sklep+i+galeria+z+dobrym+piwem/@52.2802488,20.9438932,21z/data=!3m1!5s0x471ecbccd9883247:0x32df682d4b0d1848!4m5!3m4!1s0x471ecbc8d3cf3eb1:0x576e8a34d627c1c8!8m2!3d52.28023!4d20.943995", "https://scontent-waw1-1.xx.fbcdn.net/v/t31.18172-8/10317623_920296691323396_2823711536184395014_o.png?_nc_cat=100&ccb=1-3&_nc_sid=09cbfe&_nc_ohc=2pFal71xZZEAX-oA5LI&tn=UMkl4ZaBwFnpEDYd&_nc_ht=scontent-waw1-1.xx&oh=ab99554cde11af819b4162b082fa617b&oe=60F3E67B");
    Beer piwo3 = new Beer ("PIWOmaniaK","al. Jana Pawła II 61, 01-031 Warszawa","Sklep",52.2474527,20.9880623,"PIWOmaniaK/@52.2474527,20.9880623,21z/data=!4m5!3m4!1s0x471ecc78b49e199f:0xe60e6f301b63f748!8m2!3d52.2474483!4d20.9881967", "https://minibrowary.files.wordpress.com/2021/05/20210511_1.jpg?w=577&h=1024");
    Beer piwo4 = new Beer ("Piwny Kolektyw","Siemiatycka 36, 01-312 Warszawa","Sklep",52.2269573,20.9045905,"Piwny+Kolektyw+Regionalne+piwo/@52.2269573,20.9045905,20.75z/data=!4m5!3m4!1s0x471ecb2e3ee8cc07:0x91ef127a3ebce547!8m2!3d52.2269362!4d20.904672", "https://minibrowary.files.wordpress.com/2021/05/20210511_1.jpg?w=577&h=1024");
    Beer piwo5 = new Beer ("Piwodawca","Połczyńska 42, 01-336 Warszawa","Sklep/multitap",52.2189427,20.9100631,"Piwodawca/@52.2189427,20.9100631,21z/data=!4m5!3m4!1s0x471ecb2e3ee8cc07:0x7fff4926781641e8!8m2!3d52.2188961!4d20.9101385?hl=pl-PL", "https://minibrowary.files.wordpress.com/2021/05/20210511_1.jpg?w=577&h=1024");
    Beer piwo6 = new Beer ("JABEERWOCKY Craft Beer Pub","Nowogrodzka 12, 00-511 Warszawa","Pub",52.2297473,21.0154485,"JABEERWOCKY+Craft+Beer+Pub/@52.2297473,21.0154485,19z/data=!4m5!3m4!1s0x471eccf3dfbb29bb:0x8b9ec006c798f3c!8m2!3d52.2296774!4d21.0160091", "https://minibrowary.files.wordpress.com/2021/05/20210511_1.jpg?w=577&h=1024");
    Beer piwo7 = new Beer ("White Whale","Giełdowa 4E/U1, 01-211 Warszawa","Sklep",52.2309831,20.9757039,"White+Whale/@52.2309831,20.9757039,18.75z/data=!4m5!3m4!1s0x471ecd13e4efa9fd:0xd5c6c2686ab5f9c0!8m2!3d52.2309359!4d20.9763043", "https://minibrowary.files.wordpress.com/2021/05/20210511_1.jpg?w=577&h=1024");


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
