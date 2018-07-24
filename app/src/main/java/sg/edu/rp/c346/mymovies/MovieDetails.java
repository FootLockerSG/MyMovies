package sg.edu.rp.c346.mymovies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.Calendar;

public class MovieDetails extends AppCompatActivity {

    //Step 1
    ImageView ivImpt;
    TextView tvTitle;
    TextView tvDate;
    TextView tvDes;
    RatingBar rb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.movie_details_click);

        //Step 2
        ivImpt = findViewById(R.id.imageView);
        tvTitle = findViewById(R.id.textViewTitle);
        tvDate = findViewById(R.id.textViewDate);
        tvDes = findViewById(R.id.textViewDescription);
        rb = findViewById(R.id.ratingBar);

        Intent intentReceived = getIntent();
        String title = intentReceived.getStringExtra("title");
        String date = intentReceived.getStringExtra("date");
        String rated = intentReceived.getStringExtra("rated");
        int stars = intentReceived.getIntExtra("stars",0);
        String genre = intentReceived.getStringExtra("genre");
        String des = intentReceived.getStringExtra("des");
        String datewatched = intentReceived.getStringExtra("watch");
        String theatre = intentReceived.getStringExtra("theatre");

        tvTitle.setText(title);


        if ("pg13".equals(rated)) {
            ivImpt.setImageResource(R.drawable.rating_pg13);
        }
        else if ("pg".equals(rated)){
            ivImpt.setImageResource(R.drawable.rating_pg);
        }
        else if ("r21".equals(rated)){
            ivImpt.setImageResource(R.drawable.rating_r21);
        }
        else if ("nc16".equals(rated)){
            ivImpt.setImageResource(R.drawable.rating_nc16);
        }
        else if ("m18".equals(rated)){
            ivImpt.setImageResource(R.drawable.rating_m18);
        }
        else {
            ivImpt.setImageResource(R.drawable.rating_g);
        }

        rb.setRating(stars);


    }
}
