package defpackage;

import android.content.Context;
import android.provider.Settings;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: kea  reason: default package */
/* loaded from: classes.dex */
final class kea {
    static {
        TimeUnit.DAYS.toMillis(365L);
        TimeUnit.HOURS.toMillis(6L);
    }

    public kea(Context context) {
        kcn.a();
        Settings.Secure.getString(context.getContentResolver(), "android_id");
    }
}
