package defpackage;

import android.content.Context;
import j$.util.function.Function;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: duk  reason: default package */
/* loaded from: classes.dex */
public final class duk extends fhr {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/nga/impl/service/KeyboardDictationServiceGrpcImpl");
    public final Context b;
    public final dur c;
    public final dum d;
    public final Executor e;
    public final AtomicReference f = new AtomicReference();
    public final idk g = ieh.j();
    private final jaq i;

    public duk(Context context) {
        dur durVar = new dur(context);
        jaq jaqVar = new jaq(context);
        dum dumVar = new dum();
        mks a2 = gxo.a(6);
        this.b = context;
        this.c = durVar;
        this.i = jaqVar;
        this.d = dumVar;
        this.e = a2;
    }

    public static void b(oin oinVar, Function function) {
        duj dujVar = new duj(function, oinVar);
        dun a2 = duq.a();
        if (a2 == null) {
            oinVar.b(nvu.l.f("Client callback not set.").g());
        } else {
            gyc.b.execute(new dod(dujVar, a2, 15));
        }
    }

    public final mko a() {
        kcq kcqVar = (kcq) this.f.get();
        if (kcqVar != null) {
            return kcu.K(kcqVar);
        }
        return mio.g(kcu.O(new bof(this, 18), this.e), new cus(this, 10), this.e);
    }

    public final boolean c() {
        return this.i.j();
    }
}
