package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: anp  reason: default package */
/* loaded from: classes.dex */
public final class anp implements ann, aoc, ant {
    private final Path a;
    private final aqf c;
    private final String d;
    private final boolean e;
    private final aoh g;
    private final aoh h;
    private aoh i;
    private final amy j;
    private final Paint b = new anj(1);
    private final List f = new ArrayList();

    public anp(amy amyVar, aqf aqfVar, apz apzVar) {
        Path path = new Path();
        this.a = path;
        this.c = aqfVar;
        this.d = apzVar.b;
        this.e = apzVar.e;
        this.j = amyVar;
        if (apzVar.c == null) {
            this.g = null;
            this.h = null;
            return;
        }
        path.setFillType(apzVar.a);
        aoh a = apzVar.c.a();
        this.g = a;
        a.g(this);
        aqfVar.h(a);
        aoh a2 = apzVar.d.a();
        this.h = a2;
        a2.g(this);
        aqfVar.h(a2);
    }

    @Override // defpackage.apa
    public final void a(Object obj, asj asjVar) {
        if (obj == and.a) {
            this.g.d = asjVar;
        } else if (obj == and.d) {
            this.h.d = asjVar;
        } else if (obj != and.E) {
        } else {
            aoh aohVar = this.i;
            if (aohVar != null) {
                this.c.j(aohVar);
            }
            aov aovVar = new aov(asjVar);
            this.i = aovVar;
            aovVar.g(this);
            this.c.h(this.i);
        }
    }

    @Override // defpackage.ann
    public final void b(Canvas canvas, Matrix matrix, int i) {
        if (this.e) {
            return;
        }
        this.b.setColor(((aoi) this.g).k());
        this.b.setAlpha(asc.k((int) ((((i / 255.0f) * ((Integer) this.h.e()).intValue()) / 100.0f) * 255.0f)));
        aoh aohVar = this.i;
        if (aohVar != null) {
            this.b.setColorFilter((ColorFilter) aohVar.e());
        }
        this.a.reset();
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            this.a.addPath(((anv) this.f.get(i2)).i(), matrix);
        }
        canvas.drawPath(this.a, this.b);
        ami.a();
    }

    @Override // defpackage.ann
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        this.a.reset();
        for (int i = 0; i < this.f.size(); i++) {
            this.a.addPath(((anv) this.f.get(i)).i(), matrix);
        }
        this.a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // defpackage.aoc
    public final void d() {
        this.j.invalidateSelf();
    }

    @Override // defpackage.apa
    public final void e(aoz aozVar, int i, List list, aoz aozVar2) {
        asc.h(aozVar, i, list, aozVar2, this);
    }

    @Override // defpackage.anl
    public final void f(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            anl anlVar = (anl) list2.get(i);
            if (anlVar instanceof anv) {
                this.f.add((anv) anlVar);
            }
        }
    }

    @Override // defpackage.anl
    public final String g() {
        return this.d;
    }
}
