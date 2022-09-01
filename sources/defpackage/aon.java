package defpackage;

import android.graphics.Path;
import android.graphics.PointF;

/* compiled from: PG */
/* renamed from: aon  reason: default package */
/* loaded from: classes.dex */
public final class aon extends asi {
    public Path a;
    private final asi o;

    public aon(amp ampVar, asi asiVar) {
        super(ampVar, (PointF) asiVar.b, (PointF) asiVar.c, asiVar.d, asiVar.e, asiVar.f, asiVar.g, asiVar.h);
        this.o = asiVar;
        a();
    }

    public final void a() {
        Object obj;
        Object obj2;
        Object obj3 = this.c;
        boolean z = false;
        if (obj3 != null && (obj2 = this.b) != null && ((PointF) obj2).equals(((PointF) obj3).x, ((PointF) this.c).y)) {
            z = true;
        }
        Object obj4 = this.b;
        if (obj4 == null || (obj = this.c) == null || z) {
            return;
        }
        asi asiVar = this.o;
        this.a = ash.f((PointF) obj4, (PointF) obj, asiVar.m, asiVar.n);
    }
}
