package defpackage;

import android.os.Handler;
import com.google.android.libraries.inputmethod.ime.async.AbstractAsyncIme;

/* compiled from: PG */
/* renamed from: hmh  reason: default package */
/* loaded from: classes.dex */
final class hmh extends gxt {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ hmi e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hmh(hmi hmiVar, Handler handler, int i, int i2, int i3, int i4) {
        super(handler);
        this.e = hmiVar;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractAsyncIme abstractAsyncIme = this.e.a;
        b(abstractAsyncIme.k(this.a) ? null : abstractAsyncIme.E.hT(this.b, this.c, this.d));
    }
}
