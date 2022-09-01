package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import j$.util.Objects;
import java.util.Set;

/* compiled from: PG */
/* renamed from: kkh  reason: default package */
/* loaded from: classes.dex */
public final class kkh implements kkj {
    public static volatile lfb a;
    public final boolean b;
    public final boolean c;
    public final klb d;
    public final klb e;
    private final Set f;

    public kkh(boolean z, boolean z2, Set set, klb klbVar, klb klbVar2) {
        this.b = z;
        this.c = z2;
        this.f = set;
        this.d = klbVar;
        this.e = klbVar2;
    }

    public final kkl a(final kjj kjjVar, final String str) {
        kcl kclVar = kkl.i;
        final boolean z = this.c;
        lgb lgbVar = new lgb() { // from class: kkk
            @Override // defpackage.lgb
            public final Object a() {
                return new kkl(kjj.this, str, z);
            }
        };
        lfc a2 = lfc.a(str, "");
        Object obj = (kkl) ((lky) kclVar.a).get(a2);
        if (obj == null) {
            obj = lgbVar.a();
            kkl kklVar = (kkl) ((kjv) kclVar.a).putIfAbsent(a2, obj);
            if (kklVar == null) {
                Context context = kjjVar.c;
                kkl kklVar2 = (kkl) obj;
                kku.c.putIfAbsent(a2, new opu(kklVar2));
                if (!kku.b) {
                    synchronized (kku.a) {
                        if (!kku.b) {
                            if (Build.VERSION.SDK_INT < 33 && Build.VERSION.CODENAME.charAt(0) != 'T') {
                                context.registerReceiver(new kku(), new IntentFilter("com.google.android.gms.phenotype.UPDATE"));
                                kku.b = true;
                            }
                            context.registerReceiver(new kku(), new IntentFilter("com.google.android.gms.phenotype.UPDATE"), 2);
                            kku.b = true;
                        }
                    }
                }
                Objects.requireNonNull(obj);
                kko.a.putIfAbsent(a2, new ihp(kklVar2, 20));
            } else {
                obj = kklVar;
            }
        }
        kkl kklVar3 = (kkl) obj;
        boolean z2 = kklVar3.e;
        jdg.A(true, "Package %s cannot be registered both with and without stickyAccountSupport", str);
        return kklVar3;
    }
}
