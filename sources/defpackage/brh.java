package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.preference.Preference;
import androidx.preference.TwoStatePreference;
import com.google.android.apps.inputmethod.libs.expression.extension.ContentSuggestionExtension;
import com.google.android.apps.inputmethod.libs.expression.extension.IStickerExtension;
import com.google.android.apps.inputmethod.libs.search.fastaccessbar.FastAccessBarExtension;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.launchericon.LauncherIconVisibilityInitializer;

/* compiled from: PG */
/* renamed from: brh  reason: default package */
/* loaded from: classes.dex */
public final class brh implements inj {
    private final /* synthetic */ int a;

    public brh(int i) {
        this.a = i;
    }

    public static int b() {
        return ((lrl) ecq.a(ecq.r)).c + 1;
    }

    public static boolean c(Context context, Preference preference) {
        Intent intent = preference.u;
        return intent == null || intent.getComponent() == null || context.getPackageManager().resolveActivity(intent, 65536) != null;
    }

    private static void d(ini iniVar, int i) {
        Object g = iniVar.g(i);
        if (g != null) {
            ((Preference) g).K(true);
        }
    }

    private static final void e(ino inoVar, ini iniVar) {
        Object g = iniVar.g(R.string.f160810_resource_name_obfuscated_res_0x7f140671);
        if (!(g instanceof TwoStatePreference)) {
            return;
        }
        TwoStatePreference twoStatePreference = (TwoStatePreference) g;
        twoStatePreference.n = new ecy(inoVar, twoStatePreference, 0);
        iniVar.l(R.string.f160810_resource_name_obfuscated_res_0x7f140671, false);
    }

    @Override // defpackage.inj
    public final void a(Context context, ini iniVar) {
        switch (this.a) {
            case 0:
                CharSequence r = iniVar.r();
                if (TextUtils.isEmpty(r) || (r instanceof Spanned)) {
                    return;
                }
                iniVar.m(R.string.f162700_resource_name_obfuscated_res_0x7f140730, Html.fromHtml(String.format(r.toString(), "<br><br>"), null, new jdh(new bwd(context, 1))));
                return;
            case 1:
                d(iniVar, R.string.f161060_resource_name_obfuscated_res_0x7f14068a);
                d(iniVar, R.string.f160750_resource_name_obfuscated_res_0x7f14066b);
                Object g = iniVar.g(R.string.f162520_resource_name_obfuscated_res_0x7f14071d);
                if (g != null) {
                    ((Preference) g).N(R.string.f165690_resource_name_obfuscated_res_0x7f140883);
                }
                Object g2 = iniVar.g(R.string.f162510_resource_name_obfuscated_res_0x7f14071c);
                if (g2 == null) {
                    return;
                }
                ((Preference) g2).N(R.string.f165670_resource_name_obfuscated_res_0x7f140881);
                return;
            case 2:
                if (!isr.e() || !itb.i(context)) {
                    iniVar.t(R.string.f160710_resource_name_obfuscated_res_0x7f140667);
                }
                igr d = igr.d(context);
                if (!d.i(ContentSuggestionExtension.class)) {
                    iniVar.t(R.string.f160760_resource_name_obfuscated_res_0x7f14066c);
                }
                if (!d.i(IStickerExtension.class)) {
                    iniVar.t(R.string.f161060_resource_name_obfuscated_res_0x7f14068a);
                }
                if (!d.i(FastAccessBarExtension.class)) {
                    iniVar.t(R.string.f160810_resource_name_obfuscated_res_0x7f140671);
                }
                if (!d.i(cmd.class)) {
                    iniVar.t(R.string.f160770_resource_name_obfuscated_res_0x7f14066d);
                }
                if (jam.p(context)) {
                    iniVar.t(R.string.f164600_resource_name_obfuscated_res_0x7f14080f);
                }
                if (!ffg.c(ino.M(context))) {
                    iniVar.t(R.string.f160930_resource_name_obfuscated_res_0x7f14067d);
                }
                if (!ffg.b(context)) {
                    iniVar.t(R.string.f162490_resource_name_obfuscated_res_0x7f14071a);
                }
                if (!fhr.w(context)) {
                    iniVar.t(R.string.f162540_resource_name_obfuscated_res_0x7f14071f);
                    iniVar.t(R.string.f160760_resource_name_obfuscated_res_0x7f14066c);
                    iniVar.t(R.string.f160810_resource_name_obfuscated_res_0x7f140671);
                    iniVar.t(R.string.f160770_resource_name_obfuscated_res_0x7f14066d);
                    iniVar.t(R.string.f165650_resource_name_obfuscated_res_0x7f14087f);
                    iniVar.t(R.string.f164130_resource_name_obfuscated_res_0x7f1407de);
                }
                String b = gzq.b(context, true);
                if (!b.equals("foldable") && !b.equals("tablet_large")) {
                    iniVar.t(R.string.f162580_resource_name_obfuscated_res_0x7f140723);
                }
                if (gqa.a(context).e) {
                    iniVar.s(R.string.f160940_resource_name_obfuscated_res_0x7f14067e);
                    iniVar.x(R.string.f161540_resource_name_obfuscated_res_0x7f1406bb);
                } else {
                    iniVar.x(R.string.f160940_resource_name_obfuscated_res_0x7f14067e);
                    iniVar.s(R.string.f161540_resource_name_obfuscated_res_0x7f1406bb);
                }
                if (dca.b(context)) {
                    iniVar.n(R.string.f164600_resource_name_obfuscated_res_0x7f14080f, R.string.f165070_resource_name_obfuscated_res_0x7f140842, new Object[0]);
                } else {
                    iniVar.n(R.string.f164600_resource_name_obfuscated_res_0x7f14080f, R.string.f164610_resource_name_obfuscated_res_0x7f140810, context.getString(R.string.ime_name));
                }
                iniVar.t(R.string.f161030_resource_name_obfuscated_res_0x7f140687);
                if (!jez.a(context).e().l()) {
                    return;
                }
                iniVar.s(R.string.f160980_resource_name_obfuscated_res_0x7f140682);
                return;
            case 3:
                if (ino.M(context).aj(R.string.f161070_resource_name_obfuscated_res_0x7f14068b)) {
                    return;
                }
                iniVar.t(R.string.f161070_resource_name_obfuscated_res_0x7f14068b);
                iniVar.t(R.string.f165940_resource_name_obfuscated_res_0x7f14089e);
                return;
            case 4:
                if (iqi.g(cit.a) || iqi.g(cit.F)) {
                    iniVar.x(R.string.f161060_resource_name_obfuscated_res_0x7f14068a);
                    return;
                } else {
                    iniVar.s(R.string.f161060_resource_name_obfuscated_res_0x7f14068a);
                    return;
                }
            case 5:
                if (iniVar.g(R.string.f162510_resource_name_obfuscated_res_0x7f14071c) == null) {
                    return;
                }
                if (!fgy.h(context)) {
                    iniVar.t(R.string.f162510_resource_name_obfuscated_res_0x7f14071c);
                } else {
                    String v = iniVar.v();
                    if (!TextUtils.isEmpty(v)) {
                        throw new IllegalStateException("show_language_switch_key already has dependency: ".concat(String.valueOf(v)));
                    }
                }
                if (ino.M(context).ah(R.string.f162510_resource_name_obfuscated_res_0x7f14071c)) {
                    return;
                }
                iniVar.l(R.string.f162510_resource_name_obfuscated_res_0x7f14071c, fgy.i(context));
                return;
            case 6:
                if (!jam.A(context)) {
                    return;
                }
                iniVar.t(R.string.f162210_resource_name_obfuscated_res_0x7f1406fe);
                return;
            case 7:
                if (hrx.y(context).p()) {
                    iniVar.x(R.string.f162520_resource_name_obfuscated_res_0x7f14071d);
                    return;
                } else {
                    iniVar.s(R.string.f162520_resource_name_obfuscated_res_0x7f14071d);
                    return;
                }
            case 8:
                if (!jam.n(context)) {
                    iniVar.t(R.string.f161090_resource_name_obfuscated_res_0x7f14068d);
                    iniVar.t(R.string.f162710_resource_name_obfuscated_res_0x7f140731);
                }
                if (!jam.w()) {
                    return;
                }
                iniVar.n(R.string.f161090_resource_name_obfuscated_res_0x7f14068d, R.string.f164560_resource_name_obfuscated_res_0x7f14080b, new Object[0]);
                return;
            case 9:
                ino M = ino.M(context);
                if (!((Boolean) ecq.a.c()).booleanValue()) {
                    iniVar.s(R.string.f160810_resource_name_obfuscated_res_0x7f140671);
                    return;
                }
                iniVar.x(R.string.f160810_resource_name_obfuscated_res_0x7f140671);
                if (M.ah(R.string.f160810_resource_name_obfuscated_res_0x7f140671)) {
                    return;
                }
                if (M.ak("PREF_FAST_ACCESS_BAR_SHOWN")) {
                    iniVar.l(R.string.f160810_resource_name_obfuscated_res_0x7f140671, true);
                    return;
                } else if (!((Boolean) ecq.q.c()).booleanValue()) {
                    if (((Boolean) ecq.v.c()).booleanValue()) {
                        e(M, iniVar);
                        return;
                    } else {
                        iniVar.l(R.string.f160810_resource_name_obfuscated_res_0x7f140671, true);
                        return;
                    }
                } else if (M.b("pref_fast_access_bar_onboarding_v2_shown_count", 0) >= b() || ((Boolean) ecq.v.c()).booleanValue()) {
                    e(M, iniVar);
                    return;
                } else {
                    iniVar.s(R.string.f160810_resource_name_obfuscated_res_0x7f140671);
                    return;
                }
            case 10:
                if (!LauncherIconVisibilityInitializer.b(context)) {
                    return;
                }
                iniVar.t(R.string.f162530_resource_name_obfuscated_res_0x7f14071e);
                return;
            default:
                iniVar.q(new inr(context));
                return;
        }
    }
}
