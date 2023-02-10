package cs301.birthdaycake;

import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener{
    private CakeView looks;
    private CakeModel sponge;
    public CakeController(CakeView visual) {
        looks = visual;
        sponge = visual.getModel();

        }

    public void onClick(View v){
        Log.d("message", "ERROR 1");
        sponge.setLit(false);
        looks.invalidate();


    }

    public void onCheckedChanged(CompoundButton v, boolean b){
        Log.d("Candles", "ERROR 2");
        sponge.setCandle(b);
        looks.invalidate();
    }

    public void onProgressChanged(SeekBar sb, int progress, boolean b) {
        Log.d("SeekBar", "ERROR 3");
        sponge.setNum(progress);
        looks.invalidate();
    }

    public void onStartTrackingTouch(SeekBar sb){}

    public void onStopTrackingTouch(SeekBar sb){}

}


