package defpackage;

import java.io.Closeable;
import java.io.File;

/* compiled from: PG */
/* renamed from: byz  reason: default package */
/* loaded from: classes.dex */
public final class byz implements Closeable {
    final jua a;

    public byz(jua juaVar) {
        this.a = juaVar;
    }

    public final juc a() {
        return this.a.a;
    }

    public final File b() {
        return this.a.c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof byz)) {
            return false;
        }
        return this.a.equals(((byz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
