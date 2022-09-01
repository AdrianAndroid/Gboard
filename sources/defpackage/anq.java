package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: anq  reason: default package */
/* loaded from: classes.dex */
public final class anq implements ann, aoc, ant {
    private final String a;
    private final boolean b;
    private final aqf c;
    private final Path f;
    private final aoh j;
    private final aoh k;
    private final aoh l;
    private final aoh m;
    private aoh n;
    private aov o;
    private final amy p;
    private final int q;
    private final int r;
    private final qs d = new qs();
    private final qs e = new qs();
    private final Paint g = new anj(1);
    private final RectF h = new RectF();
    private final List i = new ArrayList();

    public anq(amy amyVar, aqf aqfVar, aps apsVar) {
        Path path = new Path();
        this.f = path;
        this.c = aqfVar;
        this.a = apsVar.f;
        this.b = apsVar.g;
        this.p = amyVar;
        this.r = apsVar.h;
        path.setFillType(apsVar.a);
        this.q = (int) (amyVar.a.a() / 32.0f);
        aoh a = apsVar.b.a();
        this.j = a;
        a.g(this);
        aqfVar.h(a);
        aoh a2 = apsVar.c.a();
        this.k = a2;
        a2.g(this);
        aqfVar.h(a2);
        aoh a3 = apsVar.d.a();
        this.l = a3;
        a3.g(this);
        aqfVar.h(a3);
        aoh a4 = apsVar.e.a();
        this.m = a4;
        a4.g(this);
        aqfVar.h(a4);
    }

    private final int h() {
        int round = Math.round(this.l.c * this.q);
        int round2 = Math.round(this.m.c * this.q);
        int round3 = Math.round(this.j.c * this.q);
        int i = round != 0 ? round * 527 : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }

    private final int[] i(int[] iArr) {
        aov aovVar = this.o;
        if (aovVar != null) {
            Integer[] numArr = (Integer[]) aovVar.e();
            int length = iArr.length;
            int length2 = numArr.length;
            int i = 0;
            if (length == length2) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[length2];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    @Override // defpackage.apa
    public final void a(Object obj, asj asjVar) {
        if (obj == and.d) {
            this.k.d = asjVar;
        } else if (obj == and.E) {
            aoh aohVar = this.n;
            if (aohVar != null) {
                this.c.j(aohVar);
            }
            aov aovVar = new aov(asjVar);
            this.n = aovVar;
            aovVar.g(this);
            this.c.h(this.n);
        } else if (obj != and.F) {
        } else {
            aov aovVar2 = this.o;
            if (aovVar2 != null) {
                this.c.j(aovVar2);
            }
            this.d.h();
            this.e.h();
            aov aovVar3 = new aov(asjVar);
            this.o = aovVar3;
            aovVar3.g(this);
            this.c.h(this.o);
        }
    }

    @Override // defpackage.ann
    public final void b(Canvas canvas, Matrix matrix, int i) {
        Shader shader;
        if (this.b) {
            return;
        }
        this.f.reset();
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            this.f.addPath(((anv) this.i.get(i2)).i(), matrix);
        }
        this.f.computeBounds(this.h, false);
        if (this.r != 1) {
            long h = h();
            shader = (RadialGradient) this.e.d(h);
            if (shader == null) {
                PointF pointF = (PointF) this.l.e();
                PointF pointF2 = (PointF) this.m.e();
                azp azpVar = (azp) this.j.e();
                int[] i3 = i((int[]) azpVar.a);
                Object obj = azpVar.b;
                float f = pointF.x;
                float f2 = pointF.y;
                float hypot = (float) Math.hypot(pointF2.x - f, pointF2.y - f2);
                shader = new RadialGradient(f, f2, hypot <= 0.0f ? 0.001f : hypot, i3, (float[]) obj, Shader.TileMode.CLAMP);
                this.e.j(h, shader);
            }
        } else {
            long h2 = h();
            shader = (LinearGradient) this.d.d(h2);
            if (shader == null) {
                PointF pointF3 = (PointF) this.l.e();
                PointF pointF4 = (PointF) this.m.e();
                azp azpVar2 = (azp) this.j.e();
                LinearGradient linearGradient = new LinearGradient(pointF3.x, pointF3.y, pointF4.x, pointF4.y, i((int[]) azpVar2.a), (float[]) azpVar2.b, Shader.TileMode.CLAMP);
                this.d.j(h2, linearGradient);
                shader = linearGradient;
            }
        }
        shader.setLocalMatrix(matrix);
        this.g.setShader(shader);
        aoh aohVar = this.n;
        if (aohVar != null) {
            this.g.setColorFilter((ColorFilter) aohVar.e());
        }
        this.g.setAlpha(asc.k((int) ((((i / 255.0f) * ((Integer) this.k.e()).intValue()) / 100.0f) * 255.0f)));
        canvas.drawPath(this.f, this.g);
        ami.a();
    }

    @Override // defpackage.ann
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        this.f.reset();
        for (int i = 0; i < this.i.size(); i++) {
            this.f.addPath(((anv) this.i.get(i)).i(), matrix);
        }
        this.f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // defpackage.aoc
    public final void d() {
        this.p.invalidateSelf();
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
                this.i.add((anv) anlVar);
            }
        }
    }

    @Override // defpackage.anl
    public final String g() {
        return this.a;
    }
}
