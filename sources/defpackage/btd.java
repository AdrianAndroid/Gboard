package defpackage;

import android.util.SparseIntArray;

/* compiled from: PG */
/* renamed from: btd  reason: default package */
/* loaded from: classes.dex */
public final class btd implements dcv {
    private static final SparseIntArray a = new SparseIntArray();
    private final StringBuilder b = new StringBuilder();

    static {
        for (int i = 0; i < 26; i++) {
            a.put("日月金木水火土竹戈十大中一弓人心手口尸廿山女田難卜重".codePointAt(i), i + 97);
        }
    }

    @Override // defpackage.dcv
    public final String a(String str) {
        int i = 0;
        this.b.setLength(0);
        int length = str.length();
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt < 97 || codePointAt > 122) {
                this.b.append(Character.toChars(codePointAt));
            } else {
                this.b.append("日月金木水火土竹戈十大中一弓人心手口尸廿山女田難卜重".charAt(codePointAt - 97));
            }
            i += Character.charCount(codePointAt);
        }
        return this.b.toString();
    }
}
