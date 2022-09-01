package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: ank  reason: default package */
/* loaded from: classes.dex */
public abstract class ank implements aoc, ant, ann {
    protected final aqf a;
    final Paint b;
    private final amy g;
    private final float[] i;
    private final aoh j;
    private final aoh k;
    private final List l;
    private final aoh m;
    private aoh n;
    private final PathMeasure c = new PathMeasure();
    private final Path d = new Path();
    private final Path e = new Path();
    private final RectF f = new RectF();
    private final List h = new ArrayList();

    public ank(amy amyVar, aqf aqfVar, Paint.Cap cap, Paint.Join join, float f, apg apgVar, ape apeVar, List list, ape apeVar2) {
        anj anjVar = new anj(1);
        this.b = anjVar;
        this.g = amyVar;
        this.a = aqfVar;
        anjVar.setStyle(Paint.Style.STROKE);
        anjVar.setStrokeCap(cap);
        anjVar.setStrokeJoin(join);
        anjVar.setStrokeMiter(f);
        this.k = apgVar.a();
        this.j = apeVar.a();
        if (apeVar2 == null) {
            this.m = null;
        } else {
            this.m = apeVar2.a();
        }
        this.l = new ArrayList(list.size());
        this.i = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.l.add(((ape) list.get(i)).a());
        }
        aqfVar.h(this.k);
        aqfVar.h(this.j);
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            aqfVar.h((aoh) this.l.get(i2));
        }
        aoh aohVar = this.m;
        if (aohVar != null) {
            aqfVar.h(aohVar);
        }
        this.k.g(this);
        this.j.g(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            ((aoh) this.l.get(i3)).g(this);
        }
        aoh aohVar2 = this.m;
        if (aohVar2 != null) {
            aohVar2.g(this);
        }
    }

    @Override // defpackage.apa
    public void a(Object obj, asj asjVar) {
        if (obj == and.d) {
            this.k.d = asjVar;
        } else if (obj == and.q) {
            this.j.d = asjVar;
        } else if (obj != and.E) {
        } else {
            aoh aohVar = this.n;
            if (aohVar != null) {
                this.a.j(aohVar);
            }
            aov aovVar = new aov(asjVar);
            this.n = aovVar;
            aovVar.g(this);
            this.a.h(this.n);
        }
    }

    /* JADX WARN: Type inference failed for: r10v24, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.ann
    public void b(Canvas canvas, Matrix matrix, int i) {
        float[] fArr = (float[]) ash.a.get();
        boolean z = false;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        if (fArr[0] == fArr[2] || fArr[1] == fArr[3]) {
            ami.a();
            return;
        }
        aol aolVar = (aol) this.k;
        float k = (i / 255.0f) * aolVar.k(aolVar.d(), aolVar.b());
        float f = 100.0f;
        this.b.setAlpha(asc.k((int) ((k / 100.0f) * 255.0f)));
        this.b.setStrokeWidth(((aoj) this.j).k() * ash.c(matrix));
        if (this.b.getStrokeWidth() > 0.0f) {
            if (this.l.isEmpty()) {
                ami.a();
            } else {
                float c = ash.c(matrix);
                for (int i2 = 0; i2 < this.l.size(); i2++) {
                    this.i[i2] = ((Float) ((aoh) this.l.get(i2)).e()).floatValue();
                    if (i2 % 2 == 0) {
                        float[] fArr2 = this.i;
                        if (fArr2[i2] < 1.0f) {
                            fArr2[i2] = 1.0f;
                        }
                    } else {
                        float[] fArr3 = this.i;
                        if (fArr3[i2] < 0.1f) {
                            fArr3[i2] = 0.1f;
                        }
                    }
                    float[] fArr4 = this.i;
                    fArr4[i2] = fArr4[i2] * c;
                }
                aoh aohVar = this.m;
                this.b.setPathEffect(new DashPathEffect(this.i, aohVar == null ? 0.0f : ((Float) aohVar.e()).floatValue() * c));
                ami.a();
            }
            aoh aohVar2 = this.n;
            if (aohVar2 != null) {
                this.b.setColorFilter((ColorFilter) aohVar2.e());
            }
            int i3 = 0;
            while (i3 < this.h.size()) {
                azp azpVar = (azp) this.h.get(i3);
                if (azpVar.b != null) {
                    this.d.reset();
                    int size = azpVar.a.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        this.d.addPath(((anv) azpVar.a.get(size)).i(), matrix);
                    }
                    this.c.setPath(this.d, z);
                    float length = this.c.getLength();
                    while (this.c.nextContour()) {
                        length += this.c.getLength();
                    }
                    float floatValue = (((Float) ((aob) azpVar.b).d.e()).floatValue() * length) / 360.0f;
                    float floatValue2 = ((((Float) ((aob) azpVar.b).b.e()).floatValue() * length) / f) + floatValue;
                    float floatValue3 = ((((Float) ((aob) azpVar.b).c.e()).floatValue() * length) / f) + floatValue;
                    int size2 = azpVar.a.size() - 1;
                    float f2 = 0.0f;
                    while (size2 >= 0) {
                        this.e.set(((anv) azpVar.a.get(size2)).i());
                        this.e.transform(matrix);
                        this.c.setPath(this.e, z);
                        float length2 = this.c.getLength();
                        if (floatValue3 > length) {
                            float f3 = floatValue3 - length;
                            if (f3 < f2 + length2 && f2 < f3) {
                                ash.h(this.e, floatValue2 > length ? (floatValue2 - length) / length2 : 0.0f, Math.min(f3 / length2, 1.0f), 0.0f);
                                canvas.drawPath(this.e, this.b);
                                f2 += length2;
                                size2--;
                                z = false;
                            }
                        }
                        float f4 = f2 + length2;
                        if (f4 >= floatValue2 && f2 <= floatValue3) {
                            if (f4 > floatValue3 || floatValue2 >= f2) {
                                ash.h(this.e, floatValue2 < f2 ? 0.0f : (floatValue2 - f2) / length2, floatValue3 > f4 ? 1.0f : (floatValue3 - f2) / length2, 0.0f);
                                canvas.drawPath(this.e, this.b);
                            } else {
                                canvas.drawPath(this.e, this.b);
                            }
                        }
                        f2 += length2;
                        size2--;
                        z = false;
                    }
                    ami.a();
                } else {
                    this.d.reset();
                    int size3 = azpVar.a.size();
                    while (true) {
                        size3--;
                        if (size3 < 0) {
                            break;
                        }
                        this.d.addPath(((anv) azpVar.a.get(size3)).i(), matrix);
                    }
                    ami.a();
                    canvas.drawPath(this.d, this.b);
                    ami.a();
                }
                i3++;
                f = 100.0f;
                z = false;
            }
            ami.a();
            return;
        }
        ami.a();
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.ann
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        this.d.reset();
        for (int i = 0; i < this.h.size(); i++) {
            azp azpVar = (azp) this.h.get(i);
            for (int i2 = 0; i2 < azpVar.a.size(); i2++) {
                this.d.addPath(((anv) azpVar.a.get(i2)).i(), matrix);
            }
        }
        this.d.computeBounds(this.f, false);
        float k = ((aoj) this.j).k();
        RectF rectF2 = this.f;
        float f = k / 2.0f;
        rectF2.set(rectF2.left - f, this.f.top - f, this.f.right + f, this.f.bottom + f);
        rectF.set(this.f);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        ami.a();
    }

    @Override // defpackage.aoc
    public final void d() {
        this.g.invalidateSelf();
    }

    @Override // defpackage.apa
    public final void e(aoz aozVar, int i, List list, aoz aozVar2) {
        asc.h(aozVar, i, list, aozVar2, this);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.anl
    public final void f(List list, List list2) {
        azp azpVar = null;
        aob aobVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            anl anlVar = (anl) list.get(size);
            if (anlVar instanceof aob) {
                aob aobVar2 = (aob) anlVar;
                if (aobVar2.e == 2) {
                    aobVar = aobVar2;
                }
            }
        }
        if (aobVar != null) {
            aobVar.a(this);
        }
        int size2 = list2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            anl anlVar2 = (anl) list2.get(size2);
            if (anlVar2 instanceof aob) {
                aob aobVar3 = (aob) anlVar2;
                if (aobVar3.e == 2) {
                    if (azpVar != null) {
                        this.h.add(azpVar);
                    }
                    azp azpVar2 = new azp(aobVar3);
                    aobVar3.a(this);
                    azpVar = azpVar2;
                }
            }
            if (anlVar2 instanceof anv) {
                if (azpVar == null) {
                    azpVar = new azp(aobVar);
                }
                azpVar.a.add((anv) anlVar2);
            }
        }
        if (azpVar != null) {
            this.h.add(azpVar);
        }
    }
}
