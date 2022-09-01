package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: ffh  reason: default package */
/* loaded from: classes.dex */
public final class ffh {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/voiceime/extension/CurrentMicStatusHolder");
    public final Context b;
    public long c;

    public ffh(Context context) {
        this.b = context;
    }

    public static void b(mey meyVar) {
        ieh.j().e(fbm.VOICE_MIC_STATUS_ON_START_INPUTVIEW, meyVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String a() {
        mey b;
        String str;
        mey[] meyVarArr = {mey.HIDDEN_VOICE_INPUT_UNAVAILABLE, mey.HIDDEN_SETTING_OFF, mey.HIDDEN_INCOGNITO_MODE, mey.HIDDEN_EDITOR_NO_MIC_IME_OPTION, mey.HIDDEN_EMAIL_INPUT_TYPE, mey.HIDDEN_PASSWORD_NUMBER_DATE_INPUT_TYPE, mey.HIDDEN_INTERNAL_FIELD, mey.AVAILABLE};
        StringBuilder sb = new StringBuilder("{");
        for (int i = 0; i < 8; i++) {
            int i2 = meyVarArr[i].j;
            if ((this.c & (1 << i2)) != 0 && (b = mey.b(i2)) != null) {
                switch (b.ordinal()) {
                    case 1:
                        str = "MicIconAvailable";
                        break;
                    case 2:
                        str = "MicIconHidden-IncognitoMode";
                        break;
                    case 3:
                        str = "MicIconHidden-EditorNoMicPrivateImeOption";
                        break;
                    case 4:
                        str = "MicIconHidden-VoiceInputUnAvailable";
                        break;
                    case 5:
                        str = "MicIconHidden-SettingOff";
                        break;
                    case 6:
                        str = "MicIconHidden-EmailInputType";
                        break;
                    case 7:
                        str = "MicIconHidden-PasswordOrNumberOrDateInputType";
                        break;
                    case 8:
                        str = "MicIconHidden-InternalField";
                        break;
                    default:
                        str = "Unknown";
                        break;
                }
                sb.append(str);
                sb.append(",");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public final void c(mey meyVar) {
        this.c |= 1 << meyVar.j;
    }
}
