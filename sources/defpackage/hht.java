package defpackage;

import android.view.View;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: hht  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class hht implements leq {
    private final /* synthetic */ int v;
    public static final /* synthetic */ hht u = new hht(20);
    public static final /* synthetic */ hht t = new hht(19);
    public static final /* synthetic */ hht s = new hht(18);
    public static final /* synthetic */ hht r = new hht(17);
    public static final /* synthetic */ hht q = new hht(16);
    public static final /* synthetic */ hht p = new hht(15);
    public static final /* synthetic */ hht o = new hht(14);
    public static final /* synthetic */ hht n = new hht(13);
    public static final /* synthetic */ hht m = new hht(12);
    public static final /* synthetic */ hht l = new hht(11);
    public static final /* synthetic */ hht k = new hht(10);
    public static final /* synthetic */ hht j = new hht(9);
    public static final /* synthetic */ hht i = new hht(8);
    public static final /* synthetic */ hht h = new hht(7);
    public static final /* synthetic */ hht g = new hht(6);
    public static final /* synthetic */ hht f = new hht(5);
    public static final /* synthetic */ hht e = new hht(4);
    public static final /* synthetic */ hht d = new hht(3);
    public static final /* synthetic */ hht c = new hht(2);
    public static final /* synthetic */ hht b = new hht(1);
    public static final /* synthetic */ hht a = new hht(0);

    private /* synthetic */ hht(int i2) {
        this.v = i2;
    }

    @Override // defpackage.leq
    public final Object a(Object obj) {
        r2 = false;
        boolean z = false;
        switch (this.v) {
            case 0:
                return Long.valueOf((String) obj);
            case 1:
                return Double.valueOf((String) obj);
            case 2:
                ltg ltgVar = hhu.a;
                return lyk.d.j((String) obj);
            case 3:
                ltg ltgVar2 = hiz.a;
                return null;
            case 4:
                return (mko) ((lgb) obj).a();
            case 5:
                return ((hjd) obj).a;
            case 6:
                return new hjm((aze) obj, ByteBuffer.class, les.a);
            case 7:
                return bfw.a((ByteBuffer) obj);
            case 8:
                return new hjm((aze) obj, InputStream.class, h);
            case 9:
                return new hjm((hjo) obj, ByteBuffer.class, les.a);
            case 10:
                return Boolean.valueOf(((hlf) obj).t);
            case 11:
                return Boolean.valueOf(((hlf) obj).u);
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                hrb hrbVar = (hrb) obj;
                if (hrbVar == null) {
                    return null;
                }
                llk e2 = llp.e();
                llp llpVar = hrbVar.b;
                int size = llpVar.size();
                for (int i2 = 0; i2 < size; i2++) {
                    iav iavVar = (iav) hrbVar.a.get((String) llpVar.get(i2));
                    if (iavVar != null) {
                        e2.h(iavVar);
                    }
                }
                return e2.g();
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return hrj.d((hqt) obj);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return hsc.a((hqt) obj);
            case 15:
                return ((hqt) obj).i();
            case 16:
                lmx g2 = lmz.g();
                for (jav javVar : (List) obj) {
                    if (javVar != null) {
                        g2.d(javVar);
                    }
                }
                return g2.g();
            case 17:
                llp llpVar2 = (llp) obj;
                ltg ltgVar3 = hrx.a;
                if (llpVar2 != null && !llpVar2.isEmpty()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 18:
                ltg ltgVar4 = hrx.a;
                return ((hqt) obj).o(0);
            case 19:
                hxd hxdVar = (hxd) obj;
                return new CopyOnWriteArraySet();
            default:
                View view = (View) obj;
                return false;
        }
    }
}
