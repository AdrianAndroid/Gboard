package defpackage;

import android.content.Context;
import android.os.Build;
import android.widget.PopupWindow;

/* compiled from: PG */
/* renamed from: lj  reason: default package */
/* loaded from: classes.dex */
public final class lj {
    public static void a(PopupWindow popupWindow, boolean z) {
        popupWindow.setTouchModal(z);
    }

    public static boolean b(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return xa.a(context);
        }
        return true;
    }
}
