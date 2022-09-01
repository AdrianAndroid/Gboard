package defpackage;

import android.database.sqlite.SQLiteException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* renamed from: jxn  reason: default package */
/* loaded from: classes.dex */
public final class jxn implements jtb {
    public final jvr a;
    public final jso b;
    public final jso c;
    public final jso e;
    public final jvc f;
    public final jwz g;
    public final jtc i;
    public final llp k;
    public final opu l;
    private final mkr m;
    public final Map h = new HashMap();
    public final Map j = new HashMap();

    public jxn(jvr jvrVar, jso jsoVar, jso jsoVar2, jso jsoVar3, mkr mkrVar, jvc jvcVar, jtc jtcVar, int i, llp llpVar) {
        this.a = jvrVar;
        this.b = jsoVar;
        this.c = jsoVar2;
        this.e = jsoVar3;
        this.m = mkrVar;
        this.f = jvcVar;
        this.i = jtcVar;
        opu opuVar = new opu(this);
        this.l = opuVar;
        this.g = new jwz(jvrVar, mkrVar, opuVar, i, null, null, null);
        this.k = llpVar;
    }

    private final synchronized jxr j(String str, jxr jxrVar) {
        jxr jxrVar2;
        jxrVar2 = (jxr) this.h.get(str);
        this.h.put(str, jxrVar);
        return jxrVar2;
    }

    public final mko a(String str, Set set) {
        return kcu.P(new jqu(this, str, set, 3), this.m);
    }

    /* JADX WARN: Type inference failed for: r8v9, types: [mko, java.lang.Object] */
    public final mko b(final String str, Set set, Set set2) {
        final int i;
        try {
            List<jvb> b = this.f.b(str);
            if (b.isEmpty()) {
                return kcu.K(false);
            }
            lug lugVar = jsh.a;
            ArrayList arrayList = new ArrayList();
            for (final jvb jvbVar : b) {
                jsr jsrVar = jvbVar.a;
                if (!set.contains(jsrVar)) {
                    if (!this.a.s(((jrh) jsrVar).a)) {
                        i = true != set2.contains(jsrVar) ? 2 : 3;
                    } else {
                        i = 1;
                    }
                    lug lugVar2 = jsh.a;
                    jsr jsrVar2 = jvbVar.a;
                    jwz jwzVar = this.g;
                    lug lugVar3 = jsh.c;
                    jwy jwyVar = (jwy) jwzVar.a.get(jsrVar2);
                    if (jwyVar != null) {
                        jwyVar.b.cancel(true);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (jrs jrsVar : lkv.a(jwzVar.f.h(), jwzVar.f.i(), jwzVar.f.j())) {
                        arrayList2.add(kcu.L(jrsVar.b(jsrVar2)));
                    }
                    arrayList.add(mio.h(kcu.W(arrayList2).a(new gnq(arrayList2, jsrVar2, 13), jwzVar.b), new miy() { // from class: jxj
                        @Override // defpackage.miy
                        public final mko a(Object obj) {
                            jxn jxnVar = jxn.this;
                            String str2 = str;
                            jvb jvbVar2 = jvbVar;
                            int i2 = i;
                            Void r5 = (Void) obj;
                            jxnVar.i.g(str2);
                            jxnVar.i(str2, jvbVar2, i2);
                            return kcu.K(null);
                        }
                    }, this.m));
                    lug lugVar4 = jsh.a;
                    jsr jsrVar3 = jvbVar.a;
                }
            }
            if (arrayList.size() <= 0) {
                lug lugVar5 = jsh.a;
                return kcu.K(false);
            }
            lug lugVar6 = jsh.a;
            return mio.h(kcu.G(arrayList), jlf.d, this.m);
        } catch (IOException e) {
            return kcu.J(e);
        }
    }

    public final mko c(String str, Collection collection, Set set) {
        return d(str, llp.r(collection), set);
    }

    public final synchronized mko d(String str, List list, Set set) {
        final jxr jxrVar;
        mko b;
        jxrVar = new jxr(str, list, set, this);
        jxr j = j(str, jxrVar);
        if (j != null) {
            j.a();
            jxrVar.b(j);
            lug lugVar = jsh.a;
        }
        final jvr jvrVar = this.a;
        final mkr mkrVar = this.m;
        final jvc jvcVar = this.f;
        final opu opuVar = this.l;
        final jwz jwzVar = this.g;
        b = kcu.X(jxrVar.e).b(new mix(jvrVar, mkrVar, jvcVar, opuVar, jwzVar, null, null, null) { // from class: jxp
            public final /* synthetic */ jvr b;
            public final /* synthetic */ mkr c;
            public final /* synthetic */ jvc d;
            public final /* synthetic */ jwz e;
            public final /* synthetic */ opu f;

            @Override // defpackage.mix
            public final mko a() {
                jxr jxrVar2 = jxr.this;
                jvr jvrVar2 = this.b;
                mkr mkrVar2 = this.c;
                jvc jvcVar2 = this.d;
                opu opuVar2 = this.f;
                jwz jwzVar2 = this.e;
                if (jxrVar2.d) {
                    return mkk.a;
                }
                HashSet hashSet = new HashSet();
                lta listIterator = ((llp) jxrVar2.b).listIterator();
                boolean z = false;
                while (listIterator.hasNext()) {
                    for (jug jugVar : (Collection) listIterator.next()) {
                        jsr o = jugVar.f().o();
                        hashSet.add(o);
                        z |= jvrVar2.s(((jrh) o).a);
                    }
                }
                if (!z || hashSet.size() <= 1) {
                    return mio.h(jxrVar2.f.b(jxrVar2.a, hashSet, jxrVar2.c), new jxq(jxrVar2, hashSet, !z, jvrVar2, mkrVar2, jvcVar2, opuVar2, jwzVar2, 0, null, null, null), mkrVar2);
                }
                throw new IllegalArgumentException("Only one file can be requested for a detached namespace.");
            }
        }, mkrVar);
        jxrVar.d(b);
        return kcu.L(kcu.X(b).b(new iiq(this, str, jxrVar, b, 5), this.m));
    }

    @Override // defpackage.jtb
    public final synchronized void e(PrintWriter printWriter, boolean z) {
        String str;
        printWriter.println("## Pending pack fetches");
        jti a = jtj.a();
        a.b('|');
        jth a2 = jtq.a();
        a.a = "id";
        a2.b(a.a());
        a2.b = "-There are no pending fetches-";
        Iterator it = this.h.keySet().iterator();
        while (it.hasNext()) {
            a2.c((String) it.next());
        }
        a2.a().m(printWriter);
        printWriter.println();
        printWriter.println("## Namespace download priorities");
        jth a3 = jtq.a();
        a.a = "namespace";
        a3.b(a.a());
        a.a = "priority";
        a3.b(a.a());
        a3.b = "-There are no pending fetches-";
        for (Map.Entry entry : this.j.entrySet()) {
            a3.c(entry.getKey(), entry.getValue());
        }
        a3.a().m(printWriter);
        printWriter.println();
        printWriter.println("## Pipeline components");
        jth a4 = jtq.a();
        a.a = "type";
        a4.b(a.a());
        a.a = "name";
        a4.b(a.a());
        a4.b = "-There are no pending fetches-";
        for (jrs jrsVar : lkv.a(this.b, this.c, this.e)) {
            if (jrsVar instanceof jty) {
                str = "fetcher";
            } else if (jrsVar instanceof juh) {
                str = "unpacker";
            } else {
                str = jrsVar instanceof jwf ? "validator" : "?";
            }
            a4.c(str, lwm.s(jrsVar));
        }
        a4.a().m(printWriter);
        printWriter.println();
        ((jvj) this.f).b.e(printWriter, z);
        printWriter.println();
        for (jrs jrsVar2 : lkv.a(this.b, this.c, this.e)) {
            if (jrsVar2 instanceof jtb) {
                ((jtb) jrsVar2).e(printWriter, z);
            }
        }
    }

    public final synchronized void f(String str, jxr jxrVar) {
        if (this.h.get(str) == jxrVar) {
            this.h.remove(str);
        }
    }

    public final synchronized void g(jty jtyVar) {
        this.b.a(jtyVar, 0);
    }

    public final synchronized void h(juh juhVar) {
        this.c.a(juhVar, 0);
    }

    public final void i(String str, jvb jvbVar, int i) {
        jsr jsrVar = jvbVar.a;
        jsr a = jsi.a(jsrVar, jvbVar.b);
        jsr b = jsi.b(jsrVar);
        this.a.u(a);
        this.a.u(b);
        if (i != 1) {
            if (i != 2) {
                jvr jvrVar = this.a;
                String str2 = ((jrh) jsrVar).a;
                synchronized (jvrVar.b) {
                    jvrVar.f(str2).b();
                    if (((jui) jvrVar.e.a(jsrVar)).d >= 2) {
                        jvrVar.e.c(jsrVar, 1);
                    }
                }
            } else {
                this.a.u(jsrVar);
            }
        }
        jvc jvcVar = this.f;
        try {
            ((jvj) jvcVar).a.getWritableDatabase().delete("pending_packs", "parent_id=? AND pack_name=?", new String[]{str, jsrVar.toString()});
        } catch (SQLiteException e) {
            jum jumVar = ((jvj) jvcVar).a;
            String obj = jsrVar.toString();
            IOException iOException = new IOException("SqlitePendingPacks#remove, SQL delete failed, parentId: " + str + ", packName: " + obj, e);
            jumVar.a(iOException);
            throw iOException;
        }
    }
}
