package daytest.bawie.com.circleapplication.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

import java.util.ArrayList;

import daytest.bawie.com.circleapplication.bean.CircleBean;

/**
 * Created by ZhangFanfan on 2016/11/30.
 */

public class CircleView extends View {
    private Paint mPaint ;
    private RectF mRectF;
    private ArrayList<CircleBean>mBeen;
    private float intAnc ;
    public CircleView(Context context) {
        this(context,null);

    }

    private void init() {
        mBeen = new ArrayList<>();
        mPaint = new Paint();
        mRectF = new RectF(200,200,800,800);
       mBeen.add(new CircleBean(Color.BLACK,120));
       mBeen.add(new CircleBean(Color.BLUE,50));
       mBeen.add(new CircleBean(Color.GREEN,40));
       mBeen.add(new CircleBean(Color.GRAY,90));
       mBeen.add(new CircleBean(Color.RED,20));
       mBeen.add(new CircleBean(Color.YELLOW,40));
        mBeen.add(new CircleBean(Color.DKGRAY,40));
    }

    public CircleView(Context context, AttributeSet attrs) {
        this(context, attrs,0);

    }

    public CircleView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
//        Paint mPaint = new Paint();
//        RectF mRectf = new RectF(100,100,100,100);
        for (int i = 0; i <7; i++) {
            mPaint.setColor(mBeen.get(i).getmColor());

            canvas.drawArc(mRectF,intAnc,mBeen.get(i).getOatAngle(),true,mPaint);
            intAnc += mBeen.get(i).getOatAngle();

        }
    }
    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
    }
}

