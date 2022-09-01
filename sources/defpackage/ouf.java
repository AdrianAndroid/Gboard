package defpackage;

import java.io.InterruptedIOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ouf  reason: default package */
/* loaded from: classes2.dex */
public final class ouf implements oqa {
    final /* synthetic */ oug a;
    private boolean b;

    public ouf(oug ougVar) {
        this.a = ougVar;
    }

    @Override // defpackage.oqa
    public final oql a(orr orrVar) {
        oqi oqiVar = orrVar.d;
        synchronized (this.a.g) {
            oug ougVar = this.a;
            ougVar.i = false;
            orf orfVar = orrVar.c;
            ougVar.j = orfVar.b.b;
            ougVar.k = orfVar.e;
            ougVar.g.notifyAll();
            while (!this.b) {
                try {
                    this.a.g.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException();
                }
            }
        }
        oqj oqjVar = oqiVar.d;
        if (oqjVar instanceof oui) {
            oqiVar = ((oui) oqjVar).c(oqiVar);
        }
        oql a = orrVar.a(oqiVar);
        synchronized (this.a.g) {
            oug ougVar2 = this.a;
            ougVar2.h = a;
            ougVar2.url = a.a.a.j();
        }
        return a;
    }

    public final void b() {
        synchronized (this.a.g) {
            this.b = true;
            this.a.g.notifyAll();
        }
    }
}
