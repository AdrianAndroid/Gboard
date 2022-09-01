package defpackage;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: jwd  reason: default package */
/* loaded from: classes.dex */
public final class jwd extends jwv {
    private final jug a;
    private final jty b;
    private final jtv c;
    private final juh d;
    private final llw e;
    private final jrp f;
    private volatile transient jtw g;
    private volatile transient String h;

    public jwd(jug jugVar, jty jtyVar, jtv jtvVar, juh juhVar, llw llwVar, jrp jrpVar) {
        if (jugVar != null) {
            this.a = jugVar;
            this.b = jtyVar;
            if (jtvVar != null) {
                this.c = jtvVar;
                this.d = juhVar;
                this.e = llwVar;
                this.f = jrpVar;
                return;
            }
            throw new NullPointerException("Null fetchInfo");
        }
        throw new NullPointerException("Null slice");
    }

    @Override // defpackage.jwv
    public final jrp a() {
        return this.f;
    }

    @Override // defpackage.jwv
    public final jtv b() {
        return this.c;
    }

    @Override // defpackage.jwv
    public final jty c() {
        return this.b;
    }

    @Override // defpackage.jwv
    public final jug d() {
        return this.a;
    }

    @Override // defpackage.jwv
    public final juh e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        juh juhVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof jwv) {
            jwv jwvVar = (jwv) obj;
            if (this.a.equals(jwvVar.d()) && this.b.equals(jwvVar.c()) && this.c.equals(jwvVar.b()) && ((juhVar = this.d) != null ? juhVar.equals(jwvVar.e()) : jwvVar.e() == null) && lre.z(this.e, jwvVar.f()) && this.f.equals(jwvVar.a())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.jwv
    public final llw f() {
        return this.e;
    }

    @Override // defpackage.jwv
    public final jtw g() {
        if (this.g == null) {
            synchronized (this) {
                if (this.g == null) {
                    jrp jrpVar = this.f;
                    jug jugVar = this.a;
                    this.g = jtw.g(jrpVar, jugVar.c(), jugVar.b(), jugVar.d(), jugVar.a(), jugVar.e());
                    if (this.g == null) {
                        throw new NullPointerException("fetchParams() cannot return null");
                    }
                }
            }
        }
        return this.g;
    }

    public final int hashCode() {
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        juh juhVar = this.d;
        return ((((hashCode ^ (juhVar == null ? 0 : juhVar.hashCode())) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    @Override // defpackage.jwv
    public final String toString() {
        if (this.h == null) {
            synchronized (this) {
                if (this.h == null) {
                    lfa T = jdg.T("");
                    T.d();
                    T.b("fetcher", lwm.s(this.b));
                    T.b("unpacker", lwm.s(this.d));
                    if (!this.e.isEmpty()) {
                        lsz it = this.e.entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            String s = lwm.s((jwf) entry.getValue());
                            T.b("validator", ((String) entry.getKey()) + ": " + s);
                        }
                    }
                    T.g("size", this.a.f().d());
                    T.g("compressed", this.c.a);
                    T.b("scheme", this.c.b);
                    T.b("params", g());
                    this.h = T.toString();
                    if (this.h == null) {
                        throw new NullPointerException("toString() cannot return null");
                    }
                }
            }
        }
        return this.h;
    }
}
