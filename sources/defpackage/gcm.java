package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* compiled from: PG */
/* renamed from: gcm  reason: default package */
/* loaded from: classes.dex */
public final class gcm {
    public static final int a;

    static {
        a = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }

    public static PendingIntent a(Context context, Intent intent, int i) {
        return PendingIntent.getActivity(context, 0, intent, i);
    }
}
