package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: nuk  reason: default package */
/* loaded from: classes2.dex */
public final class nuk extends nuj {
    private final nul c;

    public nuk(String str, boolean z, nul nulVar) {
        super(str, z);
        jdg.D(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
        jdg.Q(nulVar, "marshaller");
        this.c = nulVar;
    }

    @Override // defpackage.nuj
    public final Object a(byte[] bArr) {
        return this.c.a(bArr);
    }

    @Override // defpackage.nuj
    public final byte[] b(Object obj) {
        return this.c.b(obj);
    }
}
