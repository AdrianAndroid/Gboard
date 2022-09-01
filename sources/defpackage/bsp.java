package defpackage;

import android.view.inputmethod.EditorInfo;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bsp  reason: default package */
/* loaded from: classes.dex */
public final class bsp extends hst {
    final /* synthetic */ bsr a;

    public bsp(bsr bsrVar) {
        this.a = bsrVar;
    }

    @Override // defpackage.hst
    public final void a() {
        bsr bsrVar = this.a;
        bsrVar.a = 0L;
        bsrVar.b = null;
        bsrVar.c = false;
    }

    @Override // defpackage.hst
    public final void b(EditorInfo editorInfo, EditorInfo editorInfo2, boolean z) {
        bsr bsrVar = this.a;
        if (editorInfo2 != null) {
            editorInfo = editorInfo2;
        }
        bsrVar.b = editorInfo;
        bsrVar.c = z;
        bsrVar.d();
    }
}
