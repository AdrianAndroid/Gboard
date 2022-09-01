package androidx.lifecycle;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LiveData$LifecycleBoundObserver extends agb implements aft {
    final afv a;
    final /* synthetic */ agc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveData$LifecycleBoundObserver(agc agcVar, afv afvVar, age ageVar) {
        super(agcVar, ageVar);
        this.b = agcVar;
        this.a = afvVar;
    }

    @Override // defpackage.agb
    public final void b() {
        this.a.I().d(this);
    }

    @Override // defpackage.agb
    public final boolean c(afv afvVar) {
        return this.a == afvVar;
    }

    @Override // defpackage.agb
    public final boolean eY() {
        return this.a.I().a.a(afp.STARTED);
    }

    @Override // defpackage.aft
    public final void hS(afv afvVar, afo afoVar) {
        afp afpVar = this.a.I().a;
        if (afpVar == afp.DESTROYED) {
            this.b.g(this.c);
            return;
        }
        afp afpVar2 = null;
        while (afpVar2 != afpVar) {
            d(eY());
            afpVar2 = afpVar;
            afpVar = this.a.I().a;
        }
    }
}
