package android.vegard.com.fragmenttesting;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity extends Activity {
    AnimationDrawable frameAnimation1;
    AnimationDrawable frameAnimation2;
    AnimationDrawable frameAnimation3;

    RadioButton rb1;
    RadioButton rb2;
    RadioButton rb3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rb1 = (RadioButton)findViewById(R.id.radioButton);
        rb2 = (RadioButton)findViewById(R.id.radioButton2);
        rb3 = (RadioButton)findViewById(R.id.radioButton3);

       // rb3.setBackgroundResource(R.drawable.fade_in_left);

        // Get the background, which has been compiled to an AnimationDrawable object.


        frameAnimation3 = (AnimationDrawable) getDrawable(R.drawable.fade_in_left);

        // Start the animation (looped playback by default).
        //frameAnimation1.start();
    }

    public void onRadioButtonClicked(View view) {
        /*
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radioButton:
                if (checked)
                    // Pirates are the best
                    rb1.setBackgroundResource(R.drawable.fade_in_left);
                    frameAnimation1 = (AnimationDrawable) rb1.getBackground();
                    frameAnimation1.start();
                    break;
            case R.id.radioButton2:
                if (checked)
                    // Ninjas rule
                    rb2.setBackgroundResource(R.drawable.fade_in_left);
                    frameAnimation2 = (AnimationDrawable) rb2.getBackground();
                    frameAnimation2.start();



                    break;
            case R.id.radioButton3:
                if (checked)
                    // Ninjas rule
                    break;
        }
        */
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
