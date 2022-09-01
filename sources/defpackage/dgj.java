package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import java.util.Map;

/* compiled from: PG */
/* renamed from: dgj  reason: default package */
/* loaded from: classes.dex */
public final class dgj {
    public final Paint a;
    public gpo e;
    public gpo f;
    public float h;
    public final dgi i;
    public final RectF b = new RectF();
    public final Path c = new Path();
    public final Map d = lre.q();
    public float g = 1.0f;

    public dgj(Context context) {
        Paint paint = new Paint();
        this.a = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        this.i = new dgi(context);
    }

    public static float a(gpo gpoVar, gpo gpoVar2) {
        float f = gpoVar.a - gpoVar2.a;
        float f2 = gpoVar.b - gpoVar2.b;
        return (float) Math.sqrt((f * f) + (f2 * f2));
    }

    public final void b(int i) {
        this.a.setAlpha(i);
    }
}
