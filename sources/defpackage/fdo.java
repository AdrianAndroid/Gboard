package defpackage;

import android.content.Context;
import com.google.android.apps.inputmethod.libs.zhuyin.ZhuyinGestureHandler;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.launchericon.LauncherIconVisibilityInitializer;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: fdo  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class fdo implements inm {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ fdo(Context context, int i) {
        this.b = i;
        this.a = context;
    }

    public /* synthetic */ fdo(ZhuyinGestureHandler zhuyinGestureHandler, int i) {
        this.b = i;
        this.a = zhuyinGestureHandler;
    }

    public /* synthetic */ fdo(ecp ecpVar, int i) {
        this.b = i;
        this.a = ecpVar;
    }

    public /* synthetic */ fdo(fdq fdqVar, int i) {
        this.b = i;
        this.a = fdqVar;
    }

    public /* synthetic */ fdo(fdu fduVar, int i) {
        this.b = i;
        this.a = fduVar;
    }

    public /* synthetic */ fdo(fgj fgjVar, int i) {
        this.b = i;
        this.a = fgjVar;
    }

    public /* synthetic */ fdo(gyj gyjVar, int i) {
        this.b = i;
        this.a = gyjVar;
    }

    public /* synthetic */ fdo(hud hudVar, int i) {
        this.b = i;
        this.a = hudVar;
    }

    public /* synthetic */ fdo(hxk hxkVar, int i) {
        this.b = i;
        this.a = hxkVar;
    }

    public /* synthetic */ fdo(ieh iehVar, int i) {
        this.b = i;
        this.a = iehVar;
    }

    public /* synthetic */ fdo(ieq ieqVar, int i) {
        this.b = i;
        this.a = ieqVar;
    }

    public /* synthetic */ fdo(iev ievVar, int i) {
        this.b = i;
        this.a = ievVar;
    }

    public /* synthetic */ fdo(igq igqVar, int i) {
        this.b = i;
        this.a = igqVar;
    }

    public /* synthetic */ fdo(jft jftVar, int i) {
        this.b = i;
        this.a = jftVar;
    }

    @Override // defpackage.inm
    public final void go(ino inoVar, String str) {
        int i = 0;
        switch (this.b) {
            case 0:
                fdq fdqVar = (fdq) this.a;
                if (fdqVar.e.x(R.string.f161110_resource_name_obfuscated_res_0x7f14068f, false)) {
                    fdqVar.f.g();
                    return;
                } else if (!fdqVar.c()) {
                    return;
                } else {
                    fdqVar.f.g();
                    return;
                }
            case 1:
                Object obj = this.a;
                inoVar.al(str, false, false);
                if (inoVar.al(str, false, false)) {
                    inoVar.i("PREF_FAST_ACCESS_BAR_LAST_USED_TIMESTAMP", -1L);
                    return;
                }
                dbn dbnVar = (dbn) obj;
                if (!dbnVar.R()) {
                    return;
                }
                dbnVar.z().y();
                return;
            case 2:
                fdu fduVar = (fdu) this.a;
                if (fdu.d(fduVar.b)) {
                    fduVar.c.g();
                    fduVar.c();
                    return;
                } else if (!fduVar.e()) {
                    return;
                } else {
                    fduVar.c.g();
                    return;
                }
            case 3:
                ((ZhuyinGestureHandler) this.a).t(inoVar);
                return;
            case 4:
                Object obj2 = this.a;
                fgj fgjVar = (fgj) obj2;
                fgjVar.c = fgjVar.h.aj(R.string.f160500_resource_name_obfuscated_res_0x7f14064f);
                dij dijVar = (dij) obj2;
                dijVar.E();
                dijVar.y();
                return;
            case 5:
                gyj gyjVar = (gyj) this.a;
                int c = gyjVar.c();
                if (!inoVar.an(str, c)) {
                    return;
                }
                gyjVar.w(inoVar.aj(c));
                return;
            case 6:
                Object obj3 = this.a;
                while (true) {
                    hud hudVar = (hud) obj3;
                    icd[] icdVarArr = hudVar.h;
                    if (i >= icdVarArr.length) {
                        return;
                    }
                    if (str.equals(icdVarArr[i].b)) {
                        hudVar.k(inoVar, i, true);
                    }
                    i++;
                }
            case 7:
                ((hxk) this.a).e = inoVar.ak(str);
                return;
            case 8:
                hxk hxkVar = (hxk) this.a;
                hxkVar.b = inoVar.ak(str);
                ((ltd) ((ltd) hxk.a.b()).k("com/google/android/libraries/inputmethod/keypresseffect/PressEffectPlayer", "lambda$new$1", 122, "PressEffectPlayer.java")).w("vibrateOnPressEnabled is changed to %s", Boolean.valueOf(hxkVar.b));
                return;
            case 9:
                ((hxk) this.a).f = inoVar.m(R.string.f162560_resource_name_obfuscated_res_0x7f140721, -1.0f);
                return;
            case 10:
                hxk hxkVar2 = (hxk) this.a;
                hxkVar2.c = inoVar.G(str, hxkVar2.d);
                return;
            case 11:
                LauncherIconVisibilityInitializer.a((Context) this.a);
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                ((ieh) this.a).j = ieh.s(inoVar);
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                ieq ieqVar = (ieq) this.a;
                ieqVar.d = ieqVar.b(inoVar);
                ((ltd) ((ltd) ieq.a.b()).k("com/google/android/libraries/inputmethod/metricsgk/UserMetricsPreferencesCollectionBasisResolver", "lambda$new$0", 28, "UserMetricsPreferencesCollectionBasisResolver.java")).w("hasUserPermission: %s", Boolean.valueOf(ieqVar.d));
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                iev ievVar = (iev) this.a;
                ievVar.a();
                ievVar.a.c();
                return;
            case 15:
                Object obj4 = this.a;
                if (!str.equals(hyq.l(irn.d()))) {
                    return;
                }
                igq igqVar = (igq) obj4;
                igqVar.d(str);
                boolean z = igqVar.u;
                igqVar.a();
                return;
            default:
                jft jftVar = (jft) this.a;
                if (!str.equals(jftVar.a)) {
                    return;
                }
                jftVar.i();
                return;
        }
    }
}
