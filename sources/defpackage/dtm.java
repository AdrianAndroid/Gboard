package defpackage;

import android.view.inputmethod.EditorInfo;
import j$.util.function.Supplier;

/* compiled from: PG */
/* renamed from: dtm  reason: default package */
/* loaded from: classes.dex */
public final class dtm implements jby {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/nga/impl/NgaVoiceInputHandlerSwitcher");
    private final dtj b;
    private final dtq c;
    private final Supplier d;
    private jby e;
    private EditorInfo f;
    private boolean g;
    private ibz h;

    public dtm(dtj dtjVar, dtq dtqVar, Supplier supplier) {
        this.d = supplier;
        this.b = dtjVar;
        this.c = dtqVar;
    }

    @Override // defpackage.jby
    public final void a(EditorInfo editorInfo, boolean z) {
        this.f = editorInfo;
        this.g = z;
        jby jbyVar = this.e;
        if (jbyVar == null) {
            this.c.c(editorInfo, z);
        } else {
            jbyVar.a(editorInfo, z);
        }
    }

    @Override // defpackage.jby
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.jby
    public final void c() {
        jby jbyVar = this.e;
        if (jbyVar == null) {
            this.c.d();
        } else {
            jbyVar.c();
        }
    }

    @Override // defpackage.jby
    public final void d(ibz ibzVar) {
        this.h = ibzVar;
        jby jbyVar = this.e;
        if (jbyVar == null) {
            this.c.a();
        } else {
            jbyVar.d(ibzVar);
        }
    }

    @Override // defpackage.jby
    public final void e(jbx jbxVar) {
        jby jbyVar = this.e;
        if (jbyVar == null) {
            this.c.e(jbxVar);
        } else {
            jbyVar.e(jbxVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0186  */
    @Override // defpackage.jby
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f(defpackage.hfd r15) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dtm.f(hfd):boolean");
    }

    @Override // defpackage.jby
    public final boolean g() {
        jby jbyVar = this.e;
        return jbyVar == null ? this.c.f() : jbyVar.g();
    }

    @Override // defpackage.jby
    public final boolean h(int i) {
        jby jbyVar = this.e;
        return jbyVar == null ? i == -10042 || i == -10066 || i == -10108 : jbyVar.h(i);
    }

    @Override // defpackage.jby
    public final boolean i() {
        jby jbyVar = this.e;
        return jbyVar == null ? this.c.f() : jbyVar.i();
    }

    public final void j() {
        jby jbyVar = this.e;
        if (jbyVar == null) {
            return;
        }
        jbyVar.e(jbx.ABORT_COMPOSING);
        this.e.c();
        this.e = null;
        EditorInfo editorInfo = this.f;
        if (editorInfo != null) {
            this.c.c(editorInfo, this.g);
        }
        if (this.h == null) {
            return;
        }
        this.c.a();
    }

    public final void k() {
        if (this.e != null) {
            return;
        }
        this.c.e(jbx.ABORT_COMPOSING);
        this.c.d();
        jby jbyVar = (jby) this.d.get();
        this.e = jbyVar;
        EditorInfo editorInfo = this.f;
        if (editorInfo != null) {
            jbyVar.a(editorInfo, this.g);
        }
        ibz ibzVar = this.h;
        if (ibzVar == null) {
            return;
        }
        this.e.d(ibzVar);
    }
}
