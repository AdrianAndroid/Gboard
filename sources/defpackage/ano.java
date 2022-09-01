package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

/* compiled from: PG */
/* renamed from: ano  reason: default package */
/* loaded from: classes.dex */
public final class ano implements anv, aoc, ant {
    private final String b;
    private final amy c;
    private final aoh d;
    private final aoh e;
    private final apq f;
    private boolean g;
    private final Path a = new Path();
    private final aqr h = new aqr((short[]) null);

    public ano(amy amyVar, aqf aqfVar, apq apqVar) {
        this.b = apqVar.a;
        this.c = amyVar;
        aoh a = apqVar.c.a();
        this.d = a;
        aoh a2 = apqVar.b.a();
        this.e = a2;
        this.f = apqVar;
        aqfVar.h(a);
        aqfVar.h(a2);
        a.g(this);
        a2.g(this);
    }

    @Override // defpackage.apa
    public final void a(Object obj, asj asjVar) {
        aoh aohVar;
        if (obj == and.i) {
            aohVar = this.d;
        } else if (obj != and.l) {
            return;
        } else {
            aohVar = this.e;
        }
        aohVar.d = asjVar;
    }

    @Override // defpackage.aoc
    public final void d() {
        this.g = false;
        this.c.invalidateSelf();
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
                    this.h.k(aobVar);
                    aobVar.a(this);
                }
            }
        }
    }

    @Override // defpackage.anl
    public final String g() {
        return this.b;
    }

    @Override // defpackage.anv
    public final Path i() {
        if (this.g) {
            return this.a;
        }
        this.a.reset();
        if (this.f.e) {
            this.g = true;
            return this.a;
        }
        PointF pointF = (PointF) this.d.e();
        float f = pointF.x / 2.0f;
        float f2 = pointF.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = 0.55228f * f2;
        this.a.reset();
        if (this.f.d) {
            float f5 = -f2;
            this.a.moveTo(0.0f, f5);
            float f6 = -f3;
            float f7 = -f;
            float f8 = -f4;
            this.a.cubicTo(f6, f5, f7, f8, f7, 0.0f);
            float f9 = f4 + 0.0f;
            this.a.cubicTo(f7, f9, f6, f2, 0.0f, f2);
            float f10 = f3 + 0.0f;
            this.a.cubicTo(f10, f2, f, f9, f, 0.0f);
            this.a.cubicTo(f, f8, f10, f5, 0.0f, f5);
        } else {
            float f11 = -f2;
            this.a.moveTo(0.0f, f11);
            float f12 = f3 + 0.0f;
            float f13 = -f4;
            this.a.cubicTo(f12, f11, f, f13, f, 0.0f);
            float f14 = f4 + 0.0f;
            this.a.cubicTo(f, f14, f12, f2, 0.0f, f2);
            float f15 = -f3;
            float f16 = -f;
            this.a.cubicTo(f15, f2, f16, f14, f16, 0.0f);
            this.a.cubicTo(f16, f13, f15, f11, 0.0f, f11);
        }
        PointF pointF2 = (PointF) this.e.e();
        this.a.offset(pointF2.x, pointF2.y);
        this.a.close();
        this.h.l(this.a);
        this.g = true;
        return this.a;
    }
}
