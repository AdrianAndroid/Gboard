package defpackage;

import android.view.View;
import j$.util.Collection$EL;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: dar  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class dar implements leq {
    private final /* synthetic */ int u;
    public static final /* synthetic */ dar t = new dar(20);
    public static final /* synthetic */ dar s = new dar(19);
    public static final /* synthetic */ dar r = new dar(18);
    public static final /* synthetic */ dar q = new dar(17);
    public static final /* synthetic */ dar p = new dar(16);
    public static final /* synthetic */ dar o = new dar(15);
    public static final /* synthetic */ dar n = new dar(14);
    public static final /* synthetic */ dar m = new dar(13);
    public static final /* synthetic */ dar l = new dar(12);
    public static final /* synthetic */ dar k = new dar(11);
    public static final /* synthetic */ dar j = new dar(10);
    public static final /* synthetic */ dar i = new dar(8);
    public static final /* synthetic */ dar h = new dar(7);
    public static final /* synthetic */ dar g = new dar(6);
    public static final /* synthetic */ dar f = new dar(5);
    public static final /* synthetic */ dar e = new dar(4);
    public static final /* synthetic */ dar d = new dar(3);
    public static final /* synthetic */ dar c = new dar(2);
    public static final /* synthetic */ dar b = new dar(1);
    public static final /* synthetic */ dar a = new dar(0);

    public /* synthetic */ dar(int i2) {
        this.u = i2;
    }

    @Override // defpackage.leq
    public final Object a(Object obj) {
        daq daqVar;
        switch (this.u) {
            case 0:
                lls h2 = llw.h();
                for (dal dalVar : ((dao) obj).a) {
                    dan danVar = dalVar.b;
                    if (danVar == null) {
                        danVar = dan.c;
                    }
                    if (danVar.a == 2) {
                        dan danVar2 = dalVar.b;
                        if (danVar2 == null) {
                            danVar2 = dan.c;
                        }
                        if (danVar2.a == 2) {
                            daqVar = (daq) danVar2.b;
                        } else {
                            daqVar = daq.c;
                        }
                        h2.a(daqVar.b, Integer.valueOf(dalVar.c));
                    }
                }
                return h2.l();
            case 1:
                return new czw((ixi) obj);
            case 2:
                return ((dnb) obj).a;
            case 3:
                return ((dnb) obj).a;
            case 4:
                return ((hqt) obj).h();
            case 5:
                return ((jav) obj).n;
            case 6:
                nvw nvwVar = (nvw) obj;
                ((ltd) ((ltd) duz.a.c()).k("com/google/android/apps/inputmethod/libs/nga/impl/service/NgaGrpcClient", "lambda$requestLanguageDownload$12", 348, "NgaGrpcClient.java")).t("No dictation side language download handler.");
                return fib.b;
            case 7:
                ltg ltgVar = duz.a;
                boolean z = ((fib) obj).a;
                return null;
            case 8:
                fid fidVar = ((fhn) obj).a;
                return fidVar == null ? fid.c : fidVar;
            case 9:
                llp e2 = ((cyn) obj).e(dyv.g);
                int i2 = ((lrl) e2).c;
                return e2;
            case 10:
                iht ihtVar = (iht) obj;
                if (ihtVar.a.a().b == 404) {
                    return llp.q();
                }
                throw ihtVar;
            case 11:
                ltg ltgVar2 = dzl.a;
                return ((dzq) obj).d().a;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return new cuu((View) obj);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                ltg ltgVar3 = dzl.a;
                return ((dzq) obj).a().a;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return ((dzq) obj).c();
            case 15:
                return dzq.e((dzp) obj);
            case 16:
                ltg ltgVar4 = dzl.a;
                return Integer.valueOf(((dzq) obj).b() - 1);
            case 17:
                ltg ltgVar5 = dzl.a;
                return new eaf((View) obj, n);
            case 18:
                return (cqp) lre.ad((llp) obj);
            case 19:
                cqo h3 = ((cqp) obj).h();
                h3.e(mbr.EMOJI_KITCHEN_MIX);
                return dzp.a(h3.a(), dzo.MIX_QUERY);
            default:
                llp llpVar = (llp) obj;
                if (((Boolean) dzn.m.c()).booleanValue()) {
                    llpVar = fgy.o(llpVar);
                }
                return (llp) Collection$EL.stream(llpVar).map(dwn.f).collect(ljr.a);
        }
    }
}
