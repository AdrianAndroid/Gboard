package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* renamed from: dax  reason: default package */
/* loaded from: classes.dex */
public final class dax {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/expression/utils/IntentHelper");

    public static boolean a(Context context, Intent intent) {
        try {
            intent.addFlags(268435456);
            context.startActivity(intent);
            hsk b = hsx.b();
            if (b == null) {
                return true;
            }
            b.az();
            return true;
        } catch (ActivityNotFoundException | SecurityException e) {
            ((ltd) ((ltd) ((ltd) a.c()).i(e)).k("com/google/android/apps/inputmethod/libs/expression/utils/IntentHelper", "fireIntent", 28, "IntentHelper.java")).w("Failed to fire intent: %s", intent);
            return false;
        }
    }
}
