package defpackage;

import android.app.ActivityManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: bnt  reason: default package */
/* loaded from: classes.dex */
public final class bnt {
    private static final AtomicBoolean a = new AtomicBoolean(false);

    public static nks a(byte[] bArr, int i) {
        nfj b = b();
        ngt ngtVar = nkk.d;
        nfh t = nkk.c.t();
        nem v = nem.v(bArr, 0, i);
        if (t.c) {
            t.cD();
            t.c = false;
        }
        nkk nkkVar = (nkk) t.b;
        nkkVar.a |= 1;
        nkkVar.b = v;
        b.d(ngtVar, (nkk) t.cz());
        return (nks) b.cz();
    }

    public static nfj b() {
        if (ActivityManager.isUserAMonkey() || ActivityManager.isRunningInTestHarness() || a.get()) {
            nfj nfjVar = (nfj) nks.f.t();
            if (nfjVar.c) {
                nfjVar.cD();
                nfjVar.c = false;
            }
            nks nksVar = (nks) nfjVar.b;
            nksVar.a |= 2;
            nksVar.c = false;
            ngt ngtVar = nkr.b;
            nfj nfjVar2 = (nfj) nkr.a.t();
            ngt ngtVar2 = nlb.d;
            nfh t = nlb.c.t();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            nlb nlbVar = (nlb) t.b;
            nlbVar.b = 1;
            nlbVar.a = 1 | nlbVar.a;
            nfjVar2.d(ngtVar2, (nlb) t.cz());
            nfjVar.d(ngtVar, (nkr) nfjVar2.cz());
            return nfjVar;
        }
        nfj nfjVar3 = (nfj) nks.f.t();
        if (nfjVar3.c) {
            nfjVar3.cD();
            nfjVar3.c = false;
        }
        nks nksVar2 = (nks) nfjVar3.b;
        nksVar2.a |= 2;
        nksVar2.c = true;
        return nfjVar3;
    }
}
