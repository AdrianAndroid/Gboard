package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: iaj  reason: default package */
/* loaded from: classes.dex */
public final class iaj implements ias {
    public static final jfx a = new iai();
    public iah b;
    public iay[] c = iay.b;
    public String[] d = gvw.g;
    public int[] e = gvw.b;
    public boolean f = false;
    public boolean g = false;
    public int h = 0;
    public boolean i = false;
    public boolean j = true;
    public int k = 0;
    public int l = -1;
    public String m = null;
    public lfy n;

    public static Object d(Object[] objArr, int i, Object obj) {
        int length = objArr.length;
        if (length == 0) {
            return obj;
        }
        if (length == 1) {
            return objArr[0];
        }
        return objArr[i];
    }

    public static boolean e(int[] iArr, int[] iArr2) {
        if (iArr == null && iArr2 == null) {
            return true;
        }
        return iArr != null && iArr2 != null && iArr.length == 1 && iArr2.length == 1 && Arrays.equals(iArr, iArr2);
    }

    public static boolean f(Object[] objArr, Object[] objArr2) {
        if (objArr == null && objArr2 == null) {
            return true;
        }
        return objArr != null && objArr2 != null && objArr.length == 1 && objArr2.length == 1 && Arrays.equals(objArr, objArr2);
    }

    public static Object[] g(Object[] objArr, Object[] objArr2, Object[] objArr3, int i, int i2) {
        Object obj = null;
        Object obj2 = objArr2.length == 0 ? null : objArr2[0];
        if (i > 0) {
            q(objArr, 0, i, objArr2, 0, obj2);
        }
        int length = objArr.length;
        if (i2 < length) {
            q(objArr, i2, length - i2, objArr2, i, obj2);
        }
        if (objArr3.length != 0) {
            obj = objArr3[0];
        }
        q(objArr, i, i2 - i, objArr3, 0, obj);
        return objArr;
    }

    public static void j(int[] iArr, int[] iArr2, int[] iArr3, int i, int i2) {
        int i3 = iArr2.length == 0 ? 0 : iArr2[0];
        if (i > 0) {
            p(iArr, 0, i, iArr2, 0, i3);
        }
        int length = iArr.length;
        if (i2 < length) {
            p(iArr, i2, length - i2, iArr2, i, i3);
        }
        p(iArr, i, i2 - i, iArr3, 0, iArr3.length == 0 ? 0 : iArr3[0]);
    }

    private static void p(int[] iArr, int i, int i2, int[] iArr2, int i3, int i4) {
        int length = iArr2.length;
        int i5 = 0;
        if (length != 0) {
            i5 = Math.max(0, Math.min(i2, length - i3));
        }
        if (i5 > 0) {
            System.arraycopy(iArr2, i3, iArr, i, i5);
        }
        if (i5 < i2) {
            Arrays.fill(iArr, i5 + i, i + i2, i4);
        }
    }

    private static void q(Object[] objArr, int i, int i2, Object[] objArr2, int i3, Object obj) {
        int length = objArr2.length;
        int i4 = 0;
        if (length != 0) {
            i4 = Math.max(0, Math.min(i2, length - i3));
        }
        if (i4 > 0) {
            System.arraycopy(objArr2, i3, objArr, i, i4);
        }
        if (i4 < i2) {
            Arrays.fill(objArr, i4 + i, i + i2, obj);
        }
    }

    public final int a() {
        return this.c.length;
    }

    public final ial b() {
        if (this.b == null || this.c.length <= 0) {
            return null;
        }
        int a2 = a();
        for (int i = 0; i < a2; i++) {
            iay iayVar = this.c[i];
            if (iayVar == null) {
                return null;
            }
            if (iaz.i(iayVar.c) && iayVar.e == null) {
                return null;
            }
        }
        return new ial(this);
    }

    @Override // defpackage.iar
    public final /* bridge */ /* synthetic */ Object c() {
        throw null;
    }

    public final void h(ial ialVar) {
        i(ialVar);
        int length = ialVar.d.length;
        this.c = new iay[length];
        for (int i = 0; i < length; i++) {
            iay iayVar = ialVar.d[i];
            this.c[i] = new iay(iayVar.c, iayVar.d, iayVar.e);
        }
    }

    public final void i(ial ialVar) {
        this.b = ialVar.c;
        this.f = ialVar.e;
        this.g = ialVar.f;
        this.h = ialVar.g;
        this.i = ialVar.h;
        this.j = ialVar.i;
        this.k = ialVar.j;
        this.l = ialVar.k;
        this.m = ialVar.l;
        this.d = ialVar.m;
        this.e = ialVar.n;
    }

    public final void k() {
        this.b = null;
        this.c = iay.b;
        this.e = gvw.b;
        this.d = gvw.g;
        this.f = false;
        this.g = false;
        this.n = null;
        this.h = 0;
        this.i = false;
        this.j = true;
        this.k = 0;
        this.l = -1;
        this.m = null;
    }

    @Override // defpackage.iar
    public final /* bridge */ /* synthetic */ void m(jfy jfyVar) {
        throw null;
    }

    public final void n(int i, iax iaxVar, Object obj) {
        this.c = new iay[]{new iay(i, iaxVar, obj)};
    }

    @Override // defpackage.ias
    public final /* bridge */ /* synthetic */ void o(lfy lfyVar) {
        throw null;
    }

    public final void l(int[] iArr, iax[] iaxVarArr, Object[] objArr) {
        int i;
        iax iaxVar;
        if (iArr != null || objArr != null) {
            int length = iArr == null ? 0 : iArr.length;
            int length2 = iaxVarArr == null ? 0 : iaxVarArr.length;
            int length3 = objArr == null ? 0 : objArr.length;
            int max = Math.max(length, length3);
            iay[] iayVarArr = new iay[max];
            int i2 = 0;
            while (i2 < max) {
                if (length == 0) {
                    i = 0;
                } else {
                    i = i2 < length ? iArr[i2] : iArr[0];
                }
                Object obj = null;
                if (length2 == 0) {
                    iaxVar = null;
                } else {
                    iaxVar = i2 < length2 ? iaxVarArr[i2] : iaxVarArr[0];
                }
                if (length3 != 0) {
                    obj = i2 < length3 ? objArr[i2] : objArr[0];
                }
                iayVarArr[i2] = new iay(i, iaxVar, obj);
                i2++;
            }
            this.c = iayVarArr;
            return;
        }
        this.c = iay.b;
    }
}
