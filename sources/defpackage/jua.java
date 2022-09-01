package defpackage;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: jua  reason: default package */
/* loaded from: classes.dex */
public final class jua implements jst {
    public final juc a;
    private final AtomicBoolean b = new AtomicBoolean(false);
    private final jvs c;

    public jua(jvs jvsVar, juc jucVar) {
        this.c = jvsVar;
        this.a = jucVar;
    }

    @Override // defpackage.jst
    /* renamed from: b */
    public final jua a() {
        jtq.o(this.b.get());
        return new jua(this.c.a(), this.a);
    }

    public final File c() {
        return this.c.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.b.getAndSet(true)) {
            return;
        }
        this.c.close();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jua)) {
            return false;
        }
        jua juaVar = (jua) obj;
        juc jucVar = this.a;
        if (jucVar != null) {
            return jucVar.equals(juaVar.a);
        }
        return juaVar.a == null;
    }

    public final int hashCode() {
        juc jucVar = this.a;
        if (jucVar != null) {
            return jucVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return this.c.toString();
    }
}
