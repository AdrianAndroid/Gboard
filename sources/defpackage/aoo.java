package defpackage;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* compiled from: PG */
/* renamed from: aoo  reason: default package */
/* loaded from: classes.dex */
public final class aoo extends aom {
    private final PointF e = new PointF();
    private final float[] f = new float[2];
    private final PathMeasure g = new PathMeasure();
    private aon h;

    public aoo(List list) {
        super(list);
    }

    @Override // defpackage.aoh
    public final /* synthetic */ Object f(asi asiVar, float f) {
        aon aonVar = (aon) asiVar;
        Path path = aonVar.a;
        if (path == null) {
            return (PointF) asiVar.b;
        }
        asj asjVar = this.d;
        if (asjVar != null) {
            float f2 = aonVar.g;
            aonVar.h.floatValue();
            PointF pointF = (PointF) aonVar.b;
            PointF pointF2 = (PointF) aonVar.c;
            c();
            PointF pointF3 = (PointF) asjVar.a();
            if (pointF3 != null) {
                return pointF3;
            }
        }
        if (this.h != aonVar) {
            this.g.setPath(path, false);
            this.h = aonVar;
        }
        PathMeasure pathMeasure = this.g;
        pathMeasure.getPosTan(f * pathMeasure.getLength(), this.f, null);
        PointF pointF4 = this.e;
        float[] fArr = this.f;
        pointF4.set(fArr[0], fArr[1]);
        return this.e;
    }
}
