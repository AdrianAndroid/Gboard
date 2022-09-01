package defpackage;

/* compiled from: PG */
/* renamed from: at  reason: default package */
/* loaded from: classes.dex */
public class at {
    private static final qv a = new qv();

    public static Class a(ClassLoader classLoader, String str) {
        try {
            return d(classLoader, str);
        } catch (ClassCastException e) {
            throw new al("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e);
        } catch (ClassNotFoundException e2) {
            throw new al("Unable to instantiate fragment " + str + ": make sure class name exists", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(ClassLoader classLoader, String str) {
        try {
            return an.class.isAssignableFrom(d(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private static Class d(ClassLoader classLoader, String str) {
        qv qvVar = a;
        qv qvVar2 = (qv) qvVar.get(classLoader);
        if (qvVar2 == null) {
            qvVar2 = new qv();
            qvVar.put(classLoader, qvVar2);
        }
        Class cls = (Class) qvVar2.get(str);
        if (cls == null) {
            Class<?> cls2 = Class.forName(str, false, classLoader);
            qvVar2.put(str, cls2);
            return cls2;
        }
        return cls;
    }

    public an c(String str) {
        throw null;
    }
}
