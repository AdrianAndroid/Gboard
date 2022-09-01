package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.google.android.inputmethod.latin.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: aad  reason: default package */
/* loaded from: classes.dex */
public final class aad {
    private static Field c;
    private static WeakHashMap b = null;
    private static boolean d = false;
    public static final int[] a = {R.id.f51710_resource_name_obfuscated_res_0x7f0b0020, R.id.f51720_resource_name_obfuscated_res_0x7f0b0021, R.id.f51830_resource_name_obfuscated_res_0x7f0b002c, R.id.f51940_resource_name_obfuscated_res_0x7f0b0037, R.id.f51970_resource_name_obfuscated_res_0x7f0b003a, R.id.f51980_resource_name_obfuscated_res_0x7f0b003b, R.id.f51990_resource_name_obfuscated_res_0x7f0b003c, R.id.f52000_resource_name_obfuscated_res_0x7f0b003d, R.id.f52010_resource_name_obfuscated_res_0x7f0b003e, R.id.f52020_resource_name_obfuscated_res_0x7f0b003f, R.id.f51730_resource_name_obfuscated_res_0x7f0b0022, R.id.f51740_resource_name_obfuscated_res_0x7f0b0023, R.id.f51750_resource_name_obfuscated_res_0x7f0b0024, R.id.f51760_resource_name_obfuscated_res_0x7f0b0025, R.id.f51770_resource_name_obfuscated_res_0x7f0b0026, R.id.f51780_resource_name_obfuscated_res_0x7f0b0027, R.id.f51790_resource_name_obfuscated_res_0x7f0b0028, R.id.f51800_resource_name_obfuscated_res_0x7f0b0029, R.id.f51810_resource_name_obfuscated_res_0x7f0b002a, R.id.f51820_resource_name_obfuscated_res_0x7f0b002b, R.id.f51840_resource_name_obfuscated_res_0x7f0b002d, R.id.f51850_resource_name_obfuscated_res_0x7f0b002e, R.id.f51860_resource_name_obfuscated_res_0x7f0b002f, R.id.f51870_resource_name_obfuscated_res_0x7f0b0030, R.id.f51880_resource_name_obfuscated_res_0x7f0b0031, R.id.f51890_resource_name_obfuscated_res_0x7f0b0032, R.id.f51900_resource_name_obfuscated_res_0x7f0b0033, R.id.f51910_resource_name_obfuscated_res_0x7f0b0034, R.id.f51920_resource_name_obfuscated_res_0x7f0b0035, R.id.f51930_resource_name_obfuscated_res_0x7f0b0036, R.id.f51950_resource_name_obfuscated_res_0x7f0b0038, R.id.f51960_resource_name_obfuscated_res_0x7f0b0039};
    private static final za e = zd.a;
    private static final zi f = new zi();

    static {
        new AtomicInteger(1);
    }

    public static List A(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.f129320_resource_name_obfuscated_res_0x7f0b2153);
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            view.setTag(R.id.f129320_resource_name_obfuscated_res_0x7f0b2153, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public static void B(View view, abi abiVar) {
        C(view);
        au(abiVar.a(), view);
        A(view).add(abiVar);
        D(view, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void C(View view) {
        yd r = r(view);
        if (r == null) {
            r = new yd();
        }
        M(view, r);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void D(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (!accessibilityManager.isEnabled()) {
            return;
        }
        boolean z = false;
        if (z(view) != null && view.isShown() && view.getWindowVisibility() == 0) {
            z = true;
        }
        int i2 = 32;
        if (zo.a(view) == 0 && !z) {
            if (i == 32) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain);
                obtain.setEventType(32);
                zo.d(obtain, 32);
                obtain.setSource(view);
                view.onPopulateAccessibilityEvent(obtain);
                obtain.getText().add(z(view));
                accessibilityManager.sendAccessibilityEvent(obtain);
                return;
            } else if (view.getParent() == null) {
                return;
            } else {
                try {
                    zo.b(view.getParent(), view, view, i);
                    return;
                } catch (AbstractMethodError e2) {
                    Log.e("ViewCompat", String.valueOf(view.getParent().getClass().getSimpleName()).concat(" does not fully implement ViewParent"), e2);
                    return;
                }
            }
        }
        if (true != z) {
            i2 = 2048;
        }
        AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
        obtain2.setEventType(i2);
        zo.d(obtain2, i);
        if (z) {
            obtain2.getText().add(z(view));
            if (zl.a(view) == 0) {
                zl.o(view, 1);
            }
            ViewParent parent = view.getParent();
            while (true) {
                if (!(parent instanceof View)) {
                    break;
                } else if (zl.a((View) parent) != 4) {
                    parent = parent.getParent();
                } else {
                    zl.o(view, 2);
                    break;
                }
            }
        }
        view.sendAccessibilityEventUnchecked(obtain2);
    }

    public static void E(View view, int i) {
        view.offsetLeftAndRight(i);
    }

    public static void F(View view, int i) {
        view.offsetTopAndBottom(i);
    }

    public static void G(View view) {
        zl.g(view);
    }

    public static void H(View view, Runnable runnable) {
        zl.i(view, runnable);
    }

    public static void I(View view, Runnable runnable, long j) {
        zl.j(view, runnable, j);
    }

    public static void J(View view, int i) {
        au(i, view);
        D(view, 0);
    }

    public static void K(View view) {
        zp.c(view);
    }

    public static void L(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            zx.c(view, context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    public static void M(View view, yd ydVar) {
        if (ydVar == null && (p(view) instanceof yb)) {
            ydVar = new yd();
        }
        view.setAccessibilityDelegate(ydVar == null ? null : ydVar.c);
    }

    public static void N(View view, CharSequence charSequence) {
        at().e(view, charSequence);
        if (charSequence != null) {
            zi ziVar = f;
            WeakHashMap weakHashMap = ziVar.a;
            boolean z = false;
            if (view.isShown() && view.getWindowVisibility() == 0) {
                z = true;
            }
            weakHashMap.put(view, Boolean.valueOf(z));
            view.addOnAttachStateChangeListener(ziVar);
            if (!zo.e(view)) {
                return;
            }
            ziVar.a(view);
            return;
        }
        zi ziVar2 = f;
        ziVar2.a.remove(view);
        view.removeOnAttachStateChangeListener(ziVar2);
        zl.k(view.getViewTreeObserver(), ziVar2);
    }

    public static void O(View view, Drawable drawable) {
        zl.m(view, drawable);
    }

    public static void P(View view, ColorStateList colorStateList) {
        zr.j(view, colorStateList);
    }

    public static void Q(View view, PorterDuff.Mode mode) {
        zr.k(view, mode);
    }

    public static void R(View view, Rect rect) {
        zn.b(view, rect);
    }

    public static void S(View view, float f2) {
        zr.l(view, f2);
    }

    @Deprecated
    public static void T(View view, boolean z) {
        view.setFitsSystemWindows(z);
    }

    public static void U(View view, int i) {
        zl.o(view, i);
    }

    public static void V(View view, yy yyVar) {
        zr.n(view, yyVar);
    }

    public static void W(View view, int i, int i2, int i3, int i4) {
        zm.j(view, i, i2, i3, i4);
    }

    public static void X(View view, CharSequence charSequence) {
        v().e(view, charSequence);
    }

    public static void Y(View view) {
        zr.r(view);
    }

    @Deprecated
    public static boolean Z(View view, int i) {
        return view.canScrollHorizontally(i);
    }

    public static float a(View view) {
        return zr.a(view);
    }

    @Deprecated
    public static boolean aa(View view, int i) {
        return view.canScrollVertically(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean ab(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        aac c2 = aac.c(view);
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = c2.b;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            if (!aac.a.isEmpty()) {
                synchronized (aac.a) {
                    if (c2.b == null) {
                        c2.b = new WeakHashMap();
                    }
                    int size = aac.a.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        View view2 = (View) ((WeakReference) aac.a.get(size)).get();
                        if (view2 == null) {
                            aac.a.remove(size);
                        } else {
                            c2.b.put(view2, Boolean.TRUE);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                c2.b.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
        View b2 = c2.b(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (b2 != null && !KeyEvent.isModifierKey(keyCode)) {
                c2.a().put(keyCode, new WeakReference(b2));
            }
        }
        return b2 != null;
    }

    public static boolean ac(View view, KeyEvent keyEvent) {
        int indexOfKey;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        aac c2 = aac.c(view);
        WeakReference weakReference = c2.c;
        if (weakReference != null && weakReference.get() == keyEvent) {
            return false;
        }
        c2.c = new WeakReference(keyEvent);
        SparseArray a2 = c2.a();
        WeakReference weakReference2 = null;
        if (keyEvent.getAction() == 1 && (indexOfKey = a2.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference2 = (WeakReference) a2.valueAt(indexOfKey);
            a2.removeAt(indexOfKey);
        }
        if (weakReference2 == null) {
            weakReference2 = (WeakReference) a2.get(keyEvent.getKeyCode());
        }
        if (weakReference2 == null) {
            return false;
        }
        View view2 = (View) weakReference2.get();
        if (view2 == null || !zo.e(view2)) {
            return true;
        }
        aac.d(view2);
        return true;
    }

    public static boolean ad(View view) {
        return zl.p(view);
    }

    public static boolean ae(View view) {
        return zk.a(view);
    }

    public static boolean af(View view) {
        return zl.r(view);
    }

    public static boolean ag(View view) {
        return zo.e(view);
    }

    public static boolean ah(View view) {
        return zo.f(view);
    }

    public static boolean ai(View view) {
        return zr.y(view);
    }

    public static boolean aj(View view) {
        return zm.k(view);
    }

    public static String[] ak(View view) {
        return Build.VERSION.SDK_INT >= 31 ? zz.c(view) : (String[]) view.getTag(R.id.f129380_resource_name_obfuscated_res_0x7f0b2159);
    }

    public static void al(View view, abc abcVar, Rect rect) {
        zr.f(view, abcVar, rect);
    }

    public static void an(View view) {
        zo.c(view, 1);
    }

    public static void ao(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            zu.g(view, 8);
        }
    }

    public static void ap(View view, int i) {
        zs.d(view, i, 3);
    }

    public static aqq aq(View view) {
        if (b == null) {
            b = new WeakHashMap();
        }
        aqq aqqVar = (aqq) b.get(view);
        if (aqqVar == null) {
            aqq aqqVar2 = new aqq(view);
            b.put(view, aqqVar2);
            return aqqVar2;
        }
        return aqqVar;
    }

    public static void ar(View view, aqq aqqVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            zt.d(view, (PointerIcon) aqqVar.a);
        }
    }

    private static za as(View view) {
        return view instanceof za ? (za) view : e;
    }

    private static zj at() {
        return new zf(CharSequence.class);
    }

    private static void au(int i, View view) {
        List A = A(view);
        for (int i2 = 0; i2 < A.size(); i2++) {
            if (((abi) A.get(i2)).a() == i) {
                A.remove(i2);
                return;
            }
        }
    }

    public static float b(View view) {
        return zr.c(view);
    }

    public static int c() {
        return zm.a();
    }

    public static int d(View view) {
        return zl.a(view);
    }

    public static int e(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return zu.a(view);
        }
        return 0;
    }

    public static int f(View view) {
        return zm.c(view);
    }

    public static int g(View view) {
        return zl.b(view);
    }

    public static int h(View view) {
        return zl.c(view);
    }

    @Deprecated
    public static int i(View view) {
        return view.getOverScrollMode();
    }

    public static int j(View view) {
        return zm.d(view);
    }

    public static int k(View view) {
        return zm.e(view);
    }

    @Deprecated
    public static int l(View view) {
        return zl.d(view);
    }

    public static ColorStateList m(View view) {
        return zr.d(view);
    }

    public static PorterDuff.Mode n(View view) {
        return zr.e(view);
    }

    public static Display o(View view) {
        return zm.f(view);
    }

    public static View.AccessibilityDelegate p(View view) {
        if (Build.VERSION.SDK_INT < 29) {
            if (d) {
                return null;
            }
            if (c == null) {
                try {
                    Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                    c = declaredField;
                    declaredField.setAccessible(true);
                } catch (Throwable unused) {
                    d = true;
                    return null;
                }
            }
            Object obj = c.get(view);
            if (!(obj instanceof View.AccessibilityDelegate)) {
                return null;
            }
            return (View.AccessibilityDelegate) obj;
        }
        return zx.a(view);
    }

    public static View q(View view, int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (View) zw.b(view, i);
        }
        View findViewById = view.findViewById(i);
        if (findViewById == null) {
            throw new IllegalArgumentException("ID does not reference a View inside this View");
        }
        return findViewById;
    }

    public static yd r(View view) {
        View.AccessibilityDelegate p = p(view);
        if (p == null) {
            return null;
        }
        if (p instanceof yb) {
            return ((yb) p).a;
        }
        return new yd(p);
    }

    public static yl s(View view, yl ylVar) {
        if (Build.VERSION.SDK_INT >= 31) {
            return zz.a(view, ylVar);
        }
        yz yzVar = (yz) view.getTag(R.id.f129370_resource_name_obfuscated_res_0x7f0b2158);
        if (yzVar != null) {
            yl a2 = yzVar.a(view, ylVar);
            if (a2 != null) {
                return as(view).ia(a2);
            }
            return null;
        }
        return as(view).ia(ylVar);
    }

    public static zj t() {
        return new zh(Boolean.class);
    }

    public static zj u() {
        return new ze(Boolean.class);
    }

    public static zj v() {
        return new zg(CharSequence.class);
    }

    public static abc w(View view, abc abcVar) {
        WindowInsets e2 = abcVar.e();
        if (e2 != null) {
            WindowInsets a2 = zp.a(view, e2);
            if (!a2.equals(e2)) {
                return abc.n(a2, view);
            }
        }
        return abcVar;
    }

    public static abc x(View view) {
        return zs.b(view);
    }

    public static abc y(View view, abc abcVar) {
        WindowInsets e2 = abcVar.e();
        if (e2 != null) {
            WindowInsets b2 = zp.b(view, e2);
            if (!b2.equals(e2)) {
                return abc.n(b2, view);
            }
        }
        return abcVar;
    }

    public static CharSequence z(View view) {
        return (CharSequence) at().d(view);
    }

    public static void am(View view, abi abiVar, abs absVar) {
        if (absVar != null) {
            B(view, new abi(null, abiVar.j, null, absVar, abiVar.k));
        } else {
            J(view, abiVar.a());
        }
    }
}
