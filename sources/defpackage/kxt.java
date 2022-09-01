package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: kxt  reason: default package */
/* loaded from: classes.dex */
public final class kxt {
    @Deprecated
    public float a;
    @Deprecated
    public float b;
    @Deprecated
    public float c;
    @Deprecated
    public float d;
    @Deprecated
    public float e;
    public final List f = new ArrayList();
    private final List g = new ArrayList();

    public kxt() {
        e();
    }

    private final void g(float f) {
        float f2 = this.d;
        if (f2 != f) {
            float f3 = ((f - f2) + 360.0f) % 360.0f;
            if (f3 > 180.0f) {
                return;
            }
            float f4 = this.b;
            float f5 = this.c;
            kxp kxpVar = new kxp(f4, f5, f4, f5);
            kxpVar.e = this.d;
            kxpVar.f = f3;
            this.g.add(new kxn(kxpVar));
            this.d = f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final kxs a(Matrix matrix) {
        g(this.e);
        return new kxm(new ArrayList(this.g), new Matrix(matrix));
    }

    public final void b(kxs kxsVar, float f, float f2) {
        g(f);
        this.g.add(kxsVar);
        this.d = f2;
    }

    public final void c(Matrix matrix, Path path) {
        int size = this.f.size();
        for (int i = 0; i < size; i++) {
            ((kxr) this.f.get(i)).a(matrix, path);
        }
    }

    public final void d(float f, float f2) {
        kxq kxqVar = new kxq();
        kxqVar.a = f;
        kxqVar.b = f2;
        this.f.add(kxqVar);
        kxo kxoVar = new kxo(kxqVar, this.b, this.c);
        b(kxoVar, kxoVar.b() + 270.0f, kxoVar.b() + 270.0f);
        this.b = f;
        this.c = f2;
    }

    public final void e() {
        f(0.0f, 270.0f, 0.0f);
    }

    public final void f(float f, float f2, float f3) {
        this.a = f;
        this.b = 0.0f;
        this.c = f;
        this.d = f2;
        this.e = (f2 + f3) % 360.0f;
        this.f.clear();
        this.g.clear();
    }
}
