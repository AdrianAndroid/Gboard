package defpackage;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: apy  reason: default package */
/* loaded from: classes.dex */
public final class apy {
    public final List a;
    public PointF b;
    public boolean c;

    public apy() {
        this.a = new ArrayList();
    }

    public final String toString() {
        int size = this.a.size();
        boolean z = this.c;
        return "ShapeData{numCurves=" + size + "closed=" + z + "}";
    }

    public apy(PointF pointF, boolean z, List list) {
        this.b = pointF;
        this.c = z;
        this.a = new ArrayList(list);
    }
}
