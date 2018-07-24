package sg.edu.rp.c346.mymovies;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ListView lvToDo;
    ArrayList<ToDoItem> alToDoList;
    CustomAdapter caToDo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvToDo = findViewById(R.id.listViewToDo);

        alToDoList = new ArrayList<>();

        Calendar date1 = Calendar.getInstance();
        date1.set(2014,1,15);
        Calendar date2 = Calendar.getInstance();
        date2.set(2015,5,15);

        String date = date1.toString();

        ToDoItem movie1 = new ToDoItem("The Avengers","2012","pg13",4,"Action | Sci-Fi",date1,"Golden Village - Bishan","Nick Fury of S.H.I.E.L.D. assembles a team of superheroes to save the planet from Loki and his army." );
        ToDoItem movie2 = new ToDoItem("Planes","2013","pg",2,"Animation | Comedy",date2,"Cathay - AMK Hub", "A crop-dusting plane with a fear of heights lives his dream of competing in a famous around-the-world aerial race.");
        alToDoList.add(movie1);
        alToDoList.add(movie2);

        caToDo = new CustomAdapter(this, R.layout.movie_list, alToDoList);

        lvToDo.setAdapter(caToDo);

        lvToDo.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intentMovieDetails = new Intent(getBaseContext(), MovieDetails.class);
                ToDoItem movie = alToDoList.get(position);

                intentMovieDetails.putExtra("title", movie.message());

                startActivity(intentMovieDetails);

            }
        });


    }
}
