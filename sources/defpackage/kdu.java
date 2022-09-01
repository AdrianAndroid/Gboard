package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;

/* compiled from: PG */
/* renamed from: kdu  reason: default package */
/* loaded from: classes.dex */
public final class kdu {
    public final Context a;
    public final String b;
    public final String c;
    public final String d;
    public final gkn e;
    public final lgb f;
    public final lgb g;
    public final int h;

    public kdu(Context context, lfb lfbVar, String str) {
        int i;
        this.a = context;
        this.b = context.getPackageName();
        ActivityManager activityManager = kcn.a;
        String packageName = context.getPackageName();
        String a = kcn.a();
        lgb lgbVar = null;
        if (a != null && packageName != null && a.startsWith(packageName)) {
            int length = packageName.length();
            a = a.length() == length ? null : a.substring(length + 1);
        }
        this.c = a;
        this.g = lfbVar.e() ? ((kdj) lfbVar.a()).a() : lgbVar;
        this.d = str;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager.hasSystemFeature("android.hardware.type.watch")) {
            i = 3;
        } else {
            i = packageManager.hasSystemFeature("android.software.leanback") ? 4 : 2;
        }
        this.h = true == packageManager.hasSystemFeature("android.hardware.type.automotive") ? 5 : i;
        this.e = new gkn(context);
        this.f = jdg.n(new ihp(this, 11));
    }
}
