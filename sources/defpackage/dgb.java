package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* renamed from: dgb  reason: default package */
/* loaded from: classes.dex */
public final class dgb extends dgz implements dhi {
    public static final lug a = lug.i("HandwritingHWRReco");
    public Context b;
    public ExecutorService c;
    public jav d;
    public idk e;

    @Override // defpackage.dhi
    public final void a(jre jreVar) {
        if (!i()) {
            e(false);
        }
    }

    @Override // defpackage.dhi
    public final void b() {
        if (!i()) {
            this.k = false;
            gyc.a.execute(new dga(this));
        }
    }

    public final dhp c() {
        return dhp.a(this.b);
    }

    @Override // defpackage.dgz, java.lang.AutoCloseable
    public final void close() {
        this.c.execute(new dgd(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dgz
    public final void d(idk idkVar, int i, int i2, boolean z, long j) {
        idkVar.g(dgv.HANDWRITING_RECOGNIZE, j);
        idkVar.e(dgt.HANDWRITING_RECOGNITION, Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z), Integer.valueOf((int) j), this.d);
    }

    public final void e(boolean z) {
        this.c.execute(new dfy(this.b, this.d, c(), this, dhd.a, this.e, z, this.c));
    }

    public final boolean f(gpi gpiVar) {
        if (i()) {
            return false;
        }
        this.l.set(gpiVar);
        super.g();
        return true;
    }
}
