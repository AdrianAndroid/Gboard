package androidx.lifecycle;

/* compiled from: PG */
/* loaded from: classes.dex */
public class FullLifecycleObserverAdapter implements aft {
    private final aft a;

    public FullLifecycleObserverAdapter(aft aftVar) {
        this.a = aftVar;
    }

    @Override // defpackage.aft
    public final void hS(afv afvVar, afo afoVar) {
        int ordinal = afoVar.ordinal();
        if (ordinal != 5) {
            if (ordinal == 6) {
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
            }
            aft aftVar = this.a;
            if (aftVar == null) {
                return;
            }
            aftVar.hS(afvVar, afoVar);
            return;
        }
        throw null;
    }
}
