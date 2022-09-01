package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Constructor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fs  reason: default package */
/* loaded from: classes.dex */
public final class fs {
    ye A;
    public CharSequence B;
    public CharSequence C;
    public ColorStateList D = null;
    public PorterDuff.Mode E = null;
    final /* synthetic */ ft F;
    public final Menu a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public CharSequence k;
    public CharSequence l;
    public int m;
    public char n;
    public int o;
    public char p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public String x;
    public String y;
    public String z;

    public fs(ft ftVar, Menu menu) {
        this.F = ftVar;
        this.a = menu;
        c();
    }

    public static final char e(String str) {
        if (str == null) {
            return (char) 0;
        }
        return str.charAt(0);
    }

    public final SubMenu a() {
        this.h = true;
        SubMenu addSubMenu = this.a.addSubMenu(this.b, this.i, this.j, this.k);
        d(addSubMenu.getItem());
        return addSubMenu;
    }

    public final Object b(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.F.e.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: ".concat(str), e);
            return null;
        }
    }

    public final void c() {
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = true;
        this.g = true;
    }

    public final void d(MenuItem menuItem) {
        boolean z = false;
        menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r > 0).setTitleCondensed(this.l).setIcon(this.m);
        int i = this.v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        if (this.z != null) {
            if (this.F.e.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            ft ftVar = this.F;
            if (ftVar.f == null) {
                ftVar.f = ftVar.a(ftVar.e);
            }
            menuItem.setOnMenuItemClickListener(new fr(ftVar.f, this.z));
        }
        if (this.r >= 2) {
            if (menuItem instanceof go) {
                ((go) menuItem).j(true);
            } else if (menuItem instanceof gu) {
                gu guVar = (gu) menuItem;
                try {
                    if (guVar.d == null) {
                        guVar.d = guVar.c.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    guVar.d.invoke(guVar.c, true);
                } catch (Exception e) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
                }
            }
        }
        String str = this.x;
        if (str != null) {
            menuItem.setActionView((View) b(str, ft.a, this.F.c));
            z = true;
        }
        int i2 = this.w;
        if (i2 > 0) {
            if (!z) {
                menuItem.setActionView(i2);
            } else {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            }
        }
        ye yeVar = this.A;
        if (yeVar != null) {
            if (menuItem instanceof wn) {
                ((wn) menuItem).c(yeVar);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.B;
        boolean z2 = menuItem instanceof wn;
        if (z2) {
            ((wn) menuItem).b(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            ys.f(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.C;
        if (z2) {
            ((wn) menuItem).d(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            ys.k(menuItem, charSequence2);
        }
        char c = this.n;
        int i3 = this.o;
        if (z2) {
            ((wn) menuItem).setAlphabeticShortcut(c, i3);
        } else if (Build.VERSION.SDK_INT >= 26) {
            ys.e(menuItem, c, i3);
        }
        char c2 = this.p;
        int i4 = this.q;
        if (z2) {
            ((wn) menuItem).setNumericShortcut(c2, i4);
        } else if (Build.VERSION.SDK_INT >= 26) {
            ys.i(menuItem, c2, i4);
        }
        PorterDuff.Mode mode = this.E;
        if (mode != null) {
            if (z2) {
                ((wn) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                ys.h(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.D;
        if (colorStateList != null) {
            if (z2) {
                ((wn) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT < 26) {
            } else {
                ys.g(menuItem, colorStateList);
            }
        }
    }
}
