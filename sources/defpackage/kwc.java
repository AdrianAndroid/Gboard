package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: kwc  reason: default package */
/* loaded from: classes.dex */
public abstract class kwc {
    final kvp a;
    protected kwb b;

    public kwc(kvp kvpVar) {
        this.a = kvpVar;
    }

    public abstract int a();

    public abstract int b();

    public abstract void c(Canvas canvas, Rect rect, float f);

    public abstract void d(Canvas canvas, Paint paint, float f, float f2, int i);

    public abstract void e(Canvas canvas, Paint paint);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(Canvas canvas, Rect rect, float f) {
        this.a.a();
        c(canvas, rect, f);
    }
}
