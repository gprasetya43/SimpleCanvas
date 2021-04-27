package com.example.simplecanvas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.solver.widgets.Rectangle;
import androidx.core.content.res.ResourcesCompat;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private Canvas mCanvas;
    private Paint mPaint=new Paint();
    private Paint mPaintText=new Paint(Paint.FAKE_BOLD_TEXT_FLAG);
    private Bitmap mBitmap;
    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mImageView=findViewById(R.id.my_imageview);
        mPaint.setColor(Color.YELLOW);
        mPaintText.setColor(ResourcesCompat.getColor(getResources(),
                R.color.purple_200,null));
        mPaintText.setTextSize(60);

    }

    public void drawSomething(View view) {
        int vWidth=view.getWidth();
        int vHeight=view.getHeight();
        mBitmap=Bitmap.createBitmap(vWidth,vHeight,Bitmap.Config.ARGB_8888);
        mImageView.setImageBitmap(mBitmap);
        mCanvas=new Canvas(mBitmap);
        mCanvas.drawColor(Color.GREEN);


        mPaint.setColor(Color.GREEN);

        Path path=new Path();
        path.moveTo(100,200);
        path.lineTo(300,100);
        path.lineTo(500,200);

        mPaint.setColor(Color.RED);
        mCanvas.drawPath(path,mPaint);

        mPaint.setColor(Color.GRAY);
        Rect mRect=new Rect();
        mRect.set(100,200,500,400);
        mCanvas.drawRect(mRect,mPaint);



        mPaint.setColor(Color.BLUE);
        mRect.set(250,275,350,400);
        mCanvas.drawRect(mRect,mPaint);

        mCanvas.drawText("Gunawan Prasetya",500,800,mPaintText);

        mPaint.setColor(Color.BLUE);
        mCanvas.drawLine(100,500,500,500,mPaint);

        mCanvas.drawLine(100,500,150,600,mPaint);
        mCanvas.drawLine(150,500,100,600,mPaint);

        mCanvas.drawLine(150,500,200,600,mPaint);
        mCanvas.drawLine(200,500,150,600,mPaint);

        mCanvas.drawLine(200,500,250,600,mPaint);
        mCanvas.drawLine(250,500,200,600,mPaint);

        mCanvas.drawLine(250,500,300,600,mPaint);
        mCanvas.drawLine(300,500,250,600,mPaint);

        mCanvas.drawLine(300,500,350,600,mPaint);
        mCanvas.drawLine(350,500,300,600,mPaint);

        mCanvas.drawLine(350,500,400,600,mPaint);
        mCanvas.drawLine(400,500,350,600,mPaint);

        mCanvas.drawLine(400,500,450,600,mPaint);
        mCanvas.drawLine(450,500,400,600,mPaint);

        mCanvas.drawLine(450,500,500,600,mPaint);
        mCanvas.drawLine(500,500,450,600,mPaint);

        mPaint.setColor(Color.BLUE);
        mCanvas.drawLine(100,600,500,600,mPaint);
        view.invalidate();
        mCanvas.drawLine(100,550,500,550,mPaint);
        view.invalidate();
    }
}