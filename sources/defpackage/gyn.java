package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: gyn  reason: default package */
/* loaded from: classes.dex */
public final class gyn {
    public final Object a;
    public final long b;
    public final int c;
    public final boolean d;
    public float e = 0.0f;

    public gyn(Object obj, int i, long j, boolean z) {
        this.a = obj;
        this.c = i;
        this.b = j;
        this.d = z;
    }

    public final void a(int i, long j) {
        float f = 1.0f;
        float f2 = (this.c + 1.0f) / (i + 1);
        float pow = (float) Math.pow(0.5d, ((float) Math.min(Math.max(0L, j - this.b), TimeUnit.MILLISECONDS.convert(180L, TimeUnit.DAYS))) / ((float) TimeUnit.MILLISECONDS.convert(10L, TimeUnit.DAYS)));
        if (true != this.d) {
            f = 0.0f;
        }
        this.e = ((f2 + pow) + f) / 3.0f;
    }
}
