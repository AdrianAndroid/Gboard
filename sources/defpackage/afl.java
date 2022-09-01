package defpackage;

import androidx.lifecycle.OnLifecycleEvent;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
@Deprecated
/* renamed from: afl  reason: default package */
/* loaded from: classes.dex */
public final class afl {
    public static final afl a = new afl();
    private final Map c = new HashMap();
    public final Map b = new HashMap();

    private static final void d(Map map, afk afkVar, afo afoVar, Class cls) {
        afo afoVar2 = (afo) map.get(afkVar);
        if (afoVar2 == null || afoVar == afoVar2) {
            if (afoVar2 != null) {
                return;
            }
            map.put(afkVar, afoVar);
            return;
        }
        Method method = afkVar.b;
        throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + afoVar2 + ", new value " + afoVar);
    }

    public final Method[] a(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.Map, java.lang.Object] */
    public final ajr b(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null) {
            hashMap.putAll(c(superclass).a);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry entry : c(cls2).a.entrySet()) {
                d(hashMap, (afk) entry.getKey(), (afo) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = a(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            OnLifecycleEvent onLifecycleEvent = (OnLifecycleEvent) method.getAnnotation(OnLifecycleEvent.class);
            if (onLifecycleEvent != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                int length = parameterTypes.length;
                if (length <= 0) {
                    i = 0;
                } else if (!parameterTypes[0].isAssignableFrom(afv.class)) {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                } else {
                    i = 1;
                }
                afo a2 = onLifecycleEvent.a();
                if (length > 1) {
                    if (parameterTypes[1].isAssignableFrom(afo.class)) {
                        if (a2 != afo.ON_ANY) {
                            throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                        }
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                }
                if (length <= 2) {
                    d(hashMap, new afk(i, method), a2, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        ajr ajrVar = new ajr(hashMap);
        this.c.put(cls, ajrVar);
        this.b.put(cls, Boolean.valueOf(z));
        return ajrVar;
    }

    public final ajr c(Class cls) {
        ajr ajrVar = (ajr) this.c.get(cls);
        return ajrVar != null ? ajrVar : b(cls, null);
    }
}
