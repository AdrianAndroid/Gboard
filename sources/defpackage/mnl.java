package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.EnumMap;

/* compiled from: PG */
/* renamed from: mnl  reason: default package */
/* loaded from: classes2.dex */
public final class mnl {
    public final Object a;
    public final Object b;
    public final Object c;

    public mnl() {
    }

    public mnl(fnz fnzVar, mmk mmkVar, moi moiVar) {
        this.a = fnzVar;
        fyb.ax(mmkVar);
        this.c = mmkVar;
        this.b = moiVar;
        if (moiVar.a() == null) {
            Log.w("FDL", "FDL logging failed. Add a dependency for Firebase Analytics to your app to enable logging of Dynamic Link events.");
        }
    }

    public mnl(Class cls, String str, Class... clsArr) {
        this.b = cls;
        this.c = str;
        this.a = clsArr;
    }

    public mnl(Method method, Method method2, Method method3) {
        this.c = method;
        this.b = method2;
        this.a = method3;
    }

    public static synchronized mnl a() {
        mnl b;
        synchronized (mnl.class) {
            b = b(mmk.a());
        }
        return b;
    }

    public static synchronized mnl b(mmk mmkVar) {
        mnl mnlVar;
        synchronized (mnl.class) {
            mmkVar.e();
            mnlVar = (mnl) mmkVar.d.a(mnl.class);
        }
        return mnlVar;
    }

    public static void d(Bundle bundle) {
        Uri uri = (Uri) bundle.getParcelable("dynamicLink");
        if (!TextUtils.isEmpty(bundle.getString("domainUriPrefix")) || uri != null) {
            return;
        }
        throw new IllegalArgumentException("FDL domain is missing. Set with setDomainUriPrefix() or setDynamicLinkDomain().");
    }

    private final Method h(Class cls) {
        Object obj;
        Method i = i(cls, (String) this.c, (Class[]) this.a);
        if (i == null || (obj = this.b) == null) {
            return i;
        }
        if (((Class) obj).isAssignableFrom(i.getReturnType())) {
            return i;
        }
        return null;
    }

    private static Method i(Class cls, String str, Class[] clsArr) {
        if (cls == null) {
            return null;
        }
        try {
            if ((cls.getModifiers() & 1) == 0) {
                return i(cls.getSuperclass(), str, clsArr);
            }
            Method method = cls.getMethod(str, clsArr);
            try {
                if (1 != (method.getModifiers() & 1)) {
                    return null;
                }
            } catch (NoSuchMethodException unused) {
            }
            return method;
        } catch (NoSuchMethodException unused2) {
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [moi, java.lang.Object] */
    public final gen c(Intent intent) {
        gen h = ((fnz) this.a).h(new mnt(this.b, intent.getDataString()));
        mnm mnmVar = (mnm) fyb.B(intent, "com.google.firebase.dynamiclinks.DYNAMIC_LINK_DATA", mnm.CREATOR);
        mlu mluVar = mnmVar != null ? new mlu(mnmVar) : null;
        return mluVar != null ? gni.e(mluVar) : h;
    }

    public final Object e(Object obj, Object... objArr) {
        try {
            Method h = h(obj.getClass());
            if (h == null) {
                Object obj2 = this.c;
                String valueOf = String.valueOf(obj);
                throw new AssertionError("Method " + ((String) obj2) + " not supported for object " + valueOf);
            }
            try {
                return h.invoke(obj, objArr);
            } catch (IllegalAccessException e) {
                AssertionError assertionError = new AssertionError("Unexpectedly could not call: ".concat(h.toString()));
                assertionError.initCause(e);
                throw assertionError;
            }
        } catch (InvocationTargetException e2) {
            Throwable targetException = e2.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError2 = new AssertionError("Unexpected exception");
            assertionError2.initCause(targetException);
            throw assertionError2;
        }
    }

    public final boolean f(Object obj) {
        return h(obj.getClass()) != null;
    }

    public final void g(Object obj, Object... objArr) {
        try {
            Method h = h(obj.getClass());
            if (h == null) {
                return;
            }
            try {
                h.invoke(obj, objArr);
            } catch (IllegalAccessException unused) {
            }
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public mnl(byte[] bArr) {
        EnumMap enumMap = new EnumMap(ndo.class);
        this.a = "";
        this.c = enumMap;
        this.b = new EnumMap(ndo.class);
    }
}
