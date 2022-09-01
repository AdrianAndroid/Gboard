package defpackage;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* renamed from: amr  reason: default package */
/* loaded from: classes.dex */
public final class amr implements Callable {
    final /* synthetic */ Context a;
    final /* synthetic */ int b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public amr(String str, Context context, xd xdVar, int i, int i2) {
        this.e = i2;
        this.c = str;
        this.a = context;
        this.d = xdVar;
        this.b = i;
    }

    public amr(WeakReference weakReference, Context context, int i, String str, int i2) {
        this.e = i2;
        this.c = weakReference;
        this.a = context;
        this.b = i;
        this.d = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        if (this.e == 0) {
            Context context = (Context) ((WeakReference) this.c).get();
            if (context == null) {
                context = this.a;
            }
            return ams.d(context, this.b, (String) this.d);
        }
        Object obj = this.c;
        return xg.b((String) obj, this.a, (xd) this.d, this.b);
    }
}
