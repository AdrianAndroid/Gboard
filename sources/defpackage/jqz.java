package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: jqz  reason: default package */
/* loaded from: classes.dex */
public final class jqz implements jtc {
    public static final jqk a = jqk.f;
    public static final jqd b = jqd.a;
    public static final jqf c = jqf.a;
    private final Map d = new HashMap();
    private final jqy e = new jqy(this);

    static {
        int i = jrx.b;
    }

    private final synchronized jqy h(String str) {
        if (!this.d.containsKey(str)) {
            this.d.put(str, new jqy(this));
        }
        return (jqy) this.d.get(str);
    }

    public final synchronized jqd a(String str) {
        return d(str).b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized jqf b(String str) {
        return d(str).c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized jqk c(String str) {
        return d(str).a;
    }

    public final synchronized jqy d(String str) {
        if (str == null) {
            return this.e;
        }
        jqy jqyVar = (jqy) this.d.get(str);
        if (jqyVar != null) {
            return jqyVar;
        }
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void e(String str, jqk jqkVar) {
        h(str).a = jqkVar;
    }

    public final synchronized void f(jqd jqdVar) {
        h("delight").b = jqdVar;
    }

    @Override // defpackage.jtc
    public final synchronized void g(String str) {
        int i = d(str).d;
    }
}
