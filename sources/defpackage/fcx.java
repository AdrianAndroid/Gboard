package defpackage;

import android.content.Context;
import android.util.Printer;

/* compiled from: PG */
/* renamed from: fcx  reason: default package */
/* loaded from: classes.dex */
public final class fcx implements fcy {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/voiceime/backend/aiai/AiAiRecognizerModule");

    @Override // defpackage.gzv
    public final /* synthetic */ void dump(Printer printer, boolean z) {
    }

    @Override // defpackage.gzv
    public final /* synthetic */ String getDumpableTag() {
        return hqs.i(this);
    }

    @Override // defpackage.ifw
    public final void gm(Context context, igg iggVar) {
        ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/aiai/AiAiRecognizerModule", "onCreate", 14, "AiAiRecognizerModule.java")).t("onCreate()");
        fao.f(new fcs());
    }

    @Override // defpackage.ifw
    public final void gn() {
        ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/aiai/AiAiRecognizerModule", "onDestroy", 21, "AiAiRecognizerModule.java")).t("onDestroy()");
        fao.f(null);
    }
}
