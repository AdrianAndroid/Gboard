package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;

/* compiled from: PG */
/* renamed from: ayi  reason: default package */
/* loaded from: classes.dex */
public final class ayi {
    static final int a;
    public final ActivityManager b;
    public float d;
    public final aqq h;
    public float c = 2.0f;
    public float e = 0.4f;
    public float f = 0.33f;
    public int g = 4194304;

    static {
        a = Build.VERSION.SDK_INT < 26 ? 4 : 1;
    }

    public ayi(Context context) {
        this.d = a;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.b = activityManager;
        this.h = new aqq(context.getResources().getDisplayMetrics());
        if (Build.VERSION.SDK_INT < 26 || !activityManager.isLowRamDevice()) {
            return;
        }
        this.d = 0.0f;
    }

    public final lcv a() {
        return new lcv(this);
    }
}
