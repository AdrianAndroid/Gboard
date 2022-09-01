package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jmd  reason: default package */
/* loaded from: classes.dex */
public final class jmd implements jmh {
    public final Context a;
    public final jlk b;
    public final jie c;
    public final jjf d;
    public final jii e;
    public final jiq f;
    public final int g;
    public final long h;
    public final String i;
    public final lfb j;
    public final Executor k;
    public final int l;
    public final kcq m;
    public final lwm n;
    private final jhy o;

    public jmd(Context context, jlk jlkVar, kcq kcqVar, jie jieVar, int i, jjf jjfVar, jii jiiVar, lwm lwmVar, jiq jiqVar, int i2, long j, String str, lfb lfbVar, jhy jhyVar, Executor executor, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = context;
        this.b = jlkVar;
        this.m = kcqVar;
        this.c = jieVar;
        this.l = i;
        this.d = jjfVar;
        this.e = jiiVar;
        this.n = lwmVar;
        this.f = jiqVar;
        this.g = i2;
        this.h = j;
        this.i = str;
        this.j = lfbVar;
        this.o = jhyVar;
        this.k = executor;
    }

    @Override // defpackage.jmh
    public final mko a(Uri uri) {
        int i = jmk.a;
        if (!jmf.e(this.m, uri, this.e.d)) {
            jmk.d("%s: Downloaded delta file at uri = %s, checksum = %s verification failed", "DeltaFileDownloaderCallbackImpl", uri, this.e.d);
            nzv a = jhv.a();
            a.a = jhu.DOWNLOADED_FILE_CHECKSUM_MISMATCH_ERROR;
            jhv e = a.e();
            return jnd.c(jme.d(this.b, this.c, this.l, this.m, uri, this.e.d, this.n, this.o, this.k)).b(IOException.class, new jku(e, 13), this.k).g(new jku(e, 14), this.k);
        }
        Uri C = lvw.C(uri);
        nfh t = jit.g.t();
        jid jidVar = this.e.f;
        if (jidVar == null) {
            jidVar = jid.b;
        }
        String str = jidVar.a;
        if (t.c) {
            t.cD();
            t.c = false;
        }
        jit jitVar = (jit) t.b;
        str.getClass();
        int i2 = jitVar.a | 4;
        jitVar.a = i2;
        jitVar.d = str;
        jitVar.e = this.l - 1;
        jitVar.a = i2 | 8;
        jit jitVar2 = (jit) t.cz();
        return jco.j(jco.j(this.b.e(jitVar2), new fem(this, jitVar2, C, uri, 17), this.k), new jmg(this, C, 1), this.k);
    }

    @Override // defpackage.jmh
    public final mko b(jhv jhvVar) {
        String str = this.c.f;
        int i = jmk.a;
        if (jhvVar.a.equals(jhu.DOWNLOADED_FILE_CHECKSUM_MISMATCH_ERROR)) {
            return jme.c(jip.CORRUPTED, this.c, this.l, this.b, this.k);
        }
        return jme.c(jip.DOWNLOAD_FAILED, this.c, this.l, this.b, this.k);
    }
}
