package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aav  reason: default package */
/* loaded from: classes.dex */
public class aav extends aba {
    private static boolean c = false;
    private static Method f;
    private static Class g;
    private static Field h;
    private static Field i;
    final WindowInsets a;
    vq b;
    private vq[] j;
    private vq k = null;
    private abc l;

    public aav(abc abcVar, WindowInsets windowInsets) {
        super(abcVar);
        this.a = windowInsets;
    }

    private vq t(int i2, boolean z) {
        vq vqVar = vq.a;
        for (int i3 = 1; i3 <= 256; i3 += i3) {
            if ((i2 & i3) != 0) {
                vqVar = vq.b(vqVar, b(i3, false));
            }
        }
        return vqVar;
    }

    private vq u() {
        abc abcVar = this.l;
        return abcVar != null ? abcVar.g() : vq.a;
    }

    private vq v(View view) {
        if (Build.VERSION.SDK_INT < 30) {
            if (!c) {
                w();
            }
            Method method = f;
            if (method != null && g != null && h != null) {
                try {
                    Object invoke = method.invoke(view, new Object[0]);
                    if (invoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) h.get(i.get(invoke));
                    if (rect == null) {
                        return null;
                    }
                    return vq.c(rect);
                } catch (ReflectiveOperationException e) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). ".concat(String.valueOf(e.getMessage())), e);
                }
            }
            return null;
        }
        throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
    }

    private static void w() {
        try {
            f = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            g = cls;
            h = cls.getDeclaredField("mVisibleInsets");
            i = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            h.setAccessible(true);
            i.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). ".concat(String.valueOf(e.getMessage())), e);
        }
        c = true;
    }

    @Override // defpackage.aba
    public vq a(int i2) {
        return t(i2, false);
    }

    @Override // defpackage.aba
    public final vq c() {
        if (this.k == null) {
            this.k = vq.d(this.a.getSystemWindowInsetLeft(), this.a.getSystemWindowInsetTop(), this.a.getSystemWindowInsetRight(), this.a.getSystemWindowInsetBottom());
        }
        return this.k;
    }

    @Override // defpackage.aba
    public abc d(int i2, int i3, int i4, int i5) {
        aau aarVar;
        abc m = abc.m(this.a);
        if (Build.VERSION.SDK_INT >= 30) {
            aarVar = new aat(m);
        } else if (Build.VERSION.SDK_INT >= 29) {
            aarVar = new aas(m);
        } else {
            aarVar = new aar(m);
        }
        aarVar.c(abc.h(c(), i2, i3, i4, i5));
        aarVar.b(abc.h(j(), i2, i3, i4, i5));
        return aarVar.a();
    }

    @Override // defpackage.aba
    public void e(View view) {
        vq v = v(view);
        if (v == null) {
            v = vq.a;
        }
        g(v);
    }

    @Override // defpackage.aba
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        return Objects.equals(this.b, ((aav) obj).b);
    }

    @Override // defpackage.aba
    public void f(vq[] vqVarArr) {
        this.j = vqVarArr;
    }

    public void g(vq vqVar) {
        this.b = vqVar;
    }

    @Override // defpackage.aba
    public void h(abc abcVar) {
        this.l = abcVar;
    }

    @Override // defpackage.aba
    public boolean i() {
        return this.a.isRound();
    }

    protected vq b(int i2, boolean z) {
        int i3;
        yn o;
        int i4 = 0;
        if (i2 != 1) {
            vq vqVar = null;
            if (i2 == 2) {
                vq c2 = c();
                abc abcVar = this.l;
                if (abcVar != null) {
                    vqVar = abcVar.g();
                }
                int i5 = c2.e;
                if (vqVar != null) {
                    i5 = Math.min(i5, vqVar.e);
                }
                return vq.d(c2.b, 0, c2.d, i5);
            } else if (i2 == 8) {
                vq[] vqVarArr = this.j;
                if (vqVarArr != null) {
                    vqVar = vqVarArr[tx.b(8)];
                }
                if (vqVar != null) {
                    return vqVar;
                }
                vq c3 = c();
                vq u = u();
                int i6 = c3.e;
                if (i6 > u.e) {
                    return vq.d(0, 0, 0, i6);
                }
                vq vqVar2 = this.b;
                return (vqVar2 == null || vqVar2.equals(vq.a) || (i3 = this.b.e) <= u.e) ? vq.a : vq.d(0, 0, 0, i3);
            } else if (i2 == 16) {
                return r();
            } else {
                if (i2 == 32) {
                    return q();
                }
                if (i2 == 64) {
                    return s();
                }
                if (i2 != 128) {
                    return vq.a;
                }
                abc abcVar2 = this.l;
                if (abcVar2 != null) {
                    o = abcVar2.b.o();
                } else {
                    o = o();
                }
                if (o == null) {
                    return vq.a;
                }
                int b = Build.VERSION.SDK_INT >= 28 ? ym.b(o.a) : 0;
                int d = Build.VERSION.SDK_INT >= 28 ? ym.d(o.a) : 0;
                int c4 = Build.VERSION.SDK_INT >= 28 ? ym.c(o.a) : 0;
                if (Build.VERSION.SDK_INT >= 28) {
                    i4 = ym.a(o.a);
                }
                return vq.d(b, d, c4, i4);
            }
        }
        return vq.d(0, c().c, 0, 0);
    }
}
