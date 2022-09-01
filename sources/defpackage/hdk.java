package defpackage;

import android.os.SystemClock;
import android.view.inputmethod.EditorInfo;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: hdk  reason: default package */
/* loaded from: classes.dex */
public final class hdk extends us {
    final /* synthetic */ hdn a;

    public hdk(hdn hdnVar) {
        this.a = hdnVar;
    }

    @Override // defpackage.us
    public final void d() {
        ieh.j().e(hdo.a, 0);
        synchronized (this.a.f) {
            for (hdm hdmVar : this.a.f) {
                hdmVar.hy();
            }
        }
        if (this.a.g > 0) {
            ieh.j().g(hdr.a, SystemClock.elapsedRealtime() - this.a.g);
            this.a.g = 0L;
        }
        hdn hdnVar = this.a;
        EditorInfo editorInfo = hdnVar.i;
        if (editorInfo != null) {
            hdnVar.e(editorInfo);
        }
    }

    @Override // defpackage.us
    public final void e() {
        ieh j = ieh.j();
        hdo hdoVar = hdo.a;
        lug lugVar = hdn.a;
        j.e(hdoVar, 1);
        synchronized (this.a.f) {
            for (hdm hdmVar : this.a.f) {
                hdmVar.c();
            }
        }
        this.a.g = 0L;
        ((luc) ((luc) hdn.a.c()).k("com/google/android/libraries/inputmethod/emoji/renderer/EmojiCompatManager$1", "onFailed", 243, "EmojiCompatManager.java")).t("EmojiCompat failed its initialization");
    }
}
