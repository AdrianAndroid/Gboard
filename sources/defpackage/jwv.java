package defpackage;

import java.util.Map;

/* compiled from: PG */
/* renamed from: jwv  reason: default package */
/* loaded from: classes.dex */
public abstract class jwv {
    public abstract jrp a();

    public abstract jtv b();

    public abstract jty c();

    public abstract jug d();

    public abstract juh e();

    public abstract llw f();

    public jtw g() {
        throw null;
    }

    public String toString() {
        lfa T = jdg.T("");
        T.d();
        T.b("fetcher", lwm.s(c()));
        T.b("unpacker", lwm.s(e()));
        if (!f().isEmpty()) {
            lsz it = f().entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String s = lwm.s((jwf) entry.getValue());
                T.b("validator", ((String) entry.getKey()) + ": " + s);
            }
        }
        T.g("size", d().f().d());
        T.g("compressed", b().a);
        T.b("scheme", b().b);
        T.b("params", g());
        return T.toString();
    }
}
