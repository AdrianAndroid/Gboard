package defpackage;

/* compiled from: PG */
/* renamed from: rw  reason: default package */
/* loaded from: classes2.dex */
public final class rw extends sd {
    public int a = 0;
    public boolean b = true;
    public int c = 0;
    boolean d = false;

    public final int a() {
        int i = this.a;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x00f6, code lost:
        if (r6 != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x00fa, code lost:
        if (r7 != false) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0197  */
    @Override // defpackage.rz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(defpackage.rr r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 527
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rw.b(rr, boolean):void");
    }

    public final boolean c() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        boolean z = true;
        while (true) {
            i = this.as;
            if (i4 >= i) {
                break;
            }
            rz rzVar = this.ar[i4];
            if ((this.b || rzVar.d()) && ((((i2 = this.a) == 0 || i2 == 1) && !rzVar.e()) || (((i3 = this.a) == 2 || i3 == 3) && !rzVar.f()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int i5 = 0;
        boolean z2 = false;
        for (int i6 = 0; i6 < this.as; i6++) {
            rz rzVar2 = this.ar[i6];
            if (this.b || rzVar2.d()) {
                if (!z2) {
                    int i7 = this.a;
                    if (i7 == 0) {
                        i5 = rzVar2.K(2).a();
                    } else if (i7 == 1) {
                        i5 = rzVar2.K(4).a();
                    } else if (i7 == 2) {
                        i5 = rzVar2.K(3).a();
                    } else if (i7 == 3) {
                        i5 = rzVar2.K(5).a();
                    }
                }
                int i8 = this.a;
                if (i8 == 0) {
                    i5 = Math.min(i5, rzVar2.K(2).a());
                } else if (i8 == 1) {
                    i5 = Math.max(i5, rzVar2.K(4).a());
                } else if (i8 == 2) {
                    i5 = Math.min(i5, rzVar2.K(3).a());
                } else if (i8 == 3) {
                    i5 = Math.max(i5, rzVar2.K(5).a());
                }
                z2 = true;
            }
        }
        int i9 = i5 + this.c;
        int i10 = this.a;
        if (i10 == 0 || i10 == 1) {
            v(i9, i9);
        } else {
            w(i9, i9);
        }
        this.d = true;
        return true;
    }

    @Override // defpackage.rz
    public final boolean d() {
        return true;
    }

    @Override // defpackage.rz
    public final boolean e() {
        return this.d;
    }

    @Override // defpackage.rz
    public final boolean f() {
        return this.d;
    }

    @Override // defpackage.rz
    public final String toString() {
        String str = "[Barrier] " + this.ai + " {";
        for (int i = 0; i < this.as; i++) {
            rz rzVar = this.ar[i];
            if (i > 0) {
                str = str.concat(", ");
            }
            str = str.concat(String.valueOf(rzVar.ai));
        }
        return str.concat("}");
    }
}
