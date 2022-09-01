package defpackage;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: PG */
/* renamed from: jga  reason: default package */
/* loaded from: classes.dex */
public final class jga implements Cloneable {
    public final SortedMap a = new TreeMap();
    private String b;

    /* renamed from: a */
    public final jga clone() {
        jga jgaVar = new jga();
        jgaVar.a.putAll(this.a);
        jgaVar.b = this.b;
        return jgaVar;
    }

    public final String b() {
        if (this.b == null) {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry entry : this.a.entrySet()) {
                sb.append('_');
                sb.append(((jfn) entry.getValue()).b());
            }
            this.b = sb.toString();
        }
        return this.b;
    }

    public final void c(jfn jfnVar) {
        this.b = null;
        this.a.put(jfnVar.c(), jfnVar);
    }

    public final void d(int i) {
        c(jft.f(jft.g(i)));
    }

    public final void e(boolean z) {
        c(new jfi("enable_multilingual_typing", z));
    }

    public final void f(String str) {
        c(new jgb("variant", str));
    }

    public final jls g() {
        if (!this.a.isEmpty()) {
            return new jls(b(), llw.k(this.a));
        }
        throw new IllegalStateException("No condition specified.");
    }

    public final String toString() {
        return b();
    }
}
