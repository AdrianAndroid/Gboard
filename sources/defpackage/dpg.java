package defpackage;

import android.os.SystemClock;
import android.view.inputmethod.EditorInfo;

/* compiled from: PG */
/* renamed from: dpg  reason: default package */
/* loaded from: classes.dex */
final class dpg extends hst {
    final /* synthetic */ dpi a;

    public dpg(dpi dpiVar) {
        this.a = dpiVar;
    }

    @Override // defpackage.hst
    public final void b(EditorInfo editorInfo, EditorInfo editorInfo2, boolean z) {
        if (editorInfo2 == null) {
            dpi dpiVar = this.a;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            dpiVar.c();
            dpiVar.c.g(dpo.LSTM_EXTENSION_ON_START_INPUT_VIEW, SystemClock.elapsedRealtime() - elapsedRealtime);
        }
    }
}
