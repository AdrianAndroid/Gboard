package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: bnf  reason: default package */
/* loaded from: classes.dex */
final class bnf implements Runnable {
    private final Object a;
    private final Method b;
    private final Object[] c;
    private final Class d;
    private final lgb e;

    public bnf(Object obj, Method method, Object[] objArr, Class cls) {
        this.a = obj;
        this.b = method;
        this.c = objArr;
        this.d = cls;
        this.e = new bne(obj.getClass(), method);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.b.invoke(this.a, this.c);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        } catch (IllegalArgumentException e2) {
            String valueOf = String.valueOf(this.b);
            String valueOf2 = String.valueOf(this.a.getClass());
            Object[] objArr = this.c;
            ArrayList arrayList = new ArrayList();
            if (objArr != null) {
                for (Object obj : objArr) {
                    if (obj == null) {
                        arrayList.add("null");
                    } else {
                        arrayList.add(obj.getClass().toString());
                    }
                }
            }
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Failed to call [" + valueOf + "] on delegate of type [" + valueOf2 + "] with argument list " + arrayList.toString() + " for dynamic proxy of type [" + this.d.toString() + "]");
            illegalArgumentException.initCause(e2);
            throw illegalArgumentException;
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new IllegalStateException(cause);
        }
    }

    public final String toString() {
        return ((bne) this.e).a();
    }
}
