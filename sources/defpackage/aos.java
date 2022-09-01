package defpackage;

import android.graphics.PointF;
import java.util.Collections;

/* compiled from: PG */
/* renamed from: aos  reason: default package */
/* loaded from: classes.dex */
public final class aos extends aoh {
    protected asj e;
    protected asj f;
    private final PointF g = new PointF();
    private final PointF h = new PointF();
    private final aoh i;
    private final aoh j;

    public aos(aoh aohVar, aoh aohVar2) {
        super(Collections.emptyList());
        this.i = aohVar;
        this.j = aohVar2;
        i(this.c);
    }

    @Override // defpackage.aoh
    public final /* bridge */ /* synthetic */ Object f(asi asiVar, float f) {
        return e();
    }

    @Override // defpackage.aoh
    public final void i(float f) {
        this.i.i(f);
        this.j.i(f);
        this.g.set(((Float) this.i.e()).floatValue(), ((Float) this.j.e()).floatValue());
        for (int i = 0; i < this.a.size(); i++) {
            ((aoc) this.a.get(i)).d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.aoh
    /* renamed from: k */
    public final PointF e() {
        Float f;
        asi d;
        asi d2;
        Float f2 = null;
        if (this.e == null || (d2 = this.i.d()) == null) {
            f = null;
        } else {
            this.i.b();
            Float f3 = d2.h;
            asj asjVar = this.e;
            if (f3 != null) {
                f3.floatValue();
            }
            Float f4 = (Float) d2.b;
            Float f5 = (Float) d2.c;
            f = (Float) asjVar.a();
        }
        if (this.f != null && (d = this.j.d()) != null) {
            this.j.b();
            Float f6 = d.h;
            asj asjVar2 = this.f;
            if (f6 != null) {
                f6.floatValue();
            }
            Float f7 = (Float) d.b;
            Float f8 = (Float) d.c;
            f2 = (Float) asjVar2.a();
        }
        if (f == null) {
            this.h.set(this.g.x, 0.0f);
        } else {
            this.h.set(f.floatValue(), 0.0f);
        }
        if (f2 == null) {
            PointF pointF = this.h;
            pointF.set(pointF.x, this.g.y);
        } else {
            PointF pointF2 = this.h;
            pointF2.set(pointF2.x, f2.floatValue());
        }
        return this.h;
    }
}
