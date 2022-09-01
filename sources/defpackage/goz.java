package defpackage;

import java.io.IOException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: goz  reason: default package */
/* loaded from: classes.dex */
public class goz implements gpc {
    private final Future c;
    private final nkl d;
    private final String e;
    private final String f;
    private final AtomicBoolean b = new AtomicBoolean(false);
    protected final gpe a = new gpe();

    public goz(Future future, nkl nklVar, String str, String str2) {
        this.c = future;
        this.d = nklVar;
        this.e = str;
        this.f = str2;
    }

    protected static void c(nfj nfjVar, ngt ngtVar, Object obj) {
        if (obj != null) {
            nfjVar.d(ngtVar, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public nfj a() {
        nfj b = bnt.b();
        String str = this.f;
        if (b.c) {
            b.cD();
            b.c = false;
        }
        nks nksVar = (nks) b.b;
        nks nksVar2 = nks.f;
        nksVar.a |= 1;
        nksVar.b = str;
        nkn nknVar = nkn.a;
        c(b, nkl.g, this.d);
        nkm nkmVar = nkm.c;
        nkv nkvVar = nkv.f;
        ngt ngtVar = nku.d;
        nfh t = nku.c.t();
        String str2 = this.e;
        if (t.c) {
            t.cD();
            t.c = false;
        }
        nku nkuVar = (nku) t.b;
        str2.getClass();
        nkuVar.a |= 1;
        nkuVar.b = str2;
        c(b, ngtVar, (nku) t.cz());
        try {
            b.d(nkq.m, this.a.a(this.c));
            return b;
        } catch (IOException e) {
            throw new bna(e, 131077);
        }
    }

    @Override // defpackage.gpc
    public final void b() {
    }

    @Override // defpackage.gpc, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.set(true);
    }

    @Override // defpackage.gpc
    public final nks hK() {
        if (this.b.compareAndSet(false, true)) {
            return (nks) a().cz();
        }
        return null;
    }
}
