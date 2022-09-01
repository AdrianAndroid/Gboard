package defpackage;

import android.graphics.PointF;
import java.util.List;

/* compiled from: PG */
/* renamed from: aop  reason: default package */
/* loaded from: classes.dex */
public final class aop extends aom {
    private final PointF e = new PointF();

    public aop(List list) {
        super(list);
    }

    @Override // defpackage.aoh
    public final /* synthetic */ Object f(asi asiVar, float f) {
        return j(asiVar, f, f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aoh
    /* renamed from: k */
    public final PointF j(asi asiVar, float f, float f2) {
        Object obj;
        Object obj2 = asiVar.b;
        if (obj2 == null || (obj = asiVar.c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF = (PointF) obj2;
        PointF pointF2 = (PointF) obj;
        asj asjVar = this.d;
        if (asjVar != null) {
            float f3 = asiVar.g;
            asiVar.h.floatValue();
            c();
            PointF pointF3 = (PointF) asjVar.a();
            if (pointF3 != null) {
                return pointF3;
            }
        }
        this.e.set(pointF.x + (f * (pointF2.x - pointF.x)), pointF.y + (f2 * (pointF2.y - pointF.y)));
        return this.e;
    }
}
