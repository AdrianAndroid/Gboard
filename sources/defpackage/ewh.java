package defpackage;

import android.view.inputmethod.EditorInfo;

/* compiled from: PG */
/* renamed from: ewh  reason: default package */
/* loaded from: classes.dex */
final class ewh extends hst {
    final /* synthetic */ ewi a;

    public ewh(ewi ewiVar) {
        this.a = ewiVar;
    }

    @Override // defpackage.hst
    public final void d() {
        this.a.a();
    }

    @Override // defpackage.hst
    public final void e(EditorInfo editorInfo, boolean z) {
        if (!this.a.b.compareAndSet(false, true)) {
            return;
        }
        this.a.a.set(true);
    }
}
