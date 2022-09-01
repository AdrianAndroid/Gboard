package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.libraries.performance.primes.transmitter.clearcut.ClearcutMetricSnapshotTransmitter;

/* compiled from: PG */
/* renamed from: kiq  reason: default package */
/* loaded from: classes.dex */
public final class kiq implements kij {
    public final Context a;
    public final ClearcutMetricSnapshotTransmitter b;
    private final lgb c;
    private final boolean d;
    private final kio e;

    public kiq(Context context, lfb lfbVar, kio kioVar, ClearcutMetricSnapshotTransmitter clearcutMetricSnapshotTransmitter) {
        this.a = context;
        this.c = jdg.n(new ihp(context, 15));
        this.d = ((Boolean) lfbVar.c(false)).booleanValue();
        this.e = kioVar;
        this.b = clearcutMetricSnapshotTransmitter;
    }

    @Override // defpackage.kij
    public final kii a() {
        return new kii(9);
    }

    @Override // defpackage.kij
    public final mko b(oos oosVar) {
        int i;
        if (this.d) {
            oog oogVar = oosVar.g;
            if (oogVar == null) {
                oogVar = oog.j;
            }
            if ((oogVar.a & 1) != 0) {
                return mio.g(this.e.a(), new jkz(this, oosVar, 3), mjl.a);
            }
        }
        if ((oosVar.a & 1024) != 0 && ((Boolean) this.c.a()).booleanValue()) {
            nfh nfhVar = (nfh) oosVar.N(5);
            nfhVar.cG(oosVar);
            ook ookVar = oosVar.j;
            if (ookVar == null) {
                ookVar = ook.o;
            }
            nga<ooj> ngaVar = ookVar.j;
            if (!ngaVar.isEmpty()) {
                nfh t = ooo.c.t();
                ooj oojVar = null;
                for (ooj oojVar2 : ngaVar) {
                    if (oojVar != null && (i = oojVar.d + 1) != oojVar2.c) {
                        t.eN(0);
                        t.eM(i);
                    }
                    t.eN(oojVar2.b);
                    t.eM(oojVar2.c);
                    oojVar = oojVar2;
                }
                if (oojVar != null && (oojVar.a & 4) != 0) {
                    int i2 = oojVar.d;
                    t.eN(0);
                    t.eM(i2 + 1);
                }
                nfh nfhVar2 = (nfh) ookVar.N(5);
                nfhVar2.cG(ookVar);
                if (nfhVar2.c) {
                    nfhVar2.cD();
                    nfhVar2.c = false;
                }
                ((ook) nfhVar2.b).j = ook.G();
                if (nfhVar2.c) {
                    nfhVar2.cD();
                    nfhVar2.c = false;
                }
                ook ookVar2 = (ook) nfhVar2.b;
                ooo oooVar = (ooo) t.cz();
                oooVar.getClass();
                ookVar2.i = oooVar;
                ookVar2.a |= 128;
                ookVar = (ook) nfhVar2.cz();
            }
            if (nfhVar.c) {
                nfhVar.cD();
                nfhVar.c = false;
            }
            oos oosVar2 = (oos) nfhVar.b;
            ookVar.getClass();
            oosVar2.j = ookVar;
            oosVar2.a |= 1024;
            oosVar = (oos) nfhVar.cz();
        }
        mko h = mio.h(this.e.a(), new jmg(this, oosVar, 4), mjl.a);
        if (Log.isLoggable("ClearcutMetricXmitter", 4)) {
            kcu.U(h, new ivq(16), mjl.a);
        }
        return h;
    }
}
