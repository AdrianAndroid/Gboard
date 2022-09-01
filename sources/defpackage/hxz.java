package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* renamed from: hxz  reason: default package */
/* loaded from: classes.dex */
public abstract class hxz extends BroadcastReceiver {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/launchericon/LauncherIconVisibilityInitializerBase");
    static final List b = Arrays.asList("android.intent.action.BOOT_COMPLETED", "android.intent.action.MY_PACKAGE_REPLACED");
    private final lgb c = jdg.n(cqg.o);

    public abstract boolean c(Context context);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void d(Context context) {
        ((mks) this.c.a()).execute(new gxi(this, context, 19));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (b.contains(intent.getAction())) {
            d(context);
        }
    }
}
