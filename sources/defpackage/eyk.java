package defpackage;

import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* renamed from: eyk  reason: default package */
/* loaded from: classes.dex */
public final class eyk implements eyn {
    public Set a;
    public Set b;
    public Map c;
    public Map d;
    private final eyn e;
    private final eyn f;

    public eyk(eyn eynVar, eyn eynVar2) {
        this.e = eynVar;
        this.f = eynVar2;
    }

    @Override // defpackage.eyn
    public final void a(Locale locale, eyl eylVar) {
        this.e.a(locale, new eyi(this, eylVar, 0));
        this.f.a(locale, new eyi(this, eylVar, 2));
    }

    @Override // defpackage.eyn
    public final void b() {
        this.f.b();
    }

    @Override // defpackage.eyn
    public final void c() {
        this.e.c();
        this.f.c();
    }

    @Override // defpackage.eyn
    public final void d(final ezq ezqVar, final eym eymVar) {
        if (this.a == null || this.b == null) {
            this.e.a(Locale.getDefault(), new eyl() { // from class: eyj
                @Override // defpackage.eyl
                public final void a(Map map, Map map2) {
                    eyk eykVar = eyk.this;
                    ezq ezqVar2 = ezqVar;
                    eym eymVar2 = eymVar;
                    eykVar.a = map.keySet();
                    eykVar.b = map2.keySet();
                    eykVar.e(ezqVar2, eymVar2);
                }
            });
        } else {
            e(ezqVar, eymVar);
        }
    }

    public final void e(ezq ezqVar, eym eymVar) {
        if (!this.a.contains(ezqVar.b) || !this.b.contains(ezqVar.c)) {
            this.f.d(ezqVar, eymVar);
        } else {
            this.e.d(ezqVar, eymVar);
        }
    }

    @Override // defpackage.eyn
    public final boolean f(String str, String str2) {
        Set set;
        Set set2 = this.a;
        return set2 != null && set2.contains(str) && (set = this.b) != null && set.contains(str2);
    }
}
