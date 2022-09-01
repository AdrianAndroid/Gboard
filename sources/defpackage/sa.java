package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/* compiled from: PG */
/* renamed from: sa  reason: default package */
/* loaded from: classes2.dex */
public final class sa extends sg {
    public int ar;
    public int as;
    public int b;
    public final fws aH = new fws(this);
    public final sk a = new sk(this);
    public sz aG = null;
    public boolean c = false;
    public final rr d = new rr();
    public int at = 0;
    public int au = 0;
    public rx[] av = new rx[4];
    public rx[] aw = new rx[4];
    public int ax = 257;
    public boolean ay = false;
    public boolean az = false;
    public WeakReference aA = null;
    public WeakReference aB = null;
    public WeakReference aC = null;
    public WeakReference aD = null;
    final HashSet aE = new HashSet();
    public final sh aF = new sh();

    public static void X(rz rzVar, sz szVar, sh shVar) {
        int i;
        int i2;
        if (szVar == null) {
            return;
        }
        if (rzVar.ah == 8 || (rzVar instanceof sc) || (rzVar instanceof rw)) {
            shVar.c = 0;
            shVar.d = 0;
            return;
        }
        shVar.i = rzVar.M();
        shVar.j = rzVar.N();
        shVar.a = rzVar.j();
        shVar.b = rzVar.h();
        shVar.g = false;
        shVar.h = 0;
        boolean z = shVar.i == 3;
        boolean z2 = shVar.j == 3;
        boolean z3 = z && rzVar.X > 0.0f;
        boolean z4 = z2 && rzVar.X > 0.0f;
        if (z && rzVar.F(0) && rzVar.s == 0 && !z3) {
            shVar.i = 2;
            if (z2 && rzVar.t == 0) {
                shVar.i = 1;
            }
            z = false;
        }
        if (z2 && rzVar.F(1) && rzVar.t == 0 && !z4) {
            shVar.j = 2;
            if (z && rzVar.s == 0) {
                shVar.j = 1;
            }
            z2 = false;
        }
        if (rzVar.e()) {
            shVar.i = 1;
            z = false;
        }
        if (rzVar.f()) {
            shVar.j = 1;
            z2 = false;
        }
        if (z3) {
            if (rzVar.u[0] == 4) {
                shVar.i = 1;
            } else if (!z2) {
                if (shVar.j == 1) {
                    i2 = shVar.b;
                } else {
                    shVar.i = 2;
                    szVar.a(rzVar, shVar);
                    i2 = shVar.d;
                }
                shVar.i = 1;
                shVar.a = (int) (rzVar.X * i2);
            }
        }
        if (z4) {
            if (rzVar.u[1] == 4) {
                shVar.j = 1;
            } else if (!z) {
                if (shVar.i == 1) {
                    i = shVar.a;
                } else {
                    shVar.j = 2;
                    szVar.a(rzVar, shVar);
                    i = shVar.c;
                }
                shVar.j = 1;
                if (rzVar.Y != -1) {
                    shVar.b = (int) (rzVar.X * i);
                } else {
                    shVar.b = (int) (i / rzVar.X);
                }
            }
        }
        szVar.a(rzVar, shVar);
        rzVar.C(shVar.c);
        rzVar.x(shVar.d);
        rzVar.F = shVar.f;
        rzVar.u(shVar.e);
        shVar.h = 0;
        boolean z5 = shVar.g;
    }

    private final void Z(ry ryVar, ru ruVar) {
        this.d.g(ruVar, this.d.b(ryVar), 0, 5);
    }

    private final void aa(ry ryVar, ru ruVar) {
        this.d.g(this.d.b(ryVar), ruVar, 0, 5);
    }

    private final void ab() {
        this.at = 0;
        this.au = 0;
    }

    @Override // defpackage.rz
    public final void D(boolean z, boolean z2) {
        super.D(z, z2);
        int size = this.aI.size();
        for (int i = 0; i < size; i++) {
            ((rz) this.aI.get(i)).D(z, z2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:185:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0626 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0634  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0646  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0660  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0934  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0955 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0963 A[LOOP:14: B:242:0x0961->B:243:0x0963, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x09ca  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x09eb  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x09fa  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0a38  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0a3a  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0a33  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x09f6  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x09d8  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x0a49  */
    /* JADX WARN: Removed duplicated region for block: B:678:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:697:0x05b1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:700:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:706:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:713:0x05f4  */
    /* JADX WARN: Removed duplicated region for block: B:715:0x05d3  */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v12 */
    @Override // defpackage.sg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void T() {
        /*
            Method dump skipped, instructions count: 2649
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sa.T():void");
    }

    public final void U(int i) {
        this.ax = i;
        rr.a = W(512);
    }

    public final boolean V(boolean z, int i) {
        boolean z2;
        boolean z3;
        sk skVar = this.a;
        boolean z4 = false;
        int L = skVar.a.L(0);
        int L2 = skVar.a.L(1);
        sa saVar = skVar.a;
        int k = saVar.k();
        int l = saVar.l();
        if (z) {
            if (L != 2) {
                if (L2 == 2) {
                    L2 = 2;
                }
            }
            ArrayList arrayList = skVar.e;
            int size = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    z3 = true;
                    break;
                }
                st stVar = (st) arrayList.get(i2);
                if (stVar.f == i && !stVar.e()) {
                    z3 = false;
                    break;
                }
                i2++;
            }
            if (i == 0) {
                if (z3 && L == 2) {
                    skVar.a.P(1);
                    sa saVar2 = skVar.a;
                    saVar2.C(skVar.a(saVar2, 0));
                    sa saVar3 = skVar.a;
                    saVar3.h.e.c(saVar3.j());
                }
            } else if (z3 && L2 == 2) {
                skVar.a.Q(1);
                sa saVar4 = skVar.a;
                saVar4.x(skVar.a(saVar4, 1));
                sa saVar5 = skVar.a;
                saVar5.i.e.c(saVar5.h());
            }
        }
        if (i == 0) {
            sa saVar6 = skVar.a;
            int i3 = saVar6.aq[0];
            if (i3 == 1 || i3 == 4) {
                int j = saVar6.j() + k;
                saVar6.h.i.c(j);
                skVar.a.h.e.c(j - k);
                z2 = true;
            }
            z2 = false;
        } else {
            sa saVar7 = skVar.a;
            int i4 = saVar7.aq[1];
            if (i4 == 1 || i4 == 4) {
                int h = saVar7.h() + l;
                saVar7.i.i.c(h);
                skVar.a.i.e.c(h - l);
                z2 = true;
            }
            z2 = false;
        }
        skVar.c();
        ArrayList arrayList2 = skVar.e;
        int size2 = arrayList2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            st stVar2 = (st) arrayList2.get(i5);
            if (stVar2.f == i && (stVar2.d != skVar.a || stVar2.g)) {
                stVar2.c();
            }
        }
        ArrayList arrayList3 = skVar.e;
        int size3 = arrayList3.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size3) {
                z4 = true;
                break;
            }
            st stVar3 = (st) arrayList3.get(i6);
            if (stVar3.f == i && ((z2 || stVar3.d != skVar.a) && (!stVar3.h.i || !stVar3.i.i || (!(stVar3 instanceof si) && !stVar3.e.i)))) {
                break;
            }
            i6++;
        }
        skVar.a.P(L);
        skVar.a.Q(L2);
        return z4;
    }

    public final boolean W(int i) {
        return (this.ax & i) == i;
    }

    public final void c() {
        this.a.b = true;
    }

    @Override // defpackage.sg, defpackage.rz
    public final void s() {
        this.d.k();
        this.ar = 0;
        this.as = 0;
        super.s();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(rz rzVar, int i) {
        if (i != 0) {
            int i2 = this.au;
            rx[] rxVarArr = this.av;
            int length = rxVarArr.length;
            if (i2 + 1 >= length) {
                this.av = (rx[]) Arrays.copyOf(rxVarArr, length + length);
            }
            rx[] rxVarArr2 = this.av;
            int i3 = this.au;
            rxVarArr2[i3] = new rx(rzVar, 1, this.c);
            this.au = i3 + 1;
            return;
        }
        int i4 = this.at;
        rx[] rxVarArr3 = this.aw;
        int length2 = rxVarArr3.length;
        if (i4 + 1 >= length2) {
            this.aw = (rx[]) Arrays.copyOf(rxVarArr3, length2 + length2);
        }
        rx[] rxVarArr4 = this.aw;
        int i5 = this.at;
        rxVarArr4[i5] = new rx(rzVar, 0, this.c);
        this.at = i5 + 1;
    }
}
