package defpackage;

import android.os.SystemClock;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ibs  reason: default package */
/* loaded from: classes.dex */
public final class ibs implements mka {
    final /* synthetic */ long a;
    final /* synthetic */ ibt b;

    public ibs(ibt ibtVar, long j) {
        this.b = ibtVar;
        this.a = j;
    }

    @Override // defpackage.mka
    public final void a(Throwable th) {
        if (!this.b.b()) {
            ((ltd) ((ltd) ibu.a.a(hip.a).i(th)).k("com/google/android/libraries/inputmethod/metadata/KeyboardDefManager$LoadKeyboardDefTask$1", "onFailure", 188, "KeyboardDefManager.java")).t("Failed to load keyboard.");
        } else {
            ((ltd) ((ltd) ((ltd) ibu.a.b()).i(th)).k("com/google/android/libraries/inputmethod/metadata/KeyboardDefManager$LoadKeyboardDefTask$1", "onFailure", (char) 190, "KeyboardDefManager.java")).t("Task to load keyboard def was canceled.");
        }
        this.b.a(null);
    }

    @Override // defpackage.mka
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ieh.j().g(ich.REQUEST_KEYBOARD_DEF, SystemClock.elapsedRealtime() - this.a);
        ltg ltgVar = ibu.a;
        this.b.a((ibm) obj);
    }
}
