package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;

/* compiled from: PG */
/* renamed from: fmy  reason: default package */
/* loaded from: classes.dex */
public class fmy {
    public static final int c = 223080000;
    public static final fmy d = new fmy();

    static {
        int i = fnn.c;
    }

    public final int e(Context context) {
        return f(context, c);
    }

    public final int f(Context context, int i) {
        int b = fnn.b(context, i);
        if (fnn.f(context, b)) {
            return 18;
        }
        return b;
    }

    public final Intent g(Context context, int i, String str) {
        if (i != 1 && i != 2) {
            if (i == 3) {
                return frf.c();
            }
            return null;
        } else if (context == null || !fyb.x(context)) {
            StringBuilder sb = new StringBuilder("gcore_");
            sb.append(c);
            sb.append("-");
            if (!TextUtils.isEmpty(str)) {
                sb.append(str);
            }
            sb.append("-");
            if (context != null) {
                sb.append(context.getPackageName());
            }
            sb.append("-");
            if (context != null) {
                try {
                    sb.append(fsj.b(context).c(context.getPackageName(), 0).versionCode);
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            return frf.b(sb.toString());
        } else {
            return frf.a();
        }
    }

    public final PendingIntent h(Context context, int i, String str) {
        Intent g = g(context, i, str);
        if (g == null) {
            return null;
        }
        return gcm.a(context, g, 201326592);
    }
}
