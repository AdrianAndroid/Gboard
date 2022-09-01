package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: el  reason: default package */
/* loaded from: classes.dex */
public final class el extends ev {
    qs a;
    qw b;

    public el(el elVar, eq eqVar, Resources resources) {
        super(elVar, eqVar, resources);
        if (elVar != null) {
            this.a = elVar.a;
            this.b = elVar.b;
            return;
        }
        this.a = new qs();
        this.b = new qw();
    }

    public static long c(int i, int i2) {
        return i2 | (i << 32);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a(int i) {
        Object obj;
        if (i < 0) {
            return 0;
        }
        qw qwVar = this.b;
        Integer num = 0;
        int a = qx.a(qwVar.c, qwVar.e, i);
        if (a >= 0 && (obj = qwVar.d[a]) != qw.a) {
            num = obj;
        }
        return num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int b(int[] iArr) {
        int m = super.m(iArr);
        return m >= 0 ? m : super.m(StateSet.WILD_CARD);
    }

    @Override // defpackage.ev, defpackage.es
    public final void d() {
        this.a = this.a.clone();
        this.b = this.b.clone();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(int i, int i2, Drawable drawable, boolean z) {
        int f = super.f(drawable);
        long c = c(i, i2);
        long j = true != z ? 0L : 8589934592L;
        long j2 = f;
        this.a.g(c, Long.valueOf(j2 | j));
        if (z) {
            this.a.g(c(i2, i), Long.valueOf(4294967296L | j2 | j));
        }
    }

    @Override // defpackage.ev, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new eq(this, null);
    }

    @Override // defpackage.ev, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new eq(this, resources);
    }
}
