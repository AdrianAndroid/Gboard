package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import com.google.android.apps.inputmethod.libs.mozc.session.MozcJNI;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dsk  reason: default package */
/* loaded from: classes.dex */
public final class dsk implements Handler.Callback {
    static final ggn a = ggn.k;
    private static final lmz e = lmz.w(14, 7, 6, 22, 11, 12, 16, 10, 26, 8, 28);
    long b = 0;
    ggr c;
    boolean d;
    private final dse f;
    private final dso g;

    public dsk(dso dsoVar, dse dseVar) {
        this.g = dsoVar;
        this.f = dseVar;
    }

    static boolean b(ggh gghVar) {
        lmz lmzVar = e;
        int h = gqn.h(gghVar.b);
        if (h == 0) {
            h = 1;
        }
        return !lmzVar.contains(Integer.valueOf(h + (-1)));
    }

    private static final ggc c(ggh gghVar) {
        ggc ggcVar;
        nfh t = ggc.d.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        ggc ggcVar2 = (ggc) t.b;
        gghVar.getClass();
        ggcVar2.b = gghVar;
        int i = ggcVar2.a | 1;
        ggcVar2.a = i;
        ggn ggnVar = a;
        ggnVar.getClass();
        ggcVar2.c = ggnVar;
        ggcVar2.a = i | 2;
        ggc ggcVar3 = (ggc) t.cz();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        jdg.u(ggcVar3);
        try {
            ggcVar = (ggc) nfm.z(ggc.d, MozcJNI.evalCommand(ggcVar3.q()), nfb.b());
        } catch (IOException unused) {
            ggcVar = ggc.d;
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        int h = gqn.h(gghVar.b);
        if (h != 0 && h == 4) {
            ieh.j().g(dsb.DECODE_JAPANESE_DECODER, elapsedRealtime2 - elapsedRealtime);
        }
        return ggcVar;
    }

    final void a() {
        if (this.b != 0) {
            return;
        }
        nfh t = ggh.o.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        ggh gghVar = (ggh) t.b;
        gghVar.b = 1;
        gghVar.a |= 1;
        nfh t2 = gfy.c.t();
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        gfy gfyVar = (gfy) t2.b;
        gfyVar.b = 1;
        gfyVar.a |= 1;
        if (t.c) {
            t.cD();
            t.c = false;
        }
        ggh gghVar2 = (ggh) t.b;
        gfy gfyVar2 = (gfy) t2.cz();
        gfyVar2.getClass();
        gghVar2.h = gfyVar2;
        gghVar2.a |= 64;
        ggn ggnVar = c((ggh) t.cz()).c;
        if (ggnVar == null) {
            ggnVar = ggn.k;
        }
        this.b = ggnVar.b;
        if ((ggnVar.a & 262144) != 0) {
            ggw ggwVar = ggnVar.i;
            if (ggwVar == null) {
                ggwVar = ggw.b;
            }
            int d = giw.d(ggwVar.a);
            if (d == 0) {
                d = 1;
            }
            if (d == 3) {
                this.d = true;
            } else if (d == 7 || d == 6 || d == 5 || d == 9 || d == 8 || d == 10) {
                this.d = false;
            }
        }
        ggr c = dsn.c();
        this.c = c;
        nfh t3 = ggh.o.t();
        long j = this.b;
        if (t3.c) {
            t3.cD();
            t3.c = false;
        }
        ggh gghVar3 = (ggh) t3.b;
        int i = gghVar3.a | 2;
        gghVar3.a = i;
        gghVar3.c = j;
        gghVar3.b = 17;
        int i2 = 1 | i;
        gghVar3.a = i2;
        c.getClass();
        gghVar3.i = c;
        gghVar3.a = i2 | 256;
        c((ggh) t3.cz());
    }

    /* JADX WARN: Code restructure failed: missing block: B:162:0x03db, code lost:
        if (r12 != null) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01a3, code lost:
        if (r7 != 16) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01cc, code lost:
        if (r7 == defpackage.ggk.BACKSPACE) goto L85;
     */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean handleMessage(android.os.Message r19) {
        /*
            Method dump skipped, instructions count: 1128
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dsk.handleMessage(android.os.Message):boolean");
    }
}
