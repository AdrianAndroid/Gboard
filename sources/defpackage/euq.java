package defpackage;

/* compiled from: PG */
/* renamed from: euq  reason: default package */
/* loaded from: classes.dex */
public final class euq implements nft {
    private final /* synthetic */ int a;

    public euq(int i) {
        this.a = i;
    }

    @Override // defpackage.nft
    public final /* synthetic */ Object a(Object obj) {
        switch (this.a) {
            case 0:
                eus b = eus.b(((Integer) obj).intValue());
                return b == null ? eus.SCALE_MODE_FILL_HORIZONTAL : b;
            case 1:
                eur b2 = eur.b(((Integer) obj).intValue());
                return b2 == null ? eur.GRAVITY_BOTTOM : b2;
            case 2:
                gfu b3 = gfu.b(((Integer) obj).intValue());
                return b3 == null ? gfu.DEFAULT_ATTRIBUTE : b3;
            case 3:
                ggi b4 = ggi.b(((Integer) obj).intValue());
                return b4 == null ? ggi.CTRL : b4;
            case 4:
                mti b5 = mti.b(((Integer) obj).intValue());
                return b5 == null ? mti.UNKNOWN_CALL : b5;
            case 5:
                mxl b6 = mxl.b(((Integer) obj).intValue());
                return b6 == null ? mxl.UNKNOWN_GLOBAL_MATERIAL : b6;
            case 6:
                mxo b7 = mxo.b(((Integer) obj).intValue());
                return b7 == null ? mxo.UNKNOWN_LOCAL_MATERIAL : b7;
            default:
                mvl b8 = mvl.b(((Integer) obj).intValue());
                return b8 == null ? mvl.UNKNOWN : b8;
        }
    }
}
