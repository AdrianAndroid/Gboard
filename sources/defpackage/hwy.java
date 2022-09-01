package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.libraries.inputmethod.mdd.MDDTaskScheduler$Runner;
import com.google.android.libraries.inputmethod.trainingcache.impls.nebulaematerializer.NebulaeMaterializerV2;
import j$.util.Collection$EL;
import j$.util.stream.Collectors;
import java.util.List;
import java.util.Locale;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: hwy  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class hwy implements leq {
    private final /* synthetic */ int v;
    public static final /* synthetic */ hwy u = new hwy(20);
    public static final /* synthetic */ hwy t = new hwy(19);
    public static final /* synthetic */ hwy s = new hwy(18);
    public static final /* synthetic */ hwy r = new hwy(17);
    public static final /* synthetic */ hwy q = new hwy(16);
    public static final /* synthetic */ hwy p = new hwy(15);
    public static final /* synthetic */ hwy o = new hwy(14);
    public static final /* synthetic */ hwy n = new hwy(13);
    public static final /* synthetic */ hwy m = new hwy(12);
    public static final /* synthetic */ hwy l = new hwy(11);
    public static final /* synthetic */ hwy k = new hwy(10);
    public static final /* synthetic */ hwy j = new hwy(9);
    public static final /* synthetic */ hwy i = new hwy(8);
    public static final /* synthetic */ hwy h = new hwy(7);
    public static final /* synthetic */ hwy g = new hwy(6);
    public static final /* synthetic */ hwy f = new hwy(5);
    public static final /* synthetic */ hwy e = new hwy(4);
    public static final /* synthetic */ hwy d = new hwy(3);
    public static final /* synthetic */ hwy c = new hwy(2);
    public static final /* synthetic */ hwy b = new hwy(1);
    public static final /* synthetic */ hwy a = new hwy(0);

    private /* synthetic */ hwy(int i2) {
        this.v = i2;
    }

    @Override // defpackage.leq
    public final Object a(Object obj) {
        switch (this.v) {
            case 0:
                return Boolean.valueOf(((View) obj).isShown());
            case 1:
                hxd hxdVar = (hxd) obj;
                return new qq();
            case 2:
                hxd hxdVar2 = (hxd) obj;
                return new qq();
            case 3:
                return Boolean.valueOf(((View) obj).isShown());
            case 4:
                return (List) Collection$EL.stream((llp) obj).map(eoe.i).collect(Collectors.toCollection(cag.i));
            case 5:
                Void r10 = (Void) obj;
                int i2 = MDDTaskScheduler$Runner.a;
                return isb.FINISHED;
            case 6:
                Void r102 = (Void) obj;
                int i3 = MDDTaskScheduler$Runner.a;
                return isb.FINISHED;
            case 7:
                ((ltd) ((ltd) ((ltd) ibu.a.c()).i((Throwable) obj)).k("com/google/android/libraries/inputmethod/metadata/KeyboardDefManager", "lambda$loadKeyboardDef$1", (char) 358, "KeyboardDefManager.java")).t("Failed to get keyboard def from cache.");
                return null;
            case 8:
                return iio.e((Context) obj);
            case 9:
                return ((osr) obj).k();
            case 10:
                return ((hqt) obj).i();
            case 11:
                return jav.d((Locale) obj);
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                ltg ltgVar = its.a;
                gvt.a((ixe) obj);
                return null;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return ((mrc) obj).b;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return ((jav) obj).q();
            case 15:
                int i4 = iuk.a;
                return nem.w(((Locale) obj).toLanguageTag());
            case 16:
                int i5 = iuk.a;
                return nem.w(((jav) obj).p());
            case 17:
                return ((mvm) obj).n();
            case 18:
                return new iuq((ixi) obj);
            case 19:
                return ((mrc) obj).b;
            default:
                mvm mvmVar = (mvm) obj;
                int i6 = NebulaeMaterializerV2.e;
                Object[] objArr = new Object[3];
                objArr[0] = mvmVar.g;
                objArr[1] = mvmVar.h;
                mvl b2 = mvl.b(mvmVar.b);
                if (b2 == null) {
                    b2 = mvl.UNKNOWN;
                }
                objArr[2] = b2;
                return String.format("%s-%s, %s", objArr);
        }
    }
}
