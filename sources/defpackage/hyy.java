package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.util.Printer;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.mdd.ForegroundDownloadService;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: hyy  reason: default package */
/* loaded from: classes.dex */
public final class hyy implements gzv {
    public static final hyz b;
    private static volatile hyy h;
    public final jix d;
    public final idk e;
    private final hzi i;
    private final koq j;
    private final iea k;
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/mdd/DownloadManager");
    public static final hhl c = hhq.f("mdd_max_retry_count", 3);
    public final HashMap g = new HashMap();
    public final igr f = igr.d(guw.a());

    static {
        hyt a2 = hyz.a();
        a2.c(true);
        b = a2.a();
    }

    private hyy() {
        iea ieaVar = new iea(this, 1);
        this.k = ieaVar;
        Context a2 = guw.a();
        mks a3 = gxo.a(10);
        jmz jmzVar = new jmz(new gjz(), a3, null);
        jnc jncVar = new jnc(a2);
        koq c2 = koq.h(guw.a()).c();
        this.j = c2;
        kcq kcqVar = new kcq((List) llp.r(c2), (List) llp.s(new kpz(), new hzp()), (List) llp.s(jncVar, jmzVar));
        hyv hyvVar = new hyv();
        lgb n = jdg.n(new hyu(a2, a3, kcqVar, jmzVar, hyvVar, null, null, null));
        hzi hziVar = new hzi(ism.a(a2));
        this.i = hziVar;
        ArrayList arrayList = new ArrayList();
        ldu lduVar = ldu.a;
        osr osrVar = new osr((char[]) null);
        Context applicationContext = a2.getApplicationContext();
        buf bufVar = new buf(this, n, 6);
        lfb g = lfb.g(hziVar);
        lfb g2 = lfb.g(jmzVar);
        lfb g3 = lfb.g(ForegroundDownloadService.class);
        kqi a4 = ift.a();
        lfb g4 = lfb.g(hyvVar);
        jdg.u(applicationContext);
        jdg.u(g);
        jdg.u(kcqVar);
        jdg.u(a4);
        jdg.u(jncVar);
        jdg.u(g2);
        jdg.u(bufVar);
        Executor E = kcu.E(a3);
        osrVar.a = new jlr(applicationContext);
        osrVar.b = new jlt(E);
        osrVar.c = new jls(lduVar, bufVar);
        osrVar.e = new jlv(kcqVar, jncVar, new lwm(), g2, lduVar, lduVar, lduVar, lfb.g(new kez(applicationContext)), (jhy) g4.c(new jiy()), lduVar, null, null, null, null);
        osrVar.d = new jma(a3, a4);
        nxp.U(osrVar.a, jlr.class);
        nxp.U(osrVar.c, jls.class);
        nxp.U(osrVar.b, jlt.class);
        nxp.U(osrVar.e, jlv.class);
        nxp.U(osrVar.d, jma.class);
        Object obj = osrVar.a;
        Object obj2 = osrVar.c;
        Object obj3 = osrVar.b;
        Object obj4 = osrVar.e;
        Object obj5 = osrVar.d;
        jlv jlvVar = (jlv) obj4;
        oiy c3 = npd.c(new jlz(jlvVar, 1));
        oiy c4 = npd.c(new jlz(jlvVar, 9));
        jlr jlrVar = (jlr) obj;
        lba lbaVar = new lba(jlrVar, 1);
        oiy c5 = npd.c(new jlz(jlvVar, 3));
        oiy c6 = npd.c(new jlz(jlvVar, 2));
        jlo jloVar = new jlo(lbaVar, c4, c5, c6);
        oiy c7 = npd.c(new gne(lbaVar, c5, 8, (float[]) null));
        oiy c8 = npd.c(new jlz(jlvVar, 7));
        jkx jkxVar = new jkx(c6);
        jma jmaVar = (jma) obj5;
        oiy c9 = npd.c(new jmb(jmaVar, lbaVar, c7, c8, c3, jkxVar, c5, 4));
        oiy c10 = npd.c(new csm((jlt) obj3, 19));
        oiy c11 = npd.c(new jly((oiy) lbaVar, c4, c9, c10, c6, 2, (char[]) null));
        oiy c12 = npd.c(new gne(lbaVar, c5, 7, (boolean[]) null));
        oiy c13 = npd.c(new jlz(new jkq(lbaVar, c3, jloVar, c11, npd.c(new jly((oiy) lbaVar, c4, npd.c(new jmb(jmaVar, lbaVar, c12, c8, c3, jkxVar, c5, 2)), c10, c6, 1, (byte[]) null)), c7, c12, jkxVar, c8, c10, c6), 5));
        jls jlsVar = (jls) obj2;
        oiy c14 = npd.c(new csm(jlsVar, 18));
        oiy c15 = npd.c(new jlz(jlvVar, 4));
        oiy c16 = npd.c(new csm(jlvVar, 20));
        oiy c17 = npd.c(new jmc(jmaVar, lbaVar, c5, 0));
        oiy c18 = npd.c(new jlz(npd.c(jlw.a), 8));
        oiy c19 = npd.c(new jmc(c17, c18, c10, 1));
        oiy c20 = npd.c(new csm(jlsVar, 17));
        jlm jlmVar = new jlm(lbaVar, c18, c4, c5, c10);
        oiy c21 = npd.c(new gne((oiy) lbaVar, c5, 6, (int[]) null));
        oiy c22 = npd.c(new jly(lbaVar, c18, c4, npd.c(new jmb(jmaVar, lbaVar, c21, c8, c3, jkxVar, c5, 3)), c10, 0));
        oiy c23 = npd.c(new gne((oiy) lbaVar, c5, 5, (short[]) null));
        oiy c24 = npd.c(new jlz(new jkn(c3, jlmVar, c22, npd.c(new khh(lbaVar, c18, c4, npd.c(new jmb(jmaVar, lbaVar, c23, c8, c3, jkxVar, c5, 0)), c10, c6, 1, null)), c21, c23, jkxVar, c8, c10, c6), 0));
        oiy c25 = npd.c(new gne(jlvVar, lbaVar, 4));
        oiy c26 = npd.c(new jlz(jlvVar, 6));
        applicationContext.getApplicationContext();
        kcu.E(E);
        lfb.g((jmw) g2.a());
        lfb.g((Class) g3.a());
        lxj.t();
        lxj.t();
        lwm lwmVar = (lwm) c3.a();
        Context c27 = lba.c(jlrVar);
        lwm lwmVar2 = (lwm) c3.a();
        jli r = kki.r(jlrVar, c3, c4, c5, c6, c8, c10, c13, c14, c15, c16, c19, c20, c24);
        jlk jlkVar = (jlk) c13.a();
        jkk s = kki.s(jlrVar, jlvVar, c3, c4, c5, c6, c8, c10, c13, c14, c15, c16, c18, c19, c20, c24, c25, c26);
        jkl jklVar = (jkl) c24.a();
        jli r2 = kki.r(jlrVar, c3, c4, c5, c6, c8, c10, c13, c14, c15, c16, c19, c20, c24);
        jlk jlkVar2 = (jlk) c13.a();
        lwm lwmVar3 = (lwm) c3.a();
        jjd jjdVar = (jjd) c18.a();
        kcq kcqVar2 = (kcq) c8.a();
        lfb lfbVar = (lfb) c5.a();
        jlu jluVar = (jlu) c4.a();
        jmi jmiVar = new jmi(lba.c(jlrVar), (jkl) c24.a(), r2, jlkVar2, jjdVar, kcqVar2, lfbVar, (Executor) c10.a(), (jhy) c6.a(), null, null, null);
        jlu jluVar2 = (jlu) c4.a();
        lba.c(jlrVar);
        jkl jklVar2 = (jkl) c24.a();
        kki.r(jlrVar, c3, c4, c5, c6, c8, c10, c13, c14, c15, c16, c19, c20, c24);
        kcq kcqVar3 = (kcq) c8.a();
        lwm lwmVar4 = (lwm) c3.a();
        jlu jluVar3 = (jlu) c4.a();
        lfb lfbVar2 = (lfb) c5.a();
        Executor executor = (Executor) c10.a();
        kki.s(jlrVar, jlvVar, c3, c4, c5, c6, c8, c10, c13, c14, c15, c16, c18, c19, c20, c24, c25, c26);
        jkl jklVar3 = (jkl) c24.a();
        lwm lwmVar5 = (lwm) c3.a();
        Executor executor2 = (Executor) c10.a();
        lba.c(jlrVar);
        lwm lwmVar6 = (lwm) c3.a();
        lfb lfbVar3 = (lfb) c5.a();
        kki.K(jlvVar, c6, c10, c24);
        jjb jjbVar = new jjb(applicationContext, new jkv(c27, r, jlkVar, s, jklVar, jmiVar, new jma((jhy) c6.a(), (jml) c19.a()), (lfb) c5.a(), (Executor) c10.a(), (lfb) c26.a(), (jhy) c6.a(), (jml) c19.a(), null), E, arrayList, g, kcqVar, g2, null, null, null);
        this.d = jjbVar;
        jlr jlrVar2 = jjbVar.g;
        jiz jizVar = new jiz(jjbVar, 0);
        Executor executor3 = jjbVar.d;
        ((ndi) ((kcl) jlrVar2.a).a).b(new mjq(ldd.g(jizVar)), executor3).d(bsd.n, mjl.a);
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel(a2.getPackageName(), a2.getString(R.string.f158030_resource_name_obfuscated_res_0x7f1404fb), 2);
            NotificationManager notificationManager = (NotificationManager) a2.getSystemService("notification");
            if (notificationManager != null) {
                notificationManager.createNotificationChannel(notificationChannel);
            }
        }
        gzt.a.a(this);
        this.e = ieh.j();
        ijl.b().c(ieaVar, hza.class, a3);
    }

    public static hyy a() {
        hyy hyyVar = h;
        if (hyyVar == null) {
            synchronized (hyy.class) {
                hyyVar = h;
                if (hyyVar == null) {
                    hyyVar = new hyy();
                    h = hyyVar;
                }
            }
        }
        return hyyVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0010 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final synchronized defpackage.llp k(defpackage.hyz r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            llk r0 = defpackage.llp.e()     // Catch: java.lang.Throwable -> L5f
            java.util.HashMap r1 = r7.g     // Catch: java.lang.Throwable -> L5f
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L5f
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L5f
            r2 = 0
        L10:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L5f
            if (r3 == 0) goto L59
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L5f
            hyx r3 = (defpackage.hyx) r3     // Catch: java.lang.Throwable -> L5f
            hyz r4 = r3.c     // Catch: java.lang.Throwable -> L5f
            boolean r5 = r4.c     // Catch: java.lang.Throwable -> L5f
            if (r5 != 0) goto L42
            boolean r6 = r8.c     // Catch: java.lang.Throwable -> L5f
            if (r6 == 0) goto L27
            goto L42
        L27:
            boolean r5 = r4.d     // Catch: java.lang.Throwable -> L5f
            if (r5 != 0) goto L3d
            boolean r6 = r8.d     // Catch: java.lang.Throwable -> L5f
            if (r6 == 0) goto L30
            goto L3d
        L30:
            boolean r5 = r4.b     // Catch: java.lang.Throwable -> L5f
            boolean r6 = r8.b     // Catch: java.lang.Throwable -> L5f
            if (r5 != r6) goto L10
            boolean r5 = r4.a     // Catch: java.lang.Throwable -> L5f
            boolean r6 = r8.a     // Catch: java.lang.Throwable -> L5f
            if (r5 == r6) goto L46
            goto L10
        L3d:
            boolean r6 = r8.d     // Catch: java.lang.Throwable -> L5f
            if (r5 == r6) goto L46
            goto L10
        L42:
            boolean r6 = r8.c     // Catch: java.lang.Throwable -> L5f
            if (r5 != r6) goto L10
        L46:
            mko r5 = r3.e     // Catch: java.lang.Throwable -> L5f
            if (r5 != 0) goto L10
            int r4 = r4.e     // Catch: java.lang.Throwable -> L5f
            if (r4 <= r2) goto L53
            llk r0 = defpackage.llp.e()     // Catch: java.lang.Throwable -> L5f
            r2 = r4
        L53:
            if (r4 < r2) goto L10
            r0.h(r3)     // Catch: java.lang.Throwable -> L5f
            goto L10
        L59:
            llp r8 = r0.g()     // Catch: java.lang.Throwable -> L5f
            monitor-exit(r7)
            return r8
        L5f:
            r8 = move-exception
            monitor-exit(r7)
            goto L63
        L62:
            throw r8
        L63:
            goto L62
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hyy.k(hyz):llp");
    }

    private final synchronized void l() {
        for (hyx hyxVar : this.g.values()) {
            mko mkoVar = hyxVar.e;
            if (mkoVar != null) {
                hyz hyzVar = hyxVar.c;
                if (!hyzVar.d && hyzVar.c) {
                    mkoVar.cancel(true);
                    hyxVar.e = null;
                    ((ltd) ((ltd) a.b()).k("com/google/android/libraries/inputmethod/mdd/DownloadManager", "cancelForegroundDownload", 403, "DownloadManager.java")).w("stopping download of %s to start new download", hyxVar.a);
                }
            }
        }
    }

    private final void m(hyx hyxVar) {
        hzi hziVar = this.i;
        hyz hyzVar = hyxVar.c;
        hziVar.a(hyzVar.a, hyzVar.b);
    }

    public final mko b(jhs jhsVar, hyz hyzVar) {
        nzv a2 = jhp.a();
        a2.g(jhsVar);
        jhp f = a2.f();
        if ((jhsVar.a & 4) == 0) {
            return mio.h(mkh.q(this.d.a(f)), new cvr(this, jhsVar, hyzVar, 4), mjl.a);
        }
        jhz a3 = jia.a();
        a3.b(jhsVar.b);
        jia a4 = a3.a();
        this.e.e(hzn.MDD_DOWNLOAD_REQUESTED, jhsVar.b, Integer.valueOf(jhsVar.d));
        return mio.h(mio.h(mkh.q(this.d.a(f)), new hzb(this, a4, 1), mjl.a), new cvr(this, jhsVar, hyzVar, 3), mjl.a);
    }

    public final synchronized mko c(jhs jhsVar, hyz hyzVar) {
        String str = jhsVar.b;
        hyx hyxVar = (hyx) this.g.get(str);
        if (hyxVar == null) {
            hyxVar = new hyx(str, jhsVar.d);
            this.g.put(str, hyxVar);
        }
        hyxVar.c = hyzVar;
        hyxVar.d = 0;
        if (ijl.b().a(hza.class) == null) {
            mko mkoVar = hyxVar.e;
            if (mkoVar != null) {
                mkoVar.cancel(true);
                hyxVar.e = null;
                ((ltd) ((ltd) a.b()).k("com/google/android/libraries/inputmethod/mdd/DownloadManager", "downloadInternal", 381, "DownloadManager.java")).w("Previous download for %s is cancelled", hyxVar.a);
            }
            ((ltd) ((ltd) a.b()).k("com/google/android/libraries/inputmethod/mdd/DownloadManager", "downloadInternal", 383, "DownloadManager.java")).G("Download for %s scheduled with params %s", hyxVar.a, hyxVar.c);
            hyz hyzVar2 = hyxVar.c;
            if (hyzVar2.d) {
                i(hyxVar);
            } else if (hyzVar2.c) {
                l();
                Context a2 = guw.a();
                Intent intent = new Intent(a2, ForegroundDownloadService.class);
                if (Build.VERSION.SDK_INT >= 26) {
                    a2.startForegroundService(intent);
                } else {
                    a2.startService(intent);
                }
            } else {
                m(hyxVar);
            }
            return hyxVar.g;
        }
        return hyxVar.g;
    }

    public final mko d(hyz hyzVar) {
        llp k = k(hyzVar);
        if (k.isEmpty()) {
            return mkk.a;
        }
        ArrayList arrayList = new ArrayList();
        int i = ((lrl) k).c;
        for (int i2 = 0; i2 < i; i2++) {
            hyx hyxVar = (hyx) k.get(i2);
            i(hyxVar);
            arrayList.add(hyxVar.e);
        }
        return kcu.W(arrayList).b(new dus(this, hyzVar, 5), mjl.a);
    }

    @Override // defpackage.gzv
    public final synchronized void dump(Printer printer, boolean z) {
        if (!z) {
            printer.println("- MobileDataDownload");
            printer.println(this.d.c());
        }
        printer.println("- Pending downloads");
        printer.println("name\tfailed#\tdownloadParams");
        for (hyx hyxVar : this.g.values()) {
            printer.println(String.format(Locale.US, "%s:\t%d\t%s", hyxVar.a, Integer.valueOf(hyxVar.d), hyxVar.c));
        }
    }

    public final File e(jhn jhnVar) {
        try {
            return this.j.d(Uri.parse(jhnVar.c));
        } catch (IOException e) {
            ((ltd) ((ltd) ((ltd) a.c()).i(e)).k("com/google/android/libraries/inputmethod/mdd/DownloadManager", "openFile", (char) 632, "DownloadManager.java")).s();
            return null;
        }
    }

    public final synchronized void f() {
        for (hyx hyxVar : this.g.values()) {
            mko mkoVar = hyxVar.e;
            if (mkoVar != null) {
                mkoVar.cancel(true);
                hyxVar.e = null;
            }
        }
    }

    public final void g(String str) {
        jix jixVar = this.d;
        ldu lduVar = ldu.a;
        if (str == null) {
            throw new NullPointerException("Null groupName");
        }
        jjb jjbVar = (jjb) jixVar;
        kcu.U(jjbVar.g.a(new dus(jjbVar, new jjc(str, lduVar, lduVar), 7), jjbVar.d), new hyw(str, 1), mjl.a);
    }

    @Override // defpackage.gzv
    public final /* synthetic */ String getDumpableTag() {
        return hqs.i(this);
    }

    public final synchronized void h() {
        for (hyx hyxVar : this.g.values()) {
            if (hyxVar.c.d) {
                i(hyxVar);
            } else {
                m(hyxVar);
            }
        }
    }

    public final synchronized void i(hyx hyxVar) {
        if (hyxVar.e != null) {
            return;
        }
        ((ltd) ((ltd) a.b()).k("com/google/android/libraries/inputmethod/mdd/DownloadManager", "startDownload", 476, "DownloadManager.java")).w("start download of %s", hyxVar.a);
        this.e.e(hzn.MDD_DOWNLOAD_STARTED, hyxVar.a, Integer.valueOf(hyxVar.b));
        jix jixVar = this.d;
        ldu lduVar = ldu.a;
        String str = hyxVar.a;
        if (str == null) {
            throw new NullPointerException("Null groupName");
        }
        nfh t = jht.c.t();
        int i = true != hyxVar.c.a ? 1 : 2;
        if (t.c) {
            t.cD();
            t.c = false;
        }
        jht jhtVar = (jht) t.b;
        jhtVar.b = i - 1;
        jhtVar.a |= 2;
        jhw jhwVar = new jhw(str, lduVar, lduVar, lduVar, lduVar, lfb.g((jht) t.cz()), lfb.g(new opu(hyxVar)));
        String str2 = jhwVar.a;
        nfh t2 = jiq.f.t();
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        jiq jiqVar = (jiq) t2.b;
        str2.getClass();
        jiqVar.a = 1 | jiqVar.a;
        jiqVar.b = str2;
        String packageName = ((jjb) jixVar).a.getPackageName();
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        jiq jiqVar2 = (jiq) t2.b;
        packageName.getClass();
        jiqVar2.a = 2 | jiqVar2.a;
        jiqVar2.c = packageName;
        mko i2 = jco.i(kcu.P(ldd.b(new iiq((jjb) jixVar, jhwVar, str2, (jiq) t2.cz(), 2)), ((jjb) jixVar).d), new crj((jjb) jixVar, jhwVar, str2, 12), ((jjb) jixVar).d);
        jco.k(i2, new cvt((jjb) jixVar, jhwVar, str2, 11), ((jjb) jixVar).d);
        mko h2 = mhu.h(mkh.q(i2), Throwable.class, new dvb(this, hyxVar, 17), mjl.a);
        kcu.U(h2, new fel(this, hyxVar, 6), mjl.a);
        hyxVar.e = h2;
    }

    public final synchronized void j(boolean z, boolean z2) {
        boolean z3 = false;
        for (Map.Entry entry : this.g.entrySet()) {
            hyx hyxVar = (hyx) entry.getValue();
            hyz hyzVar = hyxVar.c;
            if (hyzVar.a == z && hyzVar.b == z2 && !hyzVar.c) {
                mko mkoVar = hyxVar.e;
                if (mkoVar != null) {
                    mkoVar.cancel(true);
                    hyxVar.e = null;
                }
                z3 = true;
            }
        }
        if (z3) {
            this.i.a(z, z2);
        }
    }
}
