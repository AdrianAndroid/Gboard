package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.inputmethod.latin.R;
import java.io.Serializable;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* renamed from: jdg  reason: default package */
/* loaded from: classes.dex */
public final class jdg {
    public static void A(boolean z, String str, Object obj) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(p(str, obj));
    }

    public static void B(boolean z, String str, int i, int i2) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(p(str, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public static void C(boolean z, String str, Object obj, int i) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(p(str, obj, Integer.valueOf(i)));
    }

    public static void D(boolean z, String str, Object obj, Object obj2) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(p(str, obj, obj2));
    }

    public static void E(int i, int i2, int i3) {
        String ac;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                ac = ac(i, i3, "start index");
            } else {
                ac = (i2 < 0 || i2 > i3) ? ac(i2, i3, "end index") : p("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(ac);
        }
    }

    public static void F(boolean z) {
        if (z) {
            return;
        }
        throw new IllegalStateException();
    }

    public static void G(boolean z, Object obj) {
        if (z) {
            return;
        }
        throw new IllegalStateException((String) obj);
    }

    public static void H(boolean z, String str, int i) {
        if (z) {
            return;
        }
        throw new IllegalStateException(p(str, Integer.valueOf(i)));
    }

    public static void I(boolean z, String str, long j) {
        if (z) {
            return;
        }
        throw new IllegalStateException(p(str, Long.valueOf(j)));
    }

    public static void J(boolean z, String str, Object obj) {
        if (z) {
            return;
        }
        throw new IllegalStateException(p(str, obj));
    }

    public static void K(boolean z, String str, int i, int i2) {
        if (z) {
            return;
        }
        throw new IllegalStateException(p(str, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public static void L(boolean z, String str, Object obj, Object obj2) {
        if (z) {
            return;
        }
        throw new IllegalStateException(p(str, obj, obj2));
    }

    public static void M(boolean z, long j, Object obj) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(p("duration cannot be negative: %s %s", Long.valueOf(j), obj));
    }

    public static void N(int i, int i2) {
        String p;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                p = p("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else if (i2 < 0) {
                throw new IllegalArgumentException("negative size: " + i2);
            } else {
                p = p("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(p);
        }
    }

    public static void O(Object obj, String str, Object obj2) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException(p(str, obj2));
    }

    public static void P(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(ac(i, i2, "index"));
        }
    }

    public static void Q(Object obj, Object obj2) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException((String) obj2);
    }

    public static lfa R(Class cls) {
        return new lfa(cls.getSimpleName());
    }

    public static lfa S(Object obj) {
        return new lfa(obj.getClass().getSimpleName());
    }

    public static lfa T(String str) {
        return new lfa(str);
    }

    public static Object U(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        if (obj2 == null) {
            throw new NullPointerException("Both parameters are null");
        }
        return obj2;
    }

    public static leq V(Object obj) {
        return new ler(obj);
    }

    public static boolean W(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static String X(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (ab(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (ab(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static String Y(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (aa(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (aa(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static boolean Z(CharSequence charSequence, CharSequence charSequence2) {
        int ad;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char charAt = charSequence.charAt(i);
            char charAt2 = charSequence2.charAt(i);
            if (charAt != charAt2 && ((ad = ad(charAt)) >= 26 || ad != ad(charAt2))) {
                return false;
            }
        }
        return true;
    }

    public static void a(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams.width != i) {
            layoutParams.width = i;
            view.setLayoutParams(layoutParams);
        }
    }

    public static boolean aa(char c) {
        return c >= 'a' && c <= 'z';
    }

    public static boolean ab(char c) {
        return c >= 'A' && c <= 'Z';
    }

    private static String ac(int i, int i2, String str) {
        if (i < 0) {
            return p("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return p("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException("negative size: " + i2);
    }

    private static int ad(char c) {
        return (char) ((c | ' ') - 97);
    }

    public static ObjectAnimator b(Object obj) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(obj, "growScale", 1.0f);
        ofFloat.setInterpolator(jgp.a);
        ofFloat.setDuration(500L);
        return ofFloat;
    }

    public static ObjectAnimator c(Object obj) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(obj, "growScale", 0.0f);
        ofFloat.setInterpolator(jgp.a);
        ofFloat.setDuration(500L);
        return ofFloat;
    }

    public static int d(int i, Context context) {
        return new ktw(context).a(kxc.g(context, R.attr.f10000_resource_name_obfuscated_res_0x7f040356, 0), context.getResources().getDimension(i));
    }

    public static hky e(String str, boolean z) {
        hky f = f(null, str, str, str, null, null);
        f.j(false);
        f.k(false);
        f.m(true != z ? 2000L : 3500L);
        return f;
    }

    public static hky f(View view, String str, String str2, String str3, String str4, View.OnClickListener onClickListener) {
        hky a = hlf.a();
        a.p(str);
        a.m = 1;
        a.s(R.layout.f146820_resource_name_obfuscated_res_0x7f0e05eb);
        a.o(true);
        a.m(8000L);
        a.k(true);
        a.i(true);
        a.j(true);
        a.g(str3);
        a.a = new cjp(str2, str4, onClickListener, 5);
        a.c = view;
        a.d = bwe.i;
        a.l(R.animator.f960_resource_name_obfuscated_res_0x7f02004a);
        a.h(R.animator.f950_resource_name_obfuscated_res_0x7f020049);
        return a;
    }

    public static int g(Context context) {
        if (h()) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(16974142, new int[]{16843829});
            try {
                return obtainStyledAttributes.getColor(0, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        return 0;
    }

    public static boolean h() {
        return Build.VERSION.SDK_INT >= 29 && !itb.j() && jam.u();
    }

    public static ilm i(iln ilnVar, Point point) {
        return j(ilnVar, point.x, point.y);
    }

    public static ilm j(iln ilnVar, int i, int i2) {
        int c;
        if (i < 0 || i >= ilnVar.c() || i2 < 0 || i2 >= ilnVar.d() || (c = i + (i2 * ilnVar.c())) < 0) {
            return null;
        }
        ime imeVar = (ime) ilnVar;
        if (c >= imeVar.d.size()) {
            return null;
        }
        return (ilm) imeVar.d.get(c);
    }

    public static ilm k(iln ilnVar) {
        return i(ilnVar, ((ime) ilnVar).c);
    }

    public static void l(iln ilnVar, Point point) {
        ((ime) ilnVar).c.set(point.x, point.y);
    }

    public static lgb n(lgb lgbVar) {
        if ((lgbVar instanceof lgd) || (lgbVar instanceof lgc)) {
            return lgbVar;
        }
        if (lgbVar instanceof Serializable) {
            return new lgc(lgbVar);
        }
        return new lgd(lgbVar);
    }

    public static lgb o(Object obj) {
        return new lge(obj);
    }

    public static String p(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String str2;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                str2 = "null";
            } else {
                try {
                    str2 = obj.toString();
                } catch (Exception e) {
                    String str3 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str3), (Throwable) e);
                    str2 = "<" + str3 + " threw " + e.getClass().getName() + ">";
                }
            }
            objArr[i2] = str2;
            i2++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (indexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i3, indexOf);
            sb.append(objArr[i]);
            i3 = indexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static String q(String str, int i) {
        boolean z = false;
        if (i <= 1) {
            if (i >= 0) {
                z = true;
            }
            y(z, "invalid count: %s", i);
            return i == 0 ? "" : str;
        }
        int length = str.length();
        long j = length * i;
        int i2 = (int) j;
        if (i2 != j) {
            throw new ArrayIndexOutOfBoundsException("Required array size too large: " + j);
        }
        char[] cArr = new char[i2];
        str.getChars(0, length, cArr, 0);
        while (true) {
            int i3 = i2 - length;
            if (length < i3) {
                System.arraycopy(cArr, 0, cArr, length, length);
                length += length;
            } else {
                System.arraycopy(cArr, 0, cArr, length, i3);
                return new String(cArr);
            }
        }
    }

    public static lfe r(lfe lfeVar, leq leqVar) {
        return new lfg(lfeVar, leqVar);
    }

    public static lfe s(Collection collection) {
        return new lfh(collection);
    }

    public static lfe t(lfe lfeVar) {
        return new lfk(lfeVar);
    }

    public static Object u(Object obj) {
        obj.getClass();
        return obj;
    }

    public static void v(boolean z) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void w(boolean z, Object obj) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException((String) obj);
    }

    public static void x(boolean z, String str, char c) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(p(str, Character.valueOf(c)));
    }

    public static void y(boolean z, String str, int i) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(p(str, Integer.valueOf(i)));
    }

    public static void z(boolean z, String str, long j) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(p(str, Long.valueOf(j)));
    }
}
