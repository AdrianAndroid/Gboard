package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: aqf  reason: default package */
/* loaded from: classes.dex */
public abstract class aqf implements ann, aoc, apa {
    final amy b;
    final aqi c;
    public aoj d;
    public aqf e;
    public aqf f;
    final aou g;
    private final Paint m;
    private List s;
    private fws v;
    private final Path h = new Path();
    private final Matrix i = new Matrix();
    private final Paint j = new anj(1);
    private final Paint k = new anj(PorterDuff.Mode.DST_IN, null);
    private final Paint l = new anj(PorterDuff.Mode.DST_OUT, null);
    private final Paint n = new anj(PorterDuff.Mode.CLEAR);
    private final RectF o = new RectF();
    private final RectF p = new RectF();
    private final RectF q = new RectF();
    private final RectF r = new RectF();
    final Matrix a = new Matrix();
    private final List t = new ArrayList();
    private boolean u = true;

    /* JADX WARN: Type inference failed for: r5v19, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v22, types: [java.util.List, java.lang.Object] */
    public aqf(amy amyVar, aqi aqiVar) {
        boolean z = true;
        anj anjVar = new anj(1);
        this.m = anjVar;
        this.b = amyVar;
        this.c = aqiVar;
        String str = aqiVar.c;
        if (aqiVar.u == 3) {
            anjVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            anjVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        aou b = aqiVar.h.b();
        this.g = b;
        b.d(this);
        List list = aqiVar.g;
        if (list != null && !list.isEmpty()) {
            fws fwsVar = new fws(aqiVar.g);
            this.v = fwsVar;
            for (aoh aohVar : fwsVar.a) {
                aohVar.g(this);
            }
            for (aoh aohVar2 : this.v.b) {
                h(aohVar2);
                aohVar2.g(this);
            }
        }
        if (!this.c.r.isEmpty()) {
            aoj aojVar = new aoj(this.c.r);
            this.d = aojVar;
            aojVar.b = true;
            aojVar.g(new aqe(this));
            m(((Float) this.d.e()).floatValue() != 1.0f ? false : z);
            h(this.d);
            return;
        }
        m(true);
    }

    private final void p() {
        if (this.s != null) {
            return;
        }
        if (this.f == null) {
            this.s = Collections.emptyList();
            return;
        }
        this.s = new ArrayList();
        for (aqf aqfVar = this.f; aqfVar != null; aqfVar = aqfVar.f) {
            this.s.add(aqfVar);
        }
    }

    private final void q(Canvas canvas) {
        canvas.drawRect(this.o.left - 1.0f, this.o.top - 1.0f, this.o.right + 1.0f, this.o.bottom + 1.0f, this.n);
        ami.a();
    }

    private final void r() {
        this.b.invalidateSelf();
    }

    private final void s() {
        wk wkVar = this.b.a.m;
        String str = this.c.c;
    }

    @Override // defpackage.apa
    public void a(Object obj, asj asjVar) {
        this.g.e(obj, asjVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x012d  */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v57, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v44, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v48, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.ann
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(android.graphics.Canvas r17, android.graphics.Matrix r18, int r19) {
        /*
            Method dump skipped, instructions count: 994
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqf.b(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    @Override // defpackage.ann
    public void c(RectF rectF, Matrix matrix, boolean z) {
        this.o.set(0.0f, 0.0f, 0.0f, 0.0f);
        p();
        this.a.set(matrix);
        if (z) {
            List list = this.s;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    this.a.preConcat(((aqf) this.s.get(size)).g.a());
                }
            } else {
                aqf aqfVar = this.f;
                if (aqfVar != null) {
                    this.a.preConcat(aqfVar.g.a());
                }
            }
        }
        this.a.preConcat(this.g.a());
    }

    @Override // defpackage.aoc
    public final void d() {
        r();
    }

    @Override // defpackage.apa
    public final void e(aoz aozVar, int i, List list, aoz aozVar2) {
        aqf aqfVar = this.e;
        if (aqfVar != null) {
            aoz b = aozVar2.b(aqfVar.g());
            if (aozVar.d(this.e.g(), i)) {
                list.add(b.c(this.e));
            }
            if (aozVar.f(g(), i)) {
                this.e.k(aozVar, aozVar.a(this.e.g(), i) + i, list, b);
            }
        }
        if (!aozVar.e(g(), i)) {
            return;
        }
        if (!"__container".equals(g())) {
            aozVar2 = aozVar2.b(g());
            if (aozVar.d(g(), i)) {
                list.add(aozVar2.c(this));
            }
        }
        if (!aozVar.f(g(), i)) {
            return;
        }
        k(aozVar, i + aozVar.a(g(), i), list, aozVar2);
    }

    @Override // defpackage.anl
    public final void f(List list, List list2) {
    }

    @Override // defpackage.anl
    public final String g() {
        return this.c.c;
    }

    public final void h(aoh aohVar) {
        if (aohVar == null) {
            return;
        }
        this.t.add(aohVar);
    }

    public abstract void i(Canvas canvas, Matrix matrix, int i);

    public final void j(aoh aohVar) {
        this.t.remove(aohVar);
    }

    public void k(aoz aozVar, int i, List list, aoz aozVar2) {
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.List, java.lang.Object] */
    public void l(float f) {
        aou aouVar = this.g;
        aoh aohVar = aouVar.e;
        if (aohVar != null) {
            aohVar.i(f);
        }
        aoh aohVar2 = aouVar.h;
        if (aohVar2 != null) {
            aohVar2.i(f);
        }
        aoh aohVar3 = aouVar.i;
        if (aohVar3 != null) {
            aohVar3.i(f);
        }
        aoh aohVar4 = aouVar.a;
        if (aohVar4 != null) {
            aohVar4.i(f);
        }
        aoh aohVar5 = aouVar.b;
        if (aohVar5 != null) {
            aohVar5.i(f);
        }
        aoh aohVar6 = aouVar.c;
        if (aohVar6 != null) {
            aohVar6.i(f);
        }
        aoh aohVar7 = aouVar.d;
        if (aohVar7 != null) {
            aohVar7.i(f);
        }
        aoj aojVar = aouVar.f;
        if (aojVar != null) {
            aojVar.i(f);
        }
        aoj aojVar2 = aouVar.g;
        if (aojVar2 != null) {
            aojVar2.i(f);
        }
        if (this.v != null) {
            for (int i = 0; i < this.v.a.size(); i++) {
                ((aoh) this.v.a.get(i)).i(f);
            }
        }
        aoj aojVar3 = this.d;
        if (aojVar3 != null) {
            aojVar3.i(f);
        }
        aqf aqfVar = this.e;
        if (aqfVar != null) {
            aqfVar.l(f);
        }
        for (int i2 = 0; i2 < this.t.size(); i2++) {
            ((aoh) this.t.get(i2)).i(f);
        }
    }

    public final void m(boolean z) {
        if (z != this.u) {
            this.u = z;
            r();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List, java.lang.Object] */
    final boolean n() {
        fws fwsVar = this.v;
        return fwsVar != null && !fwsVar.a.isEmpty();
    }

    final boolean o() {
        return this.e != null;
    }
}
