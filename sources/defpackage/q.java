package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: q  reason: default package */
/* loaded from: classes2.dex */
public class q extends l {
    public final ArrayList al = new ArrayList();

    public void D() {
        q();
        ArrayList arrayList = this.al;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            l lVar = (l) this.al.get(i);
            if (lVar instanceof q) {
                ((q) lVar).D();
            }
        }
    }

    public final void F(l lVar) {
        this.al.remove(lVar);
        lVar.r = null;
    }

    @Override // defpackage.l
    public void i() {
        this.al.clear();
        super.i();
    }

    @Override // defpackage.l
    public final void n(int i, int i2) {
        super.n(i, i2);
        int size = this.al.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((l) this.al.get(i3)).n(this.w + this.A, this.x + this.B);
        }
    }

    @Override // defpackage.l
    public final void q() {
        super.q();
        ArrayList arrayList = this.al;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            l lVar = (l) this.al.get(i);
            lVar.n(b(), c());
            if (!(lVar instanceof m)) {
                lVar.q();
            }
        }
    }

    @Override // defpackage.l
    public final void z(gkn gknVar) {
        super.z(gknVar);
        int size = this.al.size();
        for (int i = 0; i < size; i++) {
            ((l) this.al.get(i)).z(gknVar);
        }
    }
}
