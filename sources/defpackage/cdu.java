package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* renamed from: cdu  reason: default package */
/* loaded from: classes.dex */
public final class cdu implements Callable {
    final /* synthetic */ msv a;
    final /* synthetic */ cdv b;

    public cdu(cdv cdvVar, msv msvVar) {
        this.b = cdvVar;
        this.a = msvVar;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v26, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v36, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.util.Set, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        mko K;
        mko h;
        cdv cdvVar = this.b;
        final msv msvVar = this.a;
        if (cdv.e() && cdvVar.d()) {
            long longValue = ((Long) cas.n.c()).longValue();
            if (System.currentTimeMillis() - ((AtomicLong) cdvVar.r.a).get() >= ((Long) cas.m.c()).longValue() && cdvVar.r.b() < longValue && cdvVar.c()) {
                lvw.e(new lth() { // from class: cds
                    /* JADX WARN: Removed duplicated region for block: B:46:0x0177  */
                    @Override // defpackage.lth
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object a() {
                        /*
                            Method dump skipped, instructions count: 802
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.cds.a():java.lang.Object");
                    }
                });
                long elapsedRealtime = SystemClock.elapsedRealtime();
                mtg identifyLanguage = cdvVar.j.identifyLanguage(msvVar);
                cdvVar.l.g(caq.IDENTIFY_LANGUAGE, SystemClock.elapsedRealtime() - elapsedRealtime);
                boolean z = identifyLanguage.c;
                String str = identifyLanguage.b;
                ((ltd) ((ltd) cdv.a.b()).k("com/google/android/apps/inputmethod/libs/delight5/langid/LanguageIdentifierWrapper", "detectLanguage", 500, "LanguageIdentifierWrapper.java")).w("LangId Response: %s", identifyLanguage);
                if (!identifyLanguage.b.isEmpty()) {
                    jav f = jav.f(jay.d(identifyLanguage.b));
                    if (!f.D()) {
                        hrx hrxVar = (hrx) cdvVar.n;
                        if (hrxVar.P != null) {
                            kdr kdrVar = hrxVar.P;
                            Context context = hrxVar.i;
                            llp g = kdrVar.g(hrxVar.N);
                            int i = ((lrl) g).c;
                            int i2 = 0;
                            while (true) {
                                if (i2 >= i) {
                                    break;
                                }
                                int i3 = i2 + 1;
                                if (TextUtils.equals(((jav) g.get(i2)).g, f.g)) {
                                    llp b = hqr.b();
                                    int size = b.size();
                                    int i4 = 0;
                                    while (true) {
                                        if (i4 < size) {
                                            int i5 = i4 + 1;
                                            if (((hqt) b.get(i4)).i().equals(f)) {
                                                break;
                                            }
                                            i4 = i5;
                                        } else {
                                            cdvVar.l.e(cap.LANG_ID_LANGUAGE_DETECTED, f);
                                            gck gckVar = cdvVar.r;
                                            kcq kcqVar = (kcq) gckVar.b.get(f);
                                            if (kcqVar == null) {
                                                kcqVar = new kcq();
                                                gckVar.b.put(f, kcqVar);
                                            }
                                            ((AtomicInteger) kcqVar.c).incrementAndGet();
                                            for (muc mucVar : msvVar.b) {
                                                kcqVar.b.add(mucVar.b);
                                            }
                                            kcq kcqVar2 = (kcq) cdvVar.r.b.get(f);
                                            if (kcqVar2 != null && ((AtomicInteger) kcqVar2.c).get() > ((Long) cas.p.c()).longValue() && kcqVar2.b.size() > ((Long) cas.q.c()).longValue() && !((AtomicBoolean) kcqVar2.a).get()) {
                                                hqt a = cdvVar.n.a(f);
                                                if (a == null || !TextUtils.equals(a.i().g, f.g)) {
                                                    hqt b2 = hqp.b();
                                                    if (b2 != null) {
                                                        hqy hqyVar = cdvVar.n;
                                                        jau H = jav.H();
                                                        H.e(f.g);
                                                        H.g(b2.h().j);
                                                        K = hqyVar.c(H.a());
                                                    } else {
                                                        K = kcu.K(null);
                                                    }
                                                    h = mio.h(K, new bxo(cdvVar, f, 8), mjl.a);
                                                } else {
                                                    h = kcu.K(null);
                                                }
                                                kcu.U(h, new bvo(cdvVar, f, 4), mjl.a);
                                            }
                                        }
                                    }
                                } else {
                                    i2 = i3;
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }
}
