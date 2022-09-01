package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.view.View;
import com.google.android.libraries.inputmethod.hint.banner.IBannerExtension;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: dhy  reason: default package */
/* loaded from: classes.dex */
public final class dhy implements hjv {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/hint/TooltipManager");
    public final Context b;
    public final hso c;
    public final hkh d;
    public final Map e = new HashMap();

    public dhy(Context context, hso hsoVar, hkh hkhVar) {
        this.b = context;
        this.c = hsoVar;
        this.d = hkhVar;
    }

    public static void f(hlf hlfVar, View view) {
        hle hleVar = hlfVar.e;
        if (hleVar != null) {
            hleVar.a(view);
        }
    }

    public static void g(hlf hlfVar, hkz hkzVar) {
        hiu hiuVar = hlfVar.w;
        if (hiuVar != null) {
            hiuVar.a(hkzVar);
        }
    }

    public static void h(hlf hlfVar) {
        Runnable runnable = hlfVar.x;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final Animator a(int i, hla hlaVar, View view) {
        Animator loadAnimator = AnimatorInflater.loadAnimator(iin.m(this.c), i);
        if (hlaVar != null) {
            hlaVar.a(loadAnimator, view);
        }
        loadAnimator.setTarget(view);
        return loadAnimator;
    }

    @Override // defpackage.hjv
    public final hlf b(String str) {
        dhx dhxVar = (dhx) this.e.get(str);
        if (dhxVar == null) {
            return null;
        }
        return dhxVar.a;
    }

    @Override // defpackage.hjv
    public final void c(String str, boolean z, hkz hkzVar) {
        dhx dhxVar = (dhx) this.e.get(str);
        if (dhxVar == null) {
            return;
        }
        View view = dhxVar.b;
        if (view == null) {
            ((ltd) ((ltd) a.c()).k("com/google/android/apps/inputmethod/libs/hint/TooltipManager", "dismissTooltip", 174, "TooltipManager.java")).t("dismissPopupTooltip(): tooltipView not inflated.");
            return;
        }
        View view2 = dhxVar.c;
        hlf hlfVar = dhxVar.a;
        int i = hlfVar.z;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            imn aa = this.c.aa();
            if (aa == null) {
                ((ltd) ((ltd) a.c()).k("com/google/android/apps/inputmethod/libs/hint/TooltipManager", "dismissPopupTooltip", 323, "TooltipManager.java")).t("dismissPopupTooltip(): popupViewManager is null.");
            } else if (aa.f(view)) {
                int i3 = hlfVar.k;
                aa.c(view, i3 != 0 ? a(i3, hlfVar.l, view) : null, z);
                if (view2 != null) {
                    aa.c(view2, null, true);
                }
                g(hlfVar, hkzVar);
            } else {
                ((ltd) ((ltd) a.c()).k("com/google/android/apps/inputmethod/libs/hint/TooltipManager", "dismissPopupTooltip", 327, "TooltipManager.java")).w("dismissPopupTooltip(): tooltip %s not displaying.", hlfVar.a);
            }
        } else if (i2 != 1) {
        } else {
            hkh hkhVar = this.d;
            String str2 = hlfVar.a;
            String str3 = hkhVar.b;
            if (str3 == null || !str3.equals(str2)) {
                ((ltd) ((ltd) a.c()).k("com/google/android/apps/inputmethod/libs/hint/TooltipManager", "dismissBanner", 441, "TooltipManager.java")).w("dismissBanner(): tooltip %s not displaying.", hlfVar.a);
                return;
            }
            int i4 = hlfVar.k;
            Animator a2 = i4 != 0 ? a(i4, hlfVar.l, view) : null;
            hkh hkhVar2 = this.d;
            String str4 = hlfVar.a;
            String str5 = hkhVar2.b;
            if (str5 != null && str5.equals(str4)) {
                hkhVar2.d = true;
                hkhVar2.f = a2;
                hkhVar2.g = z;
                hkhVar2.a.at(hfd.d(new iay(-10060, null, IBannerExtension.class)));
                hkhVar2.d = false;
            }
            g(hlfVar, hkzVar);
        }
    }

    @Override // defpackage.hjv
    public final void d(hlf hlfVar, int i) {
        hlb hlbVar = hlfVar.y;
        if (hlbVar != null) {
            hlbVar.a(i);
        }
    }

    @Override // defpackage.hjv
    public final void e(String str, int i) {
        hlb hlbVar;
        dhx dhxVar = (dhx) this.e.get(str);
        if (dhxVar == null || (hlbVar = dhxVar.a.y) == null) {
            return;
        }
        hlbVar.a(i);
    }

    @Override // defpackage.hjv
    public final void i(String str) {
        this.e.remove(str);
    }
}
