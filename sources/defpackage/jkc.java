package defpackage;

import java.io.IOException;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: jkc  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jkc implements leq {
    private final /* synthetic */ int u;
    public static final /* synthetic */ jkc t = new jkc(20);
    public static final /* synthetic */ jkc s = new jkc(19);
    public static final /* synthetic */ jkc r = new jkc(18);
    public static final /* synthetic */ jkc q = new jkc(17);
    public static final /* synthetic */ jkc p = new jkc(16);
    public static final /* synthetic */ jkc o = new jkc(15);
    public static final /* synthetic */ jkc n = new jkc(14);
    public static final /* synthetic */ jkc m = new jkc(13);
    public static final /* synthetic */ jkc l = new jkc(12);
    public static final /* synthetic */ jkc k = new jkc(11);
    public static final /* synthetic */ jkc j = new jkc(10);
    public static final /* synthetic */ jkc i = new jkc(9);
    public static final /* synthetic */ jkc h = new jkc(8);
    public static final /* synthetic */ jkc g = new jkc(7);
    public static final /* synthetic */ jkc f = new jkc(6);
    public static final /* synthetic */ jkc e = new jkc(5);
    public static final /* synthetic */ jkc d = new jkc(4);
    public static final /* synthetic */ jkc c = new jkc(3);
    public static final /* synthetic */ jkc b = new jkc(2);
    public static final /* synthetic */ jkc a = new jkc(0);

    public /* synthetic */ jkc(int i2) {
        this.u = i2;
    }

    @Override // defpackage.leq
    public final Object a(Object obj) {
        switch (this.u) {
            case 0:
                return lfb.f((jig) obj);
            case 1:
                if (!((Boolean) obj).booleanValue()) {
                    jmk.b("%s: Failed to remove expired groups!", "ExpirationHandler");
                }
                return null;
            case 2:
                return jmp.a(obj);
            case 3:
                return jmp.b((Exception) obj);
            case 4:
                return jmp.a(obj);
            case 5:
                return jmp.b((Exception) obj);
            case 6:
                IOException iOException = (IOException) obj;
                boolean z = jkv.a;
                int i2 = jmk.a;
                return lfb.g(-1);
            case 7:
                lfb lfbVar = (lfb) obj;
                boolean z2 = jkv.a;
                if (lfbVar.e()) {
                    Integer num = (Integer) lfbVar.a();
                    if (num.intValue() >= 0) {
                        return num;
                    }
                    return -1;
                }
                return -1;
            case 8:
                Void r9 = (Void) obj;
                jkv.a = true;
                return null;
            case 9:
                Void r92 = (Void) obj;
                return true;
            case 10:
                IOException iOException2 = (IOException) obj;
                return false;
            case 11:
                jio jioVar = (jio) obj;
                nfh nfhVar = (nfh) jioVar.N(5);
                nfhVar.cG(jioVar);
                nfhVar.b = (nfm) nfhVar.b.N(4);
                return (jio) nfhVar.cz();
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                Void r93 = (Void) obj;
                return true;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                IOException iOException3 = (IOException) obj;
                return false;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Void r94 = (Void) obj;
                return true;
            case 15:
                IOException iOException4 = (IOException) obj;
                return false;
            case 16:
                Void r95 = (Void) obj;
                return true;
            case 17:
                IOException iOException5 = (IOException) obj;
                return false;
            case 18:
                return ((jio) obj).c;
            case 19:
                jio jioVar2 = (jio) obj;
                nfh nfhVar2 = (nfh) jioVar2.N(5);
                nfhVar2.cG(jioVar2);
                if (nfhVar2.c) {
                    nfhVar2.cD();
                    nfhVar2.c = false;
                }
                jio jioVar3 = jio.d;
                ((jio) nfhVar2.b).c = jio.G();
                return (jio) nfhVar2.cz();
            default:
                Void r96 = (Void) obj;
                return true;
        }
    }
}
