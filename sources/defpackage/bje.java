package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bje  reason: default package */
/* loaded from: classes.dex */
public final class bje implements bhw {
    public final List a;
    private float b;
    private float c;
    private bjf d = null;
    private boolean e = false;
    private boolean f = true;
    private int g = -1;
    private boolean h;

    public bje(bhv bhvVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        if (bhvVar == null) {
            return;
        }
        bhvVar.d(this);
        if (this.h) {
            this.d.a((bjf) arrayList.get(this.g));
            arrayList.set(this.g, this.d);
            this.h = false;
        }
        bjf bjfVar = this.d;
        if (bjfVar == null) {
            return;
        }
        arrayList.add(bjfVar);
    }

    @Override // defpackage.bhw
    public final void a(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        this.e = true;
        this.f = false;
        bjf bjfVar = this.d;
        bjo.c(bjfVar.a, bjfVar.b, f, f2, f3, z, z2, f4, f5, this);
        this.f = true;
        this.h = false;
    }

    @Override // defpackage.bhw
    public final void b() {
        this.a.add(this.d);
        e(this.b, this.c);
        this.h = true;
    }

    @Override // defpackage.bhw
    public final void c(float f, float f2, float f3, float f4, float f5, float f6) {
        if (this.f || this.e) {
            this.d.b(f, f2);
            this.a.add(this.d);
            this.e = false;
        }
        this.d = new bjf(f5, f6, f5 - f3, f6 - f4);
        this.h = false;
    }

    @Override // defpackage.bhw
    public final void e(float f, float f2) {
        this.d.b(f, f2);
        this.a.add(this.d);
        bjf bjfVar = this.d;
        this.d = new bjf(f, f2, f - bjfVar.a, f2 - bjfVar.b);
        this.h = false;
    }

    @Override // defpackage.bhw
    public final void f(float f, float f2) {
        if (this.h) {
            this.d.a((bjf) this.a.get(this.g));
            this.a.set(this.g, this.d);
            this.h = false;
        }
        bjf bjfVar = this.d;
        if (bjfVar != null) {
            this.a.add(bjfVar);
        }
        this.b = f;
        this.c = f2;
        this.d = new bjf(f, f2, 0.0f, 0.0f);
        this.g = this.a.size();
    }

    @Override // defpackage.bhw
    public final void g(float f, float f2, float f3, float f4) {
        this.d.b(f, f2);
        this.a.add(this.d);
        this.d = new bjf(f3, f4, f3 - f, f4 - f2);
        this.h = false;
    }
}
