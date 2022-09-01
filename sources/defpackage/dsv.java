package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: dsv  reason: default package */
/* loaded from: classes.dex */
public final class dsv {
    public static final dsv a = new dsv(ieh.j());
    public final idk g;
    public volatile long b = -1;
    public volatile long c = -1;
    private volatile long i = -1;
    public volatile long d = -1;
    public volatile long e = -1;
    public volatile long f = -1;
    public final AtomicReference h = new AtomicReference(ldu.a);

    public dsv(idk idkVar) {
        this.g = idkVar;
    }

    public final void a(long j) {
        dta dtaVar;
        if (this.i > 0) {
            return;
        }
        this.i = j;
        few fewVar = (few) ((lfb) this.h.get()).d();
        if (few.AIAI.equals(fewVar)) {
            dtaVar = dta.NGA_AIAI_MIC_TAP_TO_START_LISTENING_TIME;
        } else if (few.ON_DEVICE.equals(fewVar)) {
            dtaVar = dta.NGA_ON_DEVICE_MIC_TAP_TO_START_LISTENING_TIME;
        } else {
            dtaVar = few.S3.equals(fewVar) ? dta.NGA_S3_MIC_TAP_TO_START_LISTENING_TIME : null;
        }
        if (this.b <= 0 || dtaVar == null) {
            return;
        }
        this.g.g(dtaVar, j - this.b);
    }

    public final void b() {
        this.f = -1L;
        this.e = -1L;
        this.d = -1L;
        this.i = -1L;
        this.c = -1L;
        this.b = -1L;
    }
}
