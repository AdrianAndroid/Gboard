package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.inputmethod.libs.dataservice.superpacks.SuperpacksGcRunner;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: clc  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class clc implements mix {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ clc(int i) {
        this.b = i;
        this.a = "expression-history.db";
    }

    public /* synthetic */ clc(clg clgVar, int i) {
        this.b = i;
        this.a = clgVar;
    }

    public clc(SuperpacksGcRunner superpacksGcRunner, int i) {
        this.b = i;
        this.a = superpacksGcRunner;
    }

    public /* synthetic */ clc(dui duiVar, int i) {
        this.b = i;
        this.a = duiVar;
    }

    public /* synthetic */ clc(duz duzVar, int i) {
        this.b = i;
        this.a = duzVar;
    }

    public /* synthetic */ clc(ett ettVar, int i) {
        this.b = i;
        this.a = ettVar;
    }

    public /* synthetic */ clc(fyz fyzVar, int i) {
        this.b = i;
        this.a = fyzVar;
    }

    public /* synthetic */ clc(iwo iwoVar, int i) {
        this.b = i;
        this.a = iwoVar;
    }

    public /* synthetic */ clc(jkv jkvVar, int i) {
        this.b = i;
        this.a = jkvVar;
    }

    public /* synthetic */ clc(jli jliVar, int i) {
        this.b = i;
        this.a = jliVar;
    }

    public /* synthetic */ clc(kgh kghVar, int i) {
        this.b = i;
        this.a = kghVar;
    }

    public /* synthetic */ clc(kqp kqpVar, int i) {
        this.b = i;
        this.a = kqpVar;
    }

    public /* synthetic */ clc(mko mkoVar, int i) {
        this.b = i;
        this.a = mkoVar;
    }

    /* JADX WARN: Type inference failed for: r0v36, types: [fyz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v71, types: [mko, java.lang.Object] */
    @Override // defpackage.mix
    public final mko a() {
        switch (this.b) {
            case 0:
                Object obj = this.a;
                ((ltd) ((ltd) clg.a.b()).k("com/google/android/apps/inputmethod/libs/expression/contentcache/ContentDownloadTask", "downloadAndCacheImages", 164, "ContentDownloadTask.java")).t("Starting content download task");
                final clg clgVar = (clg) obj;
                clgVar.g.e(csv.CONTENT_CACHE_DOWNLOAD_TASK_STARTED_AFTER_DELAY, new Object[0]);
                lfb e = clb.d(clgVar.f).e();
                if (!e.e()) {
                    ((ltd) ((ltd) clg.a.c()).k("com/google/android/apps/inputmethod/libs/expression/contentcache/ContentDownloadTask", "downloadAndCacheImages", 170, "ContentDownloadTask.java")).t("Could not find pack file");
                    return isc.p;
                }
                File d = crk.d(clgVar.i.c);
                if (d.exists()) {
                    ((ltd) ((ltd) clj.a.b()).k("com/google/android/apps/inputmethod/libs/expression/contentcache/ContentManager", "deleteContentSuggestionCacheDirectoryIfExists", 170, "ContentManager.java")).t("Deleting content suggestion cache directory");
                    jan.b.e(d);
                }
                final File e2 = crk.e(clgVar.f);
                cll a = cll.a(clk.b(clgVar.f));
                final llr d2 = clg.d(a.c, bzg.i);
                clm a2 = clm.a((cla) e.a());
                hiz v = clg.b.b(((Long) cko.a.c()).longValue()).u(new byi(a2.b, 9), mjl.a).u(new byi(a2.a, 10), mjl.a).v(new bxo(clgVar, d2, 16), clgVar.h);
                int Y = lre.Y(lre.Z(lvw.i(lmz.p(a.c.r()), lmz.p(d2.r())), new cjm(e2, 2)));
                if (Y > 0) {
                    ((ltd) ((ltd) clg.a.d()).k("com/google/android/apps/inputmethod/libs/expression/contentcache/ContentDownloadTask", "downloadAndCacheImages", 199, "ContentDownloadTask.java")).u("%d images from the previous mapping are missing on disk", Y);
                }
                nfh nfhVar = clgVar.m;
                if (nfhVar.c) {
                    nfhVar.cD();
                    nfhVar.c = false;
                }
                maj majVar = (maj) nfhVar.b;
                maj majVar2 = maj.h;
                majVar.a |= 4;
                majVar.d = Y;
                clgVar.m = nfhVar;
                return v.u(new leq() { // from class: clf
                    @Override // defpackage.leq
                    public final Object a(Object obj2) {
                        clg clgVar2 = clg.this;
                        llr llrVar = d2;
                        File file = e2;
                        llr llrVar2 = (llr) obj2;
                        lmz p = lmz.p(llrVar.r());
                        lmz o = lmz.o(lre.Z(p, new cjm((Set) fhr.y(llrVar2.r(), cli.b), 4)));
                        ((ltd) ((ltd) clj.a.b()).k("com/google/android/apps/inputmethod/libs/expression/contentcache/ContentManager", "onContentMappingUpdated", 144, "ContentManager.java")).u("Deleting %d images", o.size());
                        jan janVar = jan.b;
                        lsz it = o.iterator();
                        while (it.hasNext()) {
                            cqp cqpVar = (cqp) it.next();
                            cqpVar.d();
                            lsz it2 = cqpVar.k().values().iterator();
                            while (it2.hasNext()) {
                                janVar.e((File) it2.next());
                            }
                        }
                        HashMap hashMap = new HashMap();
                        lsz it3 = lvw.i(p, o).iterator();
                        while (it3.hasNext()) {
                            cqp cqpVar2 = (cqp) it3.next();
                            hashMap.put(cqpVar2.d().toString(), cqpVar2);
                        }
                        ((ltd) ((ltd) clj.a.b()).k("com/google/android/apps/inputmethod/libs/expression/contentcache/ContentManager", "onContentMappingUpdated", 157, "ContentManager.java")).u("Retaining %d images", hashMap.size());
                        clgVar2.j = hashMap;
                        lmh lmhVar = new lmh();
                        HashMap hashMap2 = new HashMap();
                        lsz it4 = llrVar2.p().iterator();
                        while (it4.hasNext()) {
                            Map.Entry entry = (Map.Entry) it4.next();
                            cqp cqpVar3 = (cqp) entry.getValue();
                            if (!clgVar2.j.containsKey(cqpVar3.d().toString())) {
                                final String o2 = cqpVar3.o();
                                if (TextUtils.isEmpty(o2)) {
                                    ((ltd) ((ltd) clg.a.c()).k("com/google/android/apps/inputmethod/libs/expression/contentcache/ContentDownloadTask", "downloadRequiredImages", 261, "ContentDownloadTask.java")).w("No ID found for image with URL %s", cqpVar3.d());
                                } else {
                                    final String r = cqpVar3.r();
                                    final File g = crk.g(r, file);
                                    jan.b.b(g.getAbsolutePath());
                                    hiz hizVar = (hiz) hashMap2.get(cqpVar3.d());
                                    if (hizVar == null) {
                                        final clj cljVar = clgVar2.i;
                                        final Uri d3 = cqpVar3.d();
                                        iil i = cqpVar3.i();
                                        final mbr m = cqpVar3.m();
                                        iig a3 = iih.a();
                                        a3.h(d3);
                                        a3.g();
                                        a3.e(i);
                                        a3.f(2);
                                        iih a4 = a3.a();
                                        hizVar = hiz.k(cljVar.d.c(a4)).u(new leq() { // from class: clh
                                            @Override // defpackage.leq
                                            public final Object a(Object obj3) {
                                                clj cljVar2 = clj.this;
                                                Uri uri = d3;
                                                String str = o2;
                                                File file2 = g;
                                                String str2 = r;
                                                mbr mbrVar = m;
                                                iij iijVar = (iij) obj3;
                                                if (iin.j(iijVar)) {
                                                    byte[] D = iijVar.e.D();
                                                    lfb lfbVar = (lfb) cljVar2.f.a(D);
                                                    if (!lfbVar.e()) {
                                                        throw new IllegalStateException("Failed to decode downloaded image at ".concat(uri.toString()));
                                                    }
                                                    String d4 = ((cqn) lfbVar.a()).d();
                                                    File file3 = new File(file2, str + "." + d4);
                                                    if (!clj.b.k(D, file3)) {
                                                        ((ltd) ((ltd) clj.a.d()).k("com/google/android/apps/inputmethod/libs/expression/contentcache/ContentManager", "lambda$downloadImage$0", 104, "ContentManager.java")).w("Failed to write downloaded bytes from %s to cache file", uri);
                                                        clj.b.e(file3);
                                                        throw new IllegalStateException("Failed to write downloaded bytes to cache file");
                                                    }
                                                    cqo t = cqp.t();
                                                    t.o(file3);
                                                    t.n(((cqn) lfbVar.a()).b);
                                                    t.f(((cqn) lfbVar.a()).c);
                                                    t.l(str2);
                                                    t.h(uri);
                                                    t.g(str);
                                                    t.e(mbrVar);
                                                    if (str2.equals("tenor_gif")) {
                                                        t.c = "tenor.com";
                                                    }
                                                    return t.a();
                                                }
                                                throw new IllegalStateException("Failed to get response for ".concat(uri.toString()));
                                            }
                                        }, cljVar.e);
                                        hashMap2.put(cqpVar3.d(), hizVar);
                                    }
                                    llq.b((String) entry.getKey(), hizVar, lmhVar);
                                }
                            }
                        }
                        llr a5 = llq.a(lmhVar);
                        ((ltd) ((ltd) clg.a.b()).k("com/google/android/apps/inputmethod/libs/expression/contentcache/ContentDownloadTask", "downloadRequiredImages", 290, "ContentDownloadTask.java")).u("Attempting to download %d images", hashMap2.size());
                        return a5;
                    }
                }, clgVar.h).v(new fem(clgVar, e, v, a, 1), clgVar.h);
            case 1:
                if (System.currentTimeMillis() - ((SuperpacksGcRunner) this.a).c.getSharedPreferences("superpacks_gc_prefs", 0).getLong("last_gc_timestamp", 0L) < ((Long) SuperpacksGcRunner.b.c()).longValue()) {
                    return kcu.K(null);
                }
                SuperpacksGcRunner superpacksGcRunner = (SuperpacksGcRunner) this.a;
                bzr bzrVar = (bzr) superpacksGcRunner.e;
                mko h = mio.h(bzrVar.m(null), new bzi(bzrVar, 0), bzrVar.i);
                kcu.U(h, new bzb(superpacksGcRunner), superpacksGcRunner.d);
                return h;
            case 2:
                ((dui) this.a).a();
                return mkk.a;
            case 3:
                oqv k = ((duz) this.a).k();
                nez nezVar = nez.a;
                Object obj2 = k.b;
                nuq nuqVar = fgy.d;
                if (nuqVar == null) {
                    synchronized (fgy.class) {
                        nuqVar = fgy.d;
                        if (nuqVar == null) {
                            nun a3 = nuq.a();
                            a3.c = nup.UNARY;
                            a3.d = nuq.c("java.com.google.android.apps.search.assistant.surfaces.dictation.proto.AssistantDictationService", "GetLearningCenterContent");
                            a3.b();
                            a3.a = ohw.b(nez.a);
                            a3.b = ohw.b(fhn.b);
                            nuqVar = a3.a();
                            fgy.d = nuqVar;
                        }
                    }
                }
                return oig.a(((nsb) obj2).a(nuqVar, (nsa) k.a), nezVar);
            case 4:
                return ((ett) this.a).e();
            case 5:
                return this.a.a();
            case 6:
                Object obj3 = this.a;
                hsu hsuVar = (hsu) ijl.b().a(hsu.class);
                if (hsuVar == null || !hsuVar.g()) {
                    ((iwo) obj3).a.b.c();
                } else {
                    ((ltd) ((ltd) iwq.a.d()).k("com/google/android/libraries/inputmethod/trainingcache/storage/DeferredProtoXDBBufferFlushPolicy$1", "lambda$onFinishInputView$0", 95, "DeferredProtoXDBBufferFlushPolicy.java")).t("Try to run scheduled writing task, but input view is started, skip.");
                }
                return mkk.a;
            case 7:
                Object obj4 = this.a;
                int i = jmk.a;
                jkv jkvVar = (jkv) obj4;
                return jnd.c(jkvVar.c()).g(new jke(jkvVar, 18), mjl.a).g(new jke(jkvVar, 19), jkvVar.h);
            case 8:
                return ((jli) this.a).b();
            case 9:
                return ((kgh) this.a).a();
            case 10:
                kqp kqpVar = (kqp) this.a;
                return kcu.L(mio.h(kqpVar.b, ldd.c(new jzh(kqpVar, 7)), kqpVar.c));
            case 11:
                Object obj5 = this.a;
                kqp kqpVar2 = (kqp) obj5;
                try {
                    return kcu.K(((kqp) obj5).b((Uri) kcu.S(kqpVar2.b)));
                } catch (IOException e3) {
                    jlr jlrVar = new jlr(kqpVar2);
                    if ((e3 instanceof kow) || (e3.getCause() instanceof kow)) {
                        return kcu.J(e3);
                    }
                    return mio.h(kqpVar2.d.a(e3, jlrVar), ldd.c(new jzh(kqpVar2, 8)), kqpVar2.c);
                }
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return this.a;
            default:
                return kcu.K(this.a);
        }
    }
}
