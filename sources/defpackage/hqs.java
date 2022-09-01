package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.inputmethod.latin.R;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: hqs  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class hqs {
    public static Locale a(hqt hqtVar) {
        return gwc.h(hqtVar.a());
    }

    public static hlp b(Context context, String str, iav iavVar, hls hlsVar) {
        return (hlp) jbt.v(context.getClassLoader(), hlp.class, str, new Class[]{Context.class, iav.class, hls.class}, context, iavVar, hlsVar);
    }

    public static /* synthetic */ String c(int i) {
        return i != 1 ? i != 2 ? "null" : "ONBOARDING_BANNER" : "TOOLTIP";
    }

    public static Context d(Context context) {
        int a;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, (int) R.style.DayNightTheme);
        jgw jgwVar = jgx.a;
        return (kts.a() && (a = jgx.a(contextThemeWrapper)) != 0) ? new ContextThemeWrapper(contextThemeWrapper, a) : contextThemeWrapper;
    }

    public static final void e(View view, boolean z) {
        oll.e(view, "<this>");
        if (h(view) != z) {
            view.setTag(R.id.f54350_resource_name_obfuscated_res_0x7f0b0197, z ? true : null);
            view.requestApplyInsets();
        }
    }

    public static final void f(ViewGroup viewGroup, Activity activity) {
        if (viewGroup == null || activity == null || !g(activity)) {
            return;
        }
        e(viewGroup, true);
        viewGroup.setClipToPadding(false);
        aad.V(viewGroup, hak.b);
    }

    public static final boolean g(Activity activity) {
        oll.e(activity, "<this>");
        View decorView = activity.getWindow().getDecorView();
        oll.d(decorView, "window.decorView");
        return h(decorView);
    }

    public static final boolean h(View view) {
        oll.e(view, "<this>");
        return oll.g(view.getTag(R.id.f54350_resource_name_obfuscated_res_0x7f0b0197), true);
    }

    public static String i(gzv gzvVar) {
        return gzvVar.getClass().getSimpleName();
    }

    public static int j(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 2;
        }
        return 1;
    }
}
