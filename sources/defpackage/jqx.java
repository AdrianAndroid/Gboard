package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: jqx  reason: default package */
/* loaded from: classes.dex */
public final class jqx {
    public final Context a;
    public final jvf b;
    public final jvc c;
    public final jqz d;
    public final jxn e;
    public final jvr f;
    public final mkr g;
    public final jum h;
    public final jus i;
    public final int j;
    public final jqb k;
    public final jtb l;
    public final jls n;
    public final jls o;
    public final jls m = jls.e();
    private final AtomicBoolean p = new AtomicBoolean(false);

    public jqx(jqw jqwVar) {
        jls e = jls.e();
        this.n = e;
        Context context = jqwVar.a;
        this.a = context;
        jvl b = jvl.b(context);
        this.h = b;
        mkr mkrVar = jqwVar.f;
        mkr mkrVar2 = mkrVar == null ? jtd.a : mkrVar;
        this.g = mkrVar2;
        jtf jtfVar = jtf.a;
        jru jruVar = jru.a;
        jqz jqzVar = new jqz();
        this.d = jqzVar;
        jvr d = jvr.d(new File(jqwVar.a.getFilesDir(), "superpacks"), new jvg(b, new opu(this), null, null, null, null), jtfVar, jruVar, jqwVar.g, jqzVar);
        this.f = d;
        synchronized (d.b) {
            if (d.c.containsKey("manifests")) {
                throw new IllegalArgumentException("Namespace is already registered: manifests");
            }
            d.c.put("manifests", jwa.a("manifests", 0L, true));
        }
        jyu b2 = jpu.b();
        b2.h(jqwVar.i);
        b2.g(jpu.a);
        jph jphVar = new jph(d, new jpw(b2.f(), jqwVar.e, null));
        this.k = jphVar;
        jvj jvjVar = new jvj(b);
        this.c = jvjVar;
        jso jsoVar = new jso(jqwVar.b);
        jso jsoVar2 = new jso(jqwVar.c);
        jso jsoVar3 = new jso(jqwVar.d);
        if (mkrVar2 == null) {
            nzv nzvVar = new nzv((byte[]) null);
            nzvVar.c("superpacks-packs-control-%d");
            mkrVar2 = kcu.B(Executors.newSingleThreadExecutor(nzv.d(nzvVar)));
        }
        jxn jxnVar = new jxn(d, jsoVar, jsoVar2, jsoVar3, mkrVar2, jvjVar, jqzVar, jqwVar.j, jqwVar.i);
        this.e = jxnVar;
        this.b = new jvk(b);
        this.i = new juk(new jvh(b));
        this.j = 32;
        jls jlsVar = new jls(d, jruVar);
        this.o = jlsVar;
        jpl jplVar = new jpl(e, null);
        d.n.c(jplVar);
        b.a.c(jplVar);
        jxnVar.g.e.c(jplVar);
        jra jraVar = jqwVar.h;
        if (jraVar != null) {
            e.c(jraVar);
        }
        jzc c = c();
        this.l = c != null ? new jqh(c.b, jlsVar, jphVar, null, null) : jtb.d;
    }

    public static String g(String str) {
        return String.valueOf(str).concat("-manifest");
    }

    public static boolean l(juc jucVar) {
        return TextUtils.equals(jucVar.j(), "manifests");
    }

    public final jqm a(String str, int i, String str2) {
        jqm jqmVar = null;
        if (i >= 0) {
            try {
                jqmVar = this.k.a(str, i);
                if (jqmVar == null) {
                    ((luc) ((luc) jsh.a.d()).k("com/google/android/libraries/micore/superpacks/Superpacks", "getSuperpackManifest", 1912, "Superpacks.java")).E("Manifest for %s is not available, version: %d", str, i);
                }
            } catch (jpz e) {
                ((luc) ((luc) ((luc) jsh.a.d()).i(e)).k("com/google/android/libraries/micore/superpacks/Superpacks", "getSuperpackManifest", 1920, "Superpacks.java")).E("Failed to parse manifest for %s, version: %d", str, i);
                this.n.a(new jqv(str, i, str2, e, 0));
            }
        }
        return jqmVar;
    }

    public final jue b(String str) {
        List unmodifiableList;
        jvs jvsVar;
        jue b;
        this.i.a(str);
        j();
        jve a = this.b.a(str, true);
        if (a == null) {
            b = jue.f();
        } else if (!a.a.isEmpty()) {
            List<juc> h = h(str, a.a);
            m(str, h);
            jxn jxnVar = this.e;
            byte[] bArr = a.b;
            if (h.isEmpty()) {
                b = jue.g(bArr);
            } else {
                ArrayList<jsr> arrayList = new ArrayList();
                for (juc jucVar : h) {
                    jsr o = jucVar.o();
                    int i = jsi.a;
                    arrayList.add(o);
                }
                jvr jvrVar = jxnVar.a;
                synchronized (jvrVar.b) {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!jvrVar.h((jsr) it.next()).exists()) {
                                lug lugVar = jsh.a;
                                unmodifiableList = Collections.emptyList();
                                break;
                            }
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            for (jsr jsrVar : arrayList) {
                                synchronized (jvrVar.b) {
                                    jvrVar.f(jsrVar.b()).b();
                                    jvu jvuVar = jvrVar.i;
                                    File h2 = jvrVar.h(jsrVar);
                                    synchronized (jvuVar.a) {
                                        jvt jvtVar = (jvt) jvuVar.a.get(h2);
                                        if (jvtVar == null) {
                                            jvtVar = new jvt(h2);
                                            jvuVar.a.put(h2, jvtVar);
                                            jvuVar.a(h2, 1);
                                        }
                                        jvsVar = new jvs(jvuVar, jvtVar);
                                    }
                                }
                                arrayList2.add(jvsVar);
                            }
                            unmodifiableList = Collections.unmodifiableList(arrayList2);
                        }
                    }
                }
                if (unmodifiableList.isEmpty()) {
                    lug lugVar2 = jsh.a;
                    b = jue.g(bArr);
                } else {
                    lyu a2 = lyu.a();
                    try {
                        jud e = jue.e();
                        a2.d(e);
                        for (int i2 = 0; i2 < unmodifiableList.size(); i2++) {
                            jvs jvsVar2 = (jvs) unmodifiableList.get(i2);
                            a2.d(jvsVar2);
                            jua juaVar = new jua(jvsVar2.a(), (juc) h.get(i2));
                            a2.d(juaVar);
                            e.c(juaVar);
                        }
                        e.b = jxnVar.k;
                        e.c = bArr;
                        b = e.b();
                    } finally {
                    }
                }
            }
        } else {
            b = jue.g(a.b);
        }
        lug lugVar3 = jsh.a;
        jrz a3 = jsf.a(str);
        a3.f(3);
        a3.c("api", "open_packs", Integer.valueOf(b.b()));
        return b;
    }

    public final jzc c() {
        for (jty jtyVar : this.e.l.h()) {
            if (jtyVar instanceof jzc) {
                return (jzc) jtyVar;
            }
        }
        return null;
    }

    public final mko d(String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(this.e.a(str, jss.e(this.b.c(str))));
        } catch (IOException e) {
            arrayList.add(kcu.J(e));
        }
        arrayList.add(this.e.a(g(str), Collections.emptySet()));
        if (arrayList.isEmpty()) {
            return kcu.K(null);
        }
        return kcu.W(arrayList).a(new jyg(this, arrayList, str, z, 1), this.g);
    }

    public final mko e(final jtr jtrVar, final jsv jsvVar) {
        jrj jrjVar = (jrj) jsvVar;
        final int i = jrjVar.c;
        final int i2 = jrjVar.d;
        final int i3 = jrjVar.e;
        final int i4 = jrjVar.f;
        final int i5 = jrjVar.g;
        final String str = jrjVar.a;
        final String str2 = jrjVar.b;
        mko P = kcu.P(new mix() { // from class: jqq
            @Override // defpackage.mix
            public final mko a() {
                final jqx jqxVar = jqx.this;
                final jtr jtrVar2 = jtrVar;
                String str3 = str;
                int i6 = i;
                int i7 = i2;
                int i8 = i3;
                int i9 = i4;
                int i10 = i5;
                jsv jsvVar2 = jsvVar;
                String str4 = str2;
                jqxVar.j();
                jrn jrnVar = (jrn) jtrVar2;
                final int i11 = jrnVar.b;
                final String str5 = jrnVar.a;
                final int a = jqxVar.i.a(str5);
                ((luc) ((luc) jsh.a.b()).k("com/google/android/libraries/micore/superpacks/Superpacks", "lambda$registerManifest$4", 511, "Superpacks.java")).M("Registering %s, url: %s, constraints: %s, flags: %s, requested: %d, current: %d", jtrVar2, str3, jtq.b(i6, i7, i8, i9), jtq.m(i10), Integer.valueOf(i11), Integer.valueOf(a));
                if (a == i11) {
                    try {
                        jqm a2 = jqxVar.a(str5, i11, "registerManifest");
                        if (a2 != null) {
                            return mio.h(jqxVar.e.a(jqx.g(str5), Collections.emptySet()), new jku(a2, 20), jqxVar.g);
                        }
                    } catch (IOException e) {
                        ((luc) ((luc) ((luc) jsh.a.c()).i(e)).k("com/google/android/libraries/micore/superpacks/Superpacks", "lambda$registerManifest$4", (char) 546, "Superpacks.java")).t("Manifest is corrupted, will delete and re-fetch");
                    }
                    ((luc) ((luc) jsh.a.b()).k("com/google/android/libraries/micore/superpacks/Superpacks", "lambda$registerManifest$4", 552, "Superpacks.java")).t("Deleting and re-fetching the manifest");
                    jqxVar.f.r(jsr.d("manifests", jsi.d(str5, i11)), jxz.INVALID_PACK, true);
                }
                jub p = juc.p();
                p.l(jsi.d(str5, i11));
                p.a = jtrVar2;
                p.m("manifests");
                jrj jrjVar2 = (jrj) jsvVar2;
                p.g(jrjVar2.h);
                p.c().j(jrjVar2.i.b);
                p.i(jqxVar.e.l.g(str5).b());
                p.o(false);
                if (str3 != null) {
                    p.d(str3);
                }
                if (str4 != null) {
                    p.c = str4;
                }
                final juc a3 = p.a();
                lug lugVar = jsh.a;
                jtt jttVar = (jtt) a3;
                if (jttVar.n == null) {
                    synchronized (a3) {
                        if (((jtt) a3).n == null) {
                            lfa T = jdg.T("");
                            T.b("name", a3.o());
                            T.g("size", ((jtt) a3).d);
                            T.g("compressed", ((jtt) a3).e);
                            T.f("gc priority", ((jtt) a3).f);
                            T.f("down. priority", ((jtt) a3).g);
                            if (!((jtt) a3).h.isEmpty()) {
                                T.b("urls", ((jtt) a3).h);
                            }
                            ((jtt) a3).n = T.toString();
                            if (((jtt) a3).n == null) {
                                throw new NullPointerException("toDetailedString() cannot return null");
                            }
                        }
                    }
                }
                String str6 = jttVar.n;
                final String g = jqx.g(str5);
                juf g2 = jug.g();
                g2.f(a3);
                g2.d(i6);
                g2.c(i7);
                g2.e(i8);
                g2.b(i9);
                g2.g(i10);
                return mio.h(jqxVar.e.c(g, Collections.singletonList(g2.a()), Collections.emptySet()), new miy() { // from class: jqs
                    @Override // defpackage.miy
                    public final mko a(Object obj) {
                        jtr c;
                        jqx jqxVar2 = jqx.this;
                        juc jucVar = a3;
                        String str7 = g;
                        String str8 = str5;
                        int i12 = i11;
                        jtr jtrVar3 = jtrVar2;
                        int i13 = a;
                        Void r8 = (Void) obj;
                        jsr o = jucVar.o();
                        int i14 = jsi.a;
                        ((luc) ((luc) jsh.a.b()).k("com/google/android/libraries/micore/superpacks/Superpacks", "lambda$registerManifest$3", 603, "Superpacks.java")).G("Successfully got manifest for %s: %s", str7, o);
                        try {
                            jqm a4 = jqxVar2.k.a(str8, i12);
                            if (a4 == null) {
                                throw new jsk("Manifest registration failed for ".concat(str8));
                            }
                            jqxVar2.i.d(jtrVar3);
                            jrn jrnVar2 = (jrn) jtrVar3;
                            String str9 = jrnVar2.a;
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(jrnVar2.b));
                            List b = jqxVar2.e.f.b(str7);
                            if (b.isEmpty()) {
                                c = null;
                            } else {
                                if (b.size() > 1) {
                                    ((luc) ((luc) jsh.a.d()).k("com/google/android/libraries/micore/superpacks/packs/PackUtil", "getPendingManifest", 27, "PackUtil.java")).E("There is more than 1 pending pack for manifest %s, count: %d", str7, b.size());
                                }
                                c = jsi.c(((jrh) ((jvb) b.iterator().next()).a).b);
                            }
                            if (c != null) {
                                hashSet.add(Integer.valueOf(((jrn) c).b));
                            }
                            lta listIterator = ((llp) jqxVar2.b.c(str9)).listIterator();
                            while (listIterator.hasNext()) {
                                hashSet.add(Integer.valueOf(((jss) listIterator.next()).a()));
                            }
                            jqxVar2.k.c(jrnVar2.a, hashSet, jqxVar2.j);
                            jrz a5 = jsf.a(str8);
                            a5.f(2);
                            a5.c("api", "register_succeeded", Integer.valueOf(i13), Integer.valueOf(((jpd) a4).b));
                            jqxVar2.m.a(new jpg(a4, 5));
                            return kcu.K(a4);
                        } catch (jpz e2) {
                            jqxVar2.n.a(new jqn(jtrVar3, jqxVar2.f.k(jucVar.o()), e2, 0));
                            throw e2;
                        }
                    }
                }, jqxVar.g);
            }
        }, this.g);
        return this.m.b() ? P : mhu.h(P, Throwable.class, new jkg(this, jtrVar, P, 20), this.g);
    }

    public final mko f(final String str, final jsq jsqVar) {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        mko P = kcu.P(new mix() { // from class: jqt
            @Override // defpackage.mix
            public final mko a() {
                final jqx jqxVar = jqx.this;
                final String str2 = str;
                jsq jsqVar2 = jsqVar;
                final long j = elapsedRealtime;
                jqxVar.j();
                final int a = jqxVar.i.a(str2);
                lug lugVar = jsh.a;
                final jqm a2 = jqxVar.a(str2, a, "sync");
                if (a2 == null) {
                    throw new jsk("No manifest registered for ".concat(String.valueOf(str2)));
                }
                String str3 = ((jrn) a2.e()).a;
                jqk c = jqxVar.d.c(str3);
                lug lugVar2 = jsh.a;
                a2.e();
                jve a3 = jqxVar.b.a(str3, true);
                llp q = a3 != null ? a3.a : llp.q();
                Set<jsr> e = jss.e(q);
                jqj b = c.b(a2, jsqVar2);
                jqxVar.m(str3, b.d());
                jpc jpcVar = (jpc) b;
                llp llpVar = jpcVar.a;
                ((luc) ((luc) jsh.a.b()).k("com/google/android/libraries/micore/superpacks/Superpacks", "requestSlices", 1723, "Superpacks.java")).K("Syncing %s (%d) with slices: %s, metadata: %b", str3, Integer.valueOf(a), jtq.h(llpVar, jky.g), Boolean.valueOf(jpcVar.c != null));
                for (jsr jsrVar : e) {
                    jru.a.a(jqxVar.f.h(jsrVar));
                }
                c.a();
                return mio.h(mio.h(jqxVar.e.c(str3, llpVar, e), new jjv(jqxVar, str3, q, b, a3, 2), jqxVar.g), new miy() { // from class: jqo
                    @Override // defpackage.miy
                    public final mko a(Object obj) {
                        String str4;
                        final jqx jqxVar2 = jqx.this;
                        long j2 = j;
                        String str5 = str2;
                        jqm jqmVar = a2;
                        int i = a;
                        jre jreVar = (jre) obj;
                        long elapsedRealtime2 = SystemClock.elapsedRealtime();
                        luc lucVar = (luc) ((luc) jsh.a.b()).k("com/google/android/libraries/micore/superpacks/Superpacks", "lambda$sync$8", 790, "Superpacks.java");
                        Long valueOf = Long.valueOf(elapsedRealtime2 - j2);
                        jdg.u(jreVar);
                        llp a4 = jreVar.a();
                        llp d = jreVar.d();
                        boolean f = jreVar.f();
                        if (!a4.isEmpty() || !d.isEmpty() || !f) {
                            String concat = !a4.isEmpty() ? "{added: ".concat(jre.l(a4)) : "{";
                            if (!d.isEmpty()) {
                                if (concat.length() > 1) {
                                    concat = concat.concat(", ");
                                }
                                concat = concat + "removed: " + jre.l(d);
                            }
                            str4 = concat + ", metadata: " + (jreVar.g() != null);
                            if (!f) {
                                str4 = str4.concat(", not last batch");
                            }
                        } else {
                            str4 = "no changes";
                        }
                        lucVar.J("Sync for %s succeeded in %d ms: %s", str5, valueOf, str4);
                        jdg.u(jqmVar);
                        jtr e2 = jqmVar.e();
                        jdg.u(jreVar);
                        if (jreVar.e()) {
                            llp c2 = jreVar.c();
                            lug lugVar3 = jsh.a;
                            int i2 = ((lrl) c2).c;
                            for (int i3 = 0; i3 < i2; i3++) {
                                jvr jvrVar = jqxVar2.f;
                                jsr o = ((juc) c2.get(i3)).o();
                                int i4 = jsi.a;
                                jqxVar2.d.g(((jrn) e2).a);
                                jvrVar.u(o);
                            }
                            llp b2 = jreVar.b();
                            ArrayList arrayList = new ArrayList();
                            int i5 = ((lrl) b2).c;
                            for (int i6 = 0; i6 < i5; i6++) {
                                juc jucVar = (juc) b2.get(i6);
                                jvv g = jvw.g();
                                g.b(jucVar.b());
                                g.a = jqxVar2.f.b(((jrh) jucVar.o()).a);
                                jsr o2 = jucVar.o();
                                int i7 = jsi.a;
                                g.c(o2);
                                g.e(jucVar.d());
                                g.d(1);
                                arrayList.add(g.a());
                            }
                            lug lugVar4 = jsh.a;
                            jqxVar2.f.o(arrayList);
                            llp b3 = jreVar.b();
                            ArrayList arrayList2 = new ArrayList();
                            int i8 = ((lrl) b3).c;
                            for (int i9 = 0; i9 < i8; i9++) {
                                juc jucVar2 = (juc) b3.get(i9);
                                jsr o3 = jucVar2.o();
                                jtr e3 = jucVar2.e();
                                jdg.u(e3);
                                arrayList2.add(jss.c(o3, e3.a()));
                            }
                            jvf jvfVar = jqxVar2.b;
                            byte[] g2 = jreVar.g();
                            try {
                                SQLiteDatabase writableDatabase = ((jvk) jvfVar).a.getWritableDatabase();
                                ContentValues contentValues = new ContentValues(3);
                                contentValues.put("superpack_name", ((jrn) e2).a);
                                contentValues.put("superpack_version", Integer.valueOf(((jrn) e2).b));
                                contentValues.put("pack_list", jut.a(arrayList2));
                                contentValues.put("sync_metadata", g2);
                                long replaceOrThrow = writableDatabase.replaceOrThrow("selected_packs", null, contentValues);
                                if (replaceOrThrow < 0) {
                                    jum jumVar = ((jvk) jvfVar).a;
                                    IOException iOException = new IOException("SqliteSelectedPacks#write, SQL replace returned < 0, superpackName: " + String.valueOf(e2) + "rowId: " + replaceOrThrow);
                                    jumVar.a(iOException);
                                    throw iOException;
                                }
                                jtq.p(jreVar.c(), jreVar.b(), new jtp() { // from class: jqr
                                    @Override // defpackage.jtp
                                    public final void a(Object obj2, int i10) {
                                        jqx jqxVar3 = jqx.this;
                                        juc jucVar3 = (juc) obj2;
                                        jsr o4 = jucVar3.o();
                                        jqxVar3.n.a(new jqv(o4, jucVar3, jqxVar3.f.k(o4), i10, 1));
                                    }
                                }, jpf.d);
                            } catch (SQLiteException e4) {
                                jum jumVar2 = ((jvk) jvfVar).a;
                                IOException iOException2 = new IOException("SqliteSelectedPacks#write, SQL replace failed, superpackName: ".concat(String.valueOf(String.valueOf(e2))), e4);
                                jumVar2.a(iOException2);
                                throw iOException2;
                            }
                        }
                        jrz a5 = jsf.a(str5);
                        a5.f(2);
                        a5.c("api", "sync_succeeded", Integer.valueOf(i), Boolean.valueOf(jreVar.e()), Integer.valueOf(((lrl) jreVar.b()).c));
                        return kcu.K(jreVar);
                    }
                }, jqxVar.g);
            }
        }, this.g);
        mko b = kcu.X(P).b(new jqu(this, str, P, 1), this.g);
        return this.m.b() ? b : kcu.X(b).b(new jqu(this, P, str, 0), this.g);
    }

    public final List h(String str, List list) {
        ArrayList arrayList = new ArrayList();
        ((jph) this.k).b.lock();
        try {
            lta listIterator = ((llp) list).listIterator();
            while (listIterator.hasNext()) {
                jss jssVar = (jss) listIterator.next();
                jqm a = a(str, jssVar.a(), "openPacks");
                if (a == null) {
                    String valueOf = String.valueOf(jssVar);
                    throw new jsk("A manifest could not be found for " + valueOf);
                }
                String str2 = ((jrh) jssVar.b()).b;
                if (!((jpd) a).c.containsKey(str2) && !((jpd) a).c.containsKey(juc.q(str2))) {
                    String valueOf2 = String.valueOf(jssVar);
                    throw new jsk("The manifest does not contain " + valueOf2);
                }
                arrayList.add(a.g(jssVar.b()));
            }
            return arrayList;
        } finally {
            ((jph) this.k).b.unlock();
        }
    }

    public final void i(String str) {
        jve a = this.b.a(str, false);
        if (a == null) {
            return;
        }
        llp llpVar = a.a;
        if (!llpVar.isEmpty()) {
            jvr jvrVar = this.f;
            Set<jsr> e = jss.e(llpVar);
            this.d.g(str);
            synchronized (jvrVar.b) {
                for (jsr jsrVar : e) {
                    jvrVar.u(jsrVar);
                }
            }
        }
        jvf jvfVar = this.b;
        try {
            ((jvk) jvfVar).a.getWritableDatabase().delete("selected_packs", "superpack_name=?", new String[]{str});
        } catch (SQLiteException e2) {
            jum jumVar = ((jvk) jvfVar).a;
            IOException iOException = new IOException("SqliteSelectedPacks#remove, SQL delete failed, superpackName: ".concat(String.valueOf(str)), e2);
            jumVar.a(iOException);
            throw iOException;
        }
    }

    public final void j() {
        if (this.p.getAndSet(true)) {
            return;
        }
        this.h.getReadableDatabase();
    }

    public final void k(String str, jqk jqkVar) {
        lug lugVar = jsh.a;
        this.d.e(str, jqkVar);
    }

    public final void m(String str, List list) {
        if (this.d.b(str) == jqf.a) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            juc jucVar = (juc) it.next();
        }
    }
}
