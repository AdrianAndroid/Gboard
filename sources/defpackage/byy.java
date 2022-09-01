package defpackage;

import j$.util.Collection$EL;
import j$.util.stream.Collectors;
import java.io.Closeable;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* renamed from: byy  reason: default package */
/* loaded from: classes.dex */
public final class byy implements Closeable {
    public static final byy a = new byy(jue.f());
    public final llw b;
    public final jue c;

    public byy(jue jueVar) {
        this.c = jueVar;
        this.b = lrq.b;
    }

    public byy(jue jueVar, llw llwVar) {
        this.c = jueVar;
        this.b = llwVar;
    }

    public static byx b() {
        return new byx();
    }

    public final int a() {
        return this.c.b() + this.b.size();
    }

    public final byz c(String str) {
        byz byzVar = (byz) this.b.get(str);
        return byzVar != null ? byzVar : new byz(this.c.d(str).a());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c.close();
    }

    public final synchronized jtr d() {
        if (!this.c.k()) {
            return this.c.c();
        } else if (this.b.isEmpty()) {
            return null;
        } else {
            return ((byz) ((Map.Entry) this.b.entrySet().iterator().next()).getValue()).a().e();
        }
    }

    public final juc e(String str) {
        byz byzVar = (byz) this.b.get(str);
        return byzVar != null ? byzVar.a() : this.c.d(str).a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof byy)) {
            return false;
        }
        byy byyVar = (byy) obj;
        return byyVar.c.equals(this.c) && byyVar.b.equals(this.b);
    }

    public final File f(String str) {
        byz byzVar = (byz) this.b.get(str);
        if (byzVar != null) {
            return byzVar.b();
        }
        return this.c.d(str).c();
    }

    public final synchronized Collection g() {
        if (this.b.isEmpty()) {
            return this.c.i();
        }
        ArrayList arrayList = (ArrayList) Collection$EL.stream(this.b.values()).map(byw.a).collect(Collectors.toCollection(cag.b));
        arrayList.addAll(this.c.i());
        return arrayList;
    }

    public final Set h() {
        if (this.b.isEmpty()) {
            return this.c.j();
        }
        if (this.c.k()) {
            return this.b.keySet();
        }
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.c.j());
        hashSet.addAll(this.b.keySet());
        return hashSet;
    }

    public final int hashCode() {
        return this.c.hashCode() + this.b.hashCode();
    }

    public final boolean i() {
        return this.c.k() && this.b.isEmpty();
    }

    public final String toString() {
        return this.c.toString().concat(String.valueOf(String.valueOf(this.b)));
    }
}
