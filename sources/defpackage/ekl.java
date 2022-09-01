package defpackage;

import android.os.SystemClock;
import android.view.inputmethod.EditorInfo;

/* compiled from: PG */
/* renamed from: ekl  reason: default package */
/* loaded from: classes.dex */
final class ekl extends hst {
    final /* synthetic */ ekm a;

    public ekl(ekm ekmVar) {
        this.a = ekmVar;
    }

    @Override // defpackage.hst
    public final void b(EditorInfo editorInfo, EditorInfo editorInfo2, boolean z) {
        if (editorInfo2 == null) {
            ekm ekmVar = this.a;
            if (Math.abs(SystemClock.uptimeMillis() - ekmVar.f) <= ekm.b) {
                if (ham.i(editorInfo).equals(ham.i(ekmVar.d))) {
                    ekmVar.e.run();
                    ekmVar.b();
                    return;
                }
                ((ltd) ((ltd) ekm.a.d()).k("com/google/android/apps/inputmethod/libs/search/utils/FireOnceOnStartInputViewListener", "onStartInputView", 94, "FireOnceOnStartInputViewListener.java")).t("onStartInputView(): fingerprint does not match");
                return;
            }
            ekmVar.b();
        }
    }
}
