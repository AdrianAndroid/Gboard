package defpackage;

import java.util.List;

/* compiled from: PG */
/* renamed from: aof  reason: default package */
/* loaded from: classes.dex */
final class aof implements aoe {
    private final List a;
    private asi c = null;
    private float d = -1.0f;
    private asi b = g(0.0f);

    public aof(List list) {
        this.a = list;
    }

    private final asi g(float f) {
        List list;
        asi asiVar = (asi) this.a.get(list.size() - 1);
        if (f >= asiVar.c()) {
            return asiVar;
        }
        for (int size = this.a.size() - 2; size > 0; size--) {
            asi asiVar2 = (asi) this.a.get(size);
            if (this.b != asiVar2 && asiVar2.d(f)) {
                return asiVar2;
            }
        }
        return (asi) this.a.get(0);
    }

    @Override // defpackage.aoe
    public final float a() {
        List list = this.a;
        return ((asi) list.get(list.size() - 1)).b();
    }

    @Override // defpackage.aoe
    public final float b() {
        return ((asi) this.a.get(0)).c();
    }

    @Override // defpackage.aoe
    public final asi c() {
        return this.b;
    }

    @Override // defpackage.aoe
    public final boolean d(float f) {
        asi asiVar = this.c;
        asi asiVar2 = this.b;
        if (asiVar == asiVar2 && this.d == f) {
            return true;
        }
        this.c = asiVar2;
        this.d = f;
        return false;
    }

    @Override // defpackage.aoe
    public final boolean e() {
        return false;
    }

    @Override // defpackage.aoe
    public final boolean f(float f) {
        if (this.b.d(f)) {
            return !this.b.e();
        }
        this.b = g(f);
        return true;
    }
}
