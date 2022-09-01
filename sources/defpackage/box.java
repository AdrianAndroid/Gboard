package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.view.inputmethod.InputMethodInfo;

/* compiled from: PG */
/* renamed from: box  reason: default package */
/* loaded from: classes.dex */
public final class box implements hqu {
    private final jaq a;
    private final Context b;

    public box(Context context, jaq jaqVar) {
        this.b = context;
        this.a = jaqVar;
    }

    private final boolean c() {
        return gqa.a(this.b).g;
    }

    @Override // defpackage.hqu
    public final boolean a(IBinder iBinder) {
        if (c()) {
            return this.a.i("com.google.android.marvin.talkback");
        }
        return false;
    }

    @Override // defpackage.hqu
    public final boolean b(IBinder iBinder) {
        InputMethodInfo c;
        if (iBinder != null && c() && (c = this.a.c("com.google.android.marvin.talkback")) != null) {
            jaq jaqVar = this.a;
            if (!jaqVar.d().contains(c)) {
                ((ltd) ((ltd) jaq.a.d()).k("com/google/android/libraries/inputmethod/utils/InputMethodManagerWrapper", "switchToInputMethod", 562, "InputMethodManagerWrapper.java")).w("Switch input method failed: The input method(%s) is not enabled", c.getPackageName());
            } else {
                jaqVar.c.setInputMethod(iBinder, c.getId());
                return true;
            }
        }
        return false;
    }
}
