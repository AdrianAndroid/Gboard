package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bjl  reason: default package */
/* loaded from: classes.dex */
public final class bjl extends bjm {
    float a;
    final float b;
    final RectF c = new RectF();
    final /* synthetic */ bjo d;

    public bjl(bjo bjoVar, float f, float f2) {
        this.d = bjoVar;
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.bjm
    public final void a(String str) {
        if (this.d.i()) {
            Rect rect = new Rect();
            this.d.f.d.getTextBounds(str, 0, str.length(), rect);
            RectF rectF = new RectF(rect);
            rectF.offset(this.a, this.b);
            this.c.union(rectF);
        }
        this.a += this.d.f.d.measureText(str);
    }

    @Override // defpackage.bjm
    public final boolean b(bix bixVar) {
        if (bixVar instanceof biy) {
            biy biyVar = (biy) bixVar;
            bim d = bixVar.t.d(biyVar.a);
            if (d == null) {
                bjo.e("TextPath path reference '%s' not found", biyVar.a);
                return false;
            }
            bhu bhuVar = (bhu) d;
            Path path = new bjg(bhuVar.a).a;
            Matrix matrix = bhuVar.e;
            if (matrix != null) {
                path.transform(matrix);
            }
            RectF rectF = new RectF();
            path.computeBounds(rectF, true);
            this.c.union(rectF);
            return false;
        }
        return true;
    }
}
