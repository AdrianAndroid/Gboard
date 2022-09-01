package defpackage;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* renamed from: vj  reason: default package */
/* loaded from: classes2.dex */
public abstract class vj {
    public static Handler e() {
        return new Handler(Looper.getMainLooper());
    }

    public abstract void a(Typeface typeface);

    public abstract void b();

    public final void c(int i) {
        e().post(new od(this, 6));
    }

    public final void d(Typeface typeface) {
        e().post(new bw(this, typeface, 11));
    }
}
