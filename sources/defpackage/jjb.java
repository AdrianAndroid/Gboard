package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* renamed from: jjb  reason: default package */
/* loaded from: classes.dex */
public final class jjb implements jix {
    public final Context a;
    public final lfb b;
    public final jkv c;
    public final Executor d;
    public final lfb e;
    public final kcq h;
    private final List i;
    public final jlr g = jlr.b();
    public final miy f = cex.l;

    public jjb(Context context, jkv jkvVar, Executor executor, List list, lfb lfbVar, kcq kcqVar, lfb lfbVar2, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = context;
        this.i = list;
        this.b = lfbVar;
        this.d = executor;
        this.c = jkvVar;
        this.h = kcqVar;
        this.e = lfbVar2;
        lxj.t();
    }

    public static jhn d(String str, int i, int i2, String str2, ndy ndyVar) {
        nfh t = jhn.g.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        jhn jhnVar = (jhn) t.b;
        str.getClass();
        int i3 = jhnVar.a | 1;
        jhnVar.a = i3;
        jhnVar.b = str;
        int i4 = i3 | 4;
        jhnVar.a = i4;
        jhnVar.d = i;
        if (i2 > 0) {
            i4 |= 8;
            jhnVar.a = i4;
            jhnVar.e = i2;
        }
        if (str2 != null) {
            i4 |= 2;
            jhnVar.a = i4;
            jhnVar.c = str2;
        }
        if (ndyVar != null) {
            jhnVar.f = ndyVar;
            jhnVar.a = i4 | 16;
        }
        return (jhn) t.cz();
    }

    public static List h(kcq kcqVar, Uri uri, String str) {
        ArrayList arrayList = new ArrayList();
        for (Uri uri2 : kcqVar.p(uri)) {
            if (kcqVar.w(uri2)) {
                arrayList.addAll(h(kcqVar, uri2, str));
            } else {
                String path = uri2.getPath();
                if (path != null) {
                    nfh t = jhn.g.t();
                    String replaceFirst = path.replaceFirst(str, "");
                    if (t.c) {
                        t.cD();
                        t.c = false;
                    }
                    jhn jhnVar = (jhn) t.b;
                    replaceFirst.getClass();
                    jhnVar.a |= 1;
                    jhnVar.b = replaceFirst;
                    int o = (int) kcqVar.o(uri2);
                    if (t.c) {
                        t.cD();
                        t.c = false;
                    }
                    jhn jhnVar2 = (jhn) t.b;
                    jhnVar2.a |= 4;
                    jhnVar2.d = o;
                    String uri3 = uri2.toString();
                    if (t.c) {
                        t.cD();
                        t.c = false;
                    }
                    jhn jhnVar3 = (jhn) t.b;
                    uri3.getClass();
                    jhnVar3.a |= 2;
                    jhnVar3.c = uri3;
                    arrayList.add((jhn) t.cz());
                }
            }
        }
        return arrayList;
    }

    public static mko i(jig jigVar, String str, int i, jkv jkvVar, Executor executor, kcq kcqVar) {
        if (jigVar == null) {
            return kcu.K(null);
        }
        nfh t = jho.m.t();
        String str2 = jigVar.c;
        if (t.c) {
            t.cD();
            t.c = false;
        }
        jho jhoVar = (jho) t.b;
        str2.getClass();
        int i2 = jhoVar.a | 1;
        jhoVar.a = i2;
        jhoVar.b = str2;
        String str3 = jigVar.d;
        str3.getClass();
        int i3 = i2 | 2;
        jhoVar.a = i3;
        jhoVar.c = str3;
        int i4 = jigVar.e;
        jhoVar.a = i3 | 8;
        jhoVar.e = i4;
        ndy ndyVar = jigVar.f;
        if (ndyVar == null) {
            ndyVar = ndy.c;
        }
        if (t.c) {
            t.cD();
            t.c = false;
        }
        jho jhoVar2 = (jho) t.b;
        ndyVar.getClass();
        jhoVar2.k = ndyVar;
        int i5 = jhoVar2.a | 128;
        jhoVar2.a = i5;
        long j = jigVar.q;
        int i6 = i5 | 32;
        jhoVar2.a = i6;
        jhoVar2.h = j;
        String str4 = jigVar.r;
        str4.getClass();
        int i7 = i6 | 64;
        jhoVar2.a = i7;
        jhoVar2.i = str4;
        jhoVar2.f = i - 1;
        jhoVar2.a = i7 | 16;
        nga ngaVar = jigVar.s;
        nga ngaVar2 = jhoVar2.j;
        if (!ngaVar2.c()) {
            jhoVar2.j = nfm.H(ngaVar2);
        }
        ndt.cs(ngaVar, jhoVar2.j);
        if (str != null) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            jho jhoVar3 = (jho) t.b;
            jhoVar3.a |= 4;
            jhoVar3.d = str;
        }
        if ((jigVar.a & 32) != 0) {
            ndy ndyVar2 = jigVar.g;
            if (ndyVar2 == null) {
                ndyVar2 = ndy.c;
            }
            if (t.c) {
                t.cD();
                t.c = false;
            }
            jho jhoVar4 = (jho) t.b;
            ndyVar2.getClass();
            jhoVar4.l = ndyVar2;
            jhoVar4.a |= 256;
        }
        mko K = kcu.K(t);
        mko mkoVar = K;
        for (jie jieVar : jigVar.m) {
            mkoVar = jco.j(mkoVar, new hap(i, jkvVar, jieVar, jigVar, kcqVar, executor, 3, null, null, null), executor);
        }
        return jnd.c(mkoVar).e(iuu.r, executor).a(jhv.class, iuu.s, executor);
    }

    @Override // defpackage.jix
    public final mko a(jhp jhpVar) {
        return this.g.a(new dus(this, jhpVar, 9), this.d);
    }

    @Override // defpackage.jix
    public final mko b(jia jiaVar) {
        return this.g.a(new dus(this, jiaVar, 10), this.d);
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, java.lang.Iterable] */
    @Override // defpackage.jix
    public final String c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintWriter printWriter = new PrintWriter(byteArrayOutputStream);
        try {
            jkv jkvVar = this.c;
            jco.j(jkvVar.c(), new jko(jkvVar, printWriter, 13), jkvVar.h).get(3L, TimeUnit.SECONDS);
            printWriter.println("==== MOBSTORE_DEBUG_INFO ====");
            kcq kcqVar = this.h;
            printWriter.print(String.format("Registered Mobstore Plugins:\n\nBackends:\n%1$s\n\nTransforms:\n%2$s\n\nMonitors:\n%3$s", TextUtils.join(",\n", lvw.o(lre.ab(kcqVar.b.keySet(), new kdw(kcqVar, 7, null, null, null)))), TextUtils.join(",\n", lvw.o(lre.ab(kcqVar.c.values(), knm.g))), TextUtils.join(",\n", lvw.o(lre.ab(kcqVar.a, knm.h)))));
            printWriter.flush();
            return byteArrayOutputStream.toString();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            String format = String.format("%s: Couldn't get debug info: %s", "MobileDataDownload", e);
            jmk.a(format);
            return format;
        } catch (ExecutionException e2) {
            e = e2;
            String format2 = String.format("%s: Couldn't get debug info: %s", "MobileDataDownload", e);
            jmk.a(format2);
            return format2;
        } catch (TimeoutException e3) {
            e = e3;
            String format22 = String.format("%s: Couldn't get debug info: %s", "MobileDataDownload", e);
            jmk.a(format22);
            return format22;
        }
    }

    public final mko e(boolean z) {
        return jnd.c(f()).g(new jja(this, z, 1), this.d).g(new ivo(this, 6), this.d).g(new jja(this, z, 0), this.d);
    }

    public final mko f() {
        ArrayList arrayList = new ArrayList();
        for (jhx jhxVar : this.i) {
            arrayList.add(jhxVar.a());
        }
        return jez.p(arrayList).a(hcb.e, this.d);
    }

    public final mko g(jiq jiqVar, jig jigVar, boolean z) {
        return jco.i(i(jigVar, (jiqVar.a & 4) != 0 ? jiqVar.d : null, true != z ? 3 : 2, this.c, this.d, this.h), new iuu(20), this.d);
    }
}
