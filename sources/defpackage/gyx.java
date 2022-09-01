package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

/* compiled from: PG */
/* renamed from: gyx  reason: default package */
/* loaded from: classes.dex */
public class gyx extends ContextWrapper {
    private static final lug a = hin.a;

    public gyx(Context context) {
        super(context);
    }

    private final void a(Intent[] intentArr, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 29 && !(getBaseContext() instanceof gyx)) {
            super.startActivities(intentArr, gwc.e(this, bundle));
        } else if (bundle == null) {
            super.startActivities(intentArr);
        } else {
            super.startActivities(intentArr, bundle);
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivities(Intent[] intentArr) {
        a(intentArr, null);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        startActivity(intent, null);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivities(Intent[] intentArr, Bundle bundle) {
        a(intentArr, bundle);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent, Bundle bundle) {
        if (!gwc.j(intent)) {
            if (Build.VERSION.SDK_INT >= 29 && !(getBaseContext() instanceof gyx)) {
                super.startActivity(intent, gwc.e(this, bundle));
                return;
            } else if (bundle == null) {
                super.startActivity(intent);
                return;
            } else {
                super.startActivity(intent, bundle);
                return;
            }
        }
        ((luc) a.a(hip.a).k("com/google/android/libraries/inputmethod/context/MultiDisplayContextWrapper", "startActivity", 30, "MultiDisplayContextWrapper.java")).w("startActivity(): Intent parcel exceeds size limit, %s", intent.getAction());
    }
}
