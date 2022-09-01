package defpackage;

import android.text.TextUtils;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: hpy  reason: default package */
/* loaded from: classes.dex */
public final class hpy {
    public static final hpy a = new hpy(hqe.OTHER, "", -1, -1, -1, -1, -1);
    public final hqe b;
    public final CharSequence c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;

    public hpy(hqe hqeVar, CharSequence charSequence, int i, int i2, int i3, int i4, int i5) {
        this.b = hqeVar;
        this.c = charSequence;
        int length = charSequence.length();
        int j = j(i, length);
        int j2 = j(i2, length);
        int j3 = j(i3, length);
        int j4 = j(i4, length);
        if (j > j2) {
            this.d = j2;
            this.e = j;
        } else {
            this.d = j;
            this.e = j2;
        }
        if (j3 == j4) {
            j4 = 0;
        } else if (j3 <= j4) {
            this.f = j3;
            this.g = j4;
            this.h = i5;
        }
        this.f = j4;
        this.g = j4;
        this.h = i5;
    }

    private final CharSequence i(int i, int i2) {
        if (i == i2) {
            return "";
        }
        return this.c.subSequence(i, Math.min(i2, this.c.length()));
    }

    private static int j(int i, int i2) {
        if (i < 0) {
            return 0;
        }
        return i > i2 ? i2 : i;
    }

    public final CharSequence a() {
        return i(this.f, this.g);
    }

    public final CharSequence b() {
        return i(this.d, this.e);
    }

    public final CharSequence c() {
        return i(this.e, this.c.length());
    }

    public final CharSequence d() {
        return i(0, this.d);
    }

    public final boolean e() {
        return this.f != this.g;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hpy)) {
            return false;
        }
        hpy hpyVar = (hpy) obj;
        return this.b == hpyVar.b && TextUtils.equals(this.c, hpyVar.c) && this.d == hpyVar.d && this.e == hpyVar.e && this.f == hpyVar.f && this.g == hpyVar.g && this.h == hpyVar.h;
    }

    public final boolean f() {
        return this.d != this.e;
    }

    public final boolean g() {
        return TextUtils.isEmpty(this.c);
    }

    public final boolean h() {
        return !equals(a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.g)});
    }
}
