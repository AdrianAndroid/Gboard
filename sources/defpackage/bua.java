package defpackage;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* compiled from: PG */
/* renamed from: bua  reason: default package */
/* loaded from: classes.dex */
final class bua implements hpu {
    final /* synthetic */ hpu a;
    final /* synthetic */ bud b;

    public bua(bud budVar, hpu hpuVar) {
        this.b = budVar;
        this.a = hpuVar;
    }

    @Override // defpackage.hpu
    public final EditorInfo a() {
        return this.a.a();
    }

    @Override // defpackage.hpu
    public final InputConnection b() {
        return this.a.b();
    }

    @Override // defpackage.hpu
    public final void c(hpt hptVar) {
        this.a.c(hptVar);
    }

    @Override // defpackage.hpu
    public final void d() {
        this.a.d();
        bud budVar = this.b;
        if (budVar.j()) {
            budVar.f(false);
        }
    }
}
