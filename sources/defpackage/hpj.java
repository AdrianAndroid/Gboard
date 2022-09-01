package defpackage;

import android.view.ViewConfiguration;

/* compiled from: PG */
/* renamed from: hpj  reason: default package */
/* loaded from: classes.dex */
public final class hpj {
    public static final long a = ViewConfiguration.getDoubleTapTimeout();
    public hsy b;
    public boolean c;
    public boolean d;
    public boolean e;
    public int f;
    public boolean g;
    public boolean h;
    public int i;
    public boolean j;
    public long k;
    public long l;

    public final long a() {
        hsy hsyVar = this.b;
        if (hsyVar != null) {
            return hsyVar.gi() & 26388279066723L;
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(boolean z) {
        if (this.g || !this.c || this.f != 0) {
            return;
        }
        c(a(), z);
    }

    public final void c(long j, boolean z) {
        hsy hsyVar = this.b;
        if (hsyVar != null) {
            hsyVar.fp(32L, false);
            if (icu.h(j)) {
                this.b.fp(64L, false);
            } else if (!z) {
                this.b.fp(8796093022273L, false);
            } else if (icu.f(j)) {
            } else {
                this.b.fp(8796093022209L, true);
            }
        }
    }

    public final boolean d() {
        long j = this.k;
        return icu.i(j) && !icu.h(j) && !icu.g(j);
    }
}
