package defpackage;

import android.view.inputmethod.EditorInfo;

/* compiled from: PG */
/* renamed from: dly  reason: default package */
/* loaded from: classes.dex */
final class dly extends hst {
    final /* synthetic */ dma a;

    public dly(dma dmaVar) {
        this.a = dmaVar;
    }

    @Override // defpackage.hst
    public final void a() {
        this.a.c = null;
    }

    @Override // defpackage.hst
    public final void b(EditorInfo editorInfo, EditorInfo editorInfo2, boolean z) {
        if (editorInfo2 == null) {
            this.a.c = editorInfo;
        }
    }
}
