package defpackage;

import android.os.SystemClock;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.UploadDataProvider;

/* compiled from: PG */
/* renamed from: gkz  reason: default package */
/* loaded from: classes.dex */
public final class gkz implements gma {
    public final bmi a;
    private final glo b;
    private final gnn c;
    private final blq d;
    private blw g;
    private blo i;
    private final lmz e = lmz.w(660106, 660105, 660109, 660102, 660118, 660130, 660111, 660107, 660137);
    private final lmz f = lmz.t(660202, 660201, 660200);
    private int h = 2;

    public gkz(bmi bmiVar, blw blwVar, blq blqVar, gnn gnnVar, glo gloVar) {
        this.b = gloVar;
        this.c = gnnVar;
        this.a = bmiVar;
        this.g = blwVar;
        this.d = blqVar;
    }

    public static boolean f(blp blpVar) {
        lzs lzsVar;
        return blpVar.d == lzs.UNKNOWN || (lzsVar = blpVar.d) == lzs.QUALITY_UNKNOWN || lzsVar == lzs.QUALITY_MET;
    }

    @Override // defpackage.miy
    public final /* synthetic */ mko a(Object obj) {
        bmj bmjVar = (bmj) obj;
        if (this.h == 0 || !this.g.e()) {
            return kcu.K(bmjVar);
        }
        boolean contains = bmi.c.contains(this.a.f);
        try {
            bmjVar.a();
        } catch (blb e) {
            e = e;
            while (e.getCause() instanceof blb) {
                e = (blb) e.getCause();
            }
            int i = e.a;
            lmz lmzVar = this.e;
            Integer valueOf = Integer.valueOf(i);
            boolean contains2 = lmzVar.contains(valueOf);
            boolean z = false;
            if (!this.f.contains(valueOf)) {
                boolean z2 = i > 660000 && i < 662000;
                boolean z3 = (i > 670000 && i < 672000) || i == 656398;
                if (z2 || z3) {
                    z = true;
                }
            }
            if (contains2 || (z && contains)) {
                lty ltyVar = luh.a;
                this.h--;
                this.g.c();
                this.g = this.g.d();
                return b(blp.a);
            }
        } catch (bmd e2) {
            int i2 = e2.a;
            if (i2 >= 500 && i2 <= 599 && contains && i2 != 503) {
                lty ltyVar2 = luh.a;
                this.h--;
                this.g.c();
                this.g = this.g.d();
                return b(blp.a);
            }
        }
        return kcu.K(bmjVar);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Queue] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Queue] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.util.Queue] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x016f -> B:25:0x0170). Please submit an issue!!! */
    public final mko b(blp blpVar) {
        gmk gmkVar;
        lty ltyVar = luh.a;
        blq blqVar = this.d;
        bmi bmiVar = this.a;
        gmk gmkVar2 = (gmk) blqVar;
        bmf bmfVar = gmkVar2.d;
        lfb lfbVar = gmkVar2.g;
        Object obj = bmfVar.j;
        blh blhVar = new blh(bmiVar, lfbVar);
        synchronized (bmfVar.a) {
            while (bmfVar.b.size() > 49) {
                try {
                    try {
                        blh blhVar2 = (blh) bmfVar.b.remove();
                        Object obj2 = bmfVar.c;
                        Object obj3 = bmfVar.d;
                        Object obj4 = bmfVar.g;
                        Object obj5 = bmfVar.h;
                        Object obj6 = bmfVar.i;
                        Object obj7 = bmfVar.e;
                        Object obj8 = bmfVar.f;
                        synchronized (bmfVar.a) {
                            int i = blhVar2.b;
                            ((SparseIntArray) obj2).put(i, ((SparseIntArray) obj2).get(i, 0) + 1);
                            gmkVar = gmkVar2;
                            ((SparseArray) obj5).put(i, Long.valueOf(blhVar2.e + ((Long) ((SparseArray) obj5).get(i, 0L)).longValue()));
                            ((SparseArray) obj3).put(i, Long.valueOf(blhVar2.d + ((Long) ((SparseArray) obj3).get(i, 0L)).longValue()));
                            ((SparseArray) obj6).put(i, Long.valueOf(blhVar2.f() + ((Long) ((SparseArray) obj6).get(i, 0L)).longValue()));
                            if (blhVar2.n != null) {
                                ((SparseArray) obj4).put(i, Long.valueOf(bmf.a(blhVar2.n.b) + ((Long) ((SparseArray) obj4).get(i, 0L)).longValue()));
                            }
                            ((SparseArray) obj7).put(i, Long.valueOf(blhVar2.f + ((Long) ((SparseArray) obj7).get(i, 0L)).longValue()));
                            ((SparseArray) obj8).put(i, Long.valueOf(blhVar2.g + ((Long) ((SparseArray) obj8).get(i, 0L)).longValue()));
                        }
                        gmkVar2 = gmkVar;
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            gmk gmkVar3 = gmkVar2;
            bmfVar.b.add(blhVar);
            gmkVar3.f.c(blhVar);
            blo bloVar = this.i;
            if (bloVar != null) {
                blhVar.i = SystemClock.elapsedRealtime() - bloVar.a();
            }
            this.i = blhVar;
            if (!f(blpVar)) {
                if (blpVar.d == lzs.QUALITY_NOT_MET) {
                    blb blbVar = blpVar.e;
                    jdg.u(blbVar);
                    return e(blhVar, blbVar);
                }
                gmk gmkVar4 = (gmk) this.d;
                return mio.h(mio.h(gmkVar4.e.a(), new dvb(gmkVar4, blhVar, 15), mjl.a), new dvb(this, blhVar, 14), mjl.a);
            }
            return d(blhVar);
        }
    }

    @Override // defpackage.gma
    public final mko c() {
        gmk gmkVar = (gmk) this.d;
        return mio.h(kcu.L(gmkVar.f.a(new etm(gmkVar, 7))), new eoi(this, 15), mjl.a);
    }

    public final mko d(final blo bloVar) {
        final glo gloVar = this.b;
        final bmi bmiVar = this.a;
        final blw blwVar = this.g;
        final blq blqVar = this.d;
        return mio.h(mio.h(gloVar.h.a(), new miy() { // from class: gln
            @Override // defpackage.miy
            public final mko a(Object obj) {
                int i;
                glo gloVar2 = glo.this;
                bmi bmiVar2 = bmiVar;
                blw blwVar2 = blwVar;
                blo bloVar2 = bloVar;
                blq blqVar2 = blqVar;
                ExperimentalCronetEngine experimentalCronetEngine = (ExperimentalCronetEngine) obj;
                bmh bmhVar = new bmh(bmiVar2);
                if (bmiVar2.m == -1) {
                    int i2 = (int) bky.c.a;
                    bmi.b(i2);
                    bmhVar.i = i2;
                }
                if (bmiVar2.n == -1) {
                    int i3 = (int) bky.b.a;
                    bmi.b(i3);
                    bmhVar.j = i3;
                }
                bmi a = bmhVar.a();
                lty ltyVar = luh.a;
                if (experimentalCronetEngine == null) {
                    throw new IllegalStateException("Unexpected call to createConnectionResources.");
                }
                if (gloVar2.h.d() && a.q) {
                    gloVar2.h.c();
                }
                ((AtomicInteger) gloVar2.i.a).incrementAndGet();
                glr glrVar = new glr(blwVar2);
                boolean z = false;
                gme gmeVar = new gme(gloVar2.c, gloVar2.e, bloVar2, blqVar2, a.m, a.n, a.o, bky.e.a, bky.h.a && ((i = a.l) == 1 || i == 11));
                bll bllVar = gloVar2.d;
                glz glzVar = new glz(a, glrVar, bllVar, bloVar2, gmeVar, gloVar2.g);
                glzVar.j = new gld(bllVar, glzVar);
                glh glhVar = new glh(gloVar2, 4);
                ExperimentalUrlRequest.Builder mo92newUrlRequestBuilder = experimentalCronetEngine.mo92newUrlRequestBuilder(a.e.toString(), glzVar.h, (Executor) glhVar);
                mo92newUrlRequestBuilder.mo98setPriority(a.p);
                mo92newUrlRequestBuilder.mo97setHttpMethod(a.f);
                if (!a.q) {
                    mo92newUrlRequestBuilder.mo96disableCache();
                }
                llp llpVar = a.g;
                int size = llpVar.size();
                for (int i4 = 0; i4 < size; i4++) {
                    bme bmeVar = (bme) llpVar.get(i4);
                    mo92newUrlRequestBuilder.mo93addHeader(bmeVar.a, bmeVar.b);
                    z = "Content-Type".equalsIgnoreCase(bmeVar.a) | z;
                }
                if (blwVar2.a() != 0) {
                    if (!z) {
                        ((ltd) ((ltd) glo.a.d().h(luh.a, "CronetNetworkRqstWrppr")).k("com/google/android/libraries/gsa/io/impl/CronetNetworkRequestWrapper", "createConnectionResources", 256, "CronetNetworkRequestWrapper.java")).t("Upload request without a content type.");
                        mo92newUrlRequestBuilder.mo93addHeader("Content-Type", "application/octet-stream");
                    }
                    mo92newUrlRequestBuilder.mo99setUploadDataProvider((UploadDataProvider) new glc(glrVar, gmeVar, bloVar2, bmi.c.contains(a.f), gloVar2.g, gloVar2.c), (Executor) glhVar);
                }
                gmk gmkVar = (gmk) blqVar2;
                if (gmkVar.c.d != 1) {
                    mo92newUrlRequestBuilder.disableConnectionMigration();
                }
                mo92newUrlRequestBuilder.addRequestAnnotation(bloVar2);
                if (glo.b.contains(Integer.valueOf(a.l))) {
                    mo92newUrlRequestBuilder.mo93addHeader("X-Device-Elapsed-Time", Long.toString(gjz.c()));
                    gmkVar.b.c(bnp.a);
                }
                ExperimentalUrlRequest mo95build = mo92newUrlRequestBuilder.mo95build();
                glzVar.k = mo95build;
                gme gmeVar2 = glzVar.i;
                jdg.F(!gmeVar2.l);
                jdg.F(!gmeVar2.m);
                gmeVar2.j = glzVar;
                gmeVar2.k = true;
                gmeVar2.a(1000L);
                mo95build.start();
                return new gkw(a, blwVar2, new dsl(glzVar.g, glzVar.j, glzVar), gloVar2.f, gloVar2.g, null, null, null).c;
            }
        }, mjl.a), this, mjl.a);
    }

    public final mko e(blo bloVar, blb blbVar) {
        bloVar.c(blbVar);
        this.c.d(new gky(bloVar, 0));
        return kcu.K(new bln(blbVar));
    }
}
