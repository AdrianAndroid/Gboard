package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: dqx  reason: default package */
/* loaded from: classes.dex */
public final class dqx {
    public static final lug a = hin.a;
    private static final hlk e = hln.a();
    public final hls b;
    public gfv c;
    public int d;
    private final boolean f;
    private final dqv g;
    private final gqa h;

    public dqx(Context context, hls hlsVar, boolean z, gqa gqaVar) {
        this.b = hlsVar;
        this.f = z;
        this.g = dqv.a(context);
        this.h = gqaVar;
    }

    public final dsj a(int i, boolean z, boolean z2) {
        int size;
        String str;
        String str2;
        gfv gfvVar = this.c;
        if (gfvVar != null && (size = gfvVar.c.size()) != 0) {
            if ((gfvVar.a & 1) != 0) {
                i = mhq.m(i + gfvVar.b);
            }
            ArrayList E = lre.E(Math.min(64, i));
            hln hlnVar = null;
            while (true) {
                int i2 = this.d;
                if (i2 >= size || i <= 0) {
                    break;
                }
                gfw gfwVar = (gfw) gfvVar.c.get(i2);
                boolean z3 = this.f;
                if ((gfwVar.a & 16) != 0) {
                    gft gftVar = gfwVar.d;
                    if (gftVar == null) {
                        gftVar = gft.c;
                    }
                    str2 = gftVar.b;
                } else {
                    str2 = "";
                }
                jdg.u(gfwVar);
                dqv dqvVar = this.g;
                String str3 = gfwVar.c;
                if (dqvVar.c.f) {
                    str3 = dra.a(dqvVar.b, str3);
                }
                gft gftVar2 = gfwVar.d;
                if (gftVar2 == null) {
                    gftVar2 = gft.c;
                }
                if ((gftVar2.a & 4) != 0) {
                    gft gftVar3 = gfwVar.d;
                    if (gftVar3 == null) {
                        gftVar3 = gft.c;
                    }
                    str3 = str3 + "。" + gftVar3.b;
                }
                hlk hlkVar = e;
                hlkVar.c();
                hlkVar.a = gfwVar.c;
                hlkVar.c = str3;
                hlkVar.e = hlm.PREDICTION;
                hlkVar.j = gfwVar;
                if (((Boolean) dqq.a.c()).booleanValue() && !this.h.f) {
                    Iterator<E> it = new nfu(gfwVar.e, gfw.f).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((gfu) it.next()) == gfu.USER_HISTORY) {
                                hlkVar.f = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                if (z3) {
                    hlkVar.d = lex.c('\n').f(dqw.a(str2));
                }
                hln a2 = hlkVar.a();
                if ((gfvVar.a & 1) != 0 && this.d == gfvVar.b) {
                    hlnVar = a2;
                }
                E.add(a2);
                this.d++;
                i--;
            }
            if (!E.isEmpty()) {
                this.b.l(E, hlnVar, !z || this.d < size);
                if (hlnVar != null && (str = hlnVar.c) != null) {
                    gqa gqaVar = this.h;
                    gqaVar.k(gqaVar.d(str));
                }
            }
            if (!z && this.d == size && i > 0 && !z2) {
                return new drs(this, 1);
            }
        }
        return null;
    }
}
