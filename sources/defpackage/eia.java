package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* renamed from: eia  reason: default package */
/* loaded from: classes.dex */
public final class eia extends on {
    private final his a;

    public eia(his hisVar) {
        this.a = hisVar;
    }

    @Override // defpackage.on
    public final int d(RecyclerView recyclerView, mo moVar) {
        return f(3, 0);
    }

    @Override // defpackage.on
    public final boolean k() {
        return false;
    }

    @Override // defpackage.on
    public final boolean m(RecyclerView recyclerView, mo moVar, mo moVar2) {
        this.a.a(Integer.valueOf(moVar.b()), Integer.valueOf(moVar2.b()));
        return true;
    }

    @Override // defpackage.on
    public final void o(mo moVar) {
    }
}
