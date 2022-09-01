package defpackage;

/* compiled from: PG */
/* renamed from: hig  reason: default package */
/* loaded from: classes.dex */
public enum hig {
    BOOL_VALUE,
    LONG_VALUE,
    DOUBLE_VALUE,
    STRING_VALUE,
    BYTES_VALUE,
    VALUE_NOT_SET;

    public static hig a(int i) {
        if (i != 0) {
            if (i == 1) {
                return BOOL_VALUE;
            }
            if (i == 2) {
                return LONG_VALUE;
            }
            if (i == 3) {
                return DOUBLE_VALUE;
            }
            if (i == 4) {
                return STRING_VALUE;
            }
            if (i == 5) {
                return BYTES_VALUE;
            }
            return null;
        }
        return VALUE_NOT_SET;
    }
}
