package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.inputmethod.latin.R;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: ffg  reason: default package */
/* loaded from: classes.dex */
public final class ffg {
    public static final /* synthetic */ int a = 0;
    private static final ltg b = ltg.j("com/google/android/apps/inputmethod/libs/voiceime/base/VoiceUtils");
    private static final lfy c = lfy.c(',').h().b();

    public static void a(Context context) {
        Intent intent = new Intent("com.google.android.googlequicksearchbox.action.VOICE_IME_SETTINGS");
        intent.addFlags(335544320);
        context.startActivity(intent);
    }

    public static boolean b(Context context) {
        return context.getPackageManager().resolveActivity(new Intent("com.google.android.googlequicksearchbox.action.VOICE_IME_SETTINGS"), 65536) != null;
    }

    public static boolean c(ino inoVar) {
        if (!((Boolean) ffa.i.c()).booleanValue()) {
            return false;
        }
        if (inoVar.aj(R.string.f160930_resource_name_obfuscated_res_0x7f14067d)) {
            return true;
        }
        ArrayList A = lre.A();
        String str = (String) ffa.a.c();
        for (String str2 : c.i(str)) {
            if (str2.isEmpty()) {
                ((ltd) ((ltd) b.d()).k("com/google/android/apps/inputmethod/libs/voiceime/base/VoiceUtils", "getSupportedLanguageTags", 120, "VoiceUtils.java")).G("getSupportedLanguageTags() : Empty CSV token '%s' in [%s]", str2, str);
            } else {
                try {
                    jav f = jav.f(str2);
                    if (A.contains(f)) {
                        ((ltd) ((ltd) b.d()).k("com/google/android/apps/inputmethod/libs/voiceime/base/VoiceUtils", "getSupportedLanguageTags", 128, "VoiceUtils.java")).G("getSupportedLanguageTags() : Duplicate language tag '%s' in [%s]", f, str);
                    } else {
                        A.add(f);
                    }
                } catch (IllegalArgumentException e) {
                    ((ltd) ((ltd) ((ltd) b.d()).i(e)).k("com/google/android/apps/inputmethod/libs/voiceime/base/VoiceUtils", "getSupportedLanguageTags", 135, "VoiceUtils.java")).G("getSupportedLanguageTags() : Invalid CSV token '%s' in [%s]", str2, str);
                }
            }
        }
        llp b2 = hqr.b();
        int size = b2.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (A.contains(((hqt) b2.get(i)).h())) {
                return true;
            }
            i = i2;
        }
        return false;
    }
}
