package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: lea  reason: default package */
/* loaded from: classes.dex */
public final class lea extends lek {
    private final char[] a;

    public lea() {
        char[] charArray = "-_".toString().toCharArray();
        this.a = charArray;
        Arrays.sort(charArray);
    }

    @Override // defpackage.lek
    public final boolean b(char c) {
        return Arrays.binarySearch(this.a, c) >= 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CharMatcher.anyOf(\"");
        for (char c : this.a) {
            sb.append(lek.i(c));
        }
        sb.append("\")");
        return sb.toString();
    }
}
