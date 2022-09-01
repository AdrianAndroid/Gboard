package defpackage;

import android.graphics.Rect;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* renamed from: amp  reason: default package */
/* loaded from: classes.dex */
public final class amp {
    public Map a;
    public Map b;
    public Map c;
    public qw d;
    public qs e;
    public List f;
    public Rect g;
    public float h;
    public float i;
    public float j;
    public boolean k;
    public final wk m = new wk();
    private final HashSet n = new HashSet();
    public int l = 0;

    public final float a() {
        return (b() / this.j) * 1000.0f;
    }

    public final float b() {
        return this.i - this.h;
    }

    public final aqi c(long j) {
        return (aqi) this.e.d(j);
    }

    public final void d(String str) {
        asa.a(str);
        this.n.add(str);
    }

    public final void e(int i) {
        this.l += i;
    }

    public final void f() {
        this.k = true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        for (aqi aqiVar : this.f) {
            sb.append(aqiVar.a("\t"));
        }
        return sb.toString();
    }
}
