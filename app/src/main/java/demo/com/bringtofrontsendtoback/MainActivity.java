package demo.com.bringtofrontsendtoback;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final CardView card_view=(CardView)findViewById(R.id.card_view);
        final CardView card_view2=(CardView)findViewById(R.id.card_view2);

        card_view.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                card_view.bringToFront();
                card_view2.invalidate();
                card_view2.setCardBackgroundColor(getResources().getColor(R.color.brown));
                card_view.setCardBackgroundColor(getResources().getColor(R.color.white));

            }
        });
        card_view2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                card_view2.bringToFront();
                card_view.invalidate();
                card_view.setCardBackgroundColor(getResources().getColor(R.color.brown));
                card_view2.setCardBackgroundColor(getResources().getColor(R.color.white));
            }
        });

    }


}
