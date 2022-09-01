package defpackage;

import java.security.MessageDigest;

/* compiled from: PG */
/* renamed from: ava  reason: default package */
/* loaded from: classes.dex */
public final class ava implements auw {
    private final qo b = new bfx();

    @Override // defpackage.auw
    public final void a(MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            qo qoVar = this.b;
            if (i < qoVar.d) {
                auz auzVar = (auz) qoVar.c(i);
                Object f = this.b.f(i);
                auy auyVar = auzVar.b;
                if (auzVar.d == null) {
                    auzVar.d = auzVar.c.getBytes(auw.a);
                }
                auyVar.a(auzVar.d, f, messageDigest);
                i++;
            } else {
                return;
            }
        }
    }

    public final Object b(auz auzVar) {
        return this.b.containsKey(auzVar) ? this.b.get(auzVar) : auzVar.a;
    }

    public final void c(ava avaVar) {
        this.b.h(avaVar.b);
    }

    public final void d(auz auzVar, Object obj) {
        this.b.put(auzVar, obj);
    }

    @Override // defpackage.auw
    public final boolean equals(Object obj) {
        if (obj instanceof ava) {
            return this.b.equals(((ava) obj).b);
        }
        return false;
    }

    @Override // defpackage.auw
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        String obj = this.b.toString();
        return "Options{values=" + obj + "}";
    }
}
