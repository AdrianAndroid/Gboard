package defpackage;

/* compiled from: PG */
/* renamed from: ovu  reason: default package */
/* loaded from: classes2.dex */
public final class ovu {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final int a(char c) {
        if (c < '0' || c >= ':') {
            if (c >= 'a' && c < 'g') {
                return c - 'W';
            }
            if (c >= 'A' && c < 'G') {
                return c - '7';
            }
            throw new IllegalArgumentException("Unexpected hex digit: " + c);
        }
        return c - '0';
    }
}
