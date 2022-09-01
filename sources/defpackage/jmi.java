package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.StatFs;
import android.util.Pair;
import j$.util.Objects;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: jmi  reason: default package */
/* loaded from: classes.dex */
public final class jmi {
    public final Context a;
    public final Executor b;
    public final jhy c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;

    public jmi(Context context, jkl jklVar, jli jliVar, jlk jlkVar, jjd jjdVar, kcq kcqVar, lfb lfbVar, Executor executor, jhy jhyVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = context;
        this.f = jklVar;
        this.e = jliVar;
        this.g = jlkVar;
        this.h = jjdVar;
        this.d = kcqVar;
        this.i = lfbVar;
        this.b = executor;
        this.c = jhyVar;
    }

    public jmi(Context context, lgb lgbVar, kcq kcqVar, jnc jncVar, lfb lfbVar, jml jmlVar, Executor executor, jhy jhyVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.i = new HashMap();
        this.a = context;
        this.d = lgbVar;
        this.e = kcqVar;
        this.f = jncVar;
        this.g = lfbVar;
        this.h = jmlVar;
        this.b = executor;
        this.c = jhyVar;
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [lgb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [jml, java.lang.Object] */
    public final mko a(jiq jiqVar, int i, long j, String str, Uri uri, String str2, int i2, jij jijVar, jmh jmhVar, int i3, List list) {
        long j2;
        mko J;
        Uri uri2;
        String str3;
        jjh jjhVar;
        llp llpVar;
        int k;
        float min;
        if (!((HashMap) this.i).containsKey(uri)) {
            if (!str2.startsWith("http") || !this.c.b() || str2.startsWith("https")) {
                try {
                    j2 = ((kcq) this.e).o(uri);
                } catch (IOException unused) {
                    j2 = 0;
                }
                try {
                    Context context = this.a;
                    long j3 = i2 - j2;
                    jhy jhyVar = this.c;
                    jhyVar.n();
                    StatFs statFs = new StatFs(context.getFilesDir().getAbsolutePath());
                    double availableBlocks = (statFs.getAvailableBlocks() * statFs.getBlockSize()) - j3;
                    jhyVar.p();
                    float blockCount = ((float) (statFs.getBlockCount() * statFs.getBlockSize())) * 0.1f;
                    jhyVar.c();
                    double min2 = Math.min(blockCount, 5.24288E8f);
                    if (jijVar != null) {
                        int j4 = kez.j(jijVar.b);
                        if (j4 == 0) {
                            j4 = 1;
                        }
                        int i4 = j4 - 1;
                        if (i4 == 1) {
                            jhyVar.p();
                            jhyVar.e();
                            min = Math.min(blockCount, 1.048576E8f);
                        } else if (i4 == 2) {
                            jhyVar.p();
                            jhyVar.d();
                            min = Math.min(blockCount, 2097152.0f);
                        }
                        min2 = min;
                    }
                    if (availableBlocks > min2) {
                        this.c.r();
                        Object obj = this.f;
                        ?? r6 = this.h;
                        nfh t = jil.h.t();
                        if (t.c) {
                            t.cD();
                            t.c = false;
                        }
                        jil jilVar = (jil) t.b;
                        jiqVar.getClass();
                        jilVar.b = jiqVar;
                        int i5 = jilVar.a | 1;
                        jilVar.a = i5;
                        int i6 = i5 | 2;
                        jilVar.a = i6;
                        jilVar.c = j;
                        str.getClass();
                        int i7 = i6 | 4;
                        jilVar.a = i7;
                        jilVar.d = str;
                        jilVar.a = i7 | 8;
                        jilVar.e = i;
                        jil jilVar2 = (jil) t.cz();
                        synchronized (((jnc) obj).c) {
                            if (!((jnc) obj).d.containsKey(jilVar2)) {
                                HashMap hashMap = ((jnc) obj).d;
                                jnb jnbVar = new jnb(((jnc) obj).b, r6, jilVar2);
                                Objects.requireNonNull(((jnc) obj).a);
                                hashMap.put(jilVar2, new kpk(jnbVar, new jna(0), 10L, TimeUnit.SECONDS));
                            }
                            ((jnc) obj).e.put(uri, (kpk) ((jnc) obj).d.get(jilVar2));
                        }
                        if (((lfb) this.g).e()) {
                            jmz jmzVar = (jmz) ((lfb) this.g).a();
                            String str4 = jiqVar.b;
                            synchronized (jmz.class) {
                                jmzVar.c.put(uri, str4);
                            }
                        }
                        jji jjiVar = new jji(null);
                        jjiVar.c(-1);
                        jjiVar.b(llp.q());
                        if (uri != null) {
                            jjiVar.a = uri;
                            if (str2 != null) {
                                jjiVar.b = str2;
                                if (jijVar == null || (k = kez.k(jijVar.c)) == 0 || k != 2) {
                                    jjiVar.a(jjh.b);
                                } else {
                                    jjiVar.a(jjh.c);
                                }
                                if (i3 > 0) {
                                    jjiVar.c(i3);
                                }
                                llk e = llp.e();
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    jik jikVar = (jik) it.next();
                                    e.h(Pair.create(jikVar.a, jikVar.b));
                                }
                                jjiVar.b(e.g());
                                jjk jjkVar = (jjk) this.d.a();
                                String str5 = jjiVar.b;
                                if (str5 == null) {
                                    throw new IllegalStateException("Property \"urlToDownload\" has not been set");
                                }
                                if (str5.startsWith("inlinefile")) {
                                    jdg.w(false, "InlineDownloadParams must be set when using inlinefile: scheme");
                                    jjiVar.a(jjh.a);
                                }
                                if (jjiVar.g == 1 && (uri2 = jjiVar.a) != null && (str3 = jjiVar.b) != null && (jjhVar = jjiVar.c) != null && (llpVar = jjiVar.e) != null) {
                                    J = jjkVar.b(new jjj(uri2, str3, jjhVar, jjiVar.d, llpVar, jjiVar.f));
                                } else {
                                    StringBuilder sb = new StringBuilder();
                                    if (jjiVar.a == null) {
                                        sb.append(" fileUri");
                                    }
                                    if (jjiVar.b == null) {
                                        sb.append(" urlToDownload");
                                    }
                                    if (jjiVar.c == null) {
                                        sb.append(" downloadConstraints");
                                    }
                                    if (jjiVar.g == 0) {
                                        sb.append(" trafficTag");
                                    }
                                    if (jjiVar.e == null) {
                                        sb.append(" extraHttpHeaders");
                                    }
                                    throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                                }
                            } else {
                                throw new NullPointerException("Null urlToDownload");
                            }
                        } else {
                            throw new NullPointerException("Null fileUri");
                        }
                    } else {
                        nzv a = jhv.a();
                        a.a = jhu.LOW_DISK_ERROR;
                        throw a.e();
                    }
                } catch (jhv e2) {
                    jmk.c("%s: Not enough space to download file %s", "MddFileDownloader", str2);
                    J = kcu.J(e2);
                }
            } else {
                jmk.c("%s: File url = %s is not secure", "MddFileDownloader", str2);
                nzv a2 = jhv.a();
                a2.a = jhu.INSECURE_URL_ERROR;
                J = kcu.J(a2.e());
            }
            jnd b = jnd.c(J).g(new jmg(jmhVar, uri, 0), this.b).b(jhv.class, new jmg(this, jmhVar, 2), this.b);
            ((HashMap) this.i).put(uri, b);
            b.d(new idx(this, uri, 15), this.b);
            return b;
        }
        return (mko) ((HashMap) this.i).get(uri);
    }

    public final void b(Uri uri) {
        mko mkoVar = (mko) ((HashMap) this.i).get(uri);
        if (mkoVar != null) {
            int i = jmk.a;
            ((HashMap) this.i).remove(uri);
            mkoVar.cancel(true);
            return;
        }
        jmk.f("%s: stopDownloading on non-existent download", "MddFileDownloader");
    }

    public final int c(Uri uri, List list) {
        int i;
        try {
        } catch (IOException e) {
            e = e;
            i = 0;
        }
        if (!((kcq) this.d).v(uri)) {
            return 0;
        }
        i = 0;
        for (Uri uri2 : ((kcq) this.d).p(uri)) {
            try {
                try {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (uri2.toString().startsWith(((Uri) it.next()).toString())) {
                                break;
                            }
                        } else if (!((kcq) this.d).w(uri2)) {
                            uri2.getPath();
                            int i2 = jmk.a;
                            ((kcq) this.d).t(uri2);
                            i++;
                        } else {
                            i += c(uri2, list);
                        }
                    }
                } catch (IOException e2) {
                    jmk.e(e2, "%s: Failed to delete unaccounted file!", "ExpirationHandler");
                }
            } catch (IOException e3) {
                e = e3;
                jmk.e(e, "%s: Failed to delete unaccounted file!", "ExpirationHandler");
                return i;
            }
        }
        return i;
    }
}
