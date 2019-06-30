package sakr.mahmoodsakr.layoutinflationexample;

import android.app.Activity;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast toast = new Toast(this);

        setContentView(R.layout.activity_main);
        Button viewButton = (Button) findViewById(R.id.show_view_button);
        Button toastViewButton = (Button) findViewById(R.id.show_toast_view_button);
        viewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout simple_layout = (LinearLayout) findViewById(R.id.simple_layout);
                LinearLayout container_layout = (LinearLayout) findViewById(R.id.container_layout);
                LayoutInflater layoutInflater = getLayoutInflater();

                View view = layoutInflater.inflate(R.layout.simple_layout, container_layout,true);
                 Log.d("Sakr", "View id >> " + view.getId());
//                Log.d("Sakr", "textView id >> " + R.id.textView0);
                Log.d("Sakr", "Simple layout id >> " + R.id.simple_layout);
                Log.d("Sakr", "Container layout id >> " + R.id.container_layout);
            }
        });
        toastViewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout simple_layout = (LinearLayout) findViewById(R.id.simple_layout);
                LinearLayout container_layout = (LinearLayout) findViewById(R.id.container_layout);
                LayoutInflater layoutInflater = getLayoutInflater();

                View view = layoutInflater.inflate(R.layout.simple_layout, container_layout, false);
                Toast toast = new Toast(MainActivity.this);
                toast.setDuration(Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.setView(view);
                toast.show();
                Log.d("Sakr", "View id >> " + view.getId());
//                Log.d("Sakr", "textView id >> " + R.id.textView0);
                Log.d("Sakr", "Simple layout id >> " + R.id.simple_layout);
                Log.d("Sakr", "Container layout id >> " + R.id.container_layout);
            }
        });

    }


}
