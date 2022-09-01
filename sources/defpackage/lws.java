package defpackage;

/* compiled from: PG */
/* renamed from: lws  reason: default package */
/* loaded from: classes.dex */
public enum lws {
    BOOLEAN,
    STRING,
    LONG,
    DOUBLE;

    public static lws a(Object obj) {
        if (obj instanceof String) {
            return STRING;
        }
        if (obj instanceof Boolean) {
            return BOOLEAN;
        }
        if (obj instanceof Long) {
            return LONG;
        }
        if (obj instanceof Double) {
            return DOUBLE;
        }
        StringBuilder sb = new StringBuilder("invalid tag type: ");
        Class<?> cls = obj.getClass();
        sb.append(cls);
        throw new AssertionError("invalid tag type: ".concat(String.valueOf(cls)));
    }
}
