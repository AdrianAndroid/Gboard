package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;

/* compiled from: PG */
/* renamed from: fxh  reason: default package */
/* loaded from: classes.dex */
public final class fxh {
    public static final jns a = jnl.a("DynamitePhenoInit");
    private static final BroadcastReceiver b = new fxg();
    private static boolean c = false;

    public static String a(Context context) {
        return "com.google.android.gms.learning#".concat(String.valueOf(context.getPackageName()));
    }

    public static synchronized void b(Context context) {
        synchronized (fxh.class) {
            if (c) {
                return;
            }
            String a2 = a(context);
            kju.f(context);
            gcl.g(context, b, new IntentFilter("com.google.android.gms.phenotype.UPDATE"));
            gdh a3 = gdd.a(context);
            gen c2 = a3.c(a2, 66005, new String[]{"BRELLA", "BRELLA_COUNTERS"}, new byte[0]);
            c2.j(new doq(a2, 10));
            c2.k(new exi(a2, a3, 5));
            c = true;
        }
    }
}
