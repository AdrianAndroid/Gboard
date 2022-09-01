package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.google.android.libraries.performance.primes.transmitter.clearcut.ClearcutMetricSnapshotTransmitter;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: jmg  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jmg implements miy {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ jmg(jmd jmdVar, Uri uri, int i) {
        this.c = i;
        this.a = jmdVar;
        this.b = uri;
    }

    public /* synthetic */ jmg(jmh jmhVar, Uri uri, int i) {
        this.c = i;
        this.a = jmhVar;
        this.b = uri;
    }

    public /* synthetic */ jmg(jmi jmiVar, jmh jmhVar, int i) {
        this.c = i;
        this.a = jmiVar;
        this.b = jmhVar;
    }

    public /* synthetic */ jmg(jwz jwzVar, jwy jwyVar, int i) {
        this.c = i;
        this.a = jwzVar;
        this.b = jwyVar;
    }

    public /* synthetic */ jmg(kiq kiqVar, oos oosVar, int i) {
        this.c = i;
        this.b = kiqVar;
        this.a = oosVar;
    }

    public /* synthetic */ jmg(kjj kjjVar, String str, int i) {
        this.c = i;
        this.b = kjjVar;
        this.a = str;
    }

    public /* synthetic */ jmg(knn knnVar, String str, int i) {
        this.c = i;
        this.b = knnVar;
        this.a = str;
    }

    public /* synthetic */ jmg(kqp kqpVar, mko mkoVar, int i) {
        this.c = i;
        this.b = kqpVar;
        this.a = mkoVar;
    }

    public /* synthetic */ jmg(lzi lziVar, mko mkoVar, int i) {
        this.c = i;
        this.b = lziVar;
        this.a = mkoVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [jmh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v27, types: [mko, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [jmh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v21, types: [mko, java.lang.Object] */
    @Override // defpackage.miy
    public final mko a(Object obj) {
        ncx ncxVar;
        Locale locale;
        boolean z = true;
        switch (this.c) {
            case 0:
                Void r11 = (Void) obj;
                return this.a.a((Uri) this.b);
            case 1:
                Object obj2 = this.a;
                Object obj3 = this.b;
                Void r112 = (Void) obj;
                jmd jmdVar = (jmd) obj2;
                if (jmf.e(jmdVar.m, (Uri) obj3, jmdVar.c.f)) {
                    return jme.c(jip.DOWNLOAD_COMPLETE, jmdVar.c, jmdVar.l, jmdVar.b, jmdVar.k);
                }
                jmk.c("%s: Final file checksum verification failed. %s.", "DeltaFileDownloaderCallbackImpl", obj3);
                nzv a = jhv.a();
                a.a = jhu.FINAL_FILE_CHECKSUM_MISMATCH_ERROR;
                return kcu.J(a.e());
            case 2:
                jhv jhvVar = (jhv) obj;
                return jco.j(this.b.b(jhvVar), new jku(jhvVar, 19), ((jmi) this.a).b);
            case 3:
                Object obj4 = this.a;
                jtz jtzVar = (jtz) obj;
                jwy jwyVar = (jwy) this.b;
                juc f = ((jwv) jwyVar.a).d().f();
                jsr o = f.o();
                jsr a2 = jsi.a(o, f.k());
                jwz jwzVar = (jwz) obj4;
                int a3 = jwzVar.c.a(a2);
                if (a3 > jwzVar.d) {
                    ((luc) ((luc) jsh.c.b()).k("com/google/android/libraries/micore/superpacks/packs/FetchPipeline", "lambda$fetchOnePackMaybeRetry$2", 332, "FetchPipeline.java")).z("Max validation retry count of %d met for pack %s, failing fetch", a3, o.f());
                    return kcu.J(jtzVar);
                }
                ((luc) ((luc) jsh.c.b()).k("com/google/android/libraries/micore/superpacks/packs/FetchPipeline", "lambda$fetchOnePackMaybeRetry$2", 317, "FetchPipeline.java")).J("Retrying fetching pack %s after validation failure, counts: %d, maxAllowed: %d", o.f(), Integer.valueOf(a3), Integer.valueOf(jwzVar.d));
                jwzVar.c.r(a2, jxz.INVALID_PACK, false);
                return jwzVar.b(jwyVar);
            case 4:
                Object obj5 = this.b;
                Object obj6 = this.a;
                kig kigVar = (kig) obj;
                kiq kiqVar = (kiq) obj5;
                ClearcutMetricSnapshotTransmitter clearcutMetricSnapshotTransmitter = kiqVar.b;
                Context context = kiqVar.a;
                nfh nfhVar = (nfh) kigVar.N(5);
                nfhVar.cG(kigVar);
                nfj nfjVar = (nfj) nfhVar;
                if (nfjVar.c) {
                    nfjVar.cD();
                    nfjVar.c = false;
                }
                kig kigVar2 = (kig) nfjVar.b;
                kig kigVar3 = kig.c;
                obj6.getClass();
                kigVar2.b = (oos) obj6;
                kigVar2.a = 1 | kigVar2.a;
                return clearcutMetricSnapshotTransmitter.a(context, (kig) nfjVar.cz());
            case 5:
                Object obj7 = this.b;
                Object obj8 = this.a;
                Void r113 = (Void) obj;
                kjv kjvVar = kko.a;
                llk e = llp.e();
                kjj kjjVar = (kjj) obj7;
                e.h(kjjVar.c);
                if (gkm.e()) {
                    e.h(gkm.a(kjjVar.c));
                }
                llp g = e.g();
                int i = ((lrl) g).c;
                for (int i2 = 0; i2 < i; i2++) {
                    File file = new File(String.valueOf(((Context) g.get(i2)).getFilesDir()) + "/phenotype/shared/" + ((String) obj8));
                    Log.i("PhenotypeAccountStore", "Removing snapshots for removed user");
                    if (file.exists()) {
                        z = kko.a(file);
                    }
                }
                return z ? mkk.a : kcu.J(new IOException("Unable to remove snapshots for removed user"));
            case 6:
                Object obj9 = this.b;
                Object obj10 = this.a;
                List list = (List) obj;
                nfh t = ncu.c.t();
                nfh t2 = nct.c.t();
                if (t2.c) {
                    t2.cD();
                    t2.c = false;
                }
                obj10.getClass();
                ((nct) t2.b).a = (String) obj10;
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                nct nctVar = (nct) t2.cz();
                nctVar.getClass();
                ((ncu) t.b).b = nctVar;
                knn knnVar = (knn) obj9;
                String b = knnVar.f.b();
                kog kogVar = knnVar.f;
                synchronized (kogVar.b) {
                    kof kofVar = kogVar.d;
                    ncxVar = null;
                    locale = kofVar == null ? null : kofVar.d;
                }
                kog kogVar2 = knnVar.f;
                synchronized (kogVar2.b) {
                    kof kofVar2 = kogVar2.d;
                    if (kofVar2 != null) {
                        ncxVar = kofVar2.f;
                    }
                }
                nfh h = knnVar.h(b, locale, ncxVar);
                knnVar.g();
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                ndc ndcVar = (ndc) h.cz();
                ndcVar.getClass();
                ((ncu) t.b).a = ndcVar;
                ncu ncuVar = (ncu) t.cz();
                knnVar.f();
                oqv oqvVar = (oqv) knnVar.b.a();
                Object obj11 = oqvVar.b;
                nuq nuqVar = ndb.e;
                if (nuqVar == null) {
                    synchronized (ndb.class) {
                        nuqVar = ndb.e;
                        if (nuqVar == null) {
                            nun a4 = nuq.a();
                            a4.c = nup.UNARY;
                            a4.d = nuq.c("google.internal.expression.sticker.v1.StickerService", "SearchStickers");
                            a4.b();
                            a4.a = ohw.b(ncu.c);
                            a4.b = ohw.b(ncv.b);
                            nuqVar = a4.a();
                            ndb.e = nuqVar;
                        }
                    }
                }
                return oig.a(((nsb) obj11).a(nuqVar, (nsa) oqvVar.a), ncuVar);
            case 7:
                Object obj12 = this.b;
                ?? r1 = this.a;
                kqp kqpVar = (kqp) obj12;
                kqpVar.c((Uri) kcu.S(kqpVar.b), obj);
                synchronized (kqpVar.e) {
                    ((kqp) obj12).f = r1;
                }
                return mkk.a;
            default:
                Object obj13 = this.b;
                ?? r2 = this.a;
                Exception exc = (Exception) obj;
                if (r2.isCancelled()) {
                    return r2;
                }
                lzi lziVar = (lzi) obj13;
                lzf lzfVar = lziVar.c;
                int i3 = lziVar.g;
                lziVar.e.a(TimeUnit.MILLISECONDS);
                long j = -1;
                if (lzfVar.ih(i3) && true == lzfVar.ih(i3)) {
                    j = 0;
                }
                if (j < 0 || !lziVar.d.a(exc)) {
                    lug lugVar = jsh.a;
                    int i4 = lziVar.g;
                    throw new lzc(exc);
                }
                lug lugVar2 = jsh.a;
                lziVar.e();
                return kcu.K(lzi.a);
        }
    }
}
