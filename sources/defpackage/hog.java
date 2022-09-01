package defpackage;

/* compiled from: PG */
/* renamed from: hog  reason: default package */
/* loaded from: classes.dex */
public final class hog implements idm {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/inlinesuggestion/InlineSuggestionMetricsProcessor");
    public static final llw b = llw.m("com.google.android.gm", "Gmail", "com.google.android.apps.messaging", "Messaging");
    public final idi c;
    private idb d;

    public hog(idi idiVar) {
        this.c = idiVar;
    }

    public final idb a() {
        if (this.d == null) {
            this.d = new hoh(this);
        }
        return this.d;
    }

    @Override // defpackage.idj
    public final void e() {
    }

    @Override // defpackage.idj
    public final void f() {
    }

    @Override // defpackage.idm
    public final void p(ido idoVar, idu iduVar, long j, long j2, Object... objArr) {
        a().b(idoVar, iduVar, j, j2, objArr);
    }

    @Override // defpackage.idm
    public final /* synthetic */ void r(idl idlVar) {
    }

    @Override // defpackage.idj
    public final /* synthetic */ boolean s() {
        return true;
    }

    @Override // defpackage.idm
    public final ido[] t() {
        a();
        return hoh.a;
    }
}
