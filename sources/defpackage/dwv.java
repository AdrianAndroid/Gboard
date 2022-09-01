package defpackage;

import android.content.Context;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: dwv  reason: default package */
/* loaded from: classes.dex */
public final class dwv {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/nga/languagepicker/NgaLanguagePickerActionHandler");
    public static final iay b = new iay(-10042, null, "auto start voice");
    private static final iay d = new iay(-10066, null, "");
    private static volatile dwv e;
    public dwu c;

    private dwv() {
    }

    public static dwv a() {
        dwv dwvVar = e;
        if (dwvVar == null) {
            synchronized (dwv.class) {
                dwvVar = e;
                if (dwvVar == null) {
                    dwvVar = new dwv();
                    e = dwvVar;
                }
            }
        }
        return dwvVar;
    }

    public static void c() {
        hsk b2 = hsx.b();
        if (b2 == null) {
            ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/nga/languagepicker/NgaLanguagePickerActionHandler", "sendStopVoiceEvent", 152, "NgaLanguagePickerActionHandler.java")).t("Service is null and could not be acquired.");
        } else {
            b2.at(hfd.d(d));
        }
    }

    public static void d(Context context, boolean z) {
        ino.M(context).q(R.string.f161150_resource_name_obfuscated_res_0x7f140693, z);
    }

    public final void b(hqt hqtVar, fgt fgtVar) {
        ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/nga/languagepicker/NgaLanguagePickerActionHandler", "restartNgaOrVoiceImeDictationAfterLanguageChanged", 132, "NgaLanguagePickerActionHandler.java")).u("Scheduling dictation restart in %d ms.", 100);
        kki.i(new bue(this, fgtVar, hqtVar, 16), 100L);
    }
}
