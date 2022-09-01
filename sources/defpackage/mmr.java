package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* renamed from: mmr  reason: default package */
/* loaded from: classes2.dex */
public final class mmr {
    public final Set a;
    public final Set b;
    public final mmt c;
    public final Set d;
    private final int e;

    public mmr(Set set, Set set2, int i, mmt mmtVar, Set set3) {
        this.a = Collections.unmodifiableSet(set);
        this.b = Collections.unmodifiableSet(set2);
        this.e = i;
        this.c = mmtVar;
        this.d = Collections.unmodifiableSet(set3);
    }

    public static mmq a(Class cls) {
        return new mmq(cls, new Class[0]);
    }

    @SafeVarargs
    public static mmq b(Class cls, Class... clsArr) {
        return new mmq(cls, clsArr);
    }

    public static mmq c(Class cls) {
        mmq a = a(cls);
        a.a = 1;
        return a;
    }

    @SafeVarargs
    public static mmr d(Object obj, Class cls, Class... clsArr) {
        mmq b = b(cls, clsArr);
        b.c(new mmp(obj, 1));
        return b.a();
    }

    public final boolean e() {
        return this.e == 0;
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.a.toArray()) + ">{0, type=" + this.e + ", deps=" + Arrays.toString(this.b.toArray()) + "}";
    }
}
