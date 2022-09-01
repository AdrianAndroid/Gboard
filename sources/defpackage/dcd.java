package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.google.android.apps.inputmethod.libs.framework.core.AppBase;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: dcd  reason: default package */
/* loaded from: classes.dex */
public final class dcd {
    private static final lug a = hin.a;

    public static Intent a(Context context, Class cls) {
        Intent intent = new Intent(context, cls);
        intent.setFlags(268435456);
        intent.putExtra("activation_page", true);
        return intent;
    }

    public static void b(Context context) {
        ino.M(context).h("HAD_FIRST_RUN", g(context));
    }

    public static boolean c(Context context) {
        jaq jaqVar = new jaq(context);
        jaq.e();
        return jaqVar.h();
    }

    public static boolean d(Context context) {
        jaq jaqVar = new jaq(context);
        jaq.e();
        return jaqVar.j();
    }

    public static boolean e(Context context) {
        jaq jaqVar = new jaq(context);
        jaq.e();
        return jaqVar.h() && jaqVar.j();
    }

    public static boolean f(Context context, boolean z) {
        Class g;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof AppBase) {
            AppBase appBase = (AppBase) applicationContext;
            if ((!z && jam.z(appBase)) || (g = appBase.g()) == null) {
                return false;
            }
            if ((!jam.z(appBase) || z) && !"Xiaomi".equals(Build.BRAND) && ijf.i(ino.a) && ino.M(appBase).D("HAD_FIRST_RUN") != g(appBase)) {
                try {
                    Intent intent = new Intent(appBase, g);
                    intent.setFlags(268435456);
                    appBase.startActivity(intent);
                    return true;
                } catch (RuntimeException e) {
                    ((luc) ((luc) ((luc) a.c()).i(e)).k("com/google/android/apps/inputmethod/libs/framework/core/FirstRunActivityUtil", "runIfNeeded", '?', "FirstRunActivityUtil.java")).t("Failed to start first run activity.");
                }
            }
            if (!e(appBase)) {
                appBase.startActivity(a(appBase, g));
                return true;
            }
        }
        return false;
    }

    private static int g(Context context) {
        return context.getResources().getInteger(R.integer.f131300_resource_name_obfuscated_res_0x7f0c002a);
    }
}
