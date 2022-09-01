package defpackage;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: hvu  reason: default package */
/* loaded from: classes.dex */
public final class hvu implements View.OnLayoutChangeListener {
    final /* synthetic */ hvx a;
    private int b;
    private int c;

    public hvu(hvx hvxVar) {
        this.a = hvxVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int e;
        hvx hvxVar = this.a;
        if (hvxVar.o == null || hvxVar.g == null || hvxVar.f == null || hvxVar.h == null) {
            return;
        }
        hvxVar.p();
        hvx hvxVar2 = this.a;
        if (hvxVar2.u != null && (e = hvxVar2.e() - this.a.f()) != this.b) {
            this.b = e;
            hvx hvxVar3 = this.a;
            hvxVar3.o.post(hvxVar3.d);
        }
        int i9 = this.c;
        int height = this.a.o.getHeight();
        this.c = height;
        if ((i9 != 0 && i8 - i6 != 0) || height <= 0) {
            return;
        }
        this.a.l();
        this.a.k();
        hvx hvxVar4 = this.a;
        hvxVar4.o.post(hvxVar4.d);
    }
}
