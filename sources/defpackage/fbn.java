package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: fbn  reason: default package */
/* loaded from: classes.dex */
public final class fbn implements fet {
    private final /* synthetic */ int a;

    public fbn(int i) {
        this.a = i;
    }

    @Override // defpackage.fet
    public final fex a(Context context, ffd ffdVar) {
        if (this.a != 0) {
            if (b(context, ffdVar)) {
                return new fgf(context);
            }
            return null;
        }
        return new fbo();
    }

    @Override // defpackage.fet
    public final boolean b(Context context, ffd ffdVar) {
        if (this.a != 0) {
            int i = ffg.a;
            return irv.b();
        }
        try {
            return jck.b(new jaq(context), null);
        } catch (RuntimeException e) {
            ((ltd) ((ltd) ((ltd) jck.a.d()).i(e)).k("com/google/android/libraries/inputmethod/voice/utils/SystemVoiceImeLauncher", "isVoiceImeAvailable", 'G', "SystemVoiceImeLauncher.java")).t("Failed to gather VoiceImeInfo");
            return false;
        }
    }
}
