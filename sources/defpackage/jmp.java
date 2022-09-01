package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/* compiled from: PG */
/* renamed from: jmp  reason: default package */
/* loaded from: classes.dex */
public final class jmp {
    public final boolean a;
    private final Object b;
    private final Object c;

    private jmp(boolean z, Object obj, Object obj2) {
        this.a = z;
        this.b = obj;
        this.c = obj2;
    }

    public static jmp a(Object obj) {
        return new jmp(true, obj, null);
    }

    public static jmp b(Object obj) {
        return new jmp(false, null, obj);
    }

    public static boolean e(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public final Object c() {
        if (this.a) {
            return this.b;
        }
        throw new IllegalStateException("Either was not left");
    }

    public final Object d() {
        if (f()) {
            return this.c;
        }
        throw new IllegalStateException("Either was not right");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jmp)) {
            return false;
        }
        jmp jmpVar = (jmp) obj;
        return this.a ? jmpVar.a && e(c(), jmpVar.c()) : jmpVar.f() && e(d(), jmpVar.d());
    }

    public final boolean f() {
        return !this.a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b, this.c});
    }

    public static void g(jmp jmpVar, jmp jmpVar2, Comparator comparator) {
        Object obj;
        if (jmpVar == null || !jmpVar.a || (obj = jmpVar.b) == null || jmpVar2 == null || !jmpVar2.a || jmpVar2.b == null) {
            e(jmpVar, jmpVar2);
            return;
        }
        ArrayList arrayList = new ArrayList((Collection) obj);
        ArrayList arrayList2 = new ArrayList((Collection) jmpVar2.b);
        Collections.sort(arrayList, comparator);
        Collections.sort(arrayList2, comparator);
        arrayList.equals(arrayList2);
    }
}
