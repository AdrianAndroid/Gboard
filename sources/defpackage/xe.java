package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* renamed from: xe  reason: default package */
/* loaded from: classes2.dex */
public final class xe implements Callable {
    final /* synthetic */ String a;
    final /* synthetic */ Context b;
    final /* synthetic */ xd c;
    final /* synthetic */ int d;

    public xe(String str, Context context, xd xdVar, int i) {
        this.a = str;
        this.b = context;
        this.c = xdVar;
        this.d = i;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: a */
    public final krm call() {
        try {
            return xg.b(this.a, this.b, this.c, this.d);
        } catch (Throwable unused) {
            return new krm(-3);
        }
    }
}
