package defpackage;

import java.util.List;

/* compiled from: PG */
/* renamed from: aog  reason: default package */
/* loaded from: classes.dex */
final class aog implements aoe {
    private final asi a;
    private float b = -1.0f;

    public aog(List list) {
        this.a = (asi) list.get(0);
    }

    @Override // defpackage.aoe
    public final float a() {
        return this.a.b();
    }

    @Override // defpackage.aoe
    public final float b() {
        return this.a.c();
    }

    @Override // defpackage.aoe
    public final asi c() {
        return this.a;
    }

    @Override // defpackage.aoe
    public final boolean d(float f) {
        if (this.b == f) {
            return true;
        }
        this.b = f;
        return false;
    }

    @Override // defpackage.aoe
    public final boolean e() {
        return false;
    }

    @Override // defpackage.aoe
    public final boolean f(float f) {
        return !this.a.e();
    }
}
