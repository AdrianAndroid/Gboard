package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

/* compiled from: PG */
/* renamed from: isu  reason: default package */
/* loaded from: classes.dex */
public final class isu {
    public Object a;
    private int b;
    private final Object c;
    private final Object d;
    private Object e;
    private Object f;

    public isu(Context context, ist istVar) {
        this.b = 0;
        this.c = context;
        this.d = istVar;
    }

    public isu(View view) {
        this.b = -1;
        this.d = view;
        this.c = C0000if.d();
    }

    private final Resources.Theme g() {
        return ((Context) this.c).getResources().newTheme();
    }

    private final boolean h() {
        Resources.Theme theme = ((Context) this.c).getTheme();
        if (theme != null) {
            ((Resources.Theme) this.e).setTo(theme);
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0066, code lost:
        if (r2 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x002e, code lost:
        r1 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033 A[Catch: all -> 0x0097, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:6:0x000e, B:10:0x001d, B:12:0x0033, B:14:0x003e, B:15:0x0049, B:17:0x004d, B:19:0x0059, B:21:0x0063, B:22:0x0068, B:24:0x006c, B:25:0x0086, B:27:0x008a, B:28:0x0091, B:33:0x0076), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063 A[Catch: all -> 0x0097, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:6:0x000e, B:10:0x001d, B:12:0x0033, B:14:0x003e, B:15:0x0049, B:17:0x004d, B:19:0x0059, B:21:0x0063, B:22:0x0068, B:24:0x006c, B:25:0x0086, B:27:0x008a, B:28:0x0091, B:33:0x0076), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c A[Catch: all -> 0x0097, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:6:0x000e, B:10:0x001d, B:12:0x0033, B:14:0x003e, B:15:0x0049, B:17:0x004d, B:19:0x0059, B:21:0x0063, B:22:0x0068, B:24:0x006c, B:25:0x0086, B:27:0x008a, B:28:0x0091, B:33:0x0076), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008a A[Catch: all -> 0x0097, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:6:0x000e, B:10:0x001d, B:12:0x0033, B:14:0x003e, B:15:0x0049, B:17:0x004d, B:19:0x0059, B:21:0x0063, B:22:0x0068, B:24:0x006c, B:25:0x0086, B:27:0x008a, B:28:0x0091, B:33:0x0076), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0076 A[Catch: all -> 0x0097, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:6:0x000e, B:10:0x001d, B:12:0x0033, B:14:0x003e, B:15:0x0049, B:17:0x004d, B:19:0x0059, B:21:0x0063, B:22:0x0068, B:24:0x006c, B:25:0x0086, B:27:0x008a, B:28:0x0091, B:33:0x0076), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0066  */
    /* JADX WARN: Type inference failed for: r0v16, types: [iss, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized android.content.res.Resources.Theme a() {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.Object r0 = r5.e     // Catch: java.lang.Throwable -> L97
            if (r0 != 0) goto Le
            android.content.res.Resources$Theme r0 = r5.g()     // Catch: java.lang.Throwable -> L97
            r5.e = r0     // Catch: java.lang.Throwable -> L97
            r5.h()     // Catch: java.lang.Throwable -> L97
        Le:
            java.lang.Object r0 = r5.d     // Catch: java.lang.Throwable -> L97
            ist r0 = (defpackage.ist) r0     // Catch: java.lang.Throwable -> L97
            iss r0 = r0.a     // Catch: java.lang.Throwable -> L97
            java.lang.Object r1 = r5.f     // Catch: java.lang.Throwable -> L97
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r0 != 0) goto L1d
            goto L2c
        L1d:
            ess r1 = (defpackage.ess) r1     // Catch: java.lang.Throwable -> L97
            java.lang.String r1 = r1.b     // Catch: java.lang.Throwable -> L97
            r4 = r0
            ess r4 = (defpackage.ess) r4     // Catch: java.lang.Throwable -> L97
            java.lang.String r4 = r4.b     // Catch: java.lang.Throwable -> L97
            boolean r1 = r1.equals(r4)     // Catch: java.lang.Throwable -> L97
            r1 = r1 ^ r3
            goto L31
        L2c:
            if (r1 == r0) goto L30
            r1 = 1
            goto L31
        L30:
            r1 = 0
        L31:
            if (r1 == 0) goto L59
            r5.f = r0     // Catch: java.lang.Throwable -> L97
            r0 = 0
            r5.a = r0     // Catch: java.lang.Throwable -> L97
            boolean r0 = r5.h()     // Catch: java.lang.Throwable -> L97
            if (r0 != 0) goto L49
            java.lang.Object r0 = r5.e     // Catch: java.lang.Throwable -> L97
            android.content.res.Resources$Theme r1 = r5.g()     // Catch: java.lang.Throwable -> L97
            android.content.res.Resources$Theme r0 = (android.content.res.Resources.Theme) r0     // Catch: java.lang.Throwable -> L97
            r0.setTo(r1)     // Catch: java.lang.Throwable -> L97
        L49:
            java.lang.Object r0 = r5.f     // Catch: java.lang.Throwable -> L97
            if (r0 == 0) goto L58
            java.lang.Object r1 = r5.c     // Catch: java.lang.Throwable -> L97
            java.lang.Object r2 = r5.e     // Catch: java.lang.Throwable -> L97
            android.content.res.Resources$Theme r2 = (android.content.res.Resources.Theme) r2     // Catch: java.lang.Throwable -> L97
            android.content.Context r1 = (android.content.Context) r1     // Catch: java.lang.Throwable -> L97
            r0.b(r1, r2)     // Catch: java.lang.Throwable -> L97
        L58:
            r2 = 1
        L59:
            java.lang.Object r0 = r5.d     // Catch: java.lang.Throwable -> L97
            ist r0 = (defpackage.ist) r0     // Catch: java.lang.Throwable -> L97
            int r0 = r0.b     // Catch: java.lang.Throwable -> L97
            int r1 = r5.b     // Catch: java.lang.Throwable -> L97
            if (r0 == r1) goto L66
            r5.b = r0     // Catch: java.lang.Throwable -> L97
            goto L68
        L66:
            if (r2 == 0) goto L91
        L68:
            java.lang.Object r0 = r5.a     // Catch: java.lang.Throwable -> L97
            if (r0 == 0) goto L76
            java.lang.Object r1 = r5.e     // Catch: java.lang.Throwable -> L97
            android.content.res.Resources$Theme r1 = (android.content.res.Resources.Theme) r1     // Catch: java.lang.Throwable -> L97
            android.content.res.Resources$Theme r0 = (android.content.res.Resources.Theme) r0     // Catch: java.lang.Throwable -> L97
            r1.setTo(r0)     // Catch: java.lang.Throwable -> L97
            goto L86
        L76:
            android.content.res.Resources$Theme r0 = r5.g()     // Catch: java.lang.Throwable -> L97
            r5.a = r0     // Catch: java.lang.Throwable -> L97
            java.lang.Object r1 = r5.e     // Catch: java.lang.Throwable -> L97
            android.content.res.Resources$Theme r1 = (android.content.res.Resources.Theme) r1     // Catch: java.lang.Throwable -> L97
            r2 = r0
            android.content.res.Resources$Theme r2 = (android.content.res.Resources.Theme) r2     // Catch: java.lang.Throwable -> L97
            r0.setTo(r1)     // Catch: java.lang.Throwable -> L97
        L86:
            int r0 = r5.b     // Catch: java.lang.Throwable -> L97
            if (r0 == 0) goto L91
            java.lang.Object r1 = r5.e     // Catch: java.lang.Throwable -> L97
            android.content.res.Resources$Theme r1 = (android.content.res.Resources.Theme) r1     // Catch: java.lang.Throwable -> L97
            r1.applyStyle(r0, r3)     // Catch: java.lang.Throwable -> L97
        L91:
            java.lang.Object r0 = r5.e     // Catch: java.lang.Throwable -> L97
            android.content.res.Resources$Theme r0 = (android.content.res.Resources.Theme) r0     // Catch: java.lang.Throwable -> L97
            monitor-exit(r5)
            return r0
        L97:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.isu.a():android.content.res.Resources$Theme");
    }

    public final void b() {
        Drawable background = ((View) this.d).getBackground();
        if (background != null) {
            if (this.e != null) {
                if (this.f == null) {
                    this.f = new nu();
                }
                nu nuVar = (nu) this.f;
                nuVar.a = null;
                nuVar.d = false;
                nuVar.b = null;
                nuVar.c = false;
                ColorStateList m = aad.m((View) this.d);
                if (m != null) {
                    nuVar.d = true;
                    nuVar.a = m;
                }
                PorterDuff.Mode n = aad.n((View) this.d);
                if (n != null) {
                    nuVar.c = true;
                    nuVar.b = n;
                }
                if (nuVar.d || nuVar.c) {
                    mv.h(background, nuVar, ((View) this.d).getDrawableState());
                    return;
                }
            }
            Object obj = this.a;
            if (obj != null) {
                mv.h(background, (nu) obj, ((View) this.d).getDrawableState());
                return;
            }
            Object obj2 = this.e;
            if (obj2 == null) {
                return;
            }
            mv.h(background, (nu) obj2, ((View) this.d).getDrawableState());
        }
    }

    public final void c(AttributeSet attributeSet, int i) {
        gkn w = gkn.w(((View) this.d).getContext(), attributeSet, ei.A, i, 0);
        View view = (View) this.d;
        aad.L(view, view.getContext(), ei.A, attributeSet, (TypedArray) w.a, i, 0);
        try {
            if (w.t(0)) {
                this.b = w.l(0, -1);
                ColorStateList a = ((C0000if) this.c).a(((View) this.d).getContext(), this.b);
                if (a != null) {
                    e(a);
                }
            }
            if (w.t(1)) {
                aad.P((View) this.d, w.m(1));
            }
            if (w.t(2)) {
                aad.Q((View) this.d, ke.a(w.i(2, -1), null));
            }
        } finally {
            w.r();
        }
    }

    public final void d(int i) {
        ColorStateList colorStateList;
        this.b = i;
        Object obj = this.c;
        if (obj != null) {
            colorStateList = ((C0000if) obj).a(((View) this.d).getContext(), i);
        } else {
            colorStateList = null;
        }
        e(colorStateList);
        b();
    }

    final void e(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.e == null) {
                this.e = new nu();
            }
            nu nuVar = (nu) this.e;
            nuVar.a = colorStateList;
            nuVar.d = true;
        } else {
            this.e = null;
        }
        b();
    }

    public final void f() {
        this.b = -1;
        e(null);
        b();
    }
}
