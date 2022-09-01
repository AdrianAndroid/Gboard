package defpackage;

import android.view.inputmethod.EditorInfo;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: iwo  reason: default package */
/* loaded from: classes.dex */
public final class iwo extends hst {
    public final /* synthetic */ iwq a;

    public iwo(iwq iwqVar) {
        this.a = iwqVar;
    }

    @Override // defpackage.hst
    public final void a() {
        mko mkoVar = this.a.d;
        if (mkoVar != null) {
            mkoVar.cancel(false);
        }
        this.a.d = kcu.M(new clc(this, 6), 10L, TimeUnit.SECONDS, this.a.c);
        iwq iwqVar = this.a;
        kcu.U(iwqVar.d, new ivq(9), iwqVar.c);
    }

    @Override // defpackage.hst
    public final void b(EditorInfo editorInfo, EditorInfo editorInfo2, boolean z) {
        mko mkoVar = this.a.d;
        if (mkoVar != null) {
            mkoVar.cancel(false);
        }
    }
}
