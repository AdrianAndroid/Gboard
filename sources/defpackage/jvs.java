package defpackage;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: jvs  reason: default package */
/* loaded from: classes.dex */
public final class jvs implements jst {
    final /* synthetic */ jvu a;
    private final jvt b;
    private final AtomicBoolean c = new AtomicBoolean(false);

    public jvs(jvu jvuVar, jvt jvtVar) {
        this.a = jvuVar;
        this.b = jvtVar;
        synchronized (jvtVar.b) {
            jvtVar.c++;
        }
    }

    public final File b() {
        return this.b.a;
    }

    @Override // defpackage.jst
    /* renamed from: c */
    public final jvs a() {
        if (this.c.get()) {
            throw new IllegalStateException("Can't copy a closed reference.");
        }
        return new jvs(this.a, this.b);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.c.getAndSet(true)) {
            return;
        }
        jvu jvuVar = this.a;
        int i = jvu.b;
        synchronized (jvuVar.a) {
            synchronized (this.b.b) {
                jvt jvtVar = this.b;
                int i2 = jvtVar.c - 1;
                jvtVar.c = i2;
                if (i2 < 0) {
                    ((luc) ((luc) jsh.a.d()).k("com/google/android/libraries/micore/superpacks/gc/FileRefTable$FileRefImpl", "close", 106, "FileRefTable.java")).w("File %s was closed more times than it was referenced!", this.b);
                } else if (i2 == 0) {
                    this.a.a.remove(jvtVar.a);
                    this.a.a(b(), 2);
                }
            }
        }
    }

    public final void finalize() {
        super.finalize();
        if (!this.c.get()) {
            ((luc) ((luc) jsh.a.d()).k("com/google/android/libraries/micore/superpacks/gc/FileRefTable$FileRefImpl", "finalize", 122, "FileRefTable.java")).w("File ref is being finalized but wasn't closed, file: %s", this.b);
        }
    }

    public final String toString() {
        String str;
        synchronized (this.b.b) {
            str = this.b.a.getName() + "(" + this.b.c + (true != this.c.get() ? ")" : "x)");
        }
        return str;
    }
}
