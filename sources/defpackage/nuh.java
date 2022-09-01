package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: nuh  reason: default package */
/* loaded from: classes2.dex */
public final class nuh extends nuj {
    private final nui c;

    public nuh(String str, nui nuiVar) {
        super(str, false);
        jdg.D(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
        jdg.Q(nuiVar, "marshaller");
        this.c = nuiVar;
    }

    @Override // defpackage.nuj
    public final Object a(byte[] bArr) {
        return this.c.a(new String(bArr, lel.a));
    }

    @Override // defpackage.nuj
    public final byte[] b(Object obj) {
        return this.c.b(obj).getBytes(lel.a);
    }
}
