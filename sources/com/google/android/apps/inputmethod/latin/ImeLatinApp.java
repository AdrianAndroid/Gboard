package com.google.android.apps.inputmethod.latin;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ImeLatinApp extends boj implements knl {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/latin/ImeLatinApp");

    @Override // defpackage.knl
    public final knk b() {
        return cwn.c(this).a().a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.boj, com.google.android.apps.inputmethod.libs.framework.core.AppBase
    public final void c() {
        super.c();
        jgw jgwVar = jgx.a;
        if (kts.a()) {
            registerActivityLifecycleCallbacks(new jgv(jgu.b));
        }
    }

    @Override // com.google.android.apps.inputmethod.libs.framework.core.AppBase
    protected final void d() {
        boc bocVar = new boc(this);
        bob bobVar = bob.a;
        brt brtVar = new brt(this);
        if (jez.h()) {
            jco.b = bocVar;
            jco.a = brtVar;
            ino L = ino.L();
            ind indVar = L.d;
            jem jemVar = new jem(this, bobVar, indVar);
            L.ac(jemVar);
            indVar.f(jemVar);
        }
    }

    @Override // defpackage.knl
    public final /* synthetic */ void e() {
    }
}
