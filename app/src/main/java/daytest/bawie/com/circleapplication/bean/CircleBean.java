package daytest.bawie.com.circleapplication.bean;

/**
 * Created by ZhangFanfan on 2016/11/30.
 */

public class CircleBean {
    private int mColor;
    private float oatAngle;

    public int getmColor() {
        return mColor;
    }

    public void setmColor(int mColor) {
        this.mColor = mColor;
    }

    public float getOatAngle() {
        return oatAngle;
    }

    public void setOatAngle(float oatAngle) {
        this.oatAngle = oatAngle;
    }
    //    private String

    public CircleBean(int mColor, float oatAngle) {
        this.mColor = mColor;
        this.oatAngle = oatAngle;
    }

    @Override
    public String toString() {
        return "CircleBean{" +
                "mColor=" + mColor +
                ", oatAngle=" + oatAngle +
                '}';
    }
}
