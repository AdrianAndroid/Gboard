package defpackage;

import android.view.View;
import android.view.ViewParent;

/* compiled from: PG */
/* renamed from: opn  reason: default package */
/* loaded from: classes2.dex */
public final class opn {
    public boolean a;
    public Object b;
    public Object c;
    public Object d;
    final Object e;

    public opn() {
        this.e = "/";
    }

    public opn(View view) {
        this.e = view;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.ViewParent, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.view.ViewParent, java.lang.Object] */
    private final ViewParent j(int i) {
        return i != 0 ? this.d : this.b;
    }

    private final void k(int i, ViewParent viewParent) {
        if (i != 0) {
            this.d = viewParent;
        } else {
            this.b = viewParent;
        }
    }

    private final int[] l() {
        if (this.c == null) {
            this.c = new int[2];
        }
        return (int[]) this.c;
    }

    public final void a(boolean z) {
        if (this.a) {
            aad.Y((View) this.e);
        }
        this.a = z;
    }

    public final void b(int i) {
        ViewParent j = j(i);
        if (j != null) {
            tv.g(j, (View) this.e, i);
            k(i, null);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.ViewParent, java.lang.Object] */
    public final boolean c(float f, float f2, boolean z) {
        ?? r0;
        if (!this.a || (r0 = this.b) == 0) {
            return false;
        }
        return tv.h(r0, (View) this.e, f, f2, z);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.ViewParent, java.lang.Object] */
    public final boolean d(float f, float f2) {
        ?? r0;
        if (!this.a || (r0 = this.b) == 0) {
            return false;
        }
        return tv.i(r0, (View) this.e, f, f2);
    }

    public final boolean f(int i, int i2, int i3, int i4, int[] iArr) {
        return g(i, i2, i3, i4, iArr, 0, null);
    }

    public final boolean h(int i) {
        return j(i) != null;
    }

    public final boolean i(int i, int i2) {
        if (!h(i2)) {
            if (!this.a) {
                return false;
            }
            Object obj = this.e;
            for (ViewParent parent = ((View) this.e).getParent(); parent != null; parent = parent.getParent()) {
                View view = (View) obj;
                if (!tv.j(parent, view, (View) this.e, i, i2)) {
                    if (parent instanceof View) {
                        obj = (View) parent;
                    }
                } else {
                    k(i2, parent);
                    tv.f(parent, view, (View) this.e, i, i2);
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean g(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent j;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int[] iArr3;
        if (!this.a || (j = j(i5)) == null) {
            return false;
        }
        if (i != 0) {
            i6 = i;
            i7 = i2;
            i8 = i3;
        } else if (i2 != 0) {
            i7 = i2;
            i8 = i3;
            i6 = 0;
        } else if (i3 != 0) {
            i8 = i3;
            i6 = 0;
            i7 = 0;
        } else if (i4 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        } else {
            i6 = 0;
            i7 = 0;
            i8 = 0;
        }
        if (iArr != null) {
            ((View) this.e).getLocationInWindow(iArr);
            i9 = iArr[0];
            i10 = iArr[1];
        } else {
            i9 = 0;
            i10 = 0;
        }
        if (iArr2 == null) {
            int[] l = l();
            l[0] = 0;
            l[1] = 0;
            iArr3 = l;
        } else {
            iArr3 = iArr2;
        }
        tv.e(j, (View) this.e, i6, i7, i8, i4, i5, iArr3);
        if (iArr != null) {
            ((View) this.e).getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i9;
            iArr[1] = iArr[1] - i10;
        }
        return true;
    }

    public final boolean e(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent j;
        int i4;
        int i5;
        int i6;
        if (!this.a || (j = j(i3)) == null) {
            return false;
        }
        if (i != 0) {
            i4 = i;
        } else if (i2 == 0) {
            if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
            return false;
        } else {
            i4 = 0;
        }
        if (iArr2 != null) {
            ((View) this.e).getLocationInWindow(iArr2);
            i5 = iArr2[0];
            i6 = iArr2[1];
        } else {
            i5 = 0;
            i6 = 0;
        }
        if (iArr == null) {
            iArr = l();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        tv.d(j, (View) this.e, i4, i2, iArr, i3);
        if (iArr2 != null) {
            ((View) this.e).getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i5;
            iArr2[1] = iArr2[1] - i6;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }
}
