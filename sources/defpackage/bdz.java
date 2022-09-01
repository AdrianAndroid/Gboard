package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import androidx.savedstate.Recreator;
import java.util.HashSet;

/* compiled from: PG */
/* renamed from: bdz  reason: default package */
/* loaded from: classes.dex */
public final class bdz {
    private static volatile bdz d;
    public boolean a;
    public final Object b;
    public final Object c;

    public bdz(ajc ajcVar) {
        this.c = ajcVar;
        this.b = new ajb();
    }

    public bdz(Context context, hqy hqyVar) {
        this.c = context;
        this.b = hqyVar;
    }

    public bdz(kwr kwrVar, Typeface typeface) {
        this.c = typeface;
        this.b = kwrVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static bdz a(Context context) {
        if (d == null) {
            synchronized (bdz.class) {
                if (d == null) {
                    d = new bdz(context.getApplicationContext());
                }
            }
        }
        return d;
    }

    public static final bdz g(ajc ajcVar) {
        oll.e(ajcVar, "owner");
        return new bdz(ajcVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [bdt, java.lang.Object] */
    public final synchronized void b(bcz bczVar) {
        this.c.add(bczVar);
        if (!this.a && !this.c.isEmpty()) {
            this.a = this.b.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [bdt, java.lang.Object] */
    public final synchronized void c(bcz bczVar) {
        this.c.remove(bczVar);
        if (this.a && this.c.isEmpty()) {
            this.b.a();
            this.a = false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ajc] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, ajc] */
    public final void d() {
        afq I = this.c.I();
        oll.d(I, "owner.lifecycle");
        if (I.a != afp.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        I.b(new Recreator(this.c));
        Object obj = this.b;
        oll.e(I, "lifecycle");
        final ajb ajbVar = (ajb) obj;
        if (!ajbVar.b) {
            I.b(new aft() { // from class: androidx.savedstate.SavedStateRegistry$$ExternalSyntheticLambda0
                @Override // defpackage.aft
                public final void hS(afv afvVar, afo afoVar) {
                    ajb ajbVar2 = ajb.this;
                    oll.e(ajbVar2, "this$0");
                    if (afoVar == afo.ON_START) {
                        ajbVar2.e = true;
                    } else if (afoVar != afo.ON_STOP) {
                    } else {
                        ajbVar2.e = false;
                    }
                }
            });
            ajbVar.b = true;
            this.a = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already attached.");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, ajc] */
    public final void e(Bundle bundle) {
        if (!this.a) {
            d();
        }
        afq I = this.c.I();
        oll.d(I, "owner.lifecycle");
        if (I.a.a(afp.STARTED)) {
            StringBuilder sb = new StringBuilder("performRestore cannot be called when owner is ");
            afp afpVar = I.a;
            sb.append(afpVar);
            throw new IllegalStateException("performRestore cannot be called when owner is ".concat(String.valueOf(afpVar)));
        }
        ajb ajbVar = (ajb) this.b;
        if (ajbVar.b) {
            if (!ajbVar.d) {
                ajbVar.c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
                ajbVar.d = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
    }

    public final void f(Bundle bundle) {
        oll.e(bundle, "outBundle");
        Object obj = this.b;
        oll.e(bundle, "outBundle");
        Bundle bundle2 = new Bundle();
        ajb ajbVar = (ajb) obj;
        Bundle bundle3 = ajbVar.c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        pv e = ajbVar.a.e();
        while (e.hasNext()) {
            pu puVar = (pu) e.next();
            bundle2.putBundle((String) puVar.a, ((aja) puVar.b).a());
        }
        if (!bundle2.isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
        }
    }

    public final void h() {
        this.a = true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kwr, java.lang.Object] */
    public final void i(Typeface typeface) {
        if (!this.a) {
            this.b.a(typeface);
        }
    }

    public final void j() {
        i((Typeface) this.c);
    }

    public final boolean k() {
        Configuration configuration = ((Context) this.c).getResources().getConfiguration();
        return configuration.keyboard == 2 && configuration.hardKeyboardHidden == 1;
    }

    private bdz(Context context) {
        Object bdyVar;
        this.c = new HashSet();
        bgd i = dg.i(new bdr(context));
        bds bdsVar = new bds(this);
        if (Build.VERSION.SDK_INT >= 24) {
            bdyVar = new bdv(i, bdsVar);
        } else {
            bdyVar = new bdy(context, i, bdsVar);
        }
        this.b = bdyVar;
    }

    public bdz() {
    }
}
