package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* renamed from: aqn  reason: default package */
/* loaded from: classes.dex */
public final class aqn extends aqf {
    private aoh A;
    private final StringBuilder h = new StringBuilder(2);
    private final RectF i = new RectF();
    private final Matrix j = new Matrix();
    private final Paint k = new aqm(null);
    private final Paint l = new aqm();
    private final Map m = new HashMap();
    private final qs n = new qs();
    private final aot o;
    private final amy p;
    private final amp q;
    private aoh r;
    private aoh s;
    private aoh t;
    private aoh u;
    private aoh v;
    private aoh w;
    private aoh x;
    private aoh y;
    private aoh z;

    public aqn(amy amyVar, aqi aqiVar) {
        super(amyVar, aqiVar);
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        this.p = amyVar;
        this.q = aqiVar.b;
        aot a = aqiVar.p.a();
        this.o = a;
        a.g(this);
        h(a);
        bhc bhcVar = aqiVar.v;
        if (bhcVar != null && (obj4 = bhcVar.c) != null) {
            aoh a2 = ((apd) obj4).a();
            this.r = a2;
            a2.g(this);
            h(this.r);
        }
        if (bhcVar != null && (obj3 = bhcVar.d) != null) {
            aoh a3 = ((apd) obj3).a();
            this.t = a3;
            a3.g(this);
            h(this.t);
        }
        if (bhcVar != null && (obj2 = bhcVar.b) != null) {
            aoh a4 = ((ape) obj2).a();
            this.v = a4;
            a4.g(this);
            h(this.v);
        }
        if (bhcVar == null || (obj = bhcVar.a) == null) {
            return;
        }
        aoh a5 = ((ape) obj).a();
        this.x = a5;
        a5.g(this);
        h(this.x);
    }

    private static final void q(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    private static final void r(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    private static final List s(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\n", "\r").split("\r"));
    }

    @Override // defpackage.aqf, defpackage.apa
    public final void a(Object obj, asj asjVar) {
        super.a(obj, asjVar);
        if (obj == and.a) {
            aoh aohVar = this.s;
            if (aohVar != null) {
                j(aohVar);
            }
            aov aovVar = new aov(asjVar);
            this.s = aovVar;
            aovVar.g(this);
            h(this.s);
        } else if (obj == and.b) {
            aoh aohVar2 = this.u;
            if (aohVar2 != null) {
                j(aohVar2);
            }
            aov aovVar2 = new aov(asjVar);
            this.u = aovVar2;
            aovVar2.g(this);
            h(this.u);
        } else if (obj == and.q) {
            aoh aohVar3 = this.w;
            if (aohVar3 != null) {
                j(aohVar3);
            }
            aov aovVar3 = new aov(asjVar);
            this.w = aovVar3;
            aovVar3.g(this);
            h(this.w);
        } else if (obj == and.r) {
            aoh aohVar4 = this.y;
            if (aohVar4 != null) {
                j(aohVar4);
            }
            aov aovVar4 = new aov(asjVar);
            this.y = aovVar4;
            aovVar4.g(this);
            h(this.y);
        } else if (obj == and.D) {
            aoh aohVar5 = this.z;
            if (aohVar5 != null) {
                j(aohVar5);
            }
            aov aovVar5 = new aov(asjVar);
            this.z = aovVar5;
            aovVar5.g(this);
            h(this.z);
        } else if (obj != and.G) {
        } else {
            aoh aohVar6 = this.A;
            if (aohVar6 != null) {
                j(aohVar6);
            }
            aov aovVar6 = new aov(asjVar);
            this.A = aovVar6;
            aovVar6.g(this);
            h(this.A);
        }
    }

    @Override // defpackage.aqf, defpackage.ann
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        rectF.set(0.0f, 0.0f, this.q.g.width(), this.q.g.height());
    }

    /* JADX WARN: Removed duplicated region for block: B:162:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x03c9  */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.util.Map, java.lang.Object] */
    @Override // defpackage.aqf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(android.graphics.Canvas r21, android.graphics.Matrix r22, int r23) {
        /*
            Method dump skipped, instructions count: 1213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqn.i(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    private static final void p(int i, Canvas canvas, float f) {
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 1) {
                canvas.translate(-f, 0.0f);
                return;
            } else if (i2 != 2) {
                return;
            } else {
                canvas.translate((-f) / 2.0f, 0.0f);
                return;
            }
        }
        throw null;
    }
}
