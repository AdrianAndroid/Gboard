package defpackage;

import j$.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: loh  reason: default package */
/* loaded from: classes.dex */
public final class loh extends llh implements lok {
    final int c;
    loh d;
    lok e;
    lok f;
    loh g;
    loh h;

    public loh(Object obj, Object obj2, int i, loh lohVar) {
        super(obj, obj2);
        this.c = i;
        this.d = lohVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static loh c() {
        return new loh(null, null, 0, null);
    }

    public final loh a() {
        return (loh) Objects.requireNonNull(this.g);
    }

    public final loh b() {
        return (loh) Objects.requireNonNull(this.h);
    }

    @Override // defpackage.lok
    public final lok d() {
        return (lok) Objects.requireNonNull(this.f);
    }

    @Override // defpackage.lok
    public final void e(lok lokVar) {
        this.e = lokVar;
    }

    @Override // defpackage.lok
    public final void f(lok lokVar) {
        this.f = lokVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean g(Object obj, int i) {
        return this.c == i && jdg.W(this.b, obj);
    }
}
