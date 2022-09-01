package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: ss  reason: default package */
/* loaded from: classes2.dex */
public final class ss {
    static int a;
    public final int c;
    public int d;
    final ArrayList b = new ArrayList();
    ArrayList e = null;
    private int f = -1;

    public ss(int i) {
        int i2 = a;
        a = i2 + 1;
        this.c = i2;
        this.d = i;
    }

    public final int a(rr rrVar, int i) {
        int o;
        int o2;
        if (this.b.size() == 0) {
            return 0;
        }
        ArrayList arrayList = this.b;
        rz rzVar = ((rz) arrayList.get(0)).U;
        rrVar.k();
        rzVar.b(rrVar, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((rz) arrayList.get(i2)).b(rrVar, false);
        }
        if (i == 0) {
            sa saVar = (sa) rzVar;
            if (saVar.at > 0) {
                ir.e(saVar, rrVar, arrayList, 0);
            }
        }
        if (i == 1) {
            sa saVar2 = (sa) rzVar;
            if (saVar2.au > 0) {
                ir.e(saVar2, rrVar, arrayList, 1);
            }
        }
        try {
            rrVar.j();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.e = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.e.add(new ja((rz) arrayList.get(i3)));
        }
        if (i == 0) {
            sa saVar3 = (sa) rzVar;
            o = rr.o(saVar3.J);
            o2 = rr.o(saVar3.L);
            rrVar.k();
        } else {
            sa saVar4 = (sa) rzVar;
            o = rr.o(saVar4.K);
            o2 = rr.o(saVar4.M);
            rrVar.k();
        }
        return o2 - o;
    }

    public final void b(ArrayList arrayList) {
        int size = this.b.size();
        if (this.f != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                ss ssVar = (ss) arrayList.get(i);
                if (this.f == ssVar.c) {
                    c(this.d, ssVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final void c(int i, ss ssVar) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            rz rzVar = (rz) arrayList.get(i2);
            ssVar.d(rzVar);
            if (i != 0) {
                rzVar.ap = ssVar.c;
            } else {
                rzVar.ao = ssVar.c;
            }
        }
        this.f = ssVar.c;
    }

    public final boolean d(rz rzVar) {
        if (this.b.contains(rzVar)) {
            return false;
        }
        this.b.add(rzVar);
        return true;
    }

    public final String toString() {
        int i = this.d;
        String str = i == 0 ? "Horizontal" : i == 1 ? "Vertical" : "Both";
        String str2 = str + " [" + this.c + "] <";
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            str2 = str2 + " " + ((rz) arrayList.get(i2)).ai;
        }
        return str2.concat(" >");
    }
}
