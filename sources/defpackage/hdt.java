package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;

/* compiled from: PG */
/* renamed from: hdt  reason: default package */
/* loaded from: classes.dex */
public final class hdt {
    private static final lug a = hin.a;
    private final Bitmap b;
    private final Canvas c;
    private final TextPaint d;
    private final int[] e;
    private final float f;

    public hdt() {
        TextPaint textPaint = new TextPaint();
        this.d = textPaint;
        textPaint.setTextSize(10.0f);
        textPaint.setColor(-1);
        textPaint.setTextAlign(Paint.Align.CENTER);
        float descent = 5.0f - ((textPaint.descent() + textPaint.ascent()) / 2.0f);
        this.f = descent;
        Bitmap createBitmap = Bitmap.createBitmap(10, 10, Bitmap.Config.ARGB_8888);
        this.b = createBitmap;
        Canvas canvas = new Canvas(createBitmap);
        this.c = canvas;
        textPaint.measureText("m");
        textPaint.measureText("\ufffe");
        int[] iArr = new int[100];
        this.e = iArr;
        canvas.drawColor(-16777216);
        TextPaint textPaint2 = new TextPaint(textPaint);
        if (jbs.n("\ufffe".toString())) {
            new StaticLayout("\ufffe", textPaint2, 10, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false).draw(canvas);
        } else {
            canvas.drawText((CharSequence) "\ufffe", 0, "\ufffe".length(), 5.0f, descent, (Paint) textPaint2);
        }
        createBitmap.getPixels(iArr, 0, 10, 0, 0, 10, 10);
    }

    public final boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            ((luc) a.a(hip.a).k("com/google/android/libraries/inputmethod/emoji/renderer/UnicodeRenderableChecker", "hasGlyph", 87, "UnicodeRenderableChecker.java")).t("Empty value");
            return false;
        }
        return this.d.hasGlyph(str);
    }
}
