package defpackage;

import java.security.MessageDigest;
import java.util.Map;

/* compiled from: PG */
/* renamed from: axa  reason: default package */
/* loaded from: classes.dex */
public final class axa implements auw {
    private final Object b;
    private final int c;
    private final int d;
    private final Class e;
    private final Class f;
    private final auw g;
    private final Map h;
    private final ava i;
    private int j;

    public axa(Object obj, auw auwVar, int i, int i2, Map map, Class cls, Class cls2, ava avaVar) {
        ce.m(obj);
        this.b = obj;
        ce.q(auwVar, "Signature must not be null");
        this.g = auwVar;
        this.c = i;
        this.d = i2;
        ce.m(map);
        this.h = map;
        ce.q(cls, "Resource class must not be null");
        this.e = cls;
        this.f = cls2;
        ce.m(avaVar);
        this.i = avaVar;
    }

    @Override // defpackage.auw
    public final void a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.auw
    public final boolean equals(Object obj) {
        if (obj instanceof axa) {
            axa axaVar = (axa) obj;
            if (this.b.equals(axaVar.b) && this.g.equals(axaVar.g) && this.d == axaVar.d && this.c == axaVar.c && this.h.equals(axaVar.h) && this.e.equals(axaVar.e) && this.f.equals(axaVar.f) && this.i.equals(axaVar.i)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.auw
    public final int hashCode() {
        int i = this.j;
        if (i == 0) {
            int hashCode = this.b.hashCode();
            this.j = hashCode;
            int hashCode2 = (((((hashCode * 31) + this.g.hashCode()) * 31) + this.c) * 31) + this.d;
            this.j = hashCode2;
            int hashCode3 = (hashCode2 * 31) + this.h.hashCode();
            this.j = hashCode3;
            int hashCode4 = (hashCode3 * 31) + this.e.hashCode();
            this.j = hashCode4;
            int hashCode5 = (hashCode4 * 31) + this.f.hashCode();
            this.j = hashCode5;
            int hashCode6 = (hashCode5 * 31) + this.i.hashCode();
            this.j = hashCode6;
            return hashCode6;
        }
        return i;
    }

    public final String toString() {
        String obj = this.b.toString();
        int i = this.c;
        int i2 = this.d;
        String obj2 = this.e.toString();
        String obj3 = this.f.toString();
        String obj4 = this.g.toString();
        int i3 = this.j;
        String obj5 = this.h.toString();
        String obj6 = this.i.toString();
        return "EngineKey{model=" + obj + ", width=" + i + ", height=" + i2 + ", resourceClass=" + obj2 + ", transcodeClass=" + obj3 + ", signature=" + obj4 + ", hashCode=" + i3 + ", transformations=" + obj5 + ", options=" + obj6 + "}";
    }
}
