package defpackage;

/* compiled from: PG */
/* renamed from: cya  reason: default package */
/* loaded from: classes.dex */
public final class cya implements AutoCloseable {
    private final iqi a = iqi.m(cyj.r, 3);
    private final cuy b;
    private final dxs c;

    public cya(dxs dxsVar, cuy cuyVar, byte[] bArr, byte[] bArr2) {
        this.c = dxsVar;
        this.b = cuyVar;
    }

    public static cya a() {
        return new cya(dxs.u(), cuy.a(), null, null);
    }

    public final mko b(cye cyeVar) {
        if (this.a.l()) {
            return this.c.j(cyeVar);
        }
        return this.b.b(cyeVar.a, 2);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }
}
