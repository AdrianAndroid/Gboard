package defpackage;

import android.net.Uri;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jme  reason: default package */
/* loaded from: classes.dex */
public final class jme implements jmh {
    private final jlk a;
    private final jie b;
    private final String c;
    private final jiq d;
    private final int e;
    private final long f;
    private final String g;
    private final jhy h;
    private final Executor i;
    private final int j;
    private final kcq k;
    private final lwm l;

    public jme(jlk jlkVar, kcq kcqVar, jie jieVar, int i, lwm lwmVar, jiq jiqVar, int i2, long j, String str, jhy jhyVar, Executor executor, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = jlkVar;
        this.k = kcqVar;
        this.b = jieVar;
        this.j = i;
        this.c = lre.aA(jieVar);
        this.l = lwmVar;
        this.d = jiqVar;
        this.e = i2;
        this.f = j;
        this.g = str;
        this.h = jhyVar;
        this.i = executor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static mko c(jip jipVar, jie jieVar, int i, jlk jlkVar, Executor executor) {
        jit t = kki.t(jieVar, i);
        return jnd.c(e(jlkVar, t, executor)).g(new jkg(jipVar, jlkVar, t, 18), executor).g(new jku(t, 18), executor);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static mko d(jlk jlkVar, jie jieVar, int i, kcq kcqVar, Uri uri, String str, lwm lwmVar, jhy jhyVar, Executor executor) {
        return jnd.c(e(jlkVar, kki.t(jieVar, i), executor)).g(new fem(jhyVar, str, kcqVar, uri, 18, (byte[]) null, (byte[]) null, (byte[]) null), executor);
    }

    private static mko e(jlk jlkVar, jit jitVar, Executor executor) {
        return jco.j(jlkVar.e(jitVar), new jku(jitVar, 15), executor);
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x018a, code lost:
        if (r2 != 2) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x024d  */
    @Override // defpackage.jmh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.mko a(android.net.Uri r21) {
        /*
            Method dump skipped, instructions count: 594
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jme.a(android.net.Uri):mko");
    }

    @Override // defpackage.jmh
    public final mko b(jhv jhvVar) {
        int i = jmk.a;
        if (jhvVar.a.equals(jhu.DOWNLOADED_FILE_CHECKSUM_MISMATCH_ERROR)) {
            return c(jip.CORRUPTED, this.b, this.j, this.a, this.i);
        }
        return c(jip.DOWNLOAD_FAILED, this.b, this.j, this.a, this.i);
    }
}
