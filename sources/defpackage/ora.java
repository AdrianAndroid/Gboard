package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* renamed from: ora  reason: default package */
/* loaded from: classes2.dex */
public final class ora implements Closeable {
    public final String a;
    public final long b;
    public final /* synthetic */ orb c;
    private final ovp[] d;

    public ora(orb orbVar, String str, long j, ovp[] ovpVarArr) {
        this.c = orbVar;
        this.a = str;
        this.b = j;
        this.d = ovpVarArr;
    }

    public final ovp a(int i) {
        return this.d[i];
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        for (ovp ovpVar : this.d) {
            oqs.r(ovpVar);
        }
    }
}
