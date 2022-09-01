package defpackage;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lvj  reason: default package */
/* loaded from: classes.dex */
public final class lvj {
    public static final lvl a;

    static {
        String[] strArr;
        strArr = lvl.d;
        a = a(strArr);
    }

    private static lvl a(String[] strArr) {
        lvl lvlVar;
        try {
            lvlVar = lvw.d();
        } catch (NoClassDefFoundError unused) {
            lvlVar = null;
        }
        if (lvlVar != null) {
            return lvlVar;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            try {
                return (lvl) Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable th) {
                th = th;
                if (th instanceof InvocationTargetException) {
                    th = th.getCause();
                }
                sb.append('\n');
                sb.append(str);
                sb.append(": ");
                sb.append(th);
            }
        }
        throw new IllegalStateException(sb.insert(0, "No logging platforms found:").toString());
    }
}
