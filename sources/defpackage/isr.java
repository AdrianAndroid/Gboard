package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: isr  reason: default package */
/* loaded from: classes.dex */
public final class isr extends BroadcastReceiver implements isv, hhk, inm {
    public static final hhl a = hhq.a("enable_app_requested_dark_theme", false);
    private static final ltg c = ltg.j("com/google/android/libraries/inputmethod/theme/DarkThemeSwitcher");
    private static final boolean d;
    public boolean b;
    private final Context e;
    private boolean f;

    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 29) {
            z = true;
        }
        d = z;
    }

    public isr(Context context) {
        this.e = context;
    }

    public static boolean e() {
        return ((Boolean) isy.a.c()).booleanValue();
    }

    public static boolean f(Context context) {
        if (!d || !itb.i(context)) {
            return false;
        }
        return gwc.k(context);
    }

    public static boolean g(Context context, boolean z, boolean z2) {
        if (z == z2) {
            return false;
        }
        if (d && itb.i(context)) {
            return !f(context);
        }
        ((ltd) ((ltd) c.b()).k("com/google/android/libraries/inputmethod/theme/DarkThemeSwitcher", "shouldSwitchDarkMode", 50, "DarkThemeSwitcher.java")).t("dark mode is not supported by theme or in current SDK.");
        return false;
    }

    private final void h() {
        if (this.f) {
            this.e.unregisterReceiver(this);
            this.f = false;
        }
    }

    private final void i() {
        boolean z = this.b;
        boolean k = k();
        this.b = k;
        if (z != k) {
            isz.b();
        }
    }

    private final void j() {
        if (!l()) {
            h();
        } else if (this.f) {
        } else {
            this.e.registerReceiver(this, new IntentFilter("android.os.action.POWER_SAVE_MODE_CHANGED"));
            this.f = true;
        }
    }

    private final boolean k() {
        PowerManager powerManager;
        return l() && itb.i(this.e) && (powerManager = (PowerManager) this.e.getSystemService("power")) != null && powerManager.isPowerSaveMode();
    }

    private final boolean l() {
        return e() && ino.M(this.e).aj(R.string.f160710_resource_name_obfuscated_res_0x7f140667);
    }

    @Override // defpackage.isv
    public final void c() {
        isy.a.g(this);
        ino.M(this.e).ag(this, R.string.f161570_resource_name_obfuscated_res_0x7f1406be, R.string.f160710_resource_name_obfuscated_res_0x7f140667);
        h();
        this.b = false;
    }

    @Override // defpackage.isv
    public final void d() {
        isy.a.e(this);
        ino.M(this.e).Z(this, R.string.f161570_resource_name_obfuscated_res_0x7f1406be, R.string.f160710_resource_name_obfuscated_res_0x7f140667);
        j();
        this.b = k();
    }

    @Override // defpackage.inm
    public final void go(ino inoVar, String str) {
        j();
        i();
    }

    @Override // defpackage.hhk
    public final void ib(hhl hhlVar) {
        j();
        i();
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        i();
    }
}
