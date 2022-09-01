package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.libraries.micore.learning.base.ErrorStatusException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* compiled from: PG */
/* renamed from: gbx  reason: default package */
/* loaded from: classes.dex */
public final class gbx {
    public static final Pattern a = Pattern.compile("(output|init|result)\\d+\\.ckp");
    public static final Pattern b = Pattern.compile("learning_transient\\d+artifact($|\\d+\\.sha1)");
    public static final Pattern c = Pattern.compile("secagg\\d+\\.pb");
    public static final jns d = jnl.b("brella", "InAppTrngSchdlr");
    private static final Executor j = mjl.a;
    public final Context e;
    public final fwe f;
    public final fwo g;
    public final jnp h;
    public final gbl i;
    private final Random k;
    private final kqr l;

    public gbx(Context context, fwe fweVar, fwo fwoVar, kqr kqrVar, jnp jnpVar, gbl gblVar) {
        Random random = new Random();
        this.e = context;
        this.f = fweVar;
        this.g = fwoVar;
        this.l = kqrVar;
        this.h = jnpVar;
        this.i = gblVar;
        this.k = random;
    }

    public static long b(joa joaVar) {
        if (!j(joaVar)) {
            jod jodVar = joaVar.d;
            if (jodVar == null) {
                jodVar = jod.c;
            }
            ney neyVar = jodVar.b;
            if (neyVar == null) {
                neyVar = ney.c;
            }
            return nis.a(neyVar);
        }
        return 0L;
    }

    public static boolean j(joa joaVar) {
        jod jodVar = joaVar.d;
        if (jodVar == null) {
            jodVar = jod.c;
        }
        int x = lvw.x(jodVar.a);
        return x != 0 && x == 4;
    }

    public static boolean m(Uri uri, String str) {
        if (uri == null) {
            return str.isEmpty();
        }
        return str.equals(uri.toString());
    }

    public static joe q(nfh nfhVar, final int i) {
        return r(nfhVar, new lfe() { // from class: gbu
            @Override // defpackage.lfe
            public final boolean a(Object obj) {
                int i2 = i;
                Pattern pattern = gbx.a;
                return ((joe) obj).e == i2;
            }
        });
    }

    public static joe r(nfh nfhVar, lfe lfeVar) {
        int i = 0;
        for (joe joeVar : Collections.unmodifiableList(((jof) nfhVar.b).a)) {
            if (lfeVar.a(joeVar)) {
                if (nfhVar.c) {
                    nfhVar.cD();
                    nfhVar.c = false;
                }
                jof jofVar = (jof) nfhVar.b;
                jofVar.b();
                jofVar.a.remove(i);
                return joeVar;
            }
            i++;
        }
        return null;
    }

    public static joe s(nfh nfhVar, String str) {
        return r(nfhVar, new ein(str, 4));
    }

    public static joe t(nfh nfhVar, final String str, final fzf fzfVar, final int i) {
        return fzfVar.b() + (-1) != 0 ? r(nfhVar, new lfe() { // from class: gbr
            @Override // defpackage.lfe
            public final boolean a(Object obj) {
                joa joaVar;
                jnz jnzVar;
                if (r4 != 0) {
                    String str2 = str;
                    fzf fzfVar2 = fzfVar;
                    int i2 = i;
                    joe joeVar = (joe) obj;
                    Pattern pattern = gbx.a;
                    if (joeVar.d.equals(str2)) {
                        if (joeVar.a == 4) {
                            jnzVar = (jnz) joeVar.b;
                        } else {
                            jnzVar = jnz.d;
                        }
                        if (jnzVar.a.equals(fzfVar2.a().a) && joeVar.e == i2) {
                            return true;
                        }
                    }
                    return false;
                }
                String str3 = str;
                fzf fzfVar3 = fzfVar;
                int i3 = i;
                joe joeVar2 = (joe) obj;
                Pattern pattern2 = gbx.a;
                if (joeVar2.d.equals(str3)) {
                    if (joeVar2.a == 13) {
                        joaVar = (joa) joeVar2.b;
                    } else {
                        joaVar = joa.f;
                    }
                    if (joaVar.equals(fzfVar3.c()) && joeVar2.e == i3) {
                        return true;
                    }
                }
                return false;
            }
        }) : r(nfhVar, new lfe() { // from class: gbr
            @Override // defpackage.lfe
            public final boolean a(Object obj) {
                joa joaVar;
                jnz jnzVar;
                if (r4 != 0) {
                    String str2 = str;
                    fzf fzfVar2 = fzfVar;
                    int i2 = i;
                    joe joeVar = (joe) obj;
                    Pattern pattern = gbx.a;
                    if (joeVar.d.equals(str2)) {
                        if (joeVar.a == 4) {
                            jnzVar = (jnz) joeVar.b;
                        } else {
                            jnzVar = jnz.d;
                        }
                        if (jnzVar.a.equals(fzfVar2.a().a) && joeVar.e == i2) {
                            return true;
                        }
                    }
                    return false;
                }
                String str3 = str;
                fzf fzfVar3 = fzfVar;
                int i3 = i;
                joe joeVar2 = (joe) obj;
                Pattern pattern2 = gbx.a;
                if (joeVar2.d.equals(str3)) {
                    if (joeVar2.a == 13) {
                        joaVar = (joa) joeVar2.b;
                    } else {
                        joaVar = joa.f;
                    }
                    if (joaVar.equals(fzfVar3.c()) && joeVar2.e == i3) {
                        return true;
                    }
                }
                return false;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List u(nfh nfhVar, lfe lfeVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (joe joeVar : Collections.unmodifiableList(((jof) nfhVar.b).a)) {
            if (lfeVar.a(joeVar)) {
                arrayList2.add(joeVar);
            } else {
                arrayList.add(joeVar);
            }
        }
        if (!arrayList2.isEmpty()) {
            if (nfhVar.c) {
                nfhVar.cD();
                nfhVar.c = false;
            }
            ((jof) nfhVar.b).a = jof.G();
            if (nfhVar.c) {
                nfhVar.cD();
                nfhVar.c = false;
            }
            jof jofVar = (jof) nfhVar.b;
            jofVar.b();
            ndt.cs(arrayList, jofVar.a);
        }
        return arrayList2;
    }

    private final nhy w(long j2, long j3, fwm fwmVar, boolean z) {
        long millis = TimeUnit.SECONDS.toMillis(this.f.B()) + j2;
        fwq fwqVar = fwmVar.k;
        if (fwqVar == null || gjz.l(fwqVar.a) != 3) {
            return niu.b(millis);
        }
        long n = n(fwmVar.k.b, 3, z);
        long min = Math.min(j2 + n, millis);
        if (j3 == 0) {
            return niu.b(min);
        }
        return niu.b(Math.max(j3 + n, min));
    }

    private final synchronized mkh x(final int i, final String str, final fzf fzfVar, final mzh mzhVar, final int i2) {
        return z(new gbw() { // from class: gbm
            /* JADX WARN: Code restructure failed: missing block: B:20:0x0073, code lost:
                if (r7.c <= 0) goto L46;
             */
            /* JADX WARN: Removed duplicated region for block: B:35:0x00f8  */
            /* JADX WARN: Removed duplicated region for block: B:38:0x010d  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x0146  */
            /* JADX WARN: Removed duplicated region for block: B:43:0x014f  */
            /* JADX WARN: Removed duplicated region for block: B:45:0x0120  */
            @Override // defpackage.gbw
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final defpackage.lfc a(defpackage.jof r20) {
                /*
                    Method dump skipped, instructions count: 340
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.gbm.a(jof):lfc");
            }
        });
    }

    private final synchronized mkh y(final int i, final String str, final fzf fzfVar, final int i2) {
        return z(new gbw() { // from class: gbn
            @Override // defpackage.gbw
            public final lfc a(jof jofVar) {
                nhy b2;
                int i3;
                gbx gbxVar = gbx.this;
                String str2 = str;
                fzf fzfVar2 = fzfVar;
                int i4 = i;
                int i5 = i2;
                nfh nfhVar = (nfh) jofVar.N(5);
                nfhVar.cG(jofVar);
                joe t = gbx.t(nfhVar, str2, fzfVar2, i4);
                if (t == null) {
                    return lfc.a(jofVar, true);
                }
                joa c2 = fzfVar2.c();
                if (c2.d == null) {
                    gbxVar.i.a(t);
                    gbxVar.g.e(job.IN_APP_TRAINING_SCHEDULER_TASK_REMOVED_BECAUSE_PL_TASK_WO_TRAINING_INTERVAL);
                    gbxVar.l(c2);
                    return lfc.a((jof) nfhVar.cz(), true);
                } else if (!gbx.j(c2) || i5 != 0) {
                    long b3 = gbx.b(fzfVar2.c());
                    long a2 = gbxVar.h.a();
                    jod jodVar = c2.d;
                    if (jodVar == null) {
                        jodVar = jod.c;
                    }
                    int x = lvw.x(jodVar.a);
                    if (x == 0) {
                        x = 1;
                    }
                    int i6 = 2;
                    if (i5 == 2) {
                        b2 = niu.b(TimeUnit.SECONDS.toMillis(gbxVar.f.s()) + a2);
                    } else {
                        long millis = TimeUnit.SECONDS.toMillis(gbxVar.f.C());
                        if (i5 != 0) {
                            b3 = millis;
                        }
                        b2 = niu.b(gbxVar.n(b3, x, false) + a2);
                    }
                    if (i5 != 0) {
                        if (i5 == 1) {
                            i6 = 6;
                        } else if (i5 == 2) {
                            i6 = 7;
                        }
                        i3 = 5;
                    } else {
                        i3 = 5;
                        i6 = 5;
                    }
                    nfh nfhVar2 = (nfh) t.N(i3);
                    nfhVar2.cG(t);
                    nhy b4 = niu.b(a2);
                    if (nfhVar2.c) {
                        nfhVar2.cD();
                        nfhVar2.c = false;
                    }
                    joe joeVar = (joe) nfhVar2.b;
                    b4.getClass();
                    joeVar.i = b4;
                    b2.getClass();
                    joeVar.j = b2;
                    joeVar.m = lvw.v(i6);
                    joe joeVar2 = (joe) nfhVar2.cz();
                    nfhVar.dd(joeVar2);
                    jof jofVar2 = (jof) nfhVar.cz();
                    if (!gbxVar.i.b(joeVar2, 0L)) {
                        return lfc.a(jofVar2, false);
                    }
                    return lfc.a(jofVar2, true);
                } else {
                    gbxVar.i.a(t);
                    gbxVar.g.e(job.IN_APP_TRAINING_SCHEDULER_TASK_REMOVED_BECAUSE_ONEOFF_TASK_SUCCEEDED);
                    gbxVar.l(c2);
                    return lfc.a((jof) nfhVar.cz(), true);
                }
            }
        });
    }

    private final mkh z(final gbw gbwVar) {
        final AtomicReference atomicReference = new AtomicReference(null);
        kqr kqrVar = this.l;
        miy miyVar = new miy() { // from class: gbp
            /* JADX WARN: Removed duplicated region for block: B:7:0x005c  */
            @Override // defpackage.miy
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final defpackage.mko a(java.lang.Object r15) {
                /*
                    Method dump skipped, instructions count: 671
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.gbp.a(java.lang.Object):mko");
            }
        };
        Executor executor = j;
        return (mkh) mhu.h(mio.g(mkh.q(kqrVar.c(miyVar, executor)), new ebi(atomicReference, 17), executor), IOException.class, new eoi(this, 14), executor);
    }

    public final long a(long j2, long j3) {
        long max = Math.max(0L, j2);
        double max2 = Math.max(max, j3) - max;
        double nextDouble = this.k.nextDouble();
        Double.isNaN(max2);
        return max + ((long) (max2 * nextDouble));
    }

    public final synchronized mko c(int i) {
        return z(new gbs(this, i, 0));
    }

    public final synchronized mko d(final fwm fwmVar) {
        final int i;
        final String s;
        final String str;
        final String str2;
        final int k;
        final Uri uri;
        final Uri uri2;
        final Uri uri3;
        final boolean z;
        final long j2;
        i = fwmVar.c;
        String packageName = this.e.getPackageName();
        String str3 = fwmVar.b;
        s = mhb.s(packageName + "/" + str3, lfd.d(fwmVar.e));
        str = fwmVar.b;
        str2 = fwmVar.e;
        k = gjz.k(fwmVar.f);
        uri = fwmVar.g;
        uri2 = fwmVar.j;
        uri3 = fwmVar.l;
        long j3 = this.f.Y() ? fwmVar.i : 0L;
        if (j3 > 0) {
            this.g.e(job.IN_APP_TRAINING_OVERRIDE_DEADLINE_USED);
        }
        boolean z2 = true;
        boolean z3 = fwmVar.e != null;
        if (!z3 && (uri2 == null || uri3 == null)) {
            z2 = false;
        }
        jdg.v(z2);
        z = z3;
        j2 = j3;
        return z(new gbw() { // from class: gbo
            /* JADX WARN: Code restructure failed: missing block: B:108:0x02ab, code lost:
                if (r12 == null) goto L109;
             */
            /* JADX WARN: Code restructure failed: missing block: B:109:0x02ad, code lost:
                r12 = null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:110:0x02bf, code lost:
                if (r14 != null) goto L239;
             */
            /* JADX WARN: Code restructure failed: missing block: B:111:0x02c1, code lost:
                r14 = null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:112:0x02c7, code lost:
                r12 = !j$.util.Objects.equals(r14, r12);
             */
            /* JADX WARN: Code restructure failed: missing block: B:113:0x02cd, code lost:
                if (r12 == false) goto L118;
             */
            /* JADX WARN: Code restructure failed: missing block: B:115:0x02d1, code lost:
                if (r10.e == null) goto L117;
             */
            /* JADX WARN: Code restructure failed: missing block: B:116:0x02d3, code lost:
                r7.g.e(defpackage.job.IN_APP_TRAINING_SCHEDULER_FL_TRAINING_INTERVAL_CHANGED);
             */
            /* JADX WARN: Code restructure failed: missing block: B:117:0x02db, code lost:
                r7.g.e(defpackage.job.IN_APP_TRAINING_SCHEDULER_PL_TRAINING_INTERVAL_CHANGED);
             */
            /* JADX WARN: Code restructure failed: missing block: B:118:0x02e2, code lost:
                if (r2 != r4) goto L208;
             */
            /* JADX WARN: Code restructure failed: missing block: B:119:0x02e4, code lost:
                if (r0 != false) goto L208;
             */
            /* JADX WARN: Code restructure failed: missing block: B:120:0x02e6, code lost:
                if (r8 != false) goto L208;
             */
            /* JADX WARN: Code restructure failed: missing block: B:121:0x02e8, code lost:
                if (r11 != false) goto L208;
             */
            /* JADX WARN: Code restructure failed: missing block: B:122:0x02ea, code lost:
                if (r13 != false) goto L208;
             */
            /* JADX WARN: Code restructure failed: missing block: B:123:0x02ec, code lost:
                if (r12 == false) goto L124;
             */
            /* JADX WARN: Code restructure failed: missing block: B:124:0x02f0, code lost:
                r0 = r1.j;
             */
            /* JADX WARN: Code restructure failed: missing block: B:125:0x02f2, code lost:
                if (r0 != null) goto L127;
             */
            /* JADX WARN: Code restructure failed: missing block: B:126:0x02f4, code lost:
                r0 = defpackage.nhy.c;
             */
            /* JADX WARN: Code restructure failed: missing block: B:127:0x02f6, code lost:
                r11 = defpackage.niu.a(r0) - r5;
                r0 = r10.k;
             */
            /* JADX WARN: Code restructure failed: missing block: B:128:0x02fd, code lost:
                if (r0 == null) goto L207;
             */
            /* JADX WARN: Code restructure failed: missing block: B:129:0x02ff, code lost:
                r0 = defpackage.gjz.l(r0.a);
             */
            /* JADX WARN: Code restructure failed: missing block: B:130:0x0307, code lost:
                r10 = r7.n(r11, r0, r3);
             */
            /* JADX WARN: Code restructure failed: missing block: B:131:0x030b, code lost:
                if (r3 == false) goto L144;
             */
            /* JADX WARN: Code restructure failed: missing block: B:132:0x030d, code lost:
                r0 = (defpackage.joe) r9.b;
             */
            /* JADX WARN: Code restructure failed: missing block: B:133:0x0314, code lost:
                if (r0.a != 4) goto L143;
             */
            /* JADX WARN: Code restructure failed: missing block: B:134:0x0316, code lost:
                r0 = (defpackage.jnz) r0.b;
             */
            /* JADX WARN: Code restructure failed: missing block: B:135:0x031d, code lost:
                r2 = (defpackage.nfh) r0.N(5);
                r2.cG(r0);
             */
            /* JADX WARN: Code restructure failed: missing block: B:136:0x0329, code lost:
                if (r2.c == false) goto L142;
             */
            /* JADX WARN: Code restructure failed: missing block: B:137:0x032b, code lost:
                r2.cD();
                r0 = false;
                r2.c = false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:138:0x0333, code lost:
                r4 = defpackage.jnz.d;
                ((defpackage.jnz) r2.b).b = defpackage.lvw.y(r12);
             */
            /* JADX WARN: Code restructure failed: missing block: B:139:0x0341, code lost:
                if (r9.c == false) goto L141;
             */
            /* JADX WARN: Code restructure failed: missing block: B:140:0x0343, code lost:
                r9.cD();
                r9.c = r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:141:0x0348, code lost:
                r0 = (defpackage.joe) r9.b;
                r2 = (defpackage.jnz) r2.cz();
                r2.getClass();
                r0.b = r2;
                r0.a = 4;
             */
            /* JADX WARN: Code restructure failed: missing block: B:142:0x0332, code lost:
                r0 = false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:143:0x031b, code lost:
                r0 = defpackage.jnz.d;
             */
            /* JADX WARN: Code restructure failed: missing block: B:144:0x035a, code lost:
                r2 = r7.f.F() + 30;
                r0 = r1.h;
             */
            /* JADX WARN: Code restructure failed: missing block: B:145:0x0365, code lost:
                if (r0 != null) goto L147;
             */
            /* JADX WARN: Code restructure failed: missing block: B:146:0x0367, code lost:
                r0 = defpackage.nhy.c;
             */
            /* JADX WARN: Code restructure failed: missing block: B:148:0x036f, code lost:
                if (defpackage.niu.a(r0) >= r5) goto L206;
             */
            /* JADX WARN: Code restructure failed: missing block: B:149:0x0371, code lost:
                r0 = r1.h;
             */
            /* JADX WARN: Code restructure failed: missing block: B:150:0x0373, code lost:
                if (r0 != null) goto L152;
             */
            /* JADX WARN: Code restructure failed: missing block: B:151:0x0375, code lost:
                r0 = defpackage.nhy.c;
             */
            /* JADX WARN: Code restructure failed: missing block: B:153:0x0383, code lost:
                if ((r5 - defpackage.niu.a(r0)) >= (r2 * 1000)) goto L206;
             */
            /* JADX WARN: Code restructure failed: missing block: B:154:0x0385, code lost:
                r0 = r1.h;
             */
            /* JADX WARN: Code restructure failed: missing block: B:155:0x0387, code lost:
                if (r0 != null) goto L157;
             */
            /* JADX WARN: Code restructure failed: missing block: B:156:0x0389, code lost:
                r0 = defpackage.nhy.c;
             */
            /* JADX WARN: Code restructure failed: missing block: B:157:0x038b, code lost:
                r2 = r1.i;
             */
            /* JADX WARN: Code restructure failed: missing block: B:158:0x038d, code lost:
                if (r2 != null) goto L160;
             */
            /* JADX WARN: Code restructure failed: missing block: B:159:0x038f, code lost:
                r2 = defpackage.nhy.c;
             */
            /* JADX WARN: Code restructure failed: missing block: B:160:0x0391, code lost:
                defpackage.niu.e(r0);
                defpackage.niu.e(r2);
                r3 = r0.a;
                r12 = r2.a;
                r8 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1));
             */
            /* JADX WARN: Code restructure failed: missing block: B:161:0x039f, code lost:
                if (r3 == r12) goto L200;
             */
            /* JADX WARN: Code restructure failed: missing block: B:162:0x03a1, code lost:
                r0 = r8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:163:0x03b0, code lost:
                if (r0 <= 0) goto L206;
             */
            /* JADX WARN: Code restructure failed: missing block: B:164:0x03b2, code lost:
                r0 = true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:165:0x03b5, code lost:
                r2 = defpackage.niu.b(r5 + r10);
             */
            /* JADX WARN: Code restructure failed: missing block: B:166:0x03ba, code lost:
                if (r0 != false) goto L199;
             */
            /* JADX WARN: Code restructure failed: missing block: B:168:0x03c6, code lost:
                if (((defpackage.gby) r7.i).c(r1.e) == null) goto L184;
             */
            /* JADX WARN: Code restructure failed: missing block: B:169:0x03c8, code lost:
                r0 = r1.l;
             */
            /* JADX WARN: Code restructure failed: missing block: B:170:0x03ca, code lost:
                if (r0 != null) goto L172;
             */
            /* JADX WARN: Code restructure failed: missing block: B:171:0x03cc, code lost:
                r0 = defpackage.joc.f;
             */
            /* JADX WARN: Code restructure failed: missing block: B:172:0x03ce, code lost:
                r3 = ((defpackage.joe) r9.b).l;
             */
            /* JADX WARN: Code restructure failed: missing block: B:173:0x03d4, code lost:
                if (r3 != null) goto L175;
             */
            /* JADX WARN: Code restructure failed: missing block: B:174:0x03d6, code lost:
                r3 = defpackage.joc.f;
             */
            /* JADX WARN: Code restructure failed: missing block: B:176:0x03dc, code lost:
                if (r0.equals(r3) == false) goto L184;
             */
            /* JADX WARN: Code restructure failed: missing block: B:177:0x03de, code lost:
                r0 = r1.j;
             */
            /* JADX WARN: Code restructure failed: missing block: B:178:0x03e0, code lost:
                if (r0 != null) goto L180;
             */
            /* JADX WARN: Code restructure failed: missing block: B:179:0x03e2, code lost:
                r0 = defpackage.nhy.c;
             */
            /* JADX WARN: Code restructure failed: missing block: B:181:0x03e8, code lost:
                if (r0.equals(r2) == false) goto L184;
             */
            /* JADX WARN: Code restructure failed: missing block: B:183:0x03ee, code lost:
                if (r13 <= 0) goto L199;
             */
            /* JADX WARN: Code restructure failed: missing block: B:184:0x03f0, code lost:
                r0 = true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:185:0x03f3, code lost:
                if (r0 == false) goto L186;
             */
            /* JADX WARN: Code restructure failed: missing block: B:186:0x03f6, code lost:
                r2 = r1.j;
             */
            /* JADX WARN: Code restructure failed: missing block: B:187:0x03f8, code lost:
                if (r2 != null) goto L189;
             */
            /* JADX WARN: Code restructure failed: missing block: B:188:0x03fa, code lost:
                r2 = defpackage.nhy.c;
             */
            /* JADX WARN: Code restructure failed: missing block: B:190:0x03fe, code lost:
                if (r9.c == false) goto L192;
             */
            /* JADX WARN: Code restructure failed: missing block: B:191:0x0400, code lost:
                r9.cD();
                r9.c = false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:192:0x0406, code lost:
                r2.getClass();
                ((defpackage.joe) r9.b).j = r2;
                r1 = r0;
                r0 = r1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:193:0x04c4, code lost:
                if (r1 == false) goto L196;
             */
            /* JADX WARN: Code restructure failed: missing block: B:194:0x04c6, code lost:
                r13 = 3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:195:0x04d1, code lost:
                ((defpackage.joe) r9.b).m = defpackage.lvw.v(r13);
                r14 = r1;
                r1 = (defpackage.joe) r9.cz();
                r0 = r21;
             */
            /* JADX WARN: Code restructure failed: missing block: B:196:0x04c8, code lost:
                r13 = defpackage.lvw.w(r0.m);
             */
            /* JADX WARN: Code restructure failed: missing block: B:197:0x04ce, code lost:
                if (r13 != 0) goto L195;
             */
            /* JADX WARN: Code restructure failed: missing block: B:198:0x04d0, code lost:
                r13 = 1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:199:0x03f2, code lost:
                r0 = false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:200:0x03a3, code lost:
                r0 = r0.b;
                r2 = r2.b;
             */
            /* JADX WARN: Code restructure failed: missing block: B:201:0x03a7, code lost:
                if (r0 != r2) goto L203;
             */
            /* JADX WARN: Code restructure failed: missing block: B:202:0x03a9, code lost:
                r0 = 0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:203:0x03ab, code lost:
                if (r0 >= r2) goto L205;
             */
            /* JADX WARN: Code restructure failed: missing block: B:204:0x03ad, code lost:
                r0 = -1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:205:0x03af, code lost:
                r0 = 1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:206:0x03b4, code lost:
                r0 = false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:207:0x0306, code lost:
                r0 = 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:208:0x0416, code lost:
                r0 = ((defpackage.joe) r9.b).i;
             */
            /* JADX WARN: Code restructure failed: missing block: B:209:0x041c, code lost:
                if (r0 != null) goto L211;
             */
            /* JADX WARN: Code restructure failed: missing block: B:210:0x041e, code lost:
                r0 = defpackage.nhy.c;
             */
            /* JADX WARN: Code restructure failed: missing block: B:211:0x0420, code lost:
                r11 = defpackage.niu.a(r0);
             */
            /* JADX WARN: Code restructure failed: missing block: B:212:0x0426, code lost:
                if (r9.c == false) goto L238;
             */
            /* JADX WARN: Code restructure failed: missing block: B:213:0x0428, code lost:
                r9.cD();
                r0 = 0;
                r9.c = false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:214:0x0430, code lost:
                r2 = (defpackage.joe) r9.b;
                r4 = r2.a;
             */
            /* JADX WARN: Code restructure failed: missing block: B:215:0x0437, code lost:
                if (r4 != 4) goto L237;
             */
            /* JADX WARN: Code restructure failed: missing block: B:216:0x0439, code lost:
                r2.a = r0;
                r8 = null;
                r2.b = null;
                r4 = 0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:218:0x0443, code lost:
                if (r4 != 13) goto L220;
             */
            /* JADX WARN: Code restructure failed: missing block: B:219:0x0445, code lost:
                r2.a = r0;
                r2.b = r8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:220:0x0449, code lost:
                r2.h = r8;
                r2.i = r8;
                r2.k = defpackage.joe.p.k;
             */
            /* JADX WARN: Code restructure failed: missing block: B:221:0x0453, code lost:
                if (r3 == false) goto L230;
             */
            /* JADX WARN: Code restructure failed: missing block: B:222:0x0455, code lost:
                r0 = defpackage.gjz.h(r10);
             */
            /* JADX WARN: Code restructure failed: missing block: B:223:0x045b, code lost:
                if (r9.c == false) goto L225;
             */
            /* JADX WARN: Code restructure failed: missing block: B:224:0x045d, code lost:
                r9.cD();
                r9.c = false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:225:0x0463, code lost:
                r2 = (defpackage.joe) r9.b;
                r0.getClass();
                r2.b = r0;
                r2.a = 4;
                r0 = r1;
                r1 = r7.h(r5, r11, r10);
             */
            /* JADX WARN: Code restructure failed: missing block: B:226:0x047a, code lost:
                if (r9.c == false) goto L228;
             */
            /* JADX WARN: Code restructure failed: missing block: B:227:0x047c, code lost:
                r9.cD();
                r9.c = false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:228:0x0482, code lost:
                r1.getClass();
                ((defpackage.joe) r9.b).j = r1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:229:0x04c3, code lost:
                r1 = true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:230:0x048c, code lost:
                r0 = r1;
                r1 = defpackage.gjz.i(r10);
             */
            /* JADX WARN: Code restructure failed: missing block: B:231:0x0493, code lost:
                if (r9.c == false) goto L233;
             */
            /* JADX WARN: Code restructure failed: missing block: B:232:0x0495, code lost:
                r9.cD();
                r9.c = false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:233:0x049b, code lost:
                r2 = (defpackage.joe) r9.b;
                r1.getClass();
                r2.b = r1;
                r2.a = 13;
                r1 = r7.i(r5, r11, r10);
             */
            /* JADX WARN: Code restructure failed: missing block: B:234:0x04b2, code lost:
                if (r9.c == false) goto L236;
             */
            /* JADX WARN: Code restructure failed: missing block: B:235:0x04b4, code lost:
                r9.cD();
                r9.c = false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:236:0x04ba, code lost:
                r1.getClass();
                ((defpackage.joe) r9.b).j = r1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:237:0x0440, code lost:
                r8 = null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:238:0x042f, code lost:
                r0 = 0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:239:0x02c3, code lost:
                r14 = defpackage.gjz.j(r14);
             */
            /* JADX WARN: Code restructure failed: missing block: B:244:0x02bc, code lost:
                if (r12 == null) goto L109;
             */
            /* JADX WARN: Code restructure failed: missing block: B:93:0x0265, code lost:
                if (defpackage.gbx.m(r11, r13.e) == false) goto L95;
             */
            /* JADX WARN: Removed duplicated region for block: B:100:0x0279  */
            /* JADX WARN: Removed duplicated region for block: B:104:0x0290  */
            /* JADX WARN: Removed duplicated region for block: B:107:0x02a5  */
            /* JADX WARN: Removed duplicated region for block: B:240:0x02af  */
            /* JADX WARN: Removed duplicated region for block: B:246:0x029a  */
            /* JADX WARN: Removed duplicated region for block: B:77:0x021c  */
            /* JADX WARN: Removed duplicated region for block: B:84:0x0239  */
            /* JADX WARN: Removed duplicated region for block: B:87:0x0246  */
            /* JADX WARN: Removed duplicated region for block: B:97:0x026c  */
            @Override // defpackage.gbw
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final defpackage.lfc a(defpackage.jof r25) {
                /*
                    Method dump skipped, instructions count: 1323
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.gbo.a(jof):lfc");
            }
        });
    }

    public final synchronized mko e(final String str) {
        return z(new gbw() { // from class: gbt
            @Override // defpackage.gbw
            public final lfc a(jof jofVar) {
                gbx gbxVar = gbx.this;
                String str2 = str;
                nfh nfhVar = (nfh) jofVar.N(5);
                nfhVar.cG(jofVar);
                joe s = gbx.s(nfhVar, str2);
                boolean z = true;
                if (s == null) {
                    return lfc.a(jofVar, true);
                }
                jof jofVar2 = (jof) nfhVar.cz();
                gbxVar.i.a(s);
                if (s.a == 13) {
                    z = gbxVar.l((joa) s.b);
                }
                return lfc.a(jofVar2, Boolean.valueOf(z));
            }
        });
    }

    public final synchronized mko f(int i, String str, fzf fzfVar, mzh mzhVar, int i2) {
        mkh x = fzfVar.b() == 1 ? x(i, str, fzfVar, mzhVar, i2) : y(i, str, fzfVar, i2);
        ebi ebiVar = new ebi(this, 15);
        Executor executor = j;
        mko g = mhu.g(mio.g(x, ebiVar, executor), IOException.class, fxd.f, executor);
        if (this.f.Z()) {
            return mio.g(g, new ebi(this, 16), executor);
        }
        return g;
    }

    public final synchronized mko g(int i) {
        return mhu.g(z(new gbs(this, i, 1)), IOException.class, fxd.g, j);
    }

    public final nhy h(long j2, long j3, fwm fwmVar) {
        return w(j2, j3, fwmVar, true);
    }

    public final nhy i(long j2, long j3, fwm fwmVar) {
        return w(j2, j3, fwmVar, false);
    }

    public final boolean k(joa joaVar) {
        if (!joaVar.c.isEmpty()) {
            try {
                return fxa.a(new File(gcg.c(this.e, joaVar.c)));
            } catch (ErrorStatusException e) {
                throw new IllegalStateException(e);
            }
        }
        return true;
    }

    public final boolean l(joa joaVar) {
        boolean k = k(joaVar);
        if (!k) {
            this.g.e(job.OUTPUT_DIR_DELETION_ERROR_WHEN_CANCELING_TASK);
        }
        return k;
    }

    public final long n(long j2, int i, boolean z) {
        long millis;
        long millis2;
        if (!z) {
            millis = TimeUnit.SECONDS.toMillis(this.f.M());
            millis2 = TimeUnit.SECONDS.toMillis(this.f.H());
        } else if (i == 3) {
            millis = TimeUnit.SECONDS.toMillis(this.f.L());
            millis2 = TimeUnit.SECONDS.toMillis(this.f.I());
        } else {
            millis2 = TimeUnit.SECONDS.toMillis(this.f.D());
            millis = 0;
        }
        return Math.max(millis, Math.min(millis2, j2));
    }

    public final void o(int i, lfb lfbVar, lfb lfbVar2) {
        if (this.f.aH()) {
            nfh t = mgc.d.t();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mgc mgcVar = (mgc) t.b;
            mgcVar.b = i - 1;
            mgcVar.a |= 1;
            if (lfbVar.e()) {
                mge mgeVar = (mge) lfbVar.a();
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                mgc mgcVar2 = (mgc) t.b;
                mgcVar2.c = mgeVar.f;
                mgcVar2.a |= 2;
            }
            nfh t2 = mgi.g.t();
            if (t2.c) {
                t2.cD();
                t2.c = false;
            }
            mgi mgiVar = (mgi) t2.b;
            mgc mgcVar3 = (mgc) t.cz();
            mgcVar3.getClass();
            mgiVar.e = mgcVar3;
            mgiVar.d = 4;
            if (lfbVar2.e()) {
                String str = ((fwm) lfbVar2.a()).b;
                if (t2.c) {
                    t2.cD();
                    t2.c = false;
                }
                mgi mgiVar2 = (mgi) t2.b;
                str.getClass();
                mgiVar2.a |= 32;
                mgiVar2.f = str;
                if (((fwm) lfbVar2.a()).e != null) {
                    nfh t3 = mgf.c.t();
                    String str2 = ((fwm) lfbVar2.a()).e;
                    if (t3.c) {
                        t3.cD();
                        t3.c = false;
                    }
                    mgf mgfVar = (mgf) t3.b;
                    str2.getClass();
                    mgfVar.a |= 1;
                    mgfVar.b = str2;
                    if (t2.c) {
                        t2.cD();
                        t2.c = false;
                    }
                    mgi mgiVar3 = (mgi) t2.b;
                    mgf mgfVar2 = (mgf) t3.cz();
                    mgfVar2.getClass();
                    mgiVar3.c = mgfVar2;
                    mgiVar3.b = 1;
                } else {
                    mgh mghVar = mgh.a;
                    if (t2.c) {
                        t2.cD();
                        t2.c = false;
                    }
                    mgi mgiVar4 = (mgi) t2.b;
                    mghVar.getClass();
                    mgiVar4.c = mghVar;
                    mgiVar4.b = 2;
                }
            }
            fwo fwoVar = this.g;
            nfh t4 = mfx.h.t();
            if (t4.c) {
                t4.cD();
                t4.c = false;
            }
            mfx mfxVar = (mfx) t4.b;
            mgi mgiVar5 = (mgi) t2.cz();
            mgiVar5.getClass();
            mfxVar.g = mgiVar5;
            mfxVar.a |= 8192;
            fwoVar.h((mfx) t4.cz());
        }
    }

    public final nfh p(fwm fwmVar, String str) {
        nfh t;
        fwn fwnVar = fwmVar.h;
        boolean z = true;
        if (fwnVar != null) {
            if (!fwnVar.a) {
                this.g.e(job.IN_APP_TRAINING_CUSTOM_CONSTRAINTS_ALLOW_NON_IDLE);
            }
            if (!fwnVar.b) {
                this.g.e(job.IN_APP_TRAINING_CUSTOM_CONSTRAINTS_ALLOW_NON_CHARGING);
            }
            if (!fwnVar.c) {
                this.g.e(job.IN_APP_TRAINING_CUSTOM_CONSTRAINTS_ALLOW_METERED_NETWORK);
            }
            t = joc.f.t();
            if (this.f.aL() || this.f.aj(str)) {
                z = false;
            }
            if (t.c) {
                t.cD();
                t.c = false;
            }
            joc jocVar = (joc) t.b;
            jocVar.b = z;
            jocVar.c = fwnVar.b;
            jocVar.d = fwnVar.c;
            nec c2 = nec.c(fwmVar.h.a);
            if (t.c) {
                t.cD();
                t.c = false;
            }
            c2.getClass();
            ((joc) t.b).e = c2;
        } else {
            t = joc.f.t();
            boolean z2 = !this.f.aL() && !this.f.aj(str);
            if (t.c) {
                t.cD();
                t.c = false;
            }
            ((joc) t.b).b = z2;
            boolean z3 = !this.f.ay();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            joc jocVar2 = (joc) t.b;
            jocVar2.c = z3;
            jocVar2.d = true;
            nec c3 = nec.c(true);
            if (t.c) {
                t.cD();
                t.c = false;
            }
            c3.getClass();
            ((joc) t.b).e = c3;
        }
        long w = this.f.w();
        if (w > 0) {
            ney b2 = nis.b(w);
            if (t.c) {
                t.cD();
                t.c = false;
            }
            b2.getClass();
            ((joc) t.b).a = b2;
        }
        return t;
    }

    public final void v(int i, nfh nfhVar) {
        if (q(nfhVar, i) != null) {
            this.g.e(job.IN_APP_TRAINING_SCHEDULER_TASK_REMOVED_BECAUSE_JOB_ID_COLLISION);
        }
    }
}
