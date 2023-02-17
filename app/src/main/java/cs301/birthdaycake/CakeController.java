package cs301.birthdaycake;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener, View.OnTouchListener{
    private CakeView looks;
    private CakeModel sponge;
    public CakeController(CakeView visual) {
        looks = visual;
        sponge = visual.getModel();

        }

    public void onClick(View v){
        Log.d("onClick1", "1st onclick");
        sponge.setLit(false);
        looks.invalidate();
    }

    public void onCheckedChanged(CompoundButton v, boolean b){
        Log.d("Candles", "On / off");
        sponge.setCandle(b);
        looks.invalidate();
    }

    public void onProgressChanged(SeekBar sb, int progress, boolean b) {
        Log.d("SeekBar", "Slider");
        sponge.setNum(progress);
        looks.invalidate();
    }

    public void onStartTrackingTouch(SeekBar sb){}

    public void onStopTrackingTouch(SeekBar sb){}

    public boolean onTouch(View v, MotionEvent event){
        Log.d("onTouchMETHOD", "2nd Onclick");
        sponge.hasTouched = true;
        sponge.Xcoor = event.getX();
        sponge.Ycoor = event.getY();
        looks.invalidate();
        return false;
    }
}


