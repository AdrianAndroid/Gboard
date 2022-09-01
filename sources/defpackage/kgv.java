package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: kgv  reason: default package */
/* loaded from: classes.dex */
public final class kgv extends kez implements kch, kdt {
    public static final long b = TimeUnit.HOURS.toMillis(12);
    public final kdq c;
    public final Application d;
    public final nox e;
    public final jma f;
    private final kcl g;
    private final Executor h;

    public kgv(kdr kdrVar, Context context, kcl kclVar, Executor executor, nox noxVar, jma jmaVar, oiy oiyVar, byte[] bArr) {
        this.c = kdrVar.a(executor, noxVar, oiyVar);
        this.h = executor;
        this.d = (Application) context;
        this.e = noxVar;
        this.f = jmaVar;
        this.g = kclVar;
    }

    @Override // defpackage.kdt
    public final void ad() {
        this.g.a(this);
    }

    @Override // defpackage.kch
    public final void c(Activity activity) {
        this.g.b(this);
        kcu.P(new mix() { // from class: kgu
            /* JADX WARN: Code restructure failed: missing block: B:238:0x050f, code lost:
                r22 = r3;
                r19 = r4;
                r20 = r5;
                r17 = r7;
                r0 = r8.size();
             */
            /* JADX WARN: Code restructure failed: missing block: B:239:0x051b, code lost:
                r0 = r0 - 1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:240:0x051d, code lost:
                if (r0 < 0) goto L252;
             */
            /* JADX WARN: Code restructure failed: missing block: B:241:0x051f, code lost:
                r1 = (defpackage.kgm) r8.get(r0);
             */
            /* JADX WARN: Code restructure failed: missing block: B:242:0x0527, code lost:
                if (r1.e == false) goto L251;
             */
            /* JADX WARN: Code restructure failed: missing block: B:244:0x0529, code lost:
                r2 = r1.c;
             */
            /* JADX WARN: Code restructure failed: missing block: B:245:0x052b, code lost:
                if (r2 == null) goto L250;
             */
            /* JADX WARN: Code restructure failed: missing block: B:247:0x052d, code lost:
                r2.g += r1.g;
             */
            /* JADX WARN: Code restructure failed: missing block: B:253:0x0535, code lost:
                r0 = new java.util.ArrayList();
                r1 = r8.iterator();
             */
            /* JADX WARN: Code restructure failed: missing block: B:255:0x0542, code lost:
                if (r1.hasNext() == false) goto L272;
             */
            /* JADX WARN: Code restructure failed: missing block: B:256:0x0544, code lost:
                r2 = (defpackage.kgm) r1.next();
             */
            /* JADX WARN: Code restructure failed: missing block: B:257:0x0550, code lost:
                if (r0.size() >= 512) goto L271;
             */
            /* JADX WARN: Code restructure failed: missing block: B:259:0x0554, code lost:
                if (r2.d <= r10) goto L260;
             */
            /* JADX WARN: Code restructure failed: missing block: B:260:0x0557, code lost:
                r3 = defpackage.oom.f.t();
                r5 = r2.a;
             */
            /* JADX WARN: Code restructure failed: missing block: B:261:0x0561, code lost:
                if (r3.c == false) goto L265;
             */
            /* JADX WARN: Code restructure failed: missing block: B:262:0x0563, code lost:
                r3.cD();
                r3.c = false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:264:0x0569, code lost:
                r6 = (defpackage.oom) r3.b;
                r6.e = r5.d;
                r5 = r6.a | 4;
                r6.a = r5;
                r7 = r2.f;
                r7.getClass();
                r5 = r5 | 1;
                r6.a = r5;
                r6.b = r7;
                r7 = r2.g;
                r6.a = r5 | 2;
                r6.d = r7;
                r0.add((defpackage.oom) r3.cz());
             */
            /* JADX WARN: Code restructure failed: missing block: B:268:0x0594, code lost:
                r12.addAll(r0);
             */
            /* JADX WARN: Code restructure failed: missing block: B:269:0x0597, code lost:
                r0 = defpackage.llp.o(r12);
             */
            /* JADX WARN: Removed duplicated region for block: B:198:0x03e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:90:0x061a  */
            /* JADX WARN: Removed duplicated region for block: B:94:0x0638  */
            /* JADX WARN: Removed duplicated region for block: B:97:0x0661  */
            /* JADX WARN: Type inference failed for: r0v150, types: [java.lang.Object, oiy] */
            /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Object, oiy] */
            /* JADX WARN: Type inference failed for: r6v28, types: [java.lang.Object, oiy] */
            @Override // defpackage.mix
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final defpackage.mko a() {
                /*
                    Method dump skipped, instructions count: 1682
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.kgu.a():mko");
            }
        }, this.h);
    }
}
