package defpackage;

import android.content.Context;
import j$.util.Collection$EL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: cna  reason: default package */
/* loaded from: classes.dex */
public final class cna implements hhk {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/expression/emojify/impl/EmojifySuggestionManager");
    public final hbd b;
    public final hdq c;
    public final cmy d;
    public final hdz g;
    public llp h;
    public final dsl i;
    private llp n;
    private final Random j = new Random();
    public final idk e = ieh.j();
    private final AtomicBoolean m = new AtomicBoolean(false);
    public final AtomicBoolean f = new AtomicBoolean(false);
    private final boolean k = !Arrays.asList(((String) cmo.d.c()).split(",")).contains(hqp.e().getLanguage().toLowerCase(Locale.US));
    private final String l = (String) cmo.e.c();

    public cna(Context context) {
        hbd h = hbd.h(context);
        cmy cmyVar = new cmy(context);
        dsl dslVar = new dsl(context);
        hdq b = hdq.b();
        hdz a2 = hdz.a();
        this.b = h;
        this.d = cmyVar;
        this.i = dslVar;
        this.c = b;
        this.g = a2;
    }

    public final llp b(String str, Set set) {
        lfb lfbVar;
        if (((Boolean) cmo.k.c()).booleanValue()) {
            int intValue = ((Long) cmo.m.c()).intValue();
            int intValue2 = ((Long) cmo.n.c()).intValue();
            int i = 1;
            if (this.n == null) {
                this.n = (llp) Collection$EL.stream(lfy.c(',').k((CharSequence) cmo.l.c())).filter(new cjx(this, 4)).collect(ljr.a);
                if (!this.m.getAndSet(true)) {
                    cmo.l.e(this);
                }
            }
            llp llpVar = this.n;
            if (llpVar == null) {
                llpVar = llp.q();
            }
            ArrayList arrayList = new ArrayList(llpVar);
            if (intValue <= 0 || intValue2 < 0 || intValue2 > intValue || arrayList.isEmpty()) {
                lfbVar = ldu.a;
            } else {
                StringBuilder sb = new StringBuilder(str);
                if (intValue != intValue2) {
                    intValue = this.j.nextInt((intValue - intValue2) + 1) + intValue2;
                }
                int min = Math.min(intValue, arrayList.size());
                Collections.shuffle(arrayList);
                int i2 = 0;
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    String c = c((String) arrayList.get(i3));
                    if (set.add(this.b.g().b(c))) {
                        e(sb, false);
                        sb.append(c);
                        i2++;
                        if (i2 >= min) {
                            break;
                        }
                    }
                }
                if (i2 == 0) {
                    e(sb, false);
                    sb.append(c((String) arrayList.get(this.j.nextInt(arrayList.size()))));
                } else {
                    i = i2;
                }
                nfh t = cmg.e.t();
                String sb2 = sb.toString();
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                ((cmg) t.b).b = sb2;
                cmf cmfVar = cmf.FALLBACK;
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                ((cmg) t.b).a = cmfVar.a();
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                cmg cmgVar = (cmg) t.b;
                cmgVar.c = i;
                str.getClass();
                cmgVar.d = str;
                lfbVar = lfb.g((cmg) t.cz());
            }
            if (lfbVar.e()) {
                return llp.r((cmg) lfbVar.a());
            }
        }
        return llp.q();
    }

    public final String c(String str) {
        String i = this.b.i(str);
        return i != null ? i : str;
    }

    public final List d(cme cmeVar, cmi cmiVar, llp llpVar) {
        ArrayList arrayList = new ArrayList();
        for (cmk cmkVar : cmeVar.b) {
            if (this.c.a().contains(cmkVar.a) && !llpVar.contains(cmkVar.a)) {
                arrayList.add(cmkVar.a);
            }
        }
        if (arrayList.isEmpty() && cmiVar.b.size() > 0) {
            ArrayList arrayList2 = new ArrayList();
            String str = null;
            for (cmh cmhVar : cmiVar.b) {
                if (!llpVar.contains(cmhVar.a)) {
                    int i = cmhVar.c;
                    int h = ffb.h(i);
                    if (h == 0 || h != 3) {
                        int h2 = ffb.h(i);
                        if (h2 != 0 && h2 == 4 && str == null) {
                            str = cmhVar.a;
                        }
                    } else {
                        arrayList2.add(cmhVar.a);
                    }
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList.add(c((String) arrayList2.get(this.j.nextInt(arrayList2.size()))));
            } else if (str != null) {
                arrayList.add(c(str));
            }
        }
        return arrayList;
    }

    public final void e(StringBuilder sb, boolean z) {
        if (!this.k || sb.length() <= 0) {
            return;
        }
        if (!z && !Character.isLetterOrDigit(sb.codePointAt(sb.length() - 1)) && !this.l.contains(sb.substring(sb.length() - 1))) {
            return;
        }
        sb.append(" ");
    }

    public final void f(List list, int i, nfh nfhVar, Set set) {
        if (list.isEmpty()) {
            return;
        }
        Collections.shuffle(list);
        int size = i < 0 ? list.size() : Math.min(i, list.size());
        for (int i2 = 0; i2 < size; i2++) {
            nfhVar.cK((cmh) list.get(i2));
            set.add(this.b.g().b(((cmh) list.get(i2)).a));
        }
    }

    @Override // defpackage.hhk
    public final void ib(hhl hhlVar) {
        this.n = null;
        this.h = null;
    }
}
