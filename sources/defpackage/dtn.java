package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.inputmethod.EditorInfo;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: dtn  reason: default package */
/* loaded from: classes.dex */
final class dtn {
    private static final ltg b = ltg.j("com/google/android/apps/inputmethod/libs/nga/impl/input/DictationEventSender");
    public boolean a = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(Context context, EditorInfo editorInfo) {
        if (this.a) {
            a("com.google.android.apps.inputmethod.DICTATION_INACTIVE", context, editorInfo);
        }
        this.a = false;
    }

    public static void a(String str, Context context, EditorInfo editorInfo) {
        if (context == null) {
            ((ltd) ((ltd) b.d()).k("com/google/android/apps/inputmethod/libs/nga/impl/input/DictationEventSender", "maybePerformPrivateCommand", 56, "DictationEventSender.java")).G("cannot perform private command: context=%s, editorInfo=%s", null, editorInfo);
        } else if (!Arrays.asList(((String) dsu.o.c()).split(",")).contains(ham.m(editorInfo))) {
            ((ltd) ((ltd) b.b()).k("com/google/android/apps/inputmethod/libs/nga/impl/input/DictationEventSender", "maybePerformPrivateCommand", 61, "DictationEventSender.java")).w("won't send dictation event: package %s is not in the allowlist", ham.m(editorInfo));
        } else if (!ham.as(context, editorInfo)) {
            ((ltd) ((ltd) b.b()).k("com/google/android/apps/inputmethod/libs/nga/impl/input/DictationEventSender", "maybePerformPrivateCommand", 67, "DictationEventSender.java")).t("won't send dictation event: wasn't requested by the editor");
        } else {
            hsk b2 = hsx.b();
            if (b2 == null) {
                ((ltd) ((ltd) b.d()).k("com/google/android/apps/inputmethod/libs/nga/impl/input/DictationEventSender", "maybePerformPrivateCommand", 72, "DictationEventSender.java")).t("cannot perform private command: input method is null");
                return;
            }
            ((ltd) ((ltd) b.b()).k("com/google/android/apps/inputmethod/libs/nga/impl/input/DictationEventSender", "maybePerformPrivateCommand", 75, "DictationEventSender.java")).w("performing private command: %s", str);
            b2.Q().a(str, Bundle.EMPTY);
        }
    }
}
