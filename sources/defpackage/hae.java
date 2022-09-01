package defpackage;

import android.view.inputmethod.EditorInfo;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: hae  reason: default package */
/* loaded from: classes.dex */
final class hae extends hst {
    final /* synthetic */ hag a;

    public hae(hag hagVar) {
        this.a = hagVar;
    }

    @Override // defpackage.hst
    public final void d() {
        this.a.c.h();
    }

    @Override // defpackage.hst
    public final void e(EditorInfo editorInfo, boolean z) {
        hag hagVar = this.a;
        Locale o = ham.o(editorInfo);
        if (o == null) {
            return;
        }
        hagVar.c.g(jav.d(o));
    }
}
