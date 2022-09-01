package defpackage;

import android.view.inputmethod.EditorInfo;

/* compiled from: PG */
/* renamed from: cqz  reason: default package */
/* loaded from: classes.dex */
public final class cqz {
    public EditorInfo a;
    public boolean b;
    public lfb c;
    public lfb d;
    public lfb e;
    public byte f;
    private cqp g;
    private int h;
    private lfb i;
    private lfb j;

    public cqz() {
    }

    public cqz(cra craVar) {
        ldu lduVar = ldu.a;
        this.i = lduVar;
        this.j = lduVar;
        this.c = lduVar;
        this.d = lduVar;
        this.e = lduVar;
        this.g = craVar.a;
        this.h = craVar.b;
        this.a = craVar.c;
        this.b = craVar.d;
        this.i = craVar.e;
        this.j = craVar.f;
        this.c = craVar.g;
        this.d = craVar.h;
        this.e = craVar.i;
        this.f = (byte) 7;
    }

    public cqz(byte[] bArr) {
        ldu lduVar = ldu.a;
        this.i = lduVar;
        this.j = lduVar;
        this.c = lduVar;
        this.d = lduVar;
        this.e = lduVar;
    }

    public final cra a() {
        if (this.f != 7 || this.g == null || this.a == null) {
            StringBuilder sb = new StringBuilder();
            if (this.g == null) {
                sb.append(" image");
            }
            if ((this.f & 1) == 0) {
                sb.append(" position");
            }
            if (this.a == null) {
                sb.append(" editorInfo");
            }
            if ((this.f & 2) == 0) {
                sb.append(" incognito");
            }
            if ((this.f & 4) == 0) {
                sb.append(" disableShareIntent");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new cra(this.g, this.h, this.a, this.b, this.i, this.j, this.c, this.d, this.e);
    }

    public final void b(cqp cqpVar) {
        if (cqpVar != null) {
            this.g = cqpVar;
            return;
        }
        throw new NullPointerException("Null image");
    }

    public final void c(int i) {
        this.h = i;
        this.f = (byte) (this.f | 1);
    }

    public final void d(cri criVar) {
        this.j = lfb.g(criVar);
    }

    public final void e(lfb lfbVar) {
        if (lfbVar != null) {
            this.j = lfbVar;
            return;
        }
        throw new NullPointerException("Null recentImages");
    }

    public final void f(lgb lgbVar) {
        this.i = lfb.g(lgbVar);
    }
}
