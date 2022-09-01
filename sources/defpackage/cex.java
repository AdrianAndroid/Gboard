package defpackage;

import java.io.IOException;
import java.util.concurrent.TimeoutException;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: cex  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class cex implements miy {
    private final /* synthetic */ int r;
    public static final /* synthetic */ cex q = new cex(20);
    public static final /* synthetic */ cex p = new cex(17);
    public static final /* synthetic */ cex o = new cex(16);
    public static final /* synthetic */ cex n = new cex(15);
    public static final /* synthetic */ cex m = new cex(14);
    public static final /* synthetic */ cex l = new cex(11);
    public static final /* synthetic */ cex k = new cex(10);
    public static final /* synthetic */ cex j = new cex(9);
    public static final /* synthetic */ cex i = new cex(8);
    public static final /* synthetic */ cex h = new cex(7);
    public static final /* synthetic */ cex g = new cex(6);
    public static final /* synthetic */ cex f = new cex(5);
    public static final /* synthetic */ cex e = new cex(4);
    public static final /* synthetic */ cex d = new cex(3);
    public static final /* synthetic */ cex c = new cex(2);
    public static final /* synthetic */ cex b = new cex(1);
    public static final /* synthetic */ cex a = new cex(0);

    public /* synthetic */ cex(int i2) {
        this.r = i2;
    }

    @Override // defpackage.miy
    public final mko a(Object obj) {
        switch (this.r) {
            case 0:
                ((luc) ((luc) cfd.h.b()).k("com/google/android/apps/inputmethod/libs/delight5/superpacks/SuperDelightManager", "lambda$syncOverridesLanguageModels$14", 687, "SuperDelightManager.java")).w("SuperDelightManager#syncOverridesLanguageModels(): %s", ((cel) obj).getMessage());
                lrr lrrVar = lrr.a;
                return kcu.K(jre.k(lrrVar, lrrVar));
            case 1:
                Void r6 = (Void) obj;
                return kcu.K(-1);
            case 2:
                Void r62 = (Void) obj;
                return kcu.K(-1);
            case 3:
                Void r63 = (Void) obj;
                return cqf.o;
            case 4:
                TimeoutException timeoutException = (TimeoutException) obj;
                ltg ltgVar = gms.a;
                return kcu.K(gmm.a);
            case 5:
                return gni.c(((fwk) obj).a());
            case 6:
                return gni.c(((fwk) obj).b());
            case 7:
                ltg ltgVar2 = ixk.a;
                return gni.c(((fwk) obj).a());
            case 8:
                ltg ltgVar3 = ixk.a;
                return gni.c(((fwk) obj).b());
            case 9:
                return gni.c(((fwk) obj).b());
            case 10:
                return gni.c(((fwk) obj).a());
            case 11:
                jig jigVar = (jig) obj;
                return kcu.K(true);
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                if (!((Boolean) obj).booleanValue()) {
                    jmk.b("%s: Failed to write back stale groups!", "ExpirationHandler");
                }
                return mkk.a;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                ((Boolean) obj).booleanValue();
                return mkk.a;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Boolean bool = (Boolean) obj;
                return mkk.a;
            case 15:
                Boolean bool2 = (Boolean) obj;
                return mkk.a;
            case 16:
                Boolean bool3 = (Boolean) obj;
                return mkk.a;
            case 17:
                Boolean bool4 = (Boolean) obj;
                return mkk.a;
            case 18:
                if (((Boolean) obj).booleanValue()) {
                    return mkk.a;
                }
                return kcu.J(new IOException("Failed to commit new group metadata to disk."));
            case 19:
                ((Boolean) obj).booleanValue();
                return mkk.a;
            default:
                nzv a2 = jhv.a();
                a2.a = jhu.UNABLE_TO_UPDATE_GROUP_METADATA_ERROR;
                a2.c = (IOException) obj;
                return kcu.J(a2.e());
        }
    }
}
