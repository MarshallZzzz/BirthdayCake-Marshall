package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);

        CakeView ckvws = findViewById(R.id.cakeview);
        CakeController controls = new CakeController(ckvws);

        View blowout = findViewById(R.id.blow_out);
        blowout.setOnClickListener(controls);

        CompoundButton candleSwitch = findViewById(R.id.Candles);
        candleSwitch.setOnCheckedChangeListener(controls);

        SeekBar seekAmt = findViewById(R.id.seekBar);
        seekAmt.setOnSeekBarChangeListener(controls);

        ckvws.setOnTouchListener(controls);
        
    }

    public void goodbye(View button){
        Log.i("button","GoodBye");

    }
}
