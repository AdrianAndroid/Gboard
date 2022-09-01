package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: PG */
/* renamed from: zp  reason: default package */
/* loaded from: classes2.dex */
final class zp {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static WindowInsets a(View view, WindowInsets windowInsets) {
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static WindowInsets b(View view, WindowInsets windowInsets) {
        return view.onApplyWindowInsets(windowInsets);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(View view) {
        view.requestApplyInsets();
    }
}
