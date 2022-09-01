package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* renamed from: orw  reason: default package */
/* loaded from: classes2.dex */
abstract class orw implements ovp {
    protected final oux a;
    protected boolean b;
    protected long c = 0;
    final /* synthetic */ osc d;

    public orw(osc oscVar) {
        this.d = oscVar;
        this.a = new oux(oscVar.c.a());
    }

    @Override // defpackage.ovp
    public final ovr a() {
        return this.a;
    }

    @Override // defpackage.ovp
    public long b(our ourVar, long j) {
        try {
            long b = this.d.c.b(ourVar, j);
            if (b > 0) {
                this.c += b;
            }
            return b;
        } catch (IOException e) {
            c(false, e);
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c(boolean z, IOException iOException) {
        int i = this.d.e;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            throw new IllegalStateException("state: " + i);
        }
        osc.k(this.a);
        osc oscVar = this.d;
        oscVar.e = 6;
        orj orjVar = oscVar.b;
        if (orjVar == null) {
            return;
        }
        orjVar.g(!z, oscVar, iOException);
    }
}
