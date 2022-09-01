package defpackage;

import android.view.View;

/* compiled from: PG */
/* renamed from: hes  reason: default package */
/* loaded from: classes.dex */
public final class hes extends hen {
    private final her i;

    public hes(her herVar, View view, heo heoVar, int i, boolean z, boolean z2) {
        super(herVar, view, heoVar, i, z, z2);
        this.i = herVar;
    }

    @Override // defpackage.hen
    public final void a() {
        super.a();
        this.i.a(true);
    }

    @Override // defpackage.hen
    public final void b() {
        super.b();
        this.i.a(false);
    }
}
