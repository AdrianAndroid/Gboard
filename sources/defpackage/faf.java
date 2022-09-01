package defpackage;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: faf  reason: default package */
/* loaded from: classes.dex */
public final class faf {
    public final AtomicInteger a = new AtomicInteger(0);
    public final idk b;
    public volatile int c;
    public volatile long d;
    public volatile long e;
    private final mks f;

    public faf() {
        ieh j = ieh.j();
        gyc gycVar = gyc.b;
        this.b = j;
        this.f = gycVar;
    }

    public final void a(jbw jbwVar) {
        if (this.a.get() != 1) {
            return;
        }
        nfh t = bns.f.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        bns bnsVar = (bns) t.b;
        bnsVar.a |= 2;
        bnsVar.c = false;
        this.c++;
        int i = this.c % 3;
        if (i == 1) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            bns bnsVar2 = (bns) t.b;
            bnsVar2.a = 1 | bnsVar2.a;
            bnsVar2.b = ".";
        } else if (i != 2) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            bns bnsVar3 = (bns) t.b;
            bnsVar3.a = 1 | bnsVar3.a;
            bnsVar3.b = "...";
        } else {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            bns bnsVar4 = (bns) t.b;
            bnsVar4.a = 1 | bnsVar4.a;
            bnsVar4.b = "..";
        }
        nfh t2 = bnq.b.t();
        t2.dH(t);
        jbwVar.u((bnq) t2.cz());
        this.f.a(new elr(this, jbwVar, 12), 400L, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(jbw jbwVar) {
        if (this.a.get() == 1) {
            this.a.set(2);
            nfh t = bnq.b.t();
            nfh t2 = bns.f.t();
            if (t2.c) {
                t2.cD();
                t2.c = false;
            }
            bns bnsVar = (bns) t2.b;
            int i = bnsVar.a | 1;
            bnsVar.a = i;
            bnsVar.b = "";
            bnsVar.a = i | 2;
            bnsVar.c = false;
            t.dH(t2);
            jbwVar.u((bnq) t.cz());
            this.b.e(fbm.VOICE_ELLIPSIS_HIDDEN_REASON, 2);
            c();
        }
    }

    public final void c() {
        this.b.g(fbp.ELLIPSIS_DISPLAY_DURATION, SystemClock.elapsedRealtime() - this.e);
    }
}
