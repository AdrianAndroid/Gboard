package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* renamed from: avu  reason: default package */
/* loaded from: classes.dex */
public final class avu implements avl {
    public final bbp a;

    public avu(InputStream inputStream, axn axnVar) {
        bbp bbpVar = new bbp(inputStream, axnVar);
        this.a = bbpVar;
        bbpVar.mark(5242880);
    }

    @Override // defpackage.avl
    public final void b() {
        this.a.b();
    }

    @Override // defpackage.avl
    /* renamed from: c */
    public final InputStream a() {
        this.a.reset();
        return this.a;
    }
}
