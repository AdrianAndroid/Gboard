package defpackage;

import java.util.Arrays;
import java.util.Map;

/* compiled from: PG */
/* renamed from: lqm  reason: default package */
/* loaded from: classes.dex */
public class lqm implements low {
    final Map a;
    final Map b;
    final Map c;
    final Map d;

    public lqm(Map map, Map map2, Map map3, Map map4) {
        this.a = lre.v(map);
        this.b = lre.v(map2);
        this.c = lre.v(map3);
        this.d = lre.v(map4);
    }

    @Override // defpackage.low
    public Map a() {
        return this.d;
    }

    @Override // defpackage.low
    public Map b() {
        return this.c;
    }

    @Override // defpackage.low
    public Map c() {
        return this.a;
    }

    @Override // defpackage.low
    public Map d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof low) {
            low lowVar = (low) obj;
            if (c().equals(lowVar.c()) && d().equals(lowVar.d()) && b().equals(lowVar.b()) && a().equals(lowVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{c(), d(), b(), a()});
    }

    public final String toString() {
        if (!this.a.isEmpty() || !this.b.isEmpty() || !this.d.isEmpty()) {
            StringBuilder sb = new StringBuilder("not equal");
            if (!this.a.isEmpty()) {
                sb.append(": only on left=");
                sb.append(this.a);
            }
            if (!this.b.isEmpty()) {
                sb.append(": only on right=");
                sb.append(this.b);
            }
            if (!this.d.isEmpty()) {
                sb.append(": value differences=");
                sb.append(this.d);
            }
            return sb.toString();
        }
        return "equal";
    }
}
