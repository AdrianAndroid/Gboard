package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;

/* compiled from: PG */
/* renamed from: aoa  reason: default package */
/* loaded from: classes.dex */
public final class aoa extends ank {
    private final aqf c;
    private final String d;
    private final boolean e;
    private final aoh f;
    private aoh g;

    public aoa(amy amyVar, aqf aqfVar, aqc aqcVar) {
        super(amyVar, aqfVar, wt.d(aqcVar.i), xa.b(aqcVar.j), aqcVar.g, aqcVar.e, aqcVar.f, aqcVar.c, aqcVar.b);
        this.c = aqfVar;
        this.d = aqcVar.a;
        this.e = aqcVar.h;
        aoh a = aqcVar.d.a();
        this.f = a;
        a.g(this);
        aqfVar.h(a);
    }

    @Override // defpackage.ank, defpackage.apa
    public final void a(Object obj, asj asjVar) {
        super.a(obj, asjVar);
        if (obj == and.b) {
            this.f.d = asjVar;
        } else if (obj != and.E) {
        } else {
            aoh aohVar = this.g;
            if (aohVar != null) {
                this.c.j(aohVar);
            }
            aov aovVar = new aov(asjVar);
            this.g = aovVar;
            aovVar.g(this);
            this.c.h(this.f);
        }
    }

    @Override // defpackage.ank, defpackage.ann
    public final void b(Canvas canvas, Matrix matrix, int i) {
        if (this.e) {
            return;
        }
        this.b.setColor(((aoi) this.f).k());
        aoh aohVar = this.g;
        if (aohVar != null) {
            this.b.setColorFilter((ColorFilter) aohVar.e());
        }
        super.b(canvas, matrix, i);
    }

    @Override // defpackage.anl
    public final String g() {
        return this.d;
    }
}
