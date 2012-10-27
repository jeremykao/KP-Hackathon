package com.kaiser.kpaftervisit;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class ProgressBar {
	   private static final int TEXT_SIZE = 12;
	   private static final int OFFSET = 3;
	   private int startX;
	   private int startY;
	   private static final Color EMPTY_COLOR = Color.BLACK;
	   private static final Color FILLED_COLOR = Color.GREEN;
	   private Paint textPaint = new Paint();
	   private Paint filledPaint = new Paint();
	   private Paint emptyPaint = new Paint();
	   private Canvas mainCanvas;
	   private int barHeight;
	   private int barWidth;
	   private int currentProgress;

	   public ProgressBar(int x, int y, int width, int height, Canvas canvas){
	      startX = x; startY = y; barHeight = height; barWidth = width; 
	      emptyPaint.setColor(EMPTY_COLOR);
	      filledPaint.setColor(FILLED_COLOR);
	      textPaint.setTextSize(TEXT_SIZE);
	      textPaint.setColor(Color.white);
	      mainCanvas = canvas;
	      mainCanvas.drawRect(x, y, x + width, y + height, emptyPaint);
	      mainCanvas.drawText(currentProgress + "%", x + OFFSET, y + TEXT_SIZE, textPaint);
	  }

	   public void changeProgress(int newProgress){
	      currentProgress = newProgress;
	      mainCanvas.drawRect(x, y , x + width, y + height, emptyPaint);
	      mainCanvas.drawRect(x, y, x + (width * (currentProgress / 100)), y + height, filledPaint);
	      mainCanvas.drawText(currentProgress + "%", x + OFFSET, y + TEXT_SIZE, textPaint);
	   }
	}
