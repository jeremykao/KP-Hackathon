package com.kaiser.kpaftervisit;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class ProgressBar{
	   private static final int TEXT_SIZE = 12;
	   private static final int OFFSET = 3;
	   private int startX;
	   private int startY;
	   private static final int EMPTY_COLOR = Color.BLACK;
	   private static final int FILLED_COLOR = Color.GREEN;
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
	      textPaint.setColor(Color.WHITE);
	      mainCanvas = canvas;
	      mainCanvas.drawRect(x, y, x + width, y + height, emptyPaint);
	      mainCanvas.drawText(currentProgress + "%", x + OFFSET, y + TEXT_SIZE, textPaint);
	  }

	   public void changeProgress(int newProgress){
	      currentProgress = newProgress;
	      mainCanvas.drawRect(startX, startY , startX + barWidth, startY + barHeight, emptyPaint);
	      mainCanvas.drawRect(startX, startY, startX + (barWidth * (currentProgress / 100)), startY + barHeight, filledPaint);
	      mainCanvas.drawText(currentProgress + "%", startX + OFFSET, startY + TEXT_SIZE, textPaint);
	   }
	}
