package defpackage;

import android.content.Context;
import java.io.File;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: bnc  reason: default package */
/* loaded from: classes.dex */
public final class bnc {
    public final Object a;
    private volatile Object b;

    public bnc() {
        this.a = new AtomicInteger(-1);
    }

    public bnc(aqr aqrVar, byte[] bArr) {
        this.a = aqrVar;
    }

    public final void a(int i) {
        fev fevVar;
        Object obj = this.b;
        if (obj == null || (fevVar = ((fgc) ((opu) obj).a).j) == null) {
            return;
        }
        fevVar.d(i);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, aye] */
    public final aye b() {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    Object obj = ((aqr) this.a).a;
                    File cacheDir = ((Context) ((doi) obj).b).getCacheDir();
                    ayg aygVar = null;
                    File file = cacheDir == null ? null : new File(cacheDir, (String) ((doi) obj).a);
                    if (file != null && (file.isDirectory() || file.mkdirs())) {
                        aygVar = new ayg(file);
                    }
                    this.b = aygVar;
                }
                if (this.b == null) {
                    this.b = new ayf();
                }
            }
        }
        return this.b;
    }

    public final synchronized void c(opu opuVar) {
        if (this.b == opuVar) {
            this.b = null;
        }
    }

    public final synchronized void d(opu opuVar) {
        this.b = opuVar;
        a(((AtomicInteger) this.a).get());
    }
}
