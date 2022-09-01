package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* compiled from: PG */
/* renamed from: lm  reason: default package */
/* loaded from: classes.dex */
public final class lm extends lg implements lh {
    public static Method a;
    public lh b;

    static {
        try {
            if (Build.VERSION.SDK_INT > 28) {
                return;
            }
            a = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public lm(Context context, int i) {
        super(context, null, i, null);
    }

    @Override // defpackage.lg
    public final kk p(Context context, boolean z) {
        ll llVar = new ll(context, z);
        llVar.e = this;
        return llVar;
    }
}
