package defpackage;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: hup  reason: default package */
/* loaded from: classes.dex */
public final class hup implements View.OnLayoutChangeListener {
    public huu a;
    final /* synthetic */ hus b;

    public hup(hus husVar) {
        this.b = husVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        huu huuVar;
        hus husVar = this.b;
        View view2 = husVar.i;
        if (view != view2 || view2 == null || (huuVar = this.a) == null) {
            return;
        }
        husVar.h(huuVar);
    }
}
