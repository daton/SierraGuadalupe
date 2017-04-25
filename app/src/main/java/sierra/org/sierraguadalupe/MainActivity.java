package sierra.org.sierraguadalupe;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    LinearLayout primero;
    LinearLayout segundo;
    LinearLayout tercero;
    FrameLayout content;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {



        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {


            switch (item.getItemId()) {
                case R.id.navigation_home: {

                       content.removeAllViews();
                    content.addView(primero);

                    return true;
                }
                case R.id.navigation_dashboard: {
                    content.removeAllViews();
                    content.addView(segundo);
                    return true;
                }
                case R.id.navigation_notifications: {
                    content.removeAllViews();
                    content.addView(tercero);
                    return true;
                }
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        primero= (LinearLayout) MainActivity.super.findViewById(R.id.primero);
       segundo= (LinearLayout) MainActivity.super.findViewById(R.id.segundo);
       tercero= (LinearLayout) MainActivity.super.findViewById(R.id.tercero);
       content= (FrameLayout) MainActivity.super.findViewById(R.id.content);

       content.removeAllViews();
        content.addView(primero);


        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
