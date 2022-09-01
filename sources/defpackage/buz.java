package defpackage;

import android.graphics.Canvas;
import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* renamed from: buz  reason: default package */
/* loaded from: classes.dex */
public final class buz extends or {
    final /* synthetic */ bvf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public buz(bvf bvfVar) {
        super(0, 48);
        this.a = bvfVar;
    }

    @Override // defpackage.or, defpackage.on
    public final int d(RecyclerView recyclerView, mo moVar) {
        return moVar instanceof bve ? f(0, 0) : super.d(recyclerView, moVar);
    }

    @Override // defpackage.on
    public final void h(Canvas canvas, RecyclerView recyclerView, mo moVar, float f, float f2, int i, boolean z) {
        super.h(canvas, recyclerView, moVar, f, f2, i, z);
        moVar.a.setAlpha(Math.max(0.1f, 1.0f - (Math.abs(f) / moVar.a.getWidth())));
    }

    @Override // defpackage.on
    public final boolean k() {
        return !this.a.t;
    }

    @Override // defpackage.on
    public final boolean l() {
        return false;
    }

    @Override // defpackage.on
    public final boolean m(RecyclerView recyclerView, mo moVar, mo moVar2) {
        return false;
    }

    @Override // defpackage.on
    public final void o(mo moVar) {
        int b = moVar.b();
        this.a.n.e((buk) this.a.p.get(b), b);
    }
}
