package defpackage;

import android.view.inputmethod.EditorInfo;

/* compiled from: PG */
/* renamed from: fgp  reason: default package */
/* loaded from: classes.dex */
final class fgp extends hst {
    final /* synthetic */ fgq a;

    public fgp(fgq fgqVar) {
        this.a = fgqVar;
    }

    @Override // defpackage.hst
    public final void e(EditorInfo editorInfo, boolean z) {
        fgq fgqVar = this.a;
        fgo fgoVar = fgqVar.a;
        if (fgoVar == null || !fgoVar.a()) {
            return;
        }
        fgqVar.c.e(dda.SPLIT_KEYBOARD_REQUESTED, Boolean.valueOf(fgqVar.g()));
    }
}
