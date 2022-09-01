package defpackage;

import android.os.Build;
import android.view.View;
import android.widget.AutoCompleteTextView;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* renamed from: nzv  reason: default package */
/* loaded from: classes2.dex */
public final class nzv {
    public Object a;
    public Object b;
    public Object c;

    public nzv() {
    }

    public nzv(crn crnVar) {
        this.c = crnVar.a;
        this.a = crnVar.b;
        this.b = crnVar.c;
    }

    public nzv(byte[] bArr) {
        this.a = null;
        this.c = null;
        this.b = null;
    }

    public nzv(byte[] bArr, byte[] bArr2) {
    }

    public nzv(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.b = null;
        this.c = null;
        this.a = null;
        n();
        try {
            Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
            this.b = declaredMethod;
            Method method = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
        try {
            Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
            this.c = declaredMethod2;
            Method method2 = declaredMethod2;
            declaredMethod2.setAccessible(true);
        } catch (NoSuchMethodException unused2) {
        }
        try {
            Method method3 = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
            this.a = method3;
            Method method4 = method3;
            method3.setAccessible(true);
        } catch (NoSuchMethodException unused3) {
        }
    }

    public nzv(byte[] bArr, char[] cArr) {
        ldu lduVar = ldu.a;
        this.b = lduVar;
        this.a = lduVar;
    }

    public static String a(String str, Object... objArr) {
        return String.format(Locale.ROOT, str, objArr);
    }

    public static ThreadFactory d(nzv nzvVar) {
        Object obj = nzvVar.a;
        return new mle(Executors.defaultThreadFactory(), (String) obj, obj != null ? new AtomicLong(0L) : null, (Boolean) nzvVar.c, (Integer) nzvVar.b);
    }

    public static void n() {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
    }

    public final void b() {
        this.c = true;
    }

    public final void c(String str) {
        a(str, 0);
        this.a = str;
    }

    public final jhv e() {
        jdg.u(this.a);
        if (this.b == null) {
            this.b = "Download result code: ".concat(String.valueOf(((jhu) this.a).name()));
        }
        return new jhv(this, null, null);
    }

    public final jhp f() {
        Object obj = this.c;
        if (obj != null) {
            return new jhp((jhs) obj, (lfb) this.b, (lfb) this.a);
        }
        throw new IllegalStateException("Missing required properties: dataFileGroup");
    }

    public final void g(jhs jhsVar) {
        if (jhsVar != null) {
            this.c = jhsVar;
            return;
        }
        throw new NullPointerException("Null dataFileGroup");
    }

    public final crn h() {
        Object obj;
        Object obj2;
        Object obj3 = this.c;
        if (obj3 == null || (obj = this.a) == null || (obj2 = this.b) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.c == null) {
                sb.append(" sourceId");
            }
            if (this.a == null) {
                sb.append(" viewPixels");
            }
            if (this.b == null) {
                sb.append(" sharePixels");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new crn((String) obj3, (llp) obj, (llp) obj2);
    }

    public final void i(llp llpVar) {
        if (llpVar != null) {
            this.b = llpVar;
            return;
        }
        throw new NullPointerException("Null sharePixels");
    }

    public final void j(String str) {
        if (str != null) {
            this.c = str;
            return;
        }
        throw new NullPointerException("Null sourceId");
    }

    public final void k(llp llpVar) {
        if (llpVar != null) {
            this.a = llpVar;
            return;
        }
        throw new NullPointerException("Null viewPixels");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, imn] */
    public final void l() {
        Object obj;
        ?? r0 = this.a;
        if (r0 == 0 || (obj = this.b) == null) {
            return;
        }
        r0.c((View) obj, null, true);
        this.b = null;
    }

    public final boolean m() {
        return this.a != null;
    }
}
