package defpackage;

import android.content.Context;
import j$.util.Objects;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: clg  reason: default package */
/* loaded from: classes.dex */
public final class clg implements isc {
    public final Context f;
    public final clj i;
    public lmz l;
    public final dxs n;
    private volatile mko s;
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/expression/contentcache/ContentDownloadTask");
    public static final cpu b = cqh.a().b;
    static final hhl c = hhq.a("require_device_idle_for_content_cache_download", false);
    static final hhl d = hhq.a("require_device_charging_for_content_cache_download", true);
    private static final hhl r = hhq.f("content_cache_download_task_delay_ms", 0);
    public static final hhl e = hhq.f("max_num_images_to_cache_per_keyword", 8);
    public final idk g = ieh.j();
    public HashMap j = new HashMap();
    public final HashSet k = new HashSet();
    public nfh m = maj.h.t();
    public final mks h = gxo.c(19);

    public clg(Context context) {
        this.f = context;
        mks a2 = gxo.a(19);
        ihq a3 = ihq.a(16);
        this.i = new clj(context, a3, a2, cli.a);
        djc t = dxs.t();
        t.b = a2;
        t.a = a3;
        this.n = t.g();
    }

    public static llr d(llr llrVar, lfe lfeVar) {
        lmh lmhVar = new lmh();
        lsz it = llrVar.p().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (lfeVar.a(entry)) {
                llq.c(entry, lmhVar);
            }
        }
        return llq.a(lmhVar);
    }

    public static void f(isf isfVar) {
        csv csvVar;
        ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/expression/contentcache/ContentDownloadTask", "schedule", 572, "ContentDownloadTask.java")).t("Scheduling content download task");
        isn a2 = iso.a("ContentDownload", clg.class.getName());
        a2.k = 3;
        a2.l = ((Boolean) d.c()).booleanValue();
        a2.j = true;
        a2.b();
        boolean c2 = isfVar.c(a2.a());
        ieh j = ieh.j();
        if (c2) {
            csvVar = csv.CONTENT_CACHE_DOWNLOAD_TASK_SCHEDULED_SUCCESSFULLY;
        } else {
            csvVar = csv.CONTENT_CACHE_DOWNLOAD_TASK_FAILED_TO_SCHEDULE;
        }
        j.e(csvVar, new Object[0]);
    }

    @Override // defpackage.isc
    public final isb a(jls jlsVar) {
        ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/expression/contentcache/ContentDownloadTask", "onStopTask", 564, "ContentDownloadTask.java")).t("Content download task stopped");
        this.g.e(csv.CONTENT_CACHE_DOWNLOAD_TASK_STOPPED, new Object[0]);
        hji.h(this.s);
        this.s = null;
        return isb.FINISHED_NEED_RESCHEDULE;
    }

    @Override // defpackage.isc
    public final mko b(jls jlsVar) {
        this.g.e(csv.CONTENT_CACHE_DOWNLOAD_TASK_STARTED, new Object[0]);
        if (!((Boolean) c.c()).booleanValue() || !jam.q(this.f)) {
            long longValue = ((Long) r.c()).longValue();
            idn a2 = this.g.a(ctg.CONTENT_CACHE_DOWNLOAD_TASK);
            this.s = kcu.M(new clc(this, 0), longValue, TimeUnit.MILLISECONDS, this.h);
            mko mkoVar = this.s;
            Objects.requireNonNull(a2);
            mkoVar.d(new cbq(a2, 11), this.h);
            return this.s;
        }
        ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/expression/contentcache/ContentDownloadTask", "onRunTask", 145, "ContentDownloadTask.java")).t("Device in interactive state, rescheduling task");
        this.g.e(csv.CONTENT_CACHE_DOWNLOAD_TASK_RESCHEDULED_DEVICE_NOT_IDLE, new Object[0]);
        return isc.p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ isb c(llr llrVar, lmz lmzVar, HashMap hashMap, boolean z, llr llrVar2, llw llwVar, int i) {
        csv csvVar;
        long longValue;
        lsz it = llrVar.u().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (lre.ah(llrVar.a(str), bzg.h)) {
                this.k.add(str);
            }
        }
        lmz p = lmz.p(lvw.i(this.l, this.k));
        if (!this.k.isEmpty()) {
            this.k.size();
        }
        cln.e(this.f, this.k);
        lsz it2 = lmzVar.iterator();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (it2.hasNext()) {
            try {
                cqp cqpVar = (cqp) kcu.S((hiz) it2.next());
                i2++;
                hashMap.put(cqpVar.d().toString(), cqpVar);
            } catch (CancellationException unused) {
                i4++;
            } catch (ExecutionException e2) {
                ((ltd) ((ltd) ((ltd) a.d()).i(e2)).k("com/google/android/apps/inputmethod/libs/expression/contentcache/ContentDownloadTask", "lambda$updateMappingWithDownloadedImagesTransform$10", (char) 478, "ContentDownloadTask.java")).t("Unexpected failed future");
                i3++;
            }
        }
        ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/expression/contentcache/ContentDownloadTask", "lambda$updateMappingWithDownloadedImagesTransform$10", 485, "ContentDownloadTask.java")).y("Successfully downloaded %d of %d images", i2, lmzVar.size());
        nfh nfhVar = this.m;
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        maj majVar = (maj) nfhVar.b;
        maj majVar2 = maj.h;
        majVar.a |= 1;
        majVar.b = i2;
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        maj majVar3 = (maj) nfhVar.b;
        int i5 = majVar3.a | 8;
        majVar3.a = i5;
        majVar3.e = i4;
        majVar3.a = i5 | 16;
        majVar3.f = i3;
        int size = hashMap.size();
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        maj majVar4 = (maj) nfhVar.b;
        majVar4.a |= 2;
        majVar4.c = size;
        this.m = nfhVar;
        maj majVar5 = (maj) nfhVar.cz();
        idk idkVar = this.g;
        if (z) {
            csvVar = csv.CONTENT_CACHE_DOWNLOAD_TASK_ALL_DOWNLOADS_COMPLETED;
        } else {
            csvVar = csv.CONTENT_CACHE_DOWNLOAD_TASK_DOWNLOADS_PARTIALLY_COMPLETED;
        }
        idkVar.e(csvVar, majVar5);
        lmh lmhVar = new lmh();
        lsz it3 = llrVar2.p().iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            cqp cqpVar2 = (cqp) hashMap.get(((cqp) entry.getValue()).d().toString());
            if (cqpVar2 != null) {
                llq.b((String) entry.getKey(), cqpVar2, lmhVar);
            }
        }
        llr a2 = llq.a(lmhVar);
        lls h = llw.h();
        long currentTimeMillis = System.currentTimeMillis();
        lsz it4 = a2.u().iterator();
        while (it4.hasNext()) {
            String str2 = (String) it4.next();
            Long l = (Long) llwVar.get(str2);
            if (p.contains(str2)) {
                longValue = currentTimeMillis;
            } else {
                longValue = l != null ? l.longValue() : 0L;
            }
            h.a(str2, Long.valueOf(longValue));
        }
        djc b2 = cll.b();
        b2.e(a2);
        b2.f(h.l());
        cll d2 = b2.d();
        Context context = this.f;
        llw llwVar2 = d2.b;
        llr llrVar3 = d2.c;
        lls i6 = llw.i(llrVar3.u().size());
        lsz it5 = llrVar3.u().iterator();
        while (it5.hasNext()) {
            String str3 = (String) it5.next();
            Long l2 = (Long) llwVar2.get(str3);
            nfh t = cky.d.t();
            List H = lre.H(llrVar3.a(str3), bou.t);
            if (t.c) {
                t.cD();
                t.c = false;
            }
            cky ckyVar = (cky) t.b;
            nga ngaVar = ckyVar.b;
            if (!ngaVar.c()) {
                ckyVar.b = nfm.H(ngaVar);
            }
            ndt.cs(H, ckyVar.b);
            long longValue2 = l2 != null ? l2.longValue() : 0L;
            if (t.c) {
                t.cD();
                t.c = false;
            }
            cky ckyVar2 = (cky) t.b;
            ckyVar2.a |= 1;
            ckyVar2.c = longValue2;
            i6.a(str3, (cky) t.cz());
        }
        nfh t2 = cku.d.t();
        llw l3 = i6.l();
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        cku ckuVar = (cku) t2.b;
        ngu nguVar = ckuVar.b;
        if (!nguVar.b) {
            ckuVar.b = nguVar.a();
        }
        ckuVar.b.putAll(l3);
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        cku ckuVar2 = (cku) t2.b;
        ckuVar2.a |= 1;
        ckuVar2.c = i;
        boolean l4 = jan.b.l(clk.b(context), (cku) t2.cz());
        ieh j = ieh.j();
        if (!l4) {
            ((ltd) ((ltd) clk.a.d()).k("com/google/android/apps/inputmethod/libs/expression/contentcache/ContentMappingManager", "writeKeywordMappingsToDisk", 46, "ContentMappingManager.java")).t("Failed to write keyword mappings to disk.");
            j.e(csv.CONTENT_CACHE_DOWNLOAD_TASK_FAILED_TO_WRITE_MAPPING_TO_DISK, new Object[0]);
        } else {
            ((ltd) ((ltd) clk.a.b()).k("com/google/android/apps/inputmethod/libs/expression/contentcache/ContentMappingManager", "writeKeywordMappingsToDisk", 51, "ContentMappingManager.java")).t("Successfully wrote keyword mappings to disk");
            j.e(csv.CONTENT_CACHE_DOWNLOAD_TASK_MAPPING_WRITTEN_TO_DISK, new Object[0]);
        }
        ijl.b().g(new ckl(d2));
        this.s = null;
        return isb.FINISHED;
    }

    public final mko e(final llr llrVar, final HashMap hashMap, final int i, final llr llrVar2, final llw llwVar, final boolean z) {
        final lmz p = lmz.p(llrVar.r());
        return kcu.W(p).a(new Callable() { // from class: cld
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return clg.this.c(llrVar, p, hashMap, z, llrVar2, llwVar, i);
            }
        }, this.h);
    }
}
