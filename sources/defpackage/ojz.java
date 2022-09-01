package defpackage;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: PG */
/* renamed from: ojz  reason: default package */
/* loaded from: classes2.dex */
public abstract class ojz implements Serializable, ojv {
    public final ojv g;

    public ojz(ojv ojvVar) {
        this.g = ojvVar;
    }

    protected abstract Object b(Object obj);

    public ojv c(Object obj, ojv ojvVar) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    @Override // defpackage.ojv
    public final void d(Object obj) {
        ojv ojvVar = this;
        while (true) {
            oll.e(ojvVar, "frame");
            ojz ojzVar = (ojz) ojvVar;
            ojv ojvVar2 = ojzVar.g;
            oll.b(ojvVar2);
            try {
                obj = ojzVar.b(obj);
                if (obj == ojx.COROUTINE_SUSPENDED) {
                    return;
                }
            } catch (Throwable th) {
                obj = new ojd(th);
            }
            if (!(ojvVar2 instanceof ojz)) {
                ojvVar2.d(obj);
                return;
            }
            ojvVar = ojvVar2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.StackTraceElement] */
    public String toString() {
        int i;
        String str;
        StringBuilder sb = new StringBuilder("Continuation at ");
        oka okaVar = (oka) getClass().getAnnotation(oka.class);
        String str2 = null;
        if (okaVar != null) {
            int a = okaVar.a();
            if (a <= 1) {
                int i2 = -1;
                try {
                    Field declaredField = getClass().getDeclaredField("label");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(this);
                    Integer num = obj instanceof Integer ? (Integer) obj : null;
                    i = (num != null ? num.intValue() : 0) - 1;
                } catch (Exception unused) {
                    i = -1;
                }
                if (i >= 0) {
                    i2 = okaVar.e()[i];
                }
                mnl mnlVar = okb.b;
                if (mnlVar == null) {
                    try {
                        mnl mnlVar2 = new mnl(Class.class.getDeclaredMethod("getModule", new Class[0]), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
                        okb.b = mnlVar2;
                        mnlVar = mnlVar2;
                    } catch (Exception unused2) {
                        mnlVar = okb.a;
                        okb.b = mnlVar;
                    }
                }
                if (mnlVar != okb.a) {
                    Object obj2 = mnlVar.c;
                    Object invoke = obj2 != null ? ((Method) obj2).invoke(getClass(), new Object[0]) : null;
                    if (invoke != null) {
                        Object obj3 = mnlVar.b;
                        Object invoke2 = obj3 != null ? ((Method) obj3).invoke(invoke, new Object[0]) : null;
                        if (invoke2 != null) {
                            Object obj4 = mnlVar.a;
                            Object invoke3 = obj4 != null ? ((Method) obj4).invoke(invoke2, new Object[0]) : null;
                            if (invoke3 instanceof String) {
                                str2 = invoke3;
                            }
                        }
                    }
                }
                if (str2 == null) {
                    str = okaVar.b();
                } else {
                    str = str2 + '/' + okaVar.b();
                }
                str2 = new StackTraceElement(str, okaVar.d(), okaVar.c(), i2);
            } else {
                throw new IllegalStateException("Debug metadata version mismatch. Expected: 1, got " + a + ". Please update the Kotlin standard library.");
            }
        }
        if (str2 == null) {
            str2 = getClass().getName();
        }
        sb.append((Object) str2);
        return sb.toString();
    }
}
