package com.google.android.apps.inputmethod.libs.gestureui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class GestureOverlayView extends View implements jcz {
    public static long a;
    public int b;
    public int c;
    public int d;
    public float e;
    public float f;
    public Canvas i;
    public dfp j;
    public int k;
    public gwg m;
    private Bitmap o;
    public final Paint g = new Paint();
    private final Paint n = new Paint();
    public final Rect h = new Rect();
    public final cvj l = new cvj(this, 20);

    public GestureOverlayView(Context context) {
        super(context);
        c(context, null);
    }

    private final void c(Context context, AttributeSet attributeSet) {
        this.b = (int) (jgd.d(context, attributeSet, null, "gesture_track_width_dp", 13) * getResources().getDisplayMetrics().density);
        this.c = jgd.d(context, attributeSet, null, "gesture_track_alpha", 250);
        int v = jgd.v(context, attributeSet, "gesture_track_color", -1118482);
        float dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f41320_resource_name_obfuscated_res_0x7f0705c4) * (getResources().getDisplayMetrics().widthPixels / 480.0f);
        this.e = jgd.d(context, attributeSet, null, "alpha_decay_per_step", (int) (4.0f / dimensionPixelSize));
        this.f = jgd.d(context, attributeSet, null, "width_decay_per_step", (int) (2.0f / dimensionPixelSize));
        this.d = (int) (dimensionPixelSize * 20.0f);
        setWillNotDraw(false);
        this.g.setAntiAlias(true);
        this.g.setStyle(Paint.Style.STROKE);
        this.g.setStrokeCap(Paint.Cap.ROUND);
        this.g.setStrokeJoin(Paint.Join.ROUND);
        this.g.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        a(v);
    }

    @Override // defpackage.jcz
    public final void a(int i) {
        this.n.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, (i >> 16) & 255, 0.0f, 0.0f, 0.0f, 0.0f, (i >> 8) & 255, 0.0f, 0.0f, 0.0f, 0.0f, i & 255, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f})));
    }

    public final void b(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        Bitmap bitmap = this.o;
        if (bitmap != null && bitmap.getWidth() == i && this.o.getHeight() == i2) {
            return;
        }
        this.o = Bitmap.createBitmap(i, i2, Bitmap.Config.ALPHA_8);
        this.i = new Canvas(this.o);
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Bitmap bitmap = this.o;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.n);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        b(i, i2);
    }

    public GestureOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c(context, attributeSet);
    }

    public GestureOverlayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c(context, attributeSet);
    }
}
