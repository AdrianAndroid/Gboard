package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.List;

/* compiled from: PG */
/* renamed from: anx  reason: default package */
/* loaded from: classes.dex */
public final class anx implements aoc, ant, anv {
    private final String c;
    private final boolean d;
    private final amy e;
    private final aoh f;
    private final aoh g;
    private final aoh h;
    private boolean i;
    private final Path a = new Path();
    private final RectF b = new RectF();
    private final aqr j = new aqr((short[]) null);

    public anx(amy amyVar, aqf aqfVar, apw apwVar) {
        this.c = apwVar.a;
        this.d = apwVar.e;
        this.e = amyVar;
        aoh a = apwVar.b.a();
        this.f = a;
        aoh a2 = apwVar.c.a();
        this.g = a2;
        aoh a3 = apwVar.d.a();
        this.h = a3;
        aqfVar.h(a);
        aqfVar.h(a2);
        aqfVar.h(a3);
        a.g(this);
        a2.g(this);
        a3.g(this);
    }

    @Override // defpackage.apa
    public final void a(Object obj, asj asjVar) {
        aoh aohVar;
        if (obj == and.j) {
            aohVar = this.g;
        } else if (obj == and.l) {
            aohVar = this.f;
        } else if (obj != and.k) {
            return;
        } else {
            aohVar = this.h;
        }
        aohVar.d = asjVar;
    }

    @Override // defpackage.aoc
    public final void d() {
        this.i = false;
        this.e.invalidateSelf();
    }

    @Override // defpackage.apa
    public final void e(aoz aozVar, int i, List list, aoz aozVar2) {
        asc.h(aozVar, i, list, aozVar2, this);
    }

    @Override // defpackage.anl
    public final void f(List list, List list2) {
        for (int i = 0; i < list.size(); i++) {
            anl anlVar = (anl) list.get(i);
            if (anlVar instanceof aob) {
                aob aobVar = (aob) anlVar;
                if (aobVar.e == 1) {
                    this.j.k(aobVar);
                    aobVar.a(this);
                }
            }
        }
    }

    @Override // defpackage.anl
    public final String g() {
        return this.c;
    }

    @Override // defpackage.anv
    public final Path i() {
        if (this.i) {
            return this.a;
        }
        this.a.reset();
        if (this.d) {
            this.i = true;
            return this.a;
        }
        PointF pointF = (PointF) this.g.e();
        float f = pointF.x / 2.0f;
        float f2 = pointF.y / 2.0f;
        float k = ((aoj) this.h).k();
        float min = Math.min(f, f2);
        if (k > min) {
            k = min;
        }
        PointF pointF2 = (PointF) this.f.e();
        this.a.moveTo(pointF2.x + f, (pointF2.y - f2) + k);
        this.a.lineTo(pointF2.x + f, (pointF2.y + f2) - k);
        if (k > 0.0f) {
            float f3 = k + k;
            this.b.set((pointF2.x + f) - f3, (pointF2.y + f2) - f3, pointF2.x + f, pointF2.y + f2);
            this.a.arcTo(this.b, 0.0f, 90.0f, false);
        }
        this.a.lineTo((pointF2.x - f) + k, pointF2.y + f2);
        if (k > 0.0f) {
            float f4 = k + k;
            this.b.set(pointF2.x - f, (pointF2.y + f2) - f4, (pointF2.x - f) + f4, pointF2.y + f2);
            this.a.arcTo(this.b, 90.0f, 90.0f, false);
        }
        this.a.lineTo(pointF2.x - f, (pointF2.y - f2) + k);
        if (k > 0.0f) {
            float f5 = k + k;
            this.b.set(pointF2.x - f, pointF2.y - f2, (pointF2.x - f) + f5, (pointF2.y - f2) + f5);
            this.a.arcTo(this.b, 180.0f, 90.0f, false);
        }
        this.a.lineTo((pointF2.x + f) - k, pointF2.y - f2);
        if (k > 0.0f) {
            float f6 = k + k;
            this.b.set((pointF2.x + f) - f6, pointF2.y - f2, pointF2.x + f, (pointF2.y - f2) + f6);
            this.a.arcTo(this.b, 270.0f, 90.0f, false);
        }
        this.a.close();
        this.j.l(this.a);
        this.i = true;
        return this.a;
    }
}
