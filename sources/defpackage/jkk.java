package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: jkk  reason: default package */
/* loaded from: classes.dex */
public final class jkk {
    public final Context a;
    public final jkl b;
    public final jli c;
    public final jjd d;
    public final Executor e;
    public final lfb f;
    public final lfb g;
    public final jhy h;
    public final jlr i = jlr.b();
    public final kcq j;
    public final lwm k;

    public jkk(Context context, lwm lwmVar, jkl jklVar, jli jliVar, jjd jjdVar, Executor executor, lfb lfbVar, kcq kcqVar, lfb lfbVar2, jhy jhyVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = context;
        this.k = lwmVar;
        this.b = jklVar;
        this.c = jliVar;
        this.d = jjdVar;
        this.e = executor;
        this.f = lfbVar;
        this.j = kcqVar;
        this.g = lfbVar2;
        this.h = jhyVar;
    }

    public static boolean q(jig jigVar, jig jigVar2) {
        if (jigVar2.q == jigVar.q && jigVar2.r.equals(jigVar.r) && jigVar2.e == jigVar.e && r(jigVar, jigVar2) && jigVar2.i == jigVar.i && jigVar2.j == jigVar.j) {
            jij jijVar = jigVar2.k;
            if (jijVar == null) {
                jijVar = jij.f;
            }
            jij jijVar2 = jigVar.k;
            if (jijVar2 == null) {
                jijVar2 = jij.f;
            }
            if (jijVar.equals(jijVar2)) {
                int h = ker.h(jigVar2.h);
                if (h == 0) {
                    h = 1;
                }
                int h2 = ker.h(jigVar.h);
                if (h2 == 0) {
                    h2 = 1;
                }
                if (h == h2) {
                    int o = jez.o(jigVar2.p);
                    if (o == 0) {
                        o = 1;
                    }
                    int o2 = jez.o(jigVar.p);
                    if (o2 == 0) {
                        o2 = 1;
                    }
                    if (o == o2) {
                        oot ootVar = jigVar2.t;
                        if (ootVar == null) {
                            ootVar = oot.a;
                        }
                        oot ootVar2 = jigVar.t;
                        if (ootVar2 == null) {
                            ootVar2 = oot.a;
                        }
                        return ootVar.equals(ootVar2);
                    }
                }
            }
        }
        return false;
    }

    public static boolean r(jig jigVar, jig jigVar2) {
        return jigVar.m.equals(jigVar2.m);
    }

    public static boolean t(jiu jiuVar, long j) {
        return j > jiuVar.e;
    }

    public static void v(jig jigVar) {
        String str = jigVar.c;
        int i = jigVar.e;
        long j = jigVar.q;
        String str2 = jigVar.r;
    }

    public static void w(jig jigVar, jie jieVar, int i) {
        nfh t = mgz.j.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mgz mgzVar = (mgz) t.b;
        mgzVar.b = mhb.b(i);
        mgzVar.a |= 1;
        String str = jigVar.c;
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mgz mgzVar2 = (mgz) t.b;
        str.getClass();
        int i2 = mgzVar2.a | 2;
        mgzVar2.a = i2;
        mgzVar2.c = str;
        int i3 = jigVar.e;
        int i4 = i2 | 4;
        mgzVar2.a = i4;
        mgzVar2.d = i3;
        long j = jigVar.q;
        int i5 = i4 | 128;
        mgzVar2.a = i5;
        mgzVar2.h = j;
        String str2 = jigVar.r;
        str2.getClass();
        int i6 = i5 | 256;
        mgzVar2.a = i6;
        mgzVar2.i = str2;
        String str3 = jieVar.b;
        str3.getClass();
        mgzVar2.a = i6 | 8;
        mgzVar2.e = str3;
        mgz mgzVar3 = (mgz) t.cz();
    }

    public final Uri a(Uri uri, jie jieVar, jig jigVar) {
        Uri ax = lre.ax(this.a, this.f, jieVar, jigVar);
        Uri a = jmt.a(this.a, ax);
        if (!this.j.v(ax) || !a.toString().equals(uri.toString())) {
            throw new IOException("Isolated file uri does not exist or points to an unexpected target");
        }
        return ax;
    }

    public final Uri b(jie jieVar, jit jitVar, jiu jiuVar) {
        Context context = this.a;
        int h = ker.h(jitVar.e);
        Uri y = lxj.y(context, h == 0 ? 1 : h, jiuVar.b, jieVar.f, this.f, false);
        if (y != null) {
            return y;
        }
        jmk.b("%s: Failed to get file uri!", "FileGroupManager");
        throw new jmo(28, "Failed to get local file uri");
    }

    public final mko c(jig jigVar) {
        if (!jigVar.l) {
            return mkk.a;
        }
        try {
            lre.aN(this.a, this.f, jigVar, this.j);
            ArrayList arrayList = new ArrayList(jigVar.m.size());
            Iterator it = jigVar.m.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                jie jieVar = (jie) it.next();
                int j = ker.j(jieVar.l);
                if (j == 0 || j != 2) {
                    arrayList.add(m(g(jieVar, jigVar), new cvr(this, jieVar, jigVar, 10)));
                } else {
                    arrayList.add(kcu.J(new UnsupportedOperationException("Preserve File Paths is invalid with Android Blob Sharing")));
                    break;
                }
            }
            mko a = kcu.Y(arrayList).a(hcb.f, this.e);
            jco.k(a, new fel(this, jigVar, 10), this.e);
            return a;
        } catch (IOException e) {
            nzv a2 = jhv.a();
            a2.a = jhu.UNABLE_TO_REMOVE_SYMLINK_STRUCTURE;
            a2.b = "Unable to cleanup symlink structure";
            a2.c = e;
            return kcu.J(a2.e());
        }
    }

    public final mko d(jiq jiqVar, jij jijVar, miy miyVar) {
        AtomicReference atomicReference = new AtomicReference();
        return jco.h(m(e(jiqVar, false), new jjv(this, jiqVar, atomicReference, jijVar, miyVar, 0)), Exception.class, new cvr(this, atomicReference, jiqVar, 13), this.e);
    }

    public final mko e(jiq jiqVar, boolean z) {
        nfh nfhVar = (nfh) jiqVar.N(5);
        nfhVar.cG(jiqVar);
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        jiq jiqVar2 = (jiq) nfhVar.b;
        jiq jiqVar3 = jiq.f;
        jiqVar2.a |= 8;
        jiqVar2.e = z;
        return m(this.b.g((jiq) nfhVar.cz()), new jja(this, z, 2));
    }

    public final mko f(final jig jigVar, final boolean z, final boolean z2, final int i, final int i2) {
        if (i >= i2) {
            if (z) {
                return kcu.K(jkj.FAILED);
            }
            if (z2) {
                return kcu.K(jkj.PENDING);
            }
            return kcu.K(jkj.DOWNLOADED);
        }
        final jie jieVar = (jie) jigVar.m.get(i);
        int i3 = 1;
        if (!lre.aE(jieVar)) {
            int h = ker.h(jigVar.h);
            if (h != 0) {
                i3 = h;
            }
            jit t = kki.t(jieVar, i3);
            jli jliVar = this.c;
            return jnd.c(jco.j(jliVar.d(t), jlf.b, jliVar.i)).b(jlj.class, new ivo(jigVar, 19), this.e).g(new miy() { // from class: jka
                @Override // defpackage.miy
                public final mko a(Object obj) {
                    jkk jkkVar = jkk.this;
                    jie jieVar2 = jieVar;
                    jig jigVar2 = jigVar;
                    boolean z3 = z;
                    boolean z4 = z2;
                    int i4 = i;
                    int i5 = i2;
                    jip jipVar = (jip) obj;
                    if (jipVar == jip.DOWNLOAD_COMPLETE) {
                        String str = jieVar2.b;
                        String str2 = jigVar2.c;
                        int i6 = jmk.a;
                        return jkkVar.f(jigVar2, z3, z4, i4 + 1, i5);
                    } else if (jipVar == jip.SUBSCRIBED || jipVar == jip.DOWNLOAD_IN_PROGRESS) {
                        String str3 = jieVar2.b;
                        String str4 = jigVar2.c;
                        int i7 = jmk.a;
                        return jkkVar.f(jigVar2, z3, true, i4 + 1, i5);
                    } else {
                        String str5 = jieVar2.b;
                        String str6 = jigVar2.c;
                        int i8 = jmk.a;
                        return jkkVar.f(jigVar2, true, z4, i4 + 1, i5);
                    }
                }
            }, this.e);
        }
        return f(jigVar, z, z2, i + 1, i2);
    }

    public final mko g(jie jieVar, jig jigVar) {
        if (!lre.aE(jieVar)) {
            int h = ker.h(jigVar.h);
            if (h == 0) {
                h = 1;
            }
            return this.c.c(kki.t(jieVar, h));
        }
        return kcu.K(Uri.parse(jieVar.c));
    }

    public final mko h(miy miyVar) {
        return m(this.b.d(), new cvr(this, new ArrayList(), miyVar, 18));
    }

    public final mko i(jiq jiqVar, jhv jhvVar, long j, String str) {
        nfh t = mgy.h.t();
        String str2 = jiqVar.b;
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mgy mgyVar = (mgy) t.b;
        str2.getClass();
        int i = mgyVar.a | 1;
        mgyVar.a = i;
        mgyVar.b = str2;
        String str3 = jiqVar.c;
        str3.getClass();
        int i2 = i | 4;
        mgyVar.a = i2;
        mgyVar.d = str3;
        int i3 = i2 | 64;
        mgyVar.a = i3;
        mgyVar.f = j;
        str.getClass();
        mgyVar.a = i3 | 128;
        mgyVar.g = str;
        jkl jklVar = this.b;
        nfh nfhVar = (nfh) jiqVar.N(5);
        nfhVar.cG(jiqVar);
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        jiq jiqVar2 = (jiq) nfhVar.b;
        jiqVar2.a |= 8;
        jiqVar2.e = false;
        return m(jklVar.g((jiq) nfhVar.cz()), new hzb(t, jhvVar, 9));
    }

    public final mko j(jig jigVar, boolean z) {
        this.h.k();
        if (jigVar == null || !z || !lre.aD(jigVar)) {
            return kcu.K(true);
        }
        ArrayList arrayList = new ArrayList(jigVar.m.size());
        for (jie jieVar : jigVar.m) {
            arrayList.add(m(g(jieVar, jigVar), new jkg(this, jieVar, jigVar, 3)));
        }
        return jco.g(kcu.Y(arrayList).a(hcb.m, this.e), IOException.class, new iul(jigVar, 19), this.e);
    }

    public final mko k(final jig jigVar, final int i, final int i2) {
        int i3 = 1;
        if (i < i2) {
            jie jieVar = (jie) jigVar.m.get(i);
            if (!lre.aE(jieVar)) {
                int h = ker.h(jigVar.h);
                if (h != 0) {
                    i3 = h;
                }
                jit t = kki.t(jieVar, i3);
                jli jliVar = this.c;
                return m(jco.j(jliVar.b.e(t), new jko(jliVar, t, 20), jliVar.i), new miy() { // from class: jjz
                    @Override // defpackage.miy
                    public final mko a(Object obj) {
                        jkk jkkVar = jkk.this;
                        jig jigVar2 = jigVar;
                        int i4 = i;
                        int i5 = i2;
                        if (!((Boolean) obj).booleanValue()) {
                            jmk.c("%s: Subscribing to file failed for group: %s", "FileGroupManager", jigVar2.c);
                            return kcu.K(false);
                        }
                        return jkkVar.k(jigVar2, i4 + 1, i5);
                    }
                });
            }
            return k(jigVar, i + 1, i2);
        }
        return kcu.K(true);
    }

    public final mko l(mko mkoVar, leq leqVar) {
        return jco.i(mkoVar, leqVar, this.e);
    }

    public final mko m(mko mkoVar, miy miyVar) {
        return jco.j(mkoVar, miyVar, this.e);
    }

    public final mko n(jig jigVar, jie jieVar, jit jitVar, long j) {
        jli jliVar = this.c;
        return m(jco.j(jliVar.d(jitVar), new jlg(jliVar, j, jitVar, 0), jliVar.i), new cvr(this, jieVar, jigVar, 14));
    }

    public final mko o(jiq jiqVar, final jig jigVar, final miy miyVar) {
        final lvw F = lvw.F(this.k);
        String str = jigVar.c;
        int i = jmk.a;
        nfh nfhVar = (nfh) jiqVar.N(5);
        nfhVar.cG(jiqVar);
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        jiq jiqVar2 = (jiq) nfhVar.b;
        jiq jiqVar3 = jiq.f;
        jiqVar2.a |= 8;
        jiqVar2.e = true;
        final jiq jiqVar4 = (jiq) nfhVar.cz();
        nfh nfhVar2 = (nfh) jiqVar.N(5);
        nfhVar2.cG(jiqVar);
        if (nfhVar2.c) {
            nfhVar2.cD();
            nfhVar2.c = false;
        }
        jiq jiqVar5 = (jiq) nfhVar2.b;
        jiqVar5.a |= 8;
        jiqVar5.e = false;
        final jiq jiqVar6 = (jiq) nfhVar2.cz();
        long a = this.d.a();
        jif jifVar = jigVar.b;
        if (jifVar == null) {
            jifVar = jif.g;
        }
        nfh nfhVar3 = (nfh) jifVar.N(5);
        nfhVar3.cG(jifVar);
        if (nfhVar3.c) {
            nfhVar3.cD();
            nfhVar3.c = false;
        }
        jif jifVar2 = (jif) nfhVar3.b;
        jifVar2.a |= 4;
        jifVar2.d = a;
        jif jifVar3 = (jif) nfhVar3.cz();
        nfh nfhVar4 = (nfh) jigVar.N(5);
        nfhVar4.cG(jigVar);
        if (nfhVar4.c) {
            nfhVar4.cD();
            nfhVar4.c = false;
        }
        jig jigVar2 = (jig) nfhVar4.b;
        jifVar3.getClass();
        jigVar2.b = jifVar3;
        jigVar2.a |= 1;
        final jig jigVar3 = (jig) nfhVar4.cz();
        return jnd.c(f(jigVar, false, false, 0, jigVar.m.size())).g(new miy(F, jigVar, jiqVar6, miyVar, jiqVar4, jigVar3, null, null, null) { // from class: jkf
            public final /* synthetic */ jig b;
            public final /* synthetic */ jiq c;
            public final /* synthetic */ miy d;
            public final /* synthetic */ jiq e;
            public final /* synthetic */ jig f;
            public final /* synthetic */ lvw g;

            @Override // defpackage.miy
            public final mko a(Object obj) {
                jkk jkkVar = jkk.this;
                lvw lvwVar = this.g;
                jig jigVar4 = this.b;
                jiq jiqVar7 = this.c;
                miy miyVar2 = this.d;
                jiq jiqVar8 = this.e;
                jig jigVar5 = this.f;
                jkj jkjVar = (jkj) obj;
                if (jkjVar == jkj.FAILED) {
                    lvw.B(jigVar4);
                    return kcu.K(jkj.FAILED);
                } else if (jkjVar == jkj.PENDING) {
                    lvw.B(jigVar4);
                    return kcu.K(jkj.PENDING);
                } else {
                    jdg.v(jkjVar == jkj.DOWNLOADED);
                    return jnd.c(miyVar2.a(jigVar4)).g(new fem(jkkVar, lvwVar, jigVar4, jiqVar7, 12, (byte[]) null, (byte[]) null, (byte[]) null), jkkVar.e).g(new hzb(jkkVar, jigVar4, 19), jkkVar.e).g(new jkg(jkkVar, jiqVar8, jigVar5, 2), jkkVar.e).g(new hzb(jkkVar, jiqVar7, 20), jkkVar.e).g(new jke(jkkVar, 6), jkkVar.e).e(new fyn(lvwVar, jigVar5, 19, null, null, null), jkkVar.e);
                }
            }
        }, this.e).g(new hzb(this, jigVar, 16), this.e);
    }

    public final void p(Uri uri, jig jigVar, jie jieVar) {
        try {
            this.j.t(uri);
        } catch (IOException unused) {
            jmk.d("%s: Failed to delete the local copy after android-sharing the file %s, file group %s", "FileGroupManager", jieVar.b, jigVar.c);
            w(jigVar, jieVar, 23);
        }
    }

    public final boolean s(String str) {
        try {
            this.a.getPackageManager().getApplicationInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public final mko u(final jig jigVar, final jie jieVar, jiu jiuVar, jit jitVar, String str, long j, final int i) {
        int i2;
        String str2 = "";
        if (!jiuVar.d || t(jiuVar, j)) {
            final long max = Math.max(j, jiuVar.e);
            Context context = this.a;
            kcq kcqVar = this.j;
            try {
                lfy lfyVar = kot.a;
                OutputStream outputStream = (OutputStream) kcqVar.q(kqn.g(String.valueOf(str).concat(".lease"), context.getPackageName(), max), kps.b());
                if (outputStream != null) {
                    outputStream.close();
                }
                i2 = 0;
            } catch (kox unused) {
                jmk.d("%s: Failed to share after download for file %s, file group %s due to LimitExceededException", "AndroidSharingUtil", jieVar.b, jigVar.c);
                str2 = String.format("System limit exceeded for file %s, group %s", jieVar.b, jigVar.c);
                i2 = 25;
            } catch (koy unused2) {
                jmk.d("%s: Malformed lease uri file %s, file group %s", "AndroidSharingUtil", jieVar.b, jigVar.c);
                str2 = String.format("Malformed lease Uri for file %s, group %s", jieVar.b, jigVar.c);
                i2 = 18;
            } catch (kpa e) {
                if (!TextUtils.isEmpty(e.getMessage())) {
                    str2 = e.getMessage();
                }
                String str3 = jieVar.b;
                String str4 = jigVar.c;
                str2 = "UnsupportedFileStorageOperation was thrown: ".concat(String.valueOf(str2));
                int i3 = jmk.a;
                i2 = 24;
            } catch (IOException unused3) {
                jmk.d("%s: Failed to acquire lease for file %s, file group %s", "AndroidSharingUtil", jieVar.b, jigVar.c);
                str2 = String.format("Error while acquiring lease for file %s, group %s", jieVar.b, jigVar.c);
                i2 = 20;
            }
            if (i2 == 0) {
                jli jliVar = this.c;
                nfh t = jiu.h.t();
                jip jipVar = jip.DOWNLOAD_COMPLETE;
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                jiu jiuVar2 = (jiu) t.b;
                jiuVar2.c = jipVar.h;
                int i4 = jiuVar2.a | 2;
                jiuVar2.a = i4;
                int i5 = i4 | 1;
                jiuVar2.a = i5;
                jiuVar2.b = "android_shared_".concat(String.valueOf(str));
                int i6 = i5 | 4;
                jiuVar2.a = i6;
                jiuVar2.d = true;
                int i7 = i6 | 8;
                jiuVar2.a = i7;
                jiuVar2.e = max;
                str.getClass();
                jiuVar2.a = i7 | 16;
                jiuVar2.f = str;
                return m(jliVar.b.g(jitVar, (jiu) t.cz()), new miy() { // from class: jkb
                    @Override // defpackage.miy
                    public final mko a(Object obj) {
                        jie jieVar2 = jieVar;
                        jig jigVar2 = jigVar;
                        int i8 = i;
                        long j2 = max;
                        if (!((Boolean) obj).booleanValue()) {
                            jmk.d("%s: Failed to set new state for file %s, filegroup %s", "FileGroupManager", jieVar2.b, jigVar2.c);
                            jkk.w(jigVar2, jieVar2, 15);
                            return kcu.K(false);
                        }
                        nfh t2 = mgz.j.t();
                        if (t2.c) {
                            t2.cD();
                            t2.c = false;
                        }
                        mgz mgzVar = (mgz) t2.b;
                        mgzVar.b = mhb.b(i8);
                        mgzVar.a |= 1;
                        String str5 = jigVar2.c;
                        if (t2.c) {
                            t2.cD();
                            t2.c = false;
                        }
                        mgz mgzVar2 = (mgz) t2.b;
                        str5.getClass();
                        int i9 = 2 | mgzVar2.a;
                        mgzVar2.a = i9;
                        mgzVar2.c = str5;
                        int i10 = jigVar2.e;
                        int i11 = i9 | 4;
                        mgzVar2.a = i11;
                        mgzVar2.d = i10;
                        long j3 = jigVar2.q;
                        int i12 = i11 | 128;
                        mgzVar2.a = i12;
                        mgzVar2.h = j3;
                        String str6 = jigVar2.r;
                        str6.getClass();
                        int i13 = i12 | 256;
                        mgzVar2.a = i13;
                        mgzVar2.i = str6;
                        String str7 = jieVar2.b;
                        str7.getClass();
                        int i14 = i13 | 8;
                        mgzVar2.a = i14;
                        mgzVar2.e = str7;
                        int i15 = i14 | 16;
                        mgzVar2.a = i15;
                        mgzVar2.f = true;
                        mgzVar2.a = i15 | 32;
                        mgzVar2.g = j2;
                        mgz mgzVar3 = (mgz) t2.cz();
                        return kcu.K(true);
                    }
                });
            }
            throw new jmo(i2, str2);
        }
        w(jigVar, jieVar, i);
        return kcu.K(true);
    }
}
