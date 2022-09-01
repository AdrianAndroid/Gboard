package defpackage;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: aoh  reason: default package */
/* loaded from: classes.dex */
public abstract class aoh {
    public asj d;
    private final aoe e;
    final List a = new ArrayList(1);
    public boolean b = false;
    public float c = 0.0f;
    private Object f = null;
    private float g = -1.0f;
    private float h = -1.0f;

    public aoh(List list) {
        aoe aofVar;
        aoe aoeVar;
        if (list.isEmpty()) {
            aoeVar = new aod();
        } else {
            if (list.size() == 1) {
                aofVar = new aog(list);
            } else {
                aofVar = new aof(list);
            }
            aoeVar = aofVar;
        }
        this.e = aoeVar;
    }

    private final float k() {
        float f = this.g;
        if (f == -1.0f) {
            float b = this.e.b();
            this.g = b;
            return b;
        }
        return f;
    }

    public float a() {
        float f = this.h;
        if (f == -1.0f) {
            float a = this.e.a();
            this.h = a;
            return a;
        }
        return f;
    }

    public final float b() {
        asi d = d();
        if (d.e()) {
            return 0.0f;
        }
        return d.d.getInterpolation(c());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final float c() {
        if (this.b) {
            return 0.0f;
        }
        asi d = d();
        if (!d.e()) {
            return (this.c - d.c()) / (d.b() - d.c());
        }
        return 0.0f;
    }

    public final asi d() {
        asi c = this.e.c();
        ami.a();
        return c;
    }

    public Object e() {
        Object f;
        float c = c();
        if (this.d != null || !this.e.d(c)) {
            asi d = d();
            Interpolator interpolator = d.e;
            if (interpolator == null || d.f == null) {
                f = f(d, b());
            } else {
                f = j(d, interpolator.getInterpolation(c), d.f.getInterpolation(c));
            }
            this.f = f;
            return f;
        }
        return this.f;
    }

    public abstract Object f(asi asiVar, float f);

    public final void g(aoc aocVar) {
        this.a.add(aocVar);
    }

    public void h() {
        for (int i = 0; i < this.a.size(); i++) {
            ((aoc) this.a.get(i)).d();
        }
    }

    public void i(float f) {
        if (this.e.e()) {
            return;
        }
        if (f < k()) {
            f = k();
        } else if (f > a()) {
            f = a();
        }
        if (f == this.c) {
            return;
        }
        this.c = f;
        if (!this.e.f(f)) {
            return;
        }
        h();
    }

    protected Object j(asi asiVar, float f, float f2) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }
}
