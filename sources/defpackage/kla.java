package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: kla  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class kla implements klb {
    private final /* synthetic */ int o;
    public static final /* synthetic */ kla n = new kla(13);
    public static final /* synthetic */ kla m = new kla(12);
    public static final /* synthetic */ kla l = new kla(11);
    public static final /* synthetic */ kla k = new kla(10);
    public static final /* synthetic */ kla j = new kla(9);
    public static final /* synthetic */ kla i = new kla(8);
    public static final /* synthetic */ kla h = new kla(7);
    public static final /* synthetic */ kla g = new kla(6);
    public static final /* synthetic */ kla f = new kla(5);
    public static final /* synthetic */ kla e = new kla(4);
    public static final /* synthetic */ kla d = new kla(3);
    public static final /* synthetic */ kla c = new kla(2);
    public static final /* synthetic */ kla b = new kla(1);
    public static final /* synthetic */ kla a = new kla(0);

    private /* synthetic */ kla(int i2) {
        this.o = i2;
    }

    @Override // defpackage.klb
    public final Object a(Object obj) {
        switch (this.o) {
            case 0:
                return Long.valueOf(Long.parseLong((String) obj));
            case 1:
                return Boolean.valueOf(Boolean.parseBoolean((String) obj));
            case 2:
                return (ona) nfm.w(ona.b, (byte[]) obj);
            case 3:
                return (oor) nfm.w(oor.d, (byte[]) obj);
            case 4:
                return (oor) nfm.w(oor.d, (byte[]) obj);
            case 5:
                return (kej) nfm.w(kej.c, (byte[]) obj);
            case 6:
                return (kfn) nfm.w(kfn.d, (byte[]) obj);
            case 7:
                return (oor) nfm.w(oor.d, (byte[]) obj);
            case 8:
                return (oor) nfm.w(oor.d, (byte[]) obj);
            case 9:
                return (oor) nfm.w(oor.d, (byte[]) obj);
            case 10:
                return (oor) nfm.w(oor.d, (byte[]) obj);
            case 11:
                return (oor) nfm.w(oor.d, (byte[]) obj);
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return (oor) nfm.w(oor.d, (byte[]) obj);
            default:
                return (oor) nfm.w(oor.d, (byte[]) obj);
        }
    }
}
