package defpackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: oqt  reason: default package */
/* loaded from: classes2.dex */
final class oqt implements ovp {
    boolean a;
    final /* synthetic */ out b;
    final /* synthetic */ ous c;
    final /* synthetic */ ooy d;

    public oqt(out outVar, ooy ooyVar, ous ousVar) {
        this.b = outVar;
        this.d = ooyVar;
        this.c = ousVar;
    }

    @Override // defpackage.ovp
    public final ovr a() {
        return this.b.a();
    }

    @Override // defpackage.ovp
    public final long b(our ourVar, long j) {
        try {
            long b = this.b.b(ourVar, 8192L);
            if (b != -1) {
                ourVar.G(((ovh) this.c).b, ourVar.b - b, b);
                this.c.T();
                return b;
            }
            if (!this.a) {
                this.a = true;
                this.c.close();
            }
            return -1L;
        } catch (IOException e) {
            if (!this.a) {
                this.a = true;
                this.d.a();
            }
            throw e;
        }
    }

    @Override // defpackage.ovp, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.a && !oqs.C(this, TimeUnit.MILLISECONDS)) {
            this.a = true;
            this.d.a();
        }
        this.b.close();
    }
}
