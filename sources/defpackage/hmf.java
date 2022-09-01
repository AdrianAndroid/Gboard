package defpackage;

import android.os.Handler;
import com.google.android.libraries.inputmethod.ime.async.AbstractAsyncIme;

/* compiled from: PG */
/* renamed from: hmf  reason: default package */
/* loaded from: classes.dex */
final class hmf extends gxt {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ hmi c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hmf(hmi hmiVar, Handler handler, int i, int i2) {
        super(handler);
        this.c = hmiVar;
        this.a = i;
        this.b = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractAsyncIme abstractAsyncIme = this.c.a;
        b(abstractAsyncIme.k(this.a) ? null : abstractAsyncIme.E.i(this.b));
    }
}
