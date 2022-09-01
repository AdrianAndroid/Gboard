package defpackage;

import j$.util.DesugarTimeZone;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: jmn  reason: default package */
/* loaded from: classes.dex */
public final class jmn implements jml {
    public static final /* synthetic */ int d = 0;
    private static final TimeZone e = DesugarTimeZone.getTimeZone("UTC");
    public final jjd a;
    public final Executor b;
    public final kqr c;

    public jmn(kqr kqrVar, jjd jjdVar, Executor executor) {
        this.c = kqrVar;
        this.a = jjdVar;
        this.b = executor;
    }

    public static long d(long j) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(e);
        gregorianCalendar.setTimeInMillis(j);
        gregorianCalendar.set(11, 0);
        gregorianCalendar.set(12, 0);
        gregorianCalendar.set(13, 0);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    @Override // defpackage.jml
    public final mko a() {
        AtomicReference atomicReference = new AtomicReference(ldu.a);
        return jco.i(this.c.b(new jkz(this, atomicReference, 2), mjl.a), new jks(atomicReference, 18), mjl.a);
    }

    @Override // defpackage.jml
    public final mko b(jil jilVar) {
        return this.c.b(new jks(jilVar, 19), this.b);
    }

    @Override // defpackage.jml
    public final void c() {
        AtomicReference atomicReference = new AtomicReference(llp.q());
        jco.i(this.c.b(new jks(atomicReference, 20), this.b), ldd.a(new jks(atomicReference, 17)), this.b);
    }
}
