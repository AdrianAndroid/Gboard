package defpackage;

import java.io.Closeable;
import java.io.File;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* renamed from: jwr  reason: default package */
/* loaded from: classes.dex */
public final class jwr implements Closeable {
    public final jwu a;
    public final juc b;
    public final jtw c;
    public final File d;
    public final lfe e = new jcf(this, 3);
    public int f = 0;
    public mld g = null;
    public mko h;
    public final /* synthetic */ jws i;
    public final mop j;
    private final Runnable k;

    public jwr(jws jwsVar, jwu jwuVar, juc jucVar, jtw jtwVar, File file) {
        this.i = jwsVar;
        this.a = jwuVar;
        epv epvVar = new epv(this, jucVar, jwuVar, 17);
        this.k = epvVar;
        jwuVar.d().c(epvVar);
        this.b = jucVar;
        this.c = jtwVar;
        this.d = file;
        this.j = new mop(this, jucVar, file);
    }

    public final String a() {
        String str;
        synchronized (this) {
            str = (String) this.b.g().get(Math.min(this.f, ((lrl) this.b.g()).c - 1));
        }
        return str;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        jls d = this.a.d();
        ((CopyOnWriteArrayList) d.a).remove(this.k);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String a = a();
        return valueOf + ":" + a;
    }
}
