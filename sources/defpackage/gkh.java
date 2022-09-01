package defpackage;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* renamed from: gkh  reason: default package */
/* loaded from: classes.dex */
public final class gkh {
    private final Map a;
    private final gke b;
    private final gjd c;
    private final int d;
    private final int e;
    private final ArrayDeque f;
    private final oir g;

    public gkh(oir oirVar, Map map, gke gkeVar, gjd gjdVar, int i, int i2, ArrayDeque arrayDeque, byte[] bArr, byte[] bArr2) {
        this.g = oirVar;
        this.a = map;
        this.b = gkeVar;
        this.c = gjdVar;
        this.d = i;
        this.e = i2;
        this.f = arrayDeque;
    }

    public final void a(nfh nfhVar) {
        int a;
        int i = 2;
        boolean z = false;
        if ((((nja) nfhVar.b).a & 64) == 0) {
            if (nfhVar.c) {
                nfhVar.cD();
                nfhVar.c = false;
            }
            nja njaVar = (nja) nfhVar.b;
            njaVar.h = ndb.ai(2);
            njaVar.a |= 64;
        }
        StringWriter stringWriter = new StringWriter();
        ((Throwable) this.c.b.c(new Throwable())).printStackTrace(new PrintWriter(stringWriter));
        String stringWriter2 = stringWriter.toString();
        int length = stringWriter2.length();
        npv.b();
        long b = nps.a.a().b();
        if (b < length && b >= 0) {
            length = (int) b;
        }
        String substring = stringWriter2.substring(0, length);
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        nja njaVar2 = (nja) nfhVar.b;
        substring.getClass();
        njaVar2.a |= 2048;
        njaVar2.l = substring;
        nja njaVar3 = (nja) nfhVar.cz();
        npv.b();
        if (!nps.a.a().f()) {
            int aj = ndb.aj(njaVar3.h);
            if (aj == 0) {
                aj = 2;
            }
            if (ndb.ai(aj) == 6) {
                return;
            }
        }
        npv.b();
        if (nps.a.a().g() || (a = niz.a(njaVar3.i)) == 0 || a != 4) {
            Long valueOf = Long.valueOf(njaVar3.d);
            int aj2 = ndb.aj(njaVar3.h);
            if (aj2 != 0) {
                i = aj2;
            }
            gkg gkgVar = new gkg(valueOf, i);
            npv.b();
            long a2 = nps.a.a().a();
            synchronized (this.a) {
                Long l = (Long) this.a.get(gkgVar);
                long currentTimeMillis = System.currentTimeMillis();
                if (l == null || a2 <= 0 || l.longValue() + a2 < currentTimeMillis) {
                    z = true;
                }
                if (z) {
                    this.a.put(gkgVar, Long.valueOf(currentTimeMillis));
                }
            }
            if (!z) {
                return;
            }
            this.b.a(njaVar3);
        }
    }

    public final nfh b(int i) {
        nfh t = nja.m.t();
        String packageName = this.c.a.getPackageName();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        nja njaVar = (nja) t.b;
        packageName.getClass();
        njaVar.a |= 1;
        njaVar.b = packageName;
        int e = this.g.e(this.c.a);
        if (t.c) {
            t.cD();
            t.c = false;
        }
        nja njaVar2 = (nja) t.b;
        int i2 = njaVar2.a | 2;
        njaVar2.a = i2;
        njaVar2.c = e;
        int i3 = this.d;
        int i4 = i2 | 4;
        njaVar2.a = i4;
        njaVar2.d = i3;
        int i5 = i4 | 8;
        njaVar2.a = i5;
        njaVar2.e = -2032180703L;
        int i6 = this.e;
        njaVar2.a = i5 | 16;
        njaVar2.f = i6;
        llk e2 = llp.e();
        Iterator descendingIterator = this.f.descendingIterator();
        while (descendingIterator.hasNext()) {
            e2.h(Long.valueOf(((gjk) descendingIterator.next()).d));
        }
        llp g = e2.g();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        nja njaVar3 = (nja) t.b;
        njaVar3.c();
        ndt.cs(g, njaVar3.k);
        if (t.c) {
            t.cD();
            t.c = false;
        }
        nja njaVar4 = (nja) t.b;
        njaVar4.h = ndb.ai(i);
        njaVar4.a |= 64;
        return t;
    }
}
