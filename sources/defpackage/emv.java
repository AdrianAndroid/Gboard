package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: emv  reason: default package */
/* loaded from: classes.dex */
public final class emv {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    private static List k(lrh lrhVar, boolean z, lmw lmwVar, List list) {
        if (!z || lmwVar == null || !lmwVar.c(lrhVar)) {
            if (list == null) {
                list = new ArrayList();
            }
            list.add(lrhVar);
            return list;
        }
        return list;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, java.lang.Object] */
    public final void a(lrh lrhVar, boolean z) {
        this.b = k(lrhVar, z, (lmw) this.d, this.b);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, java.lang.Object] */
    public final void b(lrh lrhVar, boolean z) {
        this.a = k(lrhVar, z, (lmw) this.c, this.a);
    }

    public final czo c() {
        czo d = d();
        dau.i(!d.a().isEmpty(), "animation file is empty");
        dau.i(!d.c.isEmpty(), "File to template info is empty");
        return d();
    }

    public final czo d() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6 = this.f;
        if (obj6 == null || (obj = this.c) == null || (obj2 = this.d) == null || (obj3 = this.b) == null || (obj4 = this.e) == null || (obj5 = this.a) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.f == null) {
                sb.append(" animationDir");
            }
            if (this.c == null) {
                sb.append(" fontDir");
            }
            if (this.d == null) {
                sb.append(" fileNameToTemplateInfoMap");
            }
            if (this.b == null) {
                sb.append(" genericTemplateFileNames");
            }
            if (this.e == null) {
                sb.append(" conceptToFileNameMap");
            }
            if (this.a == null) {
                sb.append(" keywordToFileNameMap");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new czo((File) obj6, (File) obj, (llw) obj2, (lmz) obj3, (lnd) obj4, (lnd) obj5);
    }

    public final void e(lnd lndVar) {
        if (lndVar != null) {
            this.e = lndVar;
            return;
        }
        throw new NullPointerException("Null conceptToFileNameMap");
    }

    public final void f(lmz lmzVar) {
        if (lmzVar != null) {
            this.b = lmzVar;
            return;
        }
        throw new NullPointerException("Null genericTemplateFileNames");
    }

    public final void g(lnd lndVar) {
        if (lndVar != null) {
            this.a = lndVar;
            return;
        }
        throw new NullPointerException("Null keywordToFileNameMap");
    }

    public final cov h() {
        Object obj = this.a;
        if (obj != null) {
            this.c = ((llk) obj).g();
        } else if (this.c == null) {
            this.c = llp.q();
        }
        Object obj2 = this.e;
        if (obj2 != null) {
            this.f = ((llk) obj2).g();
        } else if (this.f == null) {
            this.f = llp.q();
        }
        Object obj3 = this.b;
        if (obj3 != null) {
            Object obj4 = this.d;
            return new cov((coq) obj4, (llp) this.c, (cox) obj3, (llp) this.f);
        }
        throw new IllegalStateException("Missing required properties: initialSelectedPosition");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.lang.Iterable] */
    public final void i(coq coqVar) {
        if (this.a == null) {
            if (this.c == null) {
                this.a = llp.e();
            } else {
                llk e = llp.e();
                this.a = e;
                e.j(this.c);
                this.c = null;
            }
        }
        ((llk) this.a).h(coqVar);
    }

    public final void j(cox coxVar) {
        if (coxVar != null) {
            this.b = coxVar;
            return;
        }
        throw new NullPointerException("Null initialSelectedPosition");
    }
}
