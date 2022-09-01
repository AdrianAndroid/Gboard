package defpackage;

/* compiled from: PG */
/* renamed from: bmd  reason: default package */
/* loaded from: classes.dex */
public class bmd extends bla {
    public final int a;
    private final transient nwo b;

    public bmd(nwo nwoVar, byte[] bArr) {
        super(String.valueOf(nwoVar.a));
        jdg.u(nwoVar);
        this.b = nwoVar;
        this.a = nwoVar.a;
    }

    public final nwo a() {
        nwo nwoVar = this.b;
        return nwoVar == null ? new nwo(this.a, "unknown", lrq.b) : nwoVar;
    }
}
