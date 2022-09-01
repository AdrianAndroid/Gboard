package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;

/* compiled from: PG */
/* renamed from: fcq  reason: default package */
/* loaded from: classes.dex */
public final class fcq {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/voiceime/VoiceUiUtils");

    public static SoftKeyboardView a() {
        hsk b = hsx.b();
        if (b == null) {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/voiceime/VoiceUiUtils", "getKeyboardHeaderView", 33, "VoiceUiUtils.java")).t("Cannot show voice header view due to null InputMethodService");
            return null;
        }
        ViewGroup L = b.L(ice.HEADER);
        if (L == null) {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/voiceime/VoiceUiUtils", "getKeyboardHeaderView", 38, "VoiceUiUtils.java")).t("Cannot show voice header view due to null keyboardHeader");
            return null;
        } else if (L.getChildCount() == 0 || !(L.getChildAt(0) instanceof SoftKeyboardView)) {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/voiceime/VoiceUiUtils", "getKeyboardHeaderView", 43, "VoiceUiUtils.java")).t("Cannot show voice header view due to null SoftKeyboardView");
            return null;
        } else {
            return (SoftKeyboardView) L.getChildAt(0);
        }
    }

    public static View b(SoftKeyboardView softKeyboardView) {
        View d = softKeyboardView.d(R.id.f130700_resource_name_obfuscated_res_0x7f0b2201);
        if (d == null) {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/voiceime/VoiceUiUtils", "getVoiceStatusView", 25, "VoiceUiUtils.java")).t("Failed to inflate voice header view");
        }
        return d;
    }
}
