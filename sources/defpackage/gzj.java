package defpackage;

/* compiled from: PG */
/* renamed from: gzj  reason: default package */
/* loaded from: classes.dex */
public enum gzj {
    INT_VALUE,
    FLOAT_VALUE,
    LONG_VALUE,
    STRING_VALUE,
    BOOL_VALUE,
    TYPE_NOT_SET;

    public static gzj a(int i) {
        if (i != 0) {
            if (i == 2) {
                return INT_VALUE;
            }
            if (i == 3) {
                return FLOAT_VALUE;
            }
            if (i == 4) {
                return LONG_VALUE;
            }
            if (i == 5) {
                return STRING_VALUE;
            }
            if (i == 6) {
                return BOOL_VALUE;
            }
            return null;
        }
        return TYPE_NOT_SET;
    }
}
