package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: die  reason: default package */
/* loaded from: classes.dex */
public abstract class die extends did {
    private final ArrayList a = lre.A();
    private final ArrayList b = lre.A();
    private final gvy c = new gvy(2);
    private final ArrayList g = lre.A();
    private final gvy h = new gvy(2);
    private boolean i = true;

    @Override // defpackage.djf
    public final CharSequence a() {
        StringBuilder sb = new StringBuilder();
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                int a = this.h.a(i);
                String h = h(this.c.a(a - 1), this.c.a(a));
                if (h != null) {
                    sb.append(h);
                }
            }
            sb.append((String) this.a.get(i));
        }
        return sb.toString();
    }

    @Override // defpackage.djf
    public final void c(dje djeVar) {
        this.b.add(k(djeVar.c));
        this.c.b(djeVar.d);
        this.g.add(djeVar.h);
    }

    @Override // defpackage.djf
    public final void d() {
        this.a.clear();
        this.b.clear();
        this.c.d();
        this.h.d();
        this.g.clear();
        this.i = true;
    }

    @Override // defpackage.djf
    public final void g() {
    }

    protected abstract String h(int i, int i2);

    public final dim l() {
        String obj = a().toString();
        ArrayList arrayList = this.b;
        String[] strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
        int[] e = this.c.e();
        ArrayList arrayList2 = this.g;
        return new dim(obj, strArr, e, (djj[]) arrayList2.toArray(new djj[arrayList2.size()]), this.i);
    }

    @Override // defpackage.djf
    public int m(int i, boolean z) {
        return i == 0 ? 3 : 0;
    }

    @Override // defpackage.djf
    public final void n(djc djcVar) {
    }

    @Override // defpackage.djf
    public final void o(djd djdVar) {
        this.a.add(j((String) djdVar.e));
        this.h.b(this.b.size());
        this.i = djdVar.d & this.i;
    }
}
