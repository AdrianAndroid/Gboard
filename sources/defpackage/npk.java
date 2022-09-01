package defpackage;

/* compiled from: PG */
/* renamed from: npk  reason: default package */
/* loaded from: classes2.dex */
public final /* synthetic */ class npk implements kjr {
    private final /* synthetic */ int d;
    public static final /* synthetic */ npk c = new npk(2);
    public static final /* synthetic */ npk b = new npk(1);
    public static final /* synthetic */ npk a = new npk(0);

    private /* synthetic */ npk(int i) {
        this.d = i;
    }

    @Override // defpackage.kjr
    public final Object a(byte[] bArr) {
        int i = this.d;
        if (i != 0) {
            if (i == 1) {
                return (noq) nfm.w(noq.b, bArr);
            }
            return (njb) nfm.w(njb.b, bArr);
        }
        return (njc) nfm.w(njc.b, bArr);
    }
}
