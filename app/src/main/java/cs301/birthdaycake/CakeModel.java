package cs301.birthdaycake;

public class CakeModel {
    public boolean litty = true;
    public int candleAmt = 2;
    public boolean frost = true;
    public boolean hasCandle = true;

    public boolean hasTouched = false;
    public float Xcoor;
    public float Ycoor;

    //setter and getter method litty
    public void setLit(boolean b){
        this.litty = b;
    }
    public boolean getLit(){
        return this.litty;
    }


    //setter and getter method number of candles
    public void setNum(int b){
        this.candleAmt = b;
    }

    public int getNum(){
        return this.candleAmt;
    }

    //setter and getter method for frosting
    public void setFrost(boolean b){
        this.frost = b;
    }

    public boolean getFrost(){
        return this.frost;
    }

    //setter and getter method for has candle
    public void setCandle(boolean b){
        this.hasCandle = b;
    }

    public boolean getCandle(){
        return this.hasCandle;
    }


}
