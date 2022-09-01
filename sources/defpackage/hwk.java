package defpackage;

import android.graphics.Rect;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* renamed from: hwk  reason: default package */
/* loaded from: classes.dex */
public final class hwk implements hvf {
    private static final ltg a = ltg.j("com/google/android/libraries/inputmethod/keyboardmode/OppoFreeformManagerWrapper");
    private final Object b;
    private final Method c;
    private final Method d;

    public hwk(Object obj, Method method, Method method2) {
        this.b = obj;
        this.c = method;
        this.d = method2;
    }

    @Override // defpackage.hvf
    public final void a(Rect rect) {
        try {
            this.d.invoke(this.b, rect);
        } catch (IllegalAccessException | InvocationTargetException e) {
            ((ltd) ((ltd) ((ltd) a.d()).i(e)).k("com/google/android/libraries/inputmethod/keyboardmode/OppoFreeformManagerWrapper", "getFreeformWindowBounds", 'I', "OppoFreeformManagerWrapper.java")).t("Error while calling getFreeformStackBounds");
        }
    }

    @Override // defpackage.hvf
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.hvf
    public final boolean c() {
        try {
            Object invoke = this.c.invoke(this.b, new Object[0]);
            if (invoke instanceof Boolean) {
                return ((Boolean) invoke).booleanValue();
            }
            ((ltd) ((ltd) a.d()).k("com/google/android/libraries/inputmethod/keyboardmode/OppoFreeformManagerWrapper", "isInFreeformMode", 62, "OppoFreeformManagerWrapper.java")).t("isInFreeformMode() did not return boolean");
            return false;
        } catch (IllegalAccessException | InvocationTargetException e) {
            ((ltd) ((ltd) ((ltd) a.d()).i(e)).k("com/google/android/libraries/inputmethod/keyboardmode/OppoFreeformManagerWrapper", "isInFreeformMode", '8', "OppoFreeformManagerWrapper.java")).t("Error while calling isInFreeformMode()");
            return false;
        }
    }
}
