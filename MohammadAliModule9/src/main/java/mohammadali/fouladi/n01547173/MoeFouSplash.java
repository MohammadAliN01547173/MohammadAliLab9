package mohammadali.fouladi.n01547173;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;
// MohammadAli Fouladi N01547173

public class MoeFouSplash extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //This method will be executed once the timer is over
                // Start your app main activity
                Intent i = new Intent(MoeFouSplash.this, FouladiActivity9.class);
                startActivity(i);
                // close this activity
                finish();
            }
        }, 3000);
    }
}