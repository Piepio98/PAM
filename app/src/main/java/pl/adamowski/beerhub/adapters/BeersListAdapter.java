
package pl.adamowski.beerhub.adapters;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.List;

import pl.adamowski.beerhub.R;
import pl.adamowski.beerhub.models.Beer;

public class BeersListAdapter extends RecyclerView.Adapter<BeersListAdapter.ViewHolder> {

    private List<Beer> beers;
    //konstruktor
    private Context context;


    public BeersListAdapter(List<Beer> beers){
        this.beers= beers;
    }


    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View contactView = inflater.inflate(R.layout.beers_list_element, parent, false);

        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(contactView);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull  ViewHolder holder, int position) {

        Beer beer = beers.get(position);

        TextView textViewName = holder.textView_Name;
        textViewName.setText(beer.getBrewery());

        TextView textViewBrewery = holder.textView_Brewery;
        textViewBrewery.setText(beer.getName());

        TextView textViewStyle = holder.textView_Style;
        textViewStyle.setText(beer.getStyle());

        Button textViewButton = holder.textView_Button;


        textViewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                        String uri = "https://www.google.com/maps/place/" + beer.getLocation();
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                        intent.setPackage("com.google.android.apps.maps");
                        context = v.getContext();
                        context.startActivity(intent);
            }
        });



    }

    @Override
    public int getItemCount() {
        return beers.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView textView_Name;
        public TextView textView_Brewery;
        public TextView textView_Style;
        public Button textView_Button;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textView_Name = (TextView) itemView.findViewById(R.id.Name);
            textView_Brewery = (TextView) itemView.findViewById(R.id.Brewery);
            textView_Style = (TextView) itemView.findViewById(R.id.Style);
            textView_Button = (Button) itemView.findViewById(R.id.button_location);


        }
    }






}