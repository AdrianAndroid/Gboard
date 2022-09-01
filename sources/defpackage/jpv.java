package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* renamed from: jpv  reason: default package */
/* loaded from: classes.dex */
public final class jpv {
    final long a;
    final Object b;
    final Object c;

    private jpv(idk idkVar, iih iihVar, long j) {
        this.c = idkVar;
        this.b = iihVar;
        this.a = j;
    }

    public jpv(jpz jpzVar, long j) {
        this.b = null;
        this.a = j;
        this.c = jpzVar;
    }

    public jpv(jqm jqmVar, long j) {
        this.b = jqmVar;
        this.a = j;
        this.c = null;
    }

    public static jpv b(idk idkVar, iih iihVar) {
        return new jpv(idkVar, iihVar, SystemClock.elapsedRealtime());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [idk, java.lang.Object] */
    public final iij a(iii iiiVar) {
        iiiVar.f((int) (SystemClock.elapsedRealtime() - this.a));
        iij a = iiiVar.a();
        this.c.e(iik.c, this.b, a);
        return a;
    }
}
