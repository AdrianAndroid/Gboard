package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* renamed from: eiq  reason: default package */
/* loaded from: classes.dex */
final class eiq extends on {
    private final his a;

    public eiq(his hisVar) {
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
        ls lsVar = recyclerView.l;
        if (lsVar != null) {
            lsVar.hj(moVar.b(), moVar2.b());
            return true;
        }
        return true;
    }

    @Override // defpackage.on
    public final void o(mo moVar) {
    }
}
