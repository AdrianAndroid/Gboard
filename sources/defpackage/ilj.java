package defpackage;

import j$.util.Objects;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ilj  reason: default package */
/* loaded from: classes.dex */
public final class ilj {
    public final boolean a;
    volatile boolean b;
    volatile int c;
    volatile int d;
    volatile int e;
    volatile boolean f;
    volatile boolean g;
    volatile long h;
    private final int i;
    private final long j;

    public ilj(int i, long j, boolean z) {
        this.i = i;
        this.j = j;
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ilj)) {
            return false;
        }
        ilj iljVar = (ilj) obj;
        if (this.i == iljVar.i && this.j == iljVar.j && this.a == iljVar.a && this.b == iljVar.b && this.c == iljVar.c && this.d == iljVar.d) {
            int i = iljVar.e;
            if (this.f == iljVar.f && this.g == iljVar.g && this.h == iljVar.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.i), Long.valueOf(this.j), Boolean.valueOf(this.a), Boolean.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), 0, Boolean.valueOf(this.f), Boolean.valueOf(this.g), Long.valueOf(this.h));
    }

    public final String toString() {
        lfa T = jdg.T(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US).format(Long.valueOf(this.j)));
        T.f("reason", this.i);
        T.h("isFullFetch", this.a);
        T.h("success", this.b);
        T.h("isEmpty", this.f);
        T.h("isDelta", this.g);
        T.f("fetchedFlagsCount", this.c);
        T.f("deletedFlagsCount", this.d);
        T.f("updatedFlagsCount", 0);
        T.g("totalTime", this.h);
        return T.toString();
    }
}
