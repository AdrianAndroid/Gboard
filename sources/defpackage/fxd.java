package defpackage;

import j$.util.Collection$EL;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: fxd  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class fxd implements leq {
    private final /* synthetic */ int v;
    public static final /* synthetic */ fxd u = new fxd(20);
    public static final /* synthetic */ fxd t = new fxd(19);
    public static final /* synthetic */ fxd s = new fxd(18);
    public static final /* synthetic */ fxd r = new fxd(17);
    public static final /* synthetic */ fxd q = new fxd(16);
    public static final /* synthetic */ fxd p = new fxd(15);
    public static final /* synthetic */ fxd o = new fxd(14);
    public static final /* synthetic */ fxd n = new fxd(13);
    public static final /* synthetic */ fxd m = new fxd(12);
    public static final /* synthetic */ fxd l = new fxd(11);
    public static final /* synthetic */ fxd k = new fxd(10);
    public static final /* synthetic */ fxd j = new fxd(9);
    public static final /* synthetic */ fxd i = new fxd(8);
    public static final /* synthetic */ fxd h = new fxd(7);
    public static final /* synthetic */ fxd g = new fxd(6);
    public static final /* synthetic */ fxd f = new fxd(5);
    public static final /* synthetic */ fxd e = new fxd(4);
    public static final /* synthetic */ fxd d = new fxd(3);
    public static final /* synthetic */ fxd c = new fxd(2);
    public static final /* synthetic */ fxd b = new fxd(1);
    public static final /* synthetic */ fxd a = new fxd(0);

    private /* synthetic */ fxd(int i2) {
        this.v = i2;
    }

    @Override // defpackage.leq
    public final Object a(Object obj) {
        switch (this.v) {
            case 0:
                jnk jnkVar = (jnk) obj;
                return new fws(jnkVar.a(), (fwo) jnkVar.c(fwo.class), fwd.a(), (byte[]) null);
            case 1:
                kqw kqwVar = kqw.a;
                HashMap hashMap = new HashMap();
                kqn.b(kqo.a, hashMap);
                return kqn.i(fxe.a, new kcq(llp.r(koq.h(((jnk) obj).a()).c())), hashMap, kqwVar);
            case 2:
                return new fxa(((jnk) obj).a());
            case 3:
                return new jni(((jnk) obj).a());
            case 4:
                return new fzz(((jnk) obj).a());
            case 5:
                IOException iOException = (IOException) obj;
                Pattern pattern = gbx.a;
                return null;
            case 6:
                IOException iOException2 = (IOException) obj;
                Pattern pattern2 = gbx.a;
                return null;
            case 7:
                blb blbVar = (blb) obj;
                return null;
            case 8:
                return Integer.valueOf(((ExperimentalCronetEngine) obj).getTransportRttMs());
            case 9:
                return Integer.valueOf(((ExperimentalCronetEngine) obj).getDownstreamThroughputKbps());
            case 10:
                return Long.valueOf(((gmm) obj).m);
            case 11:
                String str = (String) obj;
                ltg ltgVar = grh.a;
                return (str == null || !str.startsWith("access_point_")) ? str : str.substring(13);
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                Void r6 = (Void) obj;
                return new HashMap();
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                Void r62 = (Void) obj;
                return new ArrayList();
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Void r63 = (Void) obj;
                return new ArrayList();
            case 15:
                Void r64 = (Void) obj;
                return new ArrayList();
            case 16:
                Void r65 = (Void) obj;
                return new ijk(new ArrayList(), new ArrayList());
            case 17:
                List<hqt> list = (List) obj;
                int i2 = gzm.f;
                llk e2 = llp.e();
                if (list != null) {
                    for (hqt hqtVar : list) {
                        if (hqtVar != null) {
                            e2.h(hqtVar);
                        }
                    }
                }
                return e2.g();
            case 18:
                return (llp) Collection$EL.stream((llp) obj).map(eoe.h).collect(ljr.a);
            case 19:
                return Boolean.valueOf((String) obj);
            default:
                return String.valueOf((String) obj);
        }
    }
}
