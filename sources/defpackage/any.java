package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* renamed from: any  reason: default package */
/* loaded from: classes.dex */
public final class any implements ann, anv, ans, aoc, ant {
    private final Matrix a = new Matrix();
    private final Path b = new Path();
    private final amy c;
    private final aqf d;
    private final String e;
    private final boolean f;
    private final aoh g;
    private final aoh h;
    private final aou i;
    private anm j;

    public any(amy amyVar, aqf aqfVar, apx apxVar) {
        this.c = amyVar;
        this.d = aqfVar;
        this.e = apxVar.a;
        this.f = apxVar.e;
        aoh a = apxVar.b.a();
        this.g = a;
        aqfVar.h(a);
        a.g(this);
        aoh a2 = apxVar.c.a();
        this.h = a2;
        aqfVar.h(a2);
        a2.g(this);
        aou b = apxVar.d.b();
        this.i = b;
        b.c(aqfVar);
        b.d(this);
    }

    @Override // defpackage.apa
    public final void a(Object obj, asj asjVar) {
        aoh aohVar;
        if (this.i.e(obj, asjVar)) {
            return;
        }
        if (obj == and.s) {
            aohVar = this.g;
        } else if (obj != and.t) {
            return;
        } else {
            aohVar = this.h;
        }
        aohVar.d = asjVar;
    }

    @Override // defpackage.ann
    public final void b(Canvas canvas, Matrix matrix, int i) {
        float floatValue = ((Float) this.g.e()).floatValue();
        float floatValue2 = ((Float) this.h.e()).floatValue();
        float floatValue3 = ((Float) this.i.h.e()).floatValue() / 100.0f;
        float floatValue4 = ((Float) this.i.i.e()).floatValue() / 100.0f;
        int i2 = (int) floatValue;
        while (true) {
            i2--;
            if (i2 >= 0) {
                this.a.set(matrix);
                float f = i2;
                this.a.preConcat(this.i.b(f + floatValue2));
                this.j.b(canvas, this.a, (int) (i * asc.c(floatValue3, floatValue4, f / floatValue)));
            } else {
                return;
            }
        }
    }

    @Override // defpackage.ann
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        this.j.c(rectF, matrix, z);
    }

    @Override // defpackage.aoc
    public final void d() {
        this.c.invalidateSelf();
    }

    @Override // defpackage.apa
    public final void e(aoz aozVar, int i, List list, aoz aozVar2) {
        asc.h(aozVar, i, list, aozVar2, this);
    }

    @Override // defpackage.anl
    public final void f(List list, List list2) {
        this.j.f(list, list2);
    }

    @Override // defpackage.anl
    public final String g() {
        return this.e;
    }

    @Override // defpackage.ans
    public final void h(ListIterator listIterator) {
        if (this.j == null) {
            while (listIterator.hasPrevious() && listIterator.previous() != this) {
            }
            ArrayList arrayList = new ArrayList();
            while (listIterator.hasPrevious()) {
                arrayList.add((anl) listIterator.previous());
                listIterator.remove();
            }
            Collections.reverse(arrayList);
            this.j = new anm(this.c, this.d, "Repeater", this.f, arrayList, null);
        }
    }

    @Override // defpackage.anv
    public final Path i() {
        Path i = this.j.i();
        this.b.reset();
        float floatValue = ((Float) this.g.e()).floatValue();
        float floatValue2 = ((Float) this.h.e()).floatValue();
        int i2 = (int) floatValue;
        while (true) {
            i2--;
            if (i2 >= 0) {
                this.a.set(this.i.b(i2 + floatValue2));
                this.b.addPath(i, this.a);
            } else {
                return this.b;
            }
        }
    }
}
