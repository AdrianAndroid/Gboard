package defpackage;

import android.content.Context;
import android.inputmethodservice.InputMethodService;
import android.os.IBinder;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodSubtype;

/* compiled from: PG */
/* renamed from: jck  reason: default package */
/* loaded from: classes.dex */
public final class jck {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/voice/utils/SystemVoiceImeLauncher");

    public static boolean a(Context context) {
        try {
            if (!(context instanceof InputMethodService)) {
                return false;
            }
            jaq jaqVar = new jaq(context);
            jyu jyuVar = new jyu();
            if (!b(jaqVar, jyuVar)) {
                return false;
            }
            Object obj = jyuVar.b;
            Object obj2 = jyuVar.a;
            IBinder a2 = jaqVar.a();
            if (a2 != null) {
                jaqVar.f((InputMethodInfo) obj, a2, (InputMethodSubtype) obj2);
                return true;
            }
            ((ltd) ((ltd) jaq.a.d()).k("com/google/android/libraries/inputmethod/utils/InputMethodManagerWrapper", "switchToSubtypeOfInputMethod", 534, "InputMethodManagerWrapper.java")).t("Binder token not found. Cannot switch subtype IME.");
            return true;
        } catch (RuntimeException e) {
            ((ltd) ((ltd) ((ltd) a.d()).i(e)).k("com/google/android/libraries/inputmethod/voice/utils/SystemVoiceImeLauncher", "launchVoiceIme", '5', "SystemVoiceImeLauncher.java")).t("Failed to launch VoiceIme");
            return false;
        }
    }

    public static boolean b(jaq jaqVar, jyu jyuVar) {
        for (InputMethodInfo inputMethodInfo : jaqVar.d()) {
            if (inputMethodInfo.getComponent().getPackageName().startsWith("com.google.android")) {
                for (InputMethodSubtype inputMethodSubtype : jaqVar.k(inputMethodInfo)) {
                    if ("voice".equals(inputMethodSubtype.getMode())) {
                        if (jyuVar == null) {
                            return true;
                        }
                        jyuVar.b = inputMethodInfo;
                        jyuVar.a = inputMethodSubtype;
                        return true;
                    }
                }
                continue;
            }
        }
        return false;
    }
}
