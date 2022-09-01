package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.view.inputmethod.EditorInfo;

/* compiled from: PG */
/* renamed from: ue  reason: default package */
/* loaded from: classes2.dex */
public final class ue {
    public static Intent a(Activity activity) {
        return activity.getParentActivityIntent();
    }

    public static boolean b(Activity activity, Intent intent) {
        return activity.navigateUpTo(intent);
    }

    public static boolean c(Activity activity, Intent intent) {
        return activity.shouldUpRecreateTask(intent);
    }

    public static void d(EditorInfo editorInfo, CharSequence charSequence) {
        editorInfo.setInitialSurroundingSubText(charSequence, 0);
    }
}
