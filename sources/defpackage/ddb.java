package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.view.View;
import android.view.Window;
import com.google.android.inputmethod.latin.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ddb  reason: default package */
/* loaded from: classes.dex */
public final class ddb {
    static {
        lug lugVar = hin.a;
    }

    public static void a(Window window, View view, int i, int i2, boolean z) {
        if (i != window.getNavigationBarColor()) {
            window.setNavigationBarColor(i);
        }
        if (i2 != window.getNavigationBarDividerColor()) {
            window.setNavigationBarDividerColor(i2);
        }
        e(window, true);
        f(view, true != z ? 0 : 16);
    }

    public static void c(Window window, View view) {
        if (((Boolean) dca.b.c()).booleanValue()) {
            a(window, view, 0, 0, false);
            return;
        }
        e(window, false);
        f(view, 0);
    }

    private static int d(gyz gyzVar, int i) {
        ColorStateList a = gyzVar.a(i);
        if (a != null) {
            int defaultColor = a.getDefaultColor();
            if (Color.alpha(defaultColor) != 255) {
                return 0;
            }
            return defaultColor;
        }
        return 0;
    }

    private static void e(Window window, boolean z) {
        int i = window.getAttributes().flags & Integer.MIN_VALUE;
        int i2 = true != z ? 0 : Integer.MIN_VALUE;
        if (i != i2) {
            window.setFlags(i2, Integer.MIN_VALUE);
        }
    }

    private static void f(View view, int i) {
        int systemUiVisibility = view.getSystemUiVisibility();
        int i2 = (i & 784) | (systemUiVisibility & (-785));
        if (systemUiVisibility != i2) {
            view.setSystemUiVisibility(i2);
        }
    }

    public static void b(Context context, Window window, View view, int i, boolean z) {
        ColorStateList a;
        int d;
        if (i == 0) {
            a(window, view, -16777216, 0, false);
        } else if (i != 1) {
            Object systemService = context.getSystemService("layout_inflater");
            if (!(systemService instanceof gyz)) {
                d = 0;
            } else {
                gyz gyzVar = (gyz) systemService;
                d = d(gyzVar, z ? R.color.f21090_resource_name_obfuscated_res_0x7f0600b2 : R.color.f21080_resource_name_obfuscated_res_0x7f0600b1);
                if (d == 0) {
                    d = d(gyzVar, true != z ? R.color.f21100_resource_name_obfuscated_res_0x7f0600b3 : R.color.f21110_resource_name_obfuscated_res_0x7f0600b4);
                }
            }
            if (Color.alpha(d) != 255) {
                a(window, view, -16777216, 0, false);
            } else {
                a(window, view, d, 0, jbt.K(context));
            }
        } else if (!jbt.K(context) || ((a = hjg.n(context).a(R.color.f21120_resource_name_obfuscated_res_0x7f0600b5)) != null && a.getDefaultColor() == 0)) {
            a(window, view, -16777216, 0, false);
        } else {
            a(window, view, -1, -2039584, true);
        }
    }
}
