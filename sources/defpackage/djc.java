package defpackage;

import java.util.Map;

/* compiled from: PG */
/* renamed from: djc  reason: default package */
/* loaded from: classes.dex */
public final class djc {
    public Object a;
    public Object b;

    public final cnz a() {
        Object obj;
        Object obj2 = this.b;
        if (obj2 == null || (obj = this.a) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.b == null) {
                sb.append(" categoryName");
            }
            if (this.a == null) {
                sb.append(" source");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new cnz((String) obj2, (mba) obj);
    }

    public final void b(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null categoryName");
    }

    public final void c(mba mbaVar) {
        if (mbaVar != null) {
            this.a = mbaVar;
            return;
        }
        throw new NullPointerException("Null source");
    }

    public final cll d() {
        if (this.a == null || this.b == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" keywordToTimestampMapping");
            }
            if (this.b == null) {
                sb.append(" keywordToImagesMapping");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        cll cllVar = new cll((llw) this.a, (llr) this.b);
        dau.j(cllVar.c.u().size() == cllVar.b.size(), "The timestamp [%d] and images [%d] key set sizes are not the same.", Integer.valueOf(cllVar.b.size()), Integer.valueOf(cllVar.c.u().size()));
        return cllVar;
    }

    public final void e(lqr lqrVar) {
        this.b = llr.g(lqrVar);
    }

    public final void f(Map map) {
        this.a = llw.k(map);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [mkr, java.lang.Object] */
    public final dxs g() {
        if (this.b == null) {
            this.b = gxo.a(9);
        }
        if (this.a == null) {
            this.a = ihq.a(5);
        }
        return new dxs((ihq) this.a, (mkr) this.b);
    }
}
