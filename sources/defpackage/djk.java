package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: djk  reason: default package */
/* loaded from: classes.dex */
public final class djk implements djf {
    private final ArrayList a = lre.A();
    private final ArrayList b = lre.A();

    @Override // defpackage.djf
    public final CharSequence a() {
        return this.a.isEmpty() ? "" : ((djf) this.a.get(0)).a();
    }

    @Override // defpackage.djf
    public final void c(dje djeVar) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            if ((((Integer) this.b.get(i)).intValue() & 2) != 0) {
                ((djf) this.a.get(i)).c(djeVar);
            }
        }
    }

    @Override // defpackage.djf
    public final void d() {
        this.b.clear();
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((djf) arrayList.get(i)).d();
        }
    }

    @Override // defpackage.djf
    public final void g() {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            if ((((Integer) this.b.get(i)).intValue() & 6) != 0) {
                ((djf) this.a.get(i)).g();
            }
        }
    }

    public final void h(djf djfVar) {
        if (!this.a.contains(djfVar)) {
            this.a.add(djfVar);
        }
    }

    @Override // defpackage.djf
    public final int m(int i, boolean z) {
        this.b.clear();
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            int m = ((djf) arrayList.get(i3)).m(i, z);
            this.b.add(Integer.valueOf(m));
            i2 |= m;
        }
        return i2;
    }

    @Override // defpackage.djf
    public final void n(djc djcVar) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            if ((((Integer) this.b.get(i)).intValue() & 4) != 0) {
                ((djf) this.a.get(i)).n(djcVar);
            }
        }
    }

    @Override // defpackage.djf
    public final void o(djd djdVar) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            if ((((Integer) this.b.get(i)).intValue() & 1) != 0) {
                ((djf) this.a.get(i)).o(djdVar);
            }
        }
    }
}
