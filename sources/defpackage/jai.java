package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;

/* compiled from: PG */
/* renamed from: jai  reason: default package */
/* loaded from: classes.dex */
public final class jai extends BroadcastReceiver {
    public static final jah a;
    volatile boolean c;
    private volatile boolean e;
    private volatile boolean f;
    private static final ltg d = ltg.j("com/google/android/libraries/inputmethod/userunlock/UserUnlockMonitor");
    public static final jai b = new jai();

    static {
        jah jahVar = new jah();
        a = jahVar;
        ijf.g("UserUnlocked", jahVar);
    }

    private jai() {
    }

    private final void c(Context context) {
        if (this.f) {
            context.unregisterReceiver(this);
            this.f = false;
        }
    }

    public final void a(Context context) {
        if (this.c) {
            return;
        }
        this.c = true;
        this.e = lj.b(context);
        if (!this.e) {
            if (Build.VERSION.SDK_INT >= 24) {
                context.registerReceiver(this, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                this.f = true;
            }
            this.e = lj.b(context);
            if (!this.e) {
                return;
            }
            c(context);
            ijf.j(a);
            return;
        }
        ijf.j(a);
    }

    public final boolean b() {
        if (this.e || this.c) {
            return this.e;
        }
        if (jam.b || jam.y()) {
            this.e = true;
            ijf.j(a);
            return true;
        }
        throw new IllegalStateException("This method should be called after startMonitor!");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.e) {
            c(context);
        } else if (!"android.intent.action.USER_UNLOCKED".equals(intent.getAction())) {
        } else {
            this.e = true;
            if (this.e) {
                c(context);
                ijf.j(a);
                return;
            }
            ((ltd) ((ltd) d.b()).k("com/google/android/libraries/inputmethod/userunlock/UserUnlockMonitor", "onReceive", 132, "UserUnlockMonitor.java")).t("Received ACTION_USER_UNLOCKED under crypt keeper bounce state.");
        }
    }
}
