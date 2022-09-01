package defpackage;

import android.content.Context;
import android.os.Build;
import com.google.android.apps.inputmethod.libs.expression.tenoranimation.TenorAnimationJni;
import com.google.android.apps.inputmethod.libs.search.emoji.standard.EmojiPickerKeyboard;
import com.google.android.libraries.inputmethod.nativelib.NativeLibHelper;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.Locale;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: cqg  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class cqg implements lgb {
    private final /* synthetic */ int v;
    public static final /* synthetic */ cqg u = new cqg(20);
    public static final /* synthetic */ cqg t = new cqg(19);
    public static final /* synthetic */ cqg s = new cqg(18);
    public static final /* synthetic */ cqg r = new cqg(17);
    public static final /* synthetic */ cqg q = new cqg(16);
    public static final /* synthetic */ cqg p = new cqg(15);
    public static final /* synthetic */ cqg o = new cqg(14);
    public static final /* synthetic */ cqg n = new cqg(13);
    public static final /* synthetic */ cqg m = new cqg(12);
    public static final /* synthetic */ cqg l = new cqg(11);
    public static final /* synthetic */ cqg k = new cqg(10);
    public static final /* synthetic */ cqg j = new cqg(9);
    public static final /* synthetic */ cqg i = new cqg(8);
    public static final /* synthetic */ cqg h = new cqg(7);
    public static final /* synthetic */ cqg g = new cqg(6);
    public static final /* synthetic */ cqg f = new cqg(5);
    public static final /* synthetic */ cqg e = new cqg(4);
    public static final /* synthetic */ cqg d = new cqg(3);
    public static final /* synthetic */ cqg c = new cqg(2);
    public static final /* synthetic */ cqg b = new cqg(1);
    public static final /* synthetic */ cqg a = new cqg(0);

    private /* synthetic */ cqg(int i2) {
        this.v = i2;
    }

    @Override // defpackage.lgb
    public final Object a() {
        String str = "";
        switch (this.v) {
            case 0:
                ngt ngtVar = cqh.d;
                iqx q2 = iqy.a.q(cqh.d);
                return new cqh(q2, hbd.h(q2.a));
            case 1:
                return new bxg();
            case 2:
                return ino.L();
            case 3:
                return ieh.j();
            case 4:
                ltg ltgVar = TenorAnimationJni.a;
                return Boolean.valueOf(NativeLibHelper.a("tenoranimation_jni", false));
            case 5:
                int i2 = EmojiPickerKeyboard.c;
                return str;
            case 6:
                return gxo.c(11);
            case 7:
                lgb lgbVar = evw.a;
                return new evt();
            case 8:
                return ieh.j();
            case 9:
            case 10:
                return false;
            case 11:
                iie b2 = iif.a().b();
                b2.b(0L);
                return ihq.b(b2.a(), 0);
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return true;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ltg ltgVar2 = hxz.a;
                return gxo.c(19);
            case 15:
                lgb lgbVar2 = ift.a;
                new ConcurrentHashMap();
                kdg h2 = koq.h(guw.a());
                kqn.d(true, "LockScope will not be used in the custom backend. Only call builderWithOverrideForTest if you want to override the backend for testing, or call builder together with setLockScope to set a new lock scope.", new Object[0]);
                return new kcq(llp.s(h2.c(), new kou(null)));
            case 16:
                lgb lgbVar3 = ift.a;
                kqw kqwVar = kqw.a;
                HashMap hashMap = new HashMap();
                kqn.b(kqo.a, hashMap);
                return kqn.i(gxp.a().b, (kcq) ift.a.a(), hashMap, kqwVar);
            case 17:
                Context a2 = guw.a();
                Locale locale = Locale.US;
                Object[] objArr = new Object[3];
                objArr[0] = Build.VERSION.RELEASE;
                if (true != jam.A(a2)) {
                    str = "Mobile";
                }
                objArr[1] = str;
                objArr[2] = jam.l(a2);
                return String.format(locale, "Mozilla/5.0 (Linux; U; Android %s) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/51.0.2704.81 Version/4.0 %s Safari/537.36 GBoard_Android GKB/%s", objArr);
            case 18:
                return hiz.p(hcb.d, iio.b());
            case 19:
            default:
                return true;
        }
    }
}
