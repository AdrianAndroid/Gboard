package androidx.lifecycle;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public class CompositeGeneratedAdaptersObserver implements aft {
    private final afn[] a;

    public CompositeGeneratedAdaptersObserver(afn[] afnVarArr) {
        this.a = afnVarArr;
    }

    @Override // defpackage.aft
    public final void hS(afv afvVar, afo afoVar) {
        new HashMap();
        for (afn afnVar : this.a) {
            afnVar.a();
        }
        for (afn afnVar2 : this.a) {
            afnVar2.a();
        }
    }
}
