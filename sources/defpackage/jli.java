package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jli  reason: default package */
/* loaded from: classes.dex */
public final class jli {
    public final Context a;
    public final jlk b;
    public final jmi c;
    public final lfb d;
    public final lfb e;
    public final jhy f;
    public final jkl g;
    public final lfb h;
    public final Executor i;
    public final jlu j;
    public final kcq k;
    public final lwm l;

    public jli(Context context, jlu jluVar, jlk jlkVar, kcq kcqVar, jmi jmiVar, lfb lfbVar, lfb lfbVar2, lwm lwmVar, jhy jhyVar, jkl jklVar, lfb lfbVar3, Executor executor, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = context;
        this.j = jluVar;
        this.b = jlkVar;
        this.k = kcqVar;
        this.c = jmiVar;
        this.d = lfbVar;
        this.e = lfbVar2;
        this.l = lwmVar;
        this.f = jhyVar;
        this.g = jklVar;
        this.h = lfbVar3;
        this.i = executor;
    }

    public final mko a(jit jitVar) {
        return jco.j(this.b.e(jitVar), new jko(this, jitVar, 16), this.i);
    }

    public final mko b() {
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                Context context = this.a;
                lfy lfyVar = kot.a;
                this.k.t(kqn.g("*.lease", context.getPackageName(), 0L));
            } catch (kpa unused) {
                int i = jmk.a;
            } catch (IOException e) {
                jmk.e(e, "%s: Failed to release the leases in the android shared storage", "SharedFileManager");
            }
        }
        try {
            this.k.x(lxj.u(this.a, this.h));
        } catch (IOException unused2) {
        }
        return mkk.a;
    }

    public final mko c(jit jitVar) {
        return jco.j(this.b.e(jitVar), new jko(this, jitVar, 17), this.i);
    }

    public final mko d(jit jitVar) {
        return jco.j(this.b.e(jitVar), new jku(jitVar, 10), this.i);
    }

    public final mko e(final jiq jiqVar, final jie jieVar, final jit jitVar, final jij jijVar, final int i, final List list) {
        if (jieVar.c.startsWith("inlinefile")) {
            nzv a = jhv.a();
            a.a = jhu.INVALID_INLINE_FILE_URL_SCHEME;
            a.b = "downloading a file with an inlinefile scheme is not supported, use importFiles instead.";
            return kcu.J(a.e());
        }
        return jco.j(this.b.e(jitVar), new miy() { // from class: jld
            @Override // defpackage.miy
            public final mko a(Object obj) {
                mko K;
                final jli jliVar = jli.this;
                final jit jitVar2 = jitVar;
                final jiq jiqVar2 = jiqVar;
                final jie jieVar2 = jieVar;
                final jij jijVar2 = jijVar;
                final int i2 = i;
                final List list2 = list;
                final jiu jiuVar = (jiu) obj;
                if (jiuVar == null) {
                    jmk.c("%s: Start download called on file that doesn't exists. Key = %s!", "SharedFileManager", jitVar2);
                    jlj jljVar = new jlj();
                    nzv a2 = jhv.a();
                    a2.a = jhu.SHARED_FILE_NOT_FOUND_ERROR;
                    a2.c = jljVar;
                    return kcu.J(a2.e());
                }
                jip b = jip.b(jiuVar.c);
                if (b == null) {
                    b = jip.NONE;
                }
                if (b != jip.DOWNLOAD_COMPLETE) {
                    int h = ker.h(jitVar2.e);
                    if (h == 0) {
                        h = 1;
                    }
                    if (kki.x(jliVar.a).d < jkr.USE_CHECKSUM_ONLY.d || !jliVar.d.e() || ((jjf) jliVar.d.a()).b() == 1) {
                        K = kcu.K(null);
                    } else {
                        K = jliVar.g(jieVar2.k, 0, h);
                    }
                    return jco.j(K, new miy() { // from class: jlc
                        @Override // defpackage.miy
                        public final mko a(Object obj2) {
                            final jli jliVar2 = jli.this;
                            jiu jiuVar2 = jiuVar;
                            final jie jieVar3 = jieVar2;
                            final jiq jiqVar3 = jiqVar2;
                            final jit jitVar3 = jitVar2;
                            final jij jijVar3 = jijVar2;
                            final int i3 = i2;
                            final List list3 = list2;
                            final jii jiiVar = (jii) obj2;
                            final nfh nfhVar = (nfh) jiuVar2.N(5);
                            nfhVar.cG(jiuVar2);
                            String str = jiuVar2.b;
                            if (jiiVar != null) {
                                str = lvw.D(str, jiiVar.d);
                            } else if ((jieVar3.a & 32) != 0) {
                                str = lvw.D(str, jieVar3.h);
                            }
                            final String str2 = str;
                            return jco.j(jco.j(jliVar2.g.g(jiqVar3), jlf.a, jliVar2.i), new miy() { // from class: jlb
                                @Override // defpackage.miy
                                public final mko a(Object obj3) {
                                    mko K2;
                                    final jli jliVar3 = jli.this;
                                    nfh nfhVar2 = nfhVar;
                                    final jit jitVar4 = jitVar3;
                                    String str3 = str2;
                                    final jiq jiqVar4 = jiqVar3;
                                    final jie jieVar4 = jieVar3;
                                    final jii jiiVar2 = jiiVar;
                                    final jij jijVar4 = jijVar3;
                                    final int i4 = i3;
                                    final List list4 = list3;
                                    jig jigVar = (jig) obj3;
                                    final int i5 = jigVar.e;
                                    final long j = jigVar.q;
                                    final String str4 = jigVar.r;
                                    int h2 = ker.h(jitVar4.e);
                                    Uri y = lxj.y(jliVar3.a, h2 == 0 ? 1 : h2, str3, jieVar4.f, jliVar3.h, false);
                                    if (y == null) {
                                        jmk.b("%s: Failed to get file uri!", "SharedFileManager");
                                        nzv a3 = jhv.a();
                                        a3.a = jhu.UNABLE_TO_CREATE_FILE_URI_ERROR;
                                        K2 = kcu.J(a3.e());
                                    } else {
                                        K2 = kcu.K(y);
                                    }
                                    final mko mkoVar = K2;
                                    return jnd.c(mkoVar).g(new jkg(jliVar3, nfhVar2, jitVar4, 15), jliVar3.i).g(new miy() { // from class: jlh
                                        @Override // defpackage.miy
                                        public final mko a(Object obj4) {
                                            jli jliVar4 = jli.this;
                                            mko mkoVar2 = mkoVar;
                                            jii jiiVar3 = jiiVar2;
                                            jie jieVar5 = jieVar4;
                                            jit jitVar5 = jitVar4;
                                            jiq jiqVar5 = jiqVar4;
                                            int i6 = i5;
                                            long j2 = j;
                                            String str5 = str4;
                                            jij jijVar5 = jijVar4;
                                            int i7 = i4;
                                            List list5 = list4;
                                            Boolean bool = (Boolean) obj4;
                                            Uri uri = (Uri) kcu.S(mkoVar2);
                                            if (!jliVar4.d.e() || jiiVar3 == null) {
                                                jlk jlkVar = jliVar4.b;
                                                kcq kcqVar = jliVar4.k;
                                                int h3 = ker.h(jitVar5.e);
                                                jme jmeVar = new jme(jlkVar, kcqVar, jieVar5, h3 == 0 ? 1 : h3, jliVar4.l, jiqVar5, i6, j2, str5, jliVar4.f, jliVar4.i, null, null, null, null);
                                                jliVar4.f(jiqVar5, uri);
                                                return jliVar4.c.a(jiqVar5, i6, j2, str5, uri, jieVar5.c, jieVar5.d, jijVar5, jmeVar, i7, list5);
                                            }
                                            Context context = jliVar4.a;
                                            jlk jlkVar2 = jliVar4.b;
                                            kcq kcqVar2 = jliVar4.k;
                                            int h4 = ker.h(jitVar5.e);
                                            jmd jmdVar = new jmd(context, jlkVar2, kcqVar2, jieVar5, h4 == 0 ? 1 : h4, (jjf) jliVar4.d.a(), jiiVar3, jliVar4.l, jiqVar5, i6, j2, str5, jliVar4.h, jliVar4.f, jliVar4.i, null, null, null, null);
                                            jliVar4.f(jiqVar5, uri);
                                            return jliVar4.c.a(jiqVar5, i6, j2, str5, uri, jiiVar3.b, jiiVar3.c, jijVar5, jmdVar, i7, list5);
                                        }
                                    }, jliVar3.i);
                                }
                            }, jliVar2.i);
                        }
                    }, jliVar.i);
                }
                if (jliVar.e.e()) {
                    ((jmz) jliVar.e.a()).g(jiqVar2.b, jieVar2.d);
                }
                return mkk.a;
            }
        }, this.i);
    }

    public final void f(jiq jiqVar, Uri uri) {
        if (this.e.e()) {
            try {
                long o = this.k.o(uri);
                if (o <= 0) {
                    return;
                }
                ((jmz) this.e.a()).g(jiqVar.b, o);
            } catch (IOException unused) {
            }
        }
    }

    public final mko g(final List list, final int i, final int i2) {
        if (i == list.size()) {
            return kcu.K(null);
        }
        final jii jiiVar = (jii) list.get(i);
        int g = ker.g(jiiVar.e);
        if (g == 0) {
            g = 1;
        }
        if (g != ((jjf) this.d.a()).b()) {
            return g(list, i + 1, i2);
        }
        nfh t = jit.g.t();
        jid jidVar = jiiVar.f;
        if (jidVar == null) {
            jidVar = jid.b;
        }
        String str = jidVar.a;
        if (t.c) {
            t.cD();
            t.c = false;
        }
        jit jitVar = (jit) t.b;
        str.getClass();
        int i3 = jitVar.a | 4;
        jitVar.a = i3;
        jitVar.d = str;
        jitVar.e = i2 - 1;
        jitVar.a = i3 | 8;
        final jit jitVar2 = (jit) t.cz();
        return jco.j(this.b.e(jitVar2), new miy() { // from class: jle
            @Override // defpackage.miy
            public final mko a(Object obj) {
                jli jliVar = jli.this;
                jit jitVar3 = jitVar2;
                jii jiiVar2 = jiiVar;
                List list2 = list;
                int i4 = i;
                int i5 = i2;
                jiu jiuVar = (jiu) obj;
                if (jiuVar != null) {
                    jip b = jip.b(jiuVar.c);
                    if (b == null) {
                        b = jip.NONE;
                    }
                    if (b == jip.DOWNLOAD_COMPLETE) {
                        Context context = jliVar.a;
                        int h = ker.h(jitVar3.e);
                        if (lxj.y(context, h == 0 ? 1 : h, jiuVar.b, jitVar3.d, jliVar.h, false) != null) {
                            return kcu.K(jiiVar2);
                        }
                    }
                }
                return jliVar.g(list2, i4 + 1, i5);
            }
        }, this.i);
    }
}
