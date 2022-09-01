package defpackage;

import java.util.UUID;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lch  reason: default package */
/* loaded from: classes.dex */
public abstract class lch implements lcx {
    private final lcx a;
    private final UUID b;
    private final String c;

    public lch(String str, UUID uuid) {
        this.c = str;
        this.a = null;
        this.b = uuid;
    }

    public lch(String str, lcx lcxVar) {
        this.c = str;
        this.a = lcxVar;
        this.b = lcxVar.c();
    }

    @Override // defpackage.lcx
    public final lcx a() {
        return this.a;
    }

    @Override // defpackage.lcx
    public final String b() {
        return this.c;
    }

    @Override // defpackage.lcx
    public final UUID c() {
        return this.b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ldh.h(this);
    }

    public final String toString() {
        return ldh.g(this);
    }
}
