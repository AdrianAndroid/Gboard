package defpackage;

import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* renamed from: mkg  reason: default package */
/* loaded from: classes.dex */
public final class mkg {
    private static final lrc a = lrb.a.d(new lrf(2)).a();

    public static void a(Future future, Class cls, TimeUnit timeUnit) {
        int i = mkf.a;
        Iterator it = mke.b.iterator();
        while (true) {
            if (it.hasNext()) {
                if (cls.equals(((WeakReference) it.next()).get())) {
                    break;
                }
            } else {
                jdg.A(!RuntimeException.class.isAssignableFrom(cls), "Futures.getChecked exception type (%s) must not be a RuntimeException", cls);
                jdg.A(e(cls), "Futures.getChecked exception type (%s) must be an accessible class with an accessible constructor whose parameters (if any) must be of type String and/or Throwable", cls);
                if (mke.b.size() > 1000) {
                    mke.b.clear();
                }
                mke.b.add(new WeakReference(cls));
            }
        }
        try {
            future.get(60000L, timeUnit);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw c(cls, e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof Error) {
                throw new mjm((Error) cause);
            }
            if (cause instanceof RuntimeException) {
                throw new mll(cause);
            }
            throw c(cls, cause);
        } catch (TimeoutException e3) {
            throw c(cls, e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b() {
        mke mkeVar = mke.a;
    }

    private static Exception c(Class cls, Throwable th) {
        for (Constructor constructor : a.e(Arrays.asList(cls.getConstructors()))) {
            Exception exc = (Exception) d(constructor, th);
            if (exc != null) {
                if (exc.getCause() == null) {
                    exc.initCause(th);
                }
                return exc;
            }
        }
        throw new IllegalArgumentException("No appropriate constructor for exception of type " + cls + " in response to chained exception", th);
    }

    private static Object d(Constructor constructor, Throwable th) {
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        Object[] objArr = new Object[parameterTypes.length];
        for (int i = 0; i < parameterTypes.length; i++) {
            Class<?> cls = parameterTypes[i];
            if (cls.equals(String.class)) {
                objArr[i] = th.toString();
            } else if (!cls.equals(Throwable.class)) {
                return null;
            } else {
                objArr[i] = th;
            }
        }
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private static boolean e(Class cls) {
        try {
            c(cls, new Exception());
            return true;
        } catch (Error | RuntimeException unused) {
            return false;
        }
    }
}
