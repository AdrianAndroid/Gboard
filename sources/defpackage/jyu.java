package defpackage;

import java.util.Map;

/* compiled from: PG */
/* renamed from: jyu  reason: default package */
/* loaded from: classes.dex */
public final class jyu {
    public Object a;
    public Object b;

    public final void a(jzm jzmVar, lfe lfeVar) {
        if (this.a == null) {
            this.a = llp.e();
        }
        ((llk) this.a).h(new jma(jzmVar, lfeVar));
    }

    public final jsq b() {
        Object obj = this.a;
        if (obj != null) {
            this.b = ((lls) obj).l();
        } else if (this.b == null) {
            this.b = lrq.b;
        }
        return new jsq((llw) this.b);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map, java.lang.Object] */
    public final lls c() {
        if (this.a == null) {
            if (this.b == null) {
                this.a = llw.h();
            } else {
                lls h = llw.h();
                this.a = h;
                h.j(this.b);
                this.b = null;
            }
        }
        return (lls) this.a;
    }

    public final void d(Map map) {
        c().j(map);
    }

    public final void e(String str, Object obj) {
        c().a(str, obj);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, jpt] */
    public final jpu f() {
        Object obj;
        ?? r0 = this.b;
        if (r0 == 0 || (obj = this.a) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.b == null) {
                sb.append(" extraHandler");
            }
            if (this.a == null) {
                sb.append(" indexSpecs");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new jpu(r0, (llp) obj);
    }

    public final void g(jpt jptVar) {
        if (jptVar != null) {
            this.b = jptVar;
            return;
        }
        throw new NullPointerException("Null extraHandler");
    }

    public final void h(llp llpVar) {
        if (llpVar != null) {
            this.a = llpVar;
            return;
        }
        throw new NullPointerException("Null indexSpecs");
    }
}
