package defpackage;

import android.os.Build;

/* compiled from: PG */
/* renamed from: guv  reason: default package */
/* loaded from: classes.dex */
public final class guv {
    private static final hhl a = hhq.a("enable_settingslib_theme", false);

    public static boolean a() {
        return ((Boolean) a.c()).booleanValue() && Build.VERSION.SDK_INT >= 31;
    }
}
