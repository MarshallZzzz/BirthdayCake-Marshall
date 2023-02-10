package cs301.birthdaycake;

import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener{
    private CakeView looks;
    private CakeModel sponge;
    public CakeController(CakeView visual) {
        looks = visual;
        sponge = visual.getModel();

        }

    public void onClick(View v){
        Log.d("message", "ERROR 1");
        sponge.litty = false;
        looks.invalidate();
    }

    public void onCheckedChanged(CompoundButton v, boolean b){
        Log.d("Candles", "ERROR 2");
        sponge.hasCandle = false;
        looks.invalidate();
    }
}


