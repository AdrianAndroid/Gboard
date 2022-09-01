package defpackage;

import android.content.Context;
import android.view.inputmethod.EditorInfo;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: fbu  reason: default package */
/* loaded from: classes.dex */
public final class fbu implements jby {
    private final Context a;
    private final iav b;
    private final jbw c;
    private jby d;
    private EditorInfo e;
    private boolean f;
    private ibz g;
    private final iea h;

    public fbu(Context context, iav iavVar, jbw jbwVar, Executor executor) {
        iea ieaVar = new iea(this, 2);
        this.h = ieaVar;
        this.a = context;
        this.b = iavVar;
        this.c = jbwVar;
        ijl.b().c(ieaVar, jcg.class, executor);
    }

    private final void k() {
        this.e = null;
        this.g = null;
        this.f = false;
    }

    @Override // defpackage.jby
    public final void a(EditorInfo editorInfo, boolean z) {
        jby jbyVar = this.d;
        if (jbyVar != null) {
            jbyVar.a(editorInfo, z);
        }
        this.e = editorInfo;
        this.f = z;
    }

    @Override // defpackage.jby
    public final void b() {
        k();
        ijl.b().d(this.h, jcg.class);
    }

    @Override // defpackage.jby
    public final void c() {
        jby jbyVar = this.d;
        if (jbyVar != null) {
            jbyVar.c();
        }
        k();
    }

    @Override // defpackage.jby
    public final void d(ibz ibzVar) {
        jby jbyVar = this.d;
        if (jbyVar != null) {
            jbyVar.d(ibzVar);
        }
        this.g = ibzVar;
    }

    @Override // defpackage.jby
    public final void e(jbx jbxVar) {
        jby jbyVar = this.d;
        if (jbyVar != null) {
            jbyVar.e(jbxVar);
        }
    }

    @Override // defpackage.jby
    public final boolean f(hfd hfdVar) {
        jby jbyVar = this.d;
        return jbyVar != null && jbyVar.f(hfdVar);
    }

    @Override // defpackage.jby
    public final boolean g() {
        jby jbyVar = this.d;
        return jbyVar != null && jbyVar.g();
    }

    @Override // defpackage.jby
    public final boolean h(int i) {
        jby jbyVar = this.d;
        return jbyVar != null && jbyVar.h(i);
    }

    @Override // defpackage.jby
    public final boolean i() {
        jby jbyVar = this.d;
        return jbyVar != null && jbyVar.i();
    }

    public final void j(jbz jbzVar) {
        jby jbyVar = this.d;
        if (jbyVar != null) {
            if (jbyVar.g()) {
                this.d.e(jbx.FACTORY_CHANGED);
            }
            if (this.e != null) {
                this.d.c();
            }
            this.d = null;
        }
        if (jbzVar != null) {
            jby a = jbzVar.a(this.a, this.b, this.c, cqg.i);
            this.d = a;
            EditorInfo editorInfo = this.e;
            if (editorInfo != null) {
                a.a(editorInfo, this.f);
            }
            ibz ibzVar = this.g;
            if (ibzVar == null) {
                return;
            }
            this.d.d(ibzVar);
        }
    }
}
