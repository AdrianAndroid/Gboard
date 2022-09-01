package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: aqg  reason: default package */
/* loaded from: classes.dex */
public final class aqg extends aqf {
    private aoh h;
    private final List i = new ArrayList();
    private final RectF j = new RectF();
    private final RectF k = new RectF();

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00df, code lost:
        if (r3 >= r13.a()) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e1, code lost:
        r12 = (defpackage.aqf) r13.d(r13.b(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00eb, code lost:
        if (r12 != null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ee, code lost:
        r14 = (defpackage.aqf) r13.d(r12.c.e);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f8, code lost:
        if (r14 == null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00fa, code lost:
        r12.f = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00fc, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ff, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public aqg(defpackage.amy r12, defpackage.aqi r13, java.util.List r14, defpackage.amp r15) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqg.<init>(amy, aqi, java.util.List, amp):void");
    }

    @Override // defpackage.aqf, defpackage.apa
    public final void a(Object obj, asj asjVar) {
        super.a(obj, asjVar);
        if (obj == and.C) {
            aov aovVar = new aov(asjVar);
            this.h = aovVar;
            aovVar.g(this);
            h(this.h);
        }
    }

    @Override // defpackage.aqf, defpackage.ann
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        int size = this.i.size();
        while (true) {
            size--;
            if (size >= 0) {
                this.j.set(0.0f, 0.0f, 0.0f, 0.0f);
                ((aqf) this.i.get(size)).c(this.j, this.a, true);
                rectF.union(this.j);
            } else {
                return;
            }
        }
    }

    @Override // defpackage.aqf
    public final void i(Canvas canvas, Matrix matrix, int i) {
        RectF rectF = this.k;
        aqi aqiVar = this.c;
        rectF.set(0.0f, 0.0f, aqiVar.n, aqiVar.o);
        matrix.mapRect(this.k);
        canvas.save();
        int size = this.i.size();
        while (true) {
            size--;
            if (size >= 0) {
                if (this.k.isEmpty() || canvas.clipRect(this.k)) {
                    ((aqf) this.i.get(size)).b(canvas, matrix, i);
                }
            } else {
                canvas.restore();
                ami.a();
                return;
            }
        }
    }

    @Override // defpackage.aqf
    public final void k(aoz aozVar, int i, List list, aoz aozVar2) {
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            ((aqf) this.i.get(i2)).e(aozVar, i, list, aozVar2);
        }
    }

    @Override // defpackage.aqf
    public final void l(float f) {
        super.l(f);
        if (this.h != null) {
            f = ((((Float) this.h.e()).floatValue() * this.c.b.j) - this.c.b.h) / (this.b.a.b() + 0.01f);
        }
        if (this.h == null) {
            aqi aqiVar = this.c;
            f -= aqiVar.m / aqiVar.b.b();
        }
        aqi aqiVar2 = this.c;
        if (aqiVar2.l != 0.0f && !"__container".equals(aqiVar2.c)) {
            f /= this.c.l;
        }
        int size = this.i.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((aqf) this.i.get(size)).l(f);
            } else {
                return;
            }
        }
    }
}
