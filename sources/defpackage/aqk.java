package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: aqk  reason: default package */
/* loaded from: classes.dex */
public final class aqk extends aqf {
    private final anm h;

    public aqk(amy amyVar, aqi aqiVar) {
        super(amyVar, aqiVar);
        anm anmVar = new anm(amyVar, this, new aqa("__container", aqiVar.a, false));
        this.h = anmVar;
        anmVar.f(Collections.emptyList(), Collections.emptyList());
    }

    @Override // defpackage.aqf, defpackage.ann
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        this.h.c(rectF, this.a, z);
    }

    @Override // defpackage.aqf
    public final void i(Canvas canvas, Matrix matrix, int i) {
        this.h.b(canvas, matrix, i);
    }

    @Override // defpackage.aqf
    public final void k(aoz aozVar, int i, List list, aoz aozVar2) {
        this.h.e(aozVar, i, list, aozVar2);
    }
}
