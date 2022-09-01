package defpackage;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: wu  reason: default package */
/* loaded from: classes2.dex */
public final class wu {
    public static final wu a = b(new Locale[0]);
    private final ww b;

    private wu(ww wwVar) {
        this.b = wwVar;
    }

    public static wu b(Locale... localeArr) {
        return Build.VERSION.SDK_INT >= 24 ? d(wt.a(localeArr)) : new wu(new wv(localeArr));
    }

    public static wu c(String str) {
        if (str == null || str.isEmpty()) {
            return a;
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = ws.a(split[i]);
        }
        return b(localeArr);
    }

    public static wu d(LocaleList localeList) {
        return new wu(new wx(localeList));
    }

    public final int a() {
        return this.b.a();
    }

    public final String e() {
        return this.b.c();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof wu) && this.b.equals(((wu) obj).b);
    }

    public final Locale f(int i) {
        return this.b.d(i);
    }

    public final boolean g() {
        return this.b.e();
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return this.b.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void h() {
        String[] split = "en-Latn".split("-", -1);
        int length = split.length;
        if (length > 2) {
            new Locale(split[0], split[1], split[2]);
        } else if (length > 1) {
            new Locale(split[0], split[1]);
        } else if (length == 1) {
            new Locale(split[0]);
        } else {
            throw new IllegalArgumentException("Can not parse language tag: [en-Latn]");
        }
    }
}
