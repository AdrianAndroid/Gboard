package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: hy  reason: default package */
/* loaded from: classes.dex */
public final class hy {
    final opu e;
    private final xx f = new xy(30);
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public int c = 0;
    final aqq d = new aqq(this);

    public hy(opu opuVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        this.e = opuVar;
    }

    private final int m(int i, int i2) {
        int size = this.b.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            hx hxVar = (hx) this.b.get(size);
            int i3 = hxVar.a;
            if (i3 == 8) {
                int i4 = hxVar.b;
                int i5 = hxVar.d;
                int i6 = i4 < i5 ? i5 : i4;
                int i7 = i4 < i5 ? i4 : i5;
                if (i < i7 || i > i6) {
                    if (i < i4) {
                        if (i2 == 1) {
                            hxVar.b = i4 + 1;
                            hxVar.d = i5 + 1;
                        } else if (i2 == 2) {
                            hxVar.b = i4 - 1;
                            hxVar.d = i5 - 1;
                        }
                    }
                } else if (i7 == i4) {
                    if (i2 == 1) {
                        hxVar.d = i5 + 1;
                    } else if (i2 == 2) {
                        hxVar.d = i5 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        hxVar.b = i4 + 1;
                    } else if (i2 == 2) {
                        hxVar.b = i4 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = hxVar.b;
                if (i8 <= i) {
                    if (i3 == 1) {
                        i -= hxVar.d;
                    } else if (i3 == 2) {
                        i += hxVar.d;
                    }
                } else if (i2 == 1) {
                    hxVar.b = i8 + 1;
                } else if (i2 == 2) {
                    hxVar.b = i8 - 1;
                }
            }
        }
        int size2 = this.b.size();
        while (true) {
            size2--;
            if (size2 >= 0) {
                hx hxVar2 = (hx) this.b.get(size2);
                if (hxVar2.a == 8) {
                    int i9 = hxVar2.d;
                    if (i9 == hxVar2.b || i9 < 0) {
                        this.b.remove(size2);
                        h(hxVar2);
                    }
                } else if (hxVar2.d <= 0) {
                    this.b.remove(size2);
                    h(hxVar2);
                }
            } else {
                return i;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
        if (r9 == (r0 + 1)) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
        if (r9 == r0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void n(defpackage.hx r13) {
        /*
            r12 = this;
            int r0 = r13.a
            r1 = 1
            if (r0 == r1) goto L86
            r2 = 8
            if (r0 == r2) goto L86
            int r2 = r13.b
            int r0 = r12.m(r2, r0)
            int r2 = r13.b
            int r3 = r13.a
            r4 = 2
            r5 = 0
            r6 = 4
            if (r3 == r4) goto L34
            if (r3 != r6) goto L1c
            r3 = 1
            goto L35
        L1c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "op should be remove or update."
            r1.<init>(r2)
            r1.append(r13)
            java.lang.String r13 = java.lang.String.valueOf(r13)
            java.lang.String r13 = r2.concat(r13)
            r0.<init>(r13)
            throw r0
        L34:
            r3 = 0
        L35:
            r7 = 1
            r8 = 1
        L37:
            int r9 = r13.d
            if (r7 >= r9) goto L72
            int r9 = r13.b
            int r10 = r3 * r7
            int r9 = r9 + r10
            int r10 = r13.a
            int r9 = r12.m(r9, r10)
            int r10 = r13.a
            if (r10 == r4) goto L52
            if (r10 == r6) goto L4d
            goto L5c
        L4d:
            int r11 = r0 + 1
            if (r9 != r11) goto L56
            goto L54
        L52:
            if (r9 != r0) goto L56
        L54:
            r11 = 1
            goto L57
        L56:
            r11 = 0
        L57:
            if (r11 == 0) goto L5c
            int r8 = r8 + 1
            goto L6f
        L5c:
            java.lang.Object r11 = r13.c
            hx r0 = r12.c(r10, r0, r8, r11)
            r12.f(r0, r2)
            r12.h(r0)
            int r0 = r13.a
            if (r0 != r6) goto L6d
            int r2 = r2 + r8
        L6d:
            r0 = r9
            r8 = 1
        L6f:
            int r7 = r7 + 1
            goto L37
        L72:
            java.lang.Object r1 = r13.c
            r12.h(r13)
            if (r8 <= 0) goto L85
            int r13 = r13.a
            hx r13 = r12.c(r13, r0, r8, r1)
            r12.f(r13, r2)
            r12.h(r13)
        L85:
            return
        L86:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "should not dispatch add or move for pre layout"
            r13.<init>(r0)
            goto L8f
        L8e:
            throw r13
        L8f:
            goto L8e
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hy.n(hx):void");
    }

    private final void o(hx hxVar) {
        this.b.add(hxVar);
        int i = hxVar.a;
        if (i == 1) {
            this.e.y(hxVar.b, hxVar.d);
        } else if (i == 2) {
            opu opuVar = this.e;
            ((RecyclerView) opuVar.a).O(hxVar.b, hxVar.d, false);
            ((RecyclerView) opuVar.a).K = true;
        } else if (i == 4) {
            this.e.x(hxVar.b, hxVar.d, hxVar.c);
        } else if (i == 8) {
            this.e.z(hxVar.b, hxVar.d);
        } else {
            new StringBuilder("Unknown update op type for ").append(hxVar);
            throw new IllegalArgumentException("Unknown update op type for ".concat(String.valueOf(hxVar)));
        }
    }

    private final boolean p(int i) {
        int size = this.b.size();
        for (int i2 = 0; i2 < size; i2++) {
            hx hxVar = (hx) this.b.get(i2);
            int i3 = hxVar.a;
            if (i3 == 8) {
                if (b(hxVar.d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = hxVar.b;
                int i5 = hxVar.d + i4;
                while (i4 < i5) {
                    if (b(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a(int i) {
        return b(i, 0);
    }

    final int b(int i, int i2) {
        int size = this.b.size();
        while (i2 < size) {
            hx hxVar = (hx) this.b.get(i2);
            int i3 = hxVar.a;
            if (i3 == 8) {
                int i4 = hxVar.b;
                if (i4 == i) {
                    i = hxVar.d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (hxVar.d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = hxVar.b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = hxVar.d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += hxVar.d;
                }
            }
            i2++;
        }
        return i;
    }

    public final hx c(int i, int i2, int i3, Object obj) {
        hx hxVar = (hx) this.f.a();
        if (hxVar == null) {
            return new hx(i, i2, i3, obj);
        }
        hxVar.a = i;
        hxVar.b = i2;
        hxVar.d = i3;
        hxVar.c = obj;
        return hxVar;
    }

    public final void d() {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            this.e.w((hx) this.b.get(i));
        }
        i(this.b);
        this.c = 0;
    }

    public final void e() {
        d();
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            hx hxVar = (hx) this.a.get(i);
            int i2 = hxVar.a;
            if (i2 == 1) {
                this.e.w(hxVar);
                this.e.y(hxVar.b, hxVar.d);
            } else if (i2 == 2) {
                this.e.w(hxVar);
                this.e.A(hxVar.b, hxVar.d);
            } else if (i2 == 4) {
                this.e.w(hxVar);
                this.e.x(hxVar.b, hxVar.d, hxVar.c);
            } else if (i2 == 8) {
                this.e.w(hxVar);
                this.e.z(hxVar.b, hxVar.d);
            }
        }
        i(this.a);
        this.c = 0;
    }

    final void f(hx hxVar, int i) {
        this.e.w(hxVar);
        int i2 = hxVar.a;
        if (i2 == 2) {
            this.e.A(i, hxVar.d);
        } else if (i2 == 4) {
            this.e.x(i, hxVar.d, hxVar.c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0113 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g() {
        /*
            Method dump skipped, instructions count: 663
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hy.g():void");
    }

    public final void h(hx hxVar) {
        hxVar.c = null;
        this.f.b(hxVar);
    }

    final void i(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            h((hx) list.get(i));
        }
        list.clear();
    }

    public final void j() {
        i(this.a);
        i(this.b);
        this.c = 0;
    }

    public final boolean k(int i) {
        return (i & this.c) != 0;
    }

    public final boolean l() {
        return this.a.size() > 0;
    }
}
