package defpackage;

/* compiled from: PG */
/* renamed from: khr  reason: default package */
/* loaded from: classes.dex */
public final class khr {
    private static final gjz f = new gjz();
    public final oiy b;
    public final gjz e;
    public final Object a = new Object();
    public int c = 0;
    public long d = 0;

    public khr(oiy oiyVar, gjz gjzVar, byte[] bArr) {
        this.b = oiyVar;
        this.e = gjzVar;
    }

    public static khr a(final int i) {
        return new khr(new oiy() { // from class: khq
            @Override // defpackage.oiy
            public final Object a() {
                return Integer.valueOf(i);
            }
        }, f, null);
    }
}
